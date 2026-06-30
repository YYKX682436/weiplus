package cp4;

/* loaded from: classes10.dex */
public final class r extends yt3.a implements bp4.b0, bp4.a0 {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f221058f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f221059g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f221060h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f221061i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f221062m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f221063n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f221064o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f221065p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f221066q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f221067r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f221068s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f221069t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f221070u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f221071v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Object f221072w;

    /* renamed from: x, reason: collision with root package name */
    public int f221073x;

    /* renamed from: y, reason: collision with root package name */
    public int f221074y;

    /* renamed from: z, reason: collision with root package name */
    public final yz5.r f221075z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.view.ViewGroup parent, com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder previewHolder, com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editHolder, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(previewHolder, "previewHolder");
        kotlin.jvm.internal.o.g(editHolder, "editHolder");
        kotlin.jvm.internal.o.g(status, "status");
        this.f221058f = previewHolder;
        this.f221059g = editHolder;
        android.content.Context context = parent.getContext();
        this.f221060h = context;
        this.f221061i = parent.findViewById(com.tencent.mm.R.id.d7d);
        android.widget.ImageView imageView = (android.widget.ImageView) parent.findViewById(com.tencent.mm.R.id.d7c);
        this.f221062m = imageView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) parent.findViewById(com.tencent.mm.R.id.d7e);
        this.f221063n = imageView2;
        this.f221064o = jz5.h.b(new cp4.g(this));
        this.f221065p = jz5.h.b(new cp4.f(this));
        this.f221066q = kz5.c0.i(new java.util.HashMap(), new java.util.HashMap());
        this.f221067r = kz5.c0.i(new java.util.ArrayList(), new java.util.ArrayList());
        this.f221068s = kz5.c0.i(new java.util.ArrayList(), new java.util.ArrayList());
        this.f221069t = kz5.c0.i(new java.util.HashSet(), new java.util.HashSet());
        this.f221070u = kz5.c0.i(new zu3.d(zu3.e.f475801m), new zu3.d(zu3.e.f475802n));
        this.f221072w = new java.lang.Object();
        this.f221075z = new cp4.e(this);
        parent.setVisibility(0);
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_caption, -1));
        imageView2.setImageDrawable(context.getResources().getDrawable(com.tencent.mm.R.raw.popvideo_post_selected_origin));
        imageView.setOnClickListener(new cp4.d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x024f  */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v46, types: [gp.c] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v14, types: [gp.c] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [int] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(cp4.r r18, int r19) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp4.r.z(cp4.r, int):void");
    }

    public final void A(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        if (!com.tencent.mm.vfs.w6.j(path)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EditorCaptionPlugin", "file not exist ".concat(path));
            return;
        }
        java.util.List list = this.f221066q;
        if (((java.util.HashMap) list.get(0)).get(path) == null) {
            ((java.util.Map) list.get(0)).put(path, new cp4.b());
        }
    }

    public final void B(int i17) {
        cp4.g1 D = D();
        int i18 = cp4.g1.f221003J;
        D.i(i17, null);
        this.f221063n.setVisibility(4);
    }

    public final cp4.z C() {
        return (cp4.z) ((jz5.n) this.f221065p).getValue();
    }

    public final cp4.g1 D() {
        return (cp4.g1) ((jz5.n) this.f221064o).getValue();
    }

    public final java.util.ArrayList E(int i17) {
        java.util.List list = this.f221068s;
        ((java.util.ArrayList) list.get(i17)).clear();
        long j17 = 0;
        for (bv3.a aVar : (java.lang.Iterable) this.f221067r.get(i17)) {
            cp4.b bVar = (cp4.b) ((java.util.HashMap) this.f221066q.get(i17)).get(aVar.f24720a);
            float f17 = aVar.f24723d;
            long j18 = aVar.f24722c;
            long j19 = aVar.f24721b;
            if (bVar != null) {
                int size = bVar.f220976g.size();
                java.lang.String str = aVar.f24720a;
                if (size != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EditorCaptionPlugin", "set translate caption. path:" + str);
                    for (r45.is isVar : bVar.f220976g) {
                        if (isVar.f377299f >= j19 && isVar.f377298e <= j18) {
                            r45.is isVar2 = new r45.is();
                            isVar2.f377301h = isVar.f377301h;
                            isVar2.f377297d = isVar.f377297d;
                            isVar2.f377298e = ((int) (((float) (isVar.f377298e - j19)) / f17)) + j17;
                            isVar2.f377299f = ((int) (((float) (isVar.f377299f - j19)) / f17)) + j17;
                            ((java.util.ArrayList) list.get(i17)).add(isVar2);
                        }
                    }
                } else if (bVar.f220983q == 0 && bVar.f220982p) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EditorCaptionPlugin", "set default caption. path:" + str);
                    r45.is isVar3 = new r45.is();
                    isVar3.f377301h = -1L;
                    java.lang.String r17 = i65.a.r(this.f221060h, com.tencent.mm.R.string.k6l);
                    kotlin.jvm.internal.o.f(r17, "getString(...)");
                    byte[] bytes = r17.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    isVar3.f377297d = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
                    isVar3.f377298e = ((int) (((float) j19) / f17)) + j17;
                    isVar3.f377299f = ((int) (((float) j18) / f17)) + j17;
                    isVar3.f377300g = true;
                    ((java.util.ArrayList) list.get(i17)).add(isVar3);
                }
            }
            j17 += (int) (((float) (j18 - j19)) / f17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorCaptionPlugin", "type:" + i17 + ", scriptTransResult size:" + ((java.util.ArrayList) list.get(i17)).size());
        return (java.util.ArrayList) list.get(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[LOOP:1: B:18:0x005c->B:28:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String F() {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp4.r.F():java.lang.String");
    }

    public final void G(int i17) {
        boolean z17;
        java.lang.Object obj;
        java.util.List list = this.f221070u;
        java.util.ArrayList arrayList = new java.util.ArrayList(((zu3.d) list.get(i17)).f475792g);
        java.util.List list2 = this.f221068s;
        java.lang.Iterable iterable = (java.lang.Iterable) list2.get(i17);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                break;
            }
            r45.is isVar = (r45.is) it.next();
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (((r45.is) obj).f377301h == isVar.f377301h) {
                        break;
                    }
                }
            }
            r45.is isVar2 = (r45.is) obj;
            if (isVar2 != null) {
                isVar.f377297d = isVar2.f377297d;
            }
            arrayList2.add(isVar);
        }
        java.util.Iterator it7 = ((java.lang.Iterable) list2.get(i17)).iterator();
        while (it7.hasNext()) {
            if (!((r45.is) it7.next()).f377300g) {
                cp4.g1 D = D();
                D.getClass();
                java.util.List list3 = D.A;
                ((cp4.k0) list3.get(i17)).f221043f.clear();
                r45.is isVar3 = new r45.is();
                isVar3.f377298e = -2L;
                isVar3.f377299f = -1L;
                ((cp4.k0) list3.get(i17)).f221043f.add(isVar3);
                ((cp4.k0) list3.get(i17)).f221043f.add(isVar3);
                ((cp4.k0) list3.get(i17)).f221043f.addAll(arrayList2);
                r45.is isVar4 = new r45.is();
                isVar4.f377298e = 2147483645L;
                isVar4.f377299f = 2147483646L;
                ((cp4.k0) list3.get(i17)).f221043f.add(isVar4);
                ((cp4.k0) list3.get(i17)).f221043f.add(isVar4);
                ((cp4.k0) D().A.get(i17)).notifyDataSetChanged();
                z17 = true;
            }
        }
        ((zu3.d) list.get(i17)).f475792g.clear();
        ((zu3.d) list.get(i17)).f475792g.addAll(arrayList2);
        if (this.f221063n.getVisibility() == 0) {
            if (z17) {
                D().k(i17);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_1_INT", i17);
            bundle.putByteArray("PARAM_1_BYTEARRAY", ((zu3.d) list.get(i17)).toProtoBuf().toByteArray());
            this.f465332d.w(ju3.c0.f301900r2, bundle);
        }
    }

    public final void H(byte[] transResult) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(transResult, "transResult");
        try {
            r45.is isVar = new r45.is();
            try {
                isVar.parseFrom(transResult);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                isVar = null;
            }
            if (isVar != null) {
                int i17 = 0;
                for (java.lang.Object obj2 : this.f221070u) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.util.Iterator it = ((zu3.d) obj2).f475792g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((r45.is) obj).f377301h == isVar.f377301h) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    r45.is isVar2 = (r45.is) obj;
                    if (isVar2 != null) {
                        I(i17, isVar2);
                    }
                    i17 = i18;
                }
            }
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EditorCaptionPlugin", e18, "", new java.lang.Object[0]);
        }
    }

    public final void I(int i17, r45.is transResult) {
        C().f221096d = i17;
        cp4.z C = C();
        C.getClass();
        kotlin.jvm.internal.o.g(transResult, "transResult");
        C.f221103n = 0;
        long j17 = transResult.f377298e;
        java.util.Iterator it = C.f221098f.f221090e.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((r45.is) next).f377298e == j17) {
                C.f221102m = i18;
            }
            i18 = i19;
        }
        int i27 = C.f221102m;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorEditCaptionView", "scrollToTimeMs " + transResult.f377298e + ' ' + C.f221102m);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = C.f221097e.getLayoutManager();
        if (layoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView", "selectCaption", "(Lcom/tencent/mm/protocal/protobuf/CCTransResult;)V", "Undefined", "scrollToPosition", "(I)V");
            layoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(layoutManager, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorEditCaptionView", "selectCaption", "(Lcom/tencent/mm/protocal/protobuf/CCTransResult;)V", "Undefined", "scrollToPosition", "(I)V");
        }
        ((ku5.t0) ku5.t0.f312615d).E(C.f221104o, 0L);
        C().f221098f.f221090e.clear();
        cp4.z C2 = C();
        java.util.List items = (java.util.List) this.f221068s.get(i17);
        C2.getClass();
        kotlin.jvm.internal.o.g(items, "items");
        C2.f221098f.f221090e.addAll(items);
        C().f221098f.notifyDataSetChanged();
        C().f221099g.f();
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = this.f221059g;
        if (!(editorPanelHolder.f156012h != null)) {
            editorPanelHolder.setCoverByKeyboard(true);
            if (!(C().f221100h != null)) {
                C().setCancelClickListener(new cp4.n(this));
                C().setSureClickListener(new cp4.o(this));
            }
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, C(), null, 2, null);
            editorPanelHolder.setOnVisibleChangeCallback(new cp4.p(this));
        }
        editorPanelHolder.setShow(true);
    }

    public final void J(byte[] transResult, int i17, int i18, java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(transResult, "transResult");
        try {
            r45.is isVar = new r45.is();
            try {
                isVar.parseFrom(transResult);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                isVar = null;
            }
            if (isVar != null) {
                int i19 = 0;
                for (java.lang.Object obj2 : this.f221070u) {
                    int i27 = i19 + 1;
                    if (i19 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    zu3.d dVar = (zu3.d) obj2;
                    java.util.Iterator it = dVar.f475792g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((r45.is) obj).f377301h == isVar.f377301h) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    r45.is isVar2 = (r45.is) obj;
                    if (isVar2 != null) {
                        D().m(i19, isVar);
                        dVar.f475793h = i17;
                        dVar.f475794i = i18;
                        dVar.f475795j = str;
                        isVar2.f377297d = isVar.f377297d;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putInt("PARAM_1_INT", i19);
                        bundle.putByteArray("PARAM_1_BYTEARRAY", dVar.toProtoBuf().toByteArray());
                        this.f465332d.w(ju3.c0.f301900r2, bundle);
                    }
                    i19 = i27;
                }
            }
        } catch (java.io.IOException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EditorCaptionPlugin", e18, "", new java.lang.Object[0]);
        }
    }

    @Override // bp4.b0
    public void b(com.tencent.mm.plugin.vlog.model.h1 h1Var, long j17, boolean z17) {
        java.util.List list = this.f221067r;
        ((java.util.ArrayList) list.get(0)).clear();
        if (h1Var != null) {
            for (com.tencent.mm.plugin.vlog.model.i1 i1Var : h1Var.m()) {
                java.lang.String str = i1Var.f175616a;
                rm5.j jVar = i1Var.f175627l;
                bv3.a aVar = new bv3.a(str, jVar.f397504f, jVar.f397505g, jVar.f397506h);
                ((java.util.ArrayList) list.get(0)).add(aVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.EditorCaptionPlugin", "update script:" + aVar);
            }
        }
        if (this.f221071v) {
            E(0);
            G(0);
        }
    }

    @Override // bp4.a0
    public void c(long j17) {
        if (this.f221071v) {
            D().j(0, j17);
            D().j(1, j17);
        }
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // bp4.a0
    public void onFinish() {
    }

    @Override // yt3.r2
    public void release() {
        C().f221099g.f210400e = null;
        java.util.Iterator it = this.f221066q.iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((java.util.HashMap) it.next()).entrySet().iterator();
            while (it6.hasNext()) {
                cp4.b bVar = (cp4.b) ((java.util.Map.Entry) it6.next()).getValue();
                bVar.getClass();
                gm0.j1.n().f273288b.q(3835, bVar);
                try {
                    bVar.f220987u = true;
                    gp.c cVar = bVar.f220975f;
                    if (cVar != null) {
                        cVar.g();
                    }
                    bVar.f220975f = null;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EditCaptionDataManager", e17, "", new java.lang.Object[0]);
                }
            }
        }
    }

    @Override // yt3.r2
    public void reset() {
        this.f221073x = 0;
        this.f221074y = 0;
        this.f221063n.setVisibility(4);
        this.f221071v = false;
        java.util.Iterator it = this.f221070u.iterator();
        while (it.hasNext()) {
            ((zu3.d) it.next()).f475792g.clear();
        }
        java.util.Iterator it6 = this.f221066q.iterator();
        while (it6.hasNext()) {
            ((java.util.HashMap) it6.next()).clear();
        }
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.View view = this.f221061i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        java.util.ArrayList parcelableArrayList;
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        android.os.Bundle bundle = configProvider.M;
        if (bundle == null || (parcelableArrayList = bundle.getParcelableArrayList("media_list")) == null) {
            return;
        }
        int i17 = 0;
        for (java.lang.Object obj : parcelableArrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj;
            if (galleryItem$MediaItem.getType() == 2) {
                java.lang.String mOriginalPath = galleryItem$MediaItem.f138430e;
                kotlin.jvm.internal.o.f(mOriginalPath, "mOriginalPath");
                A(mOriginalPath);
            }
            i17 = i18;
        }
    }
}
