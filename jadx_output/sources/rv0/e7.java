package rv0;

/* loaded from: classes5.dex */
public final class e7 extends androidx.recyclerview.widget.e1 {

    /* renamed from: c, reason: collision with root package name */
    public final rv0.d7 f399988c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f399989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(int i17, int i18, rv0.d7 itemTouchListener, yz5.l canDrag) {
        super(i17, i18);
        kotlin.jvm.internal.o.g(itemTouchListener, "itemTouchListener");
        kotlin.jvm.internal.o.g(canDrag, "canDrag");
        this.f399988c = itemTouchListener;
        this.f399989d = canDrag;
    }

    @Override // androidx.recyclerview.widget.e1
    public int a(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        if (((java.lang.Boolean) this.f399989d.invoke(viewHolder)).booleanValue()) {
            return this.f12009b;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onChildDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder, float f17, float f18, int i17, boolean z17) {
        android.view.View view;
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        super.onChildDraw(c17, recyclerView, viewHolder, f17, f18, i17, z17);
        viewHolder.itemView.getX();
        viewHolder.itemView.getY();
        ((wv0.l) this.f399988c).getClass();
        sv0.i iVar = viewHolder instanceof sv0.i ? (sv0.i) viewHolder : null;
        if (iVar == null || (view = iVar.itemView) == null) {
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(new int[2]);
        int i18 = width / 2;
        int i19 = height / 2;
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder, androidx.recyclerview.widget.k3 target) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(target, "target");
        return true;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onMoved(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder, int i17, androidx.recyclerview.widget.k3 target, int i18, int i19, int i27) {
        sv0.j sortAdapter;
        sv0.j sortAdapter2;
        vv0.n nVar;
        vv0.n nVar2;
        sv0.j sortAdapter3;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(target, "target");
        super.onMoved(recyclerView, viewHolder, i17, target, i18, i19, i27);
        wv0.l lVar = (wv0.l) this.f399988c;
        lVar.getClass();
        lVar.f449921a = i18;
        wv0.q qVar = lVar.f449923c;
        sortAdapter = qVar.getSortAdapter();
        vv0.n nVar3 = (vv0.n) kz5.n0.a0(sortAdapter.f275970d, i17);
        if (i18 > i17) {
            sortAdapter3 = qVar.getSortAdapter();
            nVar2 = (vv0.n) kz5.n0.a0(sortAdapter3.f275970d, i18);
            nVar = nVar3;
        } else {
            sortAdapter2 = qVar.getSortAdapter();
            nVar = (vv0.n) kz5.n0.a0(sortAdapter2.f275970d, i18);
            nVar2 = nVar3;
        }
        if (nVar != null && nVar2 != null && nVar3 != null) {
            lVar.f449922b = nVar3.f440398a;
            yz5.p onSegmentSwitch = qVar.getOnSegmentSwitch();
            if (onSegmentSwitch != null) {
                onSegmentSwitch.invoke(nVar2, nVar);
            }
        }
        wv0.q.L(qVar, i17, i18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (((java.lang.Boolean) r17.f399989d.invoke(r18)).booleanValue() == true) goto L9;
     */
    @Override // androidx.recyclerview.widget.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSelectedChanged(androidx.recyclerview.widget.k3 r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            rv0.d7 r3 = r0.f399988c
            r4 = 0
            r5 = 2
            r6 = r19
            if (r6 != r5) goto L6b
            if (r1 == 0) goto L1f
            yz5.l r6 = r0.f399989d
            java.lang.Object r6 = r6.invoke(r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r7 = 1
            if (r6 != r7) goto L1f
            goto L20
        L1f:
            r7 = r4
        L20:
            if (r7 == 0) goto L6b
            wv0.l r3 = (wv0.l) r3
            if (r1 == 0) goto L2e
            r3.getClass()
            int r6 = r18.getAdapterPosition()
            goto L30
        L2e:
            int r6 = r3.f449921a
        L30:
            r3.f449921a = r6
            wv0.q r6 = r3.f449923c
            sv0.j r7 = wv0.q.K(r6)
            r7.unselectAll()
            sv0.j r7 = wv0.q.K(r6)
            int r8 = r3.f449921a
            r7.z(r8, r2)
            if (r1 == 0) goto L4d
            android.view.View r1 = r1.itemView
            if (r1 == 0) goto L4d
            r1.performHapticFeedback(r4, r5)
        L4d:
            sv0.j r1 = wv0.q.K(r6)
            java.util.ArrayList r1 = r1.f275970d
            int r2 = r3.f449921a
            java.lang.Object r1 = kz5.n0.a0(r1, r2)
            vv0.n r1 = (vv0.n) r1
            if (r1 == 0) goto Lc4
            com.tencent.maas.base.MJID r1 = r1.f440398a
            if (r1 == 0) goto Lc4
            yz5.l r2 = r6.getOnItemGrabbed()
            if (r2 == 0) goto Lc4
            r2.invoke(r1)
            goto Lc4
        L6b:
            wv0.l r3 = (wv0.l) r3
            wv0.q r1 = r3.f449923c
            sv0.j r5 = wv0.q.K(r1)
            int r6 = r3.f449921a
            r5.notifyItemChanged(r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            sv0.j r6 = wv0.q.K(r1)
            java.util.ArrayList r6 = r6.f275970d
            int r6 = r6.size()
        L87:
            if (r4 >= r6) goto Lae
            sv0.j r7 = wv0.q.K(r1)
            java.util.ArrayList r7 = r7.f275970d
            java.lang.Object r7 = r7.get(r4)
            java.lang.String r8 = "get(...)"
            kotlin.jvm.internal.o.f(r7, r8)
            r9 = r7
            vv0.n r9 = (vv0.n) r9
            r10 = 0
            r11 = 0
            int r4 = r4 + 1
            r13 = 0
            r14 = 0
            r15 = 27
            r16 = 0
            r12 = r4
            vv0.n r7 = vv0.n.a(r9, r10, r11, r12, r13, r14, r15, r16)
            r5.add(r7)
            goto L87
        Lae:
            sv0.j r4 = wv0.q.K(r1)
            r4.y(r5)
            com.tencent.maas.base.MJID r4 = r3.f449922b
            if (r4 == 0) goto Lc2
            yz5.l r1 = r1.getOnItemReleased()
            if (r1 == 0) goto Lc2
            r1.invoke(r4)
        Lc2:
            r3.f449922b = r2
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.e7.onSelectedChanged(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
    }
}
