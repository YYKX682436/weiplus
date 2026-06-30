package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class k5 implements db5.x7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201144a;

    public k5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI) {
        this.f201144a = imageGalleryUI;
    }

    @Override // db5.x7
    public boolean a(android.view.MotionEvent motionEvent) {
        sy3.c cVar = this.f201144a.f200639n3;
        if (cVar != null) {
            return ((kz3.l) cVar).e(motionEvent);
        }
        return false;
    }
}
