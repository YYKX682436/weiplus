package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class x0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f208227d;

    public x0(com.tencent.mm.pointers.PBool pBool) {
        this.f208227d = pBool;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f208227d.value = true;
    }
}
