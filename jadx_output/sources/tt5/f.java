package tt5;

/* loaded from: classes14.dex */
public class f extends qt5.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.scanlib.ui.ScanView f422049a;

    public f(com.tencent.scanlib.ui.ScanView scanView) {
        this.f422049a = scanView;
    }

    @Override // qt5.i
    public void a() {
        com.tencent.scanlib.ui.ScanView scanView = this.f422049a;
        ((qt5.c) scanView.f215302e).l(new android.graphics.Point(scanView.f215301d.getWidth(), scanView.f215301d.getHeight()));
        scanView.i(new tt5.e(this));
    }
}
