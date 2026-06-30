package qm1;

/* loaded from: classes10.dex */
public final class a implements sm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm1.f f364681a;

    public a(qm1.f fVar) {
        this.f364681a = fVar;
    }

    @Override // sm1.a
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "onFooterShowEnd");
        qm1.f fVar = this.f364681a;
        fVar.f364695c = true;
        sm1.a aVar = fVar.f364703k;
        if (aVar != null) {
            aVar.a(i17);
        }
    }

    @Override // sm1.a
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "onFooterHideStart");
        sm1.a aVar = this.f364681a.f364703k;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // sm1.a
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "onEmoticonBoardHide");
        qm1.f fVar = this.f364681a;
        fVar.f364695c = false;
        sm1.a aVar = fVar.f364703k;
        if (aVar != null) {
            aVar.c();
        }
        fVar.g();
    }

    @Override // sm1.a
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "onEmoticonBoardShow");
        qm1.f fVar = this.f364681a;
        fVar.f364695c = true;
        sm1.a aVar = fVar.f364703k;
        if (aVar != null) {
            aVar.d();
        }
        android.widget.FrameLayout frameLayout = fVar.f364697e;
        if (frameLayout == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        }
        frameLayout.setLayoutParams(layoutParams);
    }

    @Override // sm1.a
    public void e(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "onKeyBoardShow height: " + i17);
        sm1.a aVar = this.f364681a.f364703k;
        if (aVar != null) {
            aVar.e(i17);
        }
    }

    @Override // sm1.a
    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "onKeyBoardHide");
        sm1.a aVar = this.f364681a.f364703k;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // sm1.a
    public void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "onFooterHideEnd");
        qm1.f fVar = this.f364681a;
        fVar.f364695c = false;
        sm1.a aVar = fVar.f364703k;
        if (aVar != null) {
            aVar.g();
        }
        fVar.g();
    }

    @Override // sm1.a
    public void h(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommentController", "onFooterShowStart footerHeight: " + i17);
        qm1.f fVar = this.f364681a;
        sm1.a aVar = fVar.f364703k;
        if (aVar != null) {
            aVar.h(i17);
        }
        android.widget.FrameLayout frameLayout = fVar.f364697e;
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
