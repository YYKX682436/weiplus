package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f187407e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.p3 f187408f;

    public m3(com.tencent.mm.plugin.webview.ui.tools.widget.p3 p3Var, java.lang.String str, int i17) {
        this.f187408f = p3Var;
        this.f187406d = str;
        this.f187407e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f187408f.f187495f.f187554g;
        if (nVar != null) {
            nVar.s0(this.f187406d, this.f187407e);
        }
    }
}
