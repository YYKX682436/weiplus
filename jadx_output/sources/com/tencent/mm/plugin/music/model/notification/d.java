package com.tencent.mm.plugin.music.model.notification;

/* loaded from: classes11.dex */
public class d implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ql3.a f150637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f150638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.model.notification.e f150639c;

    public d(com.tencent.mm.plugin.music.model.notification.e eVar, ql3.a aVar, java.lang.String str) {
        this.f150639c = eVar;
        this.f150637a = aVar;
        this.f150638b = str;
    }

    @Override // p11.d
    public void a(boolean z17, java.lang.Object... objArr) {
        ql3.a aVar = this.f150637a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotification", "music.field_songAlbumUrl:%s, success:%b", aVar.field_songAlbumUrl, java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f150638b, null);
            if (J2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MMMusicNotification", "bitmap is null, return");
            } else {
                n11.a.b().o(aVar.field_songAlbumUrl, J2);
                this.f150639c.f150642c.c();
            }
        }
    }
}
