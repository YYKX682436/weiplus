package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class r8 {
    public r8(kotlin.jvm.internal.i iVar) {
    }

    public static final boolean c(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (com.tencent.mm.vfs.w6.j(str)) {
            return true;
        }
        return com.tencent.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).wi(str));
    }

    public final boolean a() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_c2c_video_seek_bar_new_enable, 1) == 1;
    }

    public final boolean b(com.tencent.mm.storage.f9 f9Var, t21.v2 v2Var) {
        if (f9Var == null || v2Var == null || ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Zi(f9Var) > 0) {
            return false;
        }
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false);
        java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22570r, f9Var.z0(), false);
        boolean c17 = c(rj6);
        boolean c18 = c(rj7);
        com.tencent.mars.xlog.Log.w("MicroMsg.Imagegallery.handler.video.tp", "isExpiredAndNotEvenDownload: thumbHasData=" + c17 + ", origHasData=" + c18);
        return (c17 || c18) ? false : true;
    }
}
