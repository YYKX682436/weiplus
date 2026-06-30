package rb2;

/* loaded from: classes2.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f393668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.xj f393669f;

    public k0(android.view.View view, int i17, com.tencent.mm.ui.xj xjVar) {
        this.f393667d = view;
        this.f393668e = i17;
        this.f393669f = xjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = this.f393667d;
        view.getHitRect(rect);
        rect.left -= this.f393668e;
        this.f393669f.a(new com.tencent.mm.ui.yj(rect, view));
    }
}
