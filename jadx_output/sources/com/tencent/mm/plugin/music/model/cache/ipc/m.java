package com.tencent.mm.plugin.music.model.cache.ipc;

/* loaded from: classes7.dex */
final class m implements com.tencent.mm.ipcinvoker.k0 {
    private m() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest iPCAudioParamRequest = (com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest) obj;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc updateMusicFileCacheComplete Task, musicId:%s, complete:%d", iPCAudioParamRequest.f150620d, java.lang.Integer.valueOf(iPCAudioParamRequest.f150621e));
            com.tencent.mm.plugin.music.model.cache.ipc.o.d(iPCAudioParamRequest.f150620d, iPCAudioParamRequest.f150621e);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc updateMusicFileCacheComplete task", new java.lang.Object[0]);
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
