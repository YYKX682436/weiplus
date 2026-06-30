package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class o1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f207909d;

    public o1(com.tencent.mm.pointers.PBool pBool) {
        this.f207909d = pBool;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f207909d.value = true;
    }
}
