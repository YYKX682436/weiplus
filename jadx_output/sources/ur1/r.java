package ur1;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f430369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430371f;

    public r(com.tencent.mm.vfs.r6 r6Var, java.lang.String str, java.lang.String str2) {
        this.f430369d = r6Var;
        this.f430370e = str;
        this.f430371f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.vfs.r6 r6Var = this.f430369d;
        try {
            if (!r6Var.m()) {
                r6Var.J();
            }
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(this.f430370e + "/LocalDraft");
            if (!r6Var2.m()) {
                r6Var2.k();
            }
            java.lang.String text = this.f430371f;
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
            kotlin.jvm.internal.o.f(forName, "forName(...)");
            kotlin.jvm.internal.o.g(text, "text");
            byte[] bytes = text.getBytes(forName);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            com.tencent.mm.vfs.s6.c(r6Var2, bytes);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("BizPersonalDraftFeatureService", e17, "writeDraft exception", new java.lang.Object[0]);
        }
    }
}
