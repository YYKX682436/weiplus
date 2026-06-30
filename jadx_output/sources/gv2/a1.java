package gv2;

/* loaded from: classes5.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f275983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f275984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xj f275985f;

    public a1(android.view.View view, int i17, com.tencent.mm.ui.xj xjVar) {
        this.f275983d = view;
        this.f275984e = i17;
        this.f275985f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f275983d;
        view.getHitRect(rect);
        int i17 = this.f275984e;
        rect.inset(-i17, -i17);
        this.f275985f.a(new com.tencent.mm.ui.yj(rect, view));
    }
}
