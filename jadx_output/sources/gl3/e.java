package gl3;

/* loaded from: classes11.dex */
public abstract class e {
    public static java.lang.String a() {
        if (d()) {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            java.lang.String b17 = com.tencent.mm.plugin.music.model.cache.ipc.n.b();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                return b17;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        return lp0.b.D();
    }

    public static jl3.a b(java.lang.String str) {
        if (!d()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            return new jl3.a();
        }
        ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
        ql3.a y07 = ll3.o2.Ai().y0(com.tencent.mm.plugin.music.model.cache.ipc.o.a(str));
        jl3.a aVar = new jl3.a();
        if (y07 != null) {
            aVar.f300205d = y07.field_wifiDownloadedLength;
            aVar.f300207f = y07.field_songWifiFileLength;
            aVar.f300206e = y07.field_wifiEndFlag;
            aVar.f300202a = y07.field_downloadedLength;
            aVar.f300203b = y07.field_songFileLength;
            aVar.f300204c = y07.field_endFlag;
            aVar.f300208g = y07.field_mimetype;
        }
        return aVar;
    }

    public static b21.v c(java.lang.String str) {
        if (!d()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            return null;
        }
        ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
        com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamResponse e17 = com.tencent.mm.plugin.music.model.cache.ipc.n.e(str);
        if (e17 == null) {
            return null;
        }
        b21.v vVar = new b21.v();
        vVar.f17368a = e17.f150624d;
        vVar.f17369b = e17.f150625e;
        vVar.f17370c = e17.f150626f;
        vVar.f17372e = e17.f150628h;
        vVar.f17373f = e17.f150627g;
        vVar.f17371d = e17.f150629i;
        vVar.f17374g = e17.f150630m;
        return vVar;
    }

    public static boolean d() {
        return sl3.b.b(gl3.c.class) != null;
    }

    public static void e(java.lang.String str, jl3.a aVar) {
        if (!d()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            return;
        }
        ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
        java.lang.String a17 = com.tencent.mm.plugin.music.model.cache.ipc.o.a(str);
        ql3.b Ai = ll3.o2.Ai();
        long j17 = aVar.f300205d;
        Ai.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("wifiDownloadedLength", java.lang.Long.valueOf(j17));
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiDownloadedLength=%d", java.lang.Integer.valueOf(Ai.f364581e.p("Music", contentValues, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Long.valueOf(j17));
        ql3.a aVar2 = (ql3.a) ((lt0.f) Ai.f364580d).get(a17);
        if (aVar2 != null) {
            aVar2.field_wifiDownloadedLength = j17;
        }
        ql3.b Ai2 = ll3.o2.Ai();
        int i17 = aVar.f300206e;
        Ai2.getClass();
        android.content.ContentValues contentValues2 = new android.content.ContentValues();
        contentValues2.put("wifiEndFlag", java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s wifiEndFlag=%d", java.lang.Integer.valueOf(Ai2.f364581e.p("Music", contentValues2, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Integer.valueOf(i17));
        ql3.a aVar3 = (ql3.a) ((lt0.f) Ai2.f364580d).get(a17);
        if (aVar3 != null) {
            aVar3.field_wifiEndFlag = i17;
        }
        ql3.b Ai3 = ll3.o2.Ai();
        long j18 = aVar.f300207f;
        Ai3.getClass();
        android.content.ContentValues contentValues3 = new android.content.ContentValues();
        contentValues3.put("songWifiFileLength", java.lang.Long.valueOf(j18));
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songWifiFileLength=%d", java.lang.Integer.valueOf(Ai3.f364581e.p("Music", contentValues3, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Long.valueOf(j18));
        ql3.a aVar4 = (ql3.a) ((lt0.f) Ai3.f364580d).get(a17);
        if (aVar4 != null) {
            aVar4.field_songWifiFileLength = j18;
        }
        ql3.b Ai4 = ll3.o2.Ai();
        long j19 = aVar.f300202a;
        Ai4.getClass();
        android.content.ContentValues contentValues4 = new android.content.ContentValues();
        contentValues4.put("downloadedLength", java.lang.Long.valueOf(j19));
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s downloadedLength=%d", java.lang.Integer.valueOf(Ai4.f364581e.p("Music", contentValues4, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Long.valueOf(j19));
        ql3.a aVar5 = (ql3.a) ((lt0.f) Ai4.f364580d).get(a17);
        if (aVar5 != null) {
            aVar5.field_downloadedLength = j19;
        }
        ql3.b Ai5 = ll3.o2.Ai();
        int i18 = aVar.f300204c;
        Ai5.getClass();
        android.content.ContentValues contentValues5 = new android.content.ContentValues();
        contentValues5.put("endFlag", java.lang.Integer.valueOf(i18));
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s endFlag=%d", java.lang.Integer.valueOf(Ai5.f364581e.p("Music", contentValues5, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Integer.valueOf(i18));
        ql3.a aVar6 = (ql3.a) ((lt0.f) Ai5.f364580d).get(a17);
        if (aVar6 != null) {
            aVar6.field_endFlag = i18;
        }
        ql3.b Ai6 = ll3.o2.Ai();
        long j27 = aVar.f300203b;
        Ai6.getClass();
        android.content.ContentValues contentValues6 = new android.content.ContentValues();
        contentValues6.put("songFileLength", java.lang.Long.valueOf(j27));
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicStorage", "update raw=%d musicId=%s songFileLength=%d", java.lang.Integer.valueOf(Ai6.f364581e.p("Music", contentValues6, "musicId=?", new java.lang.String[]{a17})), a17, java.lang.Long.valueOf(j27));
        ql3.a aVar7 = (ql3.a) ((lt0.f) Ai6.f364580d).get(a17);
        if (aVar7 != null) {
            aVar7.field_songFileLength = j27;
        }
    }

    public static void f(java.lang.String str, java.lang.String str2) {
        if (!d()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            return;
        }
        ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
        java.lang.String a17 = com.tencent.mm.plugin.music.model.cache.ipc.o.a(str);
        ql3.b Ai = ll3.o2.Ai();
        Ai.getClass();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("mimetype", str2);
        Ai.f364581e.p("Music", contentValues, "musicId=?", new java.lang.String[]{a17});
        ql3.a aVar = (ql3.a) ((lt0.f) Ai.f364580d).get(a17);
        if (aVar != null) {
            aVar.field_mimetype = str2;
        }
    }

    public static void g(java.lang.String str, byte[] bArr) {
        if (!d()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
        } else {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            com.tencent.mm.plugin.music.model.cache.ipc.n.k(str, bArr);
        }
    }
}
