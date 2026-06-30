package db2;

/* loaded from: classes10.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f228043a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f228044b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f228045c;

    /* renamed from: d, reason: collision with root package name */
    public final int f228046d;

    /* renamed from: e, reason: collision with root package name */
    public final int f228047e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Long f228048f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Long f228049g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.nv2 f228050h;

    public k6(boolean z17, java.lang.String username, java.lang.String wxUsername, int i17, int i18, java.lang.Long l17, java.lang.Long l18, r45.nv2 nv2Var) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(wxUsername, "wxUsername");
        this.f228043a = z17;
        this.f228044b = username;
        this.f228045c = wxUsername;
        this.f228046d = i17;
        this.f228047e = i18;
        this.f228048f = l17;
        this.f228049g = l18;
        this.f228050h = nv2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z17) {
        com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent;
        boolean z18 = this.f228043a;
        if (z17) {
            z18 = !z18;
        }
        java.lang.Long l17 = this.f228048f;
        if (l17 != null) {
            long longValue = l17.longValue();
            com.tencent.mm.autogen.events.FinderMentionUpdateEvent finderMentionUpdateEvent = new com.tencent.mm.autogen.events.FinderMentionUpdateEvent();
            am.lc lcVar = finderMentionUpdateEvent.f54306g;
            lcVar.f7237b = longValue;
            lcVar.f7239d = 1;
            lcVar.f7238c = z18;
            finderThanksUpdateEvent = finderMentionUpdateEvent;
        } else {
            java.lang.Long l18 = this.f228049g;
            if (l18 == null) {
                return;
            }
            long longValue2 = l18.longValue();
            com.tencent.mm.autogen.events.FinderThanksUpdateEvent finderThanksUpdateEvent2 = new com.tencent.mm.autogen.events.FinderThanksUpdateEvent();
            java.lang.String str = this.f228045c;
            am.md mdVar = finderThanksUpdateEvent2.f54333g;
            mdVar.f7339c = str;
            mdVar.f7337a = longValue2;
            mdVar.f7340d = this.f228046d;
            mdVar.f7338b = z18;
            finderThanksUpdateEvent = finderThanksUpdateEvent2;
        }
        finderThanksUpdateEvent.e();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db2.k6)) {
            return false;
        }
        db2.k6 k6Var = (db2.k6) obj;
        return this.f228043a == k6Var.f228043a && kotlin.jvm.internal.o.b(this.f228044b, k6Var.f228044b) && kotlin.jvm.internal.o.b(this.f228045c, k6Var.f228045c) && this.f228046d == k6Var.f228046d && this.f228047e == k6Var.f228047e && kotlin.jvm.internal.o.b(this.f228048f, k6Var.f228048f) && kotlin.jvm.internal.o.b(this.f228049g, k6Var.f228049g) && kotlin.jvm.internal.o.b(this.f228050h, k6Var.f228050h);
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Boolean.hashCode(this.f228043a) * 31) + this.f228044b.hashCode()) * 31) + this.f228045c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f228046d)) * 31) + java.lang.Integer.hashCode(this.f228047e)) * 31;
        java.lang.Long l17 = this.f228048f;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.f228049g;
        int hashCode3 = (hashCode2 + (l18 == null ? 0 : l18.hashCode())) * 31;
        r45.nv2 nv2Var = this.f228050h;
        return hashCode3 + (nv2Var != null ? nv2Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ThankCGIParams(thanked=" + this.f228043a + ", username=" + this.f228044b + ", wxUsername=" + this.f228045c + ", interactionType=" + this.f228046d + ", thankScene=" + this.f228047e + ", mentionId=" + this.f228048f + ", objectId=" + this.f228049g + ", shareUserInfo=" + this.f228050h + ')';
    }

    public /* synthetic */ k6(boolean z17, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Long l17, java.lang.Long l18, r45.nv2 nv2Var, int i19, kotlin.jvm.internal.i iVar) {
        this(z17, str, str2, i17, i18, (i19 & 32) != 0 ? null : l17, (i19 & 64) != 0 ? null : l18, (i19 & 128) != 0 ? null : nv2Var);
    }
}
