package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class k extends com.tencent.mm.plugin.nearlife.ui.a {
    public double A;
    public double B;

    /* renamed from: u, reason: collision with root package name */
    public dn3.i f152324u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f152325v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.HashMap f152326w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f152327x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f152328y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f152329z;

    public k(android.content.Context context, android.view.View.OnClickListener onClickListener, java.lang.String str, boolean z17, boolean z18, java.lang.String str2, boolean z19) {
        super(context, onClickListener, str, z18);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f152326w = hashMap;
        this.f152327x = true;
        this.f152329z = false;
        this.A = -85.0d;
        this.B = -1000.0d;
        dn3.i iVar = new dn3.i("", new r45.c64());
        iVar.f242007b = "NotCheckIn";
        iVar.f242008c = context.getString(com.tencent.mm.R.string.h5r);
        this.f152327x = z17;
        this.f152328y = str2;
        hashMap.put(iVar.f242007b, 2);
        if (!z18 && z17) {
            a(iVar, 0);
            notifyDataSetChanged();
        }
        this.f152329z = z19;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.nearlife.ui.l lVar;
        android.view.View view2;
        java.lang.String str;
        java.lang.String str2;
        android.content.Context context = this.f152301f;
        if (view == null) {
            lVar = new com.tencent.mm.plugin.nearlife.ui.l(this);
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.c5x, null);
            lVar.f152334d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f485543i16);
            lVar.f152336f = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f485542i15);
            lVar.f152335e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f485541i14);
            lVar.f152333c = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.m7k);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.mjd);
            lVar.f152337g = weImageView;
            java.lang.String str3 = this.f152328y;
            if (str3 != null) {
                weImageView.setIconColor(android.graphics.Color.parseColor(str3));
            }
            lVar.f152333c.setOnClickListener(this.f152312t);
            view2.setTag(lVar);
        } else {
            lVar = (com.tencent.mm.plugin.nearlife.ui.l) view.getTag();
            view2 = view;
        }
        dn3.i item = getItem(i17);
        java.util.HashMap hashMap = this.f152326w;
        int intValue = hashMap.containsKey(item.f242007b) ? ((java.lang.Integer) hashMap.get(item.f242007b)).intValue() : 0;
        lVar.f152337g.setVisibility(8);
        lVar.f152331a = intValue;
        lVar.f152332b = item;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f152325v) && this.f152325v.equals(item.f242007b)) {
            lVar.f152337g.setVisibility(0);
        }
        if (intValue == 0) {
            lVar.f152334d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            lVar.f152335e.setVisibility(0);
        } else if (intValue == 1) {
            lVar.f152334d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            lVar.f152335e.setVisibility(8);
        } else if (intValue == 2) {
            lVar.f152335e.setVisibility(8);
            lVar.f152334d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479515a62));
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f152325v)) {
                lVar.f152337g.setVisibility(0);
            }
        }
        lVar.f152338h = item.f242007b;
        java.lang.String f17 = com.tencent.mm.plugin.nearlife.ui.a.f(item.f242009d);
        double d17 = item.f242016k;
        double d18 = item.f242015j;
        float f18 = item.f242018m;
        if (f18 > 0.0d || !(this.A == -85.0d || this.B == -1000.0d)) {
            int i18 = (int) f18;
            if (i18 <= 0) {
                i18 = (int) com.tencent.map.geolocation.sapp.TencentLocationUtils.distanceBetween(this.A, this.B, d17, d18);
            }
            if (i18 < 100) {
                str = i65.a.r(context, com.tencent.mm.R.string.lff);
            } else if (i18 >= 1000) {
                str = com.tencent.mm.sdk.platformtools.t8.z1("%.1fkm", java.lang.Double.valueOf(i18 / 1000.0d));
            } else {
                str = i18 + "m";
            }
            if (com.tencent.mm.sdk.platformtools.t8.J0(f17)) {
                str2 = str;
            } else {
                str2 = str + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + ((java.lang.Object) f17);
            }
        } else {
            str2 = f17.toString();
        }
        if (this.f152299d) {
            lVar.f152334d.setText(o13.q.c(context, item.f242008c, this.f152310r));
            lVar.f152335e.setText(o13.q.c(context, str2, this.f152310r));
        } else {
            lVar.f152334d.setText(item.f242008c);
            lVar.f152335e.setText(str2);
        }
        lVar.f152336f.setVisibility(8);
        if (this.f152329z) {
            lVar.f152333c.setBackground(context.getDrawable(com.tencent.mm.R.drawable.aov));
            lVar.f152334d.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
            lVar.f152335e.setTextColor(android.graphics.Color.parseColor("#80FFFFFF"));
            lVar.f152336f.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
        }
        return view2;
    }

    public dn3.i l(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (this.f152324u == null) {
            dn3.i iVar = new dn3.i("", new r45.c64());
            this.f152324u = iVar;
            iVar.f242007b = "City";
            this.f152326w.put("City", 1);
            a(this.f152324u, this.f152327x ? 1 : 0);
        }
        dn3.i iVar2 = this.f152324u;
        iVar2.f242019n = str3;
        iVar2.f242008c = str;
        iVar2.f242013h = str2;
        notifyDataSetChanged();
        return this.f152324u;
    }

    public void m(double d17, double d18) {
        double d19 = this.A;
        boolean z17 = (d19 == d17 && d19 == d18) ? false : true;
        this.A = d17;
        this.B = d18;
        if (z17) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.nearlife.ui.k$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.nearlife.ui.k.this.notifyDataSetChanged();
                }
            });
        }
    }
}
