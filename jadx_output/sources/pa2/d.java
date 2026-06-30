package pa2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f352971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pa2.g f352972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.ui.widget.dialog.u3 u3Var, pa2.g gVar) {
        super(1);
        this.f352971d = u3Var;
        this.f352972e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.d13 resp = (r45.d13) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        this.f352971d.dismiss();
        com.tencent.mars.xlog.Log.i("FinderTemplateShareHandler", "doUnpublish success");
        pa2.g gVar = this.f352972e;
        gVar.getClass();
        com.tencent.mm.autogen.events.FinderTemplatePublishEvent finderTemplatePublishEvent = new com.tencent.mm.autogen.events.FinderTemplatePublishEvent();
        java.lang.String B = gVar.B();
        am.ld ldVar = finderTemplatePublishEvent.f54332g;
        ldVar.f7241a = B;
        ldVar.f7242b = 1;
        finderTemplatePublishEvent.e();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(gVar.f434158a);
        e4Var.d(com.tencent.mm.R.string.f492018ey4);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
        pm0.v.V(2000L, new pa2.c(gVar));
        return jz5.f0.f302826a;
    }
}
