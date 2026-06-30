package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes9.dex */
public class j6 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f201066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201067e;

    public j6(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, java.lang.String str, com.tencent.mm.storage.f9 f9Var, java.lang.String str2, int i17) {
        this.f201067e = imageGalleryUI;
        this.f201063a = str;
        this.f201064b = f9Var;
        this.f201065c = str2;
        this.f201066d = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            g45.b.f268846a.a(this.f201063a, str, 0);
            k70.i0 i0Var = new k70.i0();
            i0Var.f304642a = 4;
            int i18 = com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.f200588p4;
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201067e;
            com.tencent.mm.modelmulti.WxaInfo W8 = imageGalleryUI.W8();
            if (W8 != null) {
                i0Var.f304652k = W8.c();
            }
            com.tencent.mm.modelmulti.SourceImgInfo U8 = imageGalleryUI.U8();
            if (U8 != null) {
                p15.m mVar = new p15.m();
                mVar.n(U8.f71258d);
                mVar.l(U8.f71259e);
                i0Var.f304653l = mVar;
            }
            c01.h7 h7Var = new c01.h7();
            com.tencent.mm.storage.f9 f9Var = this.f201064b;
            h7Var.f37227b = f9Var.getMsgId();
            h7Var.f37229d = f9Var.Q0();
            i0Var.f304656o = h7Var;
            dk5.o0.a(this.f201063a, this.f201065c, this.f201066d, i0Var, h7Var, null, null, null);
            if (com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryUI", "EnterChattingAfterTrans config disabled, show normal toast for image forward");
            com.tencent.mm.ui.widget.snackbar.j.c(imageGalleryUI.getContext().getString(com.tencent.mm.R.string.fw6), null, imageGalleryUI.getContext(), null, null);
        }
    }
}
