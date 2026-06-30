package lr;

/* loaded from: classes12.dex */
public final class n implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f320556a;

    public n(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f320556a = iEmojiInfo;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f320556a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.getMd5())) {
                return;
            }
            ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).F(iEmojiInfo.getMd5());
        }
    }
}
