package org.javacs.kt.util

import java.io.OutputStream
import java.io.PrintStream

class NewLineOutputStream(val wrapped: PrintStream) : OutputStream() {
    override fun write(b: Int) {
        wrapped.write(b)
    }

    override fun write(b: ByteArray, off: Int, len: Int) {
        super.write(b, off, len)
        write('\n'.code)
    }
}
