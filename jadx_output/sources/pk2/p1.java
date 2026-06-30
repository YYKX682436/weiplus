package pk2;

/* loaded from: classes3.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f356135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.r1 f356137f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f356138g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(boolean z17, pk2.o9 o9Var, pk2.r1 r1Var, v65.n nVar) {
        super(2);
        this.f356135d = z17;
        this.f356136e = o9Var;
        this.f356137f = r1Var;
        this.f356138g = nVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z17 = this.f356135d;
        java.lang.String string = z17 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dx_) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dx8);
        kotlin.jvm.internal.o.d(string);
        pk2.o9 o9Var = this.f356136e;
        kotlin.jvm.internal.o.d(z17 ? o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.f491609dn5) : o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.f491607dn3));
        if (booleanValue) {
            ((mm2.o4) o9Var.c(mm2.o4.class)).F = z17 ? 1 : 0;
            pk2.r1 r1Var = this.f356137f;
            if (r1Var.f364428b == 1) {
                java.lang.Integer num = 1;
                int i17 = z17 ? 9 : 8;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("element", 6);
                if (num != null) {
                    num.intValue();
                    jSONObject.put("type", num.intValue());
                }
                jSONObject.put("sub_element", 6);
                jSONObject.put("sub_type", i17);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.c1 c1Var = ml2.c1.f327325e;
                zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                ml2.z4 z4Var = ml2.z4.f328360l1;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                ml2.e1[] e1VarArr = ml2.e1.f327373d;
                jSONObject2.put("type", z17 ? "0" : "1");
                zy2.zb.y6(zbVar2, z4Var, jSONObject2.toString(), null, 4, null);
            }
            com.tencent.mm.plugin.finder.live.util.n2 n2Var = com.tencent.mm.plugin.finder.live.util.n2.f115640a;
            int i18 = o9Var.f356076c;
            int i19 = r1Var.f364428b;
            if (z17) {
                n2Var.e("enableLinkMic", (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_ENABLE", true);
                o9Var.j(qo0.b.Q3, bundle);
                if (i18 == 1) {
                    if (i19 == 1) {
                        i95.m c19 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c19, "getService(...)");
                        zy2.zb zbVar3 = (zy2.zb) c19;
                        ml2.c1 c1Var2 = ml2.c1.f327325e;
                        ml2.r2 r2Var = ml2.r2.f327896e;
                        zy2.zb.j5(zbVar3, 15L, java.lang.String.valueOf(1), null, 4, null);
                    } else {
                        i95.m c27 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c27, "getService(...)");
                        zy2.zb zbVar4 = (zy2.zb) c27;
                        ml2.z4 z4Var2 = ml2.z4.f328386x;
                        ml2.r2 r2Var2 = ml2.r2.f327896e;
                        zy2.zb.y6(zbVar4, z4Var2, java.lang.String.valueOf(1), null, 4, null);
                    }
                }
            } else {
                n2Var.e("disableLinkMic", (int) ((mm2.c1) o9Var.c(mm2.c1.class)).f328866q);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putBoolean("PARAM_FINDER_LIVE_LINK_MIC_ENABLE", false);
                o9Var.j(qo0.b.Q3, bundle2);
                if (i18 == 1) {
                    if (i19 == 1) {
                        i95.m c28 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c28, "getService(...)");
                        zy2.zb zbVar5 = (zy2.zb) c28;
                        ml2.c1 c1Var3 = ml2.c1.f327325e;
                        ml2.r2 r2Var3 = ml2.r2.f327896e;
                        zy2.zb.j5(zbVar5, 15L, java.lang.String.valueOf(2), null, 4, null);
                    } else {
                        i95.m c29 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c29, "getService(...)");
                        zy2.zb zbVar6 = (zy2.zb) c29;
                        ml2.z4 z4Var3 = ml2.z4.f328386x;
                        ml2.r2 r2Var4 = ml2.r2.f327896e;
                        zy2.zb.y6(zbVar6, z4Var3, java.lang.String.valueOf(2), null, 4, null);
                    }
                }
            }
            if (r1Var.n()) {
                i95.m c37 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c37, "getService(...)");
                zy2.zb.T8((zy2.zb) c37, z17 ? ml2.t1.F : ml2.t1.G, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
            }
        } else {
            db5.t7.b(o9Var.f356078d, string + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cud));
        }
        this.f356138g.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f302826a;
    }
}
