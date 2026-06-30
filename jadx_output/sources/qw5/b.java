package qw5;

/* loaded from: classes8.dex */
public final class b extends qw5.a {

    /* renamed from: a, reason: collision with root package name */
    public final ow5.a f367230a;

    /* renamed from: b, reason: collision with root package name */
    public long f367231b;

    /* renamed from: c, reason: collision with root package name */
    public final defpackage.m f367232c;

    /* renamed from: d, reason: collision with root package name */
    public vw5.b f367233d;

    public b(ow5.a bizConfig) {
        kotlin.jvm.internal.o.g(bizConfig, "bizConfig");
        this.f367230a = bizConfig;
        java.lang.String tag = "WeMagic.MagicCardStarterBiz." + bizConfig.f349430b;
        long j17 = this.f367231b;
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f367232c = new rw5.a(bizConfig, tag, j17);
    }

    @Override // vw5.a
    public long a() {
        return this.f367231b;
    }
}
