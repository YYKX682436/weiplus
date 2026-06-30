package com.tencent.mm.plugin.music.model.cache.ipc;

/* loaded from: classes7.dex */
final class e implements com.tencent.mm.ipcinvoker.k0 {
    private e() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        b21.v b17;
        try {
            b17 = com.tencent.mm.plugin.music.model.cache.ipc.o.b(((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc getPieceMusicInfo task", new java.lang.Object[0]);
        }
        if (b17 != null) {
            return new com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse(b17);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "pmInfo is null");
        return new com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse();
    }
}
