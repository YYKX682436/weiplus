package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class la implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ma f201183d;

    public la(com.tencent.mm.ui.chatting.gallery.ma maVar) {
        this.f201183d = maVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.ma maVar = this.f201183d;
        android.view.View view = maVar.f201202d.f201432j;
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        if (maVar.f201202d.f201432j.getTag() != null && (maVar.f201202d.f201432j.getTag() instanceof t21.v2)) {
            t21.v2 v2Var = (t21.v2) maVar.f201202d.f201432j.getTag();
            r45.uf6 uf6Var = v2Var.E;
            if (uf6Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(uf6Var.f387333d)) {
                android.view.View view2 = maVar.f201202d.f201432j;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            r45.uf6 uf6Var2 = v2Var.E;
            if (uf6Var2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(uf6Var2.f387335f) && !com.tencent.mm.sdk.platformtools.t8.K0(v2Var.E.f387336g)) {
                android.view.View view3 = maVar.f201202d.f201432j;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
        android.view.View view4 = maVar.f201202d.f201432j;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = maVar.f201202d.f201432j;
        view5.startAnimation(android.view.animation.AnimationUtils.loadAnimation(view5.getContext(), com.tencent.mm.R.anim.f477783bc));
    }
}
