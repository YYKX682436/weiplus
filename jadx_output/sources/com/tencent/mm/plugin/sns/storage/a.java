package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f165911a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f165912b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f165913c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f165914d;

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADInfo$AdActionExtAppJump");
        java.lang.String str = "appId=" + this.f165911a + ", pkg=" + this.f165912b + ", appName=" + this.f165914d + ", pageUrl=" + this.f165913c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADInfo$AdActionExtAppJump");
        return str;
    }
}
