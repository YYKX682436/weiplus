package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class g1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f207687d;

    public g1(com.tencent.mm.pointers.PBool pBool) {
        this.f207687d = pBool;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f207687d.value = true;
    }
}
