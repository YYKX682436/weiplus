package zv;

/* loaded from: classes11.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f476020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f476021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476022g;

    public l0(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f476019d = str;
        this.f476020e = i17;
        this.f476021f = i18;
        this.f476022g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui()) {
            zv.m0.f476029a.e(this.f476019d, this.f476020e, this.f476021f, this.f476022g);
        }
    }
}
