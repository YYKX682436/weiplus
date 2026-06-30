package com.tencent.mm.vfs;

/* loaded from: classes7.dex */
public abstract class s6 {
    public static final java.lang.String a(com.tencent.mm.vfs.r6 r6Var, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.o.g(r6Var, "<this>");
        kotlin.jvm.internal.o.g(charset, "charset");
        java.io.InputStream C = com.tencent.mm.vfs.w6.C(r6Var);
        kotlin.jvm.internal.o.f(C, "openRead(...)");
        java.io.InputStreamReader inputStreamReader = new java.io.InputStreamReader(C, charset);
        try {
            java.lang.String c17 = vz5.v.c(inputStreamReader);
            vz5.b.a(inputStreamReader, null);
            return c17;
        } finally {
        }
    }

    public static /* synthetic */ java.lang.String b(com.tencent.mm.vfs.r6 r6Var, java.nio.charset.Charset charset, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            charset = r26.c.f368865a;
        }
        return a(r6Var, charset);
    }

    public static final void c(com.tencent.mm.vfs.r6 r6Var, byte[] array) {
        kotlin.jvm.internal.o.g(r6Var, "<this>");
        kotlin.jvm.internal.o.g(array, "array");
        java.io.OutputStream H = com.tencent.mm.vfs.w6.H(r6Var);
        try {
            H.write(array);
            vz5.b.a(H, null);
        } finally {
        }
    }

    public static void d(com.tencent.mm.vfs.r6 r6Var, java.lang.String text, java.nio.charset.Charset charset, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            charset = r26.c.f368865a;
        }
        kotlin.jvm.internal.o.g(r6Var, "<this>");
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        c(r6Var, bytes);
    }
}
