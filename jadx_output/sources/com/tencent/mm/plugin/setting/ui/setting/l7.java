package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class l7 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f161274d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView f161275e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f161276f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f161277g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f161278h;

    /* renamed from: i, reason: collision with root package name */
    public int f161279i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.g7 f161280m;

    /* renamed from: n, reason: collision with root package name */
    public int f161281n;

    /* renamed from: o, reason: collision with root package name */
    public int f161282o;

    /* renamed from: p, reason: collision with root package name */
    public final int f161283p;

    /* renamed from: q, reason: collision with root package name */
    public final int f161284q;

    /* renamed from: r, reason: collision with root package name */
    public final int f161285r;

    public l7(android.content.Context context, com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f161274d = context;
        this.f161275e = recyclerView;
        this.f161276f = new java.util.ArrayList();
        this.f161278h = true;
        int B = (((i65.a.B(context) - (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7) * 2)) - context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479671c8)) - context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz)) - context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        this.f161283p = B;
        int i17 = B / 2;
        this.f161284q = i17;
        int i18 = B / 2;
        this.f161285r = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthUI", "computeViewWidth appName: %s, appType: %s, content: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(B));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f161276f).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.setting.ui.setting.h7 h7Var = (com.tencent.mm.plugin.setting.ui.setting.h7) kz5.n0.a0(this.f161276f, i17);
        if (h7Var != null) {
            return h7Var.f161097a;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.String appname;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder instanceof com.tencent.mm.plugin.setting.ui.setting.e7) {
            com.tencent.mm.plugin.setting.ui.setting.e7 e7Var = (com.tencent.mm.plugin.setting.ui.setting.e7) holder;
            com.tencent.mm.plugin.setting.ui.setting.h7 h7Var = (com.tencent.mm.plugin.setting.ui.setting.h7) kz5.n0.a0(this.f161276f, i17);
            r45.ov6 ov6Var = h7Var != null ? h7Var.f161098b : null;
            if (ov6Var == null) {
                return;
            }
            java.lang.String str = ov6Var.f382561e;
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = e7Var.f160984e;
            mMNeat7extView.b(str);
            java.lang.String string = this.f161274d.getResources().getString(com.tencent.mm.R.string.iiq);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.util.LinkedList linkedList = ov6Var.f382563g;
            java.lang.String g07 = linkedList == null ? "" : kz5.n0.g0(k14.j0.a(linkedList), string, null, null, 0, null, k14.h0.f303339d, 30, null);
            boolean z17 = g07.length() > 0;
            com.tencent.neattextview.textview.view.NeatTextView neatTextView = e7Var.f160986g;
            if (z17) {
                neatTextView.b(g07);
                neatTextView.setVisibility(0);
            } else {
                neatTextView.b("");
                neatTextView.setVisibility(4);
            }
            java.lang.String str2 = ov6Var.f382565i;
            boolean z18 = str2 == null || str2.length() == 0;
            android.widget.TextView textView = e7Var.f160985f;
            if (z18) {
                textView.setText("");
                textView.setVisibility(8);
            } else {
                textView.setText(ov6Var.f382565i);
                textView.setVisibility(0);
            }
            kotlin.jvm.internal.o.f(mMNeat7extView, "<get-authName>(...)");
            kotlin.jvm.internal.o.f(textView, "<get-authType>(...)");
            k14.k0.a(mMNeat7extView, textView, this.f161283p, this.f161284q, this.f161285r, true);
            com.tencent.mm.plugin.setting.ui.setting.i7 i7Var = new com.tencent.mm.plugin.setting.ui.setting.i7(this);
            android.widget.RelativeLayout relativeLayout = e7Var.f160983d;
            relativeLayout.setOnTouchListener(i7Var);
            relativeLayout.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.j7(this, i17, ov6Var));
            relativeLayout.setOnLongClickListener(new com.tencent.mm.plugin.setting.ui.setting.k7(this, i17, ov6Var));
            java.lang.String str3 = ov6Var.f382561e;
            if (str3 == null || str3.length() == 0) {
                appname = "";
            } else {
                appname = ov6Var.f382561e;
                kotlin.jvm.internal.o.f(appname, "appname");
            }
            java.lang.String str4 = ov6Var.f382565i;
            if (!(str4 == null || str4.length() == 0)) {
                appname = appname + ',' + ov6Var.f382565i;
            }
            if (g07.length() > 0) {
                appname = appname + ',' + g07;
            }
            if (appname.length() > 0) {
                relativeLayout.setContentDescription(appname);
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = this.f161274d;
        if (i17 == 2) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bp7, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new com.tencent.mm.plugin.setting.ui.setting.f7(inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bp6, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new com.tencent.mm.plugin.setting.ui.setting.e7(inflate2);
    }

    public final boolean x() {
        return this.f161279i <= 0;
    }

    public final boolean y(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAuthUI", "removeAuthItem position: " + i17 + ", size: " + getItemCount());
        if (!(i17 >= 0 && i17 < getItemCount())) {
            return false;
        }
        ((java.util.ArrayList) this.f161276f).remove(i17);
        this.f161279i--;
        notifyItemRemoved(i17);
        return true;
    }
}
