package w22;

/* loaded from: classes10.dex */
public final class g implements r22.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f442530a;

    /* renamed from: b, reason: collision with root package name */
    public final r22.b f442531b;

    /* renamed from: c, reason: collision with root package name */
    public final y22.h f442532c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter f442533d;

    /* renamed from: e, reason: collision with root package name */
    public w22.b f442534e;

    /* renamed from: f, reason: collision with root package name */
    public long f442535f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f442536g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f442537h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f442538i;

    /* renamed from: j, reason: collision with root package name */
    public final u22.b f442539j;

    /* renamed from: k, reason: collision with root package name */
    public final k55.k f442540k;

    /* renamed from: l, reason: collision with root package name */
    public final x22.f f442541l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f442542m;

    public g(android.content.Context context, r22.b view, com.tencent.mm.modelcontrol.VideoTransPara videoPara, y22.h uiNavigation, com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter reporter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(videoPara, "videoPara");
        kotlin.jvm.internal.o.g(uiNavigation, "uiNavigation");
        kotlin.jvm.internal.o.g(reporter, "reporter");
        this.f442530a = context;
        this.f442531b = view;
        this.f442532c = uiNavigation;
        this.f442533d = reporter;
        this.f442534e = w22.b.f442521d;
        u22.b bVar = new u22.b();
        this.f442539j = bVar;
        k55.k kVar = new k55.k(context);
        this.f442540k = kVar;
        this.f442541l = new x22.f(new w22.f(this));
        this.f442542m = new com.tencent.mm.sdk.platformtools.b4(new w22.e(this), true);
        com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.createProxy(new com.tencent.mm.plugin.mmsight.model.CaptureMMProxy(kVar));
        kVar.a(w22.a.f442520d);
        int i17 = t22.o.f415103d;
        videoPara.f71191d = i17;
        videoPara.f71192e = i17;
        videoPara.f71194g = com.google.android.gms.common.util.GmsVersion.VERSION_LONGHORN;
        di3.f0 f0Var = di3.w.f232770d;
        f0Var.f232703d = com.google.android.gms.common.util.GmsVersion.VERSION_LONGHORN;
        f0Var.f232701b = videoPara;
        bVar.f423974a = reporter.G;
        bVar.f423975b = reporter.f98583d;
    }
}
