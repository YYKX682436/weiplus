package gv2;

/* loaded from: classes5.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f276030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f276031e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xj f276032f;

    public j0(android.view.View view, int i17, com.tencent.mm.ui.xj xjVar) {
        this.f276030d = view;
        this.f276031e = i17;
        this.f276032f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f276030d;
        view.getHitRect(rect);
        int i17 = this.f276031e;
        rect.inset(-i17, -i17);
        this.f276032f.a(new com.tencent.mm.ui.yj(rect, view));
    }
}
