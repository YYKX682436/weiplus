package com.tencent.mm.plugin.music.model.cache.ipc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f implements com.tencent.mm.ipcinvoker.k0 {
    private f() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getRemovePlayingAudioPlayerGroupCount task");
            return new com.tencent.mm.ipcinvoker.type.IPCInteger(((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MUSIC_RREMOVE_PLAYING_AUDIO_PLAYER_GROUP_COUNT_INT_SYNC, java.lang.Integer.valueOf(iPCInteger.f68404d))).intValue());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc getRemovePlayingAudioPlayerGroupCount task", new java.lang.Object[0]);
            return new com.tencent.mm.ipcinvoker.type.IPCInteger(iPCInteger.f68404d);
        }
    }
}
