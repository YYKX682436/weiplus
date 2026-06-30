package xm5;

/* loaded from: classes7.dex */
public abstract class d {
    public static final java.lang.String a(java.lang.Throwable th6) {
        java.lang.String byteArrayOutputStream;
        if (th6 != null) {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                java.io.PrintStream printStream = new java.io.PrintStream(byteArrayOutputStream2);
                th6.printStackTrace(printStream);
                byteArrayOutputStream = byteArrayOutputStream2.toString();
                printStream.close();
                byteArrayOutputStream2.close();
            } catch (java.lang.Exception unused) {
                return "";
            }
        }
        return byteArrayOutputStream;
    }

    public static final void b(final yz5.a block) {
        kotlin.jvm.internal.o.g(block, "block");
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            block.invoke();
        } else {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable(block) { // from class: xm5.c

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f455399d;

                {
                    kotlin.jvm.internal.o.g(block, "function");
                    this.f455399d = block;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f455399d.invoke();
                }
            });
        }
    }
}
