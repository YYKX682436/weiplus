package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class cd implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f198531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f198532e;

    public cd(com.tencent.mm.storage.f9 f9Var, android.content.Context context) {
        this.f198531d = f9Var;
        this.f198532e = context;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        com.tencent.mm.storage.f9 f9Var = this.f198531d;
        java.lang.String str2 = new com.tencent.mm.storage.y4(f9Var.j()).f196356d;
        if (str2 == null || str2.endsWith("-1")) {
            str2 = f9Var.z0();
        }
        java.lang.String str3 = str2;
        if (str3 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LongClickBrandServiceHelper", "showAcceptEmojiConnector: filePath is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LongClickBrandServiceHelper", "connector click[emoji]: to[%s] filePath[%s]", str, str3);
        s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0());
        android.content.Context context = this.f198532e;
        if (((y12.h) wi6).W(context, str, str3, msgIdTalker, 0)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10424, 47, 64, str);
            db5.e1.T(context, "");
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10424, 47, 64, str);
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490548y7));
    }
}
