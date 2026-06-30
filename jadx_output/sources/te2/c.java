package te2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.l f417909d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(te2.l lVar) {
        super(0);
        this.f417909d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        byte[] bArr;
        boolean w17 = zl2.r4.f473950a.w1();
        te2.l lVar = this.f417909d;
        if (w17) {
            lVar.getClass();
            qo0.c.a(lVar.f418182g, qo0.b.V4, null, 2, null);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.R;
            ml2.e2[] e2VarArr = ml2.e2.f327374d;
            zy2.zb.y6(zbVar, z4Var, java.lang.String.valueOf(2), null, 4, null);
        } else {
            te2.b bVar = lVar.f418186n;
            if (bVar != null) {
                ((te2.o) bVar).a();
            }
            kotlinx.coroutines.r2 r2Var = lVar.f418185m;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            dk2.ef efVar = dk2.ef.f233372a;
            mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
            boolean z17 = c1Var != null && c1Var.N1;
            qo0.c cVar = lVar.f418182g;
            if (z17) {
                mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
                if (c1Var2 != null) {
                    c1Var2.N1 = false;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
                cVar.statusChange(qo0.b.Z2, bundle);
            }
            if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3713c4).getValue()).r()).intValue() == 1) {
                dk2.u7 u7Var = dk2.u7.f234181a;
                ce2.i e17 = u7Var.e("MMFinderLiveGift100001");
                qo0.b bVar2 = qo0.b.T4;
                android.os.Bundle bundle2 = new android.os.Bundle();
                if (!u7Var.g(e17)) {
                    java.lang.String str = e17 != null ? e17.field_thumbnailFileUrl : null;
                    if (str == null) {
                        str = "";
                    }
                    bundle2.putString("PARAM_FINDER_LIVE_ALLOWANCE_GIFT_ICON_URL", str);
                }
                cVar.statusChange(bVar2, bundle2);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String r17 = c01.z1.r();
                if (r17 != null) {
                    bArr = r17.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
                } else {
                    bArr = null;
                }
                sb6.append(kk.k.g(bArr));
                sb6.append('_');
                sb6.append(java.util.UUID.randomUUID());
                kotlinx.coroutines.l.d(lVar.f418187o, null, null, new te2.d(lVar, e17, sb6.toString(), null), 3, null);
            } else {
                kotlinx.coroutines.l.d(lVar.f418184i, null, null, new te2.j(lVar, null), 3, null);
            }
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((ml2.r0) c18).Yj(ml2.f2.f327424f, "");
        }
        return jz5.f0.f302826a;
    }
}
