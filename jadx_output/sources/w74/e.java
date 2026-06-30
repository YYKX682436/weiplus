package w74;

/* loaded from: classes4.dex */
public class e extends androidx.recyclerview.widget.f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f443534d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f443535e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f443536f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f443537g;

    /* renamed from: h, reason: collision with root package name */
    public z84.i f443538h;

    public e(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        if (recyclerView != null) {
            this.f443534d = recyclerView;
            this.f443537g = recyclerView.getContext();
        } else {
            this.f443537g = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        if (snsInfo != null) {
            if (snsInfo.getAdXml() != null) {
                com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
                s34.h0 h0Var = adXml.adFinderTopicInfo;
                if (h0Var != null && !a84.b0.b(h0Var.f402656f)) {
                    this.f443536f = snsInfo;
                    this.f443535e = adXml.adFinderTopicInfo.f402656f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                    return;
                }
                com.tencent.mars.xlog.Log.w("SnsAd.RecyclerViewAdapter", "the adFinderTopicInfo or resource info list is null, initialize adapter failed!!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("SnsAd.RecyclerViewAdapter", "the sns info is null, initialize adapter failed!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    public void B(w74.f fVar, s34.i0 i0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processTopBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        a84.z.d(i0Var.f402659a, fVar.f443541f, 1);
        java.lang.String str = i0Var.f402660b;
        android.widget.TextView textView = fVar.f443542g;
        a84.y0.l(textView, str);
        a84.y0.k(textView, (int) (((i17 - i65.a.b(this.f443537g, 80)) - a84.y0.a(textView, i0Var.f402665g)) + 0.5f));
        boolean isEmpty = android.text.TextUtils.isEmpty(i0Var.f402665g);
        android.widget.TextView textView2 = fVar.f443543h;
        if (isEmpty) {
            a84.y0.p(textView2, false);
        } else {
            a84.y0.p(textView2, true);
            a84.y0.l(textView2, i0Var.f402665g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processTopBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        java.util.List list = this.f443535e;
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            return 0;
        }
        int size = ((java.util.ArrayList) list).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        long j17 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return j17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        s34.i0 x17;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        w74.f fVar = (w74.f) k3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        try {
            x17 = x(i17);
            recyclerView = this.f443534d;
        } catch (java.lang.Throwable unused) {
        }
        if (x17 != null && recyclerView != null && fVar != null) {
            int width = recyclerView.getWidth();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardSubItemViewHolder");
            a84.y0.n(fVar.f443543h);
            a84.y0.n(fVar.f443540e);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardSubItemViewHolder");
            B(fVar, x17, width);
            y(fVar, x17, width);
            z(fVar, x17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        }
        com.tencent.mars.xlog.Log.w("SnsAd.RecyclerViewAdapter", "the res info or recyclerView is null!!!!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        z84.i iVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            iVar = this.f443538h;
            recyclerView = this.f443534d;
        } catch (java.lang.Throwable unused) {
        }
        if (view == null || recyclerView == null || iVar == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.RecyclerViewAdapter", "the recycler view or click listener is null!!!");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        } else {
            if (view.getParent() != recyclerView) {
                com.tencent.mars.xlog.Log.e("SnsAd.RecyclerViewAdapter", "are you cray?!! the parent of the clicked view is not same as the input recycler view!!");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                return;
            }
            androidx.recyclerview.widget.k3 w07 = recyclerView.w0(view);
            if (w07 == null) {
                com.tencent.mars.xlog.Log.e("SnsAd.RecyclerViewAdapter", "I think the statement can't be reached, why?");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            } else {
                iVar.b(recyclerView, view, w07.getAdapterPosition());
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/topic/TopicCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        w74.f fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        android.content.Context context = this.f443537g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        try {
            viewGroup.getWidth();
            android.view.View g17 = a84.y0.g(context, com.tencent.mm.R.layout.cov, viewGroup, false);
            int b17 = i65.a.b(context, 8);
            if (g17 instanceof com.tencent.mm.ui.widget.RoundedCornerFrameLayout) {
                float f17 = b17;
                ((com.tencent.mm.ui.widget.RoundedCornerFrameLayout) g17).b(f17, f17, 0.0f, 0.0f);
            }
            if (g17 != null) {
                g17.setOnClickListener(this);
                fVar = new w74.f(g17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            } else {
                com.tencent.mars.xlog.Log.e("SnsAd.RecyclerViewAdapter", "the inflated view is null????");
                w74.f fVar2 = new w74.f(new android.view.View(viewGroup.getContext()));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                fVar = fVar2;
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.RecyclerViewAdapter", "onCreateViewHolder failed????");
            fVar = new w74.f(new android.view.View(com.tencent.mm.sdk.platformtools.x2.f193071a));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return fVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        w74.f fVar = (w74.f) k3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        super.onViewDetachedFromWindow(fVar);
        try {
            fVar.getAdapterPosition();
            a84.y0.c(fVar.f443540e);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    public s34.i0 x(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        try {
            java.util.List list = this.f443535e;
            if (list != null && i17 >= 0 && i17 < ((java.util.ArrayList) list).size()) {
                s34.i0 i0Var = (s34.i0) ((java.util.ArrayList) this.f443535e).get(i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
                return i0Var;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("SnsAd.RecyclerViewAdapter", "the getResInfo has something wrong " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        return null;
    }

    public void y(w74.f fVar, s34.i0 i0Var, int i17) {
        android.graphics.drawable.GradientDrawable gradientDrawable;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processBottomBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        float a17 = a84.y0.a(fVar.f443545m, i0Var.f402661c);
        android.content.Context context = this.f443537g;
        a84.y0.l(fVar.f443545m, i0Var.f402661c);
        android.widget.TextView textView = fVar.f443546n;
        a84.y0.k(textView, (int) (((i17 - i65.a.b(context, 76)) - a17) + 0.5f));
        a84.y0.l(textView, i0Var.f402662d);
        float b17 = i65.a.b(context, 100);
        float f17 = i0Var.f402664f;
        if (f17 <= 0.0f) {
            f17 = 0.8f;
        }
        int a18 = a84.c0.a(i0Var.f402663e, -352965);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRoundBackground", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        android.view.ViewGroup viewGroup = fVar.f443544i;
        if (viewGroup == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRoundBackground", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        } else {
            try {
                android.graphics.drawable.Drawable background = viewGroup.getBackground();
                if (background instanceof android.graphics.drawable.GradientDrawable) {
                    gradientDrawable = (android.graphics.drawable.GradientDrawable) background;
                    gradientDrawable.mutate();
                } else {
                    gradientDrawable = new android.graphics.drawable.GradientDrawable();
                }
                gradientDrawable.setShape(0);
                gradientDrawable.setAlpha((int) ((f17 * 255.0f) + 0.5f));
                gradientDrawable.setColor(a18);
                gradientDrawable.setCornerRadius(b17);
                viewGroup.setBackground(gradientDrawable);
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.w("ViewUtils", "setRoundBackground error.");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRoundBackground", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processBottomBar", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }

    public void z(w74.f fVar, s34.i0 i0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        if (i0Var.a()) {
            com.tencent.mars.xlog.Log.i("SnsAd.RecyclerViewAdapter", "the resInfo is sight");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            r45.jj4 jj4Var = i0Var.f402667i;
            android.widget.ImageView imageView = fVar.f443539d;
            int hashCode = this.f443537g.hashCode();
            com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
            s7Var.f195313b = this.f443536f.getTimeLine().CreateTime;
            hj6.l0(jj4Var, imageView, -1, hashCode, s7Var);
            a84.y0.p(fVar.f443540e, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
        } else {
            a84.z.d(i0Var.f402667i.f377860i, fVar.f443539d, 3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter");
    }
}
