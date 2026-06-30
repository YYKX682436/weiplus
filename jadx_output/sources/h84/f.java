package h84;

/* loaded from: classes4.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h84.h f279564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h84.h hVar) {
        super(0);
        this.f279564d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$mWxaTagClickText$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$mWxaTagClickText$2");
        android.widget.FrameLayout y17 = h84.h.y(this.f279564d);
        android.widget.TextView textView = y17 != null ? (android.widget.TextView) y17.findViewById(com.tencent.mm.R.id.q1d) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$mWxaTagClickText$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent$mWxaTagClickText$2");
        return textView;
    }
}
