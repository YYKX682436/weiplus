package sm1;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.comment.view.BizCommentFooter f409337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f409338e;

    public u(com.tencent.mm.plugin.audio.comment.view.BizCommentFooter bizCommentFooter, yz5.a aVar) {
        this.f409337d = bizCommentFooter;
        this.f409338e = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.f409337d.getSmileyPanel().removeOnLayoutChangeListener(this);
        this.f409338e.invoke();
    }
}
