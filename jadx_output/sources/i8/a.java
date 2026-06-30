package i8;

/* loaded from: classes7.dex */
public abstract class a {
    public static java.nio.ByteBuffer a(java.io.InputStream inputStream, boolean z17) {
        if (!z17 && !inputStream.markSupported()) {
            if (!inputStream.markSupported()) {
                inputStream = inputStream instanceof java.io.FileInputStream ? new i8.b((java.io.FileInputStream) inputStream) : new java.io.BufferedInputStream(inputStream);
            }
            inputStream.mark(8388608);
        }
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[10000];
        int i17 = 100000;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(100000);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        int i18 = 0;
        int i19 = 0;
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr);
                    i18 += read;
                    if (i18 > i17) {
                        allocateDirect = b(allocateDirect);
                        i17 = allocateDirect.capacity();
                    }
                    if (read < 0) {
                        break;
                    }
                    allocateDirect.position(i19);
                    allocateDirect.put(bArr, 0, read);
                    i19 += read;
                } catch (java.io.IOException e17) {
                    g8.g.c("Ni.ByteBufferUtil", e17, "hy: allocateByteBufferFromStream IOException", new java.lang.Object[0]);
                    try {
                        if (z17) {
                            inputStream.close();
                        } else {
                            inputStream.reset();
                        }
                    } catch (java.lang.Exception e18) {
                        g8.g.c("Ni.ByteBufferUtil", e18, "hy: exception in finally!", new java.lang.Object[0]);
                    }
                    return null;
                } catch (java.nio.BufferOverflowException e19) {
                    g8.g.c("Ni.ByteBufferUtil", e19, "hy: allocateByteBufferFromStream BufferOverflowException", new java.lang.Object[0]);
                    try {
                        if (z17) {
                            inputStream.close();
                        } else {
                            inputStream.reset();
                        }
                    } catch (java.lang.Exception e27) {
                        g8.g.c("Ni.ByteBufferUtil", e27, "hy: exception in finally!", new java.lang.Object[0]);
                    }
                }
            } catch (java.lang.Throwable th6) {
                try {
                    if (z17) {
                        inputStream.close();
                    } else {
                        inputStream.reset();
                    }
                } catch (java.lang.Exception e28) {
                    g8.g.c("Ni.ByteBufferUtil", e28, "hy: exception in finally!", new java.lang.Object[0]);
                }
                throw th6;
            }
        }
        allocateDirect.position(0);
        try {
            if (z17) {
                inputStream.close();
            } else {
                inputStream.reset();
            }
        } catch (java.lang.Exception e29) {
            g8.g.c("Ni.ByteBufferUtil", e29, "hy: exception in finally!", new java.lang.Object[0]);
        }
        return allocateDirect;
    }

    public static java.nio.ByteBuffer b(java.nio.ByteBuffer byteBuffer) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(byteBuffer.capacity() + 100000);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        byteBuffer.position(0);
        allocateDirect.put(byteBuffer);
        return allocateDirect;
    }
}
