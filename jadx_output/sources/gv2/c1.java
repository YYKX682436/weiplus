package gv2;

/* loaded from: classes10.dex */
public class c1 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.uniComments.g2 f275996e;

    public c1(com.tencent.mm.plugin.finder.uniComments.g2 presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f275996e = presenter;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487859z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x046a, code lost:
    
        if (((r3.f302223d.v0() & 16) != 0) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x08dd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06c5  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r45, in5.c r46, int r47, int r48, boolean r49, java.util.List r50) {
        /*
            Method dump skipped, instructions count: 3135
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gv2.c1.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.c6d);
        finderCollapsibleTextView.setLimitLine(4);
        finderCollapsibleTextView.setCollapse(true);
        finderCollapsibleTextView.f(false, true);
        finderCollapsibleTextView.setOnCollapse(new gv2.z0(holder));
        android.view.View p17 = holder.p(com.tencent.mm.R.id.i0p);
        com.tencent.mm.ui.xj xjVar = new com.tencent.mm.ui.xj(p17);
        p17.setTouchDelegate(xjVar);
        int f17 = i65.a.f(holder.f293121e, com.tencent.mm.R.dimen.f479688cn);
        android.view.View p18 = holder.p(com.tencent.mm.R.id.a_z);
        if (p18 != null) {
            p18.post(new gv2.a1(p18, f17, xjVar));
        }
    }

    public final void n(android.view.View view, java.lang.String str, jv2.i iVar, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mvi)).setText(str);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.mvf);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.mvh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/uniComments/convert/UniFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/uniComments/storge/UniFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(new gv2.o0(findViewById, findViewById2, this, iVar, z17));
    }
}
