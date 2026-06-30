package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class h7 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f132214e;

    public h7(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter, yz5.a aVar) {
        this.f132213d = finderCommentFooter;
        this.f132214e = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f132213d.getSmileyPanel().removeOnLayoutChangeListener(this);
        this.f132214e.invoke();
    }
}
