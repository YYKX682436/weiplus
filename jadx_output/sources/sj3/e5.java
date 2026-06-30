package sj3;

/* loaded from: classes14.dex */
public final class e5 implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView f408501d;

    public e5(com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView) {
        this.f408501d = multitalkFrameView;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "refreshDebugInfo";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView = this.f408501d;
        android.widget.TextView textView = multitalkFrameView.f150340f;
        if (textView != null) {
            textView.setText(r26.b0.b("\n            mid: " + multitalkFrameView.mId + "\n            fps: " + multitalkFrameView.f150349r + "\n            size: " + multitalkFrameView.f150352u + 'x' + multitalkFrameView.f150353v + "\n            isILink: " + multitalkFrameView.f150351t + "\n            "));
        }
        multitalkFrameView.f150349r = 0;
    }
}
