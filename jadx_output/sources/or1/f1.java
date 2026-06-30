package or1;

/* loaded from: classes9.dex */
public class f1 extends com.tencent.mm.ui.z9 {

    /* renamed from: o, reason: collision with root package name */
    public bb5.e f347490o;

    /* renamed from: p, reason: collision with root package name */
    public bb5.g f347491p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI f347492q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI, android.content.Context context) {
        super(context, new r45.co());
        this.f347492q = enterpriseBizContactPlainListUI;
        this.f347490o = null;
        this.f347491p = new bb5.g(15, new or1.b1(this));
        q();
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        r45.co coVar = (r45.co) obj;
        if (coVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnterpriseBizListAdapter", "item == null");
            coVar = new r45.co();
        }
        if (cursor != null) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(cursor);
            qk.o oVar = new qk.o();
            oVar.convertFrom(cursor);
            coVar.f371676d = z3Var.d1();
            coVar.f371677e = z3Var;
            coVar.f371678f = oVar;
        }
        return coVar;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        or1.e1 e1Var;
        if (this.f347490o == null) {
            this.f347490o = new or1.d1(this);
        }
        bb5.g gVar = this.f347491p;
        if (gVar != null) {
            gVar.b(i17, this.f347490o);
        }
        if (view == null) {
            e1Var = new or1.e1(this);
            view2 = android.view.View.inflate(this.f212608e, com.tencent.mm.R.layout.f488740a91, null);
            e1Var.f347482a = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.k5l);
            e1Var.f347483b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.k5r);
            view2.setTag(e1Var);
        } else {
            view2 = view;
            e1Var = (or1.e1) view.getTag();
        }
        r45.co coVar = (r45.co) getItem(i17);
        if (coVar == null) {
            e1Var.a();
            return view2;
        }
        e1Var.a();
        int paddingBottom = view2.getPaddingBottom();
        int paddingTop = view2.getPaddingTop();
        int paddingRight = view2.getPaddingRight();
        int paddingLeft = view2.getPaddingLeft();
        view2.setBackgroundDrawable(i65.a.i(this.f212608e, com.tencent.mm.R.drawable.f481306q2));
        view2.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        java.lang.String f27 = coVar.f371677e.f2();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (f27 == null) {
            f27 = "";
        }
        android.widget.TextView textView = e1Var.f347483b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f212608e;
        float textSize = e1Var.f347483b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, f27, textSize));
        e1Var.f347483b.setVisibility(0);
        e1Var.f347482a.setVisibility(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(coVar.f371677e.d1())) {
            e1Var.f347482a.setImageDrawable(null);
        } else {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(e1Var.f347482a, coVar.f371677e.d1(), null);
        }
        return view2;
    }

    @Override // com.tencent.mm.ui.z9
    public void o() {
        q();
    }

    @Override // com.tencent.mm.ui.z9, l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EnterpriseBizListAdapter", "onNotifyChange");
        com.tencent.mm.sdk.platformtools.u3.h(new or1.c1(this));
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        android.database.Cursor k17;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EnterpriseBizListAdapter", "accHasReady");
            return;
        }
        c();
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI enterpriseBizContactPlainListUI = this.f347492q;
        int i17 = enterpriseBizContactPlainListUI.f94024f;
        if (i17 != 1) {
            k17 = null;
            if (i17 == 2) {
                r01.x cj6 = r01.q3.cj();
                java.lang.String str = enterpriseBizContactPlainListUI.f94025g;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                cj6.K1(sb6);
                cj6.W0(sb6);
                cj6.L0(sb6, str);
                cj6.J0(sb6, false);
                cj6.z0(sb6, false);
                sb6.append(" order by ");
                sb6.append("rcontact.type & 2048 desc, rcontact.showHead asc,  case when length(rcontact.conRemarkPYFull) > 0 then upper(rcontact.conRemarkPYFull)  else upper(rcontact.quanPin) end asc,  case when length(rcontact.conRemark) > 0 then upper(rcontact.conRemark)  else upper(rcontact.quanPin) end asc,  upper(rcontact.quanPin) asc,  upper(rcontact.nickname) asc,  upper(rcontact.username) asc ");
                java.lang.String sb7 = sb6.toString();
                com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "getEnterpriseDisableChild sql %s", sb7);
                k17 = gm0.j1.u().f273153f.B(sb7, null);
            } else if (i17 == 3) {
                k17 = r01.q3.cj().k1(enterpriseBizContactPlainListUI.f94025g, 128);
            } else if (i17 != 4) {
                k17 = r01.q3.cj().o1(enterpriseBizContactPlainListUI.f94025g, true);
            } else {
                qk.o b17 = r01.z.b(enterpriseBizContactPlainListUI.f94025g);
                if (b17 != null && b17.field_enterpriseFather != null) {
                    k17 = r01.q3.cj().f1(b17.field_enterpriseFather);
                }
            }
        } else {
            k17 = r01.q3.cj().k1(enterpriseBizContactPlainListUI.f94025g, 25);
        }
        s(k17);
    }
}
