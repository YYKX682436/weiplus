package com.tencent.mm.plugin.music.model.cache.ipc;

/* loaded from: classes7.dex */
final class i implements com.tencent.mm.ipcinvoker.k0 {
    private i() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest iPCAudioParamRequest = (com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest) obj;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc setMusicMIMETypeByMusicId Task, musicId:%s, mimeType:%s", iPCAudioParamRequest.f150620d, iPCAudioParamRequest.f150622f);
            com.tencent.mm.plugin.music.model.cache.ipc.o.c(iPCAudioParamRequest.f150620d, iPCAudioParamRequest.f150622f);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc setMusicMIMETypeByMusicId task", new java.lang.Object[0]);
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
