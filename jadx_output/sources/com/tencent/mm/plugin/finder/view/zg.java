package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class zg implements al5.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderPostFooter f133466a;

    public zg(com.tencent.mm.plugin.finder.view.FinderPostFooter finderPostFooter) {
        this.f133466a = finderPostFooter;
    }

    @Override // al5.n1
    public final void a() {
        yz5.a backClickListener = this.f133466a.getBackClickListener();
        if (backClickListener != null) {
            backClickListener.invoke();
        }
    }
}
