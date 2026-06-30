package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes14.dex */
public class y5 extends wa5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201577b;

    public y5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201577b = imageGalleryUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wa5.a, android.app.SharedElementCallback
    public android.os.Parcelable onCaptureSharedElementSnapshot(android.view.View view, android.graphics.Matrix matrix, android.graphics.RectF rectF) {
        if (view instanceof ya5.a) {
            ((ya5.a) view).q();
        }
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // wa5.a, android.app.SharedElementCallback
    public void onMapSharedElements(java.util.List list, java.util.Map map) {
        java.util.List<android.util.Pair> a17;
        if (list != null && map != null) {
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201577b;
            android.view.View selectedView = imageGalleryUI.f200637n.getSelectedView();
            wa5.d dVar = wa5.d.f444315a;
            map.clear();
            if (selectedView != null && (a17 = wa5.e.a(selectedView)) != null) {
                for (android.util.Pair pair : a17) {
                    if (list.contains(pair.second)) {
                        java.lang.Object second = pair.second;
                        kotlin.jvm.internal.o.f(second, "second");
                        java.lang.Object first = pair.first;
                        kotlin.jvm.internal.o.f(first, "first");
                        map.put(second, first);
                    }
                }
            }
        }
        super.onMapSharedElements(list, map);
    }
}
