package fk2;

/* loaded from: classes3.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.x2 f263509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f263510e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(fk2.x2 x2Var, dk2.zf zfVar) {
        super(1);
        this.f263509d = x2Var;
        this.f263510e = zfVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        fe2.q qVar;
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (qVar = (fe2.q) k0Var.getPlugin(fe2.q.class)) != null) {
            qVar.D1();
        }
        this.f263509d.getClass();
        df2.nw nwVar = df2.xw.f231808w;
        jz5.l[] lVarArr = new jz5.l[2];
        java.lang.String f17 = this.f263510e.f();
        if (f17 == null) {
            f17 = "";
        }
        lVarArr[0] = new jz5.l("msg_id", f17);
        lVarArr[1] = new jz5.l("reply_type", "3");
        nwVar.a(5, kz5.c1.k(lVarArr));
        return java.lang.Boolean.TRUE;
    }
}
