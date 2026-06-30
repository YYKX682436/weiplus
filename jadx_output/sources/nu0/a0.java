package nu0;

/* loaded from: classes5.dex */
public final class a0 implements com.tencent.maas.imagestudio.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f339856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f339857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f339858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.imagestudio.h f339859d;

    public a0(nu0.q0 q0Var, int i17, int i18, com.tencent.maas.imagestudio.h hVar) {
        this.f339856a = q0Var;
        this.f339857b = i17;
        this.f339858c = i18;
        this.f339859d = hVar;
    }

    @Override // com.tencent.maas.imagestudio.h
    public final void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            nu0.q0 q0Var = this.f339856a;
            java.util.ArrayList arrayList = (java.util.ArrayList) q0Var.f340077t;
            int i17 = this.f339857b;
            java.lang.String str2 = (java.lang.String) arrayList.get(i17);
            int i18 = this.f339858c;
            if (i17 < i18) {
                i18--;
            }
            ((java.util.ArrayList) q0Var.f340077t).remove(i17);
            if (i18 < 0 || i18 >= ((java.util.ArrayList) q0Var.f340077t).size()) {
                java.util.List list = q0Var.f340077t;
                ((java.util.ArrayList) list).add(((java.util.ArrayList) list).size(), str2);
            } else {
                ((java.util.ArrayList) q0Var.f340077t).add(i18, str2);
            }
            nu0.q0.W6(q0Var);
        } else {
            com.tencent.mars.xlog.Log.e("ImageControlUIC", "[moveScene] err:" + str);
        }
        this.f339859d.a(str);
    }
}
