package sb4;

/* loaded from: classes4.dex */
public class l extends sb4.h {

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.MaskImageView f405558l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.MaskLinearLayout f405559m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f405560n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f405561o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f405562p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView f405563q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f405564r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f405565s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ sb4.e f405566t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(sb4.e eVar) {
        super(eVar);
        this.f405566t = eVar;
    }

    @Override // sb4.h
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SightViewHolder");
        super.a();
        this.f405558l.setVisibility(8);
        this.f405560n.setVisibility(8);
        this.f405563q.setVisibility(8);
        android.view.View view = this.f405561o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SightViewHolder", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SightViewHolder", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f405565s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SightViewHolder", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SightViewHolder", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f405564r.setVisibility(8);
        int Oj = com.tencent.mm.plugin.sns.model.l4.Oj();
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = this.f405558l;
        sb4.e eVar = this.f405566t;
        sb4.e.a(eVar, maskImageView, Oj);
        sb4.e.a(eVar, this.f405562p, Oj / 3);
        if (i65.a.q(eVar.f405455d) > 1.0f) {
            this.f405560n.setMaxLines(2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SightViewHolder");
    }
}
