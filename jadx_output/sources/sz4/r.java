package sz4;

/* loaded from: classes12.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f414217a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f414218b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f414219c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f414220d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f414221e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText f414222f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText f414223g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f414224h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sz4.t f414225i;

    public r(sz4.t tVar, android.widget.ImageView subItemImg, android.view.View subItemView) {
        kotlin.jvm.internal.o.g(subItemImg, "subItemImg");
        kotlin.jvm.internal.o.g(subItemView, "subItemView");
        this.f414225i = tVar;
        this.f414217a = subItemImg;
        this.f414218b = subItemView;
        this.f414219c = subItemView.findViewById(com.tencent.mm.R.id.nqg);
        this.f414220d = subItemView.findViewById(com.tencent.mm.R.id.nqh);
        this.f414221e = subItemView.findViewById(com.tencent.mm.R.id.nqj);
    }

    public final com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText a() {
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = this.f414223g;
        if (wXRTEditText != null) {
            return wXRTEditText;
        }
        kotlin.jvm.internal.o.o("btnNext");
        throw null;
    }

    public final void b(boolean z17) {
        int i17 = z17 ? 0 : 8;
        android.view.View view = this.f414220d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "showMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "showMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
