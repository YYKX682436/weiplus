package com.tencent.mm.plugin.music.model.cache.ipc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class a implements com.tencent.mm.ipcinvoker.k0 {
    private a() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc deletePieceMusicInfo Task, musicId:%s", iPCString);
            java.lang.String str = iPCString.f68406d;
            ql3.d Bi = ll3.o2.Bi();
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "deletePieceMusicInfo raw=%d musicId=%s", java.lang.Integer.valueOf(Bi.f364585e.delete("PieceMusicInfo", "musicId=?", new java.lang.String[]{str})), str);
            ((lt0.f) Bi.f364584d).remove(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc deletePieceMusicInfo task", new java.lang.Object[0]);
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
