package f84;

/* loaded from: classes4.dex */
public final class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f260177d;

    /* renamed from: e, reason: collision with root package name */
    public final f84.v f260178e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f260179f;

    /* renamed from: g, reason: collision with root package name */
    public final int f260180g;

    /* renamed from: h, reason: collision with root package name */
    public f84.b f260181h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnClickListener f260182i;

    public d(android.content.Context mContext, com.tencent.mm.plugin.sns.storage.SnsInfo mSnsInfo, f84.v mAdBrandTopicInfo, androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mSnsInfo, "mSnsInfo");
        kotlin.jvm.internal.o.g(mAdBrandTopicInfo, "mAdBrandTopicInfo");
        this.f260177d = mContext;
        this.f260178e = mAdBrandTopicInfo;
        this.f260179f = recyclerView;
        this.f260180g = i17;
        this.f260182i = new f84.c(this);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        java.util.List b17 = this.f260178e.b();
        int size = b17 != null ? b17.size() : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        long j17 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        return j17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        f84.v vVar;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        f84.a holder = (f84.a) k3Var;
        f84.v vVar2 = this.f260178e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        kotlin.jvm.internal.o.g(holder, "holder");
        try {
            com.tencent.mars.xlog.Log.i("AdBrandTopicAdapter", "onBindHolder, view.hash is " + holder.itemView.hashCode() + ", pos=" + i17);
        } catch (java.lang.Throwable th6) {
            th = th6;
            str = "onBindViewHolder";
        }
        if (holder.getItemViewType() == 0) {
            f84.b0 x17 = x(i17);
            if (x17 == null) {
                com.tencent.mars.xlog.Log.e("AdBrandTopicAdapter", "onBindViewHolder, itemInfo is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
                str5 = "onBindViewHolder";
                str4 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
            }
            boolean C = com.tencent.mm.ui.bk.C();
            java.lang.String e17 = C ? x17.e() : x17.d();
            java.lang.String b17 = C ? x17.b() : x17.a();
            if (holder.getItemViewType() == 0) {
                try {
                    boolean N0 = com.tencent.mm.sdk.platformtools.t8.N0(e17, b17);
                    android.widget.ImageView imageView = holder.f260170f;
                    if (N0) {
                        android.widget.ImageView i19 = holder.i();
                        if (i19 != null) {
                            i19.setImageDrawable(null);
                        }
                        try {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            if (imageView != null) {
                                imageView.setImageDrawable(null);
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            str = "onBindViewHolder";
                            str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                            str6 = "AdBrandTopicAdapter";
                            str3 = str6;
                            ca4.q.c(str3, th);
                            str5 = str;
                            str4 = str2;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                        }
                    } else {
                        a84.m.b(e17, holder.i());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                        a84.m.b(b17, imageView);
                    }
                    vVar2.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContainerWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                    int i27 = vVar2.f260217a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContainerWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopicWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                    int i28 = x17.f260172a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopicWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomImageWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                    int i29 = x17.f260174c;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomImageWidth", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                    if (i27 > 0 && i28 > 0 && i29 > 0) {
                        android.widget.ImageView i37 = holder.i();
                        if (i37 != null) {
                            layoutParams = i37.getLayoutParams();
                            str = "onBindViewHolder";
                        } else {
                            str = "onBindViewHolder";
                            layoutParams = null;
                        }
                        try {
                            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                                try {
                                    marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                                } catch (java.lang.Throwable th8) {
                                    th = th8;
                                    str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                                    str3 = "AdBrandTopicAdapter";
                                    ca4.q.c(str3, th);
                                    str5 = str;
                                    str4 = str2;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                                }
                            } else {
                                marginLayoutParams = null;
                            }
                            int i38 = this.f260180g;
                            if (marginLayoutParams != null) {
                                str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                                try {
                                    i18 = (i38 * i28) / i27;
                                    marginLayoutParams.width = i18;
                                    str6 = "AdBrandTopicAdapter";
                                } catch (java.lang.Throwable th9) {
                                    th = th9;
                                    str6 = "AdBrandTopicAdapter";
                                    str3 = str6;
                                    ca4.q.c(str3, th);
                                    str5 = str;
                                    str4 = str2;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                                }
                                try {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopicHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                                    vVar = vVar2;
                                    int i39 = x17.f260173b;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopicHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                                    marginLayoutParams.height = (i18 * i39) / i28;
                                } catch (java.lang.Throwable th10) {
                                    th = th10;
                                    str3 = str6;
                                    ca4.q.c(str3, th);
                                    str5 = str;
                                    str4 = str2;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                                }
                            } else {
                                str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                                vVar = vVar2;
                                str6 = "AdBrandTopicAdapter";
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomImage", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            android.view.ViewGroup.LayoutParams layoutParams2 = imageView != null ? imageView.getLayoutParams() : null;
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            if (marginLayoutParams2 != null) {
                                int i47 = (i38 * i29) / i27;
                                marginLayoutParams2.width = i47;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomImageHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                                int i48 = x17.f260175d;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomImageHeight", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.TopicInfo");
                                marginLayoutParams2.height = (i47 * i48) / i29;
                            }
                            android.widget.ImageView i49 = holder.i();
                            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = i49 instanceof com.tencent.mm.ui.widget.MMRoundCornerImageView ? (com.tencent.mm.ui.widget.MMRoundCornerImageView) i49 : null;
                            if (mMRoundCornerImageView != null) {
                                android.content.Context context = this.f260177d;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContainerCornerRadius", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                                int i57 = vVar.f260219c;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContainerCornerRadius", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicInfo");
                                mMRoundCornerImageView.setRadius(i65.a.b(context, i57));
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContainer", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContainer", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter$ItemViewHolder");
                            android.widget.FrameLayout frameLayout = holder.f260168d;
                            if (frameLayout != null) {
                                frameLayout.requestLayout();
                            }
                        } catch (java.lang.Throwable th11) {
                            th = th11;
                            str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                            str6 = "AdBrandTopicAdapter";
                            str3 = str6;
                            ca4.q.c(str3, th);
                            str5 = str;
                            str4 = str2;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                        }
                    }
                } catch (java.lang.Throwable th12) {
                    th = th12;
                    str = "onBindViewHolder";
                }
            } else {
                str = "onBindViewHolder";
                str2 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
                str3 = "AdBrandTopicAdapter";
                try {
                    com.tencent.mars.xlog.Log.e(str3, "onBindViewHolder, wrong view type");
                } catch (java.lang.Throwable th13) {
                    th = th13;
                    ca4.q.c(str3, th);
                    str5 = str;
                    str4 = str2;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                }
            }
            str5 = str;
            str4 = str2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
        }
        str5 = "onBindViewHolder";
        str4 = "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        f84.a aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        android.content.Context context = this.f260177d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        kotlin.jvm.internal.o.g(parent, "parent");
        try {
            android.view.View inflate = i17 == 0 ? android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489590eq5, parent, false) : new android.view.View(context);
            inflate.setOnClickListener(this.f260182i);
            com.tencent.mars.xlog.Log.i("AdBrandTopicAdapter", "onCreateHolder, view.hash is " + inflate.hashCode());
            aVar = new f84.a(inflate, i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        } catch (java.lang.Throwable th6) {
            ca4.q.c("AdBrandTopicAdapter", th6);
            aVar = new f84.a(new android.view.View(context), i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        return aVar;
    }

    public final f84.b0 x(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        java.util.List b17 = this.f260178e.b();
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
            return null;
        }
        if (i17 < 0 || i17 >= b17.size()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
            return null;
        }
        f84.b0 b0Var = (f84.b0) b17.get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemData", "com.tencent.mm.plugin.sns.ad.widget.adbrandtopic.AdBrandTopicAdapter");
        return b0Var;
    }
}
