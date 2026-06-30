package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes7.dex */
public class l1 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.m1 f139216n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.plugin.game.chatroom.view.m1 m1Var, android.content.Context context) {
        super(context);
        this.f139216n = m1Var;
    }

    @Override // androidx.recyclerview.widget.g3
    public android.graphics.PointF a(int i17) {
        return ((androidx.recyclerview.widget.LinearLayoutManager) this.f139216n.f139220d.getLayoutManager()).a(i17);
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void c() {
        this.f139216n.getClass();
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void d() {
        super.d();
        com.tencent.mm.plugin.game.chatroom.view.m1 m1Var = this.f139216n;
        com.tencent.mars.xlog.Log.i("GameChatRoom.CommonLineViewPagerHelper", "SmoothScrollerForFling onStop %d", java.lang.Integer.valueOf(m1Var.f139220d.getScrollState()));
        if (m1Var.f139220d.getScrollState() == 0) {
            m1Var.c();
        }
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return 40.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o1
    public int m() {
        return -1;
    }
}
