package com.tencent.mm.plugin.wenote.ui.nativenote;

/* loaded from: classes12.dex */
public class j2 extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f188221m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f188222n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f188223o;

    /* renamed from: p, reason: collision with root package name */
    public final ih0.s f188224p;

    public j2(android.content.Context context) {
        super(context);
        this.f188221m = null;
        this.f188224p = new com.tencent.mm.plugin.wenote.ui.nativenote.h2(this);
    }

    @Override // s35.b
    public void a() {
        com.tencent.mars.xlog.Log.i("WNNoteBanner", "destroy: ");
        ih0.r rVar = (ih0.r) i95.n0.c(ih0.r.class);
        ih0.s listener = this.f188224p;
        dz4.s1 s1Var = (dz4.s1) rVar;
        s1Var.getClass();
        kotlin.jvm.internal.o.g(listener, "listener");
        s1Var.f245398f.remove(listener);
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.d_c;
    }

    @Override // s35.b
    public int c() {
        return 0;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        com.tencent.mars.xlog.Log.i("WNNoteBanner", "onInitializeView: ");
        ih0.r rVar = (ih0.r) i95.n0.c(ih0.r.class);
        ih0.s listener = this.f188224p;
        dz4.s1 s1Var = (dz4.s1) rVar;
        s1Var.getClass();
        kotlin.jvm.internal.o.g(listener, "listener");
        s1Var.f245398f.add(listener);
        this.f188221m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.pl8);
        this.f188223o = view.findViewById(com.tencent.mm.R.id.pl9);
        this.f188222n = view.findViewById(com.tencent.mm.R.id.f483351af3);
        this.f188221m.setTextSize(0, i65.a.h(r0.getContext(), com.tencent.mm.R.dimen.f479853h2));
        view.setOnClickListener(new com.tencent.mm.plugin.wenote.ui.nativenote.i2(this));
    }

    @Override // s35.b
    public boolean i() {
        try {
            if (mz4.b0.c().a() != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WENOTE_KEEP_TOP_DATA_LAST_REPORT_TIME_LONG_SYNC;
                if (currentTimeMillis - ((java.lang.Long) p17.m(u3Var, 0L)).longValue() > 86400000) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18728, 1);
                    c01.d9.b().p().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        iz4.r a17 = mz4.b0.c().a();
        boolean z17 = (a17 != null && a17.f296139d && a17.f296141f > 0 && !com.tencent.mm.sdk.platformtools.t8.K0(a17.f296145m)) || !(a17 == null || a17.f296139d || hz4.l.a(a17.f296140e) == null);
        if (!z17 && a17 != null) {
            mz4.b0.c().d(null);
        }
        if (z17) {
            f();
        } else if (!this.f402844i) {
            return false;
        }
        boolean z18 = this.f402839d;
        if (z18 && this.f402840e) {
            this.f188223o.setBackgroundResource(com.tencent.mm.R.drawable.f482184b73);
            this.f188221m.setBackground(null);
        } else if (z18) {
            this.f188222n.setBackgroundResource(com.tencent.mm.R.drawable.aj6);
            this.f188223o.setBackgroundResource(com.tencent.mm.R.drawable.c7z);
            this.f188221m.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
        } else if (this.f402840e) {
            this.f188222n.setBackgroundResource(com.tencent.mm.R.drawable.aj6);
            this.f188223o.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
            this.f188221m.setBackground(null);
        } else {
            this.f188222n.setBackgroundResource(com.tencent.mm.R.drawable.aj6);
            this.f188223o.setBackground(null);
            this.f188221m.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
        }
        if (!z17) {
            k(8);
            return false;
        }
        java.lang.String str = a17.f296144i;
        android.widget.TextView textView = this.f188221m;
        if (textView != null) {
            textView.setText(str);
        }
        k(0);
        return true;
    }

    @Override // s35.b
    public void k(int i17) {
        if (!this.f402844i) {
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.e("WNNoteBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout = this.f402843h;
        if (linearLayout != null) {
            android.view.View findViewById = linearLayout.findViewById(com.tencent.mm.R.id.pl9);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
