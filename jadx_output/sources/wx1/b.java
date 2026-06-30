package wx1;

/* loaded from: classes7.dex */
public class b implements vx1.f {
    @Override // vx1.f
    public boolean a(int i17) {
        return ih.a.f(e42.d0.clicfg_bitmap_recycle_release_native_v2, true) && com.tencent.mm.sdk.platformtools.x2.n() && i17 >= 26 && i17 <= 30;
    }

    @Override // vx1.f
    public boolean b() {
        ux1.d.f431844a = new wx1.a(this);
        try {
            com.tencent.mm.plugin.crashfix.jni.BitmapReleaseImmediately.work();
            com.tencent.mars.xlog.Log.i("MicroMsg.BitmapReleaseX", "work succ");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BitmapReleaseX", "work error");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BitmapReleaseX", e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}
