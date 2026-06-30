package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class l1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd0.f f199391d;

    public l1(com.tencent.mm.ui.chatting.component.q2 q2Var, gd0.f fVar) {
        this.f199391d = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gd0.f fVar = this.f199391d;
        if (fVar != null) {
            ((com.tencent.mm.roomsdk.model.factory.h) fVar).a();
        }
    }
}
