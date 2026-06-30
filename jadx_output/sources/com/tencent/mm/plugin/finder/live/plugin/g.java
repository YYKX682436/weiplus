package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public abstract class g extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f112612p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f112613q;

    /* renamed from: r, reason: collision with root package name */
    public int f112614r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.nc f112615s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f112616t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f112617u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.view.ViewGroup vg6, qo0.c liveStatus) {
        super(vg6, liveStatus, null);
        kotlin.jvm.internal.o.g(vg6, "vg");
        kotlin.jvm.internal.o.g(liveStatus, "liveStatus");
        this.f112612p = kz5.c1.i(new jz5.l(16, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_shop)), new jz5.l(10, java.lang.Integer.valueOf(com.tencent.mm.R.raw.finder_icons_filled_link_mic)), new jz5.l(12, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_perspective)), new jz5.l(11, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_game_add)), new jz5.l(6, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_reward_new)), new jz5.l(2, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_live_vote)), new jz5.l(7, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icon_finder_post_lucky_money)), new jz5.l(3, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_live_screencast)), new jz5.l(5, java.lang.Integer.valueOf(com.tencent.mm.R.raw.finder_live_view_setting_icon)), new jz5.l(4, java.lang.Integer.valueOf(com.tencent.mm.R.raw.finder_icons_filled_link_mic)), new jz5.l(1, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_tool)), new jz5.l(8, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_live_music)));
        this.f112613q = kz5.c1.i(new jz5.l(16, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_shop)), new jz5.l(10, java.lang.Integer.valueOf(com.tencent.mm.R.raw.finder_icons_filled_link_mic)), new jz5.l(12, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_perspective)), new jz5.l(11, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_game_add)), new jz5.l(17, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_vr)), new jz5.l(6, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_reward_new)), new jz5.l(2, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_outlined_live_vote)), new jz5.l(15, java.lang.Integer.valueOf(com.tencent.mm.R.raw.finder_icons_filled_gift)), new jz5.l(20, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_share)), new jz5.l(14, java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_call_good)));
        int parseColor = android.graphics.Color.parseColor("#66404040");
        this.f112614r = parseColor;
        this.f112615s = new com.tencent.mm.plugin.finder.live.plugin.nc(parseColor);
        this.f112616t = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.b(this));
        this.f112617u = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.f(this));
    }

    public final void A1(r45.vm1 data, java.lang.Object file, boolean z17) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(file, "file");
        if (data.getInteger(1) == 1) {
            java.lang.String path = file instanceof org.libpag.PAGFile ? ((org.libpag.PAGFile) file).path() : file instanceof com.tencent.mm.rfx.RfxPagFile ? ((com.tencent.mm.rfx.RfxPagFile) file).path() : "";
            xt2.m t17 = t1(data.getInteger(0));
            if (t17 != null) {
                java.lang.String string = data.getString(2);
                t17.f456878g = path;
                t17.f456879h = string;
            }
            if (z17) {
                ((mm2.c1) P0(mm2.c1.class)).f328826j4.put(java.lang.Integer.valueOf(data.getInteger(0)), new jz5.l(data, file));
            }
        }
    }

    public final java.lang.String B1(java.lang.String rgba) {
        kotlin.jvm.internal.o.g(rgba, "rgba");
        char charAt = rgba.charAt(0);
        java.lang.String substring = rgba.substring(1, 3);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String substring2 = rgba.substring(3, 5);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        java.lang.String substring3 = rgba.substring(5, 7);
        kotlin.jvm.internal.o.f(substring3, "substring(...)");
        java.lang.String substring4 = rgba.substring(7, 9);
        kotlin.jvm.internal.o.f(substring4, "substring(...)");
        return charAt + substring4 + substring + substring2 + substring3;
    }

    public final xt2.m t1(int i17) {
        java.lang.Object obj = u1().get(java.lang.Integer.valueOf(i17));
        if (obj instanceof xt2.m) {
            return (xt2.m) obj;
        }
        return null;
    }

    public final java.util.HashMap u1() {
        return (java.util.HashMap) ((jz5.n) this.f112616t).getValue();
    }

    public abstract java.util.HashMap v1();

    public final java.lang.String w1(int i17) {
        java.lang.Object obj = u1().get(java.lang.Integer.valueOf(i17));
        xt2.m mVar = obj instanceof xt2.m ? (xt2.m) obj : null;
        if (mVar == null || mVar.m().getVisibility() != 0) {
            return null;
        }
        return mVar.f456879h;
    }

    public final boolean x1() {
        if (((mm2.c1) P0(mm2.c1.class)).R7()) {
            return this.f365323d.getContext().getResources().getConfiguration().orientation == 1;
        }
        return false;
    }

    public final boolean y1() {
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.getValue();
        if (cVar != null) {
            return (this.f365323d.getContext().getResources().getConfiguration().orientation == 1) && cVar.f454531a.size() > 1 && cVar.f454532b.height() < ((java.lang.Number) ((jz5.n) this.f112617u).getValue()).intValue();
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        java.util.Collection<xt2.m6> values = u1().values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        for (xt2.m6 m6Var : values) {
            xt2.m mVar = m6Var instanceof xt2.m ? (xt2.m) m6Var : null;
            if (mVar != null) {
                mVar.q();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z1(int i17) {
        java.lang.String str;
        int color;
        com.tencent.mm.plugin.finder.live.plugin.jc jcVar;
        xt2.m6 m6Var = (xt2.m6) u1().get(java.lang.Integer.valueOf(i17));
        if (m6Var == 0) {
            return;
        }
        android.view.View view = m6Var instanceof android.view.View ? (android.view.View) m6Var : null;
        if (view == null && (view = m6Var.f()) == null) {
            view = m6Var.j();
        }
        android.view.View view2 = view;
        android.view.View f17 = m6Var.f();
        if (view2 != null) {
            com.tencent.mm.plugin.finder.live.plugin.d dVar = new com.tencent.mm.plugin.finder.live.plugin.d(i17);
            com.tencent.mm.plugin.finder.live.plugin.e eVar = new com.tencent.mm.plugin.finder.live.plugin.e(i17);
            com.tencent.mm.plugin.finder.live.plugin.ic icVar = new com.tencent.mm.plugin.finder.live.plugin.ic(0.0f, 0.0f, 0.0f, 0L, 15, null);
            com.tencent.mm.plugin.finder.live.plugin.hc hcVar = new com.tencent.mm.plugin.finder.live.plugin.hc(0, 0, 3, null);
            com.tencent.mm.plugin.finder.live.plugin.nc ncVar = this.f112615s;
            ncVar.getClass();
            try {
                int i18 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("FinderLiveButtonEnhanceInteractionAnimator", "Starting enhance interaction animation for buttonType: " + i17, null);
                android.view.ViewParent parent = view2.getParent();
                while (parent instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                    parent = viewGroup.getParent();
                }
                android.graphics.drawable.Drawable background = f17 != null ? f17.getBackground() : null;
                color = background instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) background).getColor() : ncVar.f113608a;
                jcVar = new com.tencent.mm.plugin.finder.live.plugin.jc(view2.getScaleX(), view2.getScaleY(), background, color);
                str = "FinderLiveButtonEnhanceInteractionAnimator";
            } catch (java.lang.Exception e17) {
                e = e17;
                str = "FinderLiveButtonEnhanceInteractionAnimator";
            }
            try {
                android.animation.AnimatorSet c17 = ncVar.c(view2, f17, jcVar, icVar, hcVar);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                ncVar.d(f17, color);
                c17.addListener(new com.tencent.mm.plugin.finder.live.plugin.lc(ncVar, view2, f17, jcVar, i17, dVar, eVar));
                c17.start();
                com.tencent.mars.xlog.Log.i(str, "Animation started successfully for buttonType: " + i17, null);
            } catch (java.lang.Exception e18) {
                e = e18;
                int i19 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.e(str, "Error starting enhance interaction animation: " + e.getMessage(), e);
                eVar.invoke();
            }
        }
    }
}
