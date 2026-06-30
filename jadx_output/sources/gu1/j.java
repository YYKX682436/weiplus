package gu1;

/* loaded from: classes15.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI f275891d;

    public j(com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI cardConsumeSuccessUI) {
        this.f275891d = cardConsumeSuccessUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        int i18 = com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI.F;
        com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI cardConsumeSuccessUI = this.f275891d;
        cardConsumeSuccessUI.V6(0);
        cardConsumeSuccessUI.finish();
    }
}
