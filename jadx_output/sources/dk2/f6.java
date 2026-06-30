package dk2;

/* loaded from: classes3.dex */
public final class f6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f233444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f233445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f233446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gk2.e f233448h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.xf f233449i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f233450m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r45.l01 f233451n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.t f233452o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f233453p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233454q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(boolean z17, int i17, boolean z18, java.lang.String str, gk2.e eVar, dk2.xf xfVar, dk2.k6 k6Var, r45.l01 l01Var, yz5.t tVar, int i18, java.lang.String str2) {
        super(0);
        this.f233444d = z17;
        this.f233445e = i17;
        this.f233446f = z18;
        this.f233447g = str;
        this.f233448h = eVar;
        this.f233449i = xfVar;
        this.f233450m = k6Var;
        this.f233451n = l01Var;
        this.f233452o = tVar;
        this.f233453p = i18;
        this.f233454q = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createLive success:");
        boolean z17 = this.f233444d;
        sb6.append(z17);
        sb6.append(", errCode:");
        int i17 = this.f233445e;
        sb6.append(i17);
        sb6.append(" needFaceVerify:");
        boolean z18 = this.f233446f;
        sb6.append(z18);
        sb6.append(" verifyUrl:");
        java.lang.String str = this.f233447g;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FinderLiveExternalHelper", sb6.toString());
        r45.l01 l01Var = this.f233451n;
        if (z17) {
            gk2.e eVar = this.f233448h;
            ya2.b2 b2Var = ((mm2.c1) eVar.a(mm2.c1.class)).J4;
            if (b2Var == null) {
                ya2.g gVar = ya2.h.f460484a;
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                b2Var = gVar.b(xy2.c.e(context));
            }
            if (b2Var != null) {
                mm2.c1 c1Var = (mm2.c1) eVar.a(mm2.c1.class);
                int i18 = (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q;
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                c1Var.p8(i18 & (-257));
                ((mm2.c1) eVar.a(mm2.c1.class)).Z9(((mm2.c1) eVar.a(mm2.c1.class)).f328866q);
                ((mm2.c1) eVar.a(mm2.c1.class)).aa(b2Var.field_liveSwitchFlag);
                ((mm2.c1) eVar.a(mm2.c1.class)).T9(b2Var.field_liveSwitchFlag);
            }
            com.tencent.mm.plugin.finder.live.util.n2.f115640a.e("postLive", (int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q);
            dk2.xf.e(this.f233449i, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.c1) eVar.a(mm2.c1.class)).f328866q, 0, false, null, 56, null);
            dk2.u7.f234181a.i();
            dk2.k6 k6Var = this.f233450m;
            r45.wp1 wp1Var = k6Var.f233684b;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) l01Var.getCustom(1);
            wp1Var.set(5, finderObject != null ? finderObject.getWxa_game_export_id() : null);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("before joinLive: anchorStatusFlag:");
            sb7.append((int) ((mm2.c1) eVar.a(mm2.c1.class)).f328866q);
            sb7.append(", switchFlag:");
            sb7.append(b2Var != null ? java.lang.Long.valueOf(b2Var.field_liveSwitchFlag) : null);
            sb7.append(" giftFuncEnabel:");
            sb7.append(((mm2.c1) eVar.a(mm2.c1.class)).f328862p3);
            sb7.append(", linkMicFuncEnabel:");
            sb7.append(((mm2.o4) eVar.a(mm2.o4.class)).I);
            sb7.append(", wxaGameExportId:");
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) l01Var.getCustom(1);
            sb7.append(finderObject2 != null ? finderObject2.getWxa_game_export_id() : null);
            com.tencent.mars.xlog.Log.i("FinderLiveExternalHelper", sb7.toString());
            dk2.xf xfVar = this.f233449i;
            if (xfVar != null) {
                ((dk2.r4) xfVar).E(null, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), 1, null, new dk2.e6(this.f233452o, k6Var, eVar));
            }
        } else {
            int i19 = this.f233453p;
            if (!z18 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
                java.lang.String str2 = com.tencent.mm.plugin.finder.assist.t8.f102575u.f102540b;
                r45.l84 l84Var = new r45.l84();
                l84Var.set(1, java.lang.Integer.valueOf(i17));
                l84Var.set(2, this.f233454q);
                com.tencent.mm.plugin.finder.assist.p8.c(p8Var, str2, hc2.b.a(l84Var), false, true, 4, null);
                android.os.Bundle bundle = new android.os.Bundle();
                yz5.t tVar = this.f233452o;
                java.lang.String str3 = this.f233454q;
                r45.qp1 qp1Var = (r45.qp1) l01Var.getCustom(3);
                bundle.putByteArray("EXT_INFO_KEY_ERROR_PAGE", qp1Var != null ? qp1Var.toByteArray() : null);
                tVar.J(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), str3, bundle, l01Var);
            } else {
                com.tencent.mm.plugin.finder.assist.p8.c(com.tencent.mm.plugin.finder.assist.p8.f102460a, com.tencent.mm.plugin.finder.assist.t8.f102576v.f102540b, null, false, false, 14, null);
                android.os.Bundle bundle2 = new android.os.Bundle();
                yz5.t tVar2 = this.f233452o;
                java.lang.String str4 = this.f233454q;
                bundle2.putString("EXT_INFO_KEY_REAL_NAME_URL", str);
                tVar2.J(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), str4, bundle2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
