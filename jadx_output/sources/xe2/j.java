package xe2;

/* loaded from: classes3.dex */
public final class j extends we2.z {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        com.tencent.mm.protobuf.g byteString;
        kotlin.jvm.internal.o.g(msgList, "msgList");
        java.util.Iterator it = msgList.iterator();
        while (it.hasNext()) {
            r45.ch1 ch1Var = (r45.ch1) it.next();
            int integer = ch1Var.getInteger(1);
            r45.lk1 lk1Var = null;
            r45.ch1 ch1Var2 = null;
            lk1Var = null;
            if (integer == 20038) {
                mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
                if (c1Var != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it6 = msgList.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it6.next();
                        if (((r45.ch1) next).getInteger(1) == 20038) {
                            arrayList.add(next);
                        }
                    }
                    java.util.Iterator it7 = arrayList.iterator();
                    if (it7.hasNext()) {
                        ?? next2 = it7.next();
                        if (it7.hasNext()) {
                            long j17 = ((r45.ch1) next2).getLong(12);
                            do {
                                java.lang.Object next3 = it7.next();
                                long j18 = ((r45.ch1) next3).getLong(12);
                                next2 = next2;
                                if (j17 < j18) {
                                    next2 = next3;
                                    j17 = j18;
                                }
                            } while (it7.hasNext());
                        }
                        ch1Var2 = next2;
                    }
                    r45.ch1 ch1Var3 = ch1Var2;
                    if (ch1Var3 != null && (byteString = ch1Var3.getByteString(4)) != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localCheerInfo:");
                        mm2.v0 v0Var = c1Var.E3;
                        sb6.append(v0Var);
                        java.lang.String sb7 = sb6.toString();
                        java.lang.String str = c1Var.f328800f;
                        com.tencent.mars.xlog.Log.i(str, sb7);
                        if (v0Var.f329472e == 0) {
                            r45.mk1 mk1Var = new r45.mk1();
                            try {
                                mk1Var.parseFrom(byteString.g());
                            } catch (java.lang.Exception e17) {
                                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                            }
                            com.tencent.mars.xlog.Log.i(str, "remoteCheerInfo:" + pm0.b0.g(mk1Var));
                            c1Var.O9((r45.on1) mk1Var.getCustom(0));
                        }
                    }
                }
            } else if (integer == 20075) {
                r45.lk1 lk1Var2 = new r45.lk1();
                com.tencent.mm.protobuf.g byteString2 = ch1Var.getByteString(4);
                byte[] g17 = byteString2 != null ? byteString2.g() : null;
                if (g17 != null) {
                    try {
                        lk1Var2.parseFrom(g17);
                        lk1Var = lk1Var2;
                    } catch (java.lang.Exception e18) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                    }
                }
                ((mm2.l0) this.f445267a.a(mm2.l0.class)).P6(lk1Var);
            }
        }
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20038, 20075};
    }
}
