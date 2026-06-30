package kp1;

/* loaded from: classes11.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView f310923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ np1.a f310924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarBaseView, np1.a aVar) {
        super(0);
        this.f310923d = audioPanelTaskBarBaseView;
        this.f310924e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarBaseView = this.f310923d;
        np1.a aVar = this.f310924e;
        audioPanelTaskBarBaseView.setCurrentPlayInfo(aVar);
        java.lang.String f17 = audioPanelTaskBarBaseView.f(aVar);
        if (f17 == null || f17.length() == 0) {
            android.widget.TextView textView = audioPanelTaskBarBaseView.recentDescTextView;
            if (textView != null) {
                textView.setText(textView.getResources().getString(com.tencent.mm.R.string.hja));
                textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
                textView.setVisibility(0);
            }
        } else {
            android.widget.TextView textView2 = audioPanelTaskBarBaseView.recentDescTextView;
            if (textView2 != null) {
                textView2.setText(f17);
                textView2.setTextColor(textView2.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                textView2.setVisibility(0);
            }
        }
        audioPanelTaskBarBaseView.n(audioPanelTaskBarBaseView.getMCurrentPlayState());
        audioPanelTaskBarBaseView.k(aVar);
        return jz5.f0.f302826a;
    }
}
