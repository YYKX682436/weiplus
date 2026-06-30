package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes12.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f189653a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f189654b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f189655c;

    /* renamed from: d, reason: collision with root package name */
    public final int f189656d;

    /* renamed from: e, reason: collision with root package name */
    public final int f189657e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f189658f;

    /* renamed from: g, reason: collision with root package name */
    public final long f189659g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f189660h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f189661i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f189662j;

    /* renamed from: k, reason: collision with root package name */
    public final int f189663k;

    /* renamed from: l, reason: collision with root package name */
    public volatile int f189664l;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, long j17, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i19) {
        this.f189653a = str;
        this.f189654b = str2;
        this.f189655c = str3;
        this.f189656d = i17;
        this.f189657e = i18;
        this.f189664l = i18;
        this.f189658f = str4;
        this.f189659g = j17;
        this.f189661i = str6;
        this.f189662j = str7;
        this.f189660h = str5;
        this.f189663k = i19;
    }

    public java.lang.String toString() {
        return "BaseResDownloadRequest | urlKey='" + this.f189654b + "', networkType=" + this.f189656d + ", expireTime=" + this.f189659g + ", fileVersion=" + this.f189655c + ", maxRetryTimes=" + this.f189657e + ", md5='" + this.f189660h + "', groupId1='" + this.f189661i + "', groupId2='" + this.f189662j + "', filePath='" + this.f189658f + "', retryTimes=" + this.f189664l + ", status=0, priority=" + this.f189663k;
    }
}
