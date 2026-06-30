package vp;

/* loaded from: classes14.dex */
public class p implements vp.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp.k f438822a;

    public p(vp.k kVar) {
        this.f438822a = kVar;
    }

    @Override // vp.c0
    public void a(wp.a danmaku) {
        vp.v0 v0Var = this.f438822a.f438792h;
        v0Var.getClass();
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        if (v0Var.f438850l) {
            com.tencent.mars.xlog.Log.w("DanmakuAsyncDataSource", "addFollowDanmaku: ignored because dataSource is closed");
            return;
        }
        danmaku.toString();
        if (v0Var.f438850l) {
            com.tencent.mars.xlog.Log.w("DanmakuAsyncDataSource", "addFollowDanmakuToDrawListAsync: ignored because dataSource is closed");
        } else {
            kotlinx.coroutines.l.d(v0Var.f438849k, null, null, new vp.o0(v0Var, danmaku, null), 3, null);
        }
    }
}
