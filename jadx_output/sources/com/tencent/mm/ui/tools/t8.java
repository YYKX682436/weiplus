package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class t8 implements com.tencent.mm.ui.tools.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c9 f210774a;

    public t8(com.tencent.mm.ui.tools.c9 c9Var) {
        this.f210774a = c9Var;
    }

    @Override // com.tencent.mm.ui.tools.p
    public void a() {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.ui.tools.c9 c9Var = this.f210774a;
        if (!c9Var.f210317b) {
            com.tencent.mm.ui.tools.z8 z8Var = c9Var.f210332q;
            if (z8Var != null) {
                z8Var.collapseActionView();
                return;
            }
            return;
        }
        if (c9Var.f210321f != null) {
            try {
                if (u75.b.c() && com.tencent.mm.ui.bk.v0() && (viewGroup = (android.view.ViewGroup) c9Var.f210321f.getActionView().getParent()) != null) {
                    viewGroup.removeView(viewGroup.findViewById(com.tencent.mm.R.id.cob));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        com.tencent.mm.ui.tools.z8 z8Var2 = c9Var.f210332q;
        if (z8Var2 != null) {
            z8Var2.collapseActionView();
        }
    }
}
