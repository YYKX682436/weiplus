package iw2;

/* loaded from: classes10.dex */
public final class b implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView f295229d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f295230e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f295231f;

    public b(com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f295229d = view;
        this.f295230e = status;
        android.content.Context context = view.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(i65.a.r(context, com.tencent.mm.R.string.hug));
        arrayList.add(i65.a.r(context, com.tencent.mm.R.string.huf));
        view.f130792e.addAll(arrayList);
        view.f130794g.notifyDataSetChanged();
        view.setSelectChangeListener(new iw2.a(this));
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (i17 == 0) {
            sa5.d.c(this.f295229d, 0.0f, 0L, null, 7, null);
        } else {
            sa5.d.d(this.f295229d, 0, 0L, null, 7, null);
        }
    }
}
