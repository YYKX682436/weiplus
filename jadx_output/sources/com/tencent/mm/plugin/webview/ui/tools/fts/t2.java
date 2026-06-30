package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class t2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.c2 f184621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f184622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.v2 f184623f;

    public t2(com.tencent.mm.plugin.webview.ui.tools.fts.v2 v2Var, su4.c2 c2Var, int i17) {
        this.f184623f = v2Var;
        this.f184621d = c2Var;
        this.f184622e = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18 = this.f184622e;
        su4.c2 c2Var = this.f184621d;
        if (c2Var != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.fts.e0) c2Var).a(i17, i18);
        }
        ((java.util.HashMap) this.f184623f.f184668a).remove(java.lang.Integer.valueOf(i18));
    }
}
