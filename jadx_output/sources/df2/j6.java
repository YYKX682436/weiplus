package df2;

/* loaded from: classes3.dex */
public final class j6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.t6 f230451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230453f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(df2.t6 t6Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f230451d = t6Var;
        this.f230452e = str;
        this.f230453f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        df2.w5 w5Var;
        df2.t6 t6Var = this.f230451d;
        android.widget.LinearLayout linearLayout = t6Var.f231416n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        df2.d6 d6Var = (df2.d6) t6Var.controller(df2.d6.class);
        if (d6Var != null && (w5Var = d6Var.f229945m) != null) {
            w5Var.c();
        }
        if (in0.q.f292769b2 != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("features_stage", java.lang.Integer.valueOf(this.f230452e.length() == 0 ? 1 : 2));
            linkedHashMap.put("features_type", this.f230453f);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Nj("live_anchor_gesture_features", "view_exp", linkedHashMap);
        }
        return jz5.f0.f302826a;
    }
}
