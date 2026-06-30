package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ia implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x72.b f201843d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f201844e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.la f201845f;

    public ia(com.tencent.mm.ui.chatting.la laVar, x72.b bVar, java.lang.Object obj) {
        this.f201845f = laVar;
        this.f201843d = bVar;
        this.f201844e = obj;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavMsgHandle", "oreh downloadImreportHandler.removeMessagesreportHandler.removeMessagesgAndFav taskEnd image succed: %s, msgID:%d, errType: %s, errCode:%s", java.lang.Boolean.valueOf(i19 == 0 && i27 == 0), java.lang.Long.valueOf(this.f201843d.f452435d.getMsgId()), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.ui.chatting.ha(this));
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavMsgHandle", "oreh downloadImgAndFav download image taskcancel: msgID:%d", java.lang.Long.valueOf(this.f201843d.f452435d.getMsgId()));
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
