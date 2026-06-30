package yg;

/* loaded from: classes7.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f462109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f462110e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MBRuntime f462111f;

    public n(com.tencent.magicbrush.MBRuntime mBRuntime, int i17, boolean z17) {
        this.f462111f = mBRuntime;
        this.f462109d = i17;
        this.f462110e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.magicbrush.ui.MagicBrushView findOrNull = this.f462111f.getF48590n().findOrNull(this.f462109d);
        if (findOrNull != null) {
            findOrNull.setOpaque(!this.f462110e);
        }
    }
}
