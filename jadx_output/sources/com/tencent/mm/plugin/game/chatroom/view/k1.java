package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes7.dex */
public class k1 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.m1 f139200n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.game.chatroom.view.m1 m1Var, android.content.Context context) {
        super(context);
        this.f139200n = m1Var;
    }

    @Override // androidx.recyclerview.widget.g3
    public android.graphics.PointF a(int i17) {
        return ((androidx.recyclerview.widget.LinearLayoutManager) this.f139200n.f139220d.getLayoutManager()).a(i17);
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void c() {
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void d() {
        super.d();
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        return 80.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.o1
    public int l(int i17) {
        return super.l(i17);
    }

    @Override // androidx.recyclerview.widget.o1
    public int m() {
        return -1;
    }
}
