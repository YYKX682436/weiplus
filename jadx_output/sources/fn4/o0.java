package fn4;

/* loaded from: classes11.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f264594d;

    public o0(fn4.r0 r0Var, java.lang.String str) {
        this.f264594d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = this.f264594d;
        com.tencent.mm.vfs.w6.f(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "DeleteVideoFolderTask %s %d", str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
