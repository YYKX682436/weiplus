package xf2;

/* loaded from: classes10.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f454309d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f454310e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f454311f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f454312g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView f454313h;

    /* renamed from: i, reason: collision with root package name */
    public int f454314i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f454313h = shellView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f454312g = obj;
        this.f454314i |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView.b(this.f454313h, this);
    }
}
