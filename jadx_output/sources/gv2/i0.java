package gv2;

/* loaded from: classes5.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f276026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f276027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xj f276028f;

    public i0(android.view.View view, int i17, com.tencent.mm.ui.xj xjVar) {
        this.f276026d = view;
        this.f276027e = i17;
        this.f276028f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f276026d;
        view.getHitRect(rect);
        int i17 = this.f276027e;
        rect.inset(-i17, -i17);
        this.f276028f.a(new com.tencent.mm.ui.yj(rect, view));
    }
}
