package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class vx implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.tx f136275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f136276b;

    public vx(com.tencent.mm.plugin.finder.viewmodel.component.tx txVar, android.content.Context context) {
        this.f136275a = txVar;
        this.f136276b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f136275a.f136066d);
        j45.l.j(this.f136276b, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
