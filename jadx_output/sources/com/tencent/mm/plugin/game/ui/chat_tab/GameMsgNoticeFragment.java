package com.tencent.mm.plugin.game.ui.chat_tab;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment;", "Lcom/tencent/mm/plugin/game/ui/chat_tab/AbsGameRoomFragment;", "<init>", "()V", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GameMsgNoticeFragment extends com.tencent.mm.plugin.game.ui.chat_tab.AbsGameRoomFragment {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f141130s = 0;

    /* renamed from: e, reason: collision with root package name */
    public o43.a f141132e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout f141134g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView f141135h;

    /* renamed from: i, reason: collision with root package name */
    public g63.b f141136i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.e1 f141137m;

    /* renamed from: n, reason: collision with root package name */
    public int f141138n;

    /* renamed from: o, reason: collision with root package name */
    public int f141139o;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f141131d = "InteractiveMsg";

    /* renamed from: f, reason: collision with root package name */
    public boolean f141133f = true;

    /* renamed from: p, reason: collision with root package name */
    public int f141140p = 15;

    /* renamed from: q, reason: collision with root package name */
    public final int f141141q = 15;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f141142r = "";

    public final java.lang.String j0(java.lang.Integer num) {
        int intValue = num != null ? num.intValue() : 0;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (intValue > 0) {
            hashMap.put("RedDot", "1");
        } else {
            hashMap.put("RedDot", "2");
        }
        hashMap.put("TotalNum", java.lang.String.valueOf(intValue));
        java.lang.String b17 = com.tencent.mm.game.report.l.b(hashMap);
        kotlin.jvm.internal.o.f(b17, "genExtInfo(...)");
        return b17;
    }

    public final void l0(g63.b holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        x4.a aVar = holder.f293123g;
        kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.databinding.GamelifeConversationNormalItemBinding");
        a63.b bVar = (a63.b) aVar;
        android.view.View view = holder.itemView;
        view.setOnClickListener(new com.tencent.mm.plugin.game.ui.chat_tab.c0(view, this));
        bVar.f1739b.setImageResource(com.tencent.mm.R.raw.game_notify_bell);
        itemView.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
        bVar.f1740c.setText(com.tencent.mm.R.string.fny);
        android.widget.TextView textView = bVar.f1741d;
        textView.setVisibility(0);
        bVar.f1745h.setVisibility(8);
        bVar.f1744g.setVisibility(0);
        android.view.View view2 = bVar.f1742e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = bVar.f1743f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int Bi = ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Bi(2);
        holder.itemView.setTag(java.lang.Integer.valueOf(Bi));
        android.widget.ImageView imageView = bVar.f1748k;
        if (Bi > 0) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        com.tencent.mm.plugin.game.model.e1 e1Var = this.f141137m;
        com.tencent.mm.plugin.game.model.e1 e1Var2 = null;
        if (e1Var == null || e1Var.field_showType != 2) {
            ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.foq);
            android.database.Cursor i17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().i1(2);
            if (i17 != null) {
                if (i17.moveToFirst()) {
                    e1Var2 = new com.tencent.mm.plugin.game.model.e1();
                    e1Var2.convertFrom(i17);
                }
                i17.close();
            }
            if (e1Var2 != null) {
                e1Var2.t0();
                string = e1Var2.f140279d2.f140412c;
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    string = e1Var2.f140281f2.f140401b;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.flm);
                }
                int u17 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(2);
                if (u17 > 1) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fnz, java.lang.Integer.valueOf(u17), string);
                }
            }
            textView.setText(string);
        } else {
            e1Var.t0();
            com.tencent.mm.plugin.game.model.e1 e1Var3 = this.f141137m;
            if (e1Var3 == null) {
                kotlin.jvm.internal.o.o("messageByGameMsgId");
                throw null;
            }
            java.lang.String mDesc = e1Var3.f140279d2.f140412c;
            kotlin.jvm.internal.o.f(mDesc, "mText");
            if (com.tencent.mm.sdk.platformtools.t8.K0(mDesc)) {
                com.tencent.mm.plugin.game.model.e1 e1Var4 = this.f141137m;
                if (e1Var4 == null) {
                    kotlin.jvm.internal.o.o("messageByGameMsgId");
                    throw null;
                }
                mDesc = e1Var4.f140281f2.f140401b;
                kotlin.jvm.internal.o.f(mDesc, "mDesc");
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(mDesc)) {
                mDesc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.flm);
                kotlin.jvm.internal.o.f(mDesc, "getString(...)");
            }
            textView.setText(mDesc);
        }
        if (this.f141133f) {
            this.f141133f = false;
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 21, 2101, 2, 1, (int) e63.a.f249817a, j0(java.lang.Integer.valueOf(Bi)));
        }
    }

    public final void m0() {
        g63.b bVar = this.f141136i;
        if (bVar == null) {
            return;
        }
        if (bVar == null) {
            kotlin.jvm.internal.o.o("headerHolder");
            throw null;
        }
        x4.a aVar = bVar.f293123g;
        kotlin.jvm.internal.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.databinding.GamelifeConversationNormalItemBinding");
        ((a63.b) aVar).f1748k.setVisibility(0);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f141139o = bundle.getInt("fromScene", 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.bbl, viewGroup, false);
        int i17 = com.tencent.mm.R.id.dfk;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.dfk);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.gm_;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.gm_);
            if (frameLayout != null) {
                i17 = com.tencent.mm.R.id.gma;
                com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView = (com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView) x4.b.a(inflate, com.tencent.mm.R.id.gma);
                if (interactiveMsgMRecycleView != null) {
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.h8d);
                    if (imageView != null) {
                        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) x4.b.a(inflate, com.tencent.mm.R.id.ilk);
                        if (wxRefreshLayout != null) {
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.ilo);
                            if (textView != null) {
                                this.f141132e = new o43.a(linearLayout2, linearLayout, frameLayout, interactiveMsgMRecycleView, linearLayout2, imageView, wxRefreshLayout, textView);
                                a63.b a17 = a63.b.a(inflater, viewGroup, false);
                                android.widget.LinearLayout linearLayout3 = a17.f1738a;
                                kotlin.jvm.internal.o.f(linearLayout3, "getRoot(...)");
                                g63.b bVar = new g63.b(linearLayout3, a17);
                                this.f141136i = bVar;
                                android.view.View itemView = bVar.itemView;
                                kotlin.jvm.internal.o.f(itemView, "itemView");
                                this.f141138n = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(1);
                                g63.b bVar2 = this.f141136i;
                                if (bVar2 == null) {
                                    kotlin.jvm.internal.o.o("headerHolder");
                                    throw null;
                                }
                                l0(bVar2);
                                o43.a aVar = this.f141132e;
                                kotlin.jvm.internal.o.d(aVar);
                                android.view.View findViewById = aVar.f342838a.findViewById(com.tencent.mm.R.id.gma);
                                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                                com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView2 = (com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView) findViewById;
                                this.f141135h = interactiveMsgMRecycleView2;
                                interactiveMsgMRecycleView2.addHeaderView(itemView);
                                com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView3 = this.f141135h;
                                if (interactiveMsgMRecycleView3 == null) {
                                    kotlin.jvm.internal.o.o("gameInteractiveMsgView");
                                    throw null;
                                }
                                interactiveMsgMRecycleView3.setmContext(getContext());
                                com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView4 = this.f141135h;
                                if (interactiveMsgMRecycleView4 == null) {
                                    kotlin.jvm.internal.o.o("gameInteractiveMsgView");
                                    throw null;
                                }
                                interactiveMsgMRecycleView4.setmFromScene(this.f141139o);
                                com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView5 = this.f141135h;
                                if (interactiveMsgMRecycleView5 == null) {
                                    kotlin.jvm.internal.o.o("gameInteractiveMsgView");
                                    throw null;
                                }
                                interactiveMsgMRecycleView5.setFromMsgId(this.f141142r);
                                com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView6 = this.f141135h;
                                if (interactiveMsgMRecycleView6 == null) {
                                    kotlin.jvm.internal.o.o("gameInteractiveMsgView");
                                    throw null;
                                }
                                androidx.recyclerview.widget.f2 adapter = interactiveMsgMRecycleView6.getAdapter();
                                kotlin.jvm.internal.o.d(adapter);
                                if (adapter.getItemCount() <= 1) {
                                    o43.a aVar2 = this.f141132e;
                                    kotlin.jvm.internal.o.d(aVar2);
                                    aVar2.f342839b.setVisibility(0);
                                }
                                com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView7 = this.f141135h;
                                if (interactiveMsgMRecycleView7 == null) {
                                    kotlin.jvm.internal.o.o("gameInteractiveMsgView");
                                    throw null;
                                }
                                androidx.recyclerview.widget.f2 adapter2 = interactiveMsgMRecycleView7.getAdapter();
                                kotlin.jvm.internal.o.d(adapter2);
                                adapter2.registerAdapterDataObserver(new com.tencent.mm.plugin.game.ui.chat_tab.d0(this));
                                if (com.tencent.mm.ui.bk.C()) {
                                    o43.a aVar3 = this.f141132e;
                                    kotlin.jvm.internal.o.d(aVar3);
                                    ((android.widget.ImageView) aVar3.f342839b.findViewById(com.tencent.mm.R.id.h8d)).setImageResource(com.tencent.mm.R.drawable.c6g);
                                } else {
                                    o43.a aVar4 = this.f141132e;
                                    kotlin.jvm.internal.o.d(aVar4);
                                    ((android.widget.ImageView) aVar4.f342839b.findViewById(com.tencent.mm.R.id.h8d)).setImageResource(com.tencent.mm.R.raw.game_interactive_empty);
                                }
                                o43.a aVar5 = this.f141132e;
                                kotlin.jvm.internal.o.d(aVar5);
                                android.view.View findViewById2 = aVar5.f342838a.findViewById(com.tencent.mm.R.id.ilk);
                                kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                                com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = (com.tencent.mm.view.refreshLayout.WxRefreshLayout) findViewById2;
                                this.f141134g = wxRefreshLayout2;
                                mn5.a aVar6 = new mn5.a();
                                aVar6.f330191a = 0.5f;
                                aVar6.f330192b = 300;
                                aVar6.f330193c = true;
                                aVar6.f330195e = true;
                                aVar6.f330196f = true;
                                aVar6.f330197g = true;
                                aVar6.f330198h = false;
                                aVar6.f330199i = false;
                                aVar6.f330200j = true;
                                aVar6.f330201k = true;
                                aVar6.f330202l = true;
                                aVar6.f330203m = false;
                                aVar6.f330204n = false;
                                aVar6.f330205o = true;
                                aVar6.f330206p = false;
                                aVar6.f330207q = false;
                                wxRefreshLayout2.setCommonConfig(aVar6);
                                com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout3 = this.f141134g;
                                if (wxRefreshLayout3 == null) {
                                    kotlin.jvm.internal.o.o("refreshLayout");
                                    throw null;
                                }
                                wxRefreshLayout3.setOnSimpleAction(new com.tencent.mm.plugin.game.ui.chat_tab.b0(this));
                                o43.a aVar7 = this.f141132e;
                                kotlin.jvm.internal.o.d(aVar7);
                                android.widget.LinearLayout linearLayout4 = aVar7.f342838a;
                                kotlin.jvm.internal.o.f(linearLayout4, "getRoot(...)");
                                return linearLayout4;
                            }
                            i17 = com.tencent.mm.R.id.ilo;
                        } else {
                            i17 = com.tencent.mm.R.id.ilk;
                        }
                    } else {
                        i17 = com.tencent.mm.R.id.h8d;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (this.f141136i != null) {
            com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView = this.f141135h;
            if (interactiveMsgMRecycleView == null) {
                kotlin.jvm.internal.o.o("gameInteractiveMsgView");
                throw null;
            }
            android.os.Handler handler = interactiveMsgMRecycleView.f141502o2;
            if (handler != null) {
                java.lang.Runnable runnable = interactiveMsgMRecycleView.f141500m2;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                interactiveMsgMRecycleView.f141502o2 = null;
            }
        }
        super.onDestroyView();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("tab", "1");
        hashMap.put("newmsg", java.lang.String.valueOf(this.f141138n));
        com.tencent.mm.game.report.l.c(getContext(), 13, 1300, 0, 1, this.f141139o, com.tencent.mm.game.report.l.b(hashMap));
        this.f141138n = 0;
        g63.b bVar = this.f141136i;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("headerHolder");
            throw null;
        }
        l0(bVar);
        com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView interactiveMsgMRecycleView = this.f141135h;
        if (interactiveMsgMRecycleView == null) {
            kotlin.jvm.internal.o.o("gameInteractiveMsgView");
            throw null;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.ui.message.v(interactiveMsgMRecycleView));
    }
}
