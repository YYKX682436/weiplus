package yt3;

/* loaded from: classes3.dex */
public final class u0 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f465686d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465687e;

    public u0(android.widget.ImageView view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465686d = view;
        this.f465687e = status;
        view.setVisibility(0);
        view.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_clip, -1));
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditPhotoCropPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0.k(this.f465687e, ju3.c0.H1, null, 2, null);
        nu3.i iVar = nu3.i.f340218a;
        iVar.b(10);
        nu3.i.c(iVar, "KEY_CLICK_CROP_COUNT_INT", 0, 2, null);
        android.widget.ImageView imageView = this.f465686d;
        imageView.announceForAccessibility(i65.a.r(imageView.getContext(), com.tencent.mm.R.string.f489966gv));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditPhotoCropPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465686d.setVisibility(i17);
    }
}
