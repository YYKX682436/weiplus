package lu4;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu4.m f321437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(lu4.m mVar, java.lang.String str) {
        super(1);
        this.f321437d = mVar;
        this.f321438e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ak akVar = (r45.ak) obj;
        lu4.m mVar = this.f321437d;
        java.lang.String str = mVar.f321431c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportCgi resp_json=");
        sb6.append(akVar != null ? akVar.f370060f : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        lu4.c cVar = (lu4.c) mVar.f321430b;
        java.lang.String str2 = this.f321438e;
        java.lang.String str3 = akVar != null ? akVar.f370060f : null;
        lu4.c.u(cVar, str2, str3 == null ? "null" : str3, null, 4, null);
        return jz5.f0.f302826a;
    }
}
