package fn4;

/* loaded from: classes15.dex */
public class l implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.m f264571d;

    public l(fn4.m mVar) {
        this.f264571d = mVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        fn4.m mVar = this.f264571d;
        if (mVar.f264586g) {
            mVar.f264583d.I2().k();
            mVar.f264586g = false;
        }
        mVar.f264583d.B2();
    }
}
