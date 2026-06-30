package e33;

/* loaded from: classes10.dex */
public class t2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f247471d;

    /* renamed from: e, reason: collision with root package name */
    public final e33.u2 f247472e;

    /* renamed from: f, reason: collision with root package name */
    public final e33.s2 f247473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f247474g;

    public t2(e33.v2 v2Var, e33.u2 u2Var, java.lang.String str, e33.s2 s2Var) {
        this.f247474g = v2Var;
        this.f247471d = str;
        this.f247472e = u2Var;
        this.f247473f = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImageAdapter$VideoItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        e33.s2 s2Var = this.f247473f;
        if (s2Var != null) {
            e33.n3$$a n3__a = (e33.n3$$a) s2Var;
            n3__a.getClass();
            int i17 = com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.f138572k2;
            n3__a.f247384a.W6();
        }
        if (!com.tencent.mm.vfs.w6.j(this.f247471d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageAdapter", "File doesn't exists anymore");
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImageAdapter$VideoItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: e33.t2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    final boolean z17;
                    rs0.q a17;
                    final e33.t2 t2Var = e33.t2.this;
                    t2Var.getClass();
                    try {
                        a17 = rs0.r.f399316a.a(t2Var.f247471d);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ImageAdapter", "get color space fail", e17);
                    }
                    if (a17 != null) {
                        int i18 = a17.f399314c;
                        if (i18 == 7 || i18 == 6) {
                            z17 = true;
                            t2Var.f247474g.f247514y.post(new java.lang.Runnable() { // from class: e33.t2$$b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    e33.t2 t2Var2 = e33.t2.this;
                                    e33.u2 u2Var = t2Var2.f247472e;
                                    if (z17) {
                                        u2Var.f247488f.h();
                                    } else {
                                        u2Var.f247488f.h();
                                    }
                                    u2Var.f247488f.setVideoPath(t2Var2.f247471d);
                                }
                            });
                        }
                    }
                    z17 = false;
                    t2Var.f247474g.f247514y.post(new java.lang.Runnable() { // from class: e33.t2$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            e33.t2 t2Var2 = e33.t2.this;
                            e33.u2 u2Var = t2Var2.f247472e;
                            if (z17) {
                                u2Var.f247488f.h();
                            } else {
                                u2Var.f247488f.h();
                            }
                            u2Var.f247488f.setVideoPath(t2Var2.f247471d);
                        }
                    });
                }
            });
            yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImageAdapter$VideoItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
