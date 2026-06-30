package yl4;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(java.util.HashMap hashMap, bw5.lp0 lp0Var, bw5.o50 o50Var) {
        bw5.e70 g17;
        bw5.v70 d17;
        bw5.v70 d18;
        bw5.v70 d19;
        java.lang.String listenId = (lp0Var == null || (d19 = lp0Var.d()) == null) ? null : d19.getListenId();
        if (listenId == null) {
            listenId = "";
        }
        hashMap.put("currlistenid", listenId);
        int i17 = 0;
        hashMap.put("listenidtype", java.lang.Integer.valueOf((lp0Var == null || (d18 = lp0Var.d()) == null) ? 0 : d18.f34189e));
        hashMap.put("currcategorytype", java.lang.Integer.valueOf(o50Var != null ? o50Var.f30964n : 0));
        java.lang.String c17 = o50Var != null ? o50Var.c() : null;
        hashMap.put("currcategoryid", c17 != null ? c17 : "");
        if ((lp0Var == null || (d17 = lp0Var.d()) == null || d17.f34189e != 4) ? false : true) {
            bw5.v70 d27 = lp0Var.d();
            if (d27 != null && (g17 = d27.g()) != null) {
                i17 = g17.f26774w;
            }
            hashMap.put("listenidmediatype", java.lang.Integer.valueOf(i17));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0057, code lost:
    
        if (r8 == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.util.HashMap r7, java.lang.String r8, bw5.lp0 r9, bw5.o50 r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yl4.a.b(java.util.HashMap, java.lang.String, bw5.lp0, bw5.o50):void");
    }

    public static final void c(bw5.lp0 lp0Var, bw5.o50 o50Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pop_win_type", "audio_pop_win");
        b(hashMap, "", lp0Var, o50Var);
        hashMap.put("currscene", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECONNECT));
        hashMap.toString();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("tyt_already_floating_permission", null, hashMap, 5, false);
    }

    public static final void d(boolean z17, bw5.lp0 lp0Var, bw5.o50 o50Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pop_win_type", "audio_pop_win");
        hashMap.put("click_location", z17 ? "go_to_setting" : "cancel");
        b(hashMap, "tyt_floating_win_permission", lp0Var, o50Var);
        hashMap.put("currscene", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECONNECT));
        hashMap.toString();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
    }

    public static final void e(bw5.lp0 lp0Var, bw5.o50 o50Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pop_win_type", "audio_pop_win");
        b(hashMap, "tyt_floating_win_permission", lp0Var, o50Var);
        hashMap.put("currscene", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECONNECT));
        hashMap.toString();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_exp", null, hashMap, 5, false);
    }

    public static final void f(bw5.lp0 lp0Var, bw5.o50 o50Var) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("pop_win_type", "audio_pop_win");
        b(hashMap, "", lp0Var, o50Var);
        hashMap.put("currscene", java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECONNECT));
        hashMap.toString();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("tyt_set_floating_permission_success", null, hashMap, 5, false);
    }

    public static final void g(bw5.lp0 lp0Var, bw5.o50 o50Var, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (z17) {
            hashMap.put("lock_scr_play_status", 1);
        } else {
            hashMap.put("lock_scr_play_status", 2);
        }
        b(hashMap, "tyt_lock_scr_play", lp0Var, o50Var);
        a(hashMap, lp0Var, o50Var);
        hashMap.toString();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
    }
}
