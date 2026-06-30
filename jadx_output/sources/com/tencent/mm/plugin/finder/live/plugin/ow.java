package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ow extends com.tencent.mm.plugin.finder.live.plugin.l {
    public int A;
    public final int B;
    public final int C;
    public final int D;
    public volatile boolean E;
    public volatile boolean F;
    public final long G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f113785J;
    public final int K;
    public final long L;
    public final float M;
    public final float N;
    public final int P;
    public final java.util.ArrayList Q;
    public volatile long R;
    public final int[] S;
    public final int T;
    public int U;
    public volatile boolean V;
    public volatile boolean W;
    public com.tencent.mm.sdk.platformtools.a4 X;
    public final jz5.g Y;
    public final java.util.concurrent.ConcurrentLinkedQueue Z;

    /* renamed from: l1, reason: collision with root package name */
    public final jz5.g f113786l1;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f113787p;

    /* renamed from: p0, reason: collision with root package name */
    public final float f113788p0;

    /* renamed from: p1, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f113789p1;

    /* renamed from: q, reason: collision with root package name */
    public final float f113790q;

    /* renamed from: r, reason: collision with root package name */
    public final float f113791r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f113792s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f113793t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.particles.ConfettiSurfaceRenderView f113794u;

    /* renamed from: v, reason: collision with root package name */
    public final zl2.b f113795v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f113796w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f113797x;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.Map f113798x0;

    /* renamed from: y, reason: collision with root package name */
    public java.util.ArrayList f113799y;

    /* renamed from: y0, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.a4 f113800y0;

    /* renamed from: z, reason: collision with root package name */
    public java.util.ArrayList f113801z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(android.view.ViewGroup root, qo0.c statusMonitor, en2.a aVar) {
        super(root, statusMonitor, null);
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113787p = "Finder.FinderLiveLikeConfettiPlugin";
        this.f113790q = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        this.f113791r = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        this.f113792s = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.pv(root));
        this.f113793t = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.xv(root));
        this.f113795v = new zl2.b();
        this.f113796w = (aVar == null || (arrayList2 = aVar.f255278a) == null) ? new java.util.ArrayList() : arrayList2;
        this.f113797x = (aVar == null || (arrayList = aVar.f255279b) == null) ? new java.util.ArrayList() : arrayList;
        this.f113799y = new java.util.ArrayList();
        this.f113801z = new java.util.ArrayList();
        this.A = 100;
        this.B = 1;
        this.C = 2;
        this.D = 4;
        this.G = 200L;
        this.H = com.tencent.mm.ui.zk.a(root.getContext(), 48);
        this.I = com.tencent.mm.ui.zk.a(root.getContext(), 40);
        this.f113785J = com.tencent.mm.ui.zk.a(root.getContext(), 40);
        this.K = (com.tencent.mm.ui.bl.b(root.getContext()).y / 2) - com.tencent.mm.ui.zk.a(root.getContext(), 24);
        com.tencent.mm.ui.zk.a(root.getContext(), 60);
        this.L = 2500L;
        this.M = -360.0f;
        this.N = 50.0f;
        this.P = com.tencent.mm.ui.zk.a(root.getContext(), 160);
        this.Q = new java.util.ArrayList();
        this.S = new int[]{0, 0};
        this.T = 8;
        this.X = new com.tencent.mm.plugin.finder.live.plugin.ov(this);
        this.Y = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.mw(this));
        this.Z = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f113788p0 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LIKE_SPEED_INT_SYNC, 100) * 0.01f;
        this.f113798x0 = new java.util.LinkedHashMap();
        this.f113800y0 = new com.tencent.mm.plugin.finder.live.plugin.jw(this);
        this.f113786l1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.kw(this));
        if (!vd2.v2.f435941m) {
            root.post(new com.tencent.mm.plugin.finder.live.plugin.mv(this));
        }
        this.f113789p1 = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.finder.live.plugin.wv(this));
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.ow owVar) {
        int i17;
        int[] iArr = owVar.S;
        int i18 = iArr[0];
        if (i18 <= 0 || (i17 = iArr[1]) <= 0 || i18 >= owVar.f113791r || i17 >= owVar.f113790q) {
            com.tencent.mars.xlog.Log.i(owVar.f113787p, "[checkXyArray] likeXyArray:" + iArr[0] + ',' + iArr[1]);
            owVar.D1();
        }
    }

    public final android.widget.FrameLayout A1() {
        return (android.widget.FrameLayout) this.f113792s.getValue();
    }

    public final android.widget.RelativeLayout B1() {
        return (android.widget.RelativeLayout) ((jz5.n) this.f113793t).getValue();
    }

    public final void C1(boolean z17) {
        if (com.tencent.mm.plugin.appbrand.utils.d5.a()) {
            E1(z17);
        } else {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.yv(this, z17));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if ((((mm2.n0) P0(mm2.n0.class)).f329273r) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D1() {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ow.D1():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E1(boolean r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ow.E1(boolean):void");
    }

    public final int F1(int i17) {
        if (i17 > 0) {
            return c06.e.f37716d.e(0, i17);
        }
        java.lang.String str = this.f113787p;
        com.tencent.mars.xlog.Log.i(str, "[nextInt] param:" + i17 + " is not positive,stack:");
        com.tencent.mm.sdk.platformtools.Log.c(str, "nextInt", new java.lang.Object[0]);
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    public final android.graphics.Bitmap G1() {
        android.graphics.Bitmap bitmap;
        int i17 = 0;
        int i18 = 100;
        if (this.W) {
            if (this.f113797x.size() <= 0) {
                com.tencent.mars.xlog.Log.e(this.f113787p, "rollNextBitmap: applaudBitmaps is empty");
                return null;
            }
            bitmap = F1(100) < 25 ? (android.graphics.Bitmap) this.f113797x.get(0) : (android.graphics.Bitmap) this.f113797x.get(1);
        } else {
            if (this.f113796w.size() <= 0) {
                com.tencent.mars.xlog.Log.e(this.f113787p, "rollNextBitmap: confettiBitmaps is empty");
                return null;
            }
            java.util.ArrayList arrayList = this.f113796w;
            bitmap = (android.graphics.Bitmap) arrayList.get(F1(arrayList.size()));
        }
        kotlin.jvm.internal.o.d(bitmap);
        if (this.f113799y.size() > 0 && this.A > 0) {
            synchronized (this.f113799y) {
                java.util.Iterator it = this.f113801z.iterator();
                if (!it.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                java.lang.Object next = it.next();
                while (it.hasNext()) {
                    next = java.lang.Integer.valueOf(((java.lang.Number) next).intValue() + ((java.lang.Number) it.next()).intValue());
                }
                int intValue = ((java.lang.Number) next).intValue();
                if (intValue >= 100) {
                    i18 = intValue;
                }
                int F1 = F1(i18);
                if (F1 > intValue) {
                    return bitmap;
                }
                for (java.lang.Object obj : this.f113801z) {
                    int i19 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    int intValue2 = ((java.lang.Number) obj).intValue();
                    if (F1 <= intValue2) {
                        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) kz5.n0.a0(this.f113799y, i17);
                        if (bitmap2 != null) {
                            bitmap = bitmap2;
                        }
                        return bitmap;
                    }
                    F1 -= intValue2;
                    i17 = i19;
                }
            }
        }
        return bitmap;
    }

    public final void H1() {
        java.util.ArrayList arrayList = this.f113796w;
        int size = arrayList.size();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br7);
        android.view.ViewGroup viewGroup = this.f365323d;
        if (size == 0) {
            android.content.res.Resources resources = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481924br3));
            arrayList2.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            int i17 = no0.i.f338727a;
            int i18 = no0.i.f338727a;
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(decodeResource, i18, i18, true);
            kotlin.jvm.internal.o.f(createScaledBitmap, "createScaledBitmap(...)");
            android.content.res.Resources resources2 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481925br4));
            arrayList3.add(resources2);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource2 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue());
            yj0.a.e(obj2, decodeResource2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap2 = android.graphics.Bitmap.createScaledBitmap(decodeResource2, i18, i18, true);
            kotlin.jvm.internal.o.f(createScaledBitmap2, "createScaledBitmap(...)");
            android.content.res.Resources resources3 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.f481926br5));
            arrayList4.add(resources3);
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(obj3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource3 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList4.get(0), ((java.lang.Integer) arrayList4.get(1)).intValue());
            yj0.a.e(obj3, decodeResource3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap3 = android.graphics.Bitmap.createScaledBitmap(decodeResource3, i18, i18, true);
            kotlin.jvm.internal.o.f(createScaledBitmap3, "createScaledBitmap(...)");
            android.content.res.Resources resources4 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br6));
            arrayList5.add(resources4);
            java.lang.Object obj4 = new java.lang.Object();
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(obj4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource4 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList5.get(0), ((java.lang.Integer) arrayList5.get(1)).intValue());
            yj0.a.e(obj4, decodeResource4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap4 = android.graphics.Bitmap.createScaledBitmap(decodeResource4, i18, i18, true);
            kotlin.jvm.internal.o.f(createScaledBitmap4, "createScaledBitmap(...)");
            android.content.res.Resources resources5 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(valueOf);
            arrayList6.add(resources5);
            java.lang.Object obj5 = new java.lang.Object();
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(obj5, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource5 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList6.get(0), ((java.lang.Integer) arrayList6.get(1)).intValue());
            yj0.a.e(obj5, decodeResource5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap5 = android.graphics.Bitmap.createScaledBitmap(decodeResource5, i18, i18, true);
            kotlin.jvm.internal.o.f(createScaledBitmap5, "createScaledBitmap(...)");
            android.content.res.Resources resources6 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br8));
            arrayList7.add(resources6);
            java.lang.Object obj6 = new java.lang.Object();
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(obj6, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource6 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList7.get(0), ((java.lang.Integer) arrayList7.get(1)).intValue());
            yj0.a.e(obj6, decodeResource6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap6 = android.graphics.Bitmap.createScaledBitmap(decodeResource6, i18, i18, true);
            kotlin.jvm.internal.o.f(createScaledBitmap6, "createScaledBitmap(...)");
            arrayList.add(createScaledBitmap);
            arrayList.add(createScaledBitmap2);
            arrayList.add(createScaledBitmap3);
            arrayList.add(createScaledBitmap4);
            arrayList.add(createScaledBitmap5);
            arrayList.add(createScaledBitmap6);
        }
        java.util.ArrayList arrayList8 = this.f113797x;
        if (arrayList8.size() == 0) {
            android.content.res.Resources resources7 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList9.add(valueOf);
            arrayList9.add(resources7);
            java.lang.Object obj7 = new java.lang.Object();
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(obj7, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource7 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList9.get(0), ((java.lang.Integer) arrayList9.get(1)).intValue());
            yj0.a.e(obj7, decodeResource7, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            int i19 = no0.i.f338727a;
            int i27 = no0.i.f338727a;
            android.graphics.Bitmap createScaledBitmap7 = android.graphics.Bitmap.createScaledBitmap(decodeResource7, i27, i27, true);
            kotlin.jvm.internal.o.f(createScaledBitmap7, "createScaledBitmap(...)");
            android.content.res.Resources resources8 = viewGroup.getContext().getResources();
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.br9));
            arrayList10.add(resources8);
            java.lang.Object obj8 = new java.lang.Object();
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(obj8, arrayList10.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource8 = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList10.get(0), ((java.lang.Integer) arrayList10.get(1)).intValue());
            yj0.a.e(obj8, decodeResource8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "setupConfig", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createScaledBitmap8 = android.graphics.Bitmap.createScaledBitmap(decodeResource8, i27, i27, true);
            kotlin.jvm.internal.o.f(createScaledBitmap8, "createScaledBitmap(...)");
            arrayList8.add(createScaledBitmap7);
            arrayList8.add(createScaledBitmap8);
        }
    }

    public final void I1(java.util.List cheerIconInfo) {
        kotlin.jvm.internal.o.g(cheerIconInfo, "cheerIconInfo");
        this.f113799y = new java.util.ArrayList();
        this.f113801z = new java.util.ArrayList();
        this.A = 0;
        java.util.LinkedList<r45.h30> linkedList = new java.util.LinkedList();
        linkedList.addAll(cheerIconInfo);
        for (r45.h30 h30Var : linkedList) {
            this.A += h30Var.getInteger(1);
            java.lang.String string = h30Var.getString(0);
            int integer = h30Var.getInteger(1);
            r45.mb4 mb4Var = new r45.mb4();
            mb4Var.set(9, com.tencent.mm.sdk.platformtools.w2.a(string));
            mb4Var.set(0, string);
            mb4Var.set(1, string);
            java.lang.String k17 = hc2.l.k(string);
            mb4Var.set(46, k17);
            mb4Var.set(47, k17);
            mn2.c1 c1Var = new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c a17 = g1Var.e().a(c1Var);
            a17.g(g1Var.h(mn2.f1.f329953d));
            a17.f447873d = new com.tencent.mm.plugin.finder.live.plugin.lw(this, integer);
            a17.a();
        }
    }

    public final void J1() {
        if (((mm2.c1) P0(mm2.c1.class)).E3.f329468a) {
            if (((mm2.c1) P0(mm2.c1.class)).E3.f329471d != 0) {
                I1(((mm2.c1) P0(mm2.c1.class)).E3.f329469b);
                return;
            }
            this.f113799y.clear();
            this.f113801z.clear();
            this.A = 0;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.O5).getValue()).r()).booleanValue()) {
            i17 = 8;
        }
        super.K0(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v59, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object] */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            if (!((mm2.c1) P0(mm2.c1.class)).Q4) {
                com.tencent.mars.xlog.Log.i(this.f113787p, "startOtherMicUserTime: enableLikeMicAudience is false");
                return;
            }
            ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f113786l1).getValue()).d();
            com.tencent.mm.sdk.platformtools.b4 b4Var = (com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f113786l1).getValue();
            long j17 = this.G;
            b4Var.c(j17, j17);
            return;
        }
        km2.q qVar = null;
        if (ordinal == 8) {
            this.f113789p1.removeMessages(this.C);
            this.f113789p1.removeMessages(this.B);
            ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.Y).getValue()).d();
            this.X = null;
            this.R = 0L;
            this.F = false;
            ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f113786l1).getValue()).d();
            com.tencent.mars.xlog.Log.i(this.f113787p, "CLOSE_LIVE " + this + " ,postLikeWork:" + this.F);
            return;
        }
        if (ordinal == 32) {
            int i17 = bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_X") : 100;
            int i18 = bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_Y") : 100;
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_LIVE_LIKE_CONFETTI_FROM_SCREEN") : false;
            android.graphics.Bitmap G1 = G1();
            if (G1 == null) {
                com.tencent.mars.xlog.Log.e(this.f113787p, "emitLikeConfettiToAnchor: bitmap is null");
            } else {
                x1(G1, i17, i18, z17, this.M, this.N, 1.0f);
            }
            this.E = true;
            if (this.W) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                r0Var.getClass();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("trigger", 1);
                ml2.r0.hj(r0Var, ml2.b4.f327230g, null, 0L, jSONObject.toString(), null, null, null, null, 244, null);
                r0Var.f327884w++;
            }
            this.f113789p1.removeMessages(this.B);
            this.f113789p1.sendEmptyMessageDelayed(this.B, 1000L);
            return;
        }
        if (ordinal == 123) {
            if (!((mm2.c1) P0(mm2.c1.class)).F || pm0.v.z((int) ((mm2.c1) P0(mm2.c1.class)).f328866q, 512)) {
                K0(8);
                return;
            }
            K0(0);
            java.util.List<km2.q> list = ((mm2.o4) S0().a(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                for (km2.q qVar2 : list) {
                    dk2.ga gaVar = (dk2.ga) ((java.util.LinkedHashMap) this.f113798x0).get(qVar2.f309175f);
                    if (gaVar != null) {
                        long j18 = qVar2.f309193x;
                        long j19 = gaVar.f233513a;
                        long j27 = gaVar.f233514b;
                        if (j18 > j19) {
                            gaVar.f233514b = j27 + (j18 - j19);
                            gaVar.f233513a = j18;
                        }
                    }
                }
            }
            long j28 = ((mm2.c1) S0().a(mm2.c1.class)).I1;
            if (j28 <= 0 || this.E) {
                return;
            }
            this.f113789p1.sendMessageDelayed(this.f113789p1.obtainMessage(this.C, java.lang.Long.valueOf(j28)), 300L);
            return;
        }
        if (ordinal == 130) {
            boolean z18 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR") : false;
            com.tencent.mars.xlog.Log.i(this.f113787p, "FINDER_LIVE_CLEAR_SCREEN isClear=" + z18);
            com.tencent.mm.particles.ConfettiSurfaceRenderView confettiSurfaceRenderView = this.f113794u;
            if (confettiSurfaceRenderView != null) {
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(confettiSurfaceRenderView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(confettiSurfaceRenderView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                confettiSurfaceRenderView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(confettiSurfaceRenderView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(confettiSurfaceRenderView, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ?? r07 = (android.view.View) pm0.v.E(valueOf, confettiSurfaceRenderView);
                if (r07 == 0) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(confettiSurfaceRenderView, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(java.lang.Integer.valueOf(intValue2));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(confettiSurfaceRenderView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    confettiSurfaceRenderView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(confettiSurfaceRenderView, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveLikeConfettiPlugin", "statusChange", "(Lcom/tencent/mm/live/plugin/ILiveStatus$LiveStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yj0.a.f(confettiSurfaceRenderView, "com/tencent/mm/kt/CommonKt", "invisibleIf", "(Landroid/view/View;Ljava/lang/Boolean;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    confettiSurfaceRenderView = r07;
                }
                return;
            }
            return;
        }
        if (ordinal == 151) {
            this.W = true;
            this.f113789p1.removeMessages(this.D);
            this.f113789p1.sendEmptyMessageDelayed(this.D, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            return;
        }
        if (ordinal == 187) {
            tn0.w0 w0Var = dk2.ef.f233378d;
            r10 = w0Var != null && w0Var.X();
            com.tencent.mars.xlog.Log.i(this.f113787p, "FINDER_LIVE_JOIN_LIVE_SUCCESS inLinkMic=" + r10);
            C1(r10);
            return;
        }
        if (ordinal == 191) {
            boolean z19 = pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f328807g2, 524288);
            boolean z27 = bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false) : false;
            com.tencent.mars.xlog.Log.i(this.f113787p, "FINDER_LIVE_MODE_SWITCH isLivePaused=" + z19 + " isAudioMode=" + z27);
            if (!z19 && !z27) {
                r10 = false;
            }
            C1(r10);
            return;
        }
        if (ordinal == 206) {
            if ((bundle == null || bundle.getBoolean("PARAM_FINDER_LIVE_LIKE_ENABLE", true)) ? false : true) {
                K0(8);
                return;
            } else {
                K0(0);
                return;
            }
        }
        if (ordinal == 199) {
            C1(true);
            return;
        }
        if (ordinal == 200) {
            C1(false);
            return;
        }
        switch (ordinal) {
            case 156:
                if (bundle == null || (str = bundle.getString("PARAM_FINDER_LIVE_HEAD_URL")) == null) {
                    str = "";
                }
                int i19 = bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_X") : 100;
                int i27 = bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_Y") : 100;
                this.Q.add(0, str);
                v1(i19, i27);
                return;
            case 157:
                com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.rv(this, bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_X") : 100, bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_Y") : 100, null), 3, null);
                return;
            case 158:
                if (bundle == null || (string = bundle.getString("PARAM_LIVE_SESSION_ID")) == null) {
                    return;
                }
                boolean z28 = bundle.getBoolean("PARAM_LIVE_LIKE_CONFETTI_FROM_SCREEN");
                dk2.ga gaVar2 = (dk2.ga) ((java.util.LinkedHashMap) this.f113798x0).get(string);
                if (gaVar2 == null) {
                    com.tencent.mars.xlog.Log.e(this.f113787p, "emitLikeConfettiToOther: confettiModel is null");
                    return;
                } else {
                    gaVar2.a(S0().f272475i);
                    z1(gaVar2, z28);
                    return;
                }
            case com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX /* 159 */:
                if (bundle == null || (string2 = bundle.getString("PARAM_LIVE_SESSION_ID")) == null) {
                    return;
                }
                java.lang.String string5 = bundle.getString("PARAM_FINDER_LIVE_HEAD_URL");
                if (string5 != null && string5.length() != 0) {
                    r10 = false;
                }
                if (r10) {
                    return;
                }
                dk2.ga gaVar3 = (dk2.ga) ((java.util.LinkedHashMap) this.f113798x0).get(string2);
                if (gaVar3 == null) {
                    com.tencent.mars.xlog.Log.e(this.f113787p, "emitLikeConfettiToOther: confettiModel is null");
                    return;
                } else {
                    gaVar3.a(S0().f272475i);
                    w1(gaVar3, string5);
                    return;
                }
            case 160:
                if (bundle == null || (string3 = bundle.getString("PARAM_LIVE_SESSION_ID")) == null) {
                    return;
                }
                int i28 = bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_X");
                int i29 = bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_Y");
                float f17 = bundle.getFloat("PARAM_LIVE_LIKE_CONFETTI_DISPLAY_SCALE");
                dk2.ga gaVar4 = (dk2.ga) ((java.util.LinkedHashMap) this.f113798x0).get(string3);
                if (gaVar4 == null) {
                    java.util.List list2 = ((mm2.o4) P0(mm2.o4.class)).f329327v;
                    kotlin.jvm.internal.o.f(list2, "<get-audienceLinkMicUserList>(...)");
                    synchronized (list2) {
                        java.util.Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                ?? next = it.next();
                                if (kotlin.jvm.internal.o.b(((km2.q) next).f309175f, string3)) {
                                    qVar = next;
                                }
                            }
                        }
                    }
                    km2.q qVar3 = qVar;
                    long j29 = qVar3 != null ? qVar3.f309193x : 0L;
                    this.f113798x0.put(string3, new dk2.ga(string3, j29, j29, 0L, 0L, 0, 0, 0.0f, false, null, 1016, null));
                    gaVar4 = (dk2.ga) ((java.util.LinkedHashMap) this.f113798x0).get(string3);
                }
                if (gaVar4 != null) {
                    gaVar4.f233516d = i28;
                }
                if (gaVar4 != null) {
                    gaVar4.f233517e = i29;
                }
                if (gaVar4 != null) {
                    gaVar4.f233518f = f17;
                }
                com.tencent.mars.xlog.Log.i(this.f113787p, "FINDER_LIVE_POST_LIKE_TO_OTHER_ADD_MIC_USER sessionId=".concat(string3));
                return;
            case 161:
                if (bundle == null || (string4 = bundle.getString("PARAM_LIVE_SESSION_ID")) == null) {
                    return;
                }
                this.f113798x0.remove(string4);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.f113799y.clear();
        this.f113801z.clear();
        this.A = 0;
        this.V = true;
        ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.Y).getValue()).d();
        this.X = null;
        this.R = 0L;
        this.F = false;
        com.tencent.mars.xlog.Log.i(this.f113787p, "unMount " + this + " ,postLikeWork:" + this.F);
        this.f113789p1.removeMessages(this.C);
        this.f113789p1.removeMessages(this.B);
        ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.f113786l1).getValue()).d();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void c1(boolean z17) {
        if (z17) {
            return;
        }
        this.f365323d.post(new com.tencent.mm.plugin.finder.live.plugin.iw(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return x0() ? !((mm2.g0) P0(mm2.g0.class)).T6() : ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void u1(int i17, int i18, int i19, int i27, int i28, java.lang.String str) {
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.e(this.f113787p, "emitHighLightLike: headUrl is empty");
            return;
        }
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(str, c01.z1.r());
        android.view.ViewGroup viewGroup = this.f365323d;
        if (D0) {
            android.graphics.PointF pointF = new android.graphics.PointF(i17, i18);
            android.graphics.PointF pointF2 = new android.graphics.PointF(i19, i27);
            android.widget.ImageView imageView = new android.widget.ImageView(viewGroup.getContext());
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(imageView, str);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(i28, i28);
            marginLayoutParams.setMarginStart(i17);
            marginLayoutParams.topMargin = i18;
            imageView.setLayoutParams(marginLayoutParams);
            B1().addView(imageView);
            imageView.setAlpha(0.0f);
            imageView.post(new com.tencent.mm.plugin.finder.live.plugin.gw(imageView, this, pointF, pointF2));
            return;
        }
        float f17 = i17;
        float f18 = i18;
        android.graphics.PointF pointF3 = new android.graphics.PointF(f17, f18);
        float f19 = i27;
        android.graphics.PointF pointF4 = new android.graphics.PointF(i19, f19);
        android.graphics.PointF pointF5 = new android.graphics.PointF(f17, f18 - ((f18 - f19) * 0.3f));
        android.graphics.PointF pointF6 = new android.graphics.PointF(i19 - F1(this.f113785J), f19);
        float f27 = pointF5.x;
        float f28 = pointF5.y - pointF6.y;
        if (f28 < 1.0f) {
            f28 = 1.0f;
        }
        int F1 = F1((int) (f28 / 2));
        float f29 = pointF6.y;
        float f37 = f29 + ((pointF5.y - f29) * 0.25f) + F1;
        float f38 = com.tencent.mm.ui.bl.b(viewGroup.getContext()).x - i28;
        if (f27 > f38) {
            f27 = f38;
        }
        android.graphics.PointF pointF7 = new android.graphics.PointF(f27, f37);
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.a().b(new mn2.n(str, null, 2, null), g1Var.h(mn2.f1.f329957h));
        com.tencent.mm.plugin.finder.live.plugin.dw dwVar = new com.tencent.mm.plugin.finder.live.plugin.dw(this, i28, str, i17, i18, pointF3, pointF4, pointF5, pointF7, pointF6);
        b17.getClass();
        b17.f447873d = dwVar;
        b17.f();
    }

    public final void v1(int i17, int i18) {
        java.util.ArrayList arrayList = this.Q;
        if (arrayList.size() <= 0) {
            return;
        }
        java.lang.Object remove = arrayList.remove(0);
        kotlin.jvm.internal.o.f(remove, "removeAt(...)");
        u1(i17, i18, i17, this.K, this.I, (java.lang.String) remove);
    }

    public final void w1(dk2.ga gaVar, java.lang.String str) {
        float f17 = gaVar.f233518f;
        int i17 = (int) (this.I * f17);
        int i18 = i17 / 2;
        int i19 = gaVar.f233516d - i18;
        int i27 = gaVar.f233517e - i18;
        u1(i19, i27, i19, (int) (i27 - ((this.P * this.f113788p0) * f17)), i17, str);
    }

    public final void x1(android.graphics.Bitmap bitmap, int i17, int i18, boolean z17, float f17, float f18, float f19) {
        g51.a bVar;
        boolean z18 = pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f328807g2, 524288);
        tn0.w0 w0Var = dk2.ef.f233378d;
        boolean z19 = false;
        boolean z27 = (z18 || (w0Var != null && w0Var.X()) || ((mm2.c1) P0(mm2.c1.class)).l7()) ? false : true;
        if (this.f113794u != null && z27) {
            z19 = true;
        }
        if (A1() == null) {
            com.tencent.mars.xlog.Log.e(this.f113787p, "emitLikeConfettiToOther: confettiRoot is null");
            return;
        }
        e51.k kVar = new e51.k(i17, i18);
        com.tencent.mm.plugin.finder.live.plugin.qv qvVar = new com.tencent.mm.plugin.finder.live.plugin.qv(bitmap, z17, f19);
        zl2.b bVar2 = this.f113795v;
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (z19) {
            android.widget.FrameLayout A1 = A1();
            kotlin.jvm.internal.o.f(A1, "<get-confettiRoot>(...)");
            bVar = new g51.c(A1);
        } else {
            bVar = new g51.b(A1());
        }
        e51.j a17 = bVar2.a(context, qvVar, kVar, bVar);
        a17.f(f17, f18);
        a17.d();
        if (!z19) {
            a17.g();
            return;
        }
        com.tencent.mm.particles.ConfettiSurfaceRenderView confettiSurfaceRenderView = this.f113794u;
        if (confettiSurfaceRenderView == null) {
            com.tencent.mars.xlog.Log.e(this.f113787p, "emitLikeConfetti: confettiSurfaceRenderRoot is null, cannot add confetti");
            return;
        }
        if (confettiSurfaceRenderView.f72359d) {
            if (confettiSurfaceRenderView.getVisibility() != 0) {
                e51.e eVar = confettiSurfaceRenderView.f72362g;
                if (eVar != null) {
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.what = 3;
                    eVar.sendMessage(obtain);
                    return;
                }
                return;
            }
            e51.e eVar2 = confettiSurfaceRenderView.f72362g;
            if (eVar2 != null) {
                android.os.Message obtain2 = android.os.Message.obtain();
                obtain2.what = 2;
                obtain2.obj = a17;
                eVar2.sendMessage(obtain2);
            }
        }
    }

    public final java.lang.Object y1(android.graphics.Bitmap bitmap, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.Object poll = this.Z.poll();
        h0Var.f310123d = poll;
        if (poll == null) {
            android.widget.ImageView imageView = new android.widget.ImageView(this.f365323d.getContext());
            int i19 = no0.i.f338727a;
            int i27 = no0.i.f338727a;
            imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i27, i27));
            h0Var.f310123d = imageView;
        }
        java.lang.Object element = h0Var.f310123d;
        kotlin.jvm.internal.o.f(element, "element");
        android.widget.ImageView imageView2 = (android.widget.ImageView) element;
        imageView2.setImageBitmap(bitmap);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.0f);
        imageView2.setScaleY(0.0f);
        imageView2.setRotation(0.0f);
        pm0.v.B(imageView2);
        A1().addView((android.view.View) h0Var.f310123d);
        ((android.widget.ImageView) h0Var.f310123d).setX(i17);
        ((android.widget.ImageView) h0Var.f310123d).setY(i18);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(h0Var.f310123d, (android.util.Property<java.lang.Object, java.lang.Float>) android.view.View.SCALE_X, 0.0f, 1.5f, 1.3f);
        ofFloat.setDuration(400L);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(h0Var.f310123d, (android.util.Property<java.lang.Object, java.lang.Float>) android.view.View.SCALE_Y, 0.0f, 1.5f, 1.3f);
        ofFloat2.setDuration(400L);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(h0Var.f310123d, (android.util.Property<java.lang.Object, java.lang.Float>) android.view.View.ROTATION, -30.0f, 0.0f);
        ofFloat3.setDuration(400L);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(h0Var.f310123d, (android.util.Property<java.lang.Object, java.lang.Float>) android.view.View.ALPHA, 0.0f, 1.0f);
        ofFloat4.setDuration(250L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        android.animation.ObjectAnimator ofFloat5 = android.animation.ObjectAnimator.ofFloat(h0Var.f310123d, (android.util.Property<java.lang.Object, java.lang.Float>) android.view.View.ALPHA, 1.0f, 0.0f);
        ofFloat5.setDuration(250L);
        com.tencent.mm.plugin.finder.live.plugin.tv tvVar = new com.tencent.mm.plugin.finder.live.plugin.tv(this, h0Var);
        rVar.m(new com.tencent.mm.plugin.finder.live.plugin.sv(animatorSet, ofFloat5, tvVar));
        animatorSet.addListener(new com.tencent.mm.plugin.finder.live.plugin.uv(rVar, ofFloat5, this, tvVar));
        animatorSet.start();
        java.lang.Object j17 = rVar.j();
        return j17 == pz5.a.f359186d ? j17 : jz5.f0.f302826a;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        this.V = false;
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = ((je2.h) P0(je2.h.class)).f299233f;
        liveMutableData.f111660d = true;
        liveMutableData.observe(this, new com.tencent.mm.plugin.finder.live.plugin.hw(this));
    }

    public final void z1(dk2.ga gaVar, boolean z17) {
        java.util.ArrayList arrayList = this.f113796w;
        if (arrayList.size() <= 0) {
            com.tencent.mars.xlog.Log.e(this.f113787p, "emitLikeConfettiToOther: confettiBitmaps is empty");
            return;
        }
        java.lang.Object obj = arrayList.get(F1(arrayList.size()));
        kotlin.jvm.internal.o.f(obj, "get(...)");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        float f17 = gaVar.f233518f;
        int i17 = gaVar.f233516d;
        int i18 = this.H;
        int i19 = i17 - (i18 / 2);
        int i27 = gaVar.f233517e - (i18 / 2);
        float f18 = this.M;
        float f19 = this.f113788p0;
        x1(bitmap, i19, i27, z17, f18 * f19 * f17, this.N * f19 * f17, f17);
    }
}
