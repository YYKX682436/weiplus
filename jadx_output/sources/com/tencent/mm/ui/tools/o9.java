package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class o9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareImgUI f210622d;

    public o9(com.tencent.mm.ui.tools.ShareImgUI shareImgUI) {
        this.f210622d = shareImgUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        com.tencent.mm.ui.tools.ShareImgUI shareImgUI = this.f210622d;
        androidx.appcompat.app.AppCompatActivity context = shareImgUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        shareImgUI.finish();
    }
}
