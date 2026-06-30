package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class b0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.MMPreference f197792d;

    public b0(com.tencent.mm.ui.base.preference.MMPreference mMPreference) {
        this.f197792d = mMPreference;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.widget.ListView listView;
        android.widget.ListView listView2;
        com.tencent.mm.ui.base.preference.h0 h0Var;
        com.tencent.mm.ui.base.preference.h0 h0Var2;
        com.tencent.mm.ui.base.preference.h0 h0Var3;
        android.widget.ListView listView3;
        com.tencent.mm.ui.base.preference.h0 h0Var4;
        com.tencent.mm.ui.base.preference.MMPreference mMPreference = this.f197792d;
        listView = mMPreference.list;
        if (i17 < listView.getHeaderViewsCount()) {
            return false;
        }
        listView2 = mMPreference.list;
        int headerViewsCount = i17 - listView2.getHeaderViewsCount();
        h0Var = mMPreference.adapter;
        if (headerViewsCount >= h0Var.getCount()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(headerViewsCount);
            h0Var4 = mMPreference.adapter;
            com.tencent.mars.xlog.Log.e(com.tencent.mm.ui.base.preference.MMPreference.TAG, "itemlongclick, outofindex, %d, %d", valueOf, java.lang.Integer.valueOf(h0Var4.getCount()));
            return false;
        }
        h0Var2 = mMPreference.adapter;
        com.tencent.mm.ui.base.preference.Preference preference = (com.tencent.mm.ui.base.preference.Preference) h0Var2.getItem(headerViewsCount);
        h0Var3 = mMPreference.adapter;
        listView3 = mMPreference.list;
        return mMPreference.onPreferenceTreeLongClick(h0Var3, preference, listView3);
    }
}
