package kp4;

/* loaded from: classes5.dex */
public final class z extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f311161d;

    /* renamed from: e, reason: collision with root package name */
    public final kp4.n0 f311162e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f311163f;

    /* renamed from: g, reason: collision with root package name */
    public int f311164g;

    public z(java.util.List segmentClipDataList, kp4.n0 onItemSelectedListener) {
        kotlin.jvm.internal.o.g(segmentClipDataList, "segmentClipDataList");
        kotlin.jvm.internal.o.g(onItemSelectedListener, "onItemSelectedListener");
        this.f311161d = segmentClipDataList;
        this.f311162e = onItemSelectedListener;
        this.f311163f = "MicroMsg.MediaThumb.Adapter";
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f311161d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.String r17;
        kp4.b0 holder = (kp4.b0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        boolean z17 = i17 == this.f311164g;
        bg0.y segmentClipData = (bg0.y) this.f311161d.get(i17);
        kotlin.jvm.internal.o.g(segmentClipData, "segmentClipData");
        holder.getAdapterPosition();
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = segmentClipData.f19869e;
        if (galleryItem$MediaItem != null) {
            e60.n1 n1Var = (e60.n1) i95.n0.c(e60.n1.class);
            android.widget.ImageView imageView = holder.f311090g;
            int type = galleryItem$MediaItem.getType();
            java.lang.String o17 = galleryItem$MediaItem.o();
            java.lang.String str = galleryItem$MediaItem.f138430e;
            long j17 = galleryItem$MediaItem.f138434i;
            kp4.a0 a0Var = new kp4.a0(holder);
            num = 0;
            long j18 = galleryItem$MediaItem.f138435m;
            ((d60.i0) n1Var).getClass();
            e33.m6.b(imageView, type, o17, str, j17, -1, a0Var, j18);
        } else {
            num = 0;
        }
        float f17 = holder.f311094n;
        android.view.View view = holder.f311091h;
        if (view != null) {
            view.setOutlineProvider(new zl5.a(false, true, f17));
        }
        if (view != null) {
            view.setClipToOutline(true);
        }
        boolean z18 = galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
        android.view.View view2 = holder.f311087d;
        if (z18) {
            android.view.View view3 = holder.f311091h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            java.lang.Integer num3 = num;
            arrayList.add(num3);
            java.util.Collections.reverse(arrayList);
            num2 = num3;
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r17 = i65.a.r(view2.getContext(), com.tencent.mm.R.string.f490424ul);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
        } else {
            num2 = num;
            android.view.View view4 = holder.f311091h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            r17 = i65.a.r(view2.getContext(), com.tencent.mm.R.string.f490411u8);
            kotlin.jvm.internal.o.f(r17, "getString(...)");
        }
        view2.setContentDescription(r17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(0);
        gradientDrawable.setCornerRadii(new float[]{f17, f17, f17, f17, f17, f17, f17, f17});
        int i18 = holder.f311092i;
        if (i18 > 0) {
            gradientDrawable.setStroke(i18, holder.f311093m);
        }
        holder.f311089f.setBackground(gradientDrawable);
        if (z17) {
            android.view.View view5 = holder.f311089f;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(num2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view6 = holder.f311089f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbViewHolder", "bind", "(Lcom/tencent/mm/feature/vlog/api/ISegmentClipService$SegmentClipData;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.cjc, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        kp4.b0 b0Var = new kp4.b0(inflate);
        inflate.setOnClickListener(new kp4.y(this, b0Var));
        return b0Var;
    }
}
