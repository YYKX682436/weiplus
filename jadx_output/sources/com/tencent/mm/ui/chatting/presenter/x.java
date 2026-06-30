package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f202524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f202525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f202526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.y f202527g;

    public x(com.tencent.mm.ui.chatting.presenter.y yVar, int i17, java.util.Set set, com.tencent.mm.storage.f9 f9Var) {
        this.f202527g = yVar;
        this.f202524d = i17;
        this.f202525e = set;
        this.f202526f = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseHistoryListPresenter", "delete message");
        com.tencent.mm.ui.chatting.presenter.y yVar = this.f202527g;
        de5.a.f229396a.k(19, this.f202524d, yVar.k());
        com.tencent.mm.ui.chatting.i3.a(yVar.f202541d, this.f202525e, new com.tencent.mm.ui.chatting.presenter.w(this));
    }
}
