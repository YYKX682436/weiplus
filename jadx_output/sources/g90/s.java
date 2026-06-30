package g90;

@j95.b
/* loaded from: classes3.dex */
public final class s extends i95.w implements h90.v {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.storage.f9 f269755f;

    /* renamed from: h, reason: collision with root package name */
    public int f269757h;

    /* renamed from: i, reason: collision with root package name */
    public int f269758i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f269753d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f269754e = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f269756g = 1;

    public static final int Ai(g90.s sVar, com.tencent.mm.storage.f9 f9Var) {
        sVar.getClass();
        if (f9Var.J2()) {
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr = h90.a.f279671d;
            if (((g90.u) wVar).Ai(f9Var, 1) == 4) {
                return 1;
            }
        } else if (f9Var.isVideo()) {
            h90.w wVar2 = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr2 = h90.a.f279671d;
            if (((g90.u) wVar2).Ai(f9Var, 2) == 4) {
                return 1;
            }
        }
        return f9Var.A0() != 1 ? 1 : 2;
    }

    public static final boolean Bi(g90.s sVar, com.tencent.mm.storage.f9 f9Var) {
        sVar.getClass();
        if (f9Var.J2()) {
            java.lang.Number number = (java.lang.Number) ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).hj(f9Var).f302833d;
            if (number.intValue() == 6 || number.intValue() == 7 || number.intValue() == 5) {
                return true;
            }
        } else if (f9Var.isVideo()) {
            java.lang.Number number2 = (java.lang.Number) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(f9Var).f302833d;
            if (number2.intValue() == 6 || number2.intValue() == 7 || number2.intValue() == 5) {
                return true;
            }
        }
        return false;
    }

    public static final jz5.l wi(g90.s sVar, com.tencent.mm.storage.f9 f9Var) {
        boolean z17;
        t21.v2 v2Var;
        sVar.getClass();
        boolean z18 = false;
        if (f9Var != null) {
            if (f9Var.J2()) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                m11.b0 S1 = m11.b1.Di().S1(f9Var);
                if (S1 != null && S1.f322633a > 0) {
                    boolean j17 = S1.j();
                    if (j17) {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(S1.f322649q));
                        if (C1.f322633a > 0) {
                            java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(f9Var, bm5.f0.f22562g, C1.f322637e, "", "");
                            if (C1.k() && com.tencent.mm.vfs.w6.j(aj6)) {
                                z18 = true;
                            }
                        }
                    }
                    z17 = z18;
                    z18 = j17;
                }
            } else if (f9Var.isVideo()) {
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String z07 = f9Var.z0();
                ((vf0.y1) x1Var).getClass();
                t21.v2 h17 = t21.d3.h(z07);
                if (h17 != null) {
                    wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String str = h17.S;
                    ((vf0.y1) x1Var2).getClass();
                    v2Var = t21.d3.h(str);
                } else {
                    v2Var = null;
                }
                boolean z19 = v2Var != null;
                if (v2Var != null && com.tencent.mm.vfs.w6.j(((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(f9Var, false)) && v2Var.i()) {
                    z18 = true;
                }
                z17 = z18;
                z18 = z19;
            }
            return new jz5.l(java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
        }
        z17 = false;
        return new jz5.l(java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17));
    }

    public final boolean Di(long j17, java.lang.String str) {
        java.util.HashMap hashMap = this.f269753d;
        jz5.l lVar = (jz5.l) hashMap.get(str);
        if (lVar != null && j17 == ((java.lang.Number) lVar.f302833d).longValue() && c01.id.c() - ((java.lang.Number) lVar.f302834e).longValue() < 1000) {
            return false;
        }
        hashMap.put(str, new jz5.l(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(c01.id.c())));
        return true;
    }

    public final java.util.Map Ni(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String Q0;
        if (f9Var == null) {
            return kz5.q0.f314001d;
        }
        jz5.l[] lVarArr = new jz5.l[9];
        java.lang.String c17 = g95.e0.c(f9Var);
        java.lang.String str = "";
        if (c17 == null) {
            c17 = "";
        }
        jz5.l lVar = new jz5.l("receive_usename", c17);
        int i17 = 0;
        lVarArr[0] = lVar;
        java.lang.String d17 = g95.e0.d(f9Var);
        if (d17 == null) {
            d17 = "";
        }
        lVarArr[1] = new jz5.l("send_username", d17);
        if (f9Var.J2()) {
            i17 = 1;
        } else if (f9Var.isVideo()) {
            i17 = 2;
        }
        lVarArr[2] = new jz5.l("chat_pic_video_type", java.lang.Integer.valueOf(i17));
        lVarArr[3] = new jz5.l("chat_type", java.lang.Integer.valueOf(com.tencent.mm.storage.z3.R4(f9Var.Q0()) ? 2 : 1));
        if (com.tencent.mm.storage.z3.R4(f9Var.Q0()) && (Q0 = f9Var.Q0()) != null) {
            str = Q0;
        }
        lVarArr[4] = new jz5.l("chatroom_username", str);
        lVarArr[5] = new jz5.l("oper_user_type", java.lang.Integer.valueOf(f9Var.A0() != 1 ? 1 : 2));
        lVarArr[6] = new jz5.l("chat_visual_clean_status", 1);
        lVarArr[7] = new jz5.l("msgid", java.lang.Long.valueOf(f9Var.I0()));
        lVarArr[8] = new jz5.l("chat_username", f9Var.Q0());
        return kz5.c1.k(lVarArr);
    }

    public void Ri(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, java.lang.String viewId) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.a(this, f9Var, viewId, i17), "c2c_origin_auto_clean");
    }

    public void Ui(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, java.lang.String viewId) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        java.lang.String str = viewId + '@' + i17;
        long msgId = f9Var.getMsgId();
        jz5.l lVar = (jz5.l) this.f269754e.get(str);
        if ((lVar == null || msgId != ((java.lang.Number) lVar.f302833d).longValue() || ((java.lang.Boolean) lVar.f302834e).booleanValue()) ? false : true) {
            return;
        }
        long msgId2 = f9Var.getMsgId();
        java.util.HashMap hashMap = this.f269754e;
        jz5.l lVar2 = (jz5.l) hashMap.get(str);
        if (lVar2 == null || msgId2 != ((java.lang.Number) lVar2.f302833d).longValue()) {
            hashMap.put(str, new jz5.l(java.lang.Long.valueOf(msgId2), java.lang.Boolean.FALSE));
        } else {
            hashMap.put(str, new jz5.l(java.lang.Long.valueOf(msgId2), java.lang.Boolean.FALSE));
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.b(this, f9Var, viewId, i17), "c2c_origin_auto_clean");
    }

    public void Vi(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, java.lang.String viewId) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        java.lang.String str = viewId + '@' + i17;
        long msgId = f9Var.getMsgId();
        java.util.HashMap hashMap = this.f269754e;
        jz5.l lVar = (jz5.l) hashMap.get(str);
        if (lVar == null || msgId != ((java.lang.Number) lVar.f302833d).longValue()) {
            hashMap.put(str, new jz5.l(java.lang.Long.valueOf(msgId), java.lang.Boolean.TRUE));
        } else {
            hashMap.put(str, new jz5.l(java.lang.Long.valueOf(msgId), java.lang.Boolean.TRUE));
        }
    }

    public void Zi(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.c(this, f9Var, i17, i19, i18, i27), "c2c_origin_auto_clean");
    }

    public void aj(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19, java.util.ArrayList menuBtns) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(menuBtns, "menuBtns");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.d(this, f9Var, i17, i19, i18, menuBtns), "c2c_origin_auto_clean");
    }

    public void bj(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, int i18) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.f(this, f9Var, i17, i18), "c2c_origin_auto_clean");
    }

    public void cj(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, int i18, java.util.Map extraMap) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(extraMap, "extraMap");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        if (i18 != 2 || Di(f9Var.getMsgId(), "gallery_page_in_opentype_gesture")) {
            this.f269755f = f9Var;
            this.f269756g = i17;
            this.f269758i = i18;
            ((ku5.t0) ku5.t0.f312615d).h(new g90.g(this, f9Var, i17, i18, extraMap), "c2c_origin_auto_clean");
        }
    }

    public void fj(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19, yz5.l lVar) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        this.f269755f = f9Var;
        this.f269756g = i17;
        this.f269757h = i18;
        this.f269758i = i19;
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Zj(activity, 50183);
        cy1.a aVar2 = (cy1.a) aVar.ik(activity, 12, 32337);
        aVar2.dk(activity, "ChatPicVideoPage");
        aVar2.Ai(activity, new g90.h(this, lVar));
    }

    public void hj(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, int i18, java.util.Map extraMap) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(extraMap, "extraMap");
        if (f9Var == null || f9Var.getMsgId() <= 0 || !Di(f9Var.getMsgId(), "gallery_page_item_click")) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.i(this, f9Var, i17, i18, extraMap), "c2c_origin_auto_clean");
    }

    public void ij(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19, java.util.Map extraMap) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(extraMap, "extraMap");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        if (i19 != 2 || Di(f9Var.getMsgId(), "gallery_page_in_opentype_gesture")) {
            extraMap.toString();
            this.f269756g = i17;
            this.f269758i = i19;
            this.f269757h = i18;
            ((ku5.t0) ku5.t0.f312615d).h(new g90.j(this, f9Var, i17, i19, i18, extraMap), "c2c_origin_auto_clean");
        }
    }

    public void mj(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.k(this, f9Var, i17, i18, z17), "c2c_origin_auto_clean");
    }

    public void nj(com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19) {
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.m(this, f9Var, i17, i18, i19), "c2c_origin_auto_clean");
    }

    public void oj(int i17) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sys_album_pic_action_sheet", "view_clk", kz5.c1.k(new jz5.l("chat_visual_clean_status", 1), new jz5.l("sys_album_pic_action_sheet_opt", java.lang.Integer.valueOf(i17))), 32337);
    }

    public void pj() {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("sys_album_pic_action_sheet", "view_exp", kz5.b1.e(new jz5.l("chat_visual_clean_status", 1)), 32337);
    }

    public void qj(boolean z17, boolean z18) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("original_clean_auto_btn_type", java.lang.Integer.valueOf(z17 ? 1 : 2));
        lVarArr[1] = new jz5.l("set_from_scene", java.lang.Integer.valueOf(z18 ? 2 : 1));
        ((cy1.a) rVar).Hj("original_clean_auto_btn", "view_clk", kz5.c1.k(lVarArr), 32337);
    }

    public void rj(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, java.lang.String viewId, int i18) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(viewId, "viewId");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.n(this, f9Var, viewId, i17, i18), "c2c_origin_auto_clean");
    }

    public void sj(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.o(this, f9Var, i17, i18, i19), "c2c_origin_auto_clean");
    }

    public void tj(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, float f17, float f18) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.p(this, f9Var, i17, f17, f18), "c2c_origin_auto_clean");
    }

    public void uj(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.q(this, f9Var, i17, i18, i19), "c2c_origin_auto_clean");
    }

    public void vj(android.app.Activity activity, com.tencent.mm.storage.f9 f9Var, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.r(this, f9Var, i17, i18, i19), "c2c_origin_auto_clean");
    }

    public void wj(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("view_original_videopic", "view_clk", Ni(f9Var), 32337);
    }

    public void xj(com.tencent.mm.storage.f9 f9Var, boolean z17, int i17) {
        if (f9Var == null || f9Var.getMsgId() <= 0) {
            return;
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.util.HashMap i18 = kz5.c1.i(new jz5.l("is_success", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("switch_fail_reson", java.lang.Integer.valueOf(i17)));
        i18.putAll(Ni(f9Var));
        ((cy1.a) rVar).Ej("chat_visual_switch_sys", i18, 32337);
    }
}
