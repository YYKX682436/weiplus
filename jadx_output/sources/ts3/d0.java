package ts3;

/* loaded from: classes9.dex */
public class d0 extends ts3.a {
    public final int A;
    public final /* synthetic */ com.tencent.mm.plugin.readerapp.ui.ReaderAppUI B;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f421650o;

    /* renamed from: p, reason: collision with root package name */
    public int f421651p;

    /* renamed from: q, reason: collision with root package name */
    public int f421652q;

    /* renamed from: r, reason: collision with root package name */
    public final int f421653r;

    /* renamed from: s, reason: collision with root package name */
    public final int f421654s;

    /* renamed from: t, reason: collision with root package name */
    public final int f421655t;

    /* renamed from: u, reason: collision with root package name */
    public final int f421656u;

    /* renamed from: v, reason: collision with root package name */
    public final int f421657v;

    /* renamed from: w, reason: collision with root package name */
    public final int f421658w;

    /* renamed from: x, reason: collision with root package name */
    public final int f421659x;

    /* renamed from: y, reason: collision with root package name */
    public final int f421660y;

    /* renamed from: z, reason: collision with root package name */
    public final int f421661z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI, android.content.Context context, java.lang.String str) {
        super(context, str);
        this.B = readerAppUI;
        this.f421653r = 0;
        this.f421654s = 0;
        this.f421655t = 0;
        this.f421656u = 0;
        this.f421657v = 0;
        this.f421658w = 0;
        this.f421661z = 1;
        this.A = 2;
        this.f421650o = context;
        this.f421651p = 3;
        this.f421652q = ss3.d0.Di().y0(readerAppUI.f155060h);
        this.f421654s = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479924j3);
        this.f421655t = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        this.f421653r = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479563f);
        this.f421656u = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479884hx);
        this.f421659x = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480230s1);
        this.f421660y = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480228rz);
        int e17 = fq1.e.f265507a.e(context);
        int k17 = i65.a.k(context);
        e17 = e17 >= k17 ? k17 : e17;
        float f17 = com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.f155055u;
        this.f421657v = (int) ((e17 - ((int) (28.0f * f17))) / 2.35d);
        this.f421658w = (((int) ((e17 - (f17 * 52.0f)) / 2.0f)) * 4) / 3;
    }

    @Override // com.tencent.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        return cursor.getString(0);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        java.util.List x17 = x(i17);
        if (com.tencent.mm.sdk.platformtools.t8.L0(x17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReaderAppUI", "getItemViewType info is null");
            return 0;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) x17;
        c01.ta taVar = (c01.ta) arrayList.get(0);
        taVar.i();
        if (!(taVar.f37488u == 1) || arrayList.size() < 2) {
            return 0;
        }
        return this.f421661z;
    }

    @Override // android.widget.Adapter, com.tencent.mm.pluginsdk.ui.tools.u3
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        ts3.a0 a0Var;
        java.util.ArrayList arrayList;
        boolean z17;
        java.lang.Integer num;
        android.view.View view3;
        ts3.a0 a0Var2;
        int i18;
        ts3.a0 a0Var3;
        android.view.View view4;
        int itemViewType = getItemViewType(i17);
        int i19 = this.f421661z;
        int i27 = this.f421653r;
        int i28 = this.f421654s;
        android.content.Context context = this.f421650o;
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI = this.B;
        if (itemViewType == i19) {
            if (view == null) {
                a0Var3 = new ts3.a0(this);
                view4 = android.view.View.inflate(context, com.tencent.mm.R.layout.f489374cc2, null);
                a0Var3.f421622a = (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.f487724pl0);
                a0Var3.f421634m = (android.widget.ImageView) view4.findViewById(com.tencent.mm.R.id.a_4);
                a0Var3.f421635n = (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.kbb);
                ts3.c0 c0Var = new ts3.c0(this);
                a0Var3.f421636o = c0Var;
                c0Var.f421641a = view4.findViewById(com.tencent.mm.R.id.ckt);
                a0Var3.f421636o.b();
                ts3.c0 c0Var2 = new ts3.c0(this);
                a0Var3.f421637p = c0Var2;
                c0Var2.f421641a = view4.findViewById(com.tencent.mm.R.id.cku);
                a0Var3.f421637p.b();
                view4.setTag(a0Var3);
            } else {
                a0Var3 = (ts3.a0) view.getTag();
                view4 = view;
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) x(i17);
            if (arrayList2.size() >= 2) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                android.view.View view5 = view4;
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c01.ta taVar = (c01.ta) arrayList2.get(0);
                a0Var3.f421622a.setText(k35.m1.f(context, taVar.f37469b, false, false));
                o11.f fVar = new o11.f();
                fVar.f342093q = com.tencent.mm.R.drawable.bgo;
                fVar.f342079c = true;
                fVar.f342096t = true;
                n11.a b17 = n11.a.b();
                java.lang.String str = taVar.f37478k;
                if (str == null) {
                    str = "";
                }
                b17.h(str, a0Var3.f421634m, fVar.a());
                android.widget.TextView textView = a0Var3.f421635n;
                java.lang.String str2 = taVar.f37477j;
                textView.setText(str2 != null ? str2 : "");
                a0Var3.f421635n.getPaint().setFakeBoldText(true);
                com.tencent.mm.pluginsdk.ui.i0 i0Var = readerAppUI.f155064o;
                if (i0Var != null) {
                    a0Var3.f421622a.setTextColor(i0Var.f190866a);
                    com.tencent.mm.pluginsdk.ui.i0 i0Var2 = readerAppUI.f155064o;
                    if (i0Var2.f190867b) {
                        a0Var3.f421622a.setShadowLayer(2.0f, 1.2f, 1.2f, i0Var2.f190868c);
                    } else {
                        a0Var3.f421622a.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    }
                    if (readerAppUI.f155064o.f190869d) {
                        a0Var3.f421622a.setBackgroundResource(com.tencent.mm.R.drawable.f481169mc);
                        a0Var3.f421622a.setPadding(i28, i27, i28, i27);
                    } else {
                        a0Var3.f421622a.setBackgroundColor(0);
                    }
                }
                c01.ta taVar2 = (c01.ta) arrayList2.get(1);
                a0Var3.f421636o.a(taVar, i17, taVar.f());
                a0Var3.f421637p.a(taVar2, i17, taVar.f());
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                android.view.View view6 = view4;
                yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "getWeiShiView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return view4;
        }
        if (view == null) {
            ts3.a0 a0Var4 = new ts3.a0(this);
            android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f489373cc1, null);
            a0Var4.f421622a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ljh);
            a0Var4.f421629h = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.ljc);
            a0Var4.f421625d = inflate.findViewById(com.tencent.mm.R.id.f483436au4);
            a0Var4.f421624c = inflate.findViewById(com.tencent.mm.R.id.cks);
            a0Var4.f421632k = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.l3k);
            a0Var4.f421631j = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.cle);
            a0Var4.f421623b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.lji);
            a0Var4.f421626e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.ljg);
            a0Var4.f421627f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ljf);
            a0Var4.f421628g = inflate.findViewById(com.tencent.mm.R.id.f487367of5);
            a0Var4.f421630i = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.odc);
            a0Var4.f421633l = new java.util.ArrayList();
            inflate.setTag(a0Var4);
            a0Var = a0Var4;
            view2 = inflate;
        } else {
            view2 = view;
            a0Var = (ts3.a0) view.getTag();
        }
        java.util.Iterator it = ((java.util.ArrayList) a0Var.f421633l).iterator();
        while (it.hasNext()) {
            a0Var.f421629h.removeView(((ts3.z) it.next()).f421707a);
        }
        ((java.util.ArrayList) a0Var.f421633l).clear();
        java.util.List x17 = x(i17);
        java.util.ArrayList arrayList5 = (java.util.ArrayList) x17;
        if (arrayList5.size() > 0) {
            int size = arrayList5.size();
            c01.ta taVar3 = (c01.ta) arrayList5.get(0);
            a0Var.f421622a.setText(k35.m1.f(context, taVar3.f37469b, false, false));
            com.tencent.mm.pluginsdk.ui.i0 i0Var3 = readerAppUI.f155064o;
            if (i0Var3 != null) {
                a0Var.f421622a.setTextColor(i0Var3.f190866a);
                com.tencent.mm.pluginsdk.ui.i0 i0Var4 = readerAppUI.f155064o;
                if (i0Var4.f190867b) {
                    a0Var.f421622a.setShadowLayer(2.0f, 1.2f, 1.2f, i0Var4.f190868c);
                } else {
                    a0Var.f421622a.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
                if (readerAppUI.f155064o.f190869d) {
                    a0Var.f421622a.setBackgroundResource(com.tencent.mm.R.drawable.f481169mc);
                    a0Var.f421622a.setPadding(i28, i27, i28, i27);
                } else {
                    a0Var.f421622a.setBackgroundColor(0);
                }
            }
            arrayList = arrayList5;
            a0Var2 = a0Var;
            a0Var2.f421628g.setOnClickListener(readerAppUI.T6(taVar3, readerAppUI.f155060h, i17, 0, taVar3.f(), taVar3.f()));
            boolean z18 = size == 1;
            a0Var2.f421623b.setText(taVar3.f());
            a0Var2.f421627f.setText(taVar3.d());
            boolean z19 = !com.tencent.mm.sdk.platformtools.t8.K0(taVar3.c());
            a0Var2.f421630i.b(taVar3.f());
            a0Var2.f421627f.setVisibility((!z18 || com.tencent.mm.sdk.platformtools.t8.K0(taVar3.d())) ? 8 : 0);
            a0Var2.f421631j.setVisibility(8);
            if (z18) {
                a0Var2.f421632k.setBackgroundResource(com.tencent.mm.R.drawable.f481238o4);
                android.view.View view7 = a0Var2.f421625d;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a0Var2.f421630i.setVisibility(8);
                a0Var2.f421623b.setVisibility(0);
            } else {
                a0Var2.f421632k.setBackgroundResource(com.tencent.mm.R.drawable.f481239o5);
                android.view.View view8 = a0Var2.f421625d;
                int i29 = z19 ? 8 : 0;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList7.add(java.lang.Integer.valueOf(i29));
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a0Var2.f421623b.setVisibility(8);
                a0Var2.f421630i.setVisibility(0);
                a0Var2.f421630i.setTextColor(readerAppUI.getContext().getResources().getColor(com.tencent.mm.R.color.f479304vk));
                a0Var2.f421630i.setBackgroundResource(com.tencent.mm.R.drawable.f481981ap3);
                a0Var2.f421630i.getPaint().setFakeBoldText(true);
            }
            android.widget.ImageView imageView = a0Var2.f421632k;
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i37 = this.f421657v;
            layoutParams.height = i37;
            imageView.setLayoutParams(layoutParams);
            android.view.View view9 = a0Var2.f421624c;
            android.view.ViewGroup.LayoutParams layoutParams2 = view9.getLayoutParams();
            layoutParams2.height = i37;
            view9.setLayoutParams(layoutParams2);
            int i38 = this.f421655t;
            if (z19) {
                android.view.View view10 = a0Var2.f421624c;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view10, arrayList8.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.lang.String c17 = taVar3.c();
                android.widget.ImageView imageView2 = a0Var2.f421626e;
                int i39 = this.f421657v;
                ts3.y yVar = new ts3.y(this, z18, a0Var2);
                java.lang.String d17 = m11.n1.d(c17);
                float dimensionPixelSize = imageView2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480233s4);
                int e17 = fq1.e.f265507a.e(readerAppUI.getContext()) - ((int) (com.tencent.mm.plugin.readerapp.ui.ReaderAppUI.f155055u * 28.0f));
                n11.a b18 = n11.a.b();
                o11.f fVar2 = new o11.f();
                view3 = view2;
                fVar2.f342093q = com.tencent.mm.R.drawable.f480974gs;
                fVar2.f342078b = true;
                fVar2.D = "2131231349";
                fVar2.f342086j = e17;
                fVar2.f342087k = i39;
                num = 0;
                fVar2.A = new r35.n0(0);
                fVar2.B = new r35.w(0);
                fVar2.f342082f = tv.a.b(d17);
                b18.k(d17, imageView2, fVar2.a(), null, new r35.m0(0, e17, i39, true, false, dimensionPixelSize, yVar));
                android.view.View view11 = a0Var2.f421625d;
                android.graphics.drawable.Drawable drawable = readerAppUI.getResources().getDrawable(com.tencent.mm.R.drawable.f481216nh);
                com.tencent.mm.ui.uk.f(drawable, context.getResources().getColor(com.tencent.mm.R.color.f478491c));
                view11.setBackground(drawable);
                a0Var2.f421625d.setPadding(i38, this.f421656u, i38, i38);
                a0Var2.f421632k.setVisibility(0);
                z17 = false;
            } else {
                num = 0;
                view3 = view2;
                android.view.View view12 = a0Var2.f421624c;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view12, arrayList9.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "displayTopSlotArea", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;ZLcom/tencent/mm/model/ReaderAppInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                z17 = false;
                a0Var2.f421623b.setVisibility(0);
                a0Var2.f421627f.setVisibility(com.tencent.mm.sdk.platformtools.t8.K0(taVar3.d()) ? 8 : 0);
                if (z18) {
                    a0Var2.f421625d.setBackgroundResource(com.tencent.mm.R.drawable.f481226nr);
                } else {
                    a0Var2.f421625d.setBackgroundResource(com.tencent.mm.R.drawable.f481224np);
                }
                a0Var2.f421625d.setPadding(i38, i38, i38, i38);
                a0Var2.f421632k.setVisibility(8);
            }
            if (size > 1) {
                int i47 = 1;
                while (true) {
                    i18 = size - 1;
                    if (i47 >= i18) {
                        break;
                    }
                    u(a0Var2, x17, com.tencent.mm.R.layout.f489377cc5, i47, i17, taVar3.f());
                    i47++;
                }
                u(a0Var2, x17, com.tencent.mm.R.layout.f489376cc4, i18, i17, taVar3.f());
            }
            zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
            if (m0Var != null) {
                ((yq1.x0) m0Var).e(taVar3.h(), 164, "wx073f4a4daff0abe8", taVar3.f(), taVar3.d(), com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, 8);
            }
        } else {
            arrayList = arrayList5;
            z17 = false;
            num = 0;
            view3 = view2;
            a0Var2 = a0Var;
        }
        a0Var2.f421628g.setTag(java.lang.Integer.valueOf(i17));
        a0Var2.f421628g.setTag(com.tencent.mm.R.id.ljk, num);
        rl5.r rVar = readerAppUI.f155066q;
        android.view.View view13 = a0Var2.f421628g;
        ts3.p pVar = new ts3.p(readerAppUI, arrayList.size() == 1 ? true : z17);
        db5.t4 t4Var = readerAppUI.f155069t;
        rVar.i(view13, pVar, t4Var);
        java.util.Iterator it6 = ((java.util.ArrayList) a0Var2.f421633l).iterator();
        int i48 = 1;
        while (it6.hasNext()) {
            ts3.z zVar = (ts3.z) it6.next();
            java.util.ArrayList arrayList10 = arrayList;
            c01.ta taVar4 = (c01.ta) arrayList10.get(i48);
            zVar.f421707a.setTag(java.lang.Integer.valueOf(i17));
            int i49 = i48 + 1;
            zVar.f421707a.setTag(com.tencent.mm.R.id.ljk, java.lang.Integer.valueOf(i48));
            taVar4.i();
            if (taVar4.f37489v != 5) {
                readerAppUI.f155066q.i(zVar.f421707a, new ts3.p(readerAppUI, arrayList10.size() == 1 ? true : z17), t4Var);
            }
            arrayList = arrayList10;
            i48 = i49;
        }
        return view3;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return this.A;
    }

    @Override // ts3.a, android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        super.onScrollStateChanged(absListView, i17);
        if (absListView == null || i17 != 0) {
            return;
        }
        t(absListView.getFirstVisiblePosition(), absListView.getLastVisiblePosition());
    }

    @Override // com.tencent.mm.ui.z9
    public void q() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f421652q = ss3.d0.Di().y0(20);
        s(ss3.d0.Di().u0(this.f421651p, 20));
        com.tencent.mars.xlog.Log.i("MicroMsg.ReaderAppUI", "[resetCursor] cost:%sms showCount:%s totalCount:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(this.f421651p), java.lang.Integer.valueOf(this.f421652q));
        notifyDataSetChanged();
    }

    public void t(int i17, int i18) {
        zq1.m0 m0Var;
        if (i17 <= i18 && (m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class)) != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            while (i17 <= i18) {
                java.util.ArrayList arrayList = (java.util.ArrayList) x(i17 - 1);
                if (arrayList.size() > 0) {
                    linkedList.clear();
                    zq1.i0 w17 = w((c01.ta) arrayList.get(0));
                    if (w17 != null) {
                        w17.f474986d = 4;
                        linkedList.add(w17);
                    }
                    if (linkedList.size() > 0) {
                        ((yq1.x0) m0Var).f(linkedList, 8);
                    }
                    linkedList.size();
                    linkedList.clear();
                    for (int i19 = 1; i19 < arrayList.size(); i19++) {
                        zq1.i0 w18 = w((c01.ta) arrayList.get(i19));
                        if (w18 != null) {
                            w18.f474986d = 5;
                            linkedList.add(w18);
                        }
                    }
                    if (linkedList.size() > 0) {
                        ((yq1.x0) m0Var).f(linkedList, 16);
                    }
                    linkedList.size();
                }
                i17++;
            }
        }
    }

    public void u(ts3.a0 a0Var, java.util.List list, int i17, int i18, int i19, java.lang.String str) {
        java.lang.String f17;
        ts3.z zVar = new ts3.z(this);
        android.view.View inflate = android.view.View.inflate(this.f421650o, i17, null);
        zVar.f421707a = inflate;
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI = this.B;
        if (i17 == com.tencent.mm.R.layout.f489377cc5) {
            android.graphics.drawable.Drawable drawable = readerAppUI.getResources().getDrawable(com.tencent.mm.R.drawable.f481223no);
            androidx.appcompat.app.AppCompatActivity context = readerAppUI.getContext();
            float f18 = com.tencent.mm.ui.zk.f212637a;
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getTheme().resolveAttribute(com.tencent.mm.R.attr.g_, typedValue, true);
            android.content.res.ColorStateList colorStateList = b3.l.getColorStateList(context, typedValue.resourceId);
            if (drawable == null) {
                drawable = null;
            } else {
                f3.b.h(drawable, colorStateList);
            }
            inflate.setBackground(drawable);
        } else if (i17 == com.tencent.mm.R.layout.f489376cc4) {
            android.graphics.drawable.Drawable drawable2 = readerAppUI.getResources().getDrawable(com.tencent.mm.R.drawable.f481222nn);
            androidx.appcompat.app.AppCompatActivity context2 = readerAppUI.getContext();
            float f19 = com.tencent.mm.ui.zk.f212637a;
            android.util.TypedValue typedValue2 = new android.util.TypedValue();
            context2.getTheme().resolveAttribute(com.tencent.mm.R.attr.g_, typedValue2, true);
            android.content.res.ColorStateList colorStateList2 = b3.l.getColorStateList(context2, typedValue2.resourceId);
            if (drawable2 == null) {
                drawable2 = null;
            } else {
                f3.b.h(drawable2, colorStateList2);
            }
            inflate.setBackground(drawable2);
        }
        zVar.f421708b = (android.widget.TextView) zVar.f421707a.findViewById(com.tencent.mm.R.id.obc);
        zVar.f421710d = (android.widget.ImageView) zVar.f421707a.findViewById(com.tencent.mm.R.id.cki);
        zVar.f421709c = zVar.f421707a.findViewById(com.tencent.mm.R.id.ckn);
        zVar.f421711e = zVar.f421707a.findViewById(com.tencent.mm.R.id.ofy);
        zVar.f421712f = zVar.f421707a.findViewById(com.tencent.mm.R.id.chj);
        if (a0Var != null) {
            a0Var.f421629h.addView(zVar.f421707a);
            ((java.util.ArrayList) a0Var.f421633l).add(zVar);
        }
        c01.ta taVar = (c01.ta) list.get(i18);
        int size = list.size();
        int i27 = this.f421655t;
        if (i18 != 1) {
            android.view.View view = zVar.f421711e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c01.ta taVar2 = (c01.ta) list.get(i18 - 1);
            c01.ta taVar3 = (c01.ta) list.get(i18);
            if (com.tencent.mm.sdk.platformtools.t8.K0(taVar2.c()) || com.tencent.mm.sdk.platformtools.t8.K0(taVar3.c())) {
                android.view.View view2 = zVar.f421711e;
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view2.getLayoutParams();
                layoutParams.rightMargin = i27;
                view2.setLayoutParams(layoutParams);
            } else {
                android.view.View view3 = zVar.f421711e;
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) view3.getLayoutParams();
                layoutParams2.rightMargin = this.f421660y;
                view3.setLayoutParams(layoutParams2);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(((c01.ta) list.get(0)).c())) {
            android.view.View view4 = zVar.f421711e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = zVar.f421711e;
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) view5.getLayoutParams();
            layoutParams3.rightMargin = i27;
            view5.setLayoutParams(layoutParams3);
        } else {
            android.view.View view6 = zVar.f421711e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "setItemLineAndPadding", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppCommSlot;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i28 = this.f421654s;
        if (i18 == 1) {
            if (i18 == size - 1) {
                zVar.f421712f.setPadding(0, i27, 0, i27);
            } else {
                zVar.f421712f.setPadding(0, i27, 0, i28);
            }
        } else if (i18 == size - 1) {
            zVar.f421712f.setPadding(0, i28, 0, i27);
        } else {
            zVar.f421712f.setPadding(0, i28, 0, i28);
        }
        taVar.i();
        if (taVar.f37489v == 5) {
            if (!android.text.TextUtils.isEmpty(taVar.f())) {
                taVar.i();
                if (!android.text.TextUtils.isEmpty(taVar.f37491x)) {
                    xj.i iVar = (xj.i) i95.n0.c(xj.i.class);
                    taVar.i();
                    wj.n Ai = ((wj.j0) iVar).Ai(taVar.f37493z);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ReaderAppUI", "yuanbao hit scene1 installStatus is " + Ai);
                    if (Ai == wj.n.f446450g) {
                        taVar.i();
                        f17 = taVar.f37491x;
                    } else {
                        f17 = taVar.f();
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ReaderAppUI", "yuanbao hit scene2");
            f17 = taVar.f();
            if (android.text.TextUtils.isEmpty(f17)) {
                taVar.i();
                f17 = taVar.f37491x;
            }
        } else {
            f17 = taVar.f();
        }
        java.lang.String str2 = f17;
        zVar.f421708b.setText(str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(taVar.c())) {
            android.view.View view7 = zVar.f421709c;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view7, arrayList4.toArray(), "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "dealWithItemNews", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;Ljava/util/List;IIILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter", "dealWithItemNews", "(Lcom/tencent/mm/plugin/readerapp/ui/ReaderAppUI$NewsHistoryAdapter$ReaderAppTopSlot;Ljava/util/List;IIILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            zVar.f421710d.setVisibility(0);
            java.lang.String c17 = taVar.c();
            android.widget.ImageView imageView = zVar.f421710d;
            java.lang.String d17 = m11.n1.d(c17);
            n11.a b17 = n11.a.b();
            o11.f fVar = new o11.f();
            fVar.f342093q = com.tencent.mm.R.color.f478816i1;
            fVar.f342078b = true;
            int i29 = this.f421659x;
            fVar.f342086j = i29;
            fVar.f342087k = i29;
            fVar.A = new r35.n0(0);
            fVar.B = new r35.w(0);
            fVar.f342082f = tv.a.b(d17);
            b17.k(d17, imageView, fVar.a(), null, new r35.m0(0, 0, null, null));
        }
        zVar.f421707a.setOnClickListener(readerAppUI.T6(taVar, readerAppUI.f155060h, i19, i18, str, str2));
        zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
        if (m0Var != null) {
            ((yq1.x0) m0Var).e(taVar.h(), 164, "wx073f4a4daff0abe8", taVar.f(), taVar.d(), com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, 16);
        }
    }

    @Override // com.tencent.mm.ui.z9, android.widget.Adapter
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public java.lang.String getItem(int i17) {
        return (java.lang.String) super.getItem(i17);
    }

    public final zq1.i0 w(c01.ta taVar) {
        if (taVar == null) {
            return null;
        }
        zq1.i0 i0Var = new zq1.i0();
        i0Var.f474983a = taVar.h();
        i0Var.f474985c = 164;
        i0Var.f474987e = "wx073f4a4daff0abe8";
        i0Var.f474988f = taVar.f();
        i0Var.f474989g = taVar.d();
        i0Var.f474990h = com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE;
        return i0Var;
    }

    public java.util.List x(int i17) {
        return ss3.d0.Di().z0(getItem(i17), 20);
    }
}
