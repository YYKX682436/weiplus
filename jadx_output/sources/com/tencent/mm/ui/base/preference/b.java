package com.tencent.mm.ui.base.preference;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.ui.base.preference.h0 {
    public final android.util.SparseArray B;

    public b(android.content.Context context, android.widget.ListView listView, android.content.SharedPreferences sharedPreferences) {
        super(context, listView, sharedPreferences);
        this.B = new android.util.SparseArray();
    }

    @Override // com.tencent.mm.ui.base.preference.h0, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2 = super.getView(i17, view, viewGroup);
        this.B.put(i17, view2);
        return view2;
    }

    public android.view.View x(int i17, android.widget.ListView listView) {
        if (i17 > listView.getLastVisiblePosition() || i17 < listView.getFirstVisiblePosition()) {
            return null;
        }
        return (android.view.View) this.B.get(i17);
    }
}
