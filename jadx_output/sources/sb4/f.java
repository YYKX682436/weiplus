package sb4;

/* loaded from: classes4.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f405495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb4.e f405496e;

    public f(sb4.e eVar, android.widget.TextView textView) {
        this.f405496e = eVar;
        this.f405495d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$1");
        new android.graphics.Rect();
        android.widget.TextView textView = this.f405495d;
        textView.measure(0, 0);
        int measuredHeight = textView.getMeasuredHeight();
        sb4.e eVar = this.f405496e;
        eVar.f405471w = measuredHeight;
        int i17 = eVar.f405471w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$1");
    }
}
