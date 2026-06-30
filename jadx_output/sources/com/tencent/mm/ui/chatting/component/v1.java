package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class v1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f200104d;

    public v1(com.tencent.mm.ui.chatting.component.q2 q2Var, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f200104d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f200104d.a();
    }
}
