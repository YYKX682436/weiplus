package tu;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f422056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f422057g;

    public c(java.lang.String str, java.lang.String str2, com.tencent.mm.storage.f9 f9Var, android.app.Dialog dialog) {
        this.f422054d = str;
        this.f422055e = str2;
        this.f422056f = f9Var;
        this.f422057g = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bt3.g2.M(this.f422054d, this.f422055e, this.f422056f, false);
        ((ku5.t0) ku5.t0.f312615d).B(new tu.b(this.f422057g));
    }
}
