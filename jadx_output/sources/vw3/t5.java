package vw3;

/* loaded from: classes.dex */
public final class t5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI f441119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441120e;

    public t5(com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI repairerShowMsgXmlUI, java.lang.String str) {
        this.f441119d = repairerShowMsgXmlUI;
        this.f441120e = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = this.f441120e;
        com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI repairerShowMsgXmlUI = this.f441119d;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            com.tencent.mm.sdk.platformtools.b0.e(str);
            androidx.appcompat.app.AppCompatActivity context = repairerShowMsgXmlUI.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = repairerShowMsgXmlUI.getString(com.tencent.mm.R.string.f490361st);
            e4Var.c();
            return;
        }
        android.content.Intent intent = repairerShowMsgXmlUI.getIntent();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String format = java.lang.String.format("msg_info_%s.txt", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(intent.getLongExtra("Chat_Msg_Id", java.lang.System.currentTimeMillis()))}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        xs.i1 i1Var = (xs.i1) i95.n0.c(xs.i1.class);
        byte[] bytes = str.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        ((zc0.h) i1Var).aj(format, bytes, true);
    }
}
