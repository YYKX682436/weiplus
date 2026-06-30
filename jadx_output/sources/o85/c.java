package o85;

/* loaded from: classes14.dex */
public final class c implements v5.g {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f343674c = {"image/jpeg", "image/webp", "image/heic", "image/heif"};

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f343675a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f343676b;

    public c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f343675a = context;
        this.f343676b = new android.graphics.Paint(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x00a6, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 26 && r12 == android.graphics.Bitmap.Config.HARDWARE) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022b, code lost:
    
        if ((r3.top == 0.0f ? true : r7) == false) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final v5.e c(o85.c r26, s5.a r27, x36.h0 r28, coil.size.Size r29, v5.k r30) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o85.c.c(o85.c, s5.a, x36.h0, coil.size.Size, v5.k):v5.e");
    }

    @Override // v5.g
    public boolean a(x36.m source, java.lang.String str) {
        kotlin.jvm.internal.o.g(source, "source");
        return true;
    }

    @Override // v5.g
    public java.lang.Object b(s5.a aVar, x36.m mVar, coil.size.Size size, v5.k kVar, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        try {
            v5.j jVar = new v5.j(rVar, mVar);
            try {
                rVar.resumeWith(kotlin.Result.m521constructorimpl(c(this, aVar, jVar, size, kVar)));
                java.lang.Object j17 = rVar.j();
                pz5.a aVar2 = pz5.a.f359186d;
                return j17;
            } finally {
                jVar.a();
            }
        } catch (java.lang.Exception e17) {
            if (!(e17 instanceof java.lang.InterruptedException) && !(e17 instanceof java.io.InterruptedIOException)) {
                throw e17;
            }
            java.lang.Throwable initCause = new java.util.concurrent.CancellationException("Blocking call was interrupted due to parent cancellation.").initCause(e17);
            kotlin.jvm.internal.o.f(initCause, "CancellationException(\"B…n.\").initCause(exception)");
            throw initCause;
        }
    }
}
