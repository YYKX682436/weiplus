package gv2;

/* loaded from: classes5.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f276019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f276020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xj f276021f;

    public h(android.view.View view, int i17, com.tencent.mm.ui.xj xjVar) {
        this.f276019d = view;
        this.f276020e = i17;
        this.f276021f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f276019d;
        view.getHitRect(rect);
        int i17 = this.f276020e;
        rect.inset(-i17, -i17);
        this.f276021f.a(new com.tencent.mm.ui.yj(rect, view));
    }
}
