package r84;

/* loaded from: classes4.dex */
public final class d extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final s34.c f393322d;

    /* renamed from: e, reason: collision with root package name */
    public final int f393323e;

    /* renamed from: f, reason: collision with root package name */
    public final int f393324f;

    /* renamed from: g, reason: collision with root package name */
    public final int f393325g;

    public d(s34.c bulletInfo, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(bulletInfo, "bulletInfo");
        this.f393322d = bulletInfo;
        this.f393323e = i17;
        this.f393324f = i18;
        this.f393325g = i19;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        return Integer.MAX_VALUE;
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        long itemId = super.getItemId(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        return itemId;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        int i18 = i17 < this.f393322d.a() ? 0 : 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemViewType", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        return i18;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        r84.b holder = (r84.b) k3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        kotlin.jvm.internal.o.g(holder, "holder");
        s34.c cVar = this.f393322d;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBulletTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
        java.util.List list = cVar.f402586a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBulletTextList", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        int size = arrayList.size();
        int a17 = cVar.a();
        if (i17 >= a17) {
            if (size == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
            }
            int i18 = (i17 - a17) % size;
            if (i18 >= 0 && i18 < size) {
                com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
                holder.itemView.getContext();
                android.text.SpannableString Ri = Di.Ri((java.lang.CharSequence) arrayList.get(i18), true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextView", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter$ViewHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextView", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter$ViewHolder");
                android.widget.TextView textView = holder.f393320d;
                if (textView != null) {
                    textView.setText(Ri);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildDanmuItemView", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        int i18 = this.f393325g;
        int i19 = this.f393323e;
        if (i17 == 0) {
            android.view.View view2 = new android.view.View(context);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(i19, i19);
            marginLayoutParams.bottomMargin = i18;
            view2.setLayoutParams(marginLayoutParams);
            view = view2;
        } else {
            android.widget.TextView textView = new android.widget.TextView(context);
            s34.c cVar = this.f393322d;
            cVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            int i27 = cVar.f402589d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBackgroundColor", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            textView.setBackgroundColor(i27);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            int i28 = cVar.f402588c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextColor", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            textView.setTextColor(i28);
            textView.setSingleLine(true);
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFontSize", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            int i29 = cVar.f402587b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFontSize", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            textView.setTextSize(0, i29);
            android.graphics.Typeface typeface = textView.getTypeface();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFontWeight", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            int i37 = cVar.f402590e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFontWeight", "com.tencent.mm.plugin.sns.ad.adxml.AdBulletScreenInfo");
            textView.setTypeface(typeface, i37);
            textView.setGravity(17);
            int s17 = ca4.m0.s(6);
            textView.setPadding(s17, 0, s17, 0);
            textView.setClipToOutline(true);
            textView.setOutlineProvider(new r84.c(this));
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = new android.view.ViewGroup.MarginLayoutParams(-2, i19);
            marginLayoutParams2.bottomMargin = i18;
            textView.setLayoutParams(marginLayoutParams2);
            view = textView;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildDanmuItemView", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        r84.b bVar = new r84.b(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenView$DanmuAdapter");
        return bVar;
    }
}
