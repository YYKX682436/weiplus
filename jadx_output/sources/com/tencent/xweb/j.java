package com.tencent.xweb;

/* loaded from: classes13.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f220302a;

    /* renamed from: b, reason: collision with root package name */
    public final int f220303b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f220304c;

    /* renamed from: d, reason: collision with root package name */
    public final long f220305d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f220306e;

    /* renamed from: f, reason: collision with root package name */
    public int f220307f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f220308g;

    /* renamed from: h, reason: collision with root package name */
    public long f220309h = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f220310i = -1;

    /* renamed from: j, reason: collision with root package name */
    public long f220311j = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f220312k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f220313l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f220314m = com.eclipsesource.mmv8.Platform.UNKNOWN;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f220315n = com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE;

    /* renamed from: o, reason: collision with root package name */
    public long f220316o = -1;

    public j(int i17, java.lang.String str, long j17, java.lang.String str2, int i18, java.lang.String str3) {
        this.f220302a = "";
        this.f220303b = -1;
        this.f220304c = "";
        this.f220305d = -1L;
        this.f220306e = "";
        this.f220307f = -1;
        this.f220308g = "";
        this.f220302a = org.xwalk.core.XWalkEnvironment.m(com.eclipsesource.mmv8.Platform.UNKNOWN);
        this.f220303b = i17;
        this.f220304c = str;
        this.f220305d = j17;
        this.f220306e = str2;
        this.f220307f = i18;
        this.f220308g = str3;
    }

    public void a(long j17, long j18, int i17, java.lang.String str) {
        this.f220310i = j17;
        this.f220311j = j17 - this.f220309h;
        this.f220312k = j18 - this.f220316o;
        this.f220313l = i17;
        this.f220314m = str;
    }
}
