package ic2;

/* loaded from: classes8.dex */
public final class p0 implements ya2.x1 {
    public final void a(r45.hx0 hx0Var, boolean z17) {
        r45.vs2 vs2Var;
        java.util.ArrayList arrayList = null;
        if (z17) {
            r45.ts5 ts5Var = new r45.ts5();
            com.tencent.mm.protobuf.g byteString = hx0Var.getByteString(1);
            ts5Var.parseFrom(byteString != null ? byteString.g() : null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processGetFinderPopup revoke ");
            java.util.LinkedList list = ts5Var.getList(0);
            if (list != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r45.at5) it.next()).getString(0));
                }
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("Finder.SyncHandler", sb6.toString());
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            java.util.LinkedList list2 = ts5Var.getList(0);
            kotlin.jvm.internal.o.f(list2, "getRevoked_finder_popup_info(...)");
            nk6.J("Finder.SyncHandler", list2);
            return;
        }
        r45.dp2 dp2Var = new r45.dp2();
        com.tencent.mm.protobuf.g byteString2 = hx0Var.getByteString(1);
        dp2Var.parseFrom(byteString2 != null ? byteString2.g() : null);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("processGetFinderPopup show popup ");
        java.util.LinkedList list3 = dp2Var.getList(0);
        if (list3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list3, 10));
            java.util.Iterator it6 = list3.iterator();
            while (it6.hasNext()) {
                r45.gz2 gz2Var = (r45.gz2) ((r45.gp2) it6.next()).getCustom(0);
                arrayList2.add(hc2.u0.e(gz2Var != null ? (r45.vs2) gz2Var.getCustom(0) : null));
            }
            arrayList = arrayList2;
        }
        sb7.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.SyncHandler", sb7.toString());
        java.util.LinkedList list4 = dp2Var.getList(0);
        if (list4 != null) {
            java.util.Iterator it7 = list4.iterator();
            while (it7.hasNext()) {
                r45.gz2 gz2Var2 = (r45.gz2) ((r45.gp2) it7.next()).getCustom(0);
                if (gz2Var2 != null && (vs2Var = (r45.vs2) gz2Var2.getCustom(0)) != null) {
                    zy2.fa.D(((c61.l7) i95.n0.c(c61.l7.class)).nk(), vs2Var, "processGetFinderPopup", null, false, null, 28, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x010d, code lost:
    
        if (r11 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
    
        if (r7 != false) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v142, types: [com.tencent.mm.plugin.finder.storage.r, l75.n0] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    @Override // ya2.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j7(r45.hx0 r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 2582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ic2.p0.j7(r45.hx0, int, int):void");
    }
}
