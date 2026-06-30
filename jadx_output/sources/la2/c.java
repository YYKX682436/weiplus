package la2;

/* loaded from: classes8.dex */
public final class c implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f317508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317509e;

    public c(boolean z17, java.lang.String str) {
        this.f317508d = z17;
        this.f317509e = str;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.ri2 req = (r45.ri2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modMaterialPoiSwitchCallback, isEnable:");
        boolean z17 = this.f317508d;
        sb6.append(z17);
        sb6.append(" ret ");
        sb6.append(ret.getInteger(1));
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("Finder.FinderPoiHelper", sb6.toString());
        if (ret.getInteger(1) == 0) {
            ya2.g gVar = ya2.h.f460484a;
            ya2.b2 b17 = gVar.b(this.f317509e);
            long j17 = b17 != null ? b17.field_additionalFlag : 0L;
            long j18 = z17 ? j17 | 1024 : (-1025) & j17;
            if (b17 != null) {
                b17.field_additionalFlag = j18;
                gVar.o(b17);
            }
        }
    }
}
