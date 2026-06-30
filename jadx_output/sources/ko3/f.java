package ko3;

/* loaded from: classes13.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f309950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f309951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f309952f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean[] f309953g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ko3.u f309954h;

    public f(ko3.u uVar, int i17, android.view.View view, java.util.List list, boolean[] zArr) {
        this.f309954h = uVar;
        this.f309950d = i17;
        this.f309951e = view;
        this.f309952f = list;
        this.f309953g = zArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f309954h.g(this.f309950d, this.f309951e, this.f309952f);
        synchronized (this.f309953g) {
            boolean[] zArr = this.f309953g;
            zArr[0] = true;
            zArr.notifyAll();
        }
    }
}
