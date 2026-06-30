package pn2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn2.s f357002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pn2.s sVar) {
        super(0);
        this.f357002d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pn2.b bVar;
        km2.z zVar;
        r45.cz1 cz1Var;
        pn2.s sVar = this.f357002d;
        sVar.f357025t--;
        java.lang.String str = sVar.f357017i;
        boolean z17 = str == null || str.length() == 0;
        gk2.e eVar = sVar.f357013e;
        if (!z17) {
            java.lang.String str2 = sVar.f357017i;
            km2.z zVar2 = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
            if (kotlin.jvm.internal.o.b(str2, (zVar2 == null || (cz1Var = zVar2.f309232d) == null) ? null : cz1Var.getString(0)) && (zVar = ((on2.z2) eVar.a(on2.z2.class)).f347092m) != null) {
                zVar.f309230b = sVar.f357025t;
            }
        }
        int i17 = sVar.f357025t;
        if (i17 >= 0) {
            if (sVar.f357016h == null) {
                com.tencent.mars.xlog.Log.i(sVar.f357015g, "viewCallback is empty!");
            }
            km2.z zVar3 = ((on2.z2) eVar.a(on2.z2.class)).f347092m;
            if ((zVar3 != null && zVar3.f309229a == 1) && (bVar = sVar.f357016h) != null) {
                java.lang.String a17 = no0.l.a(no0.m.f338730a, i17, ":", false, false, false, 24, null);
                pn2.c0 c0Var = (pn2.c0) bVar;
                com.tencent.mars.xlog.Log.i(c0Var.f356977m, "updateCountDown remainTime:".concat(a17));
                android.widget.FrameLayout D = c0Var.D();
                if (D != null) {
                    D.post(new pn2.a0(c0Var));
                }
                android.widget.TextView B = c0Var.B();
                if (B != null) {
                    B.setVisibility(0);
                }
                android.widget.TextView B2 = c0Var.B();
                if (B2 != null) {
                    B2.setText(a17);
                }
            }
            qo0.c.a(sVar.f357014f, qo0.b.f365408r3, null, 2, null);
        }
        int i18 = sVar.f357025t;
        if (i18 <= 0) {
            sVar.q(i18);
        }
        return jz5.f0.f302826a;
    }
}
