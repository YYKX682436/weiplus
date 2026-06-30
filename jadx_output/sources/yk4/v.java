package yk4;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.comment.view.TingCommentFooter f462857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f462858e;

    public v(com.tencent.mm.plugin.ting.comment.view.TingCommentFooter tingCommentFooter, yz5.a aVar) {
        this.f462857d = tingCommentFooter;
        this.f462858e = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f462857d.getSmileyPanel().removeOnLayoutChangeListener(this);
        this.f462858e.invoke();
    }
}
