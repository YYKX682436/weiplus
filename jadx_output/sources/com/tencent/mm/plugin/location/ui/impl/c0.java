package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class c0 extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f144759e;

    /* renamed from: p, reason: collision with root package name */
    public double f144767p;

    /* renamed from: q, reason: collision with root package name */
    public double f144768q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f144769r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f144770s;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f144758d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f144760f = 0;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f144761g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f144762h = false;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f144763i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f144764m = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f144765n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f144766o = false;

    public c0(android.content.Context context) {
        this.f144759e = context;
    }

    public void a(java.util.List list, byte[] bArr, boolean z17, java.lang.String str) {
        java.lang.String str2 = this.f144763i;
        if (str2 == null || !str2.equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PoiAdapter", "old key, dismiss it %s %s.", this.f144763i, str);
            return;
        }
        java.util.List list2 = this.f144758d;
        int size = ((java.util.ArrayList) list2).size();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.location.ui.impl.d0 d0Var = (com.tencent.mm.plugin.location.ui.impl.d0) it.next();
            d0Var.f144791q = size;
            size++;
            ((java.util.ArrayList) list2).add(d0Var);
        }
        this.f144761g = bArr;
        this.f144762h = z17;
        notifyDataSetChanged();
    }

    public void c() {
        this.f144761g = null;
        this.f144762h = false;
        this.f144763i = "";
        ((java.util.ArrayList) this.f144758d).clear();
        this.f144760f = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.location.ui.impl.d0 getItem(int i17) {
        return (com.tencent.mm.plugin.location.ui.impl.d0) ((java.util.ArrayList) this.f144758d).get(i17);
    }

    public final java.lang.String f(java.lang.CharSequence charSequence, double d17, double d18) {
        java.lang.String str;
        int distanceBetween = (int) com.tencent.map.geolocation.sapp.TencentLocationUtils.distanceBetween(this.f144767p, this.f144768q, d17, d18);
        if (distanceBetween < 100) {
            str = i65.a.r(this.f144759e, com.tencent.mm.R.string.lf6);
        } else if (distanceBetween >= 1000) {
            str = com.tencent.mm.sdk.platformtools.t8.z1("%.1fkm", java.lang.Double.valueOf(distanceBetween / 1000.0d));
        } else {
            str = distanceBetween + "m";
        }
        if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            return str;
        }
        return str + com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + ((java.lang.Object) charSequence);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f144758d).size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.location.ui.impl.b0 b0Var;
        android.view.View view2;
        android.content.Context context = this.f144759e;
        if (view == null) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c_2, viewGroup, false);
            b0Var = new com.tencent.mm.plugin.location.ui.impl.b0();
            b0Var.f144751a = inflate.findViewById(com.tencent.mm.R.id.kyl);
            b0Var.f144753c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kyn);
            b0Var.f144754d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kym);
            b0Var.f144752b = inflate.findViewById(com.tencent.mm.R.id.kyp);
            inflate.setTag(b0Var);
            view2 = inflate;
        } else {
            b0Var = (com.tencent.mm.plugin.location.ui.impl.b0) view.getTag();
            view2 = view;
        }
        com.tencent.mm.plugin.location.ui.impl.b0 b0Var2 = b0Var;
        com.tencent.mm.plugin.location.ui.impl.d0 d0Var = (com.tencent.mm.plugin.location.ui.impl.d0) ((java.util.ArrayList) this.f144758d).get(i17);
        int i18 = d0Var.f144787m;
        if (1 == i18 || 2 == i18) {
            android.widget.TextView textView = b0Var2.f144753c;
            java.lang.String str = d0Var.f144776b;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            b0Var2.f144754d.setVisibility(8);
        } else {
            b0Var2.f144754d.setVisibility(0);
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.t8.K0(d0Var.f144775a) ? context.getResources().getString(com.tencent.mm.R.string.ggf) : d0Var.f144775a;
        java.lang.String str2 = d0Var.f144780f;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = d0Var.f144781g;
        if (str3 == null) {
            str3 = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f144769r) && str2.equals(this.f144769r)) {
            str2 = (com.tencent.mm.sdk.platformtools.t8.K0(this.f144770s) || str3.equals(this.f144770s)) ? "" : str3;
        } else if (!str2.startsWith(str3)) {
            str2 = str2.concat(str3);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        java.lang.String str4 = d0Var.f144782h;
        if (str4 == null) {
            str4 = "";
        }
        sb6.append(str4);
        java.lang.String sb7 = sb6.toString();
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(sb7);
        java.lang.String str5 = d0Var.f144783i;
        if (str5 == null) {
            str5 = "";
        }
        sb8.append(str5);
        java.lang.String sb9 = sb8.toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(sb9)) {
            java.lang.String str6 = d0Var.f144776b;
            sb9 = str6 != null ? str6 : "";
        }
        if (!this.f144765n) {
            b0Var2.f144753c.setText(string);
            b0Var2.f144754d.setText(f(sb9, d0Var.f144778d, d0Var.f144777c));
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f144764m)) {
            b0Var2.f144753c.setText(string);
            b0Var2.f144754d.setText(f(sb9, d0Var.f144778d, d0Var.f144777c));
        } else {
            android.text.Spannable c17 = o13.q.c(context, string, this.f144764m);
            android.text.Spannable c18 = o13.q.c(context, sb9, this.f144764m);
            b0Var2.f144753c.setText(c17);
            b0Var2.f144754d.setText(f(c18, d0Var.f144778d, d0Var.f144777c));
        }
        if (i17 == this.f144760f) {
            android.view.View view3 = b0Var2.f144752b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/impl/PoiAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/location/ui/impl/PoiAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = b0Var2.f144752b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/location/ui/impl/PoiAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/location/ui/impl/PoiAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }
}
