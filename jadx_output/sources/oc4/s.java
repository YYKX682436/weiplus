package oc4;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public boolean f344366a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f344367b;

    /* renamed from: c, reason: collision with root package name */
    public xc4.p f344368c;

    public s(boolean z17, boolean z18, xc4.p pVar, int i17, kotlin.jvm.internal.i iVar) {
        z18 = (i17 & 2) != 0 ? false : z18;
        pVar = (i17 & 4) != 0 ? null : pVar;
        this.f344366a = z17;
        this.f344367b = z18;
        this.f344368c = pVar;
    }

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        boolean z17 = this.f344366a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExpose", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return z17;
    }

    public final boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        boolean z17 = this.f344367b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return z17;
    }

    public final xc4.p c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        xc4.p pVar = this.f344368c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return pVar;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
            return true;
        }
        if (!(obj instanceof oc4.s)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
            return false;
        }
        oc4.s sVar = (oc4.s) obj;
        if (this.f344366a != sVar.f344366a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
            return false;
        }
        if (this.f344367b != sVar.f344367b) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f344368c, sVar.f344368c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        int hashCode = ((java.lang.Boolean.hashCode(this.f344366a) * 31) + java.lang.Boolean.hashCode(this.f344367b)) * 31;
        xc4.p pVar = this.f344368c;
        int hashCode2 = hashCode + (pVar == null ? 0 : pVar.hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        java.lang.String str = "SnsUnreadPair(expose=" + this.f344366a + ", indicator=" + this.f344367b + ", info=" + this.f344368c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.improve.component.unread.SnsUnreadPair");
        return str;
    }
}
