package v74;

/* loaded from: classes4.dex */
public final class g extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f433785d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f433786e;

    /* renamed from: f, reason: collision with root package name */
    public final v74.s f433787f;

    /* renamed from: g, reason: collision with root package name */
    public final v74.m f433788g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f433789h;

    /* renamed from: i, reason: collision with root package name */
    public v74.b f433790i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f433791m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f433792n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f433793o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View.OnClickListener f433794p;

    /* renamed from: q, reason: collision with root package name */
    public v74.c f433795q;

    public g(android.content.Context mContext, com.tencent.mm.plugin.sns.storage.SnsInfo mSnsInfo, v74.s mItemSize, v74.m mLookbookCardInfo, androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mSnsInfo, "mSnsInfo");
        kotlin.jvm.internal.o.g(mItemSize, "mItemSize");
        kotlin.jvm.internal.o.g(mLookbookCardInfo, "mLookbookCardInfo");
        this.f433785d = mContext;
        this.f433786e = mSnsInfo;
        this.f433787f = mItemSize;
        this.f433788g = mLookbookCardInfo;
        this.f433789h = recyclerView;
        this.f433792n = jz5.h.b(new v74.f(this));
        this.f433793o = new v74.d(this);
        this.f433794p = v74.e.f433775d;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        int size = this.f433788g.c().size() + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        long j17 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return j17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        if (i17 == getItemCount() - 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            return 2;
        }
        v74.q x17 = x(i17);
        if (x17 != null && x17.c()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            return 1;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        boolean z17;
        boolean z18;
        boolean z19;
        java.lang.String str2 = "onBindViewHolder";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        v74.b holder = (v74.b) k3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.itemView.hashCode();
        if (holder.getItemViewType() != 2) {
            v74.q x17 = x(i17);
            if (x17 == null) {
                com.tencent.mars.xlog.Log.e("AdLookbookLogic", "onBindViewHolder, itemInfo==null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            android.view.View view = holder.f433762e;
            if (view != null) {
                v74.m mVar = this.f433788g;
                mVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHideItemTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                boolean z27 = mVar.f433869e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHideItemTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                int i18 = z27 ? 8 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter$ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookAdapter$ItemViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindTitleAndIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleText", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleText", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            android.content.Context context = this.f433785d;
            android.widget.TextView textView = holder.f433761d;
            if (textView != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                java.lang.String str3 = x17.f433879a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookItem");
                textView.setText(str3);
                int b17 = i65.a.b(context, 12);
                int b18 = i65.a.b(context, 4);
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a17 = x17.a();
                java.util.Map map = l44.u3.f316380a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                if (a17 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                    str = "onBindViewHolder";
                    z19 = false;
                } else {
                    str = "onBindViewHolder";
                    z19 = a17.f162571b == 4 && !com.tencent.mm.sdk.platformtools.t8.K0(a17.f162583h);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeApp", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper");
                }
                if (z19) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    int i19 = holder.f433767m;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    if (i19 != 1) {
                        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.sns_ad_lookbook_weapp_dark_icon : com.tencent.mm.R.raw.sns_ad_lookbook_weapp_light_icon);
                        if (drawable != null) {
                            drawable.setBounds(0, 0, b17, b17);
                        }
                        textView.setCompoundDrawables(drawable, null, null, null);
                        textView.setCompoundDrawablePadding(b18);
                        z18 = true;
                        holder.k(1);
                    } else {
                        z18 = true;
                    }
                } else {
                    z18 = true;
                    if (l44.s4.j(x17.a())) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                        int i27 = holder.f433767m;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                        if (i27 != 2) {
                            android.graphics.drawable.Drawable drawable2 = context.getResources().getDrawable(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.sns_ad_lookbook_finder_dark_icon : com.tencent.mm.R.raw.sns_ad_lookbook_finder_light_icon);
                            if (drawable2 != null) {
                                drawable2.setBounds(0, 0, b17, b17);
                            }
                            textView.setCompoundDrawables(drawable2, null, null, null);
                            textView.setCompoundDrawablePadding(b18);
                            holder.k(2);
                        }
                    } else if (n74.i0.a(x17.a())) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                        int i28 = holder.f433767m;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIconType", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                        if (i28 != 3) {
                            android.graphics.drawable.Drawable drawable3 = context.getResources().getDrawable(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.sns_ad_mini_shop_dark_icon : com.tencent.mm.R.raw.sns_ad_mini_shop_icon);
                            z17 = false;
                            if (drawable3 != null) {
                                drawable3.setBounds(0, 0, b17, b17);
                            }
                            textView.setCompoundDrawables(drawable3, null, null, null);
                            textView.setCompoundDrawablePadding(b18);
                            holder.k(3);
                        }
                    } else {
                        z17 = false;
                        textView.setCompoundDrawables(null, null, null, null);
                        textView.setCompoundDrawablePadding(0);
                        holder.k(0);
                    }
                }
                z17 = false;
            } else {
                str = "onBindViewHolder";
                z17 = false;
                z18 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindTitleAndIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
            if (x17.b() != null) {
                r45.jj4 b19 = x17.b();
                kotlin.jvm.internal.o.d(b19);
                m44.a.g(b19);
            }
            if (holder.getItemViewType() == 0) {
                r45.jj4 b27 = x17.b();
                java.lang.String str4 = b27 != null ? b27.f377860i : null;
                if (str4 != null && str4.length() != 0) {
                    z18 = z17;
                }
                android.widget.ImageView imageView = holder.f433763f;
                if (z18) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    if (imageView != null) {
                        imageView.setImageDrawable(null);
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                    a84.m.b(str4, imageView);
                }
            } else if (x17.b() != null) {
                r45.jj4 b28 = x17.b();
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f433786e;
                l44.c0.b(snsInfo, b28);
                com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
                r45.jj4 b29 = x17.b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverImg", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
                android.widget.ImageView imageView2 = holder.f433763f;
                int hashCode = context.hashCode();
                com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
                s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
                hj6.l0(b29, imageView2, -1, hashCode, s7Var);
            } else {
                com.tencent.mars.xlog.Log.e("AdLookbookLogic", "media==null");
            }
        } else {
            str = "onBindViewHolder";
            z(this.f433791m);
        }
        str2 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        android.view.View inflate;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        if (i17 == 0) {
            inflate = from.inflate(com.tencent.mm.R.layout.f489526cu5, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        } else if (i17 != 1) {
            inflate = from.inflate(com.tencent.mm.R.layout.cu8, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        } else {
            inflate = from.inflate(com.tencent.mm.R.layout.cu7, parent, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        }
        inflate.hashCode();
        v74.b bVar = new v74.b(inflate, i17, this.f433787f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
        android.view.View view = bVar.f433762e;
        if (view != null) {
            view.setOnClickListener(this.f433794p);
        }
        inflate.setOnClickListener(this.f433793o);
        if (i17 == 2) {
            this.f433790i = bVar;
            android.view.View view2 = bVar.itemView;
            if (view2 != null) {
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), y() > 0 ? y() + view2.getPaddingRight() : view2.getPaddingRight(), view2.getPaddingBottom());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return bVar;
    }

    public final v74.q x(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        if (i17 >= 0) {
            v74.m mVar = this.f433788g;
            if (i17 < mVar.c().size()) {
                v74.q qVar = (v74.q) mVar.c().get(i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
                return qVar;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return null;
    }

    public final int y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTipLayoutExtraRightPadding", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        int intValue = ((java.lang.Number) ((jz5.n) this.f433792n).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTipLayoutExtraRightPadding", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        return intValue;
    }

    public final void z(boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateOverScrollState", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
        this.f433791m = z17;
        com.tencent.mars.xlog.Log.i("AdLookbookLogic", "updateOverScrollState, isOverMinDistance=" + z17);
        v74.b bVar = this.f433790i;
        if (bVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlideTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlideTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter$ItemViewHolder");
            android.widget.TextView textView = bVar.f433766i;
            if (textView != null) {
                boolean z18 = this.f433791m;
                android.content.Context context = this.f433785d;
                v74.m mVar = this.f433788g;
                if (z18) {
                    mVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlideJumpTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                    java.lang.String str3 = mVar.f433866b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlideJumpTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                    if (str3 == null || str3.length() == 0) {
                        str2 = context.getString(com.tencent.mm.R.string.f493181ly5);
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlideJumpTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                        java.lang.String str4 = mVar.f433866b;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlideJumpTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                        str2 = str4;
                    }
                    textView.setText(str2);
                } else {
                    mVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlideTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                    java.lang.String str5 = mVar.f433865a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlideTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                    if (str5 == null || str5.length() == 0) {
                        str = context.getString(com.tencent.mm.R.string.j7x);
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSlideTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                        java.lang.String str6 = mVar.f433865a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSlideTitle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardInfo");
                        str = str6;
                    }
                    textView.setText(str);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateOverScrollState", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookAdapter");
    }
}
