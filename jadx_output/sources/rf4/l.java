package rf4;

/* loaded from: classes4.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.CommentsContainer f395080d;

    public l(com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer) {
        this.f395080d = commentsContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.a onLoop = this.f395080d.getOnLoop();
        if (onLoop != null) {
            onLoop.invoke();
        }
    }
}
