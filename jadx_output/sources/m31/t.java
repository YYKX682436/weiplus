package m31;

/* loaded from: classes3.dex */
public class t extends com.tencent.mm.ui.base.preference.Preference {
    public final android.view.View.OnClickListener L;
    public final /* synthetic */ com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI subscribeMsgDetailUI, android.content.Context context, android.view.View.OnClickListener onClickListener) {
        super(context);
        this.M = subscribeMsgDetailUI;
        this.L = null;
        this.L = onClickListener;
        this.G = com.tencent.mm.R.layout.cnh;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.widget.TextView textView = (android.widget.TextView) u17.findViewById(com.tencent.mm.R.id.o3b);
        textView.setOnClickListener(new m31.s(this));
        com.tencent.mm.msgsubscription.ui.SubscribeMsgDetailUI subscribeMsgDetailUI = this.M;
        if (subscribeMsgDetailUI.f71861g) {
            textView.setText(subscribeMsgDetailUI.getResources().getString(com.tencent.mm.R.string.fo_));
            textView.setContentDescription(subscribeMsgDetailUI.getResources().getString(com.tencent.mm.R.string.fo_) + "," + subscribeMsgDetailUI.getResources().getString(com.tencent.mm.R.string.akc));
        } else {
            textView.setText(subscribeMsgDetailUI.getResources().getString(com.tencent.mm.R.string.akj));
            textView.setContentDescription(subscribeMsgDetailUI.getResources().getString(com.tencent.mm.R.string.akj) + "," + subscribeMsgDetailUI.getResources().getString(com.tencent.mm.R.string.akc));
        }
        return u17;
    }
}
