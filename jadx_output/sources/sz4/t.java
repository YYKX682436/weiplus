package sz4;

/* loaded from: classes12.dex */
public final class t extends sz4.u {
    public final java.util.LinkedList A;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f414227y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f414228z;

    public t(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        this.f414227y = jz5.h.b(new sz4.s(this));
        this.f414228z = new java.util.LinkedList();
        this.A = new java.util.LinkedList();
        i65.a.h(this.itemView.getContext(), com.tencent.mm.R.dimen.f479738dv);
        for (int i17 = 0; i17 < 3; i17++) {
            android.view.View inflate = android.view.LayoutInflater.from(this.itemView.getContext()).inflate(com.tencent.mm.R.layout.c8a, (android.view.ViewGroup) p(), false);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.nqi);
            kotlin.jvm.internal.o.d(imageView);
            sz4.r rVar = new sz4.r(this, imageView, inflate);
            this.f414228z.add(rVar);
            android.widget.LinearLayout linearLayout = this.f414243u;
            com.tencent.mm.plugin.wenote.ui.nativenote.view.MediaGroupItemCoverView mediaGroupItemCoverView = linearLayout instanceof com.tencent.mm.plugin.wenote.ui.nativenote.view.MediaGroupItemCoverView ? (com.tencent.mm.plugin.wenote.ui.nativenote.view.MediaGroupItemCoverView) linearLayout : null;
            if (mediaGroupItemCoverView != null) {
                android.view.View view2 = rVar.f414219c;
                kotlin.jvm.internal.o.f(view2, "<get-subCoverView>(...)");
                java.util.LinkedList linkedList = mediaGroupItemCoverView.f188284d;
                if (!linkedList.contains(view2)) {
                    linkedList.add(view2);
                }
            }
            p().addView(inflate);
            if (i17 != 2) {
                android.view.View inflate2 = android.view.LayoutInflater.from(this.itemView.getContext()).inflate(com.tencent.mm.R.layout.c89, (android.view.ViewGroup) p(), false);
                kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate2;
                p().addView(linearLayout2);
                java.util.LinkedList linkedList2 = this.A;
                linkedList2.add(new sz4.m(this, linearLayout2, linkedList2.size() + 1));
            }
            int i18 = 0;
            for (java.lang.Object obj : this.f414228z) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sz4.r rVar2 = (sz4.r) obj;
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = i18 == 0 ? this.f414232g : ((sz4.m) this.A.get(i18 - 1)).f414208a;
                com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText2 = i18 == this.f414228z.size() + (-1) ? this.f414233h : ((sz4.m) this.A.get(i18)).f414208a;
                kotlin.jvm.internal.o.d(wXRTEditText);
                kotlin.jvm.internal.o.d(wXRTEditText2);
                rVar2.getClass();
                rVar2.f414222f = wXRTEditText;
                rVar2.f414223g = wXRTEditText2;
                i18 = i19;
            }
        }
        this.f414233h.f188114l1 = this.A.size() + 1;
    }

    @Override // sz4.a
    public int i() {
        return 7;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        java.util.List list;
        if (cVar != null && (list = cVar.f296109g) != null) {
            ((java.util.LinkedList) list).clear();
        }
        java.util.Iterator it = this.A.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = ((sz4.m) it.next()).f414208a;
            wXRTEditText.setPosInDataList(i17);
            if (cVar != null) {
                ((java.util.LinkedList) cVar.f296109g).add(wXRTEditText);
            }
        }
        java.util.LinkedList<sz4.r> linkedList = this.f414228z;
        for (sz4.r rVar : linkedList) {
            rVar.f414224h = false;
            android.view.View view = rVar.f414221e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "clear", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "clear", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = rVar.f414217a;
            imageView.setImageDrawable(null);
            imageView.setOnClickListener(new sz4.p(rVar));
            imageView.setOnLongClickListener(null);
            rVar.a().setProcessClickListener(new sz4.q(rVar));
        }
        iz4.p pVar = cVar instanceof iz4.p ? (iz4.p) cVar : null;
        if (pVar == null) {
            return;
        }
        int i19 = 0;
        for (java.lang.Object obj : pVar.f296136t) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            iz4.c item = (iz4.c) obj;
            java.lang.Object obj2 = linkedList.get(i19);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            sz4.r rVar2 = (sz4.r) obj2;
            kotlin.jvm.internal.o.g(item, "item");
            item.d();
            boolean z17 = item instanceof iz4.f;
            sz4.t tVar = rVar2.f414225i;
            android.widget.ImageView imageView2 = rVar2.f414217a;
            if (z17) {
                iz4.f fVar = (iz4.f) item;
                java.lang.String str = fVar.f296135s;
                java.lang.String str2 = fVar.f296138t;
                if (!com.tencent.mm.vfs.w6.j(str)) {
                    str = com.tencent.mm.vfs.w6.j(str2) ? str2 : null;
                }
                if (tVar.f414182d.f333309q == 3) {
                    if (!com.tencent.mm.vfs.w6.j(str2)) {
                        str2 = str;
                    }
                    str = str2;
                }
                imageView2.setImageBitmap(com.tencent.mm.sdk.platformtools.t8.K0(str) ? null : qz4.c.g(str, null));
            } else if (item instanceof iz4.k) {
                iz4.k kVar = (iz4.k) item;
                android.graphics.Bitmap g17 = qz4.c.g(kVar.f296117t, null);
                if (g17 == null && com.tencent.mm.vfs.w6.j(kVar.f296135s) && (g17 = com.tencent.mm.plugin.fav.ui.u1.b(kVar.f296135s)) != null) {
                    try {
                        if (com.tencent.mm.vfs.w6.j(kVar.f296117t)) {
                            com.tencent.mm.vfs.w6.h(kVar.f296117t);
                        }
                        q35.g.a(g17, 60, android.graphics.Bitmap.CompressFormat.JPEG, kVar.f296117t, false);
                    } catch (java.lang.Exception unused) {
                    }
                }
                imageView2.setImageBitmap(g17);
                android.view.View view2 = rVar2.f414221e;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "bindItemForVideoData", "(Lcom/tencent/mm/plugin/wenote/model/datamodel/VideoDataItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder", "bindItemForVideoData", "(Lcom/tencent/mm/plugin/wenote/model/datamodel/VideoDataItem;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            rVar2.a().setProcessClickListener(null);
            imageView2.setOnClickListener(new sz4.n(tVar, i17, i19, item));
            imageView2.setOnLongClickListener(new sz4.o(i19, i17));
            rVar2.f414224h = true;
            i19 = i27;
        }
        pVar.f296137u = this;
        super.j(pVar, i17, i18);
        if (!pVar.f296111i) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                ((sz4.r) it6.next()).b(false);
            }
            return;
        }
        int i28 = 0;
        for (java.lang.Object obj3 : linkedList) {
            int i29 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((sz4.r) obj3).b(nz4.y.h().l().f341622d - 1 == i28);
            i28 = i29;
        }
    }

    @Override // sz4.u
    public nz4.g n(android.view.View view) {
        return r();
    }

    @Override // sz4.u
    public void o(iz4.c cVar) {
        boolean z17 = false;
        if (cVar != null && cVar.f296104b) {
            z17 = true;
        }
        if (!z17) {
            super.o(cVar);
        } else {
            if (s()) {
                return;
            }
            super.o(cVar);
            s();
        }
    }

    public final android.widget.LinearLayout p() {
        java.lang.Object value = this.f414227y.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.LinearLayout) value;
    }

    public final nz4.g q(int i17) {
        java.util.LinkedList linkedList = this.f414228z;
        if (i17 == 0) {
            android.view.View view = ((sz4.r) linkedList.get(0)).f414219c;
            nz4.g gVar = new nz4.g();
            gVar.f341616d = this.f414232g;
            gVar.f341617e = i17;
            gVar.f341618f = view;
            return gVar;
        }
        java.util.LinkedList linkedList2 = this.A;
        if (i17 == linkedList2.size() + 1) {
            android.view.View view2 = ((sz4.r) linkedList.get(linkedList.size() - 1)).f414219c;
            nz4.g gVar2 = new nz4.g();
            gVar2.f341616d = this.f414233h;
            gVar2.f341617e = i17;
            gVar2.f341618f = view2;
            return gVar2;
        }
        int i18 = i17 - 1;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText wXRTEditText = ((sz4.m) linkedList2.get(i18)).f414208a;
        android.view.View view3 = ((sz4.r) linkedList.get(i18)).f414219c;
        nz4.g gVar3 = new nz4.g();
        gVar3.f341616d = wXRTEditText;
        gVar3.f341617e = i17;
        gVar3.f341618f = view3;
        return gVar3;
    }

    public final nz4.g r() {
        nz4.y h17 = nz4.y.h();
        if (h17.m() == 0) {
            return null;
        }
        int posInDataList = this.f414232g.getPosInDataList();
        nz4.h l17 = h17.l();
        if (l17.f341619a == posInDataList && l17.f341621c == posInDataList) {
            return q(l17.f341622d);
        }
        return null;
    }

    public final boolean s() {
        java.util.LinkedList linkedList = this.f414228z;
        boolean z17 = false;
        for (int size = linkedList.size() - 1; -1 < size; size--) {
            java.lang.Object obj = linkedList.get(size);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            sz4.r rVar = (sz4.r) obj;
            if (rVar.a().isFocused()) {
                if (rVar.f414224h) {
                    return true;
                }
                z17 = true;
            } else if (z17 && rVar.f414224h) {
                rVar.a().requestFocus();
                return true;
            }
        }
        return false;
    }
}
