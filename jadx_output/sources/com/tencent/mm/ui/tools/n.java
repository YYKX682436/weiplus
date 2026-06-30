package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class n implements android.view.ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.o f210586a;

    public n(com.tencent.mm.ui.tools.o oVar) {
        this.f210586a = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z17) {
        com.tencent.mm.ui.tools.o oVar = this.f210586a;
        if (z17) {
            oVar.f210610d.l();
        }
        oVar.f210610d.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
    }
}
