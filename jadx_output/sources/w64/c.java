package w64;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f443284a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f443285b;

    /* renamed from: c, reason: collision with root package name */
    public final int f443286c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.k4 f443287d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f443288e;

    /* renamed from: f, reason: collision with root package name */
    public final int f443289f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f443290g;

    /* renamed from: h, reason: collision with root package name */
    public final v64.d f443291h;

    public c(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        this(adClickActionInfo, snsInfo, i17, k4Var, false, 0, false, null, 240, null);
    }

    public c(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, com.tencent.mm.plugin.sns.model.k4 k4Var, boolean z17, int i18, boolean z18, v64.d dVar, int i19, kotlin.jvm.internal.i iVar) {
        i17 = (i19 & 4) != 0 ? 0 : i17;
        k4Var = (i19 & 8) != 0 ? null : k4Var;
        z17 = (i19 & 16) != 0 ? false : z17;
        i18 = (i19 & 32) != 0 ? 0 : i18;
        z18 = (i19 & 64) != 0 ? true : z18;
        dVar = (i19 & 128) != 0 ? null : dVar;
        this.f443284a = adClickActionInfo;
        this.f443285b = snsInfo;
        this.f443286c = i17;
        this.f443287d = k4Var;
        this.f443288e = z17;
        this.f443289f = i18;
        this.f443290g = z18;
        this.f443291h = dVar;
    }
}
