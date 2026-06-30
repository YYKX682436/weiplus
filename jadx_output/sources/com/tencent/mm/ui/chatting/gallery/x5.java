package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class x5 implements db5.z7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f201551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ImageGalleryUI f201552b;

    public x5(com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI, android.view.View view) {
        this.f201552b = imageGalleryUI;
        this.f201551a = view;
    }

    @Override // db5.z7
    public void a(float f17, float f18) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201552b;
        float height = 1.0f - (f18 / imageGalleryUI.f200637n.getHeight());
        float f19 = height <= 1.0f ? height : 1.0f;
        imageGalleryUI.f200684z3 = f19;
        imageGalleryUI.C3 = imageGalleryUI.K7(imageGalleryUI.f200611g, imageGalleryUI.f200637n);
        if (imageGalleryUI.C3 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageGalleryUI", "runDragAnimation contentView is null !!");
            return;
        }
        boolean z17 = false;
        if (f17 == 0.0f && f18 == 0.0f) {
            if (imageGalleryUI.o8() && imageGalleryUI.f200628k4) {
                try {
                    com.tencent.mm.ui.chatting.gallery.ta v17 = imageGalleryUI.f200611g.v();
                    v17.d();
                    if (v17.f201437o.getVisibility() == 8) {
                        com.tencent.mm.ui.chatting.gallery.ta v18 = imageGalleryUI.f200611g.v();
                        v18.d();
                        v18.f201437o.setVisibility(0);
                        imageGalleryUI.f200628k4 = false;
                        ((vf0.c) i95.n0.c(vf0.c.class)).getClass();
                        com.tencent.mm.ui.chatting.gallery.ta v19 = imageGalleryUI.f200611g.v();
                        v19.d();
                        v19.f201437o.setVisibility(8);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
            if (imageGalleryUI.f200632l4) {
                imageGalleryUI.o9(false);
                imageGalleryUI.f200632l4 = false;
                com.tencent.mm.ui.chatting.gallery.q3.a(imageGalleryUI.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$k0());
            }
            android.view.View view = this.f201551a;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$35", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$35", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (java.lang.Math.abs(f17) > 10.0f || java.lang.Math.abs(f18) > 10.0f) {
                if (imageGalleryUI.o8()) {
                    try {
                        com.tencent.mm.ui.chatting.gallery.ta v27 = imageGalleryUI.f200611g.v();
                        v27.d();
                        if (v27.f201437o.getVisibility() == 0) {
                            com.tencent.mm.ui.chatting.gallery.ta v28 = imageGalleryUI.f200611g.v();
                            v28.d();
                            v28.f201437o.setVisibility(8);
                            imageGalleryUI.f200628k4 = true;
                        }
                    } catch (java.lang.Exception unused2) {
                    }
                }
                if (imageGalleryUI.f200650q.getVisibility() == 0) {
                    imageGalleryUI.k8();
                }
                imageGalleryUI.f200632l4 = true;
                com.tencent.mm.ui.chatting.gallery.q3.a(imageGalleryUI.f200605e3, new com.tencent.mm.ui.chatting.gallery.ImageGalleryUI$$d());
                android.view.View view2 = this.f201551a;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$35", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryUI$35", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            z17 = true;
        }
        imageGalleryUI.C3.setPivotX(imageGalleryUI.f200637n.getWidth() / 2);
        imageGalleryUI.C3.setPivotY(imageGalleryUI.f200637n.getHeight() / 2);
        imageGalleryUI.C3.setScaleX(f19);
        imageGalleryUI.C3.setScaleY(f19);
        imageGalleryUI.C3.setTranslationX(f17);
        imageGalleryUI.C3.setTranslationY(f18);
        imageGalleryUI.W1.setAlpha(f19);
        android.view.View view3 = imageGalleryUI.C3;
        if (view3 instanceof com.tencent.mm.ui.base.WxImageView) {
            ((com.tencent.mm.ui.base.WxImageView) view3).setDrawFullSampleSizeBitmap(z17);
        }
    }

    @Override // db5.z7
    public void b(float f17, float f18) {
        com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = this.f201552b;
        imageGalleryUI.A3 = (int) f17;
        imageGalleryUI.B3 = (int) f18;
    }
}
