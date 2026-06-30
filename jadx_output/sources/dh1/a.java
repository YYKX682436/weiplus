package dh1;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232416e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, java.lang.String str2) {
        super(0);
        this.f232415d = str;
        this.f232416e = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String h17 = com.tencent.mm.plugin.appbrand.jsapi.file.l2.h(this.f232415d, "magicbrushframedata");
        kotlin.jvm.internal.o.d(h17);
        boolean n17 = r26.i0.n(h17, "/", false);
        java.lang.String str = this.f232416e;
        if (n17) {
            return h17 + com.tencent.mm.plugin.appbrand.appstorage.l1.i(str);
        }
        return h17 + com.tencent.mm.plugin.appbrand.appstorage.l1.b(str, true);
    }
}
