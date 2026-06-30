package ee5;

/* loaded from: classes9.dex */
public final class v1 extends ee5.t2 implements zd5.q, zd5.p {

    /* renamed from: r, reason: collision with root package name */
    public zd5.n f252072r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public static final java.lang.String W6(ee5.v1 v1Var, android.content.Context context, com.tencent.mm.storage.f9 f9Var, ot0.q qVar, boolean z17, int i17) {
        java.lang.String Q0;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        v1Var.getClass();
        if (qVar == null || f9Var == null || context == null) {
            return "";
        }
        if (i17 != 1) {
            if (i17 == 3) {
                if (v1Var.Y6()) {
                    java.lang.String string4 = v1Var.getActivity().getString(com.tencent.mm.R.string.b2k);
                    kotlin.jvm.internal.o.d(string4);
                    return string4;
                }
                if (!z17) {
                    string = v1Var.getActivity().getString(com.tencent.mm.R.string.b2m);
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.X1)) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b2l);
                } else {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b2l) + '-' + qVar.X1;
                }
                kotlin.jvm.internal.o.d(string);
                return string;
            }
            if (i17 == 4) {
                if (v1Var.Y6()) {
                    java.lang.String string5 = v1Var.getActivity().getString(com.tencent.mm.R.string.b37);
                    kotlin.jvm.internal.o.d(string5);
                    return string5;
                }
                if (!z17) {
                    string2 = v1Var.getActivity().getString(com.tencent.mm.R.string.b38);
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.X1)) {
                    string2 = v1Var.getActivity().getString(com.tencent.mm.R.string.b39);
                } else {
                    string2 = v1Var.getActivity().getString(com.tencent.mm.R.string.b39) + '-' + qVar.X1;
                }
                kotlin.jvm.internal.o.d(string2);
                return string2;
            }
            if (i17 == 5) {
                if (v1Var.Y6()) {
                    java.lang.String string6 = v1Var.getActivity().getString(com.tencent.mm.R.string.b2r);
                    kotlin.jvm.internal.o.d(string6);
                    return string6;
                }
                if (!z17) {
                    string3 = v1Var.getActivity().getString(com.tencent.mm.R.string.b2q);
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(qVar.X1)) {
                    string3 = v1Var.getActivity().getString(com.tencent.mm.R.string.b2p);
                } else {
                    string3 = v1Var.getActivity().getString(com.tencent.mm.R.string.b2p) + '-' + qVar.X1;
                }
                kotlin.jvm.internal.o.d(string3);
                return string3;
            }
            if (i17 == 6) {
                java.lang.String string7 = context.getResources().getString(com.tencent.mm.R.string.b2n);
                kotlin.jvm.internal.o.f(string7, "getString(...)");
                return string7;
            }
            if (i17 != 7) {
                java.lang.String description = qVar.f348658g;
                kotlin.jvm.internal.o.f(description, "description");
                return description;
            }
        }
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).f0(f9Var.Q0());
        if (f07 != null) {
            Q0 = f07.g2();
            kotlin.jvm.internal.o.d(Q0);
        } else {
            Q0 = f9Var.Q0();
            kotlin.jvm.internal.o.d(Q0);
        }
        if (v1Var.Y6()) {
            java.lang.String string8 = v1Var.getActivity().getString(com.tencent.mm.R.string.f490862b30);
            kotlin.jvm.internal.o.d(string8);
            return string8;
        }
        java.lang.String string9 = z17 ? com.tencent.mm.sdk.platformtools.t8.K0(qVar.X1) ? f9Var.A0() != 1 ? v1Var.getActivity().getString(com.tencent.mm.R.string.f490868b36) : v1Var.getActivity().getString(com.tencent.mm.R.string.f490866b34, Q0) : qVar.X1 : v1Var.getActivity().getString(com.tencent.mm.R.string.b2m);
        kotlin.jvm.internal.o.d(string9);
        return string9;
    }

    public static final int X6(ee5.v1 v1Var, android.content.Context context, com.tencent.mm.storage.f9 f9Var, ot0.q qVar, boolean z17, int i17) {
        v1Var.getClass();
        if (qVar != null && f9Var != null && context != null && i17 != 1) {
            if (i17 != 3) {
                if (i17 == 4) {
                    return com.tencent.mm.R.raw.c2c_remittance_rejected_icon;
                }
                if (i17 != 5) {
                    if (i17 == 6) {
                        return com.tencent.mm.R.raw.c2c_remittance_cancle_icon;
                    }
                }
            }
            return com.tencent.mm.R.raw.c2c_remittance_received_icon;
        }
        return com.tencent.mm.R.raw.c2c_remittance_icon;
    }

    @Override // zd5.q
    public void H3(zd5.k holder, int i17, int i18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        ee5.v2 v2Var = (ee5.v2) holder;
        ae5.i iVar = (ae5.i) getItem(i17);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(iVar.f4409k);
        android.widget.TextView textView = v2Var.f252074n;
        if (K0) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            java.lang.String str = iVar.f4409k;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        int b17 = i65.a.b(getActivity(), 6);
        android.widget.ImageView imageView = v2Var.f252073m;
        imageView.setPadding(b17, b17, b17, b17);
        imageView.setImageResource(iVar.f4408j);
        imageView.setBackgroundColor(iVar.f4410l);
    }

    @Override // ee5.t2
    public android.text.SpannableString O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemPayUIC", "getEmptyResultString >> " + str);
        return o13.q.m(getString(com.tencent.mm.R.string.fgw), getString(com.tencent.mm.R.string.fgv), str);
    }

    @Override // ee5.t2
    public zd5.n P6() {
        if (this.f252072r == null) {
            this.f252072r = new zd5.n(getActivity(), this, this);
        }
        zd5.n nVar = this.f252072r;
        kotlin.jvm.internal.o.d(nVar);
        return nVar;
    }

    @Override // ee5.t2
    public int Q6() {
        return 5;
    }

    @Override // zd5.p
    public void W2(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        U6();
        de5.a.e(de5.a.f229396a, 5, 0, 0, 6, null);
        S6(this.f252056o, item.f4400d);
    }

    public final boolean Y6() {
        return com.tencent.mm.storage.z3.R4(this.f252056o) || com.tencent.mm.storage.z3.q4(this.f252056o);
    }

    public boolean Z6(int i17) {
        return com.tencent.mm.sdk.platformtools.t8.D1("1001", 0) == i17 || com.tencent.mm.sdk.platformtools.t8.D1("1002", 0) == i17 || com.tencent.mm.sdk.platformtools.t8.D1("1005", 0) == i17 || 419430449 == i17;
    }

    @Override // zd5.p
    public void a6(android.view.View v17, int i17, ae5.g item) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
    }

    @Override // zd5.q
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bct, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ee5.v2(inflate);
    }

    @Override // zd5.q
    public int getCount() {
        return this.f252054m.size();
    }

    @Override // zd5.q
    public ae5.g getItem(int i17) {
        java.lang.Object obj = this.f252054m.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (ae5.g) obj;
    }
}
