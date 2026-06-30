package oc4;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f344369a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f344370b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f344371c;

    public v(java.lang.String indicator, java.util.ArrayList feedList, java.util.ArrayList userNames) {
        kotlin.jvm.internal.o.g(indicator, "indicator");
        kotlin.jvm.internal.o.g(feedList, "feedList");
        kotlin.jvm.internal.o.g(userNames, "userNames");
        this.f344369a = indicator;
        this.f344370b = feedList;
        this.f344371c = userNames;
    }

    public final java.util.ArrayList a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedList", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedList", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return this.f344370b;
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return this.f344369a;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            return true;
        }
        if (!(obj instanceof oc4.v)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            return false;
        }
        oc4.v vVar = (oc4.v) obj;
        if (!kotlin.jvm.internal.o.b(this.f344369a, vVar.f344369a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f344370b, vVar.f344370b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f344371c, vVar.f344371c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        int hashCode = (((this.f344369a.hashCode() * 31) + this.f344370b.hashCode()) * 31) + this.f344371c.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        java.lang.String str = "SnsUnreadTier(indicator=" + this.f344369a + ", feedList=" + this.f344370b + ", userNames=" + this.f344371c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadTier");
        return str;
    }
}
