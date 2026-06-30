package ws2;

/* loaded from: classes3.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback f449120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback) {
        super(4);
        this.f449120d = finderLiveReplayViewCallback;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        jz5.f0 f0Var;
        long j17;
        java.lang.String str;
        long j18;
        jz5.f0 f0Var2;
        km2.m a17;
        km2.m a18;
        ct2.j jVar;
        ct2.j jVar2;
        ct2.j jVar3;
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g((android.view.View) obj2, "<anonymous parameter 1>");
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayViewCallback finderLiveReplayViewCallback = this.f449120d;
        com.tencent.mm.plugin.finder.live.view.FinderLiveLayoutManager finderLiveLayoutManager = finderLiveReplayViewCallback.f124883i;
        android.view.View findViewByPosition = finderLiveLayoutManager != null ? finderLiveLayoutManager.findViewByPosition(intValue) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectItemView onItemSelected pos:");
        sb6.append(intValue);
        sb6.append(",itemView is null:");
        boolean z17 = false;
        sb6.append(findViewByPosition == null);
        sb6.append(",reSelect:");
        sb6.append(booleanValue);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", sb6.toString());
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        if (findViewByPosition == null) {
            return f0Var3;
        }
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = (com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout) findViewByPosition.findViewById(com.tencent.mm.R.id.fk9);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "updateLayoutManager:" + intValue + ", pluginLayout:" + finderLiveReplayPluginLayout.hashCode() + ",reStart:" + booleanValue + '!');
        ws2.v1 v1Var = finderLiveReplayViewCallback.f124885n;
        v1Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "before update plugins,pos:" + v1Var.f449150b + ' ' + v1Var.f449149a + ' ' + finderLiveReplayPluginLayout);
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout2 = v1Var.f449149a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("replay_step100:deactivate plugin pos:");
        sb7.append(v1Var.f449150b);
        sb7.append('(');
        sb7.append(finderLiveReplayPluginLayout2 != null ? finderLiveReplayPluginLayout2.hashCode() : 0);
        sb7.append(")!");
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", sb7.toString());
        ct2.e eVar = (ct2.e) pf5.u.f353936a.e(zy2.b6.class).a(ct2.e.class);
        if (finderLiveReplayPluginLayout2 == null || (jVar3 = (ct2.j) finderLiveReplayPluginLayout2.business(ct2.j.class)) == null) {
            f0Var = f0Var3;
            j17 = 0;
        } else {
            f0Var = f0Var3;
            j17 = jVar3.O6();
        }
        eVar.N6(j17, (finderLiveReplayPluginLayout2 == null || (jVar2 = (ct2.j) finderLiveReplayPluginLayout2.business(ct2.j.class)) == null) ? 0 : jVar2.f222273q);
        if (finderLiveReplayPluginLayout2 != null) {
            finderLiveReplayPluginLayout2.r();
            finderLiveReplayPluginLayout2.unMount();
        }
        ws2.u0 u0Var = ws2.k1.f449066r;
        ws2.k1 a19 = u0Var.a();
        if (finderLiveReplayPluginLayout2 == null || (jVar = (ct2.j) finderLiveReplayPluginLayout2.business(ct2.j.class)) == null) {
            str = ")!";
            j18 = 0;
        } else {
            long O6 = jVar.O6();
            str = ")!";
            j18 = O6;
        }
        a19.l(8, j18, false);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "after deactivate plugin!");
        v1Var.f449149a = finderLiveReplayPluginLayout;
        v1Var.f449150b = intValue;
        zs2.c cVar = u0Var.a().f449070b;
        if (cVar != null) {
            cVar.b(intValue);
        }
        if (((mm2.e1) finderLiveReplayPluginLayout.getBuContext().a(mm2.e1.class)).f328988r.getLong(0) == 0) {
            zs2.c cVar2 = u0Var.a().f449070b;
            if (cVar2 != null && (a18 = cVar2.a()) != null) {
                ws2.n1.f449105a.c(a18, 2);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "replay_step2-2-1#:recoverFromLiveConfig!");
        }
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "replay_step2-2:activate liveId:" + ((ct2.j) finderLiveReplayPluginLayout.business(ct2.j.class)).O6() + ", plugin pos:" + v1Var.f449150b + '(' + finderLiveReplayPluginLayout.hashCode() + str);
        u0Var.a().o(finderLiveReplayPluginLayout.getBuContext(), new zs2.a());
        android.content.Context context = finderLiveReplayPluginLayout.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            boolean booleanExtra = activity.getIntent().getBooleanExtra("KEY_PARAMS_IS_LIVING", false);
            int intExtra = activity.getIntent().getIntExtra("KEY_PARAMS_START_OFFSET", 0);
            java.lang.String stringExtra = activity.getIntent().getStringExtra("KEY_PARAMS_REPLAY_SONG_ID");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String stringExtra2 = activity.getIntent().getStringExtra("KEY_PARAMS_REPLAY_SONG_NAME");
            java.lang.String str2 = stringExtra2 != null ? stringExtra2 : "";
            ct2.j jVar4 = (ct2.j) u0Var.a().e(ct2.j.class);
            if (jVar4 != null) {
                jVar4.f222280x = booleanExtra;
            }
            ct2.d dVar = (ct2.d) u0Var.a().e(ct2.d.class);
            if (dVar != null) {
                dVar.Q6(intExtra);
            }
            ct2.j jVar5 = (ct2.j) u0Var.a().e(ct2.j.class);
            if (jVar5 != null) {
                jVar5.f222281y = stringExtra;
            }
            ct2.j jVar6 = (ct2.j) u0Var.a().e(ct2.j.class);
            if (jVar6 != null) {
                jVar6.f222282z = str2;
            }
        }
        int i17 = ((ct2.j) finderLiveReplayPluginLayout.getBuContext().a(ct2.j.class)).f222280x ? 4 : 1;
        ws2.k1 a27 = u0Var.a();
        ws2.b liveMsgOffsetProcess = (ws2.b) ((jz5.n) new ws2.h(u0Var.a(), new zs2.f(i17)).f449045c).getValue();
        kotlin.jvm.internal.o.g(liveMsgOffsetProcess, "liveMsgOffsetProcess");
        a27.f449084p = liveMsgOffsetProcess;
        zs2.c cVar3 = u0Var.a().f449070b;
        if (cVar3 == null || (a17 = cVar3.a()) == null) {
            f0Var2 = null;
        } else {
            zs2.c cVar4 = u0Var.a().f449070b;
            if (cVar4 != null) {
                long O62 = ((ct2.j) finderLiveReplayPluginLayout.business(ct2.j.class)).O6();
                jz5.l lVar = cVar4.f475249d;
                if (lVar != null && ((java.lang.Number) lVar.f302833d).longValue() == O62) {
                    z17 = ((java.lang.Boolean) lVar.f302834e).booleanValue();
                }
            }
            finderLiveReplayPluginLayout.activate(a17, z17, booleanValue);
            f0Var2 = f0Var;
        }
        if (f0Var2 == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveReplayViewCallback", "replay_step2-2-1#:FinderLiveData is null!");
        }
        finderLiveReplayPluginLayout.mount();
        u0Var.a().p(finderLiveReplayPluginLayout, qs5.o.f366455h);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "after activate plugin!");
        com.tencent.mars.xlog.Log.i("FinderLiveReplayViewCallback", "after update plugins,pos:" + v1Var.f449150b);
        return f0Var;
    }
}
