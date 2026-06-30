package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class a0 implements android.view.PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f207427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f207428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.BaseConversationUI f207429c;

    public a0(com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI, android.widget.ImageView imageView, android.view.ViewGroup viewGroup) {
        this.f207429c = baseConversationUI;
        this.f207427a = imageView;
        this.f207428b = viewGroup;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public void onPixelCopyFinished(int i17) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.ui.conversation.BaseConversationUI baseConversationUI = this.f207429c;
        bitmap = baseConversationUI.mPrepareBitmap;
        com.tencent.mm.ui.conversation.BaseConversationUI.access$1500(baseConversationUI, bitmap, this.f207427a, this.f207428b);
    }
}
