package ss2;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f411986d;

    public u(ss2.a0 a0Var) {
        this.f411986d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        r45.mb4 f17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/question/QAPostMediaWidget$refreshVideo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMediaWidget$refreshVideo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r45.kb4 kb4Var = new r45.kb4();
        ss2.a0 a0Var = this.f411986d;
        java.util.ArrayList arrayList2 = a0Var.f411911m;
        if (arrayList2 != null) {
            int i17 = 0;
            for (java.lang.Object obj : arrayList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.util.LinkedList list = kb4Var.getList(0);
                f17 = mv2.f0.f331561a.f((java.lang.String) obj, "", (r16 & 4) != 0 ? null : null, (r16 & 8) != 0 ? "" : null, (r16 & 16) != 0 ? "" : null, (r16 & 32) != 0 ? null : null);
                list.add(f17);
                i17 = i18;
            }
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Sj(a0Var.f411905d, new android.content.Intent(), 0L, "", kb4Var, 8485);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QAPostMediaWidget$refreshVideo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
