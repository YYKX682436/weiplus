package wk4;

/* loaded from: classes10.dex */
public final class a implements yk4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wk4.f f446959a;

    public a(wk4.f fVar) {
        this.f446959a = fVar;
    }

    @Override // yk4.a
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "onFooterShowEnd");
        wk4.f fVar = this.f446959a;
        fVar.f446973c = true;
        yk4.a aVar = fVar.f446981k;
        if (aVar != null) {
            aVar.a(i17);
        }
    }

    @Override // yk4.a
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "onFooterHideStart");
        yk4.a aVar = this.f446959a.f446981k;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // yk4.a
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "onEmoticonBoardHide");
        wk4.f fVar = this.f446959a;
        fVar.f446973c = false;
        yk4.a aVar = fVar.f446981k;
        if (aVar != null) {
            aVar.c();
        }
        fVar.g();
    }

    @Override // yk4.a
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "onEmoticonBoardShow");
        wk4.f fVar = this.f446959a;
        fVar.f446973c = true;
        yk4.a aVar = fVar.f446981k;
        if (aVar != null) {
            aVar.d();
        }
        android.widget.FrameLayout frameLayout = fVar.f446975e;
        if (frameLayout == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        }
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // yk4.a
    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "onKeyBoardShow height: " + i17);
        yk4.a aVar = this.f446959a.f446981k;
        if (aVar != null) {
            aVar.e(i17);
        }
    }

    @Override // yk4.a
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "onKeyBoardHide");
        yk4.a aVar = this.f446959a.f446981k;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // yk4.a
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "onFooterHideEnd");
        wk4.f fVar = this.f446959a;
        fVar.f446973c = false;
        yk4.a aVar = fVar.f446981k;
        if (aVar != null) {
            aVar.g();
        }
        fVar.g();
    }

    @Override // yk4.a
    public void h(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingCommentController", "onFooterShowStart footerHeight: " + i17);
        wk4.f fVar = this.f446959a;
        yk4.a aVar = fVar.f446981k;
        if (aVar != null) {
            aVar.h(i17);
        }
        android.widget.FrameLayout frameLayout = fVar.f446975e;
        if (frameLayout == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        }
        frameLayout.setLayoutParams(layoutParams);
    }
}
