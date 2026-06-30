package yt3;

/* loaded from: classes5.dex */
public final class q extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f465599f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f465600g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.widget.ImageView view, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465599f = view;
        view.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_previous2, -1));
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditBackToRecordPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0.k(this.f465332d, ju3.c0.C, null, 2, null);
        nu3.i iVar = nu3.i.f340218a;
        iVar.b(11);
        iVar.d(12);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditBackToRecordPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465599f.setVisibility(i17);
    }

    public void z(int i17) {
        boolean z17 = this.f465600g;
        android.widget.ImageView imageView = this.f465599f;
        if (z17) {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_back, imageView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8)));
        } else {
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_previous2, i17));
        }
    }
}
