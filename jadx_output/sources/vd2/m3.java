package vd2;

/* loaded from: classes2.dex */
public final class m3 {

    /* renamed from: a, reason: collision with root package name */
    public static final vd2.m3 f435809a = new vd2.m3();

    public final java.util.Map a() {
        jz5.l[] lVarArr = new jz5.l[3];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        lVarArr[2] = new jz5.l("finder_tab_context_id", c17 != null ? c17 : "");
        return kz5.c1.k(lVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if ((r7 != null && r7.getNative_type() == 34) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da A[EDGE_INSN: B:42:0x00da->B:43:0x00da BREAK  A[LOOP:2: B:17:0x0087->B:50:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[LOOP:2: B:17:0x0087->B:50:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(in5.s0 r13, com.tencent.mm.plugin.finder.model.BaseFinderFeed r14) {
        /*
            r12 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.g(r14, r0)
            pf5.u r0 = pf5.u.f353936a
            java.lang.String r1 = "getContext(...)"
            android.content.Context r13 = r13.f293121e
            kotlin.jvm.internal.o.f(r13, r1)
            pf5.v r1 = r0.b(r13)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r2 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r1 = r1.a(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r1 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r1
            r45.qt2 r1 = r1.V6()
            r2 = 5
            int r1 = r1.getInteger(r2)
            boolean r2 = r13 instanceof com.tencent.mm.ui.MMActivity
            r3 = 0
            if (r2 == 0) goto L30
            com.tencent.mm.ui.MMActivity r13 = (com.tencent.mm.ui.MMActivity) r13
            goto L31
        L30:
            r13 = r3
        L31:
            r2 = 0
            if (r13 != 0) goto L35
            return r2
        L35:
            long r4 = r14.getItemId()
            java.lang.Class<zy2.b6> r13 = zy2.b6.class
            pf5.v r13 = r0.e(r13)
            java.lang.Class<xc2.k0> r0 = xc2.k0.class
            androidx.lifecycle.c1 r13 = r13.a(r0)
            xc2.k0 r13 = (xc2.k0) r13
            java.lang.String r14 = r14.w()
            androidx.lifecycle.j0 r13 = r13.W6(r4, r1, r14)
            java.lang.Object r13 = r13.getValue()
            java.util.Set r13 = (java.util.Set) r13
            if (r13 == 0) goto Le1
            java.util.Iterator r13 = r13.iterator()
            r14 = r2
        L5c:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Le0
            java.lang.Object r0 = r13.next()
            xc2.t r0 = (xc2.t) r0
            java.util.List r0 = r0.f453302d
            java.util.Iterator r0 = r0.iterator()
        L6e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5c
            java.lang.Object r1 = r0.next()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r1
            java.util.LinkedList r4 = r1.getStyle()
            java.lang.String r5 = "getStyle(...)"
            kotlin.jvm.internal.o.f(r4, r5)
            java.util.Iterator r4 = r4.iterator()
        L87:
            boolean r5 = r4.hasNext()
            r6 = 1
            if (r5 == 0) goto Ld9
            java.lang.Object r5 = r4.next()
            r7 = r5
            r45.wf6 r7 = (r45.wf6) r7
            r8 = 2
            int r9 = r7.getInteger(r8)
            r10 = 14
            if (r9 == r10) goto Ld5
            int r9 = r7.getInteger(r8)
            r11 = 16
            if (r9 == r11) goto Ld5
            int r7 = r7.getInteger(r8)
            r8 = 24
            if (r7 != r8) goto Ld3
            com.tencent.mm.protocal.protobuf.NativeInfo r7 = r1.getNative_info()
            if (r7 == 0) goto Lbc
            int r7 = r7.getNative_type()
            if (r7 != r10) goto Lbc
            r7 = r6
            goto Lbd
        Lbc:
            r7 = r2
        Lbd:
            if (r7 != 0) goto Ld5
            com.tencent.mm.protocal.protobuf.NativeInfo r7 = r1.getNative_info()
            if (r7 == 0) goto Lcf
            int r7 = r7.getNative_type()
            r8 = 34
            if (r7 != r8) goto Lcf
            r7 = r6
            goto Ld0
        Lcf:
            r7 = r2
        Ld0:
            if (r7 == 0) goto Ld3
            goto Ld5
        Ld3:
            r7 = r2
            goto Ld6
        Ld5:
            r7 = r6
        Ld6:
            if (r7 == 0) goto L87
            goto Lda
        Ld9:
            r5 = r3
        Lda:
            r45.wf6 r5 = (r45.wf6) r5
            if (r5 == 0) goto L6e
            r14 = r6
            goto L6e
        Le0:
            r2 = r14
        Le1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vd2.m3.b(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):boolean");
    }

    public final boolean c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            if (!(layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
                layoutManager = null;
            }
            if (layoutManager != null && (adapter = recyclerView.getAdapter()) != null) {
                androidx.recyclerview.widget.f2 f2Var = adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? adapter : null;
                if (f2Var != null) {
                    androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
                    int w17 = linearLayoutManager.w();
                    int y17 = linearLayoutManager.y();
                    java.util.List data = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var).getData();
                    int size = data.size();
                    if (w17 <= y17) {
                        while (true) {
                            if (!(w17 >= 0 && w17 < size) || !(data.get(w17) instanceof so2.i1)) {
                                if (w17 == y17) {
                                    break;
                                }
                                w17++;
                            } else {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
