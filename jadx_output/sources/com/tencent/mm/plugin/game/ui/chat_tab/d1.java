package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class d1 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141254d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 f141255e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f141256f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141257g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f141258h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public int f141259i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f141260m = false;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 f141261n;

    public d1(com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2, android.content.Context context) {
        this.f141261n = gameTabWidget2;
        this.f141254d = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(com.tencent.mm.plugin.game.ui.chat_tab.d1 d1Var, org.json.JSONObject jSONObject) {
        d1Var.getClass();
        if (jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString("Key");
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) d1Var.f141255e.f141151d.get(optString);
        if (tabItem == null) {
            return;
        }
        tabItem.f141156d = jSONObject.optString("Key", tabItem.f141156d);
        tabItem.f141157e = jSONObject.optString("Title", tabItem.f141157e);
        tabItem.f141158f = jSONObject.optString("TitleColor");
        tabItem.f141159g = jSONObject.optString("SelectedTitleColor");
        tabItem.f141160h = jSONObject.optString("DarkModeTitleColor");
        tabItem.f141161i = jSONObject.optString("DarkModeSelectedTitleColor");
        tabItem.f141162m = jSONObject.optString("IconUrl", tabItem.f141162m);
        tabItem.f141163n = jSONObject.optString("SelectedIconUrl", tabItem.f141163n);
        tabItem.f141164o = jSONObject.optString("DarkModeIconUrl", tabItem.f141164o);
        tabItem.f141165p = jSONObject.optString("DarkModeSelectedIconUrl", tabItem.f141165p);
        tabItem.f141166q = jSONObject.optInt("Type", tabItem.f141166q);
        tabItem.f141167r = jSONObject.optString("JumpUrl", tabItem.f141167r);
        tabItem.f141168s = jSONObject.optJSONObject("JumpWeapp") != null ? new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemWeapp(jSONObject.optJSONObject("JumpWeapp")) : tabItem.f141168s;
        tabItem.f141169t = jSONObject.optJSONObject("Report") != null ? new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemReport(jSONObject.optJSONObject("Report")) : tabItem.f141169t;
        tabItem.f141174y = jSONObject.optJSONObject("JumpLiteapp") != null ? new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemLiteApp(jSONObject.optJSONObject("JumpLiteapp")) : tabItem.f141174y;
        tabItem.G = jSONObject.optBoolean("downloadIconDisabled", tabItem.G);
        tabItem.a();
        com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var = (com.tencent.mm.plugin.game.ui.chat_tab.c1) ((java.util.HashMap) d1Var.f141258h).get(optString);
        if (c1Var != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.chat_tab.b1(d1Var, c1Var, tabItem, optString));
        }
        com.tencent.mm.plugin.game.model.d0.f140255a = d1Var.f141255e;
    }

    public final void c(java.lang.String str, android.widget.ImageView imageView) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || imageView == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String str2 = com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.f141185p + kk.k.g(str.getBytes());
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342082f = str2;
        n11.a.b().h(str, imageView, fVar.a());
    }

    public final void d(android.widget.TextView textView, int i17) {
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2 = this.f141261n;
        if (i17 >= 100) {
            textView.setText("");
            textView.setBackgroundResource(com.tencent.mm.R.raw.badge_count_more);
            textView.setTextSize(0, i65.a.f(gameTabWidget2.getContext(), com.tencent.mm.R.dimen.f480629ad3));
            textView.setVisibility(0);
            return;
        }
        textView.setText(java.lang.String.valueOf(i17));
        textView.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(gameTabWidget2.getContext(), i17));
        textView.setTextSize(0, i65.a.f(gameTabWidget2.getContext(), com.tencent.mm.R.dimen.f480629ad3) * i65.a.m(gameTabWidget2.getContext()));
        textView.setVisibility(0);
    }

    public final int f(java.lang.String str, boolean z17) {
        int z18 = r53.f.z(str);
        if (z18 != 0) {
            return z18;
        }
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2 = this.f141261n;
        return z17 ? gameTabWidget2.getResources().getColor(com.tencent.mm.R.color.f479206su) : gameTabWidget2.getResources().getColor(com.tencent.mm.R.color.f479166rq);
    }

    public void g(boolean z17) {
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = this.f141255e;
        if (gameTabData2 != null) {
            com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var = (com.tencent.mm.plugin.game.ui.chat_tab.c1) ((java.util.HashMap) this.f141258h).get(gameTabData2.b());
            if (c1Var != null) {
                android.widget.ImageView imageView = c1Var.f141249c;
                android.widget.TextView textView = c1Var.f141250d;
                if (z17) {
                    textView.setVisibility(4);
                    imageView.setVisibility(0);
                } else {
                    textView.setVisibility(4);
                    imageView.setVisibility(8);
                }
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = this.f141255e;
        if (gameTabData2 == null) {
            return 0;
        }
        return ((java.util.ArrayList) gameTabData2.a()).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) ((java.util.ArrayList) this.f141255e.a()).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f141254d).inflate(com.tencent.mm.R.layout.bf6, viewGroup, false);
        com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var = new com.tencent.mm.plugin.game.ui.chat_tab.c1(this, inflate);
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2 gameTabWidget2 = this.f141261n;
        boolean D = i65.a.D(gameTabWidget2.getContext());
        android.widget.TextView textView = c1Var.f141247a;
        android.widget.TextView textView2 = c1Var.f141250d;
        if (D) {
            textView.setTextSize(0, i65.a.f(gameTabWidget2.getContext(), com.tencent.mm.R.dimen.f479808ft) * i65.a.m(gameTabWidget2.getContext()));
            textView2.setTextSize(0, i65.a.f(gameTabWidget2.getContext(), com.tencent.mm.R.dimen.f479808ft) * i65.a.m(gameTabWidget2.getContext()));
        }
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) ((java.util.ArrayList) this.f141255e.a()).get(i17);
        if (tabItem != null) {
            textView.setText(tabItem.f141157e);
            java.lang.String str = this.f141256f;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            k(c1Var, tabItem, str.equalsIgnoreCase(tabItem.f141156d), this.f141257g);
            boolean z18 = tabItem.C;
            android.widget.ImageView imageView = c1Var.f141249c;
            if (z18) {
                int i18 = tabItem.D;
                if (i18 > 0) {
                    d(textView2, i18);
                    imageView.setVisibility(4);
                } else {
                    textView2.setVisibility(4);
                    imageView.setVisibility(0);
                }
            } else {
                textView2.setVisibility(4);
                imageView.setVisibility(8);
            }
            ((java.util.HashMap) this.f141258h).put(tabItem.f141156d, c1Var);
        }
        inflate.setTag(tabItem);
        return inflate;
    }

    public void h(int i17, boolean z17) {
        this.f141259i = i17;
        this.f141260m = z17;
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.chat_tab.a1(this, z17));
            return;
        }
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = this.f141255e;
        if (gameTabData2 != null) {
            com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var = (com.tencent.mm.plugin.game.ui.chat_tab.c1) ((java.util.HashMap) this.f141258h).get(gameTabData2.b());
            if (c1Var != null) {
                if (i17 > 0 || z17) {
                    c1Var.f141250d.setVisibility(4);
                    c1Var.f141249c.setVisibility(0);
                } else {
                    c1Var.f141250d.setVisibility(4);
                    c1Var.f141249c.setVisibility(8);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(java.lang.String str, int i17, boolean z17) {
        if (this.f141255e != null) {
            com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var = (com.tencent.mm.plugin.game.ui.chat_tab.c1) ((java.util.HashMap) this.f141258h).get(str);
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) this.f141255e.f141151d.get(str);
            if (tabItem != null) {
                tabItem.C = true;
                tabItem.D = i17;
                com.tencent.mm.plugin.game.model.d0.f140255a = this.f141255e;
            }
            if (c1Var != null) {
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.game.ui.chat_tab.z0(this, z17, i17, c1Var));
            }
        }
    }

    public final void k(com.tencent.mm.plugin.game.ui.chat_tab.c1 c1Var, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem, boolean z17, java.lang.String str) {
        c1Var.f141249c.setVisibility(8);
        java.lang.String str2 = tabItem.f141156d;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.equalsIgnoreCase(str) || tabItem.C) {
            int i17 = tabItem.D;
            android.widget.ImageView imageView = c1Var.f141249c;
            android.widget.TextView textView = c1Var.f141250d;
            if (i17 > 0) {
                d(textView, i17);
                imageView.setVisibility(4);
            } else {
                textView.setVisibility(4);
                imageView.setVisibility(0);
            }
        }
        java.lang.String str3 = tabItem.f141157e;
        android.widget.TextView textView2 = c1Var.f141247a;
        textView2.setText(str3);
        boolean C = com.tencent.mm.ui.bk.C();
        android.widget.ImageView imageView2 = c1Var.f141248b;
        if (C) {
            int f17 = f(tabItem.f141160h, z17);
            int f18 = f(tabItem.f141161i, z17);
            java.lang.String str4 = tabItem.f141164o;
            java.lang.String str5 = tabItem.f141165p;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                str5 = str4;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                str4 = tabItem.f141162m;
                str5 = tabItem.f141163n;
            }
            if (z17) {
                c(str5, imageView2);
                textView2.setTextColor(f18);
            } else {
                c(str4, imageView2);
                textView2.setTextColor(f17);
            }
        } else {
            int f19 = f(tabItem.f141158f, z17);
            int f27 = f(tabItem.f141159g, z17);
            java.lang.String str6 = tabItem.f141162m;
            java.lang.String str7 = tabItem.f141163n;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
                str7 = str6;
            }
            if (z17) {
                this.f141256f = tabItem.f141156d;
                c(str7, imageView2);
                textView2.setTextColor(f27);
            } else {
                c(str6, imageView2);
                textView2.setTextColor(f19);
            }
        }
        c1Var.f141251e.setTag(tabItem);
    }
}
