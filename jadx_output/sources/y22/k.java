package y22;

/* loaded from: classes.dex */
public final class k implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI f459096a;

    public k(com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI emojiCaptureUI) {
        this.f459096a = emojiCaptureUI;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        boolean z17;
        kotlin.jvm.internal.o.d(iArr);
        int length = iArr.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                z17 = false;
                break;
            }
            z17 = true;
            if (iArr[i18] != 0) {
                break;
            } else {
                i18++;
            }
        }
        if (z17) {
            java.lang.Integer S = kz5.z.S(iArr, 0);
            int i19 = (S != null && S.intValue() == 0) ? com.tencent.mm.R.string.hhn : com.tencent.mm.R.string.hh8;
            com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI emojiCaptureUI = this.f459096a;
            db5.e1.k(emojiCaptureUI.getContext(), i19, com.tencent.mm.R.string.hht, com.tencent.mm.R.string.g6z, com.tencent.mm.R.string.f490347sg, false, new y22.i(emojiCaptureUI), new y22.j(emojiCaptureUI));
        }
    }
}
