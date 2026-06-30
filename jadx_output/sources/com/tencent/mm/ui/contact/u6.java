package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class u6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w11.h0 f207209d;

    public u6(com.tencent.mm.ui.contact.OnlyChatContactMgrUI onlyChatContactMgrUI, w11.h0 h0Var) {
        this.f207209d = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.n().f273288b.d(this.f207209d);
    }
}
