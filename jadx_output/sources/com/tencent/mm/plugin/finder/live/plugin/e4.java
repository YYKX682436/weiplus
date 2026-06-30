package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class e4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f112366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112367e;

    public e4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var, android.view.ViewGroup viewGroup) {
        this.f112366d = a5Var;
        this.f112367e = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        df2.w5 w5Var;
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f112366d;
        com.tencent.mm.plugin.finder.live.plugin.a5.u1(a5Var, false);
        df2.d6 d6Var = (df2.d6) a5Var.U0(df2.d6.class);
        if (d6Var != null) {
            android.content.Context context = this.f112367e.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.live.plugin.d4 d4Var = new com.tencent.mm.plugin.finder.live.plugin.d4(a5Var);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            df2.n5 n5Var = (df2.n5) d6Var.controller(df2.n5.class);
            linkedHashMap.put("switch_type", java.lang.Integer.valueOf((n5Var == null || !n5Var.f230834n) ? 0 : 1));
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Nj("live_anchor_gesture_features_switch", "view_exp", linkedHashMap);
            com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
            android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
            android.view.View view = y1Var.f212027f;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            y1Var.l(from.inflate(com.tencent.mm.R.layout.alw, (android.view.ViewGroup) view, false), new android.widget.FrameLayout.LayoutParams(-1, -1));
            y1Var.a();
            android.view.View view2 = y1Var.f212027f;
            view2.setPadding(view2.getPaddingLeft(), y1Var.f212027f.getPaddingTop(), y1Var.f212027f.getPaddingRight(), y1Var.f212027f.getPaddingBottom() + a5Var.f111798p0);
            y1Var.f212037s = new df2.x5(d4Var, d6Var);
            y1Var.f212027f.findViewById(com.tencent.mm.R.id.f483758bz2).setOnClickListener(new df2.y5(y1Var));
            sg2.a0 a0Var = sg2.a0.f407882a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(sg2.a0.f407884c);
            com.tencent.mars.xlog.Log.i("Finder.GestureEffectAnchorSettingController", "gestureInfoList size:" + arrayList.size());
            android.view.View rootView = y1Var.f212027f;
            kotlin.jvm.internal.o.f(rootView, "rootView");
            df2.w5 w5Var2 = new df2.w5(d6Var, rootView, arrayList);
            d6Var.f229945m = w5Var2;
            android.view.View view3 = w5Var2.f231660c;
            if (view3 != null) {
                view3.setOnClickListener(new df2.z5(y1Var));
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) y1Var.f212027f.findViewById(com.tencent.mm.R.id.d_0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(new df2.s5((r45.ir1) it.next()));
            }
            arrayList2.addAll(arrayList3);
            wxRecyclerView.setAdapter(new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.controller.GestureEffectAnchorSettingController$showSettingPanel$1$adapter$1
                @Override // in5.s
                public in5.r getItemConvert(int type) {
                    return new df2.q5();
                }
            }, arrayList2, false));
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(context, java.lang.Math.max(java.lang.Integer.min(arrayList2.size(), 3), 1)));
            com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) y1Var.f212027f.findViewById(com.tencent.mm.R.id.ntc);
            mMSwitchBtn.setCheck(df2.d6.f229944n.c(d6Var.getStore().getLiveRoomData()));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ((df2.s5) it6.next()).f231291e = mMSwitchBtn.f211363x;
            }
            if (mMSwitchBtn.f211363x && (w5Var = d6Var.f229945m) != null) {
                w5Var.b();
            }
            mMSwitchBtn.setSwitchListener(new df2.b6(d6Var, mMSwitchBtn, context, arrayList2, wxRecyclerView));
            y1Var.s();
        }
    }
}
