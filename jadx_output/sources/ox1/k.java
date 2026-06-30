package ox1;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f349605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ox1.s f349606e;

    public k(ox1.s sVar, boolean z17) {
        this.f349606e = sVar;
        this.f349605d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f349606e.z(this.f349605d);
    }
}
