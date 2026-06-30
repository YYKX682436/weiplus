package xf2;

/* loaded from: classes10.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f454249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView f454250e;

    /* renamed from: f, reason: collision with root package name */
    public int f454251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView screenShotView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f454250e = screenShotView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f454249d = obj;
        this.f454251f |= Integer.MIN_VALUE;
        return this.f454250e.b(this);
    }
}
