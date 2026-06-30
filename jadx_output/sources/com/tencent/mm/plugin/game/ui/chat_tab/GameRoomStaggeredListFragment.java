package com.tencent.mm.plugin.game.ui.chat_tab;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment;", "Lcom/tencent/mm/plugin/game/ui/chat_tab/AbsGameRoomFragment;", "Lcom/tencent/mm/modelbase/u0;", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class GameRoomStaggeredListFragment extends com.tencent.mm.plugin.game.ui.chat_tab.AbsGameRoomFragment implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f141147f = 0;

    /* renamed from: d, reason: collision with root package name */
    public o43.d f141148d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f141149e;

    public final void j0(com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse getCanJoinChatroomResponse, com.tencent.mm.plugin.game.autogen.chatroom.Lbs lbs) {
        android.graphics.drawable.GradientDrawable gradientDrawable;
        if (getCanJoinChatroomResponse == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("StaggeredChatroom", "onSceneEnd rec Chatroom size  " + getCanJoinChatroomResponse.chatroom_info_list.size());
        java.util.LinkedList<com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo> linkedList = getCanJoinChatroomResponse.chatroom_info_list;
        int i17 = 0;
        if (linkedList == null || linkedList.isEmpty()) {
            throw null;
        }
        if (this.f141149e) {
            throw null;
        }
        android.view.View inflate = android.view.LayoutInflater.from(requireContext()).inflate(com.tencent.mm.R.layout.f488389rz, (android.view.ViewGroup) null, false);
        com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomNotice myChatroomNotice = d43.b.f226416i;
        if (myChatroomNotice != null) {
            kotlin.jvm.internal.o.d(inflate);
            if (!com.tencent.mm.sdk.platformtools.t8.L0(myChatroomNotice.content_list) && myChatroomNotice.bg_color != null) {
                android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.kth);
                com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.ktq);
                mMNeat7extView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(mMNeat7extView, new com.tencent.mm.pluginsdk.ui.span.y0(mMNeat7extView.getContext())));
                android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.ktb);
                float q17 = i65.a.q(requireContext());
                findViewById2.getLayoutParams().height = (int) (findViewById2.getLayoutParams().height * q17);
                findViewById2.getLayoutParams().width = (int) (findViewById2.getLayoutParams().width * q17);
                findViewById2.requestLayout();
                findViewById2.setOnClickListener(new com.tencent.mm.plugin.game.ui.chat_tab.g0(findViewById));
                java.lang.Integer l17 = s33.y.l(com.tencent.mm.ui.bk.C() ? myChatroomNotice.bg_color.dark_color : myChatroomNotice.bg_color.light_color);
                if (l17 != null && (gradientDrawable = (android.graphics.drawable.GradientDrawable) findViewById.getBackground()) != null) {
                    gradientDrawable.setColor(l17.intValue());
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment", "handleGamePermission", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomNotice;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/game/ui/chat_tab/GameRoomStaggeredListFragment", "handleGamePermission", "(Lcom/tencent/mm/plugin/game/autogen/chatroom/MyChatroomNotice;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                    java.util.Iterator<com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock> it = myChatroomNotice.content_list.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.game.autogen.chatroom.ContentBlock next = it.next();
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(next.content)) {
                            com.tencent.mm.plugin.game.autogen.chatroom.Color color = next.color;
                            java.lang.String str = color == null ? null : com.tencent.mm.ui.bk.C() ? color.dark_color : color.light_color;
                            if (str == null) {
                                str = "";
                            }
                            java.lang.Integer l18 = s33.y.l(str);
                            if (l18 != null) {
                                spannableStringBuilder.append((java.lang.CharSequence) next.content);
                                if (next.jump_info == null) {
                                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(l18.intValue()), i17, next.content.length() + i17, 33);
                                } else {
                                    spannableStringBuilder.setSpan(new com.tencent.mm.plugin.game.ui.chat_tab.h0(this, next, findViewById), i17, next.content.length() + i17, 33);
                                }
                                i17 = spannableStringBuilder.length();
                            }
                        }
                    }
                    mMNeat7extView.b(spannableStringBuilder);
                }
            }
        }
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m6w)).setText(getString(com.tencent.mm.R.string.fox));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.hyk);
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i65.a.b(requireContext(), 8);
            layoutParams2.topMargin = i65.a.b(requireContext(), 10);
            linearLayout.setLayoutParams(layoutParams);
        }
        o43.d dVar = this.f141148d;
        kotlin.jvm.internal.o.d(dVar);
        dVar.f342851b.addHeaderView(inflate);
        this.f141149e = true;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.bhj, viewGroup, false);
        int i17 = com.tencent.mm.R.id.hkx;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.hkx);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.f485499hw2;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.tencent.mm.R.id.f485499hw2);
            if (linearLayout != null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
                com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView = (com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView) x4.b.a(inflate, com.tencent.mm.R.id.m8x);
                if (mRecyclerView != null) {
                    this.f141148d = new o43.d(frameLayout, imageView, linearLayout, frameLayout, mRecyclerView);
                    kotlin.jvm.internal.o.f(frameLayout, "getRoot(...)");
                    return frameLayout;
                }
                i17 = com.tencent.mm.R.id.m8x;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        gm0.j1.d().q(4631, this);
        this.f141148d = null;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        throw null;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var != null && m1Var.getType() == 4631 && i17 == 0 && i18 == 0) {
            com.tencent.mm.modelbase.o oVar = ((v33.i) m1Var).f433118e;
            com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse getCanJoinChatroomResponse = (com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse) oVar.f70711b.f70700a;
            j0(getCanJoinChatroomResponse, ((com.tencent.mm.plugin.game.autogen.chatroom.GetCanJoinChatroomRequest) oVar.f70710a.f70684a).lbs_info);
            if (getCanJoinChatroomResponse != null) {
                com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent = new com.tencent.mm.autogen.events.GamePBCacheEvent();
                am.we weVar = gamePBCacheEvent.f54369g;
                weVar.f8278a = 2;
                weVar.f8279b = "cache_chatroom_recommend";
                try {
                    weVar.f8280c = getCanJoinChatroomResponse.toByteArray();
                } catch (java.io.IOException unused) {
                }
                gamePBCacheEvent.e();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        gm0.j1.d().a(4631, this);
        o43.d dVar = this.f141148d;
        kotlin.jvm.internal.o.d(dVar);
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = new androidx.recyclerview.widget.StaggeredGridLayoutManager(2, 1);
        com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView = dVar.f342851b;
        mRecyclerView.setLayoutManager(staggeredGridLayoutManager);
        mRecyclerView.N(new s53.f(i65.a.b(requireContext(), 8)));
        throw null;
    }
}
