package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class m6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.n6 f210570d;

    public m6(com.tencent.mm.ui.tools.n6 n6Var) {
        this.f210570d = n6Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        g4Var.clear();
        java.util.Iterator it = ((java.util.ArrayList) this.f210570d.f210602e.f210726m.f228344d).iterator();
        while (it.hasNext()) {
            g4Var.v((android.view.MenuItem) it.next());
        }
    }
}
