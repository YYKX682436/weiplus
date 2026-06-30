package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes11.dex */
public class i implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s01.q0 f198787d;

    public i(com.tencent.mm.ui.chatting.component.biz.a aVar, s01.q0 q0Var) {
        this.f198787d = q0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f198787d);
    }
}
