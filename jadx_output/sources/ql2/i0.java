package ql2;

/* loaded from: classes10.dex */
public final class i0 extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public r45.g92 f364520c;

    /* renamed from: d, reason: collision with root package name */
    public int f364521d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f364522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ql2.j0 f364523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, ql2.j0 j0Var) {
        super(str);
        this.f364523f = j0Var;
        this.f364521d = 1;
    }

    @Override // bi4.o0
    public boolean b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        r45.g92 g92Var = this.f364520c;
        if (g92Var == null) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        boolean b17 = kotlin.jvm.internal.o.b(g92Var.getString(1), xy2.c.e(context));
        intent.putExtra("finder_username", g92Var.getString(1));
        ya2.e1 e1Var = ya2.e1.f460472a;
        if (b17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.x(context, intent, 20, 2);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 32, intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.w(context, intent);
        }
        return true;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        boolean z17;
        kotlin.jvm.internal.o.g(context, "context");
        pj4.j0 j0Var = this.f21074b;
        if (j0Var == null || !kotlin.jvm.internal.o.b(j0Var.f355139d, "2")) {
            return false;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(j0Var.f355141f, "finderLive", null);
        if (d17 != null) {
            r45.g92 l17 = zy2.d5.l("", d17);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            long Z = pm0.v.Z(l17.getString(2));
            long Z2 = pm0.v.Z(l17.getString(0));
            java.lang.String string = l17.getString(1);
            ml2.x1 x1Var = ml2.x1.f328207n;
            ml2.q1 q1Var = ml2.q1.f327812e;
            zy2.zb.Ng((zy2.zb) c17, Z, Z2, null, string, -1L, 0L, x1Var, "temp_16", null, 0, null, 768, null);
            m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("share_scene", java.lang.String.valueOf(l17.getInteger(44)));
            z17 = true;
            lVarArr[1] = new jz5.l("liveid", java.lang.String.valueOf(l17.getString(0)));
            java.lang.String string2 = l17.getString(2);
            if (string2 == null) {
                string2 = "";
            }
            lVarArr[2] = new jz5.l("feedid", string2);
            ((b92.y0) i0Var).Bi(false, kz5.c1.i(lVarArr));
            if (com.tencent.mm.sdk.platformtools.t8.D0(xy2.c.e(context), l17.getString(1))) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_PARAMS_SOURCE_TYPE", l17.getInteger(15));
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                long Z3 = pm0.v.Z(l17.getString(2));
                java.lang.Long valueOf = java.lang.Long.valueOf(pm0.v.Z(l17.getString(0)));
                java.lang.String string3 = l17.getString(12);
                ((com.tencent.mm.feature.finder.live.v4) w0Var).oj(intent, context2, Z3, valueOf, string3 == null ? "" : string3, l17.getString(4), "", "", "");
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                java.lang.String string4 = l17.getString(16);
                if (string4 == null) {
                    string4 = "";
                }
                intent2.putExtra("key_enter_live_param_ecsource", string4);
                int i17 = qs5.z.f366478a;
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 3);
                r45.m84 m84Var = new r45.m84();
                m84Var.set(0, java.lang.Long.valueOf(pm0.v.Z(l17.getString(2))));
                m84Var.set(1, java.lang.Long.valueOf(pm0.v.Z(l17.getString(0))));
                java.lang.String string5 = l17.getString(12);
                if (string5 == null) {
                    string5 = "";
                }
                m84Var.set(2, string5);
                java.lang.String string6 = l17.getString(1);
                if (string6 == null) {
                    string6 = "";
                }
                m84Var.set(3, string6);
                m84Var.set(4, "");
                m84Var.set(5, l17.getString(4));
                m84Var.set(6, null);
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, "");
                wk0Var.set(1, "");
                wk0Var.set(3, -1);
                wk0Var.set(4, -1);
                wk0Var.set(5, 1);
                ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                ((vd2.f1) e0Var).Ri(context3, intent2, m84Var, true, wk0Var, null);
            }
        } else {
            z17 = true;
        }
        return z17;
    }

    @Override // bi4.o0
    public java.lang.CharSequence f() {
        r45.g92 g92Var = this.f364520c;
        java.lang.String string = g92Var != null ? g92Var.getString(3) : null;
        return string == null ? "" : string;
    }

    @Override // bi4.o0
    public java.lang.String h() {
        r45.g92 g92Var = this.f364520c;
        java.lang.String string = g92Var != null ? g92Var.getString(2) : null;
        return string == null ? "" : string;
    }

    @Override // bi4.o0
    public java.lang.CharSequence i() {
        r45.g92 g92Var = this.f364520c;
        java.lang.String string = g92Var != null ? g92Var.getString(4) : null;
        return string == null ? "" : string;
    }

    @Override // bi4.o0
    public boolean j() {
        return true;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        java.util.Map d17;
        super.m(str, j0Var);
        this.f364521d = 1;
        if (j0Var != null && (d17 = com.tencent.mm.sdk.platformtools.aa.d(j0Var.f355141f, "finderLive", null)) != null) {
            this.f364520c = zy2.d5.l("", d17);
        }
        s();
        r45.g92 g92Var = this.f364520c;
        if (g92Var != null) {
            r(this.f364520c, g92Var.getInteger(13));
        }
    }

    @Override // bi4.o0
    public void n() {
        this.f364520c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bi4.o0
    public boolean o(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag("Finder.TextStatusProvider");
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        container.removeAllViews();
        container.addView(imageView);
        r45.g92 g92Var = this.f364520c;
        com.tencent.mm.plugin.finder.storage.y90 y90Var = null;
        java.lang.Object[] objArr = 0;
        java.lang.String string = g92Var != null ? g92Var.getString(11) : null;
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.a().c(new mn2.n(string, y90Var, 2, objArr == true ? 1 : 0), imageView, g1Var.h(mn2.f1.f329957h));
        return true;
    }

    @Override // bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        s();
        android.widget.ImageView imageView = new android.widget.ImageView(container.getContext());
        t(imageView);
        container.addView(imageView);
        container.setVisibility(0);
        this.f364522e = new java.lang.ref.WeakReference(imageView);
        return true;
    }

    @Override // bi4.o0
    public boolean q(android.widget.FrameLayout container) {
        kotlin.jvm.internal.o.g(container, "container");
        ql2.j0 j0Var = this.f364523f;
        if (!j0Var.f364526e) {
            return true;
        }
        j0Var.f364526e = false;
        r45.g92 g92Var = this.f364520c;
        java.lang.String string = g92Var != null ? g92Var.getString(5) : null;
        if (string == null || r26.n0.N(string)) {
            return false;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag("Finder.TextStatusProvider");
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
            imageView.setTag("Finder.TextStatusProvider");
            container.removeAllViews();
            container.addView(imageView);
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.post(new ql2.h0(string, imageView));
        return true;
    }

    public final void r(r45.g92 g92Var, int i17) {
        if (g92Var != null) {
            p52.c cVar = p52.h.f352016a;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = p52.h.B;
            concurrentHashMap.clear();
            ml2.q1 q1Var = ml2.q1.f327812e;
            jz5.l[] lVarArr = new jz5.l[9];
            lVarArr[0] = new jz5.l("feed_id", g92Var.getString(2));
            lVarArr[1] = new jz5.l("live_id", g92Var.getString(0));
            lVarArr[2] = new jz5.l("comment_scene", "temp_16");
            lVarArr[3] = new jz5.l("finder_username", g92Var.getString(1));
            java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
            if (Ri == null) {
                Ri = "";
            }
            lVarArr[4] = new jz5.l("behaviour_session_id", Ri);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            lVarArr[5] = new jz5.l("finder_context_id", b52.b.b());
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            lVarArr[6] = new jz5.l("finder_tab_context_id", b52.b.c());
            lVarArr[7] = new jz5.l("session_buffer", "");
            lVarArr[8] = new jz5.l("share_scene", java.lang.Integer.valueOf(g92Var.getInteger(44)));
            concurrentHashMap.putAll(kz5.c1.k(lVarArr));
        }
        if (i17 == 1) {
            p52.c cVar2 = p52.h.f352016a;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = p52.h.B;
            ml2.v1 v1Var = ml2.v1.f328140e;
            concurrentHashMap2.put("live_enter_status", 1L);
            return;
        }
        p52.c cVar3 = p52.h.f352016a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = p52.h.B;
        ml2.v1 v1Var2 = ml2.v1.f328140e;
        concurrentHashMap3.put("live_enter_status", 2L);
    }

    public final void s() {
        java.lang.String string;
        r45.g92 g92Var = this.f364520c;
        if (g92Var == null || (string = g92Var.getString(0)) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.u9((s40.w0) c17, com.tencent.mm.sdk.platformtools.t8.E1(string), false, null, new ql2.e0(this), 0, null, null, null, 246, null);
    }

    public final void t(android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawable;
        if (this.f364521d == 2) {
            drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.finder_live_icon);
            com.tencent.mm.ui.uk.f(drawable, -1);
        } else {
            drawable = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.raw.finder_live_icon);
        }
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }
}
