package hn;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f282330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f282331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f282332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f282333g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg3.i3 f282334h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f282335i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vg3.j3 f282336m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.modelbase.o oVar, int i17, int i18, vg3.i3 i3Var, android.content.Context context, vg3.j3 j3Var) {
        super(0);
        this.f282330d = h0Var;
        this.f282331e = oVar;
        this.f282332f = i17;
        this.f282333g = i18;
        this.f282334h = i3Var;
        this.f282335i = context;
        this.f282336m = j3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ie baseResponse;
        r45.du5 du5Var;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f282330d.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.modelbase.o oVar = this.f282331e;
        com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
        r45.da daVar = fVar instanceof r45.da ? (r45.da) fVar : null;
        int i17 = this.f282332f;
        vg3.j3 j3Var = this.f282336m;
        android.content.Context context = this.f282335i;
        if (i17 == 0 && this.f282333g == 0 && daVar != null) {
            gd0.e eVar = (gd0.e) i95.n0.c(gd0.e.class);
            vg3.i3 i3Var = this.f282334h;
            ((fd0.e) eVar).wi(i3Var.f436718m).m(i3Var.f436718m).b();
            db5.t7.h(com.tencent.mm.sdk.platformtools.x2.f193071a, context.getString(com.tencent.mm.R.string.ayf));
            if (j3Var != null) {
                j3Var.a(true, "", null);
            }
        } else {
            java.lang.String str = (daVar == null || (baseResponse = daVar.getBaseResponse()) == null || (du5Var = baseResponse.f376960e) == null) ? null : du5Var.f372756d;
            if (str == null) {
                str = context.getString(com.tencent.mm.R.string.aye);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
            if (j3Var != null) {
                j3Var.a(false, str, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
