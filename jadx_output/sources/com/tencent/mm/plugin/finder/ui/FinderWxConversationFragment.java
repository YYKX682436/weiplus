package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderWxConversationFragment;", "Lcom/tencent/mm/plugin/finder/ui/FinderBaseConversationFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderWxConversationFragment extends com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment {
    public static final /* synthetic */ int E = 0;
    public final qb2.t C = new qb2.t();
    public final com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment$notificationListener$1 D;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment$notificationListener$1] */
    public FinderWxConversationFragment() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderWxSysNotificationEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment$notificationListener$1
            {
                this.__eventId = -562898023;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderWxSysNotificationEvent finderWxSysNotificationEvent) {
                com.tencent.mm.autogen.events.FinderWxSysNotificationEvent event = finderWxSysNotificationEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.td tdVar = event.f54340g;
                if (tdVar == null) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderBaseConversationFragment", "[notificationListener] brief:" + tdVar.f8000a + ", time:" + tdVar.f8001b + ", count:" + tdVar.f8002c);
                com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment finderWxConversationFragment = com.tencent.mm.plugin.finder.ui.FinderWxConversationFragment.this;
                qb2.t tVar = finderWxConversationFragment.C;
                tVar.field_unReadCount = tdVar.f8002c;
                tVar.field_updateTime = ((long) tdVar.f8001b) * 1000;
                tVar.field_readStatus = 0;
                tVar.field_digest = tdVar.f8000a;
                android.view.View view = finderWxConversationFragment.f206301h;
                if (view == null) {
                    return true;
                }
                view.post(new com.tencent.mm.plugin.finder.ui.sk(finderWxConversationFragment));
                return true;
            }
        };
    }

    public final void M0(boolean z17) {
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_PRIVATE_SYS_MSG_TIME_INT_SYNC, 0);
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_PRIVATE_SYS_MSG_BRIEF_STRING_SYNC, "");
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_WX_PRIVATE_SYS_MSG_UNREAD_COUNT_INT_SYNC;
        int r18 = c17.r(u3Var, 0);
        if (r17 > 0) {
            long j17 = r17 * 1000;
            qb2.t tVar = this.C;
            tVar.field_updateTime = j17;
            tVar.field_digest = v17;
            tVar.F1 = getString(com.tencent.mm.R.string.cqn);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str = tVar.F1;
            java.lang.String str2 = str != null ? str : "";
            ((ke0.e) xVar).getClass();
            tVar.E1 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2);
            tVar.field_unReadCount = r18;
            tVar.field_readStatus = 0;
            if (z17) {
                tVar.field_unReadCount = 0;
                gm0.j1.u().c().x(u3Var, 0);
            }
            android.view.View view = this.f206301h;
            if (view != null) {
                view.post(new com.tencent.mm.plugin.finder.ui.tk(this));
            }
        }
    }

    @Override // com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.o1.c(dv2.h.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == 1) {
            wn.a w07 = w0();
            kotlin.jvm.internal.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationAdapter");
            ((qb2.b0) w07).J("findersayhisessionholder");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        alive();
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment, com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        zy2.z8 S = ((c61.l7) i95.n0.c(c61.l7.class)).nk().S();
        android.content.Context context = getContext();
        ((com.tencent.mm.plugin.finder.extension.reddot.e1) S).h(context != null ? xy2.c.e(context) : null, zy2.y8.f477618n);
        dead();
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment, com.tencent.mm.chatting.BasePrivateMsgConvListFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_PRIVATE_SYS_MSG_TIME_INT_SYNC, 0);
        if ((w0() instanceof qb2.i0) && r17 > 0) {
            java.lang.String string = getString(com.tencent.mm.R.string.cqn);
            qb2.t tVar = this.C;
            tVar.F1 = string;
            tVar.field_sessionId = "finder_wx_system_message";
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str = tVar.F1;
            if (str == null) {
                str = "";
            }
            ((ke0.e) xVar).getClass();
            tVar.E1 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
            M0(false);
            wn.a w07 = w0();
            kotlin.jvm.internal.o.e(w07, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversationFirstFixAdapter");
            ((qb2.i0) w07).f361222t.add(tVar);
        }
        super.onViewCreated(view, bundle);
    }

    @Override // com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment, com.tencent.mm.chatting.BasePrivateMsgConvListFragment
    public wn.a t0() {
        android.os.Bundle arguments = getArguments();
        int i17 = arguments != null ? arguments.getInt("KEY_TALKER_TYPE", -1) : -1;
        android.os.Bundle arguments2 = getArguments();
        int i18 = arguments2 != null ? arguments2.getInt("KEY_TALKER_SCENE", -1) : -1;
        qb2.i0 i0Var = new qb2.i0(this);
        i0Var.f361177s = new qb2.l0(com.tencent.mm.plugin.finder.ui.pk.f129650d);
        i0Var.f361176r = new qb2.g0(this, new com.tencent.mm.plugin.finder.ui.qk(this), new com.tencent.mm.plugin.finder.ui.rk(this));
        i0Var.f361175q = i18;
        i0Var.f361174p = i17;
        return i0Var;
    }
}
