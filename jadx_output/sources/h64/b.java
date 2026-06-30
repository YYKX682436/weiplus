package h64;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f279312a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f279313b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f279314c;

    /* renamed from: d, reason: collision with root package name */
    public final int f279315d;

    /* renamed from: e, reason: collision with root package name */
    public final int f279316e;

    /* renamed from: f, reason: collision with root package name */
    public final int f279317f;

    /* renamed from: g, reason: collision with root package name */
    public final org.json.JSONObject f279318g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f279319h;

    public b(java.lang.String frameSetName, java.lang.String id6, java.lang.String linkId, int i17, int i18, int i19, org.json.JSONObject components, java.lang.String compDsl) {
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(linkId, "linkId");
        kotlin.jvm.internal.o.g(components, "components");
        kotlin.jvm.internal.o.g(compDsl, "compDsl");
        this.f279312a = frameSetName;
        this.f279313b = id6;
        this.f279314c = linkId;
        this.f279315d = i17;
        this.f279316e = i18;
        this.f279317f = i19;
        this.f279318g = components;
        this.f279319h = compDsl;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        return this.f279313b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            return true;
        }
        if (!(obj instanceof h64.b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            return false;
        }
        h64.b bVar = (h64.b) obj;
        if (!kotlin.jvm.internal.o.b(this.f279312a, bVar.f279312a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279313b, bVar.f279313b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279314c, bVar.f279314c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            return false;
        }
        if (this.f279315d != bVar.f279315d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            return false;
        }
        if (this.f279316e != bVar.f279316e) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            return false;
        }
        if (this.f279317f != bVar.f279317f) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f279318g, bVar.f279318g)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f279319h, bVar.f279319h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        int hashCode = (((((((((((((this.f279312a.hashCode() * 31) + this.f279313b.hashCode()) * 31) + this.f279314c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f279315d)) * 31) + java.lang.Integer.hashCode(this.f279316e)) * 31) + java.lang.Integer.hashCode(this.f279317f)) * 31) + this.f279318g.hashCode()) * 31) + this.f279319h.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        return hashCode;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        java.lang.String str = "MBNodeInfo(frameSetName=" + this.f279312a + ", id=" + this.f279313b + ", linkId=" + this.f279314c + ", width=" + this.f279315d + ", height=" + this.f279316e + ", fullScreen=" + this.f279317f + ", components=" + this.f279318g + ", compDsl=" + this.f279319h + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        return str;
    }
}
