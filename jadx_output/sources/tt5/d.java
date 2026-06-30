package tt5;

/* loaded from: classes14.dex */
public class d extends qt5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f422045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f422046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.scanlib.ui.ScanView f422047c;

    public d(com.tencent.scanlib.ui.ScanView scanView, int i17, int i18) {
        this.f422047c = scanView;
        this.f422045a = i17;
        this.f422046b = i18;
    }

    @Override // qt5.f
    public void a() {
        com.tencent.scanlib.ui.ScanView scanView = this.f422047c;
        ((qt5.c) scanView.f215302e).l(new android.graphics.Point(this.f422045a, this.f422046b));
        scanView.i(new tt5.c(this));
    }
}
