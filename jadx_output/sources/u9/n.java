package u9;

/* loaded from: classes15.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.Format f425776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u9.s f425777e;

    public n(u9.s sVar, com.google.android.exoplayer2.Format format) {
        this.f425777e = sVar;
        this.f425776d = format;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f425777e.f425791b.s(this.f425776d);
    }
}
