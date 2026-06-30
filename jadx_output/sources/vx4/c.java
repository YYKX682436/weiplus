package vx4;

/* loaded from: classes8.dex */
public final class c extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public boolean f441315x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f441316y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ak3.c pageAdapter, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        super(pageAdapter);
        kotlin.jvm.internal.o.g(pageAdapter, "pageAdapter");
        kotlin.jvm.internal.o.g(webViewUI, "webViewUI");
        this.f441316y = jz5.h.b(new vx4.b(pageAdapter));
        jz5.h.b(new vx4.a(this));
    }

    @Override // jk3.b
    public boolean G() {
        return false;
    }

    @Override // jk3.b, jk3.e
    public void g(android.graphics.Bitmap bitmap) {
        if (this.f441315x) {
            super.g(bitmap);
        }
    }

    @Override // jk3.b, jk3.e
    public void j() {
    }

    @Override // jk3.b
    public void m(android.graphics.Bitmap bitmap) {
        if (this.f441315x) {
            super.m(bitmap);
        }
    }

    @Override // jk3.b
    public boolean t() {
        return true;
    }

    @Override // jk3.b
    public boolean w() {
        return true;
    }
}
