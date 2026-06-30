package ju2;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f301848a;

    /* renamed from: b, reason: collision with root package name */
    public final long f301849b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderCommentInfo f301850c;

    /* renamed from: d, reason: collision with root package name */
    public final so2.f1 f301851d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f301852e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f301853f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f301854g;

    /* renamed from: h, reason: collision with root package name */
    public final int f301855h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.hn2 f301856i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.nv2 f301857j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1 f301858k;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1] */
    public v() {
        this.f301848a = 1;
        this.f301855h = 5;
        ?? r17 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderThanksUpdateEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f128487d;

            {
                this.f128487d = new java.lang.ref.WeakReference(this);
                this.__eventId = 1097932050;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
                am.md mdVar;
                java.lang.String str;
                com.tencent.mm.autogen.events.FinderThanksUpdateEvent event = finderThanksUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                ju2.v vVar = (ju2.v) this.f128487d.get();
                if (vVar == null || (mdVar = event.f54333g) == null) {
                    return false;
                }
                int i17 = mdVar.f7340d;
                java.lang.String str2 = vVar.f301854g;
                long j17 = vVar.f301849b;
                if (i17 != 6) {
                    if (i17 != 7 || (str = mdVar.f7339c) == null) {
                        return false;
                    }
                    long j18 = mdVar.f7337a;
                    if (j17 != j18 || !kotlin.jvm.internal.o.b(str, str2)) {
                        return false;
                    }
                    pm0.v.X(new ju2.u(j18, str, event, vVar));
                    return false;
                }
                java.lang.String str3 = mdVar.f7339c;
                if (str3 == null) {
                    return false;
                }
                long j19 = mdVar.f7337a;
                if (j17 != j19 || !kotlin.jvm.internal.o.b(str3, str2)) {
                    return false;
                }
                pm0.v.X(new ju2.t(j19, str3, event, vVar));
                return false;
            }
        };
        this.f301858k = r17;
        r17.alive();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1] */
    public v(boolean z17, long j17, java.lang.String wxUsername, int i17, ju2.w delegate, com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo, so2.f1 f1Var, int i18, r45.hn2 hn2Var, r45.nv2 nv2Var) {
        kotlin.jvm.internal.o.g(wxUsername, "wxUsername");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f301848a = 1;
        this.f301855h = 5;
        ?? r17 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderThanksUpdateEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f128487d;

            {
                this.f128487d = new java.lang.ref.WeakReference(this);
                this.__eventId = 1097932050;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
                am.md mdVar;
                java.lang.String str;
                com.tencent.mm.autogen.events.FinderThanksUpdateEvent event = finderThanksUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                ju2.v vVar = (ju2.v) this.f128487d.get();
                if (vVar == null || (mdVar = event.f54333g) == null) {
                    return false;
                }
                int i172 = mdVar.f7340d;
                java.lang.String str2 = vVar.f301854g;
                long j172 = vVar.f301849b;
                if (i172 != 6) {
                    if (i172 != 7 || (str = mdVar.f7339c) == null) {
                        return false;
                    }
                    long j18 = mdVar.f7337a;
                    if (j172 != j18 || !kotlin.jvm.internal.o.b(str, str2)) {
                        return false;
                    }
                    pm0.v.X(new ju2.u(j18, str, event, vVar));
                    return false;
                }
                java.lang.String str3 = mdVar.f7339c;
                if (str3 == null) {
                    return false;
                }
                long j19 = mdVar.f7337a;
                if (j172 != j19 || !kotlin.jvm.internal.o.b(str3, str2)) {
                    return false;
                }
                pm0.v.X(new ju2.t(j19, str3, event, vVar));
                return false;
            }
        };
        this.f301858k = r17;
        r17.alive();
        this.f301849b = j17;
        this.f301853f = z17;
        this.f301848a = i17;
        this.f301854g = wxUsername;
        this.f301850c = finderCommentInfo;
        this.f301851d = f1Var;
        this.f301855h = i18;
        this.f301856i = hn2Var;
        this.f301857j = nv2Var;
        this.f301852e = new java.lang.ref.WeakReference(delegate);
        com.tencent.mars.xlog.Log.i("FinderThanksButtonViewModel", "init with isThank:" + z17 + ", feedId:" + j17 + ", wxUsername:" + wxUsername + ", interactionType:" + i17 + ", commentInfo:" + finderCommentInfo + ", likeInfo:" + f1Var + ", thankForwardScene:" + i18 + ", thankInfo:" + hn2Var + ", shareUserInfo:" + nv2Var);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1] */
    public v(dm.pd mention, ju2.w delegate) {
        kotlin.jvm.internal.o.g(mention, "mention");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f301848a = 1;
        this.f301855h = 5;
        ?? r27 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderThanksUpdateEvent>(this, com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.finder.thanksbutton.FinderThanksButtonViewModel$thanksUpdateListener$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.ref.WeakReference f128487d;

            {
                this.f128487d = new java.lang.ref.WeakReference(this);
                this.__eventId = 1097932050;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent) {
                am.md mdVar;
                java.lang.String str;
                com.tencent.mm.autogen.events.FinderThanksUpdateEvent event = finderThanksUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                ju2.v vVar = (ju2.v) this.f128487d.get();
                if (vVar == null || (mdVar = event.f54333g) == null) {
                    return false;
                }
                int i172 = mdVar.f7340d;
                java.lang.String str2 = vVar.f301854g;
                long j172 = vVar.f301849b;
                if (i172 != 6) {
                    if (i172 != 7 || (str = mdVar.f7339c) == null) {
                        return false;
                    }
                    long j18 = mdVar.f7337a;
                    if (j172 != j18 || !kotlin.jvm.internal.o.b(str, str2)) {
                        return false;
                    }
                    pm0.v.X(new ju2.u(j18, str, event, vVar));
                    return false;
                }
                java.lang.String str3 = mdVar.f7339c;
                if (str3 == null) {
                    return false;
                }
                long j19 = mdVar.f7337a;
                if (j172 != j19 || !kotlin.jvm.internal.o.b(str3, str2)) {
                    return false;
                }
                pm0.v.X(new ju2.t(j19, str3, event, vVar));
                return false;
            }
        };
        this.f301858k = r27;
        r27.alive();
        this.f301853f = (mention.field_extFlag & 32) > 0;
        this.f301852e = new java.lang.ref.WeakReference(delegate);
        com.tencent.mars.xlog.Log.i("FinderThanksButtonViewModel", "init with mention:" + mention);
    }
}
