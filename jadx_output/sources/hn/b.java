package hn;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f282301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f282302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f282303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f282304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg3.i3 f282305h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vg3.h3 f282306i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f282307m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.modelbase.o oVar, int i17, int i18, vg3.i3 i3Var, vg3.h3 h3Var, android.content.Context context) {
        super(0);
        this.f282301d = h0Var;
        this.f282302e = oVar;
        this.f282303f = i17;
        this.f282304g = i18;
        this.f282305h = i3Var;
        this.f282306i = h3Var;
        this.f282307m = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.ie baseResponse;
        r45.du5 du5Var;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f282301d.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.modelbase.o oVar = this.f282302e;
        com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
        r45.i8 i8Var = fVar instanceof r45.i8 ? (r45.i8) fVar : null;
        int i17 = this.f282303f;
        vg3.h3 h3Var = this.f282306i;
        if (i17 == 0 && this.f282304g == 0 && i8Var != null) {
            gd0.e eVar = (gd0.e) i95.n0.c(gd0.e.class);
            vg3.i3 i3Var = this.f282305h;
            ((fd0.e) eVar).wi(i3Var.f436718m).m(i3Var.f436718m).b();
            if (h3Var != null) {
                h3Var.a(true, "", i8Var.f376804d);
            }
        } else {
            java.lang.String str = (i8Var == null || (baseResponse = i8Var.getBaseResponse()) == null || (du5Var = baseResponse.f376960e) == null) ? null : du5Var.f372756d;
            if (str == null) {
                str = this.f282307m.getString(com.tencent.mm.R.string.f490823ay1);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            db5.t7.g(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
            if (h3Var != null) {
                h3Var.a(false, str, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
