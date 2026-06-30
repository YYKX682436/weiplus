package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class f3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr3.b0 f154311d;

    public f3(vr3.b0 b0Var) {
        this.f154311d = b0Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        r45.mm mmVar;
        java.util.LinkedList linkedList;
        vr3.b0 b0Var = this.f154311d;
        if (b0Var == null || (mmVar = b0Var.f439623d) == null || (linkedList = mmVar.f380640i) == null) {
            return;
        }
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            g4Var.f(i17, ((r45.mm) obj).f380637f);
            i17 = i18;
        }
    }
}
