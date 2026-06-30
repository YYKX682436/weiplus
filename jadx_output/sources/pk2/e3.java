package pk2;

/* loaded from: classes3.dex */
public final class e3 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355703h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355704i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355703h = helper.f356120y;
        this.f355704i = n() ? "anchorlive.more.heatup" : "startlive.more.heatup";
        if (zl2.r4.f473950a.q(helper.f356074b)) {
            qk2.h.z(this, n() ? 24036 : 24003, 0, "live_more_heat_up", false, 10, null);
        }
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        ((mm2.c1) o9Var.c(mm2.c1.class)).Y = true;
        r45.j52 j52Var = ((mm2.c1) o9Var.c(mm2.c1.class)).X;
        if (j52Var != null) {
            zl2.r4.f473950a.q2(j52Var, "clickAnchorPromotionMiniApp", o9Var.f356078d);
        }
        if (!n()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 3);
            jSONObject.put("type", 2);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5((zy2.zb) c17, 37L, jSONObject.toString(), null, 4, null);
            return;
        }
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c18;
        ml2.z4 z4Var = ml2.z4.f328392y1;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("type", 2);
        zy2.zb.y6(zbVar, z4Var, jSONObject2.toString(), null, 4, null);
        pk2.f8.a(pk2.f8.f355747a, 4, 2, null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355704i;
    }

    @Override // qk2.f
    public boolean o() {
        pk2.o9 o9Var = this.f364427a;
        long t17 = ((mm2.c1) o9Var.c(mm2.c1.class)).f328778a5 ? gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_GAME_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L) : gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_FUNC_SWITCH_FLAG_LONG_SYNC, 0L);
        r45.j52 j52Var = ((mm2.c1) o9Var.c(mm2.c1.class)).X;
        return (j52Var != null && zl2.r4.f473950a.m2(j52Var)) && pm0.v.z((int) t17, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r10 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        if (r10 == null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0123  */
    @Override // qk2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void v(pk2.o9 r15, db5.g4 r16) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.e3.v(pk2.o9, db5.g4):void");
    }

    @Override // qk2.h
    public int y() {
        return this.f355703h;
    }
}
