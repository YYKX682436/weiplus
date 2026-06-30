package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class ri implements j41.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f209747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f209748b;

    public ri(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI, android.content.Context context) {
        this.f209748b = singleChatInfoUI;
        this.f209747a = context;
    }

    @Override // j41.x
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SingleChatInfoUI", "doCloseConversation success");
        android.content.Context context = this.f209747a;
        db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.hep), com.tencent.mm.R.raw.icons_filled_done);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.ui.qi qiVar = new com.tencent.mm.ui.qi(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(qiVar, 2000L, false);
    }

    @Override // j41.x
    public void b(int i17, int i18, int i19, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.e("MicroMsg.SingleChatInfoUI", "doCloseConversation failed errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        android.content.Context context = this.f209747a;
        db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.hen), com.tencent.mm.R.raw.ic_filled_loading_fail);
    }
}
