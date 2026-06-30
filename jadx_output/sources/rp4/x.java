package rp4;

/* loaded from: classes10.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public volatile int f398700e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f398701f;

    /* renamed from: l, reason: collision with root package name */
    public int f398707l;

    /* renamed from: m, reason: collision with root package name */
    public int f398708m;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f398696a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f398697b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f398698c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f398699d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f398702g = new android.graphics.Rect();

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f398703h = new android.graphics.Rect();

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f398704i = new android.graphics.Rect();

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.plugin.vlog.model.h1 f398705j = new com.tencent.mm.plugin.vlog.model.h1(kz5.p0.f313996d);

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f398706k = new java.util.LinkedList();

    public final void a() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_enable_hdr_lut, 1) != 1) {
            return;
        }
        java.util.LinkedList<com.tencent.mm.plugin.vlog.model.i1> linkedList = this.f398706k;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (com.tencent.mm.plugin.vlog.model.i1 i1Var : linkedList) {
            if (i1Var.f175617b == 2) {
                com.tencent.mm.plugin.vlog.model.h1 h1Var = this.f398705j;
                rs0.q a17 = rs0.r.f399316a.a(i1Var.f175616a);
                if (a17 != null) {
                    h1Var.b(a17.f399313b, a17.f399314c, a17.f399315d);
                }
            }
            arrayList.add(jz5.f0.f302826a);
        }
    }

    public final void b() {
        this.f398706k.clear();
        this.f398706k.addAll(this.f398699d);
        com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(this.f398706k);
        this.f398705j = h1Var;
        h1Var.r(0L);
        com.tencent.mm.plugin.vlog.model.h1 h1Var2 = this.f398705j;
        so4.g gVar = so4.g.f410776a;
        h1Var2.q(so4.g.f410781f);
        this.f398705j.u(this.f398700e, this.f398701f);
        a();
    }

    public final boolean c() {
        if (this.f398700e != 0 && this.f398701f != 0) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MediaModel", "isNormalSizeValid maxWidth: " + this.f398700e + ", maxHeight: " + this.f398701f);
        return false;
    }

    public final void d(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaModel", "maxWidth: " + i17 + ", maxHeight: " + i18);
        this.f398701f = i18;
        this.f398700e = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x028f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x029e A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(rp4.w r15) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp4.x.e(rp4.w):void");
    }

    public final void f(java.util.List paths, java.util.List types, java.util.List sourceFrom) {
        int i17;
        long j17;
        com.tencent.mm.plugin.vlog.model.b1 b1Var;
        com.tencent.mm.plugin.vlog.model.i1 i1Var;
        kotlin.jvm.internal.o.g(paths, "paths");
        kotlin.jvm.internal.o.g(types, "types");
        kotlin.jvm.internal.o.g(sourceFrom, "sourceFrom");
        java.util.LinkedList linkedList = this.f398696a;
        linkedList.clear();
        java.util.LinkedList linkedList2 = this.f398697b;
        linkedList2.clear();
        java.util.LinkedList sources = this.f398698c;
        sources.clear();
        java.util.LinkedList linkedList3 = this.f398699d;
        linkedList3.clear();
        linkedList.addAll(paths);
        linkedList2.addAll(types);
        sources.addAll(com.tencent.mm.plugin.vlog.model.b1.f175567d.a(paths, types, sourceFrom));
        kotlin.jvm.internal.o.g(sources, "sources");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(sources, 10));
        java.util.Iterator it = sources.iterator();
        while (true) {
            i17 = 2;
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.vlog.model.b1 b1Var2 = (com.tencent.mm.plugin.vlog.model.b1) it.next();
            if (b1Var2 instanceof com.tencent.mm.plugin.vlog.model.q1) {
                i1Var = new com.tencent.mm.plugin.vlog.model.i1(((com.tencent.mm.plugin.vlog.model.q1) b1Var2).f175714e, 2, b1Var2.f175570c);
                i1Var.f175627l.a();
            } else if (b1Var2 instanceof com.tencent.mm.plugin.vlog.model.o0) {
                i1Var = new com.tencent.mm.plugin.vlog.model.i1(((com.tencent.mm.plugin.vlog.model.o0) b1Var2).f175700e, 1, b1Var2.f175570c);
                i1Var.f175627l.a();
            } else {
                i1Var = null;
            }
            arrayList.add(i1Var);
        }
        java.util.List V = kz5.n0.V(arrayList);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) V;
        java.util.Iterator it6 = arrayList2.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.vlog.model.i1 i1Var2 = (com.tencent.mm.plugin.vlog.model.i1) next;
            com.tencent.mm.plugin.vlog.model.b1 b1Var3 = (com.tencent.mm.plugin.vlog.model.b1) sources.get(i18);
            int i27 = i1Var2.f175617b;
            java.util.ArrayList arrayList3 = arrayList2;
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem editItem = i1Var2.f175626k;
            if (i27 == 1) {
                kotlin.jvm.internal.o.e(b1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ImageSource");
                editItem.type = 1;
                j17 = 4000;
                b1Var = (com.tencent.mm.plugin.vlog.model.o0) b1Var3;
            } else if (i27 != i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaModel", "unknown track type:" + i1Var2.f175617b);
                j17 = 0L;
                b1Var = b1Var3;
            } else {
                kotlin.jvm.internal.o.e(b1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoSource");
                com.tencent.mm.plugin.vlog.model.q1 q1Var = (com.tencent.mm.plugin.vlog.model.q1) b1Var3;
                editItem.type = i17;
                j17 = q1Var.f175715f;
                b1Var = q1Var;
            }
            i1Var2.d(0L);
            i1Var2.c(j17);
            editItem.originDuration = j17;
            editItem.targetDuration = j17;
            int i28 = b1Var.f175568a;
            android.graphics.Rect rect = this.f398703h;
            int i29 = b1Var.f175569b;
            rect.set(0, 0, i28, i29);
            int i37 = b1Var.f175568a;
            if (i37 > 1080 || i29 > 1280) {
                float f17 = i37;
                float f18 = i29;
                float max = java.lang.Math.max((f17 * 1.0f) / 1080, (1.0f * f18) / 1280);
                i1Var2.f175621f = (int) (f17 / max);
                i1Var2.f175622g = (int) (f18 / max);
                i1Var2.f175623h = max;
            } else {
                i1Var2.f175621f = i37;
                i1Var2.f175622g = i29;
            }
            arrayList2 = arrayList3;
            i18 = i19;
            i17 = 2;
        }
        java.util.ArrayList arrayList4 = arrayList2;
        rm5.i iVar = rm5.j.f397498v;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(V, 10));
        java.util.Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            arrayList5.add(((com.tencent.mm.plugin.vlog.model.i1) it7.next()).f175627l);
        }
        iVar.a(arrayList5);
        linkedList3.addAll(V);
    }
}
