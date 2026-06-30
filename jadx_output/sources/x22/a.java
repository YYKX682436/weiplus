package x22;

/* loaded from: classes2.dex */
public final class a implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x22.c f451558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f451559b;

    public a(x22.c cVar, yz5.l lVar) {
        this.f451558a = cVar;
        this.f451559b = lVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.modelbase.f cgiBack = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        int i17 = cgiBack.f70615a;
        x22.c cVar = this.f451558a;
        if (i17 == 0 && cgiBack.f70616b == 0) {
            r45.bj0 bj0Var = (r45.bj0) cgiBack.f70618d;
            cVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.CgiEmojiTextSpam", "CgiTextAntiSpam " + bj0Var.f370797d + ' ' + bj0Var.f370798e + ' ' + bj0Var.f370799f);
            z17 = bj0Var.f370797d;
        } else {
            cVar.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.CgiEmojiTextSpam", "CgiTextAntiSpam error " + cgiBack.f70615a + ' ' + cgiBack.f70616b);
            z17 = false;
        }
        yz5.l lVar = this.f451559b;
        if (lVar == null) {
            return null;
        }
        lVar.invoke(java.lang.Boolean.valueOf(z17));
        return jz5.f0.f302826a;
    }
}
