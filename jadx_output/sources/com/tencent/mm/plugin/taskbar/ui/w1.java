package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class w1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final rh4.j0 f172742d = new com.tencent.mm.plugin.taskbar.ui.v1(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172743e;

    public w1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView) {
        this.f172743e = taskBarView;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f172743e.f172525e2.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        return ((java.lang.Integer) this.f172743e.f172525e2.get(i17)).intValue();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172743e;
        if (i17 >= 0) {
            java.util.ArrayList arrayList = taskBarView.f172525e2;
            if (i17 < arrayList.size()) {
                return ((java.lang.Integer) arrayList.get(i17)).intValue();
            }
        } else {
            int i18 = com.tencent.mm.plugin.taskbar.ui.TaskBarView.f172519c3;
            taskBarView.getClass();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        lh4.a aVar;
        rh4.j0 j0Var = this.f172742d;
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172743e;
        switch (i17) {
            case 1:
                android.content.Context context = taskBarView.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                rh4.n0 n0Var = new rh4.n0(context, taskBarView, i17, null, 0);
                taskBarView.f172531k2 = n0Var;
                n0Var.setWeAppCallback(j0Var);
                aVar = new lh4.a(taskBarView.f172531k2);
                break;
            case 2:
                android.content.Context context2 = taskBarView.getContext();
                kotlin.jvm.internal.o.g(context2, "context");
                rh4.o oVar = new rh4.o(context2, taskBarView, i17, null, 0);
                taskBarView.f172532l2 = oVar;
                oVar.setWeAppCallback(j0Var);
                aVar = new lh4.a(taskBarView.f172532l2);
                break;
            case 3:
                aVar = new lh4.a(new lh4.i(taskBarView.getContext(), taskBarView, i17));
                break;
            case 4:
                taskBarView.f172534n2 = new ph4.e(taskBarView.getContext(), taskBarView, i17);
                aVar = new lh4.a(taskBarView.f172534n2);
                break;
            case 5:
            case 10:
                aVar = new lh4.a(new rh4.q(taskBarView.getContext(), taskBarView, i17));
                break;
            case 6:
            case 8:
                taskBarView.f172535o2 = new oh4.j(taskBarView.getContext(), taskBarView, i17);
                aVar = new lh4.a(taskBarView.f172535o2);
                break;
            case 7:
                rh4.m mVar = new rh4.m(taskBarView.getContext(), taskBarView, i17);
                taskBarView.f172533m2 = mVar;
                mVar.setWeAppCallback(j0Var);
                aVar = new lh4.a(taskBarView.f172533m2);
                break;
            case 9:
                aVar = new lh4.a(new lh4.l(taskBarView.getContext(), taskBarView, i17));
                break;
            default:
                return null;
        }
        lh4.n a17 = taskBarView.f172523c2.a(i17);
        if (a17 == null) {
            return aVar;
        }
        android.view.View view = aVar.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.taskbar.ui.section.TaskBarSectionBaseView");
        ((lh4.h) view).setViewModel(a17);
        return aVar;
    }

    public final java.lang.String x(java.util.List list) {
        java.util.Iterator it = list.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            cl1.n0 n0Var = (cl1.n0) it.next();
            if (n0Var.f42888a != null) {
                str = str + n0Var.f42888a.f76365h + " ";
            } else {
                str = str + "info null ";
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r6 != 8) goto L28;
     */
    @Override // androidx.recyclerview.widget.f2
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(lh4.a r5, int r6) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.taskbar.ui.w1.onBindViewHolder(lh4.a, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        lh4.a aVar = (lh4.a) k3Var;
        if (list.size() == 0) {
            onBindViewHolder(aVar, i17);
        }
    }
}
