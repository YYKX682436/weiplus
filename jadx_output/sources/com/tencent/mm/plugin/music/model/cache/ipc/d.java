package com.tencent.mm.plugin.music.model.cache.ipc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class d implements com.tencent.mm.ipcinvoker.k0 {
    private d() {
    }

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getMusicMIMETypeByMusicId Task, musicId:%s", iPCString);
            ql3.c y07 = ll3.o2.Bi().y0(iPCString.f68406d);
            if (y07 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataSourceMainProcessImp", "getMusicMIMETypeByMusicId pMusic is null!'");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicDataSourceMainProcessImp", "music field_pieceFileMIMEType:%s", y07.field_pieceFileMIMEType);
                if (!android.text.TextUtils.isEmpty(y07.field_pieceFileMIMEType)) {
                    str = y07.field_pieceFileMIMEType;
                    return new com.tencent.mm.ipcinvoker.type.IPCString(str);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataSourceMainProcessImp", "field_pieceFileMIMEType is null!'");
            }
            str = null;
            return new com.tencent.mm.ipcinvoker.type.IPCString(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc getMusicMIMETypeByMusicId task", new java.lang.Object[0]);
            return new com.tencent.mm.ipcinvoker.type.IPCString("");
        }
    }
}
