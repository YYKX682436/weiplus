package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class q1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd0.f f199733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.q2 f199734e;

    public q1(com.tencent.mm.ui.chatting.component.q2 q2Var, gd0.f fVar) {
        this.f199734e = q2Var;
        this.f199733d = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gd0.f fVar = this.f199733d;
        if (fVar != null) {
            ((com.tencent.mm.roomsdk.model.factory.h) fVar).a();
        }
        com.tencent.mm.roomsdk.model.factory.a aVar = this.f199734e.f199745q;
        if (aVar != null) {
            aVar.a();
        }
    }
}
