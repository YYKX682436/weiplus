package jn2;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.w f300702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jn2.w wVar) {
        super(0);
        this.f300702d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        int i17;
        android.text.Editable text;
        jn2.w wVar = this.f300702d;
        android.widget.EditText editText = wVar.f300725i;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (wVar.f300738y) {
            wVar.f300738y = false;
            android.widget.EditText editText2 = wVar.f300725i;
            if (editText2 != null) {
                editText2.setSelection(str.length());
            }
        } else {
            if (str.length() == 0) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = wVar.f300726m;
                if (weImageView != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(weImageView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget$setupSearchInput$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    weImageView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(weImageView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget$setupSearchInput$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                wVar.f300723g.invoke();
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = wVar.f300729p;
                if (constraintLayout != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(constraintLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    constraintLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(constraintLayout, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    constraintLayout.setEnabled(false);
                }
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = wVar.f300732s;
                if (constraintLayout2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(constraintLayout2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    constraintLayout2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(constraintLayout2, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = wVar.f300730q;
                if (recyclerView != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(recyclerView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    recyclerView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView = wVar.f300733t;
                if (textView != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(textView, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    textView.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = wVar.f300728o;
                if (constraintLayout3 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(constraintLayout3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    constraintLayout3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(constraintLayout3, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i17 = 1;
                    constraintLayout3.setEnabled(true);
                } else {
                    i17 = 1;
                }
                kotlinx.coroutines.r2 r2Var = wVar.f300739z;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, i17, null);
                }
                wVar.f300739z = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new jn2.s(wVar, str, null), 3, null);
                hn2.k.f282534a.a(str, wVar.f300726m, wVar.f300727n);
            }
        }
        return jz5.f0.f302826a;
    }
}
