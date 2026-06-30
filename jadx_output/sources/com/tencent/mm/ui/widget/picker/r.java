package com.tencent.mm.ui.widget.picker;

/* loaded from: classes3.dex */
public class r implements v51.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f212325a;

    public r(com.tencent.mm.ui.widget.picker.c0 c0Var) {
        this.f212325a = c0Var;
    }

    @Override // v51.c
    public void a(int i17) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f212325a;
        com.tencent.mm.ui.widget.picker.b0 b0Var = c0Var.C;
        if (b0Var != null) {
            ((com.tencent.mm.plugin.webview.ui.tools.newjsapi.hd) b0Var).a(i17);
        }
        if (c0Var.A) {
            return;
        }
        int value = c0Var.f212256q.getValue();
        int i18 = 0;
        for (int i19 = 0; i19 < value; i19++) {
            i18 += ((java.util.List) c0Var.f212254o.get(i19)).size();
        }
        c0Var.f212258s.setOptionsArray(c0Var.c(i18 + i17));
    }
}
