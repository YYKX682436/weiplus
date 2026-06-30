package lt3;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f321193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f321195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f321196g;

    public a(int i17, java.lang.String str, boolean z17, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        this.f321193d = i17;
        this.f321194e = str;
        this.f321195f = z17;
        this.f321196g = captureDataManager$CaptureVideoNormalModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt3.e eVar = lt3.e.f321209a;
        java.util.Set set = (java.util.Set) lt3.e.f321210b.get(this.f321193d);
        if (set != null) {
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                ((lt3.f) it.next()).a(this.f321194e, this.f321195f, this.f321196g);
            }
        }
    }
}
