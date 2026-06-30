package j00;

/* loaded from: classes9.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296941f;

    public x0(j00.k1 k1Var, java.lang.String str, java.lang.String str2) {
        this.f296939d = k1Var;
        this.f296940e = str;
        this.f296941f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f296939d.Ui(this.f296940e, this.f296941f);
    }
}
