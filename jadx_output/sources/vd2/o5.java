package vd2;

/* loaded from: classes3.dex */
public final class o5 implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vd2.v5 f435844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f435845b;

    public o5(vd2.v5 v5Var, boolean z17) {
        this.f435844a = v5Var;
        this.f435845b = z17;
    }

    @Override // i50.n
    public void a(boolean z17) {
        vd2.v5 v5Var = this.f435844a;
        r45.q65 q65Var = (r45.q65) v5Var.f435959e.getCustom(10);
        boolean z18 = false;
        if (q65Var != null && q65Var.getBoolean(0)) {
            z18 = true;
        }
        if (this.f435845b) {
            android.app.Activity activity = v5Var.f435957c;
            db5.t7.m(activity, activity.getString(com.tencent.mm.R.string.e0o));
        } else {
            java.lang.String string = z18 ? v5Var.f435957c.getString(com.tencent.mm.R.string.e0k) : v5Var.f435957c.getString(com.tencent.mm.R.string.e0j);
            kotlin.jvm.internal.o.d(string);
            db5.t7.m(v5Var.f435957c, string);
        }
    }
}
