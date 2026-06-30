package com.tencent.mm.ui.widget.picker;

/* loaded from: classes3.dex */
public class p implements v51.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f212308a;

    public p(com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f212308a = c0Var;
    }

    @Override // v51.c
    public void a(int i17) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f212308a;
        com.tencent.mm.ui.widget.picker.y yVar = c0Var.B;
        if (yVar != null) {
            yVar.a(i17);
        }
        if (c0Var.A) {
            return;
        }
        c0Var.f212257r.setOptionsArray(c0Var.a(i17));
        if (c0Var.f212255p == null || c0Var.f212258s == null) {
            return;
        }
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            i18 += ((java.util.List) c0Var.f212254o.get(i19)).size();
        }
        c0Var.f212258s.setOptionsArray(c0Var.c(i18 + c0Var.f212257r.getValue()));
    }
}
