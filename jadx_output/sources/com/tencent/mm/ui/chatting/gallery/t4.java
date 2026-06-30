package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class t4 extends com.tencent.mm.ui.chatting.gallery.e implements com.tencent.mm.sdk.platformtools.a4, wf0.u1, c01.i {

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f201399e;

    /* renamed from: f, reason: collision with root package name */
    public final c01.k f201400f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f201401g;

    public t4(com.tencent.mm.ui.chatting.gallery.k1 k1Var) {
        super(k1Var);
        this.f201401g = false;
        this.f201399e = new java.util.HashMap();
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().b(this, android.os.Looper.getMainLooper());
        this.f201400f = new c01.k();
    }

    @Override // c01.i
    public void P0() {
    }

    @Override // c01.i
    public void U5() {
    }

    @Override // c01.i
    public void V3() {
    }

    @Override // c01.i
    public void g3() {
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        java.util.HashMap hashMap;
        com.tencent.mm.ui.chatting.gallery.p8 p8Var;
        com.tencent.mm.storage.f9 f9Var;
        t21.v2 p17;
        java.lang.String str = r1Var.f445529a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (hashMap = this.f201399e) == null || (p8Var = (com.tencent.mm.ui.chatting.gallery.p8) hashMap.get(str)) == null || (f9Var = p8Var.f201269a) == null || f9Var.z0() == null || !f9Var.z0().equals(str) || (p17 = p(f9Var)) == null) {
            return;
        }
        if (f9Var.z2() || p17.f415011i == 198) {
            if (q(p8Var)) {
                dp.a.makeText(this.f200886d.f201092g, com.tencent.mm.R.string.k78, 0).show();
                return;
            }
            return;
        }
        int g17 = t21.d3.g(p17);
        int i17 = p8Var.f201270b;
        com.tencent.mm.ui.chatting.gallery.ta k17 = k(i17);
        if (this.f200886d.f201092g.I7() == i17 && k17 != null) {
            k17.c();
            k17.f201431i.setVisibility(0);
            k17.c();
            k17.f201431i.setProgress(g17);
        } else if (k17 == null) {
            return;
        }
        k17.d();
        if (g17 >= k17.f201431i.getMax() && q(p8Var)) {
            r(f9Var, k17);
        }
    }

    @Override // com.tencent.mm.ui.chatting.gallery.e
    public boolean i(com.tencent.mm.ui.chatting.gallery.ta taVar, com.tencent.mm.storage.f9 f9Var, int i17) {
        super.i(taVar, f9Var, i17);
        android.graphics.Bitmap a17 = com.tencent.mm.sdk.platformtools.j.a(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false), 1.0f);
        java.util.HashMap hashMap = this.f201399e;
        if (hashMap != null) {
            hashMap.put(f9Var.z0(), new com.tencent.mm.ui.chatting.gallery.p8(f9Var, i17));
        }
        t(taVar, false);
        taVar.c();
        android.view.View view = (android.view.View) taVar.f201428f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        taVar.c();
        taVar.f201429g.setImageBitmap(a17);
        taVar.c();
        taVar.f201429g.setVisibility(0);
        taVar.c();
        android.view.View view2 = taVar.f201432j;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "filling", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Lcom/tencent/mm/storage/MsgInfo;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        taVar.f201432j.setTag(h17);
        r45.uf6 uf6Var = h17 == null ? null : h17.E;
        if (uf6Var == null) {
            taVar.f201433k.setVisibility(8);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(uf6Var.f387333d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGallerySightHandler", " there is no attachurl, show more info btn");
            java.lang.String str = uf6Var.f387335f;
            java.lang.String str2 = uf6Var.f387336g;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                taVar.f201433k.setVisibility(8);
            } else {
                taVar.f201433k.setText(str);
                taVar.f201433k.setVisibility(0);
                taVar.f201433k.setTag(f9Var);
            }
        } else {
            taVar.f201433k.setVisibility(0);
            taVar.f201433k.setText(this.f200886d.f201092g.getString(com.tencent.mm.R.string.j8h, java.lang.Integer.valueOf(uf6Var.f387334e)));
            java.lang.String string = this.f200886d.f201092g.getString(com.tencent.mm.R.string.j8h);
            if (uf6Var.f387334e / 60 > 0) {
                string = string + this.f200886d.f201092g.getString(com.tencent.mm.R.string.j8j, java.lang.Integer.valueOf(uf6Var.f387334e / 60));
            }
            if (uf6Var.f387334e % 60 > 0) {
                string = string + this.f200886d.f201092g.getString(com.tencent.mm.R.string.j8k, java.lang.Integer.valueOf(uf6Var.f387334e % 60));
            }
            taVar.f201433k.setText(string + this.f200886d.f201092g.getString(com.tencent.mm.R.string.j8i));
            taVar.f201433k.setTag(f9Var);
        }
        taVar.c();
        if (!(taVar.f201428f instanceof com.tencent.mm.pluginsdk.ui.tools.VideoSightView)) {
            return true;
        }
        android.widget.TextView textView = taVar.f201433k;
        taVar.c();
        com.tencent.mm.pluginsdk.ui.tools.v7.a(textView, (com.tencent.mm.pluginsdk.ui.tools.VideoSightView) taVar.f201428f);
        return true;
    }

    public final void n(t21.v2 v2Var, com.tencent.mm.ui.chatting.gallery.ta taVar) {
        if (v2Var == null) {
            return;
        }
        t21.d3.B(v2Var.d());
        taVar.c();
        taVar.f201431i.setVisibility(0);
        taVar.c();
        taVar.f201431i.setProgress(t21.d3.g(v2Var));
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().b(this, android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.ui.chatting.gallery.ta v17;
        com.tencent.mm.ui.chatting.gallery.k1 k1Var = this.f200886d;
        if (k1Var == null || (v17 = k1Var.v()) == null || v17.f201427e == null) {
            return false;
        }
        v17.c();
        if (v17.f201427e.getVisibility() != 0) {
            return false;
        }
        t(v17, true);
        return false;
    }

    public t21.v2 p(com.tencent.mm.storage.f9 f9Var) {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        return t21.d3.h(z07);
    }

    public final boolean q(com.tencent.mm.ui.chatting.gallery.p8 p8Var) {
        if (p8Var == null) {
            return false;
        }
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(this);
        int I7 = this.f200886d.f201092g.I7();
        int i17 = p8Var.f201270b;
        if (I7 != i17) {
            this.f200886d.f201098p.m(i17);
            return false;
        }
        com.tencent.mm.ui.chatting.gallery.ta k17 = k(i17);
        if (k17 == null) {
            return true;
        }
        k17.c();
        k17.f201431i.setVisibility(8);
        return true;
    }

    public final void r(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.gallery.ta taVar) {
        if (this.f201401g) {
            return;
        }
        taVar.c();
        android.view.View view = taVar.f201432j;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false);
        ((rq3.k) ((cc0.l) i95.n0.c(cc0.l.class))).fj(rj6, f9Var.getMsgId(), 3);
        if (f9Var.z2()) {
            dp.a.makeText(this.f200886d.f201092g, com.tencent.mm.R.string.k78, 0).show();
            return;
        }
        if (rj6 == null || !com.tencent.mm.vfs.w6.j(rj6)) {
            dp.a.makeText(this.f200886d.f201092g, com.tencent.mm.R.string.k78, 0).show();
            return;
        }
        this.f200886d.f201092g.getContext().getWindow().addFlags(128);
        java.lang.Boolean bool = (java.lang.Boolean) taVar.f201426d.get(rj6);
        if (bool == null || !bool.booleanValue()) {
            taVar.c();
            ((android.view.View) taVar.f201428f).setTag(rj6);
            taVar.c();
            taVar.f201430h.setVisibility(8);
            taVar.c();
            taVar.f201428f.stop();
            if (this.f200886d.f201092g.M7(f9Var.getMsgId()) == 3) {
                taVar.c();
                taVar.f201428f.setMute(true);
            } else {
                taVar.c();
                taVar.f201428f.setMute(false);
            }
            taVar.c();
            if (taVar.f201428f instanceof com.tencent.mm.pluginsdk.ui.tools.VideoSightView) {
                taVar.c();
                ((com.tencent.mm.pluginsdk.ui.tools.VideoSightView) taVar.f201428f).setIsAdVideo(com.tencent.mm.ui.chatting.gallery.k1.E(f9Var));
            }
            taVar.c();
            taVar.f201428f.setVideoPath(rj6);
            taVar.c();
            if (taVar.f201428f.c(this.f200886d.f201092g.getContext(), false)) {
                taVar.c();
                android.view.View view2 = (android.view.View) taVar.f201428f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                taVar.c();
                taVar.f201429g.setVisibility(8);
            } else {
                taVar.c();
                taVar.f201430h.setVisibility(0);
                taVar.c();
                taVar.f201430h.setOnClickListener(new com.tencent.mm.ui.chatting.gallery.s4(this, taVar));
                taVar.c();
                android.view.View view3 = (android.view.View) taVar.f201428f;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                taVar.c();
                taVar.f201429g.setVisibility(0);
            }
            this.f201400f.c(this);
        }
        taVar.c();
        android.view.View view4 = (android.view.View) taVar.f201428f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", com.tencent.tav.core.AssetExtension.SCENE_PLAY, "(Lcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void s() {
        android.util.SparseArray sparseArray = this.f200886d.f228471f;
        for (int i17 = 0; i17 < sparseArray.size(); i17++) {
            int keyAt = sparseArray.keyAt(i17);
            if (sparseArray.get(keyAt) != null && ((android.view.View) sparseArray.get(keyAt)).getTag() != null) {
                com.tencent.mm.ui.chatting.gallery.ta taVar = (com.tencent.mm.ui.chatting.gallery.ta) ((android.view.View) sparseArray.get(keyAt)).getTag();
                if (taVar.f201427e != null) {
                    taVar.c();
                    if (taVar.f201427e.getVisibility() == 0) {
                        taVar.c();
                        taVar.f201428f.setVideoCallback(null);
                        taVar.c();
                        if (((android.view.View) taVar.f201428f).getVisibility() == 0) {
                            t(taVar, false);
                            taVar.c();
                            if (taVar.f201428f != null) {
                                taVar.c();
                                taVar.f201428f.stop();
                            }
                            this.f201400f.a();
                            this.f200886d.f201092g.getContext().getWindow().clearFlags(128);
                        }
                    }
                }
            }
        }
    }

    public void t(com.tencent.mm.ui.chatting.gallery.ta taVar, boolean z17) {
        if (taVar == null) {
            return;
        }
        taVar.c();
        taVar.f201431i.setVisibility(8);
        if (z17) {
            taVar.c();
            taVar.f201429g.setVisibility(8);
            taVar.c();
            android.view.View view = (android.view.View) taVar.f201428f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        taVar.c();
        taVar.f201429g.setVisibility(0);
        taVar.c();
        android.view.View view2 = (android.view.View) taVar.f201428f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGallerySightHandler", "switchState", "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
