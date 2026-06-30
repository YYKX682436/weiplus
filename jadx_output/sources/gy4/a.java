package gy4;

/* loaded from: classes8.dex */
public final class a extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gy4.c f277585b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277586c;

    public a(gy4.c cVar, java.lang.String str) {
        this.f277585b = cVar;
        this.f277586c = str;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void m() {
        this.f277585b.f277589d.set(false);
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void n() {
        gy4.c cVar = this.f277585b;
        if (cVar.f277589d.get()) {
            cVar.T6().setMMTitle(this.f277586c);
        }
    }
}
