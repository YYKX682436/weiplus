package qr;

/* loaded from: classes12.dex */
public class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366028c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qr.o f366029d;

    public n(qr.o oVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f366029d = oVar;
        this.f366026a = str;
        this.f366027b = str2;
        this.f366028c = str3;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadBackup", "backup callback: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        java.lang.String str = this.f366028c;
        java.lang.String str2 = this.f366027b;
        java.lang.String str3 = this.f366026a;
        qr.o oVar = this.f366029d;
        if (i17 == 0 && i18 == 0) {
            oVar.d(str3);
            qr.o.e(oVar, (r45.ri0) ((r45.bd) fVar.f70618d).f370672e.getFirst());
            oVar.b(0, str3, str2, str);
            gr.v.f274696a.a(true);
            return null;
        }
        if (i18 != -434) {
            oVar.c();
            return null;
        }
        if (oVar.f366020b) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CAPTURE_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE);
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE);
        }
        oVar.d(str3);
        qr.o.e(oVar, (r45.ri0) ((r45.bd) fVar.f70618d).f370672e.getFirst());
        oVar.b(1, str3, str2, str);
        gr.v.f274696a.a(true);
        return null;
    }
}
