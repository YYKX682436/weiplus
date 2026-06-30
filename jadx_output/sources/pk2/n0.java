package pk2;

/* loaded from: classes3.dex */
public final class n0 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356022i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f356023j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f356024k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356022i = "";
        this.f356023j = "AnchorDefinitionOption";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356022i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        r45.oa4 oa4Var = ((mm2.e1) this.f364427a.c(mm2.e1.class)).f328996z;
        java.util.LinkedList linkedList = oa4Var != null ? oa4Var.I : null;
        return !(linkedList == null || linkedList.isEmpty());
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        r45.oa4 oa4Var = ((mm2.e1) this.f364427a.c(mm2.e1.class)).f328996z;
        java.util.LinkedList linkedList = oa4Var != null ? oa4Var.I : null;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i(o9Var.f356072a, "anchorVideoLevels is empty, skip add");
            return;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        int i17 = dk2.ef.f233376c;
        int i18 = oa4Var.f382075J;
        if (i17 <= 0) {
            i17 = i18;
        }
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.nz6) obj).f381778d == i17) {
                    break;
                }
            }
        }
        r45.nz6 nz6Var = (r45.nz6) obj;
        java.lang.String str = nz6Var != null ? nz6Var.f381783i : null;
        if (str == null) {
            str = "";
        }
        android.view.View view = bottomSheet.f131959f;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f485495u93);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorDefinitionOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorDefinitionOption", "addItem", "(Lcom/tencent/mm/plugin/finder/live/moreaction/MoreActionHelper;Lcom/tencent/mm/plugin/finder/view/FinderBottomSheet;Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.vhg);
        if ((str.length() > 0) && textView != null) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        this.f356024k = textView;
        if (findViewById != null) {
            findViewById.setOnClickListener(new pk2.l0(this, view, linkedList));
        }
    }
}
