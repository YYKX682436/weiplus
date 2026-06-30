package rk4;

/* loaded from: classes11.dex */
public final class c4 implements qk.g8 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f396579a = jz5.h.b(rk4.a4.f396543d);

    public c4() {
        jz5.h.b(new rk4.b4(this));
    }

    public void b(android.content.Context context, bw5.ar0 enterScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(enterScene, "enterScene");
        w71.o0 a17 = w71.q0.f443436d.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("TingFlutterPluginHelperImpl", "gotoPlayerPage failed, hybridRouter is null");
            return;
        }
        km4.s a18 = km4.s.f309318f.a(enterScene);
        a18.e("basic_player");
        a18.a(kz5.c1.k(new jz5.l("play_app_id", 0), new jz5.l("intentFlags", java.lang.Integer.valueOf(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING)), new jz5.l("activityClass", com.tencent.mm.plugin.ting.TingFlutterActivityBasic.class)));
        ((w71.q0) a17).a(a18, rk4.z3.f397122d);
    }
}
