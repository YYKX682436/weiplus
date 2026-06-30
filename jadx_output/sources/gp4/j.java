package gp4;

/* loaded from: classes10.dex */
public final class j extends yt3.a implements android.view.View.OnClickListener, bp4.m2 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer f274412f;

    /* renamed from: g, reason: collision with root package name */
    public zu3.a f274413g;

    /* renamed from: h, reason: collision with root package name */
    public zv3.f f274414h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer view, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f274412f = view;
        view.setDeleteStateListener(gp4.a.f274390d);
        view.setItemChangeListener(new gp4.b(status));
        view.setClickListener(new gp4.c(this, status));
        view.setTimeEditClickListener(new gp4.d(this));
        view.setShowCaptionDialogListener(new gp4.e(status));
        view.setReadTextListener(new gp4.f(this, status));
        view.setTimeEditMenuChangeListener(new gp4.g(status));
    }

    public static void A(gp4.j jVar, zu3.a aVar, bv3.d dVar, java.lang.String str, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            dVar = null;
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            j17 = -1;
        }
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEditItemContainerPlugin", "addTimeEditItemData " + aVar + ' ' + dVar + ' ' + str);
        if (aVar != null) {
            if (jVar.f274413g == null || !jVar.Q(aVar)) {
                if (dVar != null) {
                    bv3.d.a(aVar.f475760c, dVar, false, false, 6, null);
                }
                if (dVar == null && j17 >= 0) {
                    aVar.f475760c.d(j17, 10000 + j17);
                }
                if (str != null) {
                    aVar.f475761d = str;
                }
                jVar.f274412f.j(aVar);
            }
        }
    }

    public static /* synthetic */ void B(gp4.j jVar, zu3.a aVar, com.tencent.mm.plugin.vlog.model.i1 i1Var, java.lang.String str, long j17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.vlog.model.i1 i1Var2 = (i17 & 2) != 0 ? null : i1Var;
        java.lang.String str2 = (i17 & 4) != 0 ? null : str;
        if ((i17 & 8) != 0) {
            j17 = -1;
        }
        jVar.z(aVar, i1Var2, str2, j17);
    }

    public final jz5.l C(java.util.List list, java.util.List list2) {
        java.util.List V0 = kz5.n0.V0(list2);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zu3.a) it.next()).f475760c);
        }
        long j17 = 0;
        long j18 = 0;
        for (bv3.d dVar : kz5.n0.F0(arrayList, gp4.h.f274410d)) {
            if (dVar.c() >= j18) {
                j17 += dVar.b() - dVar.c();
            } else if (dVar.b() > j18) {
                j17 += dVar.b() - j18;
            }
            j18 = dVar.b();
            kz5.h0.B(V0, new gp4.i(dVar));
        }
        return new jz5.l(java.lang.Integer.valueOf(list2.size() - ((java.util.ArrayList) V0).size()), java.lang.Long.valueOf(j17));
    }

    public final void D(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEditItemContainerPlugin", "enableGif:" + z17);
        this.f274412f.f175956q = z17 ^ true;
    }

    public final java.util.ArrayList E() {
        return this.f274412f.getEditorDataList();
    }

    public final int F() {
        java.util.Iterator<T> it = this.f274412f.getAllItemViews().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((zu3.n) it.next()) instanceof zu3.l) {
                i17++;
            }
        }
        return i17;
    }

    public final android.graphics.Bitmap G(java.lang.String cacheId, int i17) {
        kotlin.jvm.internal.o.g(cacheId, "cacheId");
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274412f;
        java.util.ArrayList k17 = timeEditorItemContainer.k(cacheId);
        if (k17.isEmpty()) {
            return null;
        }
        zv3.f fVar = new zv3.f(new float[]{timeEditorItemContainer.getLeft(), timeEditorItemContainer.getTop(), timeEditorItemContainer.getRight(), timeEditorItemContainer.getBottom()}, I(), k17, i17, (timeEditorItemContainer.getHeight() * i17) / timeEditorItemContainer.getWidth());
        this.f274414h = fVar;
        fVar.e();
        zv3.f fVar2 = this.f274414h;
        android.graphics.Bitmap d17 = fVar2 != null ? fVar2.d(1L) : null;
        zv3.f fVar3 = this.f274414h;
        if (fVar3 != null) {
            fVar3.a();
        }
        this.f274414h = null;
        return d17;
    }

    public final int H() {
        java.util.Iterator<T> it = this.f274412f.getAllItemViews().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((zu3.n) it.next()) instanceof zu3.b0) {
                i17++;
            }
        }
        return i17;
    }

    public final float[] I() {
        lt3.n nVar = lt3.n.f321260a;
        android.graphics.Rect rect = lt3.n.f321263d;
        return new float[]{rect.left, rect.top, rect.right, rect.bottom};
    }

    public final void J(float f17, float f18) {
        this.f274412f.getClass();
        android.graphics.Rect rect = lt3.n.f321262c;
        int i17 = (int) f18;
        rect.top = i17;
        rect.bottom = i17 + ((int) f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeEditorItemContainer", "initHeightSafeArea safeAreaRect:" + rect);
    }

    public final void K(float f17, float f18) {
        this.f274412f.getClass();
        android.graphics.Rect rect = lt3.n.f321262c;
        int i17 = (int) f18;
        rect.left = i17;
        rect.right = i17 + ((int) f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeEditorItemContainer", "initWidthSafeArea safeAreaRect:" + rect);
    }

    public final java.lang.String L(java.util.List trackList, boolean z17) {
        java.lang.Object next;
        kotlin.jvm.internal.o.g(trackList, "trackList");
        java.util.Iterator it = trackList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long j17 = ((com.tencent.mm.plugin.vlog.model.i1) next).f175627l.f397503e;
                do {
                    java.lang.Object next2 = it.next();
                    long j18 = ((com.tencent.mm.plugin.vlog.model.i1) next2).f175627l.f397503e;
                    if (j17 < j18) {
                        next = next2;
                        j17 = j18;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) next;
        long j19 = i1Var != null ? i1Var.f175627l.f397503e : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        java.util.List<zu3.a> allEditorData = this.f274412f.getAllEditorData();
        java.util.ArrayList<zu3.j> arrayList = new java.util.ArrayList();
        for (zu3.a aVar : allEditorData) {
            zu3.j jVar = aVar instanceof zu3.j ? (zu3.j) aVar : null;
            bv3.d dVar = aVar.f475760c;
            dVar.d(dVar.c(), java.lang.Math.min(aVar.f475760c.b(), j19));
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (zu3.j jVar2 : arrayList) {
            arrayList2.add(java.lang.Long.valueOf(z17 ? 0L : jVar2.f475760c.b() - jVar2.f475760c.c()));
        }
        java.util.Map l17 = kz5.c1.l(new jz5.l("emojiCount", java.lang.Integer.valueOf(size)), new jz5.l("emojiStatus", kz5.n0.g0(arrayList2, "|", null, null, 0, null, null, 62, null)));
        if (z17) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((zu3.j) it6.next()).f475761d);
            }
            l17.put("useEmojiTrackCount", java.lang.Integer.valueOf(kz5.n0.X0(arrayList3).size()));
            l17.put("totalDurationMs", 0);
        } else {
            jz5.l C = C(arrayList, trackList);
            l17.put("useEmojiTrackCount", C.f302833d);
            l17.put("totalDurationMs", C.f302834e);
        }
        java.lang.String gVar = new cl0.g(l17).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        return r26.i0.t(gVar, ",", ";", false);
    }

    public final java.lang.String M(java.util.List trackList, boolean z17) {
        java.lang.Object next;
        long b17;
        kotlin.jvm.internal.o.g(trackList, "trackList");
        java.util.Iterator it = trackList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long j17 = ((com.tencent.mm.plugin.vlog.model.i1) next).f175627l.f397503e;
                do {
                    java.lang.Object next2 = it.next();
                    long j18 = ((com.tencent.mm.plugin.vlog.model.i1) next2).f175627l.f397503e;
                    if (j17 < j18) {
                        next = next2;
                        j17 = j18;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) next;
        long j19 = i1Var != null ? i1Var.f175627l.f397503e : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        java.util.List<zu3.a> allEditorData = this.f274412f.getAllEditorData();
        java.util.ArrayList<zu3.a0> arrayList = new java.util.ArrayList();
        for (zu3.a aVar : allEditorData) {
            zu3.a0 a0Var = aVar instanceof zu3.a0 ? (zu3.a0) aVar : null;
            if (a0Var != null) {
                bv3.d dVar = aVar.f475760c;
                dVar.d(dVar.c(), java.lang.Math.min(aVar.f475760c.b(), j19));
            } else {
                a0Var = null;
            }
            if (a0Var != null) {
                arrayList.add(a0Var);
            }
        }
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (zu3.a0 a0Var2 : arrayList) {
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("font", com.tencent.mm.plugin.vlog.model.x.b(a0Var2.f475768k));
            if (z17) {
                b17 = 0;
            } else {
                bv3.d dVar2 = a0Var2.f475760c;
                b17 = dVar2.b() - dVar2.c();
            }
            lVarArr[1] = new jz5.l("durationMs", java.lang.Long.valueOf(b17));
            lVarArr[2] = new jz5.l("isRead", java.lang.Integer.valueOf(a0Var2.a() ? 1 : 0));
            arrayList2.add(kz5.c1.k(lVarArr));
        }
        java.util.Map l17 = kz5.c1.l(new jz5.l("textCount", java.lang.Integer.valueOf(size)), new jz5.l("textStatus", arrayList2));
        if (z17) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((zu3.a0) it6.next()).f475761d);
            }
            l17.put("useTextTrackCount", java.lang.Integer.valueOf(kz5.n0.X0(arrayList3).size()));
            l17.put("totalDurationMs", 0);
        } else {
            jz5.l C = C(arrayList, trackList);
            l17.put("useTextTrackCount", C.f302833d);
            l17.put("totalDurationMs", C.f302834e);
        }
        java.lang.String gVar = new cl0.g(l17).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        return r26.i0.t(gVar, ",", ";", false);
    }

    public final void N(boolean z17) {
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274412f;
        android.view.View view = timeEditorItemContainer.f175964y;
        if (view != null) {
            timeEditorItemContainer.q(view, z17);
        }
        if (z17) {
            return;
        }
        this.f274413g = null;
    }

    public final void O(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEditItemContainerPlugin", "setFullScreen:" + z17);
    }

    public final void P() {
        this.f274412f.u();
    }

    public final boolean Q(zu3.a aVar) {
        zu3.a aVar2 = this.f274413g;
        if (!(aVar2 instanceof zu3.a0) || !(aVar instanceof zu3.a0)) {
            return false;
        }
        kotlin.jvm.internal.o.e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.TextItem");
        zu3.a0 a0Var = (zu3.a0) aVar2;
        zu3.a0 item = (zu3.a0) aVar;
        kotlin.jvm.internal.o.g(item, "item");
        a0Var.f475764g = item.f475764g;
        a0Var.f475765h = item.f475765h;
        a0Var.f475766i = item.f475766i;
        a0Var.f475767j = item.f475767j;
        a0Var.f475763f.set(item.f475763f);
        a0Var.f475768k = item.f475768k;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextItem", a0Var.toString());
        zu3.a aVar3 = this.f274413g;
        kotlin.jvm.internal.o.d(aVar3);
        this.f274412f.v(aVar3);
        this.f274413g = null;
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void onPause() {
        this.f274412f.l();
    }

    @Override // yt3.r2
    public void onResume() {
        this.f274412f.r();
    }

    @Override // bp4.m2
    public void onVideoPause() {
    }

    @Override // bp4.m2
    public void onVideoPlay() {
        com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer timeEditorItemContainer = this.f274412f;
        android.view.View view = timeEditorItemContainer.f175964y;
        if (view != null) {
            timeEditorItemContainer.q(view, false);
        }
    }

    @Override // yt3.r2
    public void release() {
        this.f274412f.reset();
    }

    @Override // yt3.r2
    public void reset() {
        this.f274412f.reset();
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f274412f.setVisibility(i17);
    }

    public final void z(zu3.a aVar, com.tencent.mm.plugin.vlog.model.i1 i1Var, java.lang.String str, long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addTimeEditItemData ");
        sb6.append(aVar);
        sb6.append(' ');
        sb6.append(i1Var != null ? i1Var.f175620e : null);
        sb6.append(' ');
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEditItemContainerPlugin", sb6.toString());
        if (aVar != null) {
            if (this.f274413g == null || !Q(aVar)) {
                if (i1Var != null) {
                    bv3.d.a(aVar.f475760c, i1Var.f175620e, false, false, 6, null);
                }
                if (i1Var == null && j17 >= 0) {
                    aVar.f475760c.d(j17, 10000 + j17);
                }
                if (str != null) {
                    aVar.f475761d = str;
                }
                this.f274412f.j(aVar);
            }
        }
    }
}
