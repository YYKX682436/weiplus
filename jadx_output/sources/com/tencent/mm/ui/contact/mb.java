package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public class mb extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f207028d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f207029e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.storage.e8 f207030f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.res.ColorStateList f207031g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.res.ColorStateList f207032h;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        if (r11 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
    
        if (r11 != 0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.content.res.XmlResourceParser] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [android.content.res.XmlResourceParser] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mb(android.content.Context r10, java.util.List r11) {
        /*
            r9 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.SnsLabelContactListUI"
            r9.<init>()
            r2 = 0
            r9.f207028d = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r9.f207029e = r3
            r9.f207030f = r2
            r9.f207028d = r10
            r3.clear()
            c01.f r3 = c01.d9.b()
            com.tencent.mm.storage.e8 r3 = r3.q()
            r9.f207030f = r3
            java.util.Iterator r11 = r11.iterator()
            r3 = 0
            r4 = r3
        L28:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L58
            java.lang.Object r5 = r11.next()
            java.lang.String r5 = (java.lang.String) r5
            com.tencent.mm.storage.e8 r6 = r9.f207030f
            com.tencent.mm.storage.k4 r6 = (com.tencent.mm.storage.k4) r6
            r7 = 1
            com.tencent.mm.storage.z3 r6 = r6.n(r5, r7)
            if (r6 == 0) goto L28
            boolean r7 = r6.r2()
            if (r7 == 0) goto L28
            boolean r5 = c01.z1.J(r5)
            if (r5 != 0) goto L28
            java.util.Map r5 = r9.f207029e
            int r7 = r4 + 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.put(r4, r6)
            r4 = r7
            goto L28
        L58:
            android.content.res.Resources r11 = r10.getResources()     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> Lae
            r4 = 2131101877(0x7f0608b5, float:1.7816176E38)
            android.content.res.XmlResourceParser r11 = r11.getXml(r4)     // Catch: java.lang.Throwable -> L9c java.io.IOException -> L9f org.xmlpull.v1.XmlPullParserException -> Lae
            android.content.res.Resources r4 = r10.getResources()     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L92 org.xmlpull.v1.XmlPullParserException -> L97
            r5 = 2131101878(0x7f0608b6, float:1.7816178E38)
            android.content.res.XmlResourceParser r2 = r4.getXml(r5)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L92 org.xmlpull.v1.XmlPullParserException -> L97
            android.content.res.Resources r4 = r10.getResources()     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L92 org.xmlpull.v1.XmlPullParserException -> L97
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.createFromXml(r4, r11)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L92 org.xmlpull.v1.XmlPullParserException -> L97
            r9.f207031g = r4     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L92 org.xmlpull.v1.XmlPullParserException -> L97
            android.content.res.Resources r10 = r10.getResources()     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L92 org.xmlpull.v1.XmlPullParserException -> L97
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.createFromXml(r10, r2)     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L92 org.xmlpull.v1.XmlPullParserException -> L97
            r9.f207032h = r10     // Catch: java.lang.Throwable -> L8d java.io.IOException -> L92 org.xmlpull.v1.XmlPullParserException -> L97
            if (r11 == 0) goto L87
            r11.close()
        L87:
            if (r2 == 0) goto Lbf
            r2.close()
            goto Lbf
        L8d:
            r10 = move-exception
            r8 = r2
            r2 = r11
            r11 = r8
            goto Lc1
        L92:
            r10 = move-exception
            r8 = r2
            r2 = r11
            r11 = r8
            goto La1
        L97:
            r10 = move-exception
            r8 = r2
            r2 = r11
            r11 = r8
            goto Lb0
        L9c:
            r10 = move-exception
            r11 = r2
            goto Lc1
        L9f:
            r10 = move-exception
            r11 = r2
        La1:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lc0
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r10, r0, r3)     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto Lab
            r2.close()
        Lab:
            if (r11 == 0) goto Lbf
            goto Lbc
        Lae:
            r10 = move-exception
            r11 = r2
        Lb0:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lc0
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r10, r0, r3)     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto Lba
            r2.close()
        Lba:
            if (r11 == 0) goto Lbf
        Lbc:
            r11.close()
        Lbf:
            return
        Lc0:
            r10 = move-exception
        Lc1:
            if (r2 == 0) goto Lc6
            r2.close()
        Lc6:
            if (r11 == 0) goto Lcb
            r11.close()
        Lcb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.contact.mb.<init>(android.content.Context, java.util.List):void");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.HashMap) this.f207029e).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        if (i17 < 0) {
            return null;
        }
        return (com.tencent.mm.contact.s) ((java.util.HashMap) this.f207029e).get(java.lang.Integer.valueOf(i17));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.contact.ob obVar;
        android.content.Context context = this.f207028d;
        if (view == null) {
            view = android.view.View.inflate(context, com.tencent.mm.R.layout.a29, null);
            obVar = new com.tencent.mm.ui.contact.ob(null);
            obVar.f207070b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cfx);
            obVar.f207069a = (com.tencent.mm.ui.base.MaskLayout) view.findViewById(com.tencent.mm.R.id.cfu);
            obVar.f207071c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483914cg1);
            obVar.f207072d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cfs);
            view.setTag(obVar);
        } else {
            obVar = (com.tencent.mm.ui.contact.ob) view.getTag();
        }
        getItem(i17);
        com.tencent.mm.contact.s sVar = (com.tencent.mm.contact.s) getItem(i17);
        obVar.f207070b.setVisibility(8);
        obVar.f207071c.setTextColor(!c01.e2.D(sVar.d1()) ? this.f207031g : this.f207032h);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi((android.widget.ImageView) obVar.f207069a.getContentView(), sVar.d1(), true);
        obVar.f207072d.setVisibility(8);
        obVar.f207069a.setVisibility(0);
        android.widget.TextView textView = obVar.f207071c;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String g27 = sVar.g2();
        float textSize = obVar.f207071c.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, g27, textSize));
        obVar.f207071c.setVisibility(0);
        return view;
    }
}
