package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class u9 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareImgUI f210818b;

    public u9(com.tencent.mm.ui.tools.ShareImgUI shareImgUI, java.lang.String str) {
        this.f210818b = shareImgUI;
        this.f210817a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            final com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(new com.tencent.mm.opensdk.modelmsg.WXWebpageObject(this.f210817a));
            r45.kf4 kf4Var = (r45.kf4) fVar.f70618d;
            wXMediaMessage.title = kf4Var.f378653d;
            wXMediaMessage.description = kf4Var.f378655f;
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(((r45.kf4) fVar.f70618d).f378654e, new k70.f0() { // from class: com.tencent.mm.ui.tools.u9$$a
                @Override // k70.f0
                public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
                    com.tencent.mm.ui.tools.u9 u9Var = com.tencent.mm.ui.tools.u9.this;
                    u9Var.getClass();
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.tools.v9(u9Var, wXMediaMessage, bitmap));
                }
            });
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "Parse Url success title: " + wXMediaMessage.title + " description: " + wXMediaMessage.description + " imageUrl: " + ((r45.kf4) fVar.f70618d).f378654e);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "Parse Url fail errType: " + fVar.f70615a + " errCode: " + fVar.f70616b + " errMsg: " + fVar.f70617c);
            com.tencent.mm.ui.tools.ShareImgUI shareImgUI = this.f210818b;
            android.content.Intent intent = shareImgUI.getIntent();
            int i17 = com.tencent.mm.ui.tools.ShareImgUI.f210151w;
            shareImgUI.f7(intent);
        }
        return fVar;
    }
}
