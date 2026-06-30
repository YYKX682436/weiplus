package nv2;

/* loaded from: classes10.dex */
public final class b2 extends nv2.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f340457d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f340458e;

    /* renamed from: f, reason: collision with root package name */
    public final int f340459f;

    /* renamed from: g, reason: collision with root package name */
    public final int f340460g;

    /* renamed from: h, reason: collision with root package name */
    public final int f340461h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.qt2 f340462i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.nv2 f340463j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Long f340464k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Long f340465l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(java.lang.String username, java.lang.String wxUsername, int i17, int i18, int i19, r45.qt2 qt2Var, r45.nv2 nv2Var) {
        super(null);
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(wxUsername, "wxUsername");
        this.f340457d = username;
        this.f340458e = wxUsername;
        this.f340459f = i17;
        this.f340460g = i18;
        this.f340461h = i19;
        this.f340462i = qt2Var;
        this.f340463j = nv2Var;
    }

    @Override // nv2.r
    public void a(nv2.o1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.a(callback);
        new db2.t3(new db2.k6(this.f340459f == 1, this.f340457d, this.f340458e, this.f340460g, this.f340461h, this.f340464k, this.f340465l, this.f340463j), this.f340462i).l().K(new nv2.a2(callback, this));
    }

    @Override // nv2.r
    public java.lang.String c() {
        return "id_" + this.f340457d + '_' + this.f340458e + '_' + this.f340464k + '_' + this.f340465l + '_' + this.f340461h + '_' + this.f340459f + '_' + this.f340460g;
    }

    public final com.tencent.mm.sdk.event.IEvent d(boolean z17) {
        boolean z18 = this.f340459f == 1;
        if (!z17) {
            z18 = !z18;
        }
        java.lang.Long l17 = this.f340464k;
        if (l17 != null) {
            long longValue = l17.longValue();
            com.tencent.mm.autogen.events.FinderMentionUpdateEvent finderMentionUpdateEvent = new com.tencent.mm.autogen.events.FinderMentionUpdateEvent();
            am.lc lcVar = finderMentionUpdateEvent.f54306g;
            lcVar.f7237b = longValue;
            lcVar.f7239d = 1;
            lcVar.f7238c = z18;
            return finderMentionUpdateEvent;
        }
        java.lang.Long l18 = this.f340465l;
        if (l18 == null) {
            return null;
        }
        long longValue2 = l18.longValue();
        com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent = new com.tencent.mm.autogen.events.FinderThanksUpdateEvent();
        java.lang.String str = this.f340458e;
        am.md mdVar = finderThanksUpdateEvent.f54333g;
        mdVar.f7339c = str;
        mdVar.f7337a = longValue2;
        mdVar.f7340d = this.f340460g;
        mdVar.f7338b = z18;
        return finderThanksUpdateEvent;
    }

    public java.lang.String toString() {
        return "action_" + this.f340457d + '_' + this.f340458e + '_' + this.f340459f + '_' + this.f340575c + '_' + this.f340464k + '_' + this.f340465l + '_' + this.f340461h + '_' + this.f340460g;
    }

    public /* synthetic */ b2(java.lang.String str, java.lang.String str2, int i17, int i18, int i19, r45.qt2 qt2Var, r45.nv2 nv2Var, int i27, kotlin.jvm.internal.i iVar) {
        this(str, str2, i17, i18, i19, (i27 & 32) != 0 ? null : qt2Var, (i27 & 64) != 0 ? null : nv2Var);
    }
}
