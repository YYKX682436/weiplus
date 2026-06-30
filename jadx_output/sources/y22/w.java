package y22;

/* loaded from: classes10.dex */
public final class w implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.StickerPreviewUI f459117a;

    public w(com.tencent.mm.plugin.emojicapture.ui.StickerPreviewUI stickerPreviewUI) {
        this.f459117a = stickerPreviewUI;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.o.d(iArr);
        int length = iArr.length;
        boolean z17 = false;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                break;
            }
            if (iArr[i18] != 0) {
                z17 = true;
                break;
            }
            i18++;
        }
        if (z17) {
            com.tencent.mm.plugin.emojicapture.ui.StickerPreviewUI stickerPreviewUI = this.f459117a;
            com.tencent.mars.xlog.Log.w(stickerPreviewUI.f98638d, "request permission: not granted");
            stickerPreviewUI.finish();
        }
    }
}
