package r53;

/* loaded from: classes8.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392671e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f392672f;

    public j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f392670d = str;
        this.f392671e = str2;
        this.f392672f = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wepkg.model.WepkgVersion d17 = com.tencent.mm.plugin.wepkg.model.o0.d(this.f392670d);
        if (d17 == null || com.tencent.mm.sdk.platformtools.t8.K0(d17.f188377g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUtil", "wepkgVersion not exists or pkgPath is empty");
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(d17.f188377g);
        if (!r6Var.m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUtil", "wepkg file not exists");
            return;
        }
        com.tencent.mm.plugin.wepkg.model.o oVar = new com.tencent.mm.plugin.wepkg.model.o(r6Var);
        if (oVar.f188447b) {
            java.util.Iterator it = oVar.c().iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.wepkg.model.k kVar = (com.tencent.mm.plugin.wepkg.model.k) it.next();
                if (kVar.f188431a.equals(this.f392671e)) {
                    java.lang.String str = this.f392672f;
                    if (str == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUtil", "patchId is null");
                        com.tencent.mm.plugin.wepkg.model.j.a(kVar);
                    } else if (!android.text.TextUtils.equals(str, kVar.f188433c)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUtil", "patchId does not match");
                        com.tencent.mm.plugin.wepkg.model.j.a(kVar);
                    }
                }
            }
        }
    }
}
