package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class t8 implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f208081a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f208082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f208083c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.BaseConversationUI f208084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f208085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f208086f;

    public t8(yz5.l lVar, com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI, boolean z17, boolean z18) {
        this.f208083c = lVar;
        this.f208084d = baseConversationUI;
        this.f208085e = z17;
        this.f208086f = z18;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        j41.u uVar = i0Var != null ? i0Var.f297643d : null;
        this.f208083c.invoke(uVar);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = uVar != null ? java.lang.Boolean.valueOf(((k41.g0) uVar).f303996p1) : null;
        objArr[1] = java.lang.Boolean.valueOf(this.f208081a);
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting getContact %s, isCancelled: %b", objArr);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f208082b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        boolean z17 = this.f208081a;
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f208084d;
        if (!z17) {
            if (uVar != null && ((k41.g0) uVar).f303996p1) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("finish_direct", true);
                baseConversationUI.startChatting(((k41.g0) uVar).field_username, bundle, this.f208085e, this.f208086f);
                return;
            }
        }
        if (!(i0Var != null && i0Var.f297641b == -3601)) {
            db5.t7.makeText(baseConversationUI, baseConversationUI.getResources().getString(com.tencent.mm.R.string.hez), 0).show();
            return;
        }
        java.lang.String string = baseConversationUI.getResources().getString(com.tencent.mm.R.string.hex);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = baseConversationUI.getResources().getString(com.tencent.mm.R.string.f490454vi);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        db5.e1.y(baseConversationUI, "", string, string2, null);
    }

    @Override // j41.w
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenImKefuServiceConversationUI", "startKefuChatting try fetch contact, show loading");
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f208084d;
        this.f208082b = db5.e1.Q(baseConversationUI, "", baseConversationUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.conversation.s8(this));
    }
}
