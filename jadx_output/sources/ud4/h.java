package ud4;

/* loaded from: classes4.dex */
public class h extends ud4.b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f426703t = 0;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f426704i;

    /* renamed from: m, reason: collision with root package name */
    public final int f426705m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f426706n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f426707o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f426708p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f426709q;

    /* renamed from: r, reason: collision with root package name */
    public final ud4.d f426710r;

    /* renamed from: s, reason: collision with root package name */
    public int f426711s;

    public h(android.content.Context context, java.util.List list, int i17, int i18, boolean z17, boolean z18, ud4.d dVar) {
        super(context, i17);
        this.f426704i = new java.util.HashMap();
        this.f426711s = 0;
        super.c(h(list));
        this.f426705m = i18;
        this.f426706n = z17;
        this.f426709q = z18;
        this.f426710r = dVar;
        if (z18) {
            d();
        }
        g();
    }

    @Override // ud4.b
    public void c(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("set", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        super.c(h(list));
        if (this.f426709q) {
            d();
        }
        g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        for (int i17 = 0; i17 < j(); i17++) {
            com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem snsPublishImageItem = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem("", 0, 0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            ud4.g gVar = new ud4.g(this, null);
            gVar.f426698a = snsPublishImageItem;
            gVar.f426699b = getCount();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            gVar.f426699b = getCount();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            a(gVar);
            this.f426682g.add(i17, gVar);
            notifyDataSetChanged();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDummyHeader", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }

    public boolean f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (i17 < j()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return false;
        }
        if (this.f426707o) {
            boolean z17 = i17 != getCount() - 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return z17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canReorder", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return true;
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAddImg", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        boolean z17 = this.f426706n;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(getCount());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(j());
        int i17 = this.f426705m;
        com.tencent.mars.xlog.Log.i("DynamicGridAdapter", "showAddImg %s, getCount %d, getHeaderCount %d, maxShowCount %d， showing %s", valueOf, valueOf2, valueOf3, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f426707o));
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            int count = (getCount() - j()) - (this.f426707o ? 1 : 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPicCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            if (count < i17) {
                if (!this.f426707o) {
                    this.f426707o = true;
                    com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem snsPublishImageItem = new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem("", 0, 0, 0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                    ud4.g gVar = new ud4.g(this, null);
                    gVar.f426698a = snsPublishImageItem;
                    gVar.f426699b = getCount();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
                    a(gVar);
                    this.f426682g.add(gVar);
                    notifyDataSetChanged();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("add", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAddImg", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            }
        }
        this.f426707o = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAddImg", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (android.text.TextUtils.isEmpty(((com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) ((ud4.g) getItem(i17)).f426698a).b())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        ud4.e eVar;
        android.view.View view2 = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (view2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
            view2 = android.view.LayoutInflater.from(this.f426681f).inflate(com.tencent.mm.R.layout.ct9, viewGroup, false);
            eVar = new ud4.e(this, view2, null);
            view2.setTag(com.tencent.mm.R.id.has, eVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            l(eVar.f426689c);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            l(eVar.f426688b);
        } else {
            eVar = (ud4.e) view2.getTag(com.tencent.mm.R.id.has);
        }
        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem snsPublishBaseMultiPicItem = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) ((ud4.g) getItem(i17)).f426698a;
        eVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("build", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
        boolean isEmpty = android.text.TextUtils.isEmpty(snsPublishBaseMultiPicItem.b());
        android.widget.ImageView imageView = eVar.f426689c;
        android.widget.ImageView imageView2 = eVar.f426688b;
        android.view.View view3 = eVar.f426687a;
        ud4.h hVar = eVar.f426691e;
        if (isEmpty) {
            imageView.setBackgroundResource(com.tencent.mm.R.color.a6n);
            imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(imageView2.getContext(), com.tencent.mm.R.raw.album_post_add_picture_btn, i65.a.d(imageView2.getContext(), com.tencent.mm.R.color.FG_1)));
            imageView2.setContentDescription(imageView2.getContext().getString(com.tencent.mm.R.string.j8w));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            int i18 = hVar.f426711s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            int i19 = (i18 * 35) / 100;
            imageView2.setPadding(i19, i19, i19, i19);
            if (i17 > 0) {
                view3.setTag(-1);
            } else if (i17 < hVar.j()) {
                view3.setTag(Integer.MAX_VALUE);
            } else if (i17 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                if (!hVar.f426709q) {
                    view3.setTag(-1);
                }
            }
        } else {
            view3.setTag(java.lang.Integer.valueOf(hVar.k(i17)));
            imageView2.setBackgroundDrawable(null);
            imageView2.setImageBitmap(null);
            imageView2.setTag(snsPublishBaseMultiPicItem.b());
            imageView2.setContentDescription(imageView2.getContext().getString(com.tencent.mm.R.string.jar));
            imageView2.setPadding(0, 0, 0, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            java.util.HashMap hashMap = hVar.f426704i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) hashMap.get(snsPublishBaseMultiPicItem.b());
            if (ca4.z0.f(bitmap)) {
                imageView2.setImageBitmap(bitmap);
            } else {
                new ud4.f(hVar, imageView2, snsPublishBaseMultiPicItem.b()).d("");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("build", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
        if (i17 < j()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            imageView2.setVisibility(4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            imageView.setVisibility(8);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            android.view.View view4 = view2;
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            imageView2.setVisibility(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter$MyViewHolder");
            imageView.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view5 = view2;
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewTypeCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return 2;
    }

    public final java.util.List h(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int i17 = 0;
        for (java.lang.Object obj : list) {
            ud4.g gVar = new ud4.g(this, null);
            gVar.f426698a = obj;
            gVar.f426699b = i17;
            arrayList.add(gVar);
            i17++;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return arrayList;
    }

    public int j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeaderCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (!this.f426709q) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
            return 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderCount", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return this.f426683h;
    }

    public int k(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOriginPos", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        int j17 = i17 - j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOriginPos", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        return j17;
    }

    public final void l(android.widget.ImageView imageView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        if (this.f426711s == 0) {
            int z17 = com.tencent.mm.plugin.sns.model.l4.Hj().z1();
            if (z17 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
                return;
            }
            android.content.Context context = this.f426681f;
            int dimensionPixelSize = ((z17 - (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480609ab1) * 4)) - (context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479869hi) * 2)) / 3;
            this.f426711s = dimensionPixelSize;
            int i17 = com.tencent.mm.plugin.sns.model.l4.f164406y0;
            if (dimensionPixelSize > i17) {
                dimensionPixelSize = i17;
            }
            this.f426711s = dimensionPixelSize;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i18 = this.f426711s;
        layoutParams.width = i18;
        layoutParams.height = i18;
        imageView.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPicSize", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
    }
}
