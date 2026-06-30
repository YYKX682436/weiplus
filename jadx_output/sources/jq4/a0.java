package jq4;

@yn.c(exportInterface = zn.a.class)
/* loaded from: classes3.dex */
public final class a0 extends yn.n implements zn.a {

    /* renamed from: e, reason: collision with root package name */
    public final xg3.h0 f301120e = new jq4.z(this);

    @Override // yn.l
    public void K() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this.f301120e);
    }

    @Override // yn.d
    public void O() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "msg_push_close");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 26804);
    }

    @Override // yn.d
    public void P() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "set_msg_push_unread");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 26804);
    }

    @Override // yn.d
    public void Q() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "msg_blank_half_screen");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 26804);
    }

    @Override // yn.n, yn.l
    public void z() {
        android.content.Intent n17 = ((yb5.d) this.f463595d).n();
        n17.getLongExtra("roomKey", 0L);
        n17.getIntExtra("roomId", 0);
        if (((yb5.d) this.f463595d).k() == 9) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this.f301120e, null);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("page_id", 30063);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 26804);
        }
    }
}
