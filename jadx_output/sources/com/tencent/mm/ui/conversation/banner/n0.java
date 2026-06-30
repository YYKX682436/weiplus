package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class n0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.banner.o0 f207557d;

    public n0(com.tencent.mm.ui.conversation.banner.o0 o0Var) {
        this.f207557d = o0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_STORAGE_PERMISSION_BANNER_1_CLOSED_FLAG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        this.f207557d.i();
    }
}
