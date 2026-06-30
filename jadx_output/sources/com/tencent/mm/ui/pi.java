package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class pi implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f209512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.SingleChatInfoUI f209513e;

    public pi(com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI, android.content.Context context) {
        this.f209513e = singleChatInfoUI;
        this.f209512d = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.SingleChatInfoUI singleChatInfoUI = this.f209513e;
        q41.f.a(singleChatInfoUI.f197077n, 9, 0);
        java.lang.String str = singleChatInfoUI.f197077n;
        singleChatInfoUI.getClass();
        ((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).Ai(str, new com.tencent.mm.ui.ri(singleChatInfoUI, this.f209512d));
    }
}
