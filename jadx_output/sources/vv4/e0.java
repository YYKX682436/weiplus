package vv4;

/* loaded from: classes11.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440460d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI) {
        super(0);
        this.f440460d = mMFTSImageRecognitionUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.B;
        java.lang.Object obj = this.f440460d.a7().get("skipImageUploading");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        return java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
