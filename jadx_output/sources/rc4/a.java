package rc4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f394121a;

    /* renamed from: b, reason: collision with root package name */
    public int f394122b;

    /* renamed from: c, reason: collision with root package name */
    public int f394123c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f394124d;

    /* renamed from: e, reason: collision with root package name */
    public int f394125e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f394126f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f394127g;

    /* renamed from: h, reason: collision with root package name */
    public int f394128h;

    public a(long j17, int i17, int i18, java.lang.String nextPageFeedid, int i19, java.lang.String show_username, java.lang.String tips_uuid, int i27, int i28, kotlin.jvm.internal.i iVar) {
        j17 = (i28 & 1) != 0 ? 0L : j17;
        i17 = (i28 & 2) != 0 ? 0 : i17;
        i18 = (i28 & 4) != 0 ? 0 : i18;
        nextPageFeedid = (i28 & 8) != 0 ? "" : nextPageFeedid;
        i19 = (i28 & 16) != 0 ? 6 : i19;
        show_username = (i28 & 32) != 0 ? "" : show_username;
        tips_uuid = (i28 & 64) != 0 ? "" : tips_uuid;
        i27 = (i28 & 128) != 0 ? 0 : i27;
        kotlin.jvm.internal.o.g(nextPageFeedid, "nextPageFeedid");
        kotlin.jvm.internal.o.g(show_username, "show_username");
        kotlin.jvm.internal.o.g(tips_uuid, "tips_uuid");
        this.f394121a = j17;
        this.f394122b = i17;
        this.f394123c = i18;
        this.f394124d = nextPageFeedid;
        this.f394125e = i19;
        this.f394126f = show_username;
        this.f394127g = tips_uuid;
        this.f394128h = i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getReportData$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.util.ArrayList arrayList = rc4.e.f394140e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getReportData$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        arrayList.add(this);
    }

    public final int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        int i17 = this.f394122b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposeCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        return i17;
    }

    public final void b(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFinderbar_unexpose_reason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        this.f394125e = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFinderbar_unexpose_reason", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return true;
        }
        if (!(obj instanceof rc4.a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        rc4.a aVar = (rc4.a) obj;
        if (this.f394121a != aVar.f394121a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (this.f394122b != aVar.f394122b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (this.f394123c != aVar.f394123c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f394124d, aVar.f394124d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (this.f394125e != aVar.f394125e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f394126f, aVar.f394126f)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f394127g, aVar.f394127g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            return false;
        }
        int i17 = this.f394128h;
        int i18 = aVar.f394128h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        return i17 == i18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        int hashCode = (((((((((((((java.lang.Long.hashCode(this.f394121a) * 31) + java.lang.Integer.hashCode(this.f394122b)) * 31) + java.lang.Integer.hashCode(this.f394123c)) * 31) + this.f394124d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f394125e)) * 31) + this.f394126f.hashCode()) * 31) + this.f394127g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f394128h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        java.lang.String str = "TierReportData(indicator=" + this.f394121a + ", exposeCount=" + this.f394122b + ", clickCount=" + this.f394123c + ", nextPageFeedid=" + this.f394124d + ", finderbar_unexpose_reason=" + this.f394125e + ", show_username=" + this.f394126f + ", tips_uuid=" + this.f394127g + ", content_type=" + this.f394128h + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        return str;
    }
}
