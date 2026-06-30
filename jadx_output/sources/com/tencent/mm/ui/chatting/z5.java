package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class z5 implements mp3.k {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f206281a;

    public z5(yb5.d dVar) {
        this.f206281a = dVar;
    }

    @Override // mp3.k
    public boolean a(android.view.View view) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AvatarDoubleClickListener", "onDoubleClick tag null");
            return true;
        }
        java.lang.String str = erVar.f203906b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AvatarDoubleClickListener", "onDoubleClick: %s", str);
        if (((lp3.r) i95.n0.c(lp3.r.class)).Di()) {
            if (((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).wi(1, this.f206281a.x(), str)) {
                return false;
            }
        }
        return true;
    }
}
