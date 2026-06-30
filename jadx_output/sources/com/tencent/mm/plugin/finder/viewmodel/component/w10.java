package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w10(java.lang.String str, com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var) {
        super(0);
        this.f136289d = str;
        this.f136290e = f50Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f136289d);
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f136290e;
        j45.l.j(f50Var.getActivity(), "webview", ".ui.tools.WebViewUI", intent, null);
        f50Var.f134339e = null;
        return jz5.f0.f302826a;
    }
}
