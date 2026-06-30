package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class r2 implements db5.j4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f184604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.v2 f184605b;

    public r2(com.tencent.mm.plugin.webview.ui.tools.fts.v2 v2Var, java.util.List list) {
        this.f184605b = v2Var;
        this.f184604a = list;
    }

    @Override // db5.j4
    public void a(android.widget.ImageView imageView, android.widget.ImageView imageView2, android.view.MenuItem menuItem) {
        n11.a.b().h(((su4.i2) this.f184604a.get(menuItem.getItemId())).f412931a, imageView, this.f184605b.f184669b);
    }
}
