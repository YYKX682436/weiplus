package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class qo implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.l0 f199795d;

    public qo(com.tencent.mm.ui.chatting.component.jo joVar, t21.l0 l0Var) {
        this.f199795d = l0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f199795d.f414821b = null;
    }
}
