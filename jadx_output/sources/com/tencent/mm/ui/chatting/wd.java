package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class wd implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f206222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.TextPreviewUI f206223e;

    public wd(com.tencent.mm.ui.chatting.TextPreviewUI textPreviewUI, com.tencent.mm.storage.f9 f9Var) {
        this.f206223e = textPreviewUI;
        this.f206222d = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        pj5.k.f355386a.d(this.f206223e.getContext(), this.f206222d, 1);
    }
}
