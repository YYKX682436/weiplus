package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class h4 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentFooter f130258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f130259e;

    public h4(com.tencent.mm.plugin.finder.uniComments.UniCommentFooter uniCommentFooter, yz5.a aVar) {
        this.f130258d = uniCommentFooter;
        this.f130259e = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f130258d.getSmileyPanel().removeOnLayoutChangeListener(this);
        this.f130259e.invoke();
    }
}
