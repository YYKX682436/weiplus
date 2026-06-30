package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes7.dex */
public abstract class u implements com.tencent.mm.pluginsdk.res.downloader.model.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f189712a;

    /* renamed from: b, reason: collision with root package name */
    public final int f189713b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f189714c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f189715d;

    /* renamed from: e, reason: collision with root package name */
    public final int f189716e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f189717f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f189718g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public volatile int f189719h = 15000;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f189720i = com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f189721j = 15000;

    /* renamed from: k, reason: collision with root package name */
    public final int f189722k;

    public u(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, int i18, int i19) {
        this.f189712a = str;
        this.f189714c = str2;
        this.f189715d = str4;
        this.f189717f = str5;
        this.f189722k = i17;
        this.f189713b = i18;
        this.f189716e = java.lang.Math.max(i19, 0);
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.model.k
    public java.lang.String a() {
        return this.f189712a;
    }

    public java.lang.String b() {
        return this.f189714c;
    }

    public java.lang.String c() {
        return this.f189715d;
    }
}
