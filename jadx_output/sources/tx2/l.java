package tx2;

/* loaded from: classes2.dex */
public final class l implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tx2.s f422604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f422605b;

    public l(tx2.s sVar, boolean z17) {
        this.f422604a = sVar;
        this.f422605b = z17;
    }

    @Override // i50.n
    public void a(boolean z17) {
        tx2.s sVar = this.f422604a;
        r45.q65 q65Var = (r45.q65) sVar.f422649e.getCustom(10);
        boolean z18 = false;
        if (q65Var != null && q65Var.getBoolean(0)) {
            z18 = true;
        }
        if (this.f422605b) {
            android.app.Activity activity = sVar.f422647c;
            db5.t7.m(activity, activity.getString(com.tencent.mm.R.string.e0o));
        } else {
            java.lang.String string = z18 ? sVar.f422647c.getString(com.tencent.mm.R.string.e0k) : sVar.f422647c.getString(com.tencent.mm.R.string.e0j);
            kotlin.jvm.internal.o.d(string);
            db5.t7.m(sVar.f422647c, string);
        }
    }
}
