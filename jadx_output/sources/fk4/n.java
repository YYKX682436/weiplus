package fk4;

/* loaded from: classes4.dex */
public final class n implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f263643d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f263644e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f263645f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f263646g;

    /* renamed from: h, reason: collision with root package name */
    public final long f263647h;

    public n(java.lang.String url, java.lang.String filePath, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.f263643d = url;
        this.f263644e = filePath;
        this.f263645f = str;
        this.f263646g = str2;
        this.f263647h = fk4.d.f263597a.f();
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.String str = this.f263643d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = this.f263644e;
        }
        return str + '_' + this.f263647h + '_' + hashCode();
    }
}
