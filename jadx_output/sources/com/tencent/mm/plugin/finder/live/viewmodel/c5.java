package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class c5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f116972d;

    public c5(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var) {
        this.f116972d = r5Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f116972d.f117360o.size();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x00b3. Please report as an issue. */
    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.live.viewmodel.d5 holder = (com.tencent.mm.plugin.finder.live.viewmodel.d5) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f116972d;
        java.lang.Object obj = r5Var.f117360o.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.plugin.finder.live.viewmodel.c6 c6Var = (com.tencent.mm.plugin.finder.live.viewmodel.c6) obj;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f117028e;
        weImageView.setRotationY(0.0f);
        holder.f117033m = c6Var;
        android.content.Context O6 = r5Var.O6();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = O6 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) O6 : null;
        android.view.View view = holder.f117030g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        weImageView.setIconColor(r5Var.O6().getResources().getColor(com.tencent.mm.R.color.aby));
        int color = r5Var.O6().getResources().getColor(com.tencent.mm.R.color.aby);
        android.widget.TextView textView3 = holder.f117029f;
        textView3.setTextColor(color);
        int i18 = c6Var.f116973a;
        if (i18 == 1) {
            textView = textView3;
            weImageView.setImageDrawable(weImageView.getContext().getResources().getDrawable(com.tencent.mm.R.raw.video_circle_filled));
            weImageView.setIconColor(r5Var.O6().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
            textView.setText(weImageView.getContext().getResources().getString(com.tencent.mm.R.string.f491426d21));
            r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) r5Var.business(mm2.g1.class)).f329071i).getValue();
            r45.z53 z53Var = n73Var != null ? (r45.z53) n73Var.getCustom(1) : null;
            com.tencent.mm.plugin.finder.assist.b3.f102022a.o(r5Var.getStore().getLiveRoomData(), 1, 2 - (z53Var != null ? z53Var.getInteger(13) : 0), z53Var != null ? z53Var.getString(0) : null);
        } else if (i18 == 2) {
            textView = textView3;
            weImageView.setImageDrawable(weImageView.getContext().getResources().getDrawable(com.tencent.mm.R.raw.game_machine_plus_filled));
            weImageView.setIconColor(r5Var.O6().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
            textView.setText(weImageView.getContext().getResources().getString(com.tencent.mm.R.string.f491755e50));
        } else if (i18 == 4) {
            textView = textView3;
            ll2.e eVar = ll2.e.f319133a;
            ll2.e.l(eVar, appCompatActivity, "startlive.bottom.lottery", holder.f117030g, null, null, 24, null);
            eVar.j("startlive.bottom.lottery", false);
            weImageView.setImageDrawable(weImageView.getContext().getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_prize, null));
            textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.nsb));
        } else if (i18 == 5) {
            textView = textView3;
            weImageView.setImageDrawable(weImageView.getContext().getResources().getDrawable(com.tencent.mm.R.raw.icons_filled_live_notice, null));
            textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.e8o));
            android.view.View view2 = holder.f117030g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (i18 != 6) {
            switch (i18) {
                case 11:
                    textView = textView3;
                    weImageView.setImageDrawable(weImageView.getContext().getResources().getDrawable(com.tencent.mm.R.raw.rectangle_4_filled));
                    textView.setText(weImageView.getContext().getResources().getString(com.tencent.mm.R.string.m0j));
                    android.content.Context O62 = r5Var.O6();
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(O62 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    com.tencent.mm.plugin.finder.live.viewmodel.s5 s5Var = (com.tencent.mm.plugin.finder.live.viewmodel.s5) zVar.a((androidx.appcompat.app.AppCompatActivity) O62).a(com.tencent.mm.plugin.finder.live.viewmodel.s5.class);
                    android.view.View view3 = holder.f117030g;
                    kotlin.jvm.internal.o.f(view3, "<get-redDot>(...)");
                    s5Var.getClass();
                    pk2.o9 o9Var = s5Var.f117394d;
                    if (o9Var != null) {
                        pk2.v9 v9Var = new pk2.v9(o9Var, view3);
                        pk2.j9 j9Var = o9Var.f356084g;
                        if (j9Var != null) {
                            pk2.o9 o9Var2 = j9Var.f355893i;
                            o9Var2.f356086h = v9Var;
                            if (((yf2.m1) o9Var2.e(yf2.m1.class)) != null) {
                                pk2.t9 t9Var = pk2.t9.f356269a;
                                com.tencent.mm.plugin.finder.live.widget.z60 z60Var = (com.tencent.mm.plugin.finder.live.widget.z60) ((jz5.n) j9Var.f355892h).getValue();
                                java.util.List menuConfigs = j9Var.f355891g;
                                com.tencent.mm.ui.MMActivity context = o9Var2.f356078d;
                                kotlin.jvm.internal.o.g(context, "context");
                                kotlin.jvm.internal.o.g(menuConfigs, "menuConfigs");
                                ((java.util.ArrayList) menuConfigs).clear();
                                kz5.p0 p0Var = kz5.p0.f313996d;
                                java.lang.String string = context.getString(com.tencent.mm.R.string.ozc);
                                kotlin.jvm.internal.o.f(string, "getString(...)");
                                t9Var.a(menuConfigs, v9Var, 0, p0Var, z60Var, string);
                                java.util.List i19 = kz5.c0.i(new pk2.o4(o9Var2, 1), new pk2.u1(o9Var2, 1), new pk2.d1(o9Var2, 1), new pk2.p4(o9Var2, 1));
                                java.lang.String string2 = context.getString(com.tencent.mm.R.string.f493762oz0);
                                kotlin.jvm.internal.o.f(string2, "getString(...)");
                                t9Var.a(menuConfigs, v9Var, 1, i19, null, string2);
                                java.util.List i27 = kz5.c0.i(new pk2.y1(o9Var2, 1), new pk2.l2(o9Var2, 1), new pk2.s1(o9Var2, 1), new pk2.t1(o9Var2, 1));
                                java.lang.String string3 = context.getString(com.tencent.mm.R.string.f493764oz2);
                                kotlin.jvm.internal.o.f(string3, "getString(...)");
                                t9Var.a(menuConfigs, v9Var, 2, i27, null, string3);
                                java.util.List i28 = kz5.c0.i(new pk2.g0(o9Var2, 1), new pk2.w2(o9Var2, 1), new pk2.i4(o9Var2, 1), new pk2.d3(o9Var2, 1), new pk2.m2(o9Var2, 1), new pk2.p2(o9Var2, 1), new pk2.z0(o9Var2, 1), new pk2.u4(o9Var2, 1), new pk2.e3(o9Var2, 1), new pk2.r2(o9Var2, 1));
                                java.lang.String string4 = context.getString(com.tencent.mm.R.string.f493767oz5);
                                kotlin.jvm.internal.o.f(string4, "getString(...)");
                                t9Var.a(menuConfigs, v9Var, 3, i28, null, string4);
                                java.util.List i29 = kz5.c0.i(new pk2.x1(o9Var2, 1), new pk2.c3(o9Var2, 1), new pk2.e0(o9Var2, 1), new pk2.c1(o9Var2, 1));
                                java.lang.String string5 = context.getString(com.tencent.mm.R.string.ozg);
                                kotlin.jvm.internal.o.f(string5, "getString(...)");
                                t9Var.a(menuConfigs, v9Var, 4, i29, null, string5);
                                v9Var.m();
                                v9Var.m();
                            }
                            pk2.p7 p7Var = j9Var.f355888d;
                            if (p7Var != null && p7Var.c().e()) {
                                j9Var.c(null);
                                break;
                            }
                        }
                    }
                    break;
                case 12:
                    textView2 = textView3;
                    ll2.e eVar2 = ll2.e.f319133a;
                    ll2.e.l(eVar2, appCompatActivity, "startlive.bottom.videosetting.switchcam", holder.f117030g, null, null, 24, null);
                    eVar2.j("startlive.bottom.videosetting.switchcam", false);
                    weImageView.setImageDrawable(weImageView.getContext().getResources().getDrawable(com.tencent.mm.R.raw.camera_transfer_filled));
                    textView2.setText(textView2.getContext().getResources().getString(com.tencent.mm.R.string.osl));
                    textView = textView2;
                    break;
                case 13:
                    ll2.e eVar3 = ll2.e.f319133a;
                    textView2 = textView3;
                    ll2.e.l(eVar3, appCompatActivity, "startlive.bottom.videosetting.beauty", holder.f117030g, null, null, 24, null);
                    eVar3.j("startlive.bottom.videosetting.beauty", false);
                    weImageView.setImageDrawable(weImageView.getContext().getResources().getDrawable(com.tencent.mm.R.raw.beauty_filled));
                    textView2.setText(textView2.getContext().getResources().getString(com.tencent.mm.R.string.otq));
                    textView = textView2;
                    break;
                case 14:
                    weImageView.setImageDrawable(weImageView.getContext().getResources().getDrawable(com.tencent.mm.R.raw.rectangle_4_filled));
                    textView3.setText(weImageView.getContext().getResources().getString(com.tencent.mm.R.string.m0j));
                    android.view.View view4 = holder.f117030g;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/FinderLivePostCameraOptPanelUIC$BeforeOptViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                default:
                    textView = textView3;
                    break;
            }
        } else {
            textView = textView3;
            if (zl2.r4.f473950a.n2((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) r5Var.getStore().business(mm2.g1.class)).f329068f).getValue())) {
                ll2.e eVar4 = ll2.e.f319133a;
                ll2.e.l(eVar4, appCompatActivity, r5Var.h7(), holder.f117030g, null, null, 24, null);
                if (!r5Var.a()) {
                    eVar4.j(r5Var.h7(), false);
                }
            }
            android.content.Context context2 = textView.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            jz5.l g76 = r5Var.g7(context2, true);
            java.lang.String str = (java.lang.String) g76.f302833d;
            weImageView.setImageDrawable(weImageView.getContext().getResources().getDrawable(((java.lang.Number) g76.f302834e).intValue()));
            weImageView.setIconColor(r5Var.O6().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
            textView.setText(str);
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.w4(r5Var, i17, holder));
        int dimensionPixelSize = r5Var.O6().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj);
        android.widget.RelativeLayout relativeLayout = holder.f117027d;
        android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        relativeLayout.setLayoutParams(layoutParams);
        holder.itemView.setTag(com.tencent.mm.R.id.f484411e64, textView.getText());
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.eee, null);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.live.viewmodel.d5(this.f116972d, inflate);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.finder.live.viewmodel.d5 holder = (com.tencent.mm.plugin.finder.live.viewmodel.d5) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        com.tencent.mm.plugin.finder.live.viewmodel.c6 c6Var = holder.f117033m;
        if (c6Var == null || 11 != c6Var.f116973a) {
            return;
        }
        holder.f117027d.postDelayed(new com.tencent.mm.plugin.finder.live.viewmodel.x4(this, holder, c6Var), 500L);
    }
}
