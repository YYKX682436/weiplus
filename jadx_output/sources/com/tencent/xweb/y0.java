package com.tencent.xweb;

/* loaded from: classes7.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f220621a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f220622b;

    /* renamed from: c, reason: collision with root package name */
    public int f220623c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f220624d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f220625e;

    /* renamed from: f, reason: collision with root package name */
    public java.io.InputStream f220626f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f220627g;

    public y0(java.lang.String str, java.lang.String str2, java.io.InputStream inputStream) {
        this.f220623c = 200;
        this.f220627g = false;
        this.f220621a = str;
        this.f220622b = str2;
        this.f220626f = inputStream;
        this.f220627g = false;
    }

    public y0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.util.Map map, java.io.InputStream inputStream) {
        this(str, str2, inputStream);
        this.f220623c = i17;
        this.f220624d = str3;
        this.f220625e = map;
        this.f220627g = true;
    }
}
