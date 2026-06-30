package com.tencent.mm.plugin.finder.video.plugin.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0019\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0006\u001a\u00020\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function1;", "", "Ljz5/f0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSelectChangeListener", "bgDrawable", "setIndicatorBg", "", "isSelectBold", "setSelectToBold", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "jw2/b", "jw2/e", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class RecordTypeSelectView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f130791d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f130792e;

    /* renamed from: f, reason: collision with root package name */
    public int f130793f;

    /* renamed from: g, reason: collision with root package name */
    public final jw2.e f130794g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.video.plugin.view.FinderFilterLayoutManager f130795h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f130796i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f130797m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f130798n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordTypeSelectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f130792e = new java.util.ArrayList();
        jw2.e eVar = new jw2.e(this, context);
        this.f130794g = eVar;
        com.tencent.mm.plugin.finder.video.plugin.view.FinderFilterLayoutManager finderFilterLayoutManager = new com.tencent.mm.plugin.finder.video.plugin.view.FinderFilterLayoutManager(context);
        this.f130795h = finderFilterLayoutManager;
        jw2.b bVar = new jw2.b(this);
        this.f130797m = new jw2.f(this);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489084b83, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mka);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.lpv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f130791d = (android.widget.TextView) findViewById2;
        recyclerView.setLayoutManager(finderFilterLayoutManager);
        recyclerView.setAdapter(eVar);
        bVar.b(recyclerView);
    }

    public final void setIndicatorBg(int i17) {
        this.f130791d.setBackgroundResource(i17);
    }

    public final void setSelectChangeListener(yz5.l lVar) {
        this.f130796i = lVar;
    }

    public final void setSelectToBold(boolean z17) {
        this.f130798n = z17;
    }
}
