package qm3;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public volatile rm5.k f364759a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f364760b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f364761c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f364762d;

    /* renamed from: e, reason: collision with root package name */
    public final u26.t f364763e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f364764f;

    public a(rm5.k kVar, java.util.Set pending, java.util.Set requesting, java.util.Set readyTimes, u26.t channel, kotlinx.coroutines.r2 r2Var, int i17, kotlin.jvm.internal.i iVar) {
        kVar = (i17 & 1) != 0 ? null : kVar;
        pending = (i17 & 2) != 0 ? new java.util.HashSet() : pending;
        requesting = (i17 & 4) != 0 ? new java.util.HashSet() : requesting;
        readyTimes = (i17 & 8) != 0 ? new java.util.HashSet() : readyTimes;
        channel = (i17 & 16) != 0 ? new u26.q(10) : channel;
        r2Var = (i17 & 32) != 0 ? null : r2Var;
        kotlin.jvm.internal.o.g(pending, "pending");
        kotlin.jvm.internal.o.g(requesting, "requesting");
        kotlin.jvm.internal.o.g(readyTimes, "readyTimes");
        kotlin.jvm.internal.o.g(channel, "channel");
        this.f364759a = kVar;
        this.f364760b = pending;
        this.f364761c = requesting;
        this.f364762d = readyTimes;
        this.f364763e = channel;
        this.f364764f = r2Var;
    }
}
