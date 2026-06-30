package d5;

/* loaded from: classes13.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final d5.k f226493d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Intent f226494e;

    /* renamed from: f, reason: collision with root package name */
    public final int f226495f;

    public h(d5.k kVar, android.content.Intent intent, int i17) {
        this.f226493d = kVar;
        this.f226494e = intent;
        this.f226495f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f226493d.a(this.f226494e, this.f226495f);
    }
}
