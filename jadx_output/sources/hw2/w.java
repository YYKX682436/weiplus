package hw2;

/* loaded from: classes10.dex */
public final class w extends yt3.s3 {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f285576g;

    /* renamed from: h, reason: collision with root package name */
    public final ju3.d0 f285577h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f285578i;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f285579m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.ui.widget.imageview.WeImageView closeImg, ju3.d0 finderRecordStatus, android.view.View view) {
        super(closeImg, finderRecordStatus);
        kotlin.jvm.internal.o.g(closeImg, "closeImg");
        kotlin.jvm.internal.o.g(finderRecordStatus, "finderRecordStatus");
        this.f285576g = closeImg;
        this.f285577h = finderRecordStatus;
        this.f285578i = view;
        android.content.Context context = closeImg.getContext();
        this.f285579m = context;
        closeImg.setContentDescription(i65.a.r(context, com.tencent.mm.R.string.f490008ib));
    }

    @Override // yt3.s3, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordClosePlugin", "RecordClosePlugin close");
        nu3.i iVar = nu3.i.f340218a;
        iVar.d(3);
        iVar.b(3);
        iVar.i(this.f465669f);
        ju3.d0.k(this.f285577h, ju3.c0.S2, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.s3, yt3.r2
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        android.view.View view = this.f285578i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/plugin/FinderRecordClosePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f285576g.setVisibility(i17);
    }
}
