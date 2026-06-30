package qs3;

/* loaded from: classes11.dex */
public final class t implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarSearchUI f366390d;

    public t(com.tencent.mm.plugin.radar.ui.RadarSearchUI radarSearchUI) {
        this.f366390d = radarSearchUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.radar.ui.RadarSearchUI radarSearchUI = this.f366390d;
        radarSearchUI.f154994f = true;
        radarSearchUI.finish();
    }
}
