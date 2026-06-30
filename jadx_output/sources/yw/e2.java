package yw;

/* loaded from: classes8.dex */
public final class e2 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f466310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f466311c;

    public e2(java.lang.String str, androidx.appcompat.app.AppCompatActivity appCompatActivity, java.lang.String str2) {
        this.f466309a = str;
        this.f466310b = appCompatActivity;
        this.f466311c = str2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            g45.b.f268846a.a(this.f466309a, str, 0);
            ((dk5.s5) tg3.t1.a()).Vi(this.f466310b, this.f466309a, this.f466311c, 1, "", "", null);
            if (com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterShareMsgHelper", "EnterChattingAfterTrans done config disabled");
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f466310b;
            com.tencent.mm.ui.widget.snackbar.j.c(appCompatActivity.getString(com.tencent.mm.R.string.fw6), null, appCompatActivity, null, null);
        }
    }
}
