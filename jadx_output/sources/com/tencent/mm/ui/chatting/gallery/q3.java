package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f201292a;

    /* renamed from: b, reason: collision with root package name */
    public int f201293b;

    /* renamed from: c, reason: collision with root package name */
    public int f201294c;

    /* renamed from: d, reason: collision with root package name */
    public float f201295d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f201296e;

    public q3(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f201292a = new android.util.SparseArray();
        this.f201293b = -1;
        this.f201294c = -1;
        this.f201296e = true;
    }

    public static final java.lang.Object a(com.tencent.mm.ui.chatting.gallery.q3 q3Var, yz5.l func) {
        kotlin.jvm.internal.o.g(func, "func");
        if (q3Var != null) {
            com.tencent.mm.ui.chatting.gallery.g4 g4Var = (com.tencent.mm.ui.chatting.gallery.g4) q3Var.f201292a.get(q3Var.f201293b);
            if (g4Var != null) {
                return func.invoke(g4Var);
            }
        }
        return null;
    }

    public static final void b(com.tencent.mm.ui.chatting.gallery.q3 q3Var, yz5.p func, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(func, "func");
        if (q3Var != null) {
            com.tencent.mm.ui.chatting.gallery.g4 g4Var = (com.tencent.mm.ui.chatting.gallery.g4) q3Var.f201292a.get(q3Var.f201293b);
            if (g4Var != null) {
                func.invoke(g4Var, obj);
            }
        }
    }

    public static final void c(com.tencent.mm.ui.chatting.gallery.q3 q3Var, yz5.q func, java.lang.Object obj, java.lang.Object obj2) {
        kotlin.jvm.internal.o.g(func, "func");
        if (q3Var != null) {
            com.tencent.mm.ui.chatting.gallery.g4 g4Var = (com.tencent.mm.ui.chatting.gallery.g4) q3Var.f201292a.get(q3Var.f201293b);
            if (g4Var != null) {
                func.invoke(g4Var, obj, obj2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(yz5.l reportFunc) {
        kz5.p0 p0Var;
        kotlin.jvm.internal.o.g(reportFunc, "reportFunc");
        com.tencent.mm.ui.chatting.gallery.g4 g4Var = (com.tencent.mm.ui.chatting.gallery.g4) this.f201292a.get(this.f201293b);
        if (g4Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("pic_video_close");
            arrayList.add("pic_video_save");
            arrayList.add("pic_video_three_dot");
            arrayList.add("pic_video_forward");
            arrayList.add("pic_video_wall");
            com.tencent.mm.ui.chatting.gallery.r3 r3Var = g4Var.f200950e;
            p0Var = arrayList;
            if (r3Var != null) {
                if (r3Var.f201322c) {
                    arrayList.add("video_speed");
                    arrayList.add("video_play_btn");
                } else {
                    if (r3Var.f201324e) {
                        arrayList.add("pic_video_read_origin");
                    }
                    if (r3Var.f201323d) {
                        arrayList.add("pic_video_miniapp");
                    }
                }
                p0Var = arrayList;
                if (r3Var.f201327h) {
                    arrayList.add("pic_video_full_image");
                    p0Var = arrayList;
                }
            }
        } else {
            p0Var = kz5.p0.f313996d;
        }
        java.util.Iterator<E> it = p0Var.iterator();
        while (it.hasNext()) {
            reportFunc.invoke(it.next());
        }
    }

    public final void e(float f17, boolean z17) {
        if (this.f201294c < 0) {
            this.f201294c = this.f201293b;
            this.f201295d = f17;
        }
        if (java.lang.Math.abs(f17 - this.f201295d) > 0.95d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryOPLayer", "updatePageScrollInfo: skip " + this.f201295d + ", " + f17);
            return;
        }
        float f18 = z17 ? 1.0f - f17 : f17;
        int i17 = this.f201294c;
        android.util.SparseArray sparseArray = this.f201292a;
        com.tencent.mm.ui.chatting.gallery.g4 g4Var = (com.tencent.mm.ui.chatting.gallery.g4) sparseArray.get(i17);
        if (g4Var != null) {
            g4Var.f200946a.f265404a.setAlpha(java.lang.Math.max((2 * f18) - 1.0f, 0.0f));
        }
        if (z17) {
            com.tencent.mm.ui.chatting.gallery.g4 g4Var2 = (com.tencent.mm.ui.chatting.gallery.g4) sparseArray.get(this.f201294c + 1);
            if (g4Var2 != null) {
                g4Var2.f200946a.f265404a.setAlpha(java.lang.Math.max(1.0f - (f18 * 2), 0.0f));
            }
        } else {
            com.tencent.mm.ui.chatting.gallery.g4 g4Var3 = (com.tencent.mm.ui.chatting.gallery.g4) sparseArray.get(this.f201294c - 1);
            if (g4Var3 != null) {
                g4Var3.f200946a.f265404a.setAlpha(java.lang.Math.max(1.0f - (f18 * 2), 0.0f));
            }
        }
        this.f201295d = f17;
    }
}
