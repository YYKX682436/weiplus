package ph4;

/* loaded from: classes8.dex */
public final class e extends lh4.h implements ph4.f {

    /* renamed from: p, reason: collision with root package name */
    public static final int f354471p = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479714d7);

    /* renamed from: q, reason: collision with root package name */
    public static final int f354472q = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479672c9);

    /* renamed from: m, reason: collision with root package name */
    public final yo0.i f354473m;

    /* renamed from: n, reason: collision with root package name */
    public final ph4.a f354474n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f354475o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(final android.content.Context context, lh4.b callback, int i17) {
        super(context, callback, i17, null, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        yo0.f fVar = new yo0.f();
        fVar.f464078b = true;
        fVar.f464077a = true;
        this.f354473m = fVar.a();
        ph4.d dVar = new ph4.d(this, context);
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(context) { // from class: com.tencent.mm.plugin.taskbar.ui.section.other.TaskBarSectionOtherView$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            /* renamed from: canScrollVertically */
            public boolean getF123307r() {
                return false;
            }
        };
        ph4.a aVar = new ph4.a(this);
        this.f354474n = aVar;
        this.f354475o = kz5.c1.i(new jz5.l(2, new sh4.a(this)), new jz5.l(6, new oh4.n(this)), new jz5.l(21, new nh4.b(this)), new jz5.l(3, new mh4.a(this)), new jz5.l(4, new mh4.a(this)), new jz5.l(22, new qh4.a(this)), new jz5.l(25, new qh4.a(this)));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        int i18 = f354471p - (f354472q / 2);
        layoutParams.setMargins(i18, 0, i18, 0);
        getContainerView().addView(dVar, layoutParams);
        dVar.setLayoutManager(gridLayoutManager);
        dVar.setAdapter(aVar);
        dVar.setOverScrollMode(2);
    }

    @Override // lh4.h
    public boolean b(int i17) {
        int i18 = ((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) getViewModel().f318724d).get(i17)).field_type;
        return (i18 == 6 || i18 == 25 || i18 == 21 || i18 == 22) ? false : true;
    }

    @Override // lh4.h
    public void c() {
        android.widget.TextView title = getTitle();
        if (title != null) {
            title.setText(f());
        }
        this.f354474n.notifyDataSetChanged();
    }

    @Override // lh4.h
    public void d() {
        android.view.ViewGroup.LayoutParams layoutParams = getContainerView().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479688cn);
        getContainerView().setLayoutParams(marginLayoutParams);
    }

    @Override // lh4.h
    public void e(int i17) {
        if (i17 < 0 || i17 >= ((java.util.ArrayList) getViewModel().f318724d).size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionOtherView", "remove item outOfBounds " + i17 + ' ' + ((java.util.ArrayList) getViewModel().f318724d).size());
            return;
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) getViewModel().f318724d).remove(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionOtherView", "remove item " + i17 + ' ' + multiTaskInfo.v0().getString(1) + ' ' + multiTaskInfo.field_id);
        ((gh4.e0) i95.n0.c(gh4.e0.class)).Ni(multiTaskInfo);
        ((gh4.e0) ((gh4.s) i95.n0.c(gh4.s.class))).Ui(multiTaskInfo.field_id, true, 3);
        if (((java.util.ArrayList) getViewModel().f318724d).size() != 0) {
            ph4.a aVar = this.f354474n;
            aVar.notifyItemRemoved(i17);
            aVar.notifyItemRangeChanged(0, aVar.getItemCount(), java.lang.Boolean.TRUE);
        }
        lh4.b callback = getCallback();
        int sectionType = getSectionType();
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) callback;
        if (sectionType != 4 || taskBarView.f172525e2.indexOf(java.lang.Integer.valueOf(sectionType)) == -1 || !((java.util.ArrayList) taskBarView.f172523c2.a(4).f318724d).isEmpty()) {
            taskBarView.postDelayed(new com.tencent.mm.plugin.taskbar.ui.l1(taskBarView, sectionType), taskBarView.E0() ? 200L : 0L);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "other last item removed");
        com.tencent.mm.plugin.taskbar.ui.o2 o2Var = taskBarView.f172523c2;
        o2Var.c(o2Var.a(4));
        taskBarView.l1(4);
    }

    @Override // lh4.h
    public java.lang.String f() {
        int floor = (int) java.lang.Math.floor((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_taskbar_recent_timeout, 3600L) * 1000) / 3600000.0d);
        java.lang.String r17 = i65.a.r(getContext(), floor > 1 ? com.tencent.mm.R.string.f490314rk : com.tencent.mm.R.string.f490315rl);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(floor)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    @Override // lh4.h
    public boolean g(int i17) {
        int i18 = ((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) getViewModel().f318724d).get(i17)).field_type;
        return i18 == 2 || i18 == 4;
    }

    public final yo0.i getThumbLoaderOption() {
        return this.f354473m;
    }
}
