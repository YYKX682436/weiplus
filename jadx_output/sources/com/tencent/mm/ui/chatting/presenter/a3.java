package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class a3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f202106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f202107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n3 f202108f;

    public a3(com.tencent.mm.ui.chatting.presenter.n3 n3Var, java.util.Set set, java.util.List list) {
        this.f202108f = n3Var;
        this.f202106d = set;
        this.f202107e = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "delete message");
        com.tencent.mm.ui.chatting.i3.a(this.f202108f.f202358f, this.f202106d, new com.tencent.mm.ui.chatting.presenter.z2(this));
    }
}
