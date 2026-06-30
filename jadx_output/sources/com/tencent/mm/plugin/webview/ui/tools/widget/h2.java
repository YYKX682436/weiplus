package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class h2 extends com.tencent.xweb.z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f187244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.z f187245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p2 f187246c;

    public h2(com.tencent.mm.plugin.webview.ui.tools.widget.p2 p2Var, com.tencent.xweb.z zVar) {
        this.f187246c = p2Var;
        this.f187245b = zVar;
        p2Var.f187493d.add(this);
        this.f187244a = false;
    }

    @Override // com.tencent.xweb.z
    public void a() {
        if (!this.f187244a) {
            this.f187245b.a();
            this.f187244a = true;
        }
        this.f187246c.f187493d.remove(this);
    }

    @Override // com.tencent.xweb.z
    public void b() {
        if (!this.f187244a) {
            this.f187245b.b();
            this.f187244a = true;
        }
        this.f187246c.f187493d.remove(this);
    }
}
