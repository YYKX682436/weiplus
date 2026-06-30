package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f166028a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f166029b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f166030c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f166031d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f166032e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f166033f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f166034g;

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
            return true;
        }
        if (obj == null || com.tencent.mm.plugin.sns.storage.k.class != obj.getClass()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.k kVar = (com.tencent.mm.plugin.sns.storage.k) obj;
        boolean z17 = java.util.Objects.equals(this.f166028a, kVar.f166028a) && java.util.Objects.equals(this.f166029b, kVar.f166029b) && java.util.Objects.equals(this.f166030c, kVar.f166030c) && java.util.Objects.equals(this.f166031d, kVar.f166031d) && java.util.Objects.equals(this.f166032e, kVar.f166032e) && java.util.Objects.equals(this.f166033f, kVar.f166033f) && java.util.Objects.equals(this.f166034g, kVar.f166034g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
        return z17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
        int hash = java.util.Objects.hash(this.f166028a, this.f166029b, this.f166030c, this.f166031d, this.f166032e, this.f166033f, this.f166034g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.ADXml$AdCardTagItem");
        return hash;
    }
}
