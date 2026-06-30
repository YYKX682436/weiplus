package f41;

/* loaded from: classes11.dex */
public final class b extends androidx.activity.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.open_voice_control.card.A2ACardActivity f259468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.open_voice_control.card.A2ACardActivity a2ACardActivity) {
        super(true);
        this.f259468a = a2ACardActivity;
    }

    @Override // androidx.activity.g
    public void handleOnBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.A2AActivity", "handleOnBackPressed");
        com.tencent.mm.open_voice_control.card.A2ACardActivity a2ACardActivity = this.f259468a;
        androidx.fragment.app.Fragment findFragmentById = a2ACardActivity.getSupportFragmentManager().findFragmentById(com.tencent.mm.R.id.gd9);
        if (findFragmentById instanceof com.tencent.mm.open_voice_control.card.SelectContactCard) {
            yz5.a aVar = ((com.tencent.mm.open_voice_control.card.SelectContactCard) findFragmentById).f72242o;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        if (findFragmentById instanceof com.tencent.mm.open_voice_control.card.SendMsgCard) {
            yz5.a aVar2 = ((com.tencent.mm.open_voice_control.card.SendMsgCard) findFragmentById).f72255s;
            if (aVar2 != null) {
                aVar2.invoke();
                return;
            }
            return;
        }
        if (findFragmentById instanceof com.tencent.mm.open_voice_control.card.LoadingCard) {
            yz5.a aVar3 = ((com.tencent.mm.open_voice_control.card.LoadingCard) findFragmentById).X1;
            if (aVar3 != null) {
                aVar3.invoke();
                return;
            }
            return;
        }
        if (findFragmentById instanceof com.tencent.mm.open_voice_control.card.PermissionRequestCard) {
            com.tencent.mars.xlog.Log.i("MicroMsg.A2AActivity", "PermissionRequestCard: back press ignored");
        } else {
            a2ACardActivity.finish();
        }
    }
}
