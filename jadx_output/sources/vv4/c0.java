package vv4;

/* loaded from: classes11.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI) {
        super(0);
        this.f440453d = mMFTSImageRecognitionUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.B;
        com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI = this.f440453d;
        java.lang.Object obj = mMFTSImageRecognitionUI.a7().get("searchScene");
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = num != null ? num.intValue() : 0;
        return intValue > 0 ? java.lang.Integer.valueOf(intValue) : java.lang.Integer.valueOf(zv4.f.f476460a.a(mMFTSImageRecognitionUI.Y6()));
    }
}
