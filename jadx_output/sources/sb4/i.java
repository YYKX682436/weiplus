package sb4;

/* loaded from: classes4.dex */
public class i extends sb4.h {

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f405515l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMRoundCornerImageView f405516m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f405517n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f405518o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f405519p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f405520q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView f405521r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f405522s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f405523t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ sb4.e f405524u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sb4.e eVar) {
        super(eVar);
        this.f405524u = eVar;
    }

    @Override // sb4.h
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$MusicMVViewHolder");
        super.a();
        this.f405515l.setVisibility(8);
        this.f405518o.setVisibility(8);
        this.f405519p.setVisibility(8);
        this.f405521r.setVisibility(8);
        this.f405522s.setVisibility(8);
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = this.f405516m;
        sb4.e eVar = this.f405524u;
        sb4.e.a(eVar, mMRoundCornerImageView, i65.a.f(eVar.f405455d, com.tencent.mm.R.dimen.f479723df));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$MusicMVViewHolder");
    }
}
