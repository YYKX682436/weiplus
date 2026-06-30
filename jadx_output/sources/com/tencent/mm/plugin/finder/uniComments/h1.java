package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes5.dex */
public final class h1 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f130256e;

    public h1(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter, yz5.a aVar) {
        this.f130255d = textStatusCommentFooter;
        this.f130256e = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f130255d.getSmileyPanel().removeOnLayoutChangeListener(this);
        this.f130256e.invoke();
    }
}
