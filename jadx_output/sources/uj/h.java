package uj;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj.i f428155d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(uj.i iVar) {
        super(0);
        this.f428155d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.appbrand.appcache.u3 b17 = this.f428155d.f428156d.b();
        if (b17 != null) {
            str = ((com.tencent.mm.plugin.appbrand.appcache.y8) b17).b();
            kotlin.jvm.internal.o.f(str, "getPkgPath(...)");
        } else {
            str = "";
        }
        return ((str.length() > 0) && com.tencent.mm.vfs.w6.j(str)) ? com.tencent.mm.vfs.w6.p(str) : "MagicPlayableService";
    }
}
