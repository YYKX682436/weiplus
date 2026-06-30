package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI f207451d;

    public b(com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI appBrandServiceConversationFmUI) {
        this.f207451d = appBrandServiceConversationFmUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f207451d.isDeleteCancel = true;
    }
}
