package n44;

/* loaded from: classes15.dex */
public final class u extends db5.p8 {

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f335051g;

    /* renamed from: h, reason: collision with root package name */
    public final i64.z f335052h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.FrameLayout f335053i;

    /* renamed from: m, reason: collision with root package name */
    public final y54.b f335054m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f335055n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f335056o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f335057p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f335058q;

    /* renamed from: r, reason: collision with root package name */
    public final android.util.SparseArray f335059r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f335060s;

    public u(android.content.Context context, i64.z zVar, android.widget.FrameLayout frameLayout, y54.b contentSizeAttr, java.util.LinkedList topMaterialSizeDataList, java.util.LinkedList fullScreenMaterialSizeDataList) {
        kotlin.jvm.internal.o.g(contentSizeAttr, "contentSizeAttr");
        kotlin.jvm.internal.o.g(topMaterialSizeDataList, "topMaterialSizeDataList");
        kotlin.jvm.internal.o.g(fullScreenMaterialSizeDataList, "fullScreenMaterialSizeDataList");
        this.f335051g = context;
        this.f335052h = zVar;
        this.f335053i = frameLayout;
        this.f335054m = contentSizeAttr;
        this.f335055n = topMaterialSizeDataList;
        this.f335056o = fullScreenMaterialSizeDataList;
        this.f335057p = new java.util.HashMap();
        this.f335058q = new java.util.LinkedList();
        this.f335059r = new android.util.SparseArray();
        this.f335060s = jz5.h.b(new n44.t(this));
    }

    @Override // db5.p8
    public com.tencent.mm.ui.base.MultiTouchImageView c(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiTouchImageViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return null;
    }

    @Override // db5.p8
    public /* bridge */ /* synthetic */ java.lang.Object d(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        android.view.View i18 = i(i17, view, viewGroup);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return i18;
    }

    @Override // db5.p8, androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup container, int i17, java.lang.Object itemView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroyItem", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View view = itemView instanceof android.view.View ? (android.view.View) itemView : null;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyItem", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
            return;
        }
        this.f335058q.add(view);
        this.f335057p.remove(view);
        this.f335059r.remove(i17);
        a84.y0.i(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroyItem", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
    }

    @Override // db5.p8
    public android.view.View e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        java.lang.Object obj = this.f335059r.get(i17);
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return view;
    }

    @Override // db5.p8
    public com.tencent.mm.ui.base.WxImageView f(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWxImageViewByPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        java.util.LinkedList f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        i64.z zVar = this.f335052h;
        int size = (zVar == null || (f17 = zVar.f()) == null) ? 0 : f17.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return size;
    }

    @Override // db5.p8, androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object item) {
        java.lang.Integer num;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        kotlin.jvm.internal.o.g(item, "item");
        java.util.HashMap hashMap = this.f335057p;
        int i17 = -2;
        if (hashMap.containsKey(item) && (num = (java.lang.Integer) hashMap.get(item)) != null) {
            i17 = num.intValue();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return i17;
    }

    public android.view.View i(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        n44.v vVar;
        android.view.View inflate;
        java.util.LinkedList f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        i64.z zVar = this.f335052h;
        r45.jj4 jj4Var = (zVar == null || (f17 = zVar.f()) == null) ? null : (r45.jj4) f17.get(i17);
        boolean z17 = jj4Var != null && jj4Var.f377856e == 2;
        android.content.Context context = this.f335051g;
        if (!z17) {
            android.view.View view2 = new android.view.View(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
            return view2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillViewImage", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        if (view == null || view.getTag() == null) {
            vVar = new n44.v();
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$ViewHolder");
            vVar.f335065a = imageView;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$ViewHolder");
            android.widget.ImageView a17 = vVar.a();
            if (a17 != null) {
                a17.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487961wy, viewGroup, false);
            if (inflate != null) {
                inflate.setTag(vVar);
            }
        } else {
            java.lang.Object tag = view.getTag();
            vVar = tag instanceof n44.v ? (n44.v) tag : null;
            inflate = view;
        }
        if (inflate == null) {
            inflate = new android.view.View(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewImage", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        } else {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.fcs);
            android.widget.FrameLayout frameLayout = this.f335053i;
            if (frameLayout != null) {
                y54.c cVar = new y54.c(0, 0, 0, 0, 15, null);
                n44.a0 a0Var = n44.m0.f334982s;
                r45.lj4 lj4Var = jj4Var.f377865p;
                a0Var.a(lj4Var.f379520d, lj4Var.f379521e, frameLayout.getLayoutParams().width, frameLayout.getLayoutParams().height, true, cVar);
                android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.width = cVar.d();
                    marginLayoutParams.height = cVar.a();
                    marginLayoutParams.leftMargin = cVar.b();
                    marginLayoutParams.topMargin = cVar.c();
                    marginLayoutParams.rightMargin = (frameLayout.getLayoutParams().width - cVar.d()) - cVar.b();
                    marginLayoutParams.bottomMargin = (frameLayout.getLayoutParams().height - cVar.a()) - cVar.c();
                }
            }
            m44.a.g(jj4Var);
            if (ca4.m0.u0(e42.c0.clicfg_sns_ad_half_screen_disable_use_mm_image_loader, 0) == 1) {
                a84.z.h(jj4Var.f377860i, vVar != null ? vVar.a() : null);
            } else {
                a84.m.a(jj4Var.f377860i, vVar != null ? vVar.a() : null);
            }
            a84.y0.b(viewGroup2, vVar != null ? vVar.a() : null, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewImage", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return inflate;
    }

    @Override // db5.p8, androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup container, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("instantiateItem", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        kotlin.jvm.internal.o.g(container, "container");
        java.util.LinkedList linkedList = this.f335058q;
        android.view.View i18 = i(i17, linkedList.size() > 0 ? (android.view.View) linkedList.poll() : null, container);
        i18.setOnClickListener(n44.s.f335043d);
        this.f335057p.put(i18, java.lang.Integer.valueOf(i17));
        this.f335059r.put(i17, i18);
        a84.y0.b(container, i18, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("instantiateItem", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter");
        return i18;
    }
}
