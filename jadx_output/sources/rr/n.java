package rr;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f399135a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f399136b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f399137c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f399138d;

    /* renamed from: e, reason: collision with root package name */
    public long f399139e;

    /* renamed from: f, reason: collision with root package name */
    public al5.u4 f399140f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f399141g;

    /* renamed from: h, reason: collision with root package name */
    public z12.g f399142h;

    public n(android.app.Activity context, android.view.ViewGroup container, java.lang.String str, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f399135a = context;
        this.f399136b = str;
        this.f399137c = emojiInfo;
        this.f399138d = "MicroMsg.EmojiCustomHelper";
        this.f399141g = new rr.i(this);
    }

    public static final void a(rr.n nVar, boolean z17) {
        pm0.v.C(nVar.f399141g);
        long j17 = nVar.f399139e;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        pm0.v.V(700 - (android.os.SystemClock.elapsedRealtime() - j17), new rr.m(nVar, z17));
    }

    public final void b() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11596, 4);
        db5.e1.j(this.f399135a, com.tencent.mm.R.string.c0g, com.tencent.mm.R.string.f490386tj, com.tencent.mm.R.string.byz, com.tencent.mm.R.string.f490347sg, new rr.j(this), rr.k.f399131d);
    }
}
