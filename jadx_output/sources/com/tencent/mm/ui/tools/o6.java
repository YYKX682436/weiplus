package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class o6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.p6 f210618d;

    public o6(com.tencent.mm.ui.tools.p6 p6Var) {
        this.f210618d = p6Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        java.util.Iterator it = ((java.util.ArrayList) this.f210618d.f210637e.f210726m.f228344d).iterator();
        while (it.hasNext()) {
            g4Var.v((android.view.MenuItem) it.next());
        }
    }
}
