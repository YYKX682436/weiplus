package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class z0 extends com.tencent.mm.ui.chatting.presenter.y {

    /* renamed from: v, reason: collision with root package name */
    public static final te5.i f202569v = new te5.i(0, 1, null);

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f202570w = {1090519089};

    /* renamed from: x, reason: collision with root package name */
    public static final java.lang.String[] f202571x = {"msgId", "type", "createTime", "talker", "content", "isSend", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202572s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f202573t;

    /* renamed from: u, reason: collision with root package name */
    public final int f202574u;

    public z0(android.content.Context context) {
        super(context);
        this.f202572s = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f202573t = new java.util.concurrent.ConcurrentHashMap();
        this.f202574u = -1;
    }

    public static com.tencent.mm.ui.chatting.presenter.w0 p(com.tencent.mm.ui.chatting.presenter.z0 z0Var, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.a3 a3Var) {
        ot0.q v17;
        z0Var.getClass();
        java.lang.String j17 = f9Var.j();
        if (j17 == null || (v17 = ot0.q.v(j17)) == null) {
            return null;
        }
        int i17 = v17.f348666i;
        if (!(te5.h.f418649a.c() ? ez.v0.f257777a.i(java.lang.Integer.valueOf(i17)) : 6 == i17)) {
            return null;
        }
        java.lang.String j18 = z0Var.j(f9Var, com.tencent.mm.storage.z3.R4(z0Var.f202542e), false);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(j18, true);
        java.lang.String z07 = a3Var != null ? a3Var.z0(j18) : "";
        java.lang.String str = v17.f348690o;
        kk.j jVar = com.tencent.mm.plugin.fav.ui.u1.f101464a;
        int a17 = o25.y.a(str);
        com.tencent.mm.ui.chatting.presenter.w0 w0Var = new com.tencent.mm.ui.chatting.presenter.w0(z0Var, f9Var.getCreateTime(), v17.f348666i, v17.n(), f9Var.getMsgId(), n17.d1(), n17.f2(), n17.w0(), z07);
        w0Var.f202511j = a17;
        w0Var.f202512k = com.tencent.mm.sdk.platformtools.t8.f0(v17.f348682m);
        w0Var.f202513l = v17.f348690o;
        return w0Var;
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        com.tencent.mars.xlog.Log.i("MicroMsg.FileHistoryListPresenter", "[loadData] isFirst:%s", java.lang.Boolean.valueOf(z17));
        this.f202543f.P(z17);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.presenter.k0(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f202541d.getString(com.tencent.mm.R.string.f489987hn);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return te5.h.f418649a.c() ? new com.tencent.mm.ui.chatting.presenter.x0(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.e5i, viewGroup, false)) : new com.tencent.mm.ui.chatting.presenter.y0(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.acy, viewGroup, false));
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
        if (!te5.h.f418649a.c()) {
            com.tencent.mm.ui.chatting.presenter.y0 y0Var = (com.tencent.mm.ui.chatting.presenter.y0) e0Var;
            com.tencent.mm.ui.chatting.presenter.w0 w0Var = (com.tencent.mm.ui.chatting.presenter.w0) h(i17);
            if (w0Var == null) {
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(w0Var.f202512k)) {
                y0Var.f202554m.setVisibility(8);
            } else {
                y0Var.f202554m.setVisibility(0);
                android.widget.TextView textView = y0Var.f202554m;
                java.lang.String str = w0Var.f202512k;
                textView.setText(str != null ? str : "");
            }
            y0Var.f202553i.setImageResource(w0Var.f202511j);
            return;
        }
        com.tencent.mm.ui.chatting.presenter.x0 x0Var = (com.tencent.mm.ui.chatting.presenter.x0) e0Var;
        com.tencent.mm.ui.chatting.presenter.w0 w0Var2 = (com.tencent.mm.ui.chatting.presenter.w0) h(i17);
        if (w0Var2 == null) {
            return;
        }
        long j17 = w0Var2.f198411d;
        x0Var.f202533q = j17;
        android.widget.TextView textView2 = x0Var.f202529m;
        java.lang.String str2 = w0Var2.f202512k;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        textView2.setText(str2 != null ? str2 : "");
        te5.i iVar = (te5.i) this.f202573t.get(java.lang.Long.valueOf(j17));
        if (iVar != null) {
            q(x0Var, iVar, w0Var2);
        } else {
            q(x0Var, f202569v, w0Var2);
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.v0(this, j17, w0Var2.f202513l, x0Var, w0Var2));
        }
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f202541d.getString(com.tencent.mm.R.string.f489987hn);
    }

    @Override // zb5.h
    public int getType() {
        return 6;
    }

    @Override // zb5.h
    public com.tencent.mm.ui.chatting.adapter.i0 i() {
        return new com.tencent.mm.ui.chatting.presenter.t0(this);
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y
    public int k() {
        return 2;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y, com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202572s.set(true);
        super.onDetach();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(com.tencent.mm.ui.chatting.presenter.x0 r8, te5.i r9, com.tencent.mm.ui.chatting.presenter.w0 r10) {
        /*
            r7 = this;
            android.widget.ImageView r0 = r8.f202528i
            int r1 = r9.f418672d
            r0.setImageResource(r1)
            boolean r0 = r9.f418670b
            r1 = 0
            com.tencent.mm.ui.widget.progress.RoundProgressBtn r2 = r8.f202531o
            if (r0 == 0) goto L16
            r2.setVisibility(r1)
            int r0 = r9.f418671c
            r2.setProgress(r0)
        L16:
            r0 = 1
            r3 = 8
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = r8.f202532p
            int r5 = r9.f418669a
            if (r5 == r0) goto L50
            r6 = 2
            if (r5 == r6) goto L43
            r6 = 3
            if (r5 == r6) goto L50
            r0 = 4
            if (r5 == r0) goto L36
            r0 = 9
            if (r5 == r0) goto L43
            r4.setVisibility(r3)
            r2.setVisibility(r3)
            r2.setHasPause(r1)
            goto L56
        L36:
            r2.setHasPause(r1)
            r4.setVisibility(r1)
            r0 = 2131689552(0x7f0f0050, float:1.9008123E38)
            r4.setImageResource(r0)
            goto L56
        L43:
            r2.setHasPause(r1)
            r4.setVisibility(r1)
            r0 = 2131689553(0x7f0f0051, float:1.9008125E38)
            r4.setImageResource(r0)
            goto L56
        L50:
            r4.setVisibility(r3)
            r2.setHasPause(r0)
        L56:
            java.lang.String r10 = r10.f202512k
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a
            if (r10 != 0) goto L5e
            java.lang.String r10 = ""
        L5e:
            android.widget.TextView r0 = r8.f202529m
            r0.setText(r10)
            java.lang.String r10 = r9.f418673e
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r10)
            android.content.Context r5 = r7.f202541d
            android.widget.TextView r8 = r8.f202530n
            if (r0 == 0) goto L73
            r8.setVisibility(r3)
            goto L82
        L73:
            r8.setVisibility(r1)
            r8.setText(r10)
            int r10 = r9.f418675g
            int r10 = r5.getColor(r10)
            r8.setTextColor(r10)
        L82:
            te5.j r8 = te5.j.f418686a
            java.lang.String r9 = r9.f418674f
            int r8 = r8.b(r9)
            android.content.res.Resources r9 = r5.getResources()
            r10 = 0
            int r8 = r9.getColor(r8, r10)
            r4.setIconColor(r8)
            r2.setProgressColor(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.presenter.z0.q(com.tencent.mm.ui.chatting.presenter.x0, te5.i, com.tencent.mm.ui.chatting.presenter.w0):void");
    }
}
