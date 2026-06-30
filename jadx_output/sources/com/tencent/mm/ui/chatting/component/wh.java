package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class wh implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f200174d;

    public wh(com.tencent.mm.ui.chatting.component.xh xhVar, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f200174d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f200174d.a();
    }
}
