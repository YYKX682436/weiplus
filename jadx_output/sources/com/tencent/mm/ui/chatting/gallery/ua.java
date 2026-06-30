package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class ua implements k70.w {

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.ui.chatting.gallery.ua f201496f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f201497d = new java.util.HashSet();

    /* renamed from: e, reason: collision with root package name */
    public k70.w f201498e;

    public static com.tencent.mm.ui.chatting.gallery.ua a() {
        if (f201496f == null) {
            f201496f = new com.tencent.mm.ui.chatting.gallery.ua();
        }
        return f201496f;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str3;
        k70.w wVar = this.f201498e;
        if (wVar != null) {
            str3 = str;
            wVar.f(j17, j18, str, i17, i18, obj, i19, i27, str2, m1Var);
        } else {
            str3 = str;
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(str3, j18);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageHDDownloadAndSaveMgr", "[oreh download_and_save] hdImg end at background, msgLocalId:%d", java.lang.Long.valueOf(Li.getMsgId()));
            com.tencent.mm.ui.chatting.gallery.k1.j(com.tencent.mm.sdk.platformtools.x2.f193071a, Li, false);
        }
        this.f201497d.remove(new com.tencent.mm.plugin.msg.MsgIdTalker(j18, str3));
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        k70.w wVar = this.f201498e;
        if (wVar != null) {
            wVar.l(j17, j18, str, i17, i18, obj);
        }
        this.f201497d.remove(new com.tencent.mm.plugin.msg.MsgIdTalker(j18, str));
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
        k70.w wVar = this.f201498e;
        if (wVar != null) {
            wVar.o(j17, j18, str, i17, i18, obj, i19, i27, m1Var);
        }
    }
}
