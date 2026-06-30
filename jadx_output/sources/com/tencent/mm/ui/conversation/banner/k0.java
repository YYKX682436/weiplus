package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class k0 extends s35.b {
    public static final java.lang.String G = "http://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyq) + "/cgi-bin/report_mm?failuretype=1&devicetype=2&clientversion=%s&os=%s&username=%s&iport=%s&t=weixin_bulletin&f=xhtml&lang=%s";
    public boolean A;
    public boolean B;
    public java.lang.String C;
    public com.tencent.mm.sdk.platformtools.b4 D;
    public com.tencent.mm.sdk.event.IListener E;
    public android.view.View F;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f207526m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f207527n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f207528o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f207529p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f207530q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f207531r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f207532s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f207533t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f207534u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.ProgressBar f207535v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f207536w;

    /* renamed from: x, reason: collision with root package name */
    public int f207537x;

    /* renamed from: y, reason: collision with root package name */
    public int f207538y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f207539z;

    public k0(android.content.Context context) {
        super(context);
        this.f207537x = 0;
        this.F = null;
    }

    public static void l(com.tencent.mm.ui.conversation.banner.k0 k0Var, int i17) {
        k0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("diagnose_state", i17);
        intent.putExtra("diagnose_percent", k0Var.f207538y);
        intent.putExtra("diagnose_kvInfo", k0Var.C);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetWarnView", "put state: %d, process: %d, kv: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(k0Var.f207538y), k0Var.C);
        j45.l.j((android.content.Context) k0Var.f402842g.get(), "traceroute", ".ui.NetworkDiagnoseAllInOneUI", intent, null);
    }

    @Override // s35.b
    public void a() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.D;
        if (b4Var != null) {
            b4Var.d();
            this.D = null;
        }
        com.tencent.mm.sdk.event.IListener iListener = this.E;
        if (iListener != null) {
            iListener.dead();
        }
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.c7f;
    }

    @Override // s35.b
    public int c() {
        return 4;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.F = view.findViewById(com.tencent.mm.R.id.kh7);
        this.f207526m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486176kh2);
        this.f207527n = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486177kh3);
        this.f207528o = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486178kh4);
        this.f207529p = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f486175kh1);
        this.f207535v = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.kh6);
        this.f207531r = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f486179kh5);
        this.f207532s = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.close_icon);
        this.f207533t = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485051gd1);
        this.f207534u = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.mwv);
        this.f207530q = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dfs);
        this.f207532s.setVisibility(8);
    }

    @Override // s35.b
    public boolean i() {
        int n17 = c01.d9.e().n();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetWarnView", "Update network status: %d", java.lang.Integer.valueOf(n17));
        boolean z17 = true;
        boolean z18 = n17 == 0 || n17 == 5 || n17 == 2 || n17 == 3;
        if (z18) {
            f();
        } else if (!this.f402844i) {
            return false;
        }
        this.f207536w = java.lang.String.format(G, "0x" + java.lang.Integer.toHexString(o45.wf.f343029g), wo.q.f447780a, c01.z1.r(), c01.d9.e().l(), com.tencent.mm.sdk.platformtools.m2.d());
        java.lang.ref.WeakReference weakReference = this.f402842g;
        if (n17 == 0) {
            this.f207526m.setText(com.tencent.mm.R.string.f490500wu);
            this.f207527n.setVisibility(8);
            this.f207529p.setVisibility(8);
            this.f207535v.setVisibility(8);
            this.f207531r.setVisibility(0);
            this.F.setOnClickListener(new com.tencent.mm.ui.conversation.banner.h0(this));
        } else if (n17 == 5) {
            this.f207526m.setText(com.tencent.mm.R.string.h7k);
            this.f207527n.setText(((android.content.Context) weakReference.get()).getString(com.tencent.mm.R.string.h7l));
            this.f207527n.setVisibility(0);
            this.f207529p.setVisibility(8);
            this.f207535v.setVisibility(8);
            this.f207531r.setVisibility(0);
            this.F.setOnClickListener(new com.tencent.mm.ui.conversation.banner.j0(this));
        } else if (n17 == 2) {
            if (this.f207537x == 1) {
                this.f207526m.setText(((android.content.Context) weakReference.get()).getResources().getString(com.tencent.mm.R.string.h7j, java.lang.Integer.valueOf(this.f207538y)));
            } else {
                this.f207526m.setText(com.tencent.mm.R.string.h7i);
            }
            this.f207527n.setVisibility(8);
            this.f207529p.setVisibility(8);
            this.f207535v.setVisibility(8);
            this.f207531r.setVisibility(0);
            this.F.setOnClickListener(new com.tencent.mm.ui.conversation.banner.i0(this));
        } else if (n17 == 3) {
            this.f207526m.setText(com.tencent.mm.R.string.h7g);
            this.f207527n.setVisibility(8);
            this.f207529p.setVisibility(8);
            this.f207535v.setVisibility(0);
            this.f207531r.setVisibility(0);
        }
        if (z18) {
            this.f207528o.setVisibility(8);
            this.f207526m.setVisibility(0);
            this.F.setBackgroundResource(com.tencent.mm.R.drawable.f482182b71);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(this.f207531r.getLayoutParams());
            layoutParams.setMargins(i65.a.b((android.content.Context) weakReference.get(), 28), 0, i65.a.b((android.content.Context) weakReference.get(), 24), 0);
            this.f207531r.setLayoutParams(layoutParams);
            java.lang.Object tag = this.f207531r.getTag();
            if (tag == null || ((java.lang.Integer) tag).intValue() != com.tencent.mm.R.raw.icons_filled_error) {
                this.f207531r.setTag(java.lang.Integer.valueOf(com.tencent.mm.R.raw.icons_filled_error));
                this.f207531r.setImageDrawable(com.tencent.mm.ui.uk.e((android.content.Context) weakReference.get(), com.tencent.mm.R.raw.icons_filled_error, ((android.content.Context) weakReference.get()).getResources().getColor(com.tencent.mm.R.color.f478532ac)));
            }
            this.f207533t.setVisibility(8);
            this.f207534u.setVisibility(8);
            this.f207530q.setVisibility(8);
        }
        if (!z18) {
            this.f207532s.setVisibility(8);
        }
        java.lang.Object tag2 = this.f207534u.getTag();
        if (tag2 == null || ((java.lang.Integer) tag2).intValue() != com.tencent.mm.R.raw.chat_mute_notify_normal) {
            this.f207534u.setTag(java.lang.Integer.valueOf(com.tencent.mm.R.raw.chat_mute_notify_normal));
            this.f207534u.setImageResource(com.tencent.mm.R.raw.chat_mute_notify_normal);
        }
        java.lang.Object tag3 = this.f207532s.getTag();
        if (tag3 != null && ((java.lang.Integer) tag3).intValue() == com.tencent.mm.R.raw.chat_mute_notify_normal) {
            z17 = false;
        }
        if (z17) {
            this.f207532s.setTag(java.lang.Integer.valueOf(com.tencent.mm.R.raw.chat_mute_notify_normal));
            this.f207532s.setImageResource(com.tencent.mm.R.drawable.f481018iv);
        }
        android.view.View view = this.F;
        int i17 = z18 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/NetWarnBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/NetWarnBanner", "refreshAndReturnIsVisible", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return z18;
    }

    @Override // s35.b
    public void k(int i17) {
        android.view.View view = this.F;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/NetWarnBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/NetWarnBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
