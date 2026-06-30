package com.tencent.mm.plugin.music.model.cache.ipc;

/* loaded from: classes7.dex */
final class k implements com.tencent.mm.ipcinvoker.k0 {
    private k() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest iPCAudioParamRequest = (com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest) obj;
        try {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = iPCAudioParamRequest.f150620d;
            objArr[1] = java.lang.Boolean.valueOf(iPCAudioParamRequest.f150623g != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc updateMusicFileIndexBitCache Task, musicId:%s, bitset is valid:%b", objArr);
            com.tencent.mm.plugin.music.model.cache.ipc.o.e(iPCAudioParamRequest.f150620d, iPCAudioParamRequest.f150623g);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc updateMusicFileIndexBitCache task", new java.lang.Object[0]);
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
