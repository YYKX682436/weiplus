package com.tencent.mm.plugin.music.model.cache.ipc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h implements com.tencent.mm.ipcinvoker.k0 {
    private h() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = (com.tencent.mm.ipcinvoker.type.IPCLong) obj;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc setLastScanMusicPieceFileTime task");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MUSIO_LAST_SCAN_MUSIC_PIECE_FILE_TIME_LONG, java.lang.Long.valueOf(iPCLong.f68405d));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc setLastScanMusicPieceFileTime task", new java.lang.Object[0]);
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
