package com.tencent.mm.ui.chatting.manager;

/* loaded from: classes.dex */
public final class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201981d;

    public s(java.lang.String str) {
        this.f201981d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17509, 3, this.f201981d);
    }
}
