package com.tencent.mm.plugin.music.model.cache.ipc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class l implements com.tencent.mm.ipcinvoker.k0 {
    private l() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc updatePieceMusicInfo Task, src:%s", iPCString);
            return new com.tencent.mm.ipcinvoker.type.IPCString(com.tencent.mm.plugin.music.model.cache.ipc.o.f(iPCString.f68406d));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc updatePieceMusicInfo task", new java.lang.Object[0]);
            return new com.tencent.mm.ipcinvoker.type.IPCString("");
        }
    }
}
