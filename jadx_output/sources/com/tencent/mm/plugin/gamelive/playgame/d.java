package com.tencent.mm.plugin.gamelive.playgame;

/* loaded from: classes8.dex */
public class d implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelive.playgame.c f142102d;

    public d(com.tencent.mm.plugin.gamelive.playgame.c cVar) {
        this.f142102d = cVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 f2Var, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        android.view.View view2;
        com.tencent.mm.plugin.gamelive.playgame.f fVar = (com.tencent.mm.plugin.gamelive.playgame.f) ((in5.s0) k3Var).f293125i;
        com.tencent.mm.plugin.gamelive.playgame.c cVar = this.f142102d;
        com.tencent.mm.plugin.gamelive.playgame.e eVar = cVar.f142098f;
        java.lang.String str = fVar.f142103d;
        com.tencent.mm.plugin.gamelive.playgame.a aVar = (com.tencent.mm.plugin.gamelive.playgame.a) eVar;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = aVar.f142072a;
        if (y1Var == null || (view2 = y1Var.f212027f) == null) {
            com.tencent.mars.xlog.Log.e("GameLivePlayGameAnchorInviteWidget", "null");
        } else {
            int i18 = fVar.f142104e;
            aVar.f142084m = i18;
            aVar.f142083l.f142029d = i18;
            ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.krq)).setText(str);
        }
        cVar.h();
    }
}
