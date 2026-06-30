package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class g2 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.p2 f122310d;

    public g2(com.tencent.mm.plugin.finder.playlist.p2 p2Var) {
        this.f122310d = p2Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListPresenter", "onItemClick: position:" + i17);
        com.tencent.mm.plugin.finder.playlist.e eVar = (com.tencent.mm.plugin.finder.playlist.e) holder.f293125i;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", eVar.f122291d.getInteger(21));
        r45.vx0 vx0Var = eVar.f122291d;
        java.lang.String string = vx0Var.getString(1);
        if (string == null) {
            string = "";
        }
        long j17 = vx0Var.getLong(0);
        intent.putExtra("key_topic_title", string);
        intent.putExtra("KEY_TOPIC_ID", j17);
        intent.putExtra("KEY_OPEN_PLAYLIST_DRAWER", true);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.playlist.p2 p2Var = this.f122310d;
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, p2Var.f122395a, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).il(p2Var.f122395a, intent);
    }
}
