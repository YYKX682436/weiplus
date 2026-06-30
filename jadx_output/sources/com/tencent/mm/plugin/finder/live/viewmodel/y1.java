package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes9.dex */
public final class y1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.e2 f117539d;

    public y1(com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var) {
        this.f117539d = e2Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.text.Editable text;
        com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var = this.f117539d;
        android.widget.EditText editText = e2Var.f117063n;
        java.lang.String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        e2Var.f117067r = obj == null ? "" : obj;
        boolean z17 = true;
        boolean z18 = obj == null || obj.length() == 0;
        java.util.ArrayList arrayList = e2Var.f117070u;
        if (z18) {
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            bm2.f fVar = e2Var.f117071v;
            fVar.getClass();
            java.util.ArrayList arrayList3 = fVar.f21875d;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            fVar.f21877f = "";
            fVar.notifyDataSetChanged();
            com.tencent.mm.plugin.finder.live.viewmodel.e2.a(e2Var, true);
            return;
        }
        com.tencent.mm.plugin.finder.live.viewmodel.e2.a(e2Var, false);
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveSearchUIC", "loadSearchData query:" + e2Var.f117067r);
        android.widget.TextView textView = e2Var.f117064o;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View view = e2Var.f117065p;
        if (view != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        arrayList.clear();
        e2Var.f117068s = "";
        e2Var.f117069t = false;
        java.lang.String str = e2Var.f117067r;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.x2.f102672a.f(6, e2Var.f117067r);
        e2Var.f117066q = new db2.m5(e2Var.f117067r, e2Var.f117068s, 0, null, 12, null);
        gm0.j1.d().g(e2Var.f117066q);
        gm0.j1.d().a(4140, e2Var);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
