package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public abstract class a extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f152299d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f152300e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f152301f;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f152304i;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData f152308p;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f152312t;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f152302g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f152303h = new java.util.HashSet();

    /* renamed from: q, reason: collision with root package name */
    public boolean f152309q = true;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f152310r = "";

    /* renamed from: s, reason: collision with root package name */
    public int f152311s = 0;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f152305m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f152306n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f152307o = new java.util.HashMap();

    public a(android.content.Context context, android.view.View.OnClickListener onClickListener, java.lang.String str, boolean z17) {
        this.f152299d = false;
        this.f152300e = "";
        this.f152304i = null;
        this.f152301f = context;
        this.f152312t = onClickListener;
        this.f152300e = str;
        this.f152299d = z17;
        this.f152304i = new java.util.ArrayList();
    }

    public static java.lang.String f(java.util.List list) {
        java.lang.String str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < list.size(); i17++) {
            r45.du5 du5Var = (r45.du5) list.get(i17);
            if (du5Var != null && (str = du5Var.f372756d) != null && !str.equals("") && !du5Var.f372756d.toLowerCase().equals("null")) {
                stringBuffer.append(du5Var.f372756d);
                if (i17 < list.size() - 1) {
                    stringBuffer.append("·");
                }
            }
        }
        return stringBuffer.toString();
    }

    public void a(dn3.i iVar, int i17) {
        java.util.HashSet hashSet = this.f152303h;
        if (hashSet.contains(iVar.f242007b)) {
            return;
        }
        java.util.ArrayList arrayList = this.f152302g;
        if (i17 <= arrayList.size()) {
            arrayList.add(i17, iVar);
            hashSet.add(iVar.f242007b);
            ((java.util.HashMap) this.f152307o).put(iVar.f242007b, this.f152308p);
        }
    }

    public void c() {
        this.f152302g.clear();
        this.f152303h.clear();
        ((java.util.HashMap) this.f152306n).clear();
        ((java.util.HashMap) this.f152305m).clear();
        ((java.util.HashMap) this.f152307o).clear();
        this.f152311s = 0;
        notifyDataSetChanged();
    }

    public boolean d() {
        java.util.Iterator it = this.f152304i.iterator();
        while (it.hasNext()) {
            if (g((com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData) it.next()) > 0) {
                return true;
            }
        }
        return this.f152309q && g(this.f152308p) > 0;
    }

    public int g(com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData backwardSupportUtil$ExifHelper$LatLongData) {
        java.util.Map map = this.f152306n;
        if (((java.util.HashMap) map).containsKey(backwardSupportUtil$ExifHelper$LatLongData)) {
            return ((java.lang.Integer) ((java.util.HashMap) map).get(backwardSupportUtil$ExifHelper$LatLongData)).intValue();
        }
        return 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f152302g.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    public int h(java.lang.String str) {
        java.util.Iterator it = this.f152302g.iterator();
        int i17 = -1;
        while (it.hasNext()) {
            i17++;
            if (((dn3.i) it.next()).f242007b.equals(str)) {
                break;
            }
        }
        return i17;
    }

    @Override // android.widget.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public dn3.i getItem(int i17) {
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f152302g;
            if (i17 < arrayList.size()) {
                return (dn3.i) arrayList.get(i17);
            }
        }
        return new dn3.i("", new r45.c64());
    }

    public void k(com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData backwardSupportUtil$ExifHelper$LatLongData, int i17, r45.cu5 cu5Var) {
        com.tencent.mm.sdk.platformtools.BackwardSupportUtil$ExifHelper$LatLongData backwardSupportUtil$ExifHelper$LatLongData2;
        float f17 = backwardSupportUtil$ExifHelper$LatLongData.f192409d;
        if (cu5Var != null) {
            int i18 = cu5Var.f371839d;
        }
        if (this.f152304i.contains(backwardSupportUtil$ExifHelper$LatLongData) || ((backwardSupportUtil$ExifHelper$LatLongData2 = this.f152308p) != null && backwardSupportUtil$ExifHelper$LatLongData2.equals(backwardSupportUtil$ExifHelper$LatLongData))) {
            ((java.util.HashMap) this.f152306n).put(backwardSupportUtil$ExifHelper$LatLongData, java.lang.Integer.valueOf(i17));
            ((java.util.HashMap) this.f152305m).put(backwardSupportUtil$ExifHelper$LatLongData, cu5Var);
        }
    }
}
