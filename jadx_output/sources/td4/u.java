package td4;

/* loaded from: classes4.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ td4.x f417732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417733e;

    public u(td4.x xVar, int i17) {
        this.f417732d = xVar;
        this.f417733e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$3");
        com.tencent.mm.ui.widget.MMNumberCheckbox i17 = this.f417732d.i();
        int i18 = this.f417733e;
        com.tencent.mm.sdk.platformtools.t8.q(i17, i18, i18, i18, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter$SnsInfoViewHolder$onBind$3");
    }
}
