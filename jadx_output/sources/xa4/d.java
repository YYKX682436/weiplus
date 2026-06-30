package xa4;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f452824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f452825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f452826f;

    public d(android.content.Context context, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f452824d = context;
        this.f452825e = textView;
        this.f452826f = textView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$createPostSheetSpringMenuItem$1$onMenuItemViewCustomize$1");
        android.content.Context context = this.f452824d;
        int color = b3.l.getColor(context, com.tencent.mm.R.color.af9);
        this.f452825e.setTextColor(color);
        android.widget.TextView textView = this.f452826f;
        textView.setTextColor(color);
        textView.setContentDescription(context.getString(com.tencent.mm.R.string.m6q));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.spring.SnsSpringLogic$createPostSheetSpringMenuItem$1$onMenuItemViewCustomize$1");
    }
}
