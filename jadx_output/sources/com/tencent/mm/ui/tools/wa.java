package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class wa implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210886a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210887b;

    public wa(com.tencent.mm.ui.tools.ShowImageUI showImageUI, java.lang.String str) {
        this.f210887b = showImageUI;
        this.f210886a = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            g45.b.f268846a.a(this.f210886a, str, 0);
            tg3.a1 a17 = tg3.t1.a();
            com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210887b;
            ((dk5.s5) a17).Vi(showImageUI.getContext(), this.f210886a, showImageUI.f210196i, 1, "", "", null);
            com.tencent.mm.ui.widget.snackbar.j.c(showImageUI.getContext().getString(com.tencent.mm.R.string.fw6), null, showImageUI.getContext(), null, null);
        }
    }
}
