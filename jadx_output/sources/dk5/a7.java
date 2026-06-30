package dk5;

/* loaded from: classes12.dex */
public class a7 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.ShareImageSelectorUI f234500a;

    public a7(com.tencent.mm.ui.transmit.ShareImageSelectorUI shareImageSelectorUI) {
        this.f234500a = shareImageSelectorUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        this.f234500a.finish();
    }
}
