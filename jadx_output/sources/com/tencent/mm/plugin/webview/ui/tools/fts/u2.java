package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class u2 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.c2 f184632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.v2 f184634f;

    public u2(com.tencent.mm.plugin.webview.ui.tools.fts.v2 v2Var, su4.c2 c2Var, int i17) {
        this.f184634f = v2Var;
        this.f184632d = c2Var;
        this.f184633e = i17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        int i17 = this.f184633e;
        su4.c2 c2Var = this.f184632d;
        if (c2Var != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.fts.e0) c2Var).a(-1, i17);
        }
        ((java.util.HashMap) this.f184634f.f184668a).remove(java.lang.Integer.valueOf(i17));
    }
}
