package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f132063d;

    public f4(com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView) {
        this.f132063d = finderCollapsibleTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = this.f132063d;
        finderCollapsibleTextView.h(finderCollapsibleTextView.isCollapse);
    }
}
