package ll3;

/* loaded from: classes11.dex */
public class r1 implements ka0.l0 {

    /* renamed from: b, reason: collision with root package name */
    public ll3.p1 f319224b;

    /* renamed from: c, reason: collision with root package name */
    public ka0.k0 f319225c;

    /* renamed from: d, reason: collision with root package name */
    public final p11.h f319226d = new ll3.o1(this);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f319227e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final kk.j f319223a = new jt0.i(5, ll3.r1.class);

    public void a(b21.r rVar, com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView, android.content.Context context, boolean z17, boolean z18) {
        if (rVar == null || cdnImageView == null) {
            return;
        }
        ql3.a aVar = new ql3.a();
        java.lang.String str = rVar.f17346e;
        aVar.field_musicId = str;
        aVar.field_originMusicId = str;
        aVar.field_musicType = rVar.f17345d;
        aVar.field_songAlbum = rVar.f17350i;
        aVar.field_songAlbumType = rVar.f17359u;
        aVar.field_songAlbumLocalPath = rVar.f17356r;
        aVar.field_songAlbumUrl = rVar.f17351m;
        if (android.text.TextUtils.isEmpty(aVar.field_songLyric) && !android.text.TextUtils.isEmpty(rVar.f17355q)) {
            aVar.field_songLyric = rVar.f17355q;
        }
        aVar.field_songSnsShareUser = rVar.f17364z;
        if (android.text.TextUtils.isEmpty(aVar.field_songHAlbumUrl) && !com.tencent.mm.sdk.platformtools.t8.K0(rVar.f17362x)) {
            aVar.field_songHAlbumUrl = rVar.f17362x;
        }
        b(aVar, cdnImageView, context, z17, z18);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(ql3.a r23, com.tencent.mm.pluginsdk.ui.applet.CdnImageView r24, android.content.Context r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ll3.r1.b(ql3.a, com.tencent.mm.pluginsdk.ui.applet.CdnImageView, android.content.Context, boolean, boolean):void");
    }

    public final void c(ql3.a aVar, android.graphics.Bitmap bitmap) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicImageLoader", "putBitmapToCache %s", aVar.field_musicId);
        ((jt0.i) this.f319223a).put(aVar.field_musicId, bitmap);
    }
}
