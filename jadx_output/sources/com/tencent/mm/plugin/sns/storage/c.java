package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f165942a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f165943b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f165944c;

    /* renamed from: d, reason: collision with root package name */
    public int f165945d;

    /* renamed from: e, reason: collision with root package name */
    public int f165946e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f165947f;

    /* renamed from: g, reason: collision with root package name */
    public long f165948g;

    /* renamed from: h, reason: collision with root package name */
    public long f165949h;

    public c(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f165942a = "";
        this.f165943b = "";
        this.f165944c = "";
        this.f165945d = 0;
        this.f165947f = new java.util.LinkedList();
        this.f165948g = 0L;
        this.f165949h = 0L;
        this.f165942a = str;
        this.f165943b = str2;
        this.f165944c = str3;
        this.f165945d = i17;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo$AdUnlikeReason");
        java.lang.String str = "AdUnlikeReason{, reasonIdCount=" + this.f165946e + ", reasonIdList=" + this.f165947f + ", unlikeStartTime=" + this.f165948g + ", unlikeEndTime=" + this.f165949h + '}';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo$AdUnlikeReason");
        return str;
    }

    public c() {
        this.f165942a = "";
        this.f165943b = "";
        this.f165944c = "";
        this.f165945d = 0;
        this.f165947f = new java.util.LinkedList();
        this.f165948g = 0L;
        this.f165949h = 0L;
    }
}
