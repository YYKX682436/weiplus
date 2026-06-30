package pk2;

/* loaded from: classes3.dex */
public final class d0 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355645i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355645i = n() ? "anchorlive.more.commentmanage.comment" : "startlive.more.commentmanage.comment";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355645i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        return (n() && zl2.r4.f473950a.J1(this.f364427a.f356074b)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // qk2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(pk2.o9 r40, com.tencent.mm.plugin.finder.view.e3 r41, java.lang.Integer r42) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.d0.t(pk2.o9, com.tencent.mm.plugin.finder.view.e3, java.lang.Integer):void");
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.c7r);
    }

    public final void w(int i17, int i18, int i19) {
        if (n()) {
            java.util.Map e17 = kz5.b1.e(new jz5.l("status", java.lang.String.valueOf(i19)));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 13);
            jSONObject.put("type", i17);
            jSONObject.put("sub_element", 10);
            jSONObject.put("sub_type", i18);
            for (java.util.Map.Entry entry : e17.entrySet()) {
                jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.D1, jSONObject.toString(), null, 4, null);
            return;
        }
        java.util.Map e18 = kz5.b1.e(new jz5.l("status", java.lang.String.valueOf(i19)));
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("element", 6);
        jSONObject2.put("type", i17);
        jSONObject2.put("sub_element", 10);
        jSONObject2.put("sub_type", i18);
        for (java.util.Map.Entry entry2 : e18.entrySet()) {
            jSONObject2.put((java.lang.String) entry2.getKey(), entry2.getValue());
        }
        i95.m c18 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c18;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 37L, jSONObject2.toString(), null, 4, null);
    }
}
