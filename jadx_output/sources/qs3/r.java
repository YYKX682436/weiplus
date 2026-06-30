package qs3;

/* loaded from: classes15.dex */
public final class r implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarMemberView f366383d;

    public r(com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView) {
        this.f366383d = radarMemberView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView = this.f366383d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = radarMemberView.f154990y;
        if (j0Var != null) {
            if (j0Var != null) {
                j0Var.dismiss();
            }
            radarMemberView.f154990y = null;
        }
        com.tencent.mm.plugin.radar.ui.RadarMemberView.a(radarMemberView);
    }
}
