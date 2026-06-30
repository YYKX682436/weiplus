package com.tencent.mm.plugin.preference;

/* loaded from: classes11.dex */
public class PluginPreference extends com.tencent.mm.ui.base.preference.Preference implements kv.e0 {
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public int P;
    public int Q;
    public boolean R;
    public android.widget.ImageView S;
    public float T;
    public final com.tencent.mm.ui.MMActivity U;
    public android.widget.TextView V;

    public PluginPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean M(java.lang.String str) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginPreference", "plugin do not exist");
            return false;
        }
        this.L = n17.d1();
        this.M = n17.f2();
        C("settings_plugins_list_#" + this.L);
        return true;
    }

    public boolean N(java.lang.String str, java.lang.String str2) {
        this.L = str;
        this.M = str2;
        C("settings_plugins_list_#" + this.L);
        return true;
    }

    public final void O() {
        if (this.S != null) {
            if (this.L.equals("newsapp")) {
                this.S.setImageResource(com.tencent.mm.R.raw.default_readerapp_plugin);
            } else {
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.S, this.L, null);
            }
            this.S.setAlpha(this.T);
        }
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        java.lang.String str2 = this.L;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new eq3.a(this));
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.S = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9o);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o58);
        this.V = textView;
        if (textView != null) {
            textView.setVisibility(this.Q);
            this.V.setText(this.N);
            int i17 = this.P;
            if (i17 != -1) {
                this.V.setBackgroundDrawable(i65.a.i(this.U, i17));
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.k7m);
        if (textView2 != null) {
            textView2.setVisibility(this.R ? 0 : 8);
        }
        O();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.bzs, viewGroup2);
        return u17;
    }

    public PluginPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = "";
        this.P = -1;
        this.Q = 8;
        this.R = false;
        this.S = null;
        this.T = 1.0f;
        this.U = (com.tencent.mm.ui.MMActivity) context;
        this.G = com.tencent.mm.R.layout.byv;
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.Ai().d(this);
    }
}
