package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class c6 extends com.tencent.mm.ui.chatting.presenter.y {

    /* renamed from: u, reason: collision with root package name */
    public static final java.lang.String[] f202150u = {"msgId", "type", "createTime", "talker", "content", "isSend", "imgPath", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashSet f202151s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202152t;

    public c6(android.content.Context context) {
        super(context);
        this.f202151s = new java.util.HashSet();
        this.f202152t = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static com.tencent.mm.ui.chatting.presenter.n6 p(com.tencent.mm.ui.chatting.presenter.c6 c6Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.a3 a3Var) {
        final ot0.q v17;
        com.tencent.mm.ui.chatting.presenter.n6 n6Var;
        c6Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        int i17 = v17.f348666i;
        c6Var.getType();
        if (!c6Var.f202151s.contains(java.lang.Integer.valueOf(i17))) {
            return null;
        }
        java.lang.String j18 = c6Var.j(f9Var, com.tencent.mm.storage.z3.R4(c6Var.f202542e), false);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j18, true);
        java.lang.String z07 = a3Var != null ? a3Var.z0(j18) : "";
        java.lang.String str = v17.f348690o;
        kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
        o25.y.a(str);
        java.lang.String v18 = o72.x1.v(c6Var.f202541d, v17.f348722w);
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(v17.f348722w, true);
        if (n18 == null || !n18.d1().equals(v17.f348722w)) {
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.presenter.c6$$a
                @Override // java.lang.Runnable
                public final void run() {
                    ((c01.k7) c01.n8.a()).b(ot0.q.this.f348722w, 14, null);
                }
            });
        } else {
            v18 = n18.g2();
        }
        java.lang.String str2 = v18;
        int i18 = v17.f348666i;
        if ((i18 == 119 || i18 == 120) && v17.y(zy2.g.class) != null) {
            r45.ev2 ev2Var = ((zy2.g) v17.y(zy2.g.class)).f477383b;
            com.tencent.mm.ui.chatting.presenter.n6 n6Var2 = new com.tencent.mm.ui.chatting.presenter.n6(c6Var, f9Var.getCreateTime(), v17.f348666i, ev2Var.getString(1), f9Var.getMsgId(), n17.d1(), n17.f2(), n17.w0(), z07, null);
            n6Var2.f202374l = ev2Var.getString(3);
            n6Var2.f202373k = c6Var.f202541d.getString(com.tencent.mm.R.string.clc);
            n6Var2.f202372j = v17.f348646d;
            return n6Var2;
        }
        boolean z17 = true;
        com.tencent.mm.ui.chatting.presenter.n6 n6Var3 = new com.tencent.mm.ui.chatting.presenter.n6(c6Var, f9Var.getCreateTime(), v17.f348666i, v17.f348654f, f9Var.getMsgId(), n17.d1(), n17.f2(), n17.w0(), z07, null);
        if (v17.f348666i == 5) {
            com.tencent.mm.ui.chatting.presenter.o6 o6Var = new com.tencent.mm.ui.chatting.presenter.o6(c6Var);
            ot0.f fVar = (ot0.f) v17.y(ot0.f.class);
            if (fVar == null || fVar.f348460g != 1 || fVar.f348455b != 5) {
                z17 = false;
            }
            o6Var.f202412a = z17;
            n6Var = n6Var3;
            n6Var.f202375m = o6Var;
        } else {
            n6Var = n6Var3;
        }
        n6Var.f202373k = com.tencent.mm.sdk.platformtools.t8.K0(str2) ? v17.f348658g : str2;
        n6Var.f202372j = v17.f348646d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(f9Var.z0())) {
            n6Var.f202374l = v17.f348734z;
        } else {
            n6Var.f202374l = f9Var.z0();
        }
        return n6Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f202543f.P(z17);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.presenter.e6(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f202541d.getString(com.tencent.mm.R.string.f489990hq);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.ui.chatting.presenter.p6(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f489595d34, viewGroup, false));
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void d(androidx.recyclerview.widget.k3 k3Var, int i17, int i18) {
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 e(android.view.ViewGroup viewGroup, int i17) {
        return null;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void f(com.tencent.mm.ui.chatting.adapter.e0 e0Var, int i17, int i18) {
        com.tencent.mm.ui.chatting.presenter.p6 p6Var = (com.tencent.mm.ui.chatting.presenter.p6) e0Var;
        com.tencent.mm.ui.chatting.presenter.n6 n6Var = (com.tencent.mm.ui.chatting.presenter.n6) h(i17);
        n6Var.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(null) || !com.tencent.mm.sdk.platformtools.t8.K0(n6Var.f202373k)) {
            p6Var.f202423m.setVisibility(8);
        } else {
            p6Var.f202423m.setVisibility(0);
            p6Var.f202423m.setText("");
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        java.lang.String str = n6Var.f202374l;
        android.content.Context context = this.f202541d;
        android.graphics.Bitmap m07 = Di.m0(null, str, i65.a.g(context), false);
        if (m07 == null || m07.isRecycled()) {
            int i19 = n6Var.f198409b;
            if (i19 == 119 || i19 == 120) {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                ya2.l.f460502a.h(n6Var.f202374l, p6Var.f202422i, mn2.f1.B);
            } else {
                android.graphics.Bitmap Di2 = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(n6Var.f202372j, 1, i65.a.g(context));
                com.tencent.mm.ui.chatting.presenter.o6 o6Var = n6Var.f202375m;
                boolean z17 = o6Var != null && o6Var.f202412a;
                java.lang.String b17 = qk.c.b(n6Var.f202374l, 4, z17);
                if (Di2 == null || Di2.isRecycled()) {
                    int i27 = z17 ? 4 : 0;
                    o11.f fVar = new o11.f();
                    fVar.f342091o = com.tencent.mm.R.color.f478816i1;
                    fVar.f342079c = true;
                    fVar.f342082f = tv.a.b(b17);
                    int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
                    int b19 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
                    fVar.f342086j = b18;
                    fVar.f342087k = b19;
                    fVar.A = new r35.n0(i27);
                    fVar.B = new r35.w(i27);
                    fVar.f342077a = true;
                    n11.a.b().h(b17, p6Var.f202422i, fVar.a());
                } else {
                    p6Var.f202422i.setImageBitmap(Di2);
                }
            }
        } else {
            p6Var.f202422i.setImageBitmap(m07);
        }
        android.widget.TextView textView = p6Var.f202424n;
        java.lang.String str2 = n6Var.f202373k;
        textView.setText(str2 != null ? str2 : "");
        p6Var.i(p6Var.f202424n, this.f202544g.f198433e);
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f202541d.getString(com.tencent.mm.R.string.f489990hq);
    }

    @Override // zb5.h
    public int getType() {
        java.util.HashSet hashSet = this.f202151s;
        hashSet.add(5);
        hashSet.add(7);
        hashSet.add(27);
        hashSet.add(26);
        hashSet.add(97);
        hashSet.add(15);
        hashSet.add(4);
        hashSet.add(68);
        hashSet.add(119);
        hashSet.add(120);
        return -1;
    }

    @Override // zb5.h
    public com.tencent.mm.ui.chatting.adapter.i0 i() {
        return new com.tencent.mm.ui.chatting.presenter.l6(this);
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y
    public int k() {
        return 3;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y, com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202152t.set(true);
        super.onDetach();
    }
}
