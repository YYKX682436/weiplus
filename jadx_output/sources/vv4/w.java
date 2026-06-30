package vv4;

/* loaded from: classes11.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI) {
        super(0);
        this.f440516d = mMFTSImageRecognitionUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.B;
        com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI = this.f440516d;
        java.lang.Object obj = mMFTSImageRecognitionUI.a7().get("parentSearchId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            return str;
        }
        int X6 = mMFTSImageRecognitionUI.X6();
        if (X6 == 1) {
            str2 = "106:::";
        } else if (X6 == 2) {
            str2 = "107:::";
        } else if (X6 == 5) {
            str2 = "114:::";
        } else if (X6 == 6) {
            str2 = "115:::";
        } else if (X6 == 7) {
            str2 = "116:::";
        } else if (X6 == 8) {
            str2 = "117:::";
        }
        return str2;
    }
}
