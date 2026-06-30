package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class s2 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f184612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f184613e;

    public s2(com.tencent.mm.plugin.webview.ui.tools.fts.v2 v2Var, java.util.List list, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f184612d = list;
        this.f184613e = k0Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        int i17 = 0;
        while (true) {
            java.util.List list = this.f184612d;
            if (i17 >= list.size()) {
                return;
            }
            su4.i2 i2Var = (su4.i2) list.get(i17);
            g4Var.p(i17, i2Var.f412932b, i2Var.f412933c, 0);
            if (i2Var.f412934d) {
                this.f184613e.f211851a2 = i17;
            }
            i17++;
        }
    }
}
