package l33;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static int f315428a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static m53.p3 f315429b;

    public static final void a() {
        com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent = new com.tencent.mm.autogen.events.GamePBCacheEvent();
        am.we weVar = gamePBCacheEvent.f54369g;
        weVar.f8278a = 3;
        weVar.f8279b = "cache_my_chatroom";
        weVar.f8280c = null;
        gamePBCacheEvent.e();
        z53.o.f470261a.c(0, Integer.MAX_VALUE, l33.a.f315426d);
        com.tencent.mm.plugin.game.model.o1 Di = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
        Di.getClass();
        Di.execSQL("GameRawMessage", "update GameRawMessage set isHidden = 2 where isHidden = 0 and showType = 1");
        com.tencent.mars.xlog.Log.i("GameAccountManager", "gamelog.account, manage ,applyDelAccount");
    }

    public static final void b() {
        com.tencent.mm.autogen.events.GamePBCacheEvent gamePBCacheEvent = new com.tencent.mm.autogen.events.GamePBCacheEvent();
        am.we weVar = gamePBCacheEvent.f54369g;
        weVar.f8278a = 3;
        weVar.f8279b = "cache_my_chatroom";
        weVar.f8280c = null;
        gamePBCacheEvent.e();
        z53.o.f470261a.c(0, Integer.MAX_VALUE, l33.a.f315426d);
        ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().D0(1);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.GAME_ACCOUNT_APPLY_DEL_TIME_LONG_SYNC, -1L);
        com.tencent.mars.xlog.Log.i("GameAccountManager", "gamelog.account, manage ,delAccount");
    }

    public static final void c() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new m53.s2();
        lVar.f70665b = new m53.t2();
        lVar.f70666c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getusergamecenteraccountinfo";
        lVar.f70667d = 5087;
        com.tencent.mm.modelbase.z2.d(lVar.a(), l33.b.f315427d, false);
    }
}
