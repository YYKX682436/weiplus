package db5;

/* loaded from: classes8.dex */
public class y2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMGridPaperGridView f228578d;

    public y2(com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView, db5.w2 w2Var) {
        this.f228578d = mMGridPaperGridView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView = this.f228578d;
        int i17 = mMGridPaperGridView.f197420f;
        if (i17 < 0 || mMGridPaperGridView.f197425n == null) {
            return 0;
        }
        return i17;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView = this.f228578d;
        db5.v2 v2Var = mMGridPaperGridView.f197425n;
        if (v2Var == null) {
            return null;
        }
        return ((za3.b) v2Var).f470889b.get(mMGridPaperGridView.f197421g + i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView = this.f228578d;
        db5.v2 v2Var = mMGridPaperGridView.f197425n;
        if (v2Var == null) {
            return 0L;
        }
        int i18 = mMGridPaperGridView.f197421g + i17;
        ((za3.b) v2Var).getClass();
        return i18;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView = this.f228578d;
        db5.v2 v2Var = mMGridPaperGridView.f197425n;
        if (v2Var == null) {
            return 0;
        }
        int i18 = mMGridPaperGridView.f197421g;
        v2Var.getClass();
        return 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView = this.f228578d;
        int i18 = mMGridPaperGridView.f197418d;
        viewGroup.toString();
        boolean z18 = mMGridPaperGridView.f197423i;
        if (mMGridPaperGridView.f197423i) {
            view = null;
        }
        db5.v2 v2Var = mMGridPaperGridView.f197425n;
        if (v2Var == null) {
            view = null;
        } else {
            int i19 = mMGridPaperGridView.f197421g + i17;
            za3.b bVar = (za3.b) v2Var;
            bVar.getClass();
            za3.a aVar = new za3.a(bVar);
            if (view == null) {
                view = android.view.View.inflate(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.layout.f488165j0, null);
                aVar.f470886a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a_2);
                aVar.f470887b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ove);
                view.setTag(aVar);
            } else {
                aVar = (za3.a) view.getTag();
            }
            java.lang.String str = (java.lang.String) bVar.f470889b.get(i19);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(aVar.f470886a, str, null);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            if (e17.length() > 8) {
                e17 = ((java.lang.Object) e17.subSequence(0, 9)) + "...";
            }
            aVar.f470887b.setText(e17);
        }
        iz5.a.g(null, view != null);
        int i27 = mMGridPaperGridView.f197422h;
        if (-1 == i27 || mMGridPaperGridView.f197421g + i17 != i27) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/MMGridPaperGridView$GridAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.os.SystemClock.elapsedRealtime();
        int i28 = mMGridPaperGridView.f197422h;
        int i29 = mMGridPaperGridView.f197421g;
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        db5.v2 v2Var = this.f228578d.f197425n;
        if (v2Var == null) {
            return 1;
        }
        v2Var.getClass();
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        com.tencent.mm.ui.base.MMGridPaperGridView mMGridPaperGridView = this.f228578d;
        db5.v2 v2Var = mMGridPaperGridView.f197425n;
        if (v2Var == null) {
            return false;
        }
        int i18 = mMGridPaperGridView.f197421g;
        v2Var.getClass();
        return true;
    }
}
