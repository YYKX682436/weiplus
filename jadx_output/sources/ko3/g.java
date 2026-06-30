package ko3;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f309956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f309957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f309958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f309959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ko3.u f309960h;

    public g(ko3.u uVar, boolean[] zArr, int i17, int i18, android.view.View view) {
        this.f309960h = uVar;
        this.f309956d = zArr;
        this.f309957e = i17;
        this.f309958f = i18;
        this.f309959g = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f309956d[0] = this.f309960h.h(this.f309957e, this.f309958f, this.f309959g);
        synchronized (this.f309956d) {
            boolean[] zArr = this.f309956d;
            zArr[1] = true;
            zArr.notifyAll();
        }
    }
}
