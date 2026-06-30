package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class yx implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.tx f136619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f136620b;

    public yx(com.tencent.mm.plugin.finder.viewmodel.component.tx txVar, android.content.Context context) {
        this.f136619a = txVar;
        this.f136620b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f136619a.f136066d);
        j45.l.j(this.f136620b, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
