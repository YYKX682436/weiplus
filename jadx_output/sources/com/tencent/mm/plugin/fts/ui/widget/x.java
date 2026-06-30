package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class x implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g23.f f138344d;

    public x(g23.f fVar) {
        this.f138344d = fVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        g23.f fVar = this.f138344d;
        int size = ((java.util.ArrayList) fVar.f267913f).size();
        for (int i17 = 0; i17 < size; i17++) {
            g23.i iVar = (g23.i) ((java.util.ArrayList) fVar.f267913f).get(i17);
            kotlin.jvm.internal.o.d(g4Var);
            g4Var.f(i17, iVar.f267923a);
        }
    }
}
