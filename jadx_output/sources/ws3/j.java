package ws3;

/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f449181a;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.recharge.ui.form.MallFormView f449183c;

    /* renamed from: d, reason: collision with root package name */
    public ws3.y f449184d;

    /* renamed from: b, reason: collision with root package name */
    public vs3.a f449182b = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f449185e = false;

    public j(com.tencent.mm.plugin.recharge.ui.form.MallFormView mallFormView) {
        this.f449183c = null;
        this.f449183c = mallFormView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [us3.e] */
    /* JADX WARN: Type inference failed for: r4v6, types: [us3.e] */
    public void a(boolean z17) {
        java.util.List list;
        ?? Bi = us3.e.Ai().Bi();
        if (Bi == 0 || Bi.isEmpty()) {
            Bi = new java.util.ArrayList();
            vs3.a Di = us3.e.Di();
            if (Di != null) {
                Bi.add(Di);
                us3.e.Ai().wi(Di);
            }
        } else {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
            for (int i17 = 0; i17 < Bi.size(); i17++) {
                vs3.a aVar = (vs3.a) Bi.get(i17);
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(aVar.f439875a);
                java.lang.String str2 = aVar.f439875a;
                if (!K0 && str2.equals(str)) {
                    boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(aVar.f439876b);
                    com.tencent.mm.plugin.recharge.ui.form.MallFormView mallFormView = this.f449183c;
                    if (K02 || !aVar.f439876b.equals(mallFormView.getContext().getString(com.tencent.mm.R.string.kxw))) {
                        aVar.f439876b = mallFormView.getContext().getString(com.tencent.mm.R.string.kxw);
                        us3.e.Ai().Ni(Bi);
                    }
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && com.tencent.mm.sdk.platformtools.t8.K0(aVar.f439876b) && (list = this.f449181a) != null) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.String[] strArr = (java.lang.String[]) it.next();
                        if (str2.equals(vs3.b.a(strArr[2]))) {
                            java.lang.String str3 = strArr[1];
                            aVar.f439876b = str3;
                            com.tencent.mars.xlog.Log.i("MicroMsg.CommonHintViewConfig", "add name: %s", str3);
                            break;
                        }
                    }
                    us3.e.Ai().Ni(Bi);
                }
            }
        }
        ws3.y yVar = this.f449184d;
        synchronized (yVar) {
            yVar.f449199f = Bi;
            yVar.notifyDataSetChanged();
        }
        if (Bi.size() <= 0 || !z17) {
            return;
        }
        vs3.a aVar2 = (vs3.a) Bi.get(0);
        this.f449182b = aVar2;
        b(aVar2);
    }

    public void b(vs3.a aVar) {
        this.f449182b = aVar;
        com.tencent.mm.plugin.recharge.ui.form.MallFormView mallFormView = this.f449183c;
        if (aVar == null) {
            mallFormView.getContentEditText().setText("");
            mallFormView.getTipsTv().setText("");
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mallFormView.getText());
        java.lang.String str = aVar.f439875a;
        if (K0 || !mallFormView.getText().equals(str)) {
            mallFormView.getContentEditText().setText(vs3.b.b(str));
        }
        mallFormView.getContentEditText().setSelection(mallFormView.getContentEditText().getText().length());
        android.content.Context context = mallFormView.getContext();
        vs3.a aVar2 = this.f449182b;
        int i17 = aVar2.f439878d;
        if (i17 == 3) {
            mallFormView.getTipsTv().setText(this.f449182b.f439876b);
            mallFormView.getTipsTv().setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a2e));
            return;
        }
        if (i17 == 1) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f439876b)) {
                java.lang.String string = context.getString(com.tencent.mm.R.string.kxx);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f449182b.f439877c)) {
                    string = string + context.getString(com.tencent.mm.R.string.kxp, this.f449182b.f439877c);
                }
                mallFormView.getTipsTv().setText(string);
                mallFormView.getTipsTv().setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a28));
                return;
            }
            vs3.a aVar3 = this.f449182b;
            java.lang.String str2 = aVar3.f439876b;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(aVar3.f439877c)) {
                str2 = str2 + context.getString(com.tencent.mm.R.string.kxp, this.f449182b.f439877c);
            }
            mallFormView.getTipsTv().setText(str2);
            mallFormView.getTipsTv().setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            return;
        }
        if (i17 == 2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f439877c)) {
                mallFormView.getTipsTv().setText("");
                mallFormView.getTipsTv().setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a28));
                return;
            } else {
                mallFormView.getTipsTv().setText(this.f449182b.f439877c);
                mallFormView.getTipsTv().setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
                return;
            }
        }
        if (i17 == 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(aVar2.f439877c)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f449182b.f439876b)) {
                    mallFormView.getTipsTv().setText("");
                    mallFormView.getTipsTv().setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
                    return;
                } else {
                    mallFormView.getTipsTv().setText(this.f449182b.f439876b);
                    mallFormView.getTipsTv().setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a28));
                    return;
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f449182b.f439876b)) {
                mallFormView.getTipsTv().setText(this.f449182b.f439877c);
                mallFormView.getTipsTv().setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
                return;
            }
            mallFormView.getTipsTv().setText(this.f449182b.f439876b + context.getString(com.tencent.mm.R.string.kxp, this.f449182b.f439877c));
            mallFormView.getTipsTv().setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a28));
        }
    }
}
