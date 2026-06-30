package v65;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.q f433581a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f433582b;

    public n(kotlinx.coroutines.q cont) {
        kotlin.jvm.internal.o.g(cont, "cont");
        this.f433581a = cont;
    }

    public final synchronized void a(java.lang.Object obj) {
        if (!this.f433582b) {
            this.f433582b = true;
            try {
                this.f433581a.resumeWith(kotlin.Result.m521constructorimpl(obj));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SafeResume", e17, "resume", new java.lang.Object[0]);
            }
        }
    }
}
