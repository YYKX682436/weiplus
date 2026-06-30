package hr3;

/* loaded from: classes11.dex */
public class eb extends hr3.va {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference f283520f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference) {
        super(normalUserFooterPreference);
        this.f283520f = normalUserFooterPreference;
    }

    @Override // hr3.va
    public void f() {
        boolean z17;
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f283520f;
        iz5.a.g(null, !c01.e2.D(normalUserFooterPreference.L.d1()));
        android.view.View view = normalUserFooterPreference.f153734x0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = normalUserFooterPreference.f153738z1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NormalHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (normalUserFooterPreference.V) {
            normalUserFooterPreference.f153731l1.setOnClickListener(new hr3.za(this));
            if (normalUserFooterPreference.L.r2()) {
                normalUserFooterPreference.f153731l1.setVisibility(0);
            } else {
                normalUserFooterPreference.f153731l1.setVisibility(8);
            }
            normalUserFooterPreference.C1.setVisibility(8);
            normalUserFooterPreference.D1.setVisibility(8);
            normalUserFooterPreference.G1.setVisibility(8);
            normalUserFooterPreference.E1.setVisibility(8);
            normalUserFooterPreference.H1.setVisibility(8);
            return;
        }
        normalUserFooterPreference.C1.setOnClickListener(new hr3.ab(this));
        if (normalUserFooterPreference.L.r2()) {
            normalUserFooterPreference.C1.setVisibility(8);
            normalUserFooterPreference.D1.setVisibility(0);
            if (normalUserFooterPreference.Q() || normalUserFooterPreference.L.d1().equals(c01.z1.r()) || c01.e2.D(normalUserFooterPreference.L.d1()) || com.tencent.mm.storage.z3.R3(normalUserFooterPreference.L.d1()) || com.tencent.mm.storage.z3.m4(normalUserFooterPreference.L.d1()) || com.tencent.mm.storage.z3.E4(normalUserFooterPreference.L.d1())) {
                normalUserFooterPreference.E1.setVisibility(8);
            } else {
                normalUserFooterPreference.E1.setVisibility(0);
            }
            com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
            java.lang.String d17 = normalUserFooterPreference.L.d1();
            com.tencent.mm.storage.k4 k4Var = (com.tencent.mm.storage.k4) q17;
            k4Var.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                z17 = false;
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("select count(*) from ");
                sb6.append(com.tencent.mm.storage.k4.a0(d17));
                sb6.append(" where type & 8 !=0 and username=");
                l75.e0 e0Var = com.tencent.mm.contact.s.G2;
                sb6.append(d95.b0.O(d17));
                android.database.Cursor f17 = k4Var.f195071d.f(sb6.toString(), null, 2);
                z17 = f17.moveToFirst() && f17.getInt(0) > 0;
                f17.close();
            }
            if (z17) {
                normalUserFooterPreference.F1.setVisibility(0);
                normalUserFooterPreference.N = normalUserFooterPreference.L.getSource();
            }
        } else {
            normalUserFooterPreference.C1.setVisibility(0);
            normalUserFooterPreference.D1.setVisibility(8);
            normalUserFooterPreference.G1.setVisibility(8);
            normalUserFooterPreference.E1.setVisibility(8);
        }
        if (normalUserFooterPreference.L.o2()) {
            normalUserFooterPreference.H1.setVisibility(0);
        } else {
            normalUserFooterPreference.H1.setVisibility(8);
        }
    }

    @Override // hr3.va
    public void h() {
        super.h();
    }

    @Override // hr3.va
    public void i() {
        super.i();
    }

    public void m() {
        java.lang.String str;
        int i17;
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f283520f;
        if (((int) normalUserFooterPreference.L.E2) == 0) {
            if (((com.tencent.mm.storage.k4) c01.d9.b().q()).i0(normalUserFooterPreference.L) != -1) {
                normalUserFooterPreference.L = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(normalUserFooterPreference.L.d1(), true);
            }
        }
        java.lang.String str2 = "";
        if (normalUserFooterPreference.R || (i17 = normalUserFooterPreference.N) == 12) {
            long j17 = normalUserFooterPreference.S;
            java.lang.String str3 = normalUserFooterPreference.T;
            if (j17 != 0 && str3 != null && !str3.equals("")) {
                r61.w1 g17 = m61.k.Ri().g(normalUserFooterPreference.S);
                if (g17 == null) {
                    r61.w1 w1Var = new r61.w1();
                    w1Var.f392982e = "";
                    w1Var.f392978a = normalUserFooterPreference.S;
                    w1Var.f392988k = normalUserFooterPreference.T;
                    w1Var.f392981d = normalUserFooterPreference.L.d1();
                    w1Var.f392992o |= 1;
                    r61.x1 Ri = m61.k.Ri();
                    Ri.getClass();
                    w1Var.f392994q = -1;
                    if (((int) Ri.f392998d.l("qqlist", "qq", w1Var.b())) != -1) {
                        Ri.b(2, Ri, "" + w1Var.f392978a);
                    }
                } else {
                    g17.f392978a = normalUserFooterPreference.S;
                    g17.f392988k = normalUserFooterPreference.T;
                    g17.f392981d = normalUserFooterPreference.L.d1();
                    g17.f392992o |= 1;
                    m61.k.Ri().i(normalUserFooterPreference.S, g17);
                }
            }
        } else if (i17 == 58 || i17 == 59 || i17 == 60) {
            m61.k.Di().P0(normalUserFooterPreference.L.d1(), 1, 0);
        }
        com.tencent.mm.ui.MMActivity mMActivity = normalUserFooterPreference.K1;
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("Contact_Mobile_MD5");
        java.lang.String stringExtra2 = mMActivity.getIntent().getStringExtra("Contact_full_Mobile_MD5");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        if (!stringExtra.equals("") || !stringExtra2.equals("")) {
            r61.a i18 = m61.k.wi().i(stringExtra);
            if (i18 == null) {
                i18 = m61.k.wi().i(stringExtra2);
                stringExtra = stringExtra2;
            }
            if (i18 != null) {
                m61.k.wi().j(stringExtra, i18);
            }
        }
        r35.a aVar = new r35.a(normalUserFooterPreference.f197770d, new hr3.bb(this));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(java.lang.Integer.valueOf(normalUserFooterPreference.N));
        java.lang.String stringExtra3 = mMActivity.getIntent().getStringExtra("source_from_user_name");
        java.lang.String stringExtra4 = mMActivity.getIntent().getStringExtra("source_from_nick_name");
        aVar.f369019t = stringExtra3;
        aVar.f369020u = stringExtra4;
        aVar.f369007e = new hr3.cb(this, stringExtra3, stringExtra4);
        java.lang.String stringExtra5 = mMActivity.getIntent().getStringExtra("room_name");
        java.lang.String stringExtra6 = mMActivity.getIntent().getStringExtra("AntispamTicket");
        if (!android.text.TextUtils.isEmpty(stringExtra6)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", "add contact case 1:%s", stringExtra6);
            aVar.m(stringExtra6);
            aVar.a(normalUserFooterPreference.L.d1(), "", linkedList);
            return;
        }
        if (android.text.TextUtils.isEmpty(stringExtra5)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", "add contact case 2, %s", normalUserFooterPreference.L.F1);
            aVar.m(normalUserFooterPreference.L.F1);
            aVar.b(normalUserFooterPreference.L.d1(), linkedList, false, "");
            return;
        }
        if (!android.text.TextUtils.isEmpty(aVar.f369016q)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", "add contact case 3, %s", normalUserFooterPreference.L.F1);
            aVar.m(normalUserFooterPreference.L.F1);
            aVar.a(normalUserFooterPreference.L.d1(), stringExtra5, linkedList);
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(normalUserFooterPreference.L.d1(), true);
        if (n17 != null && (str = n17.F1) != null) {
            str2 = str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", "dkverify footer add:%s chat:%s ticket:%s", normalUserFooterPreference.L.d1(), stringExtra5, str2);
        if (!android.text.TextUtils.isEmpty(str2)) {
            aVar.m(str2);
            aVar.a(normalUserFooterPreference.L.d1(), stringExtra5, linkedList);
            return;
        }
        c01.p8 a17 = c01.n8.a();
        java.lang.String d17 = normalUserFooterPreference.L.d1();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(normalUserFooterPreference.N);
        int i19 = 10000;
        if (valueOf != null) {
            valueOf.intValue();
            i19 = 10000 + valueOf.intValue();
        }
        ((c01.k7) a17).g(d17, stringExtra5, i19, new hr3.db(this, aVar, stringExtra5, linkedList));
    }
}
