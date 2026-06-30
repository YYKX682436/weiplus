package yf2;

/* loaded from: classes3.dex */
public final class t1 extends if2.b implements jm2.d, if2.e {

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f461789m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public static final void Z6(yf2.t1 t1Var, java.util.LinkedList linkedList, r45.fd2 fd2Var) {
        t1Var.getClass();
        if (linkedList != null) {
            java.util.LinkedList linkedList2 = linkedList.isEmpty() ^ true ? linkedList : null;
            if (linkedList2 == null || linkedList2.isEmpty()) {
                return;
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.getClass();
            y4Var.f328316x = "";
            if (fd2Var != null) {
                t1Var.c7(fd2Var);
            }
            t1Var.f461789m = linkedList;
        }
    }

    public final void a7(boolean z17, java.util.LinkedList linkedList) {
        java.util.ArrayList arrayList;
        android.content.Intent intent = new android.content.Intent();
        android.content.Context O6 = O6();
        jz2.x0 x0Var = jz2.x0.f302754a;
        intent.setClass(O6, (java.lang.Class) ((jz5.n) jz2.x0.f302760g).getValue());
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((r45.fd2) it.next()).toByteArray());
            }
        } else {
            arrayList = null;
        }
        intent.putExtra("KEY_TAG_INFO", arrayList instanceof java.io.Serializable ? arrayList : null);
        intent.putExtra("KEY_HAS_NEXT_ACTION", z17);
        com.tencent.mm.ui.MMActivity N6 = N6();
        if (N6 != null) {
            N6.startActivityForResult(intent, 1003);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x002f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0061, code lost:
    
        if (r4 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r0 == 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b7() {
        /*
            r8 = this;
            jz5.g r0 = ae2.in.f3717c8
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 0
            r2 = 1
            java.lang.String r3 = "FinderLiveCreateLivePrepareSwitch"
            if (r0 == 0) goto L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "isLiveCategoryRequired configValue="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r3, r4)
            if (r0 != r2) goto L2f
        L2d:
            r0 = r2
            goto L64
        L2f:
            r0 = r1
            goto L64
        L31:
            long r4 = hl2.a.f282100b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "FINDER_LIVE_CREATE_LIVE_PREPARE_SWITCH_FLAG: "
            r0.<init>(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "FINDER_LIVE_CREATE_LIVE_PREPARE_SWITCH_FLAG isLiveCategoryRequired: "
            r0.<init>(r6)
            r6 = 8
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L56
            r5 = r2
            goto L57
        L56:
            r5 = r1
        L57:
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            if (r4 == 0) goto L2f
            goto L2d
        L64:
            if (r0 == 0) goto Lde
            java.lang.Class<mm2.s1> r0 = mm2.s1.class
            androidx.lifecycle.c1 r0 = r8.business(r0)
            mm2.s1 r0 = (mm2.s1) r0
            boolean r0 = r0.A
            if (r0 != 0) goto Lde
            zl2.r4 r0 = zl2.r4.f473950a
            java.lang.Class<mm2.g1> r3 = mm2.g1.class
            androidx.lifecycle.c1 r4 = r8.business(r3)
            mm2.g1 r4 = (mm2.g1) r4
            kotlinx.coroutines.flow.j2 r4 = r4.f329068f
            kotlinx.coroutines.flow.h3 r4 = (kotlinx.coroutines.flow.h3) r4
            java.lang.Object r4 = r4.getValue()
            r45.q12 r4 = (r45.q12) r4
            boolean r4 = r0.T1(r4)
            if (r4 != 0) goto La5
            androidx.lifecycle.c1 r4 = r8.business(r3)
            mm2.g1 r4 = (mm2.g1) r4
            kotlinx.coroutines.flow.j2 r4 = r4.f329068f
            kotlinx.coroutines.flow.h3 r4 = (kotlinx.coroutines.flow.h3) r4
            java.lang.Object r4 = r4.getValue()
            r45.q12 r4 = (r45.q12) r4
            boolean r0 = r0.X1(r4)
            if (r0 == 0) goto La3
            goto La5
        La3:
            r0 = r1
            goto La6
        La5:
            r0 = r2
        La6:
            if (r0 != 0) goto Lde
            androidx.lifecycle.c1 r0 = r8.business(r3)
            mm2.g1 r0 = (mm2.g1) r0
            kotlinx.coroutines.flow.j2 r0 = r0.f329072m
            kotlinx.coroutines.flow.h3 r0 = (kotlinx.coroutines.flow.h3) r0
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto Ldf
            androidx.lifecycle.c1 r0 = r8.business(r3)
            mm2.g1 r0 = (mm2.g1) r0
            kotlinx.coroutines.flow.j2 r0 = r0.f329072m
            kotlinx.coroutines.flow.h3 r0 = (kotlinx.coroutines.flow.h3) r0
            java.lang.Object r0 = r0.getValue()
            r45.fd2 r0 = (r45.fd2) r0
            if (r0 == 0) goto Lcf
            java.lang.String r0 = r0.getString(r2)
            goto Ld0
        Lcf:
            r0 = 0
        Ld0:
            if (r0 == 0) goto Ldb
            int r0 = r0.length()
            if (r0 != 0) goto Ld9
            goto Ldb
        Ld9:
            r0 = r1
            goto Ldc
        Ldb:
            r0 = r2
        Ldc:
            if (r0 != 0) goto Ldf
        Lde:
            r1 = r2
        Ldf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yf2.t1.b7():boolean");
    }

    public final void c7(r45.fd2 fd2Var) {
        java.lang.String string = fd2Var.getString(1);
        boolean z17 = false;
        if (!(string == null || string.length() == 0)) {
            r45.fd2 fd2Var2 = (r45.fd2) fd2Var.getCustom(3);
            java.lang.String string2 = fd2Var2 != null ? fd2Var2.getString(1) : null;
            if (!(string2 == null || string2.length() == 0)) {
                r45.fd2 fd2Var3 = (r45.fd2) fd2Var.getCustom(3);
                if (fd2Var3 != null && fd2Var3.getInteger(4) == 1) {
                    z17 = true;
                }
                if (z17) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(fd2Var.getString(1));
                    sb6.append('-');
                    r45.fd2 fd2Var4 = (r45.fd2) fd2Var.getCustom(3);
                    sb6.append(fd2Var4 != null ? fd2Var4.getString(1) : null);
                    java.lang.String sb7 = sb6.toString();
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.y4 y4Var = ml2.j0.f327583i;
                    y4Var.getClass();
                    kotlin.jvm.internal.o.g(sb7, "<set-?>");
                    y4Var.f328316x = sb7;
                } else {
                    r45.fd2 fd2Var5 = (r45.fd2) fd2Var.getCustom(3);
                    java.lang.String string3 = fd2Var5 != null ? fd2Var5.getString(1) : null;
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                    ml2.y4 y4Var2 = ml2.j0.f327583i;
                    if (string3 == null) {
                        string3 = "";
                    }
                    y4Var2.getClass();
                    y4Var2.f328316x = string3;
                }
            }
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.y4 y4Var3 = ml2.j0.f327583i;
        java.lang.String string4 = fd2Var.getString(1);
        java.lang.String str = string4 != null ? string4 : "";
        y4Var3.getClass();
        y4Var3.f328315w = str;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.o1(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.q1(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.s1(this, null), 3, null);
    }
}
