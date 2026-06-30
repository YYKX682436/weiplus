package r02;

/* loaded from: classes8.dex */
public class r0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f368325e;

    /* renamed from: n, reason: collision with root package name */
    public r02.m0 f368331n;

    /* renamed from: d, reason: collision with root package name */
    public final m43.e f368324d = new m43.e();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f368326f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f368327g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f368328h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f368329i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f368330m = true;

    public r0(android.content.Context context) {
        this.f368325e = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f368324d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((com.tencent.mm.plugin.downloader_app.model.r0) this.f368324d.get(i17)).f97314c;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        android.view.View view;
        int i18;
        r02.q0 q0Var = (r02.q0) k3Var;
        m43.e eVar = this.f368324d;
        com.tencent.mm.plugin.downloader_app.model.r0 r0Var = (com.tencent.mm.plugin.downloader_app.model.r0) eVar.get(i17);
        q0Var.itemView.setClickable(this.f368326f);
        int i19 = r0Var.f97314c;
        android.view.View view2 = q0Var.f368322d;
        switch (i19) {
            case 1:
                view = view2;
                if (eVar.d(2) != 0) {
                    this.f368327g = true;
                    android.view.View view3 = q0Var.f368322d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((com.tencent.mm.plugin.downloader_app.ui.TaskHeaderView) view).a(r0Var, false);
                    break;
                } else {
                    this.f368327g = false;
                    android.view.View view4 = q0Var.f368322d;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                }
            case 2:
            case 4:
                view = view2;
                ((com.tencent.mm.plugin.downloader_app.ui.TaskItemView) view).setData(r0Var);
                break;
            case 3:
                view = view2;
                int d17 = eVar.d(4);
                if (d17 != 0) {
                    this.f368328h = true;
                    android.view.View view5 = q0Var.f368322d;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    r0Var.f97323l = d17;
                    ((com.tencent.mm.plugin.downloader_app.ui.TaskHeaderView) view).a(r0Var, this.f368327g);
                    break;
                } else {
                    this.f368328h = false;
                    android.view.View view6 = q0Var.f368322d;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                }
            case 5:
                view = view2;
                if (eVar.d(6) != 0) {
                    android.view.View view7 = q0Var.f368322d;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((com.tencent.mm.plugin.downloader_app.ui.TaskHeaderView) view).a(r0Var, this.f368327g || this.f368328h);
                    break;
                } else {
                    android.view.View view8 = q0Var.f368322d;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                }
            case 6:
                view = view2;
                if (!this.f368329i && i17 >= 3 && ((com.tencent.mm.plugin.downloader_app.model.r0) eVar.get(i17 - 3)).f97314c == 6) {
                    android.view.View view9 = q0Var.f368322d;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                } else {
                    ((com.tencent.mm.plugin.downloader_app.ui.TaskItemView) view).setData(r0Var);
                    break;
                }
            case 7:
                view = view2;
                if (!this.f368329i) {
                    if (com.tencent.mm.sdk.platformtools.t8.L0(eVar)) {
                        i18 = 0;
                    } else {
                        java.util.Iterator it = eVar.iterator();
                        i18 = 0;
                        while (it.hasNext()) {
                            if (((com.tencent.mm.plugin.downloader_app.model.r0) it.next()).f97314c == 6) {
                                i18++;
                            }
                        }
                    }
                    if (i18 > 3) {
                        android.view.View view10 = q0Var.f368322d;
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                        arrayList8.add(0);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(view10, arrayList8.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view10.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(view10, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        break;
                    }
                }
                android.view.View view11 = q0Var.f368322d;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view11, arrayList9.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                break;
            case 8:
                if (!this.f368330m) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal10 = zj0.c.f473285a;
                    arrayList10.add(8);
                    java.util.Collections.reverse(arrayList10);
                    view = view2;
                    yj0.a.d(view2, arrayList10.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                } else {
                    view = view2;
                    ((com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView) view).setData(r0Var.f97325n);
                    break;
                }
            default:
                view = view2;
                break;
        }
        if (view instanceof com.tencent.mm.plugin.downloader_app.ui.TaskItemView) {
            ((com.tencent.mm.plugin.downloader_app.ui.TaskItemView) view).setOnItemOpButtonClickListener(this.f368331n);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.content.Context context = this.f368325e;
        android.view.View view = new android.view.View(context);
        switch (i17) {
            case 1:
            case 3:
            case 5:
                view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a4m, viewGroup, false);
                break;
            case 2:
            case 4:
            case 6:
                view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a4o, viewGroup, false);
                break;
            case 7:
                view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a4l, viewGroup, false);
                break;
            case 8:
                view = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a4j, viewGroup, false);
                break;
        }
        return new r02.q0(view);
    }

    public void x(java.util.LinkedList linkedList) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            return;
        }
        int size = linkedList.size();
        m43.e eVar = this.f368324d;
        if (size != 1) {
            eVar.removeAll(linkedList);
            com.tencent.mm.ipcinvoker.w0.c(true, new r02.p0(this));
        } else {
            int indexOf = eVar.indexOf(linkedList.get(0));
            eVar.remove(indexOf);
            com.tencent.mm.ipcinvoker.w0.c(true, new r02.o0(this, indexOf));
        }
    }
}
