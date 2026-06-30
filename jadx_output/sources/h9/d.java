package h9;

/* loaded from: classes15.dex */
public final class d extends h9.e {

    /* renamed from: c, reason: collision with root package name */
    public final int f279606c;

    /* renamed from: d, reason: collision with root package name */
    public final long f279607d;

    /* renamed from: e, reason: collision with root package name */
    public final long f279608e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f279609f;

    /* renamed from: g, reason: collision with root package name */
    public final int f279610g;

    /* renamed from: h, reason: collision with root package name */
    public final int f279611h;

    /* renamed from: i, reason: collision with root package name */
    public final int f279612i;

    /* renamed from: j, reason: collision with root package name */
    public final long f279613j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f279614k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f279615l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f279616m;

    /* renamed from: n, reason: collision with root package name */
    public final h9.c f279617n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f279618o;

    /* renamed from: p, reason: collision with root package name */
    public final long f279619p;

    public d(int i17, java.lang.String str, java.util.List list, long j17, long j18, boolean z17, int i18, int i19, int i27, long j19, boolean z18, boolean z19, boolean z27, h9.c cVar, java.util.List list2) {
        super(str, list);
        this.f279606c = i17;
        this.f279608e = j18;
        this.f279609f = z17;
        this.f279610g = i18;
        this.f279611h = i19;
        this.f279612i = i27;
        this.f279613j = j19;
        this.f279614k = z18;
        this.f279615l = z19;
        this.f279616m = z27;
        this.f279617n = cVar;
        this.f279618o = java.util.Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.f279619p = 0L;
        } else {
            h9.c cVar2 = (h9.c) list2.get(list2.size() - 1);
            this.f279619p = cVar2.f279600g + cVar2.f279598e;
        }
        this.f279607d = j17 == -9223372036854775807L ? -9223372036854775807L : j17 >= 0 ? j17 : this.f279619p + j17;
    }
}
