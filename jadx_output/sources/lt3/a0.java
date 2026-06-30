package lt3;

/* loaded from: classes10.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f321197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(boolean z17, lt3.f0 f0Var) {
        super(1);
        this.f321197d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        boolean z17 = str == null || str.length() == 0;
        lt3.f0 f0Var = this.f321197d;
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Media.VideoMixer", "remux failed, ret path is null");
            yz5.r rVar = f0Var.f321213b;
            if (rVar != null) {
                rVar.C("", "", java.lang.Boolean.FALSE, -1);
            }
        } else {
            mt3.a aVar = f0Var.f321212a;
            mt3.a aVar2 = f0Var.f321212a;
            aVar.getClass();
            kotlin.jvm.internal.o.g(str, "<set-?>");
            aVar.f331293e = str;
            zv3.g gVar = f0Var.f321216e;
            if (gVar == null) {
                kotlin.jvm.internal.o.o("frameRetriever");
                throw null;
            }
            gVar.c();
            try {
                dw3.d0 a17 = dw3.e0.f244202a.a(aVar2.f331293e);
                if (a17 != null) {
                    nu3.l.f340228a.a(f0Var.f321217f.f412537h, a17.f244194e, a17.f244195f);
                }
            } catch (java.lang.Exception unused) {
            }
            java.lang.String b17 = lt3.f0.b(f0Var);
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", "mix create thumb failed");
                yz5.r rVar2 = f0Var.f321213b;
                if (rVar2 != null) {
                    rVar2.C(aVar2.f331293e, "", java.lang.Boolean.FALSE, -1);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", "mix create thumb succ");
                yz5.r rVar3 = f0Var.f321213b;
                if (rVar3 != null) {
                    java.lang.String str2 = aVar2.f331293e;
                    kotlin.jvm.internal.o.d(b17);
                    rVar3.C(str2, b17, java.lang.Boolean.TRUE, -1);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
