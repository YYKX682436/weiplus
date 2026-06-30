package xf2;

/* loaded from: classes10.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f454258d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f454259e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f454260f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f454261g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f454262h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f454263i;

    /* renamed from: m, reason: collision with root package name */
    public int f454264m;

    /* renamed from: n, reason: collision with root package name */
    public float f454265n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f454266o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView f454267p;

    /* renamed from: q, reason: collision with root package name */
    public int f454268q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView screenShotView, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f454267p = screenShotView;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f454266o = obj;
        this.f454268q |= Integer.MIN_VALUE;
        return this.f454267p.c(null, null, null, null, false, false, this);
    }
}
