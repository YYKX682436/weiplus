package sb4;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f405502a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f405503b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f405504c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f405505d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f405506e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f405507f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f405508g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f405509h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f405510i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.EndMaskView f405511j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ sb4.e f405512k;

    public h(sb4.e eVar) {
        this.f405512k = eVar;
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$BaseHolder");
        this.f405503b.setVisibility(8);
        this.f405504c.setVisibility(8);
        this.f405505d.setVisibility(8);
        this.f405506e.setVisibility(4);
        this.f405507f.setVisibility(4);
        android.view.View view = this.f405510i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$BaseHolder", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$BaseHolder", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f405508g.setVisibility(8);
        this.f405511j.setVisibility(8);
        this.f405508g.setTextSize(0, i65.a.f(this.f405512k.f405455d, com.tencent.mm.R.dimen.f479672c9));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$BaseHolder");
    }
}
