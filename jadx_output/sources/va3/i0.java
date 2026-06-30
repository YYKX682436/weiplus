package va3;

/* loaded from: classes12.dex */
public class i0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f434307m = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fyl) + "/api?size=%d*%d&center=%f,%f&zoom=%d&referer=weixin";

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.i6 f434308d = new com.tencent.mm.sdk.platformtools.i6(1, "location_worker", 1);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f434309e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public w25.m f434310f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f434311g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public int f434312h = 300;

    /* renamed from: i, reason: collision with root package name */
    public int f434313i = 300;

    public i0() {
        gm0.j1.d().a(me1.b.CTRL_INDEX, this);
    }

    public static java.lang.String a(w25.m mVar) {
        java.lang.String g17 = kk.k.g((mVar.toString() + "").getBytes());
        java.lang.String str = com.tencent.mm.vfs.q7.c("StaticMap") + '/' + g17.charAt(0) + g17.charAt(1) + "/" + g17.charAt(3) + g17.charAt(4) + "/";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a()) {
                m17.f213266a.r(m17.f213267b);
            }
        }
        return str + "static_map_" + g17;
    }

    public final void b(boolean z17, int i17) {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mars.xlog.Log.i("MicroMsg.StaticMapServer", "httpgetStaticmapDone %b", java.lang.Boolean.valueOf(z17));
        java.util.List list = this.f434311g;
        if (z17) {
            if (this.f434310f != null) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    w25.i iVar = (w25.i) it.next();
                    if (iVar != null) {
                        java.lang.String a17 = a(this.f434310f);
                        w25.m mVar = this.f434310f;
                        va3.g0 g0Var = (va3.g0) iVar;
                        if (mVar != null) {
                            java.util.HashMap hashMap = g0Var.f434290b;
                            long j17 = mVar.f442656d;
                            if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                                com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) g0Var.f434293e.remove((com.tencent.mm.storage.b9) hashMap.get(java.lang.Long.valueOf(j17)));
                                if (f9Var != null && (weakReference = (java.lang.ref.WeakReference) g0Var.f434289a.get(java.lang.Long.valueOf(f9Var.getMsgId()))) != null && weakReference.get() != null) {
                                    java.util.HashMap hashMap2 = g0Var.f434294f;
                                    if (hashMap2.containsKey(java.lang.Long.valueOf(f9Var.getMsgId()))) {
                                        int intValue = ((java.lang.Integer) hashMap2.remove(java.lang.Long.valueOf(f9Var.getMsgId()))).intValue();
                                        boolean z18 = f9Var.A0() == 0;
                                        android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
                                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                                        imageView.setImageBitmap(m11.b1.Di().O2(f9Var.getMsgId(), a17, intValue, g0Var.f434296h, g0Var.f434297i, z18));
                                        java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) g0Var.f434291c.remove(java.lang.Long.valueOf(f9Var.getMsgId()));
                                        if (weakReference2 != null && weakReference2.get() != null) {
                                            ((android.widget.ProgressBar) weakReference2.get()).setVisibility(8);
                                        }
                                        java.lang.ref.WeakReference weakReference3 = (java.lang.ref.WeakReference) g0Var.f434292d.remove(java.lang.Long.valueOf(f9Var.getMsgId()));
                                        if (weakReference3 != null && weakReference3.get() != null) {
                                            ((android.widget.ImageView) weakReference3.get()).setVisibility(0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (this.f434310f != null) {
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            while (it6.hasNext()) {
                w25.i iVar2 = (w25.i) it6.next();
                if (iVar2 != null) {
                    w25.m mVar2 = this.f434310f;
                    va3.g0 g0Var2 = (va3.g0) iVar2;
                    if (mVar2 != null) {
                        java.util.HashMap hashMap3 = g0Var2.f434290b;
                        long j18 = mVar2.f442656d;
                        if (hashMap3.containsKey(java.lang.Long.valueOf(j18))) {
                            com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) g0Var2.f434293e.remove((com.tencent.mm.storage.b9) hashMap3.get(java.lang.Long.valueOf(j18)));
                            if (f9Var2 != null) {
                                if (f9Var2.c2() < 0 || f9Var2.c2() > 5) {
                                    pt0.e0 e0Var = pt0.f0.f358209b1;
                                    if (e0Var.h()) {
                                        com.tencent.mm.storage.i9 a18 = tg3.p1.f419206a.a(f9Var2);
                                        a18.f195030h = 0;
                                        tg3.q1.a(a18, f9Var2);
                                    }
                                    f9Var2.M = 0;
                                    f9Var2.f236178r = true;
                                    int c27 = f9Var2.c2() + 1;
                                    if (e0Var.h()) {
                                        com.tencent.mm.storage.i9 a19 = tg3.p1.f419206a.a(f9Var2);
                                        a19.f195030h = c27;
                                        tg3.q1.a(a19, f9Var2);
                                    }
                                    f9Var2.M = c27;
                                    f9Var2.f236178r = true;
                                    if (gm0.j1.a()) {
                                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var2.getMsgId(), f9Var2, true);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.StaticMapMsgLogic", "on error count %d", java.lang.Integer.valueOf(f9Var2.c2()));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f434310f = null;
        d();
    }

    public void c(w25.i iVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f434311g;
        arrayList.remove(iVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.StaticMapServer", "removeCallback " + arrayList.size());
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StaticMapServer", "clean task");
            this.f434309e.clear();
            this.f434310f = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.StaticMapServer", "stop static map server");
            gm0.j1.d().q(me1.b.CTRL_INDEX, this);
        }
    }

    public final void d() {
        int i17;
        if (this.f434310f == null) {
            java.util.LinkedList linkedList = this.f434309e;
            if (linkedList.size() > 0) {
                this.f434310f = (w25.m) linkedList.removeFirst();
                try {
                    java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("StaticMapGetClient");
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (d17 == null) {
                        d17 = "";
                    }
                    i17 = java.lang.Integer.valueOf(d17).intValue();
                } catch (java.lang.Exception unused) {
                    i17 = 0;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.StaticMapServer", "run local %d", java.lang.Integer.valueOf(i17));
                if (i17 == 0) {
                    w25.m mVar = this.f434310f;
                    gm0.j1.d().g(new va3.z(mVar.f442653a, mVar.f442654b, mVar.f442655c + 1, 0, this.f434312h, this.f434313i, a(mVar), com.tencent.mm.sdk.platformtools.m2.d()));
                    return;
                }
                int i18 = this.f434312h;
                int i19 = this.f434313i;
                while (i18 * i19 > 270000) {
                    i18 = (int) (i18 / 1.2d);
                    i19 = (int) (i19 / 1.2d);
                }
                boolean P0 = com.tencent.mm.sdk.platformtools.t8.P0(com.tencent.mm.sdk.platformtools.x2.f193071a);
                com.tencent.mm.sdk.platformtools.i6 i6Var = this.f434308d;
                if (P0) {
                    i6Var.a(new va3.h0(this, true, java.lang.String.format("https://maps.googleapis.com/maps/api/staticmap?size=%dx%d&center=%f,%f&zoom=%d&format=jpg&language=%s&sensor=true", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Float.valueOf(this.f434310f.f442653a), java.lang.Float.valueOf(this.f434310f.f442654b), java.lang.Integer.valueOf(this.f434310f.f442655c), com.tencent.mm.sdk.platformtools.m2.d()), a(this.f434310f)));
                } else {
                    i6Var.a(new va3.h0(this, false, java.lang.String.format(f434307m, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Float.valueOf(this.f434310f.f442654b), java.lang.Float.valueOf(this.f434310f.f442653a), java.lang.Integer.valueOf(this.f434310f.f442655c)), a(this.f434310f)));
                }
            }
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 648) {
            if (i17 == 0 && i18 == 0 && this.f434310f != null) {
                b(true, i17);
            } else {
                b(false, i17);
            }
        }
    }
}
