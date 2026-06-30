package yl2;

/* loaded from: classes3.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f463064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f463065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f463066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.h0 h0Var, yl2.g1 g1Var) {
        super(2, continuation);
        this.f463064d = hVar;
        this.f463065e = h0Var;
        this.f463066f = g1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yl2.r0(this.f463064d, continuation, this.f463065e, this.f463066f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yl2.r0 r0Var = (yl2.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        java.lang.String string;
        r45.t62 t62Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.j01 j01Var = (r45.j01) ((xg2.i) this.f463064d).f454393b;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "result success");
        java.lang.String str = "";
        this.f463065e.f310123d = new yl2.k(0, "", j01Var);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = j01Var.R;
        if (linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                java.util.LinkedList list = ((r45.j32) it.next()).getList(0);
                if (list != null) {
                    if (!(!list.isEmpty())) {
                        list = null;
                    }
                    if (list != null) {
                        linkedList.addAll(list);
                    }
                }
            }
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_RECOMMEND_SWITCH_SETTING_BOOLEAN_SYNC;
        r45.ud2 ud2Var = j01Var.E;
        c17.x(u3Var, java.lang.Boolean.valueOf(ud2Var != null ? ud2Var.getBoolean(0) : false));
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_RECOMMEND_CONFIG_STRING_SYNC;
        r45.ud2 ud2Var2 = j01Var.E;
        java.lang.String l17 = (ud2Var2 == null || (t62Var = (r45.t62) ud2Var2.getCustom(1)) == null) ? null : com.tencent.mm.sdk.platformtools.t8.l(t62Var.toByteArray());
        if (l17 == null) {
            l17 = "";
        }
        c18.x(u3Var2, l17);
        com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_HAS_SING_SONG_ABILITY_SETTING_BOOLEAN_SYNC;
        r45.dc6 dc6Var = j01Var.F;
        c19.x(u3Var3, java.lang.Boolean.valueOf(dc6Var != null ? dc6Var.getBoolean(2) : false));
        com.tencent.mm.storage.n3 c27 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var4 = com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_TEST_LIVE_GUIDE_LIMIT_INT_SYNC;
        r45.v25 v25Var = j01Var.K;
        c27.x(u3Var4, new java.lang.Integer(v25Var != null ? v25Var.getInteger(5) : 0));
        r45.bw4 bw4Var = j01Var.L1;
        if (bw4Var != null) {
            z17 = bw4Var.getBoolean(1);
        } else {
            r45.dc6 dc6Var2 = j01Var.F;
            z17 = dc6Var2 != null ? dc6Var2.getBoolean(3) : false;
        }
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        java.util.List list2 = com.tencent.mm.plugin.finder.feed.model.i1.f107933d;
        list2.clear();
        list2.addAll(linkedList);
        com.tencent.mm.storage.n3 c28 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var5 = com.tencent.mm.storage.u3.USERINFO_HELP_AND_FEEDBACK_ENTRY_URL_STRING_SYNC;
        r45.jq1 jq1Var = j01Var.H;
        if (jq1Var != null && (string = jq1Var.getString(1)) != null) {
            str = string;
        }
        c28.x(u3Var5, str);
        com.tencent.mm.storage.n3 c29 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var6 = com.tencent.mm.storage.u3.USERINFO_HELP_AND_FEEDBACK_ENTRY_ENABLED_BOOLEAN_SYNC;
        r45.jq1 jq1Var2 = j01Var.H;
        c29.x(u3Var6, java.lang.Boolean.valueOf(jq1Var2 != null ? jq1Var2.getBoolean(0) : false));
        com.tencent.mm.storage.n3 c37 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var7 = com.tencent.mm.storage.u3.USERINFO_SENSITIVE_WORDS_LIMIT_INT;
        r45.v25 v25Var2 = j01Var.K;
        c37.x(u3Var7, new java.lang.Integer(v25Var2 != null ? v25Var2.getInteger(0) : 500));
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "prepareLive: isNewVersionSongList=true, handling song list...");
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "prepareLive: clearing singing song...");
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new yl2.t0(this.f463066f, null), 2, null);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostHelper", "prepareLive: isNewVersionSongList=false, skip clearing singing song");
        }
        return jz5.f0.f302826a;
    }
}
