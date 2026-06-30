package qs3;

/* loaded from: classes11.dex */
public final class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarSearchUI f366385d;

    public s(com.tencent.mm.plugin.radar.ui.RadarSearchUI radarSearchUI) {
        this.f366385d = radarSearchUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        com.tencent.mm.plugin.radar.ui.RadarSearchUI radarSearchUI = this.f366385d;
        j35.u.g(radarSearchUI);
        radarSearchUI.f154994f = true;
        radarSearchUI.finish();
    }
}
