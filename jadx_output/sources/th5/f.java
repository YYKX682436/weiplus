package th5;

/* loaded from: classes12.dex */
public final class f extends lf3.n implements qf3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        int i17;
        int i18;
        mf3.k oVar;
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs bizPhotoAccountGalleryArgs = (com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs) b3.q.a(intent, "biz_photo_account_gallery_args", com.tencent.mm.feature.gallery.api.BizPhotoAccountGalleryArgs.class);
        if (bizPhotoAccountGalleryArgs != null) {
            java.util.List list = bizPhotoAccountGalleryArgs.f67089d;
            if (!list.isEmpty()) {
                mf3.f fVar = new mf3.f();
                java.util.Iterator it = list.iterator();
                java.lang.String str = null;
                int i19 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    int i27 = bizPhotoAccountGalleryArgs.f67090e;
                    if (!hasNext) {
                        int d17 = fVar.d() - 1;
                        if (d17 < 0) {
                            d17 = 0;
                        }
                        int f17 = e06.p.f(i27, 0, d17);
                        if (str == null && fVar.d() > 0) {
                            str = ((mf3.k) fVar.get(0)).getId();
                        }
                        if (str != null) {
                            ((lf3.c0) listener).Y6(str);
                        }
                        ((lf3.c0) listener).X6(fVar, true);
                        listener.T3(f17);
                        return true;
                    }
                    java.lang.Object next = it.next();
                    int i28 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mm.feature.gallery.api.BizPhotoGalleryImageEntry bizPhotoGalleryImageEntry = (com.tencent.mm.feature.gallery.api.BizPhotoGalleryImageEntry) next;
                    if (bizPhotoGalleryImageEntry.f67097f) {
                        i17 = i27;
                        i18 = i19;
                        oVar = new th5.q(i19, bizPhotoGalleryImageEntry.f67095d, bizPhotoGalleryImageEntry.f67096e, bizPhotoGalleryImageEntry.f67098g, bizPhotoGalleryImageEntry.f67099h, bizPhotoGalleryImageEntry.f67100i, bizPhotoAccountGalleryArgs.f67094i);
                    } else {
                        i17 = i27;
                        i18 = i19;
                        oVar = new th5.o(i18, bizPhotoGalleryImageEntry.f67095d, bizPhotoGalleryImageEntry.f67096e, bizPhotoGalleryImageEntry.f67099h, bizPhotoAccountGalleryArgs.f67094i);
                    }
                    fVar.add(oVar);
                    if (i18 == i17) {
                        str = oVar.getId();
                    }
                    i19 = i28;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BizPhotoAccountDataProvider", "fetch failed: no args");
        return false;
    }
}
