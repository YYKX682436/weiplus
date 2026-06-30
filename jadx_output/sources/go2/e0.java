package go2;

/* loaded from: classes2.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f273967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f273968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273969f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f273970g;

    public e0(go2.a1 a1Var, android.content.Context context, java.lang.String str, boolean z17) {
        this.f273967d = a1Var;
        this.f273968e = context;
        this.f273969f = str;
        this.f273970g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f273967d.P6(this.f273968e, this.f273969f, this.f273970g, false);
    }
}
