package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes12.dex */
public class d extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI f138838d;

    public d(com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI gameImagePreviewUI) {
        this.f138838d = gameImagePreviewUI;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI gameImagePreviewUI = this.f138838d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(gameImagePreviewUI.f138827o)) {
            if (gameImagePreviewUI.f138826n == null) {
                gameImagePreviewUI.f138826n = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) gameImagePreviewUI.getContext(), 1, false);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var = gameImagePreviewUI.f138826n;
            k0Var.f211872n = new com.tencent.mm.plugin.game.chatroom.ui.i(gameImagePreviewUI);
            k0Var.f211881s = new com.tencent.mm.plugin.game.chatroom.ui.j(gameImagePreviewUI);
            k0Var.p(new com.tencent.mm.plugin.game.chatroom.ui.k(gameImagePreviewUI));
            if (!gameImagePreviewUI.getContext().isFinishing()) {
                gameImagePreviewUI.f138826n.v();
            }
        }
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        this.f138838d.finish();
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/game/chatroom/ui/GameImagePreviewUI$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
