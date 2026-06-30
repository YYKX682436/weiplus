package dk5;

/* loaded from: classes12.dex */
public class e7 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.ShareImageSelectorUI f234611a;

    public e7(com.tencent.mm.ui.transmit.ShareImageSelectorUI shareImageSelectorUI) {
        this.f234611a = shareImageSelectorUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.ui.transmit.ShareImageSelectorUI shareImageSelectorUI = this.f234611a;
        if (i17 == 0) {
            int i18 = com.tencent.mm.ui.transmit.ShareImageSelectorUI.f211038m;
            shareImageSelectorUI.U6();
        } else if (i17 == 1) {
            int i19 = com.tencent.mm.ui.transmit.ShareImageSelectorUI.f211038m;
            shareImageSelectorUI.V6();
        } else {
            if (i17 != 2) {
                return;
            }
            int i27 = com.tencent.mm.ui.transmit.ShareImageSelectorUI.f211038m;
            shareImageSelectorUI.T6();
        }
    }
}
