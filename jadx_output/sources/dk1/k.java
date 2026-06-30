package dk1;

/* loaded from: classes4.dex */
public final class k extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f233152d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.text.SimpleDateFormat f233153e;

    /* renamed from: f, reason: collision with root package name */
    public final java.text.SimpleDateFormat f233154f;

    public k() {
        java.util.Locale locale = java.util.Locale.US;
        this.f233153e = new java.text.SimpleDateFormat("HH:mm", locale);
        this.f233154f = new java.text.SimpleDateFormat("MM/dd HH:mm", locale);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f233152d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        dk1.l holder = (dk1.l) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.f233152d;
        try {
            r45.wf7 wf7Var = (r45.wf7) arrayList.get(i17);
            kotlin.jvm.internal.o.d(wf7Var);
            android.widget.TextView textView = holder.f233155d;
            if (textView != null) {
                r45.xf7 xf7Var = wf7Var.f389141e;
                textView.setText(xf7Var != null ? xf7Var.f390057e : null);
            }
            android.widget.TextView textView2 = holder.f233157f;
            if (textView2 != null) {
                long j17 = wf7Var.f389142f * 1000;
                textView2.setText(android.text.format.DateUtils.isToday(j17) ? this.f233153e.format(new java.util.Date(j17)) : this.f233154f.format(new java.util.Date(j17)));
            }
            android.widget.TextView textView3 = holder.f233156e;
            if (textView3 != null) {
                r45.yf7 yf7Var = wf7Var.f389140d;
                java.lang.String str = yf7Var != null ? yf7Var.f391042e : null;
                if (str == null || str.length() == 0) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setVisibility(0);
                    textView3.setText(textView3.getContext().getString(com.tencent.mm.R.string.a49, str));
                }
            }
            android.view.View view = holder.f233158g;
            if (view == null) {
                return;
            }
            int i18 = i17 != arrayList.size() - 1 ? 4 : 0;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/appbrand/ui/privacy/use_record/PrivacyUseRecordViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPrivacyUseRecordPage", "onBindViewHolder, get useRecord fail since " + e17 + ", position: " + i17);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        return new dk1.l(parent);
    }

    public final void x(java.util.List fetchedUseRecordList) {
        kotlin.jvm.internal.o.g(fetchedUseRecordList, "fetchedUseRecordList");
        java.util.ArrayList arrayList = this.f233152d;
        int size = arrayList.size();
        int size2 = fetchedUseRecordList.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyUseRecordPage", "appendFetchedUseRecordList, posInsert: " + size + ", insertCount: " + size2);
        arrayList.addAll(fetchedUseRecordList);
        notifyItemRangeInserted(size, size2);
    }
}
