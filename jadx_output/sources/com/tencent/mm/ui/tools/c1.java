package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class c1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.d1 f210309d;

    public c1(com.tencent.mm.ui.tools.d1 d1Var) {
        this.f210309d = d1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f210309d.f210341d = true;
    }
}
