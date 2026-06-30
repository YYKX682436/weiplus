package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public final class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView f139271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f139272e;

    public q3(com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView joinRoomExternalConfirmView, android.graphics.Bitmap bitmap) {
        this.f139271d = joinRoomExternalConfirmView;
        this.f139272e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.game.chatroom.view.JoinRoomExternalConfirmView joinRoomExternalConfirmView = this.f139271d;
        joinRoomExternalConfirmView.f138998f.f451643b.getLayoutParams().width = joinRoomExternalConfirmView.getWidth();
        joinRoomExternalConfirmView.f138998f.f451643b.getLayoutParams().height = joinRoomExternalConfirmView.getHeight();
        joinRoomExternalConfirmView.f138998f.f451643b.requestLayout();
        android.graphics.Bitmap bitmap = this.f139272e;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        joinRoomExternalConfirmView.f138998f.f451643b.setImageBitmap(bitmap);
    }
}
