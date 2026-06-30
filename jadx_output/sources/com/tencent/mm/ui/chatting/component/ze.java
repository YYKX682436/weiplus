package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class ze implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public int f200371d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f200372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.pe f200373f;

    public ze(com.tencent.mm.ui.chatting.component.pe peVar, android.view.View view) {
        this.f200373f = peVar;
        this.f200372e = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (this.f200371d >= 2) {
            this.f200372e.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.HeaderComponent", "onPreDraw! return false");
        if (this.f200371d == 0) {
            this.f200373f.f198580d.M(true, false, false);
        }
        this.f200371d++;
        return false;
    }
}
