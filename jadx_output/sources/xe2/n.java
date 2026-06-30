package xe2;

/* loaded from: classes3.dex */
public final class n extends we2.x {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f453883a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f453884b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f453885c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f453886d;

    public n(gk2.e liveContext) {
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453883a = liveContext;
        this.f453884b = "LiveCommentMsgInterceptor";
        this.f453885c = true;
        this.f453886d = true;
        ae2.in inVar = ae2.in.f3688a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.R1).getValue()).r()).intValue() == 0;
        this.f453885c = z17;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.S1).getValue()).r()).intValue() == 0;
        this.f453886d = z18;
        com.tencent.mars.xlog.Log.i("LiveCommentMsgInterceptor", "saveMyselfCommentValue:" + z18 + ", sendLocalGiftToMsgValue :" + z17);
    }

    @Override // we2.x
    public boolean b(we2.b respWrapper) {
        java.util.ArrayList<r45.ch1> arrayList;
        java.util.ArrayList<r45.t12> arrayList2;
        int i17;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.util.LinkedList list3;
        java.util.LinkedList list4;
        kotlin.jvm.internal.o.g(respWrapper, "respWrapper");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.r71 r71Var = respWrapper.f445214a;
        if (r71Var == null || (list4 = r71Var.getList(14)) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list4) {
                if (kz5.z.F(((we2.s) this.f453883a.a(we2.s.class)).f445255g.f(), ((r45.ch1) obj).getInteger(1))) {
                    arrayList.add(obj);
                }
            }
        }
        if (!(arrayList != null && (arrayList.isEmpty() ^ true))) {
            arrayList = null;
        }
        if (arrayList != null) {
            for (r45.ch1 ch1Var : arrayList) {
                zl2.r4 r4Var = zl2.r4.f473950a;
                r4Var.M2(this.f453884b, "LiveCommentMsgInterceptor before extraFilter msg_type:" + ch1Var.getInteger(1));
                if (ch1Var.getInteger(1) == 20035) {
                    com.tencent.mars.xlog.Log.i(this.f453884b, "[MMFinder_LiveAppMsg_Type_Location] msg = " + pm0.b0.g(ch1Var));
                }
                dk2.zf b17 = ((we2.s) this.f453883a.a(we2.s.class)).f445255g.b(ch1Var);
                if (b17 != null) {
                    if (!f(b17)) {
                        b17 = null;
                    }
                    if (b17 != null) {
                        r4Var.M2(this.f453884b, "LiveCommentMsgInterceptor after extraFilter msg_type:" + b17.getType());
                        if (!((mm2.c1) this.f453883a.a(mm2.c1.class)).Y6(b17)) {
                            linkedList.add(b17);
                            ((mm2.c1) this.f453883a.a(mm2.c1.class)).N6(b17);
                        }
                    }
                }
            }
        }
        r45.r71 r71Var2 = respWrapper.f445214a;
        if (r71Var2 != null && (list3 = r71Var2.getList(14)) != null) {
            kotlin.jvm.internal.m0.a(list3).removeAll(linkedList);
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.r71 r71Var3 = respWrapper.f445214a;
        if (r71Var3 == null || (list2 = r71Var3.getList(2)) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                if (kz5.z.F(((we2.s) this.f453883a.a(we2.s.class)).f445255g.f(), ((r45.t12) obj2).getInteger(3))) {
                    arrayList2.add(obj2);
                }
            }
        }
        if (!(arrayList2 != null && (arrayList2.isEmpty() ^ true))) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            for (r45.t12 t12Var : arrayList2) {
                we2.s sVar = (we2.s) this.f453883a.a(we2.s.class);
                kotlin.jvm.internal.o.d(t12Var);
                dk2.zf c17 = sVar.f445255g.c(t12Var);
                if (c17 != null) {
                    if (!f(c17)) {
                        c17 = null;
                    }
                    if (c17 != null && !((mm2.c1) this.f453883a.a(mm2.c1.class)).Y6(c17)) {
                        linkedList2.add(c17);
                        ((mm2.c1) this.f453883a.a(mm2.c1.class)).N6(c17);
                    }
                }
            }
        }
        r45.r71 r71Var4 = respWrapper.f445214a;
        if (r71Var4 != null && (list = r71Var4.getList(2)) != null) {
            kotlin.jvm.internal.m0.a(list).removeAll(linkedList2);
        }
        linkedList.addAll(linkedList2);
        kz5.g0.t(linkedList, new xe2.m());
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : linkedList) {
            long m17 = ((dk2.zf) obj3).m();
            java.util.List list5 = ((mm2.x4) this.f453883a.a(mm2.x4.class)).f329533n;
            kotlin.jvm.internal.o.f(list5, "<get-cacheDataList>(...)");
            synchronized (list5) {
                java.util.Iterator it = list5.iterator();
                i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (((dk2.zf) it.next()).m() == m17) {
                        break;
                    }
                    i17++;
                }
            }
            if (i17 == -1) {
                arrayList3.add(obj3);
            }
        }
        linkedList3.addAll(arrayList3);
        e(linkedList3);
        return true;
    }

    public final void d(java.lang.String str, com.tencent.mm.protobuf.g gVar, dk2.zf zfVar) {
        com.tencent.mm.api.IEmojiInfo Bi = ((com.tencent.mm.feature.emoji.t2) ((com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class))).Bi(str, gVar);
        com.tencent.mars.xlog.Log.i(this.f453884b, "[addMsgAfterEmojiLoaded] msgClientId = " + zfVar.v() + ", md5 = " + str + ", cdnUrl = " + ((com.tencent.mm.storage.emotion.EmojiInfo) Bi).field_cdnUrl);
        ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).wi(Bi, new xe2.l(this, Bi, zfVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0168 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.LinkedList r14) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.n.e(java.util.LinkedList):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x026f, code lost:
    
        if (kotlin.jvm.internal.o.b(r0, xy2.c.e(r3)) != false) goto L128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00c3 A[EDGE_INSN: B:156:0x00c3->B:157:0x00c3 BREAK  A[LOOP:0: B:124:0x0052->B:199:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[LOOP:0: B:124:0x0052->B:199:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0316  */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(dk2.zf r15) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.n.f(dk2.zf):boolean");
    }

    public final boolean g(java.lang.String str) {
        if (str == null) {
            return false;
        }
        if (!(str.length() > 0)) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        java.util.List list = ((mm2.x4) this.f453883a.a(mm2.x4.class)).f329544y;
        return kotlin.jvm.internal.o.b(list != null ? java.lang.Boolean.valueOf(list.contains(str)) : null, java.lang.Boolean.TRUE);
    }
}
