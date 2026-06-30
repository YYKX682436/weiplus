package sc3;

/* loaded from: classes7.dex */
public final class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.q1 f406518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406520f;

    public p1(sc3.q1 q1Var, java.lang.String str, java.lang.String str2) {
        this.f406518d = q1Var;
        this.f406519e = str;
        this.f406520f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f406518d.f406477f.g(this.f406519e, this.f406520f);
    }
}
