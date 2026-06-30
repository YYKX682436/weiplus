package dk2;

/* loaded from: classes3.dex */
public final class d1 implements ke2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f233308c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233309d;

    public d1(dk2.r4 r4Var, java.lang.String str, int i17, yz5.p pVar) {
        this.f233306a = r4Var;
        this.f233307b = str;
        this.f233308c = i17;
        this.f233309d = pVar;
    }

    @Override // ke2.i
    public void a(int i17, int i18, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f233306a.f234009d, "doDisableComment fail, enable:" + z17 + " username:" + this.f233307b + " errType:" + i17 + " errCode:" + i18);
        yz5.p pVar = this.f233309d;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // ke2.i
    public void b(boolean z17) {
        dk2.r4 r4Var = this.f233306a;
        java.lang.String str = r4Var.f234009d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doDisableComment success, enable:");
        sb6.append(z17);
        sb6.append(" username:");
        java.lang.String str2 = this.f233307b;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        int i17 = this.f233308c;
        if (i17 == 2) {
            ((mm2.c1) r4Var.m(mm2.c1.class)).f328780b2.put(str2, java.lang.Boolean.valueOf(!z17));
        } else if (i17 == 3) {
            ((mm2.c1) r4Var.m(mm2.c1.class)).f328785c2.put(str2, java.lang.Boolean.valueOf(!z17));
        }
        yz5.p pVar = this.f233309d;
        if (pVar != null) {
            pVar.invoke(java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(z17));
        }
    }
}
