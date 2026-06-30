package com.tencent.mm.plugin.music.model.cache.ipc;

/* loaded from: classes.dex */
final class g implements com.tencent.mm.ipcinvoker.k0 {
    private g() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc isSupportMixAudioByCP task");
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MUSIC_OPEN_MIX_AUDIO_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc isSupportMixAudioByCP task", new java.lang.Object[0]);
            return new com.tencent.mm.ipcinvoker.type.IPCBoolean(false);
        }
    }
}
