package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes12.dex */
public class NetStatPreference extends com.tencent.mm.ui.base.preference.Preference {
    public boolean L;

    public NetStatPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        android.content.Context context;
        int i17;
        com.tencent.mm.plugin.setting.ui.setting.NetStatGroup netStatGroup;
        boolean z17;
        com.tencent.mm.plugin.setting.ui.setting.NetStatPreference netStatPreference = this;
        super.t(view);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.gtt);
        linearLayout.removeAllViews();
        long j17 = 86400000;
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 86400000);
        int i18 = 15;
        while (true) {
            context = netStatPreference.f197770d;
            android.util.AttributeSet attributeSet = null;
            if (i18 <= 0) {
                break;
            }
            com.tencent.mm.plugin.setting.ui.setting.NetStatGroup netStatGroup2 = new com.tencent.mm.plugin.setting.ui.setting.NetStatGroup(context, null);
            int i19 = (currentTimeMillis - i18) + 1;
            boolean z18 = netStatPreference.L;
            netStatGroup2.f160152e.setText(android.text.format.DateFormat.format(netStatGroup2.getContext().getString(com.tencent.mm.R.string.f492135fc2, ""), i19 * j17).toString());
            netStatGroup2.f160151d.removeAllViews();
            int i27 = 0;
            while (i27 < 5) {
                com.tencent.mm.plugin.setting.ui.setting.NetStatUnit netStatUnit = new com.tencent.mm.plugin.setting.ui.setting.NetStatUnit(netStatGroup2.getContext(), attributeSet);
                ((u90.t) ((v90.w) i95.n0.c(v90.w.class))).getClass();
                com.tencent.mm.modelstat.s n07 = com.tencent.mm.modelstat.t0.Ai().n0(i19 + i27);
                if (n07 == null) {
                    i17 = i19;
                    netStatGroup = netStatGroup2;
                    z17 = z18;
                } else if (z18) {
                    netStatGroup = netStatGroup2;
                    i17 = i19;
                    z17 = z18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetStatUnit", "dknetflow peroid:%d wifi : %d %d %d %d", java.lang.Integer.valueOf(n07.f71555c), java.lang.Long.valueOf(n07.f71577y), java.lang.Long.valueOf(n07.f71565m), java.lang.Long.valueOf(n07.A), java.lang.Long.valueOf(n07.f71567o));
                    netStatUnit.a(n07.f71577y + n07.f71565m, n07.A + n07.f71567o);
                } else {
                    i17 = i19;
                    netStatGroup = netStatGroup2;
                    z17 = z18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetStatUnit", "dknetflow peroid:%d mobile : %d %d %d %d", java.lang.Integer.valueOf(n07.f71555c), java.lang.Long.valueOf(n07.f71576x), java.lang.Long.valueOf(n07.f71564l), java.lang.Long.valueOf(n07.f71578z), java.lang.Long.valueOf(n07.f71566n));
                    netStatUnit.a(n07.f71576x + n07.f71564l, n07.f71578z + n07.f71566n);
                }
                netStatUnit.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0f));
                com.tencent.mm.plugin.setting.ui.setting.NetStatGroup netStatGroup3 = netStatGroup;
                netStatGroup3.f160151d.addView(netStatUnit);
                i27++;
                attributeSet = null;
                netStatGroup2 = netStatGroup3;
                z18 = z17;
                i19 = i17;
            }
            linearLayout.addView(netStatGroup2, -2, -1);
            i18 -= 5;
            j17 = 86400000;
            netStatPreference = this;
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.m8j);
        linearLayout2.removeAllViews();
        com.tencent.mm.plugin.setting.ui.setting.NetStatGroup netStatGroup4 = new com.tencent.mm.plugin.setting.ui.setting.NetStatGroup(context, null);
        boolean z19 = this.L;
        netStatGroup4.removeAllViews();
        android.view.View.inflate(netStatGroup4.getContext(), com.tencent.mm.R.layout.c7h, netStatGroup4);
        netStatGroup4.f160151d = (android.widget.LinearLayout) netStatGroup4.findViewById(com.tencent.mm.R.id.gtt);
        com.tencent.mm.plugin.setting.ui.setting.NetStatRuler netStatRuler = new com.tencent.mm.plugin.setting.ui.setting.NetStatRuler(netStatGroup4.getContext(), null);
        netStatRuler.setTag(z19 ? "wifi" : "mobile");
        netStatRuler.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0f));
        netStatGroup4.f160151d.addView(netStatRuler);
        linearLayout2.addView(netStatGroup4);
        E(8);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.bzq, viewGroup2);
        return u17;
    }

    public NetStatPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetStatPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f14.f.f258685b, i17, 0);
        this.L = obtainStyledAttributes.getInt(0, 0) == 1;
        obtainStyledAttributes.recycle();
        H(context.getString(com.tencent.mm.R.string.ity, 15));
    }
}
