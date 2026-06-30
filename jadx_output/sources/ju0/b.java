package ju0;

/* loaded from: classes5.dex */
public final class b extends eb5.d {

    /* renamed from: g, reason: collision with root package name */
    public int f301680g;

    @Override // eb5.d
    public android.view.View B(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new com.tencent.mm.mj_publisher.finder.image_composing.view.ImageItemView(context);
    }

    @Override // eb5.d
    /* renamed from: y */
    public void onBindViewHolder(eb5.e viewWrapper, int i17) {
        kotlin.jvm.internal.o.g(viewWrapper, "viewWrapper");
        super.onBindViewHolder(viewWrapper, i17);
        com.tencent.mm.mj_publisher.finder.image_composing.view.ImageItemView imageItemView = (com.tencent.mm.mj_publisher.finder.image_composing.view.ImageItemView) viewWrapper.f250924n;
        zu0.a aVar = ((ku0.a) x(i17)).f312060a;
        if (aVar.f475661a.getIdentifierType() == qg.a.Unknown) {
            imageItemView.getPlusView().setVisibility(0);
            imageItemView.getImageView().setImageDrawable(null);
            imageItemView.getImageView().setBackgroundColor(b3.l.getColor(imageItemView.getContext(), com.tencent.mm.R.color.f478514w));
            android.view.View selectedView = imageItemView.getSelectedView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(selectedView, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/adapter/ImageListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/ui/base/adapter/ViewWrapper;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            selectedView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(selectedView, "com/tencent/mm/mj_publisher/finder/image_composing/adapter/ImageListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/ui/base/adapter/ViewWrapper;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        imageItemView.getPlusView().setVisibility(8);
        imageItemView.getImageView().setBackgroundColor(b3.l.getColor(imageItemView.getContext(), com.tencent.mm.R.color.f478553an));
        java.lang.String identifier = aVar.f475661a.getIdentifier();
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ya2.l.f460502a.h(identifier, imageItemView.getImageView(), mn2.f1.B);
        android.view.View selectedView2 = imageItemView.getSelectedView();
        int i18 = i17 == this.f301680g ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(selectedView2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/adapter/ImageListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/ui/base/adapter/ViewWrapper;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        selectedView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(selectedView2, "com/tencent/mm/mj_publisher/finder/image_composing/adapter/ImageListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/ui/base/adapter/ViewWrapper;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // eb5.d, androidx.recyclerview.widget.f2
    /* renamed from: z */
    public void onBindViewHolder(eb5.e holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i17);
        }
    }
}
