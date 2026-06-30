package com.tencent.mm.plugin.music.player.base;

/* loaded from: classes12.dex */
class AudioPlayerUtils$DefaultMusicLoadLibrary implements com.tencent.mm.plugin.music.player.base.j {
    private final java.util.HashMap<java.lang.String, java.lang.Boolean> soLoaded;

    private AudioPlayerUtils$DefaultMusicLoadLibrary() {
        this.soLoaded = new java.util.HashMap<>();
    }

    @Override // com.tencent.mm.plugin.music.player.base.j
    public boolean checkLoaded(java.lang.String str) {
        return this.soLoaded.containsKey(str);
    }

    @Override // com.tencent.mm.plugin.music.player.base.j
    public java.lang.String findLibPath(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerUtils", "findLibPath %s", str);
        if (!((java.util.HashSet) com.tencent.mm.plugin.music.player.base.d.f150656d).contains(str)) {
            return fp.d0.g(str);
        }
        java.util.Set set = fp.d0.f265166a;
        return fp.d0.h(str, fp.b0.f265163a);
    }

    @Override // com.tencent.mm.plugin.music.player.base.j
    public boolean load(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerUtils", "LoadLibrary lib_name is null");
            return false;
        }
        if (this.soLoaded.containsKey(str) && this.soLoaded.get(str).booleanValue()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioPlayerUtils", "LoadLibrary lib_name %s is loaded", str);
            return true;
        }
        if (((java.util.HashSet) com.tencent.mm.plugin.music.player.base.d.f150656d).contains(str)) {
            fp.d0.o(str);
        } else {
            fp.d0.n(str);
        }
        this.soLoaded.put(str, java.lang.Boolean.TRUE);
        return true;
    }

    public /* synthetic */ AudioPlayerUtils$DefaultMusicLoadLibrary(com.tencent.mm.plugin.music.player.base.a aVar) {
        this();
    }
}
