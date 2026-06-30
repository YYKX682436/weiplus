package com.tencent.mm.plugin.music.model.cache.ipc;

/* loaded from: classes7.dex */
public abstract class o {
    public static java.lang.String a(java.lang.String str) {
        b21.r o17 = kl3.t.l().o();
        if (o17 != null && str.equalsIgnoreCase(o17.f17346e)) {
            return xl3.c.a(o17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        return sb6.toString();
    }

    public static b21.v b(java.lang.String str) {
        ql3.c y07 = ll3.o2.Bi().y0(str);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataSourceMainProcessImp", "initData pMusic is null!'");
            return null;
        }
        b21.v vVar = new b21.v();
        vVar.f17368a = y07.field_musicId;
        vVar.f17369b = y07.field_musicUrl;
        vVar.f17370c = y07.field_fileName;
        vVar.f17372e = y07.field_fileCacheComplete;
        vVar.f17373f = y07.field_pieceFileMIMEType;
        vVar.f17371d = y07.field_indexBitData;
        vVar.f17374g = y07.field_removeDirtyBit;
        return vVar;
    }

    public static void c(java.lang.String str, java.lang.String str2) {
        ql3.c y07 = ll3.o2.Bi().y0(str);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataSourceMainProcessImp", "setMusicMIMETypeByMusicId pMusic is null!'");
            return;
        }
        if (!android.text.TextUtils.isEmpty(y07.field_pieceFileMIMEType) && y07.field_pieceFileMIMEType.equals(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataSourceMainProcessImp", "don't need update the piece file mime type");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicDataSourceMainProcessImp", "updatePieceFileMIMEType()");
        ql3.d Bi = ll3.o2.Bi();
        Bi.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("pieceFileMIMEType", str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceFileMIMEType raw=%d musicId=%s", java.lang.Integer.valueOf(Bi.f364585e.p("PieceMusicInfo", contentValues, "musicId=?", new java.lang.String[]{str})), str);
        ql3.c cVar = (ql3.c) ((lt0.f) Bi.f364584d).get(str);
        if (cVar != null) {
            cVar.field_pieceFileMIMEType = str2;
        }
    }

    public static void d(java.lang.String str, int i17) {
        ql3.d Bi = ll3.o2.Bi();
        Bi.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("fileCacheComplete", java.lang.Integer.valueOf(i17));
        if (i17 == 1) {
            contentValues.put("removeDirtyBit", (java.lang.Integer) 1);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "updateMusicFileCacheComplete raw=%d musicId=%s fileCacheComplete=%d", java.lang.Integer.valueOf(Bi.f364585e.p("PieceMusicInfo", contentValues, "musicId=?", new java.lang.String[]{str})), str, java.lang.Integer.valueOf(i17));
        ql3.c cVar = (ql3.c) ((lt0.f) Bi.f364584d).get(str);
        if (cVar != null) {
            cVar.field_fileCacheComplete = i17;
            if (i17 == 1) {
                cVar.field_removeDirtyBit = 1;
            }
        }
    }

    public static void e(java.lang.String str, byte[] bArr) {
        ql3.d Bi = ll3.o2.Bi();
        Bi.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("indexBitData", bArr);
        int p17 = Bi.f364585e.p("PieceMusicInfo", contentValues, "musicId=?", new java.lang.String[]{str});
        if (p17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "updateMusicFileIndexBitCache raw=%d musicId=%s", java.lang.Integer.valueOf(p17), str);
        }
        ql3.c cVar = (ql3.c) ((lt0.f) Bi.f364584d).get(str);
        if (cVar != null) {
            cVar.field_indexBitData = bArr;
        }
    }

    public static java.lang.String f(java.lang.String str) {
        ql3.c y07;
        boolean z17;
        ql3.d Bi = ll3.o2.Bi();
        Bi.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceMusicByUrl url is empty!");
            y07 = null;
        } else {
            java.lang.String b17 = xl3.c.b(str);
            y07 = Bi.y0(b17);
            if (y07 == null) {
                y07 = new ql3.c();
                z17 = false;
            } else {
                z17 = true;
            }
            y07.field_musicId = b17;
            y07.field_musicUrl = str;
            java.lang.String d17 = xl3.c.d(str);
            y07.field_fileName = d17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "updatePieceMusicByUrl musicId:%s, field_fileName:%s", b17, d17);
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "update PieceMusicInfo");
                Bi.update(y07, new java.lang.String[0]);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "insert PieceMusicInfo");
                Bi.insert(y07);
            }
            ((lt0.f) Bi.f364584d).put(b17, y07);
        }
        if (y07 != null) {
            return y07.field_musicId;
        }
        return null;
    }
}
