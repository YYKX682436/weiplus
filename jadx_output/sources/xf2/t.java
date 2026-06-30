package xf2;

/* loaded from: classes10.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f454299d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f454300e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f454301f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f454302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView f454303h;

    /* renamed from: i, reason: collision with root package name */
    public int f454304i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f454303h = shellView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f454302g = obj;
        this.f454304i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView.a(this.f454303h, this);
    }
}
