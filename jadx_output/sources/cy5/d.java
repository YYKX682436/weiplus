package cy5;

/* loaded from: classes13.dex */
public class d extends cy5.h {
    @Override // cy5.h
    public void b() {
        by5.c4.f(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO, "checkFiles, skip");
    }

    @Override // cy5.h
    public java.lang.String g(int i17, boolean z17) {
        java.lang.String o17 = o(i17);
        if (o17 == null || o17.isEmpty()) {
            return "";
        }
        if (z17) {
            return o17 + java.io.File.separator + "patch";
        }
        return o17 + java.io.File.separator + "xweb_fullscreen_video.js";
    }

    @Override // cy5.h
    public java.util.List j(int i17) {
        java.lang.String o17 = o(i17);
        if (o17 == null || o17.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(o17 + java.io.File.separator + "xweb_fullscreen_video.js");
        return arrayList;
    }

    @Override // cy5.h
    public java.lang.String m() {
        return com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO;
    }

    @Override // cy5.h
    public boolean p() {
        return true;
    }

    @Override // cy5.h
    public boolean q() {
        return true;
    }

    @Override // cy5.h
    public int s(by5.n0 n0Var) {
        by5.c4.f(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO, "performInstall version " + n0Var.f36574m.f36537e);
        by5.m0 m0Var = n0Var.f36574m;
        if (by5.x.a(m0Var.f36555w, n0Var.f36567f)) {
            u(m0Var.f36537e, true);
            by5.c4.f(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO, "performInstall " + this.f224879a + " success");
            return 0;
        }
        by5.c4.c(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO, "performInstall failed, md5 not match");
        java.io.File file = new java.io.File(m0Var.f36555w);
        if (file.exists()) {
            file.delete();
        }
        by5.s0.g(com.tencent.xwebsdk.BuildConfig.PLUGIN_NAME_FULL_SCREEN_VIDEO, false);
        return -2;
    }
}
