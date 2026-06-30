package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class ic extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f206812d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f206813e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f206814f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.storage.e8 f206815g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.res.ColorStateList f206816h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.res.ColorStateList f206817i;

    public ic(android.content.Context context, java.util.List list) {
        this.f206812d = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f206813e = hashMap;
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.f206814f = hashMap2;
        this.f206815g = null;
        this.f206812d = context;
        hashMap.clear();
        hashMap2.clear();
        this.f206815g = c01.d9.b().q();
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            long longValue = ((java.lang.Long) it.next()).longValue();
            p94.q0 f17 = p94.w0.f();
            if (f17 != null) {
                com.tencent.mm.plugin.sns.storage.r2 r2Var = (com.tencent.mm.plugin.sns.storage.r2) f17;
                java.util.Iterator it6 = ((java.util.ArrayList) r2Var.L0(longValue)).iterator();
                while (it6.hasNext()) {
                    java.lang.String str = (java.lang.String) it6.next();
                    com.tencent.mm.contact.s sVar = new com.tencent.mm.contact.s();
                    sVar.X1(str);
                    java.util.Map map = this.f206814f;
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f206813e.size());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagName", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
                    java.lang.String str2 = r2Var.D0(longValue).field_tagName;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagName", "com.tencent.mm.plugin.sns.storage.SnsTagInfoStorage");
                    map.put(valueOf, str2);
                    this.f206813e.put(java.lang.Integer.valueOf(i17), sVar);
                    i17++;
                }
            }
        }
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(com.tencent.mm.R.color.f479413yk);
            android.content.res.XmlResourceParser xml2 = context.getResources().getXml(com.tencent.mm.R.color.f479414yl);
            this.f206816h = android.content.res.ColorStateList.createFromXml(context.getResources(), xml);
            this.f206817i = android.content.res.ColorStateList.createFromXml(context.getResources(), xml2);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsTagContactList", e17, "", new java.lang.Object[0]);
        } catch (org.xmlpull.v1.XmlPullParserException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsTagContactList", e18, "", new java.lang.Object[0]);
        }
    }

    public final java.lang.String a(int i17) {
        java.util.Map map = this.f206814f;
        if (!((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(i17))) {
            return "";
        }
        return (java.lang.String) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.HashMap) this.f206813e).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (i17 < 0) {
            return null;
        }
        java.util.Map map = this.f206813e;
        com.tencent.mm.contact.s sVar = (com.tencent.mm.contact.s) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (sVar.W0() != 0) {
            return sVar;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) this.f206815g).n(sVar.d1(), true);
        if (n17 == null) {
            return sVar;
        }
        ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), n17);
        return n17;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.contact.jc jcVar;
        android.content.Context context = this.f206812d;
        if (view == null) {
            view = android.view.View.inflate(context, com.tencent.mm.R.layout.a29, null);
            jcVar = new com.tencent.mm.ui.contact.jc(null);
            jcVar.f206978b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cfx);
            jcVar.f206977a = (com.tencent.mm.ui.base.MaskLayout) view.findViewById(com.tencent.mm.R.id.cfu);
            jcVar.f206979c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483914cg1);
            jcVar.f206980d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cfs);
            view.setTag(jcVar);
        } else {
            jcVar = (com.tencent.mm.ui.contact.jc) view.getTag();
        }
        int i18 = i17 - 1;
        java.lang.String a17 = ((com.tencent.mm.contact.s) getItem(i18)) == null ? "" : a(i18);
        com.tencent.mm.contact.s sVar = (com.tencent.mm.contact.s) getItem(i17);
        if (i17 == 0) {
            jcVar.f206978b.setVisibility(0);
            jcVar.f206978b.setText(a(i17));
            jcVar.f206978b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else if (i17 <= 0 || a(i17).equals(a17)) {
            jcVar.f206978b.setVisibility(8);
        } else {
            jcVar.f206978b.setVisibility(0);
            jcVar.f206978b.setText(a(i17));
            jcVar.f206978b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        jcVar.f206979c.setTextColor(!c01.e2.D(sVar.d1()) ? this.f206816h : this.f206817i);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi((android.widget.ImageView) jcVar.f206977a.getContentView(), sVar.d1(), true);
        jcVar.f206980d.setVisibility(8);
        jcVar.f206977a.setVisibility(0);
        android.widget.TextView textView = jcVar.f206979c;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String g27 = sVar.g2();
        float textSize = jcVar.f206979c.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, g27, textSize));
        jcVar.f206979c.setVisibility(0);
        return view;
    }
}
