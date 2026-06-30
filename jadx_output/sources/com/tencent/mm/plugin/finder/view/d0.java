package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.CollapsibleTextView f131865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f131866e;

    public d0(com.tencent.mm.plugin.finder.view.CollapsibleTextView collapsibleTextView, boolean z17) {
        this.f131865d = collapsibleTextView;
        this.f131866e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.CollapsibleTextView collapsibleTextView = this.f131865d;
        yz5.p onExpandStateChangeListener = collapsibleTextView.getOnExpandStateChangeListener();
        if (onExpandStateChangeListener != null) {
            onExpandStateChangeListener.invoke(java.lang.Boolean.valueOf(this.f131866e), java.lang.Boolean.valueOf(collapsibleTextView.f130821q.getVisibility() == 0));
        }
    }
}
