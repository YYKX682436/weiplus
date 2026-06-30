package com.tencent.mm.plugin.music.model.cache.ipc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements com.tencent.mm.ipcinvoker.k0 {
    private c() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getLastScanMusicPieceFileTime task");
            return new com.tencent.mm.ipcinvoker.type.IPCLong(((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MUSIO_LAST_SCAN_MUSIC_PIECE_FILE_TIME_LONG, 0L)).longValue());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc getLastScanMusicPieceFileTime task", new java.lang.Object[0]);
            return new com.tencent.mm.ipcinvoker.type.IPCLong(0L);
        }
    }
}
