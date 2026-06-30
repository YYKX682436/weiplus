package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f113555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f113556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f113557f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113558g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113559h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f113560i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(int i17, int i18, com.tencent.mm.plugin.finder.live.plugin.et etVar, java.lang.String str, java.lang.String str2, yz5.a aVar) {
        super(0);
        this.f113555d = i17;
        this.f113556e = i18;
        this.f113557f = etVar;
        this.f113558g = str;
        this.f113559h = str2;
        this.f113560i = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a aVar;
        um2.x5 startUIC;
        int i17 = this.f113556e;
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f113557f;
        int i18 = this.f113555d;
        if (i18 == 0 && i17 == 0) {
            r45.nw1 nw1Var = ((mm2.e1) etVar.P0(mm2.e1.class)).f328988r;
            if (nw1Var != null) {
                dk2.Cif.b(dk2.Cif.f233626a, etVar.f112448p, nw1Var.getLong(0), dk2.hf.f233593n, false, 8, null);
            }
        } else {
            java.lang.String str = this.f113558g;
            if (i17 == -200016) {
                etVar.V = str;
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.String str2 = this.f113559h;
                bundle.putString("PARAM_FINDER_LIVE_URL", str2);
                bundle.putString("PARAM_FINDER_LIVE_COMMENT", str);
                etVar.f112448p.statusChange(qo0.b.X2, bundle);
                if (!(str2 == null || str2.length() == 0)) {
                    if (etVar.x0()) {
                        etVar.R0().forceScreenToPortrait();
                        etVar.R0().post(new com.tencent.mm.plugin.finder.live.plugin.lr(etVar, str2));
                    } else {
                        com.tencent.mm.plugin.finder.live.view.k0 R0 = etVar.R0();
                        fm2.c cVar = R0 instanceof fm2.c ? (fm2.c) R0 : null;
                        if (cVar != null && (startUIC = cVar.getStartUIC()) != null) {
                            startUIC.a0(str2);
                        }
                    }
                }
            } else if (i17 == -200014) {
                ((mm2.c1) etVar.P0(mm2.c1.class)).f328884t = false;
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("PARAM_FINDER_LIVE_COMMENT", str);
                etVar.f112448p.statusChange(qo0.b.Y2, bundle2);
                db5.t7.makeText(etVar.f365323d.getContext(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ebz), 0).show();
            } else if (i17 == -200031) {
                ((mm2.c1) etVar.P0(mm2.c1.class)).f328902w = false;
            } else if (i17 == -200015 || i17 == -200018) {
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString("PARAM_FINDER_LIVE_COMMENT", str);
                etVar.f112448p.statusChange(qo0.b.Y2, bundle3);
            } else if (i17 == -200251) {
                df2.oh ohVar = (df2.oh) etVar.U0(df2.oh.class);
                if (ohVar != null) {
                    ohVar.Z6("dealWithErrCode");
                }
            } else if (i17 == -100075) {
                db5.t7.makeText(etVar.f365323d.getContext(), com.tencent.mm.R.string.lom, 0).show();
            } else if (i18 != 0 && (aVar = this.f113560i) != null) {
                aVar.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
