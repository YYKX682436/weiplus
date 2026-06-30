package sb4;

/* loaded from: classes4.dex */
public class j extends sb4.h {

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f405531l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.TagImageView f405532m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f405533n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f405534o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f405535p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f405536q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f405537r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView f405538s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f405539t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f405540u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ sb4.e f405541v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(sb4.e eVar) {
        super(eVar);
        this.f405541v = eVar;
    }

    @Override // sb4.h
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$NormalViewHolder");
        super.a();
        this.f405531l.setVisibility(8);
        this.f405532m.setVisibility(8);
        android.widget.TextView textView = this.f405533n;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.f405534o.setVisibility(8);
        this.f405535p.setVisibility(8);
        this.f405536q.setVisibility(8);
        this.f405538s.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.TagImageView tagImageView = this.f405532m;
        sb4.e eVar = this.f405541v;
        sb4.e.a(eVar, tagImageView, i65.a.f(eVar.f405455d, com.tencent.mm.R.dimen.f479723df));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$NormalViewHolder");
    }
}
