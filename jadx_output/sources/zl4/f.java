package zl4;

/* loaded from: classes4.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.playapp.radio_channel.floatball.TingRadioChannelFloatBallView f474079d;

    public f(com.tencent.mm.plugin.ting.playapp.radio_channel.floatball.TingRadioChannelFloatBallView tingRadioChannelFloatBallView) {
        this.f474079d = tingRadioChannelFloatBallView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/playapp/radio_channel/floatball/TingRadioChannelFloatBallView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View.OnClickListener onClickListener = this.f474079d.f174732e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ting/playapp/radio_channel/floatball/TingRadioChannelFloatBallView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
