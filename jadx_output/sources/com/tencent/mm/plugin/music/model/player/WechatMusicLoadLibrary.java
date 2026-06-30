package com.tencent.mm.plugin.music.model.player;

/* loaded from: classes12.dex */
public class WechatMusicLoadLibrary implements com.tencent.mm.plugin.music.player.base.j {
    private static final java.lang.String TAG = "MicroMsg.Music.WechatMusicLoadLibrary";

    @Override // com.tencent.mm.plugin.music.player.base.j
    public boolean checkLoaded(java.lang.String str) {
        return fp.d0.d(str);
    }

    @Override // com.tencent.mm.plugin.music.player.base.j
    public java.lang.String findLibPath(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "findLibPath %s", str);
        if (!((java.util.HashSet) com.tencent.mm.plugin.music.player.base.d.f150656d).contains(str)) {
            return fp.d0.g(str);
        }
        java.util.Set set = fp.d0.f265166a;
        return fp.d0.h(str, fp.b0.f265163a);
    }

    @Override // com.tencent.mm.plugin.music.player.base.j
    public boolean load(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e(TAG, "LoadLibrary lib_name is null");
            return false;
        }
        if (fp.d0.d(str)) {
            return true;
        }
        com.tencent.mars.xlog.Log.i(TAG, "load library %s", str);
        boolean contains = ((java.util.HashSet) com.tencent.mm.plugin.music.player.base.d.f150656d).contains(str);
        java.lang.String h17 = contains ? fp.d0.h(str, fp.b0.f265163a) : fp.d0.g(str);
        if (android.text.TextUtils.isEmpty(h17)) {
            com.tencent.mars.xlog.Log.e(TAG, "LoadLibrary can't find the lib %s so", str);
            return false;
        }
        com.tencent.mars.xlog.Log.i(TAG, "LoadLibrary find and load the lib %s so", h17);
        if (contains) {
            fp.d0.o(str);
        } else {
            fp.d0.n(str);
        }
        return true;
    }
}
