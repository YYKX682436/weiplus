package im3;

/* loaded from: classes10.dex */
public final class l extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c58;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        im3.j item = (im3.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.f487295o70);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f484139d55);
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = item.f292704m;
        if (i18 == 1) {
            e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
            kotlin.jvm.internal.o.d(imageView);
            int type = galleryItem$MediaItem != null ? galleryItem$MediaItem.getType() : 0;
            java.lang.String o17 = galleryItem$MediaItem != null ? galleryItem$MediaItem.o() : null;
            java.lang.String str = o17 == null ? "" : o17;
            java.lang.String str2 = galleryItem$MediaItem != null ? galleryItem$MediaItem.f138430e : null;
            if (str2 == null) {
                str2 = "";
            }
            ((o23.i) b1Var).Ai(imageView, type, str, str2, galleryItem$MediaItem != null ? galleryItem$MediaItem.f138434i : 0L, galleryItem$MediaItem != null ? galleryItem$MediaItem.f138435m : 0L);
            textView.setVisibility(8);
        } else if (i18 == 2) {
            t23.i1 i1Var = (t23.i1) i95.n0.c(t23.i1.class);
            java.lang.String o18 = galleryItem$MediaItem != null ? galleryItem$MediaItem.o() : null;
            java.lang.String str3 = galleryItem$MediaItem != null ? galleryItem$MediaItem.f138430e : null;
            long j17 = galleryItem$MediaItem != null ? galleryItem$MediaItem.f138434i : 0L;
            long j18 = galleryItem$MediaItem != null ? galleryItem$MediaItem.f138435m : 0L;
            ((t23.r0) i1Var).getClass();
            android.graphics.Bitmap g17 = t23.p0.h().g(o18, str3, j17, null, j18);
            kotlin.jvm.internal.o.f(g17, "getGalleryBitmapFromMemory(...)");
            if (g17.isRecycled()) {
                imageView.setImageResource(com.tencent.mm.R.drawable.ccy);
            } else {
                imageView.setImageBitmap(g17);
            }
            if (galleryItem$MediaItem instanceof com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) {
                kotlin.jvm.internal.o.e(galleryItem$MediaItem, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem");
                textView.setText(n(((com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem).f138446x / 1000));
                textView.setVisibility(0);
            }
        } else if (i18 == 3 && (finderObject = item.f292700f.f380365f) != null && (objectDesc = finderObject.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) != null) {
            java.lang.String str4 = finderMedia.getThumbUrl() + finderMedia.getThumb_url_token();
            o11.f fVar = new o11.f();
            fVar.f342077a = true;
            fVar.f342079c = true;
            fVar.f342091o = com.tencent.mm.R.drawable.ccy;
            n11.a.b().h(str4, imageView, fVar.a());
            textView.setText(n(finderMedia.getVideoDuration()));
            textView.setVisibility(0);
        }
        if (item.f292703i) {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.mib);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p18 = holder.p(com.tencent.mm.R.id.mib);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final java.lang.String n(int i17) {
        java.lang.String valueOf = java.lang.String.valueOf(i17 % 60);
        if (valueOf.length() < 2) {
            valueOf = "0".concat(valueOf);
        }
        return (i17 / 60) + ':' + valueOf;
    }
}
