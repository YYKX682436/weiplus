package pk2;

/* loaded from: classes3.dex */
public final class r2 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356210h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356211i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356210h = helper.G;
        this.f356211i = n() ? "anchorlive.more.grow" : "startlive.more.grow";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.c1) o9Var.c(mm2.c1.class)).Z;
        r45.k74 lite_app_info = finderJumpInfo != null ? finderJumpInfo.getLite_app_info() : null;
        java.lang.String string = lite_app_info != null ? lite_app_info.getString(0) : null;
        java.lang.String string2 = lite_app_info != null ? lite_app_info.getString(1) : null;
        java.lang.String string3 = lite_app_info != null ? lite_app_info.getString(2) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clickAnchorOpPromotionMiniApp anchorOpPromoteMiniAppInfo hash:");
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = ((mm2.c1) o9Var.c(mm2.c1.class)).Z;
        sb6.append(finderJumpInfo2 != null ? java.lang.Integer.valueOf(finderJumpInfo2.hashCode()) : null);
        sb6.append(", appId:");
        sb6.append(string);
        sb6.append(", page:");
        sb6.append(string2);
        sb6.append(", query:");
        sb6.append(string3);
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, sb6.toString());
        if (string == null || string.length() == 0) {
            db5.t7.g(o9Var.f356078d, "请稍候重试");
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", string);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, string2);
            bundle.putString("query", string3);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(o9Var.f356078d, bundle, true, false, new pk2.q2(o9Var));
        }
        if (n()) {
            pk2.f8.a(pk2.f8.f355747a, 5, 2, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 4);
        jSONObject.put("type", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356211i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f364427a;
        return ((mm2.c1) o9Var.c(mm2.c1.class)).Z != null && pm0.v.z((int) (((mm2.c1) o9Var.c(mm2.c1.class)).f328778a5 ? gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L) : gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L)), 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        if (r6 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    @Override // qk2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(pk2.o9 r11, db5.g4 r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.r2.v(pk2.o9, db5.g4):void");
    }

    @Override // qk2.h
    public int y() {
        return this.f356210h;
    }
}
