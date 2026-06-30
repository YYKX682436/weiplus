package wd1;

/* loaded from: classes7.dex */
public final class f implements wl1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd1.k f444804a;

    public f(wd1.k kVar) {
        this.f444804a = kVar;
    }

    @Override // wl1.a
    public java.lang.String a(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 C0;
        if (!kotlin.jvm.internal.o.b(str, "sendSnapshotWebViewInfo") || (C0 = this.f444804a.f444822d.C0()) == null) {
            return "";
        }
        kotlin.jvm.internal.o.d(str2);
        C0.g("onSnapshotWebViewInfo2AppService", str2);
        return "";
    }
}
