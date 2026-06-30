package com.tencent.mm.plugin.music.player.base;

/* loaded from: classes13.dex */
public class b implements com.tencent.qqmusic.mediaplayer.ISoLibraryLoader {
    @Override // com.tencent.qqmusic.mediaplayer.ISoLibraryLoader
    public java.lang.String findLibPath(java.lang.String str) {
        com.tencent.mm.plugin.music.player.base.j jVar = com.tencent.mm.plugin.music.player.base.d.f150653a;
        if (jVar != null) {
            return jVar.findLibPath(str);
        }
        return null;
    }

    @Override // com.tencent.qqmusic.mediaplayer.ISoLibraryLoader
    public boolean load(java.lang.String str) {
        com.tencent.mm.plugin.music.player.base.j jVar = com.tencent.mm.plugin.music.player.base.d.f150653a;
        if (jVar != null) {
            return jVar.load(str);
        }
        return false;
    }
}
