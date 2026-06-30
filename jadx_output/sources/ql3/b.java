package ql3;

/* loaded from: classes11.dex */
public class b extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final kk.j f364580d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f364581e;

    /* renamed from: f, reason: collision with root package name */
    public final kk.j f364582f;

    public b(l75.k0 k0Var) {
        super(k0Var, ql3.a.f364571o2, "Music", null);
        this.f364581e = k0Var;
        this.f364580d = new jt0.j(20);
        this.f364582f = new jt0.j(10);
    }

    public void D0(java.lang.String str, boolean z17) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("isBlock", java.lang.Integer.valueOf(z17 ? 1 : 0));
        this.f364581e.p("Music", contentValues, "musicId=?", new java.lang.String[]{str});
        ql3.a aVar = (ql3.a) ((lt0.f) this.f364580d).get(str);
        if (aVar != null) {
            aVar.field_isBlock = z17 ? 1 : 0;
        }
    }

    public ql3.a J0(b21.r rVar) {
        boolean z17;
        java.lang.String a17 = xl3.c.a(rVar);
        ql3.a y07 = y0(a17);
        if (y07 == null) {
            y07 = new ql3.a();
            z17 = false;
        } else {
            z17 = true;
        }
        y07.field_musicId = a17;
        y07.field_originMusicId = rVar.f17346e;
        y07.field_musicType = rVar.f17345d;
        java.lang.String str = rVar.f17358t;
        y07.field_appId = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            y07.field_appId = ll3.j2.d(rVar);
        }
        y07.field_songAlbum = rVar.f17350i;
        y07.field_songAlbumType = rVar.f17359u;
        y07.field_songWifiUrl = rVar.f17352n;
        y07.field_songName = rVar.f17348g;
        y07.field_songSinger = rVar.f17349h;
        y07.field_songWapLinkUrl = rVar.f17353o;
        y07.field_songWebUrl = rVar.f17354p;
        y07.field_songAlbumLocalPath = rVar.f17356r;
        y07.field_songMediaId = rVar.f17361w;
        y07.field_songSnsAlbumUser = rVar.f17363y;
        y07.field_songAlbumUrl = rVar.f17351m;
        if (android.text.TextUtils.isEmpty(y07.field_songLyric) && !android.text.TextUtils.isEmpty(rVar.f17355q)) {
            y07.field_songLyric = rVar.f17355q;
        }
        y07.field_songSnsShareUser = rVar.f17364z;
        if (android.text.TextUtils.isEmpty(y07.field_songHAlbumUrl) && !com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17362x)) {
            y07.field_songHAlbumUrl = rVar.f17362x;
        }
        y07.field_updateTime = java.lang.System.currentTimeMillis();
        if (y07.field_songId == 0) {
            java.lang.String[] strArr = xl3.f.f455119a;
            int e17 = xl3.f.e(rVar.f17352n);
            rVar.f17360v = e17;
            if (e17 <= 0) {
                int e18 = xl3.f.e(rVar.f17354p);
                rVar.f17360v = e18;
                if (e18 <= 0) {
                    rVar.f17360v = xl3.f.e(rVar.f17353o);
                }
            }
            if (xl3.f.b(rVar) != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String b17 = xl3.f.b(rVar);
                if (b17 != null) {
                    java.lang.String str2 = new java.lang.String(xl3.f.k(b17));
                    int indexOf = str2.indexOf("{");
                    if (indexOf != -1) {
                        str2 = str2.substring(indexOf);
                    }
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                        rVar.f17360v = jSONObject.optInt("song_ID");
                        if (com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17348g)) {
                            rVar.f17348g = jSONObject.optString("song_Name");
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17353o)) {
                            rVar.f17353o = jSONObject.optString("song_WapLiveURL");
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17352n)) {
                            rVar.f17352n = jSONObject.optString("song_WifiURL");
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17350i)) {
                            rVar.f17350i = jSONObject.optString("song_Album");
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17349h)) {
                            rVar.f17349h = jSONObject.optString("song_Singer");
                        }
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MusicUrlUtil", e19, "", new java.lang.Object[0]);
                    }
                    if (rVar.f17360v == 0) {
                        rVar.f17360v = xl3.f.e(xl3.f.f455120b);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUrlUtil", "parseBCDForMusicWrapper %s: expend: %d %d", rVar.f17346e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(rVar.f17360v));
                }
            }
            y07.field_songId = rVar.f17360v;
        }
        if (y07.field_songMId == null) {
            y07.field_songMId = xl3.f.g(xl3.f.h(rVar));
        }
        if ((com.tencent.mm.sdk.platformtools.t8.K0(y07.field_songWapLinkUrl) || y07.field_songWapLinkUrl.equals(y07.field_songWebUrl)) && !com.tencent.mm.sdk.platformtools.t8.K0(y07.field_songWifiUrl)) {
            y07.field_songWapLinkUrl = y07.field_songWifiUrl;
        }
        if (y07.field_songId == 0 && rVar.f17345d == 4) {
            try {
                y07.field_songId = java.lang.Integer.valueOf(rVar.f17346e).intValue();
            } catch (java.lang.Exception unused) {
            }
        }
        y07.field_hideBanner = rVar.B;
        y07.field_jsWebUrlDomain = rVar.C;
        y07.field_startTime = rVar.D;
        y07.f364572g2 = rVar.E;
        y07.field_protocol = rVar.F;
        y07.field_barBackToWebView = rVar.G;
        y07.field_musicbar_url = rVar.H;
        y07.field_srcUsername = rVar.I;
        y07.field_playbackRate = rVar.K;
        y07.f364574i2 = rVar.R;
        y07.f364575j2 = rVar.T;
        y07.f364576k2 = rVar.U;
        y07.f364577l2 = rVar.V;
        y07.f364578m2 = rVar.M;
        y07.f364579n2 = rVar.N;
        y07.field_mid = rVar.P;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicStorage", "update music %s", a17);
            update(y07, new java.lang.String[0]);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicStorage", "insert music %s", a17);
            insert(y07);
        }
        ((lt0.f) this.f364580d).put(a17, y07);
        return y07;
    }

    public ql3.a L0(java.lang.String str, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicStorage", "updateMusicWithColor %s %d %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ql3.a y07 = y0(str);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicStorage", "updateMusicWithColor can not find music %s", str);
            return null;
        }
        y07.field_songBgColor = i17;
        y07.field_songLyricColor = i18;
        update(y07, "songBgColor", "songLyricColor");
        ((lt0.f) this.f364580d).put(str, y07);
        return y07;
    }

    public ql3.a P0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, boolean z18) {
        ql3.a y07 = y0(str);
        if (y07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicStorage", "updateMusicWithLyricResponse can not find music %s", str);
            return null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            y07.field_songAlbumUrl = str2;
        }
        y07.field_songHAlbumUrl = str3;
        if (!android.text.TextUtils.isEmpty(str4)) {
            y07.field_songLyric = str4;
        }
        update(y07, "songAlbumUrl", "songHAlbumUrl", "songLyric");
        ((lt0.f) this.f364580d).put(str, y07);
        z0(y07, z17, z18);
        return y07;
    }

    public ql3.a y0(java.lang.String str) {
        kk.j jVar = this.f364580d;
        if (((lt0.f) jVar).get(str) != null) {
            return (ql3.a) ((lt0.f) jVar).get(str);
        }
        android.database.Cursor f17 = this.f364581e.f(java.lang.String.format("Select * From Music Where musicId=?", new java.lang.Object[0]), new java.lang.String[]{str}, 2);
        if (f17 == null || !f17.moveToFirst()) {
            if (f17 == null) {
                return null;
            }
            f17.close();
            return null;
        }
        ql3.a aVar = new ql3.a();
        aVar.convertFrom(f17);
        f17.close();
        ((lt0.f) jVar).put(str, aVar);
        return aVar;
    }

    public final ll3.h1 z0(dm.i8 i8Var, boolean z17, boolean z18) {
        ll3.h1 f17 = ll3.h1.f(i8Var.field_songLyric, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.h4r), i8Var.field_songSnsShareUser, ll3.j2.h(i8Var), i8Var.field_songSinger, z17, z18);
        ((lt0.f) this.f364582f).put(i8Var.field_musicId, f17);
        return f17;
    }
}
