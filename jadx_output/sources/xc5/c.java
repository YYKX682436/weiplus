package xc5;

/* loaded from: classes12.dex */
public abstract class c implements mf3.k, uh5.i, xc5.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f453399a;

    /* renamed from: b, reason: collision with root package name */
    public mf3.w f453400b;

    public c(com.tencent.mm.storage.f9 f9Var, kotlin.jvm.internal.i iVar) {
        this.f453399a = f9Var;
    }

    @Override // uh5.i
    public com.tencent.mm.storage.f9 b() {
        return this.f453399a;
    }

    @Override // mf3.k
    public void f(mf3.w level) {
        kotlin.jvm.internal.o.g(level, "level");
        this.f453400b = level;
    }

    @Override // mf3.k
    public java.lang.String getId() {
        return java.lang.String.valueOf(this.f453399a.getMsgId());
    }

    @Override // mf3.k
    public mf3.w getLevel() {
        mf3.w wVar = this.f453400b;
        return wVar == null ? mf3.w.f326128d : wVar;
    }

    public final co.a h(co.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<this>");
        com.tencent.mm.storage.f9 f9Var = this.f453399a;
        long msgId = f9Var.getMsgId();
        int i17 = aVar.f43702d;
        aVar.set(i17 + 0, java.lang.Long.valueOf(msgId));
        aVar.set(i17 + 2, java.lang.Long.valueOf(f9Var.I0()));
        aVar.set(i17 + 3, java.lang.Integer.valueOf(f9Var.getType()));
        java.lang.String Q0 = f9Var.Q0();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (Q0 == null) {
            Q0 = "";
        }
        aVar.set(i17 + 1, Q0);
        return aVar;
    }
}
