package te2;

/* loaded from: classes3.dex */
public final class t1 extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f418422a = new java.util.LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ te2.u1 f418423b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf2.e0 f418424c;

    public t1(te2.u1 u1Var, sf2.e0 e0Var) {
        this.f418423b = u1Var;
        this.f418424c = e0Var;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.lang.String valueOf;
        java.util.List list;
        bm2.w wVar;
        dk2.vg vgVar;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            if (k3Var instanceof bm2.x) {
                boolean x17 = dk2.ef.f233372a.x();
                te2.u1 u1Var = this.f418423b;
                androidx.recyclerview.widget.f2 adapter = u1Var.getMusicRv().getAdapter();
                bm2.a0 a0Var = adapter instanceof bm2.a0 ? (bm2.a0) adapter : null;
                r45.d22 d22Var = (a0Var == null || (list = a0Var.f21749f) == null || (wVar = (bm2.w) kz5.n0.a0(list, ((bm2.x) k3Var).getAdapterPosition())) == null || (vgVar = wVar.f22394b) == null) ? null : vgVar.f234254a;
                if (d22Var == null || (valueOf = d22Var.getString(9)) == null) {
                    valueOf = java.lang.String.valueOf(d22Var != null ? java.lang.Integer.valueOf(d22Var.getInteger(0)) : null);
                }
                java.util.Set set = this.f418422a;
                if (!set.contains(valueOf)) {
                    set.add(valueOf);
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("type", 2);
                    jSONObject.put("tab_type", u1Var.getType().f390089d);
                    jSONObject.put("base_listenid", d22Var != null ? d22Var.getString(9) : null);
                    sf2.e0 e0Var = this.f418424c;
                    if (!kotlin.jvm.internal.o.b(e0Var.f407115q, "")) {
                        jSONObject.put("ai_msg_id", e0Var.f407115q);
                    }
                    if (x17) {
                        i95.m c17 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c17, "getService(...)");
                        zy2.zb.y6((zy2.zb) c17, ml2.z4.O1, jSONObject.toString(), null, 4, null);
                    } else {
                        i95.m c18 = i95.n0.c(ml2.j0.class);
                        kotlin.jvm.internal.o.f(c18, "getService(...)");
                        ml2.c1 c1Var = ml2.c1.f327325e;
                        zy2.zb.j5((zy2.zb) c18, 48L, jSONObject.toString(), null, 4, null);
                    }
                }
            }
        }
    }
}
