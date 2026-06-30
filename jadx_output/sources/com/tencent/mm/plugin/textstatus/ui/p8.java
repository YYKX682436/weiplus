package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class p8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174172d;

    public p8(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174172d = textStatusEditActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.tencent.mm.plugin.textstatus.ui.g8 d76 = this.f174172d.d7();
        int i17 = this.f174172d.d7().f173902d;
        str = "";
        if (i17 == 1) {
            oj4.l lVar = oj4.l.f345818a;
            java.lang.String str2 = this.f174172d.d7().f173900b;
            str = str2 != null ? str2 : "";
            java.lang.String str3 = "thumb_" + com.tencent.mm.vfs.w6.p(str);
            com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
            str = lVar.b(str, new com.tencent.mm.vfs.r6(lp0.b.h0("textstatus_publish"), str3), 60);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.UploadPackHelper", "[getSendThumbnail] compress path=" + str);
        } else if (i17 == 2) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174172d;
            java.lang.String str4 = textStatusEditActivity.d7().f173900b;
            str = textStatusEditActivity.b7(str4 != null ? str4 : "");
        }
        d76.f173901c = str;
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.textstatus.ui.o8(this.f174172d));
    }
}
