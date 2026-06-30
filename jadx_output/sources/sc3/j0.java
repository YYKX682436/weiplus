package sc3;

/* loaded from: classes7.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406466f;

    public j0(sc3.k1 k1Var, java.lang.String str, java.lang.String str2) {
        this.f406464d = k1Var;
        this.f406465e = str;
        this.f406466f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f406464d.f406477f.h(this.f406465e, this.f406466f);
    }
}
