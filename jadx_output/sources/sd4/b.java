package sd4;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f406689a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f406690b;

    public b(int i17, java.lang.String scrollWord, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? -1 : i17;
        scrollWord = (i18 & 2) != 0 ? "idle" : scrollWord;
        kotlin.jvm.internal.o.g(scrollWord, "scrollWord");
        this.f406689a = i17;
        this.f406690b = scrollWord;
    }

    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f406690b = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScrollWord", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            return true;
        }
        if (!(obj instanceof sd4.b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            return false;
        }
        sd4.b bVar = (sd4.b) obj;
        if (this.f406689a != bVar.f406689a) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f406690b, bVar.f406690b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        int hashCode = (java.lang.Integer.hashCode(this.f406689a) * 31) + this.f406690b.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        java.lang.String str = "ScrollState(scrollState=" + this.f406689a + ", scrollWord=" + this.f406690b + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ui.monitor.ScrollState");
        return str;
    }
}
