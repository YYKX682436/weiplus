package com.tencent.mm.ui.contact;

/* loaded from: classes.dex */
public class t9 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.roomsdk.model.factory.a f207197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f207198e;

    public t9(com.tencent.mm.ui.contact.SelectContactUI selectContactUI, com.tencent.mm.roomsdk.model.factory.a aVar) {
        this.f207198e = selectContactUI;
        this.f207197d = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f207198e.O1 = false;
        this.f207197d.a();
    }
}
