package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class ua implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210821d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210822e;

    public ua(com.tencent.mm.ui.tools.ShowImageUI showImageUI, android.view.View view) {
        this.f210822e = showImageUI;
        this.f210821d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f210821d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.tencent.mm.ui.tools.ShowImageUI.T6(this.f210822e);
    }
}
