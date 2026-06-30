package lp4;

/* loaded from: classes5.dex */
public final class j0 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f320363f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView f320364g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f320365h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f320366i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.RectF f320367m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.RectF f320368n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        android.view.View findViewById = parent.findViewById(com.tencent.mm.R.id.gws);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f320363f = findViewById;
        android.view.View findViewById2 = parent.findViewById(com.tencent.mm.R.id.cmy);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView timelineEditorDragRectView = (com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView) findViewById2;
        this.f320364g = timelineEditorDragRectView;
        this.f320365h = parent.getContext();
        android.view.View findViewById3 = parent.findViewById(com.tencent.mm.R.id.gwk);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f320366i = findViewById3;
        this.f320367m = new android.graphics.RectF(0.0f, 0.0f, i65.a.B(r3) * 1.0f, i65.a.k(r3) * 1.0f);
        this.f320368n = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);
        findViewById.setOnClickListener(this);
        android.view.View findViewById4 = timelineEditorDragRectView.findViewById(com.tencent.mm.R.id.o86);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        new yt3.q((android.widget.ImageView) findViewById4, status).f465333e = "HalfScreenBack";
        timelineEditorDragRectView.findViewById(com.tencent.mm.R.id.d8o).setOnClickListener(new lp4.h0(this));
        findViewById3.setOnClickListener(new lp4.i0(status));
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView timelineEditorDragRectView = this.f320364g;
        if (timelineEditorDragRectView.getVisibility() != 0 || this.f320366i.getVisibility() != 0) {
            return false;
        }
        timelineEditorDragRectView.setVisibility(4);
        android.view.View view = this.f320363f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onBackPress", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onBackPress", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ju3.d0.k(this.f465332d, ju3.c0.C2, null, 2, null);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.gws) {
            ju3.d0.k(this.f465332d, ju3.c0.B2, null, 2, null);
            android.view.View view2 = this.f320363f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f320364g.setVisibility(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/timelineeditor/TimelineEditorHalfScreenPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
