package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125693d;

    public f2(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        this.f125693d = finderFeedSearchUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f125693d.N1;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }
}
