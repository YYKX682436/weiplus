package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class i4 {

    /* renamed from: a, reason: collision with root package name */
    public wa4.j f164298a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f164299b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f164300c = "";

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f164301d = new java.util.Vector();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f164302e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f164303f = new java.util.Vector();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f164304g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.h4 f164305h;

    public i4(java.lang.String str) {
        boolean z17;
        this.f164299b = str;
        synchronized (this) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            z17 = false;
            byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
            if (N == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            } else {
                try {
                    this.f164298a = (wa4.j) new wa4.j().parseFrom(N);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    z17 = true;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsAsyncQueueMgr", e17, "", new java.lang.Object[0]);
                    com.tencent.mm.vfs.w6.h(this.f164299b);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                }
            }
        }
        if (!z17) {
            this.f164298a = new wa4.j();
        }
        this.f164301d.clear();
        this.f164302e.clear();
    }

    public static void i(long j17, java.util.LinkedList linkedList, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        j(j17, linkedList, str, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public static boolean j(long j17, java.util.LinkedList linkedList, java.lang.String str, boolean z17) {
        wa4.m mVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                mVar = null;
                break;
            }
            mVar = (wa4.m) it.next();
            if (mVar.f444260e.f379203d == j17 && (z17 || mVar.f444259d.equals(str))) {
                break;
            }
        }
        if (mVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        linkedList.remove(mVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    public static r45.e86 l(r45.l76 l76Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fromAcitonToCommentInfo", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        r45.k76 k76Var = l76Var.f379205f;
        r45.k76 k76Var2 = l76Var.f379206g;
        r45.e86 e86Var = new r45.e86();
        e86Var.f373130h = k76Var.f378465n;
        e86Var.f373131i = k76Var.f378464m;
        e86Var.f373127e = k76Var.f378460f;
        e86Var.f373128f = k76Var.f378463i;
        e86Var.f373129g = k76Var.f378462h;
        e86Var.f373126d = k76Var.f378458d;
        e86Var.f373132m = k76Var.f378467p;
        e86Var.f373137r = k76Var.f378470s;
        e86Var.f373139t = k76Var.f378472u;
        e86Var.f373134o = k76Var2.f378458d;
        e86Var.f373136q = k76Var2.f378469r;
        e86Var.f373133n = k76Var2.f378466o;
        e86Var.f373140u = k76Var.f378474w;
        e86Var.f373141v = k76Var.f378475x;
        e86Var.f373144y = k76Var.f378477z;
        e86Var.A = k76Var.B;
        e86Var.f373145z = k76Var.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fromAcitonToCommentInfo", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return e86Var;
    }

    public static boolean n(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        if (str.startsWith("_AD_TAG_")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return false;
    }

    public synchronized boolean A(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        ((java.util.Vector) this.f164303f).remove(java.lang.Integer.valueOf(i17));
        ((java.util.HashMap) this.f164304g).remove(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    public void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerUpdate", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        com.tencent.mm.plugin.sns.model.h4 h4Var = this.f164305h;
        if (h4Var != null) {
            com.tencent.mm.plugin.sns.ui.improve.component.header.o0 o0Var = (com.tencent.mm.plugin.sns.ui.improve.component.header.o0) h4Var;
            o0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$4");
            com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC.access$getErrorPostHandle(o0Var.f168859a).a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$onCreate$4");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerUpdate", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public boolean a(java.lang.String str, r45.l76 l76Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        boolean b17 = b(str, l76Var, "", i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return b17;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd A[Catch: all -> 0x00cd, TryCatch #0 {, blocks: (B:3:0x0001, B:17:0x00b7, B:19:0x00bd, B:20:0x00c4, B:25:0x0039, B:26:0x00b6, B:27:0x0048, B:28:0x0050, B:29:0x0058, B:31:0x0060, B:33:0x0086, B:35:0x0096, B:36:0x00a1, B:37:0x00a9), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b(java.lang.String r11, r45.l76 r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.i4.b(java.lang.String, r45.l76, java.lang.String, int):boolean");
    }

    public synchronized void c(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        wa4.o oVar = new wa4.o();
        oVar.f444270d = j17;
        oVar.f444271e = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        this.f164298a.f444248h.add(oVar);
        r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public synchronized boolean d(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadingId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (((java.util.HashMap) this.f164302e).containsKey(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadingId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        ((java.util.HashMap) this.f164302e).put(str, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadingId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    public synchronized boolean e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (((java.util.Vector) this.f164303f).contains(java.lang.Integer.valueOf(i17))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        ((java.util.Vector) this.f164303f).add(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    public final void f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkImageCmtToUpload", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        java.util.LinkedList linkedList = this.f164298a.f444245e;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAsyncQueueMgr", "notifyCommentWhenImageUploaded >> localId: %s queueSize: %d", str, java.lang.Integer.valueOf(linkedList.size()));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            wa4.m mVar = (wa4.m) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAsyncQueueMgr", "notifyCommentWhenImageUploaded clientId: %s, state: %d", mVar.f444259d, java.lang.Integer.valueOf(mVar.f444263h));
            if (mVar.f444263h == 1) {
                r45.d86 d86Var = (r45.d86) mVar.f444260e.f379205f.B.getFirst();
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAsyncQueueMgr", "notifyCommentWhenImageUploaded uploading >> localId: %s", str);
                if (d86Var.f372239t.equals(str)) {
                    int a17 = com.tencent.mm.plugin.sns.model.l4.zj().a(d86Var);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsAsyncQueueMgr", "notifyCommentWhenImageUploaded checkState: %d", java.lang.Integer.valueOf(a17));
                    mVar.f444263h = a17;
                    if (a17 == 2) {
                        if (n(mVar.f444259d)) {
                            gm0.j1.i();
                            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.i2(mVar.f444260e, mVar.f444259d, mVar.f444262g, 0));
                        } else {
                            gm0.j1.i();
                            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n2(mVar.f444260e, mVar.f444259d, mVar.f444264i));
                        }
                    } else if (a17 == 3) {
                        int b17 = com.tencent.mm.plugin.sns.model.l4.zj().b(d86Var);
                        int i17 = b17 != 0 ? 2 : 1;
                        if (b17 != 0) {
                            a17 = b17;
                        }
                        com.tencent.mm.plugin.sns.ui.widget.r2.f171259a.e(mVar.f444260e, a17, i17);
                        com.tencent.mm.plugin.sns.model.l4.xj().v(mVar.f444260e.f379203d, 2, mVar.f444259d);
                        k(mVar.f444260e.f379203d, 2, (int) com.tencent.mm.sdk.platformtools.t8.i1(), null);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkImageCmtToUpload", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        return;
                    }
                } else {
                    continue;
                }
            }
        }
        r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkImageCmtToUpload", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkQueue", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        synchronized (this) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            if (!h(this.f164298a.f444244d)) {
                if (!h(this.f164298a.f444245e)) {
                    if (!h(this.f164298a.f444246f)) {
                        if (!h(this.f164298a.f444247g)) {
                            while (true) {
                                if (!this.f164298a.f444248h.isEmpty()) {
                                    wa4.o oVar = (wa4.o) this.f164298a.f444248h.getFirst();
                                    if (com.tencent.mm.sdk.platformtools.t8.H1(oVar.f444271e) <= 21600) {
                                        long j17 = oVar.f444270d;
                                        gm0.j1.i();
                                        gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.q2(j17, 1));
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                                        break;
                                    }
                                    this.f164298a.f444248h.removeFirst();
                                } else {
                                    while (true) {
                                        if (!this.f164298a.f444249i.isEmpty()) {
                                            wa4.o oVar2 = (wa4.o) this.f164298a.f444249i.getFirst();
                                            if (com.tencent.mm.sdk.platformtools.t8.H1(oVar2.f444271e) <= 21600) {
                                                long j18 = oVar2.f444270d;
                                                gm0.j1.i();
                                                gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.q2(j18, 5));
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                                                break;
                                            }
                                            this.f164298a.f444249i.removeFirst();
                                        } else {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        }
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                }
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkQueue", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(java.util.LinkedList r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.i4.h(java.util.LinkedList):boolean");
    }

    public void k(long j17, int i17, int i18, r45.wa6 wa6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("failedComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAsyncQueueMgr", "failedComment snsId:%s, type:%s, failOpTime:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 22) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("failedComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return;
        }
        wa4.n nVar = new wa4.n();
        nVar.f444265d = j17;
        nVar.f444266e = i18;
        nVar.f444267f = i17;
        if (wa6Var != null) {
            nVar.f444268g = wa6Var.f389016f;
            nVar.f444269h = wa6Var.f389017g;
        }
        this.f164298a.f444250m.add(nVar);
        gm0.j1.u().c().w(589825, java.lang.Boolean.TRUE);
        B();
        if (!r()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsAsyncQueueMgr", "failedComment error listToFile");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("failedComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public synchronized int m() {
        int size;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDownLoadingSize", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        size = ((java.util.HashMap) this.f164302e).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDownLoadingSize", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return size;
    }

    public synchronized boolean o(java.lang.String str) {
        boolean containsKey;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        containsKey = ((java.util.HashMap) this.f164302e).containsKey(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return containsKey;
    }

    public final boolean p(java.util.LinkedList linkedList, r45.e86 e86Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (com.tencent.mm.sdk.platformtools.t8.K0(e86Var.f373130h) && e86Var.f373141v == 0 && e86Var.f373145z == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return true;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.e86 e86Var2 = (r45.e86) it.next();
            if (e86Var.f373130h.equals(e86Var2.f373130h) && e86Var.f373141v == e86Var2.f373141v && e86Var.f373145z == e86Var2.f373145z && i17 == e86Var2.f373131i) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return false;
    }

    public synchronized boolean q(int i17) {
        boolean contains;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPosting", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        contains = ((java.util.Vector) this.f164301d).contains(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPosting", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return contains;
    }

    public final synchronized boolean r() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("listToFile", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        try {
            byte[] byteArray = this.f164298a.toByteArray();
            z17 = com.tencent.mm.vfs.w6.S(this.f164299b, byteArray, 0, byteArray.length) == 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("listToFile", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsAsyncQueueMgr", e17, "listToFile failed: " + this.f164299b, new java.lang.Object[0]);
            com.tencent.mm.vfs.w6.h(this.f164299b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("listToFile", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        return z17;
    }

    public synchronized com.tencent.mm.protocal.protobuf.SnsObject s(com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("merge", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f164300c)) {
            this.f164300c = c01.z1.r();
        }
        if (this.f164298a.f444244d.size() == 0 && this.f164298a.f444245e.size() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("merge", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return snsObject;
        }
        long j17 = snsObject.Id;
        java.util.Iterator it = this.f164298a.f444244d.iterator();
        while (it.hasNext()) {
            wa4.m mVar = (wa4.m) it.next();
            r45.e86 l17 = l(mVar.f444260e);
            if (mVar.f444260e.f379203d == j17 && !p(snsObject.LikeUserList, l17, l17.f373131i)) {
                snsObject.LikeUserList.add(l17);
                snsObject.LikeCount++;
            }
        }
        java.util.Iterator<r45.e86> it6 = snsObject.LikeUserList.iterator();
        while (it6.hasNext()) {
            r45.e86 next = it6.next();
            if (next.f373126d.equals(this.f164300c)) {
                java.util.Iterator it7 = this.f164298a.f444249i.iterator();
                boolean z17 = false;
                while (it7.hasNext()) {
                    if (((wa4.o) it7.next()).f444270d == j17) {
                        snsObject.LikeUserList.remove(next);
                        snsObject.LikeCount--;
                        z17 = true;
                    }
                }
                if (z17) {
                    break;
                }
            }
        }
        java.util.Iterator it8 = this.f164298a.f444245e.iterator();
        while (it8.hasNext()) {
            r45.l76 l76Var = ((wa4.m) it8.next()).f444260e;
            if (l76Var.f379203d == j17) {
                r45.e86 l18 = l(l76Var);
                if (!p(snsObject.CommentUserList, l18, l18.f373131i)) {
                    snsObject.CommentUserList.add(l18);
                    snsObject.CommentCount++;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("merge", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return snsObject;
    }

    public synchronized boolean t(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        ((java.util.HashMap) this.f164304g).put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    public wa4.n u(int i17) {
        wa4.n nVar;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        java.util.Iterator it = this.f164298a.f444250m.iterator();
        while (true) {
            if (!it.hasNext()) {
                nVar = null;
                break;
            }
            nVar = (wa4.n) it.next();
            if (i17 == nVar.f444266e) {
                break;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        if (nVar == null) {
            str = "null";
        } else {
            str = "snsID:" + nVar.f444265d + ", opTime:" + nVar.f444266e + ", type:" + nVar.f444267f;
        }
        objArr[1] = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAsyncQueueMgr", "removeByOpTime failOpTime:%s, toDel:%s", objArr);
        if (nVar != null) {
            this.f164298a.f444250m.remove(nVar);
            if (!r()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsAsyncQueueMgr", "removeByOpTime error listToFile");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return nVar;
    }

    public void v(long j17, int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        int i18 = com.tencent.mm.plugin.sns.model.s5.f164676d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        java.util.Map map = com.tencent.mm.plugin.sns.model.s5.f164678f;
        if (map != null) {
            ((java.util.concurrent.ConcurrentHashMap) map).clear();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        synchronized (this) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeCommentImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            if (i17 == 1) {
                i(j17, this.f164298a.f444244d, str);
            } else if (i17 == 2) {
                i(j17, this.f164298a.f444245e, str);
            } else if (i17 == 3) {
                i(j17, this.f164298a.f444246f, str);
            } else if (i17 != 5) {
                if (i17 != 16) {
                    if (i17 == 7) {
                        i(j17, this.f164298a.f444244d, str);
                    } else if (i17 != 8) {
                    }
                }
                i(j17, this.f164298a.f444245e, str);
            } else {
                i(j17, this.f164298a.f444247g, str);
            }
            r();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeCommentImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public void w(long j17) {
        wa4.o oVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        synchronized (this) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDelItemImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            java.util.Iterator it = this.f164298a.f444248h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    oVar = null;
                    break;
                } else {
                    oVar = (wa4.o) it.next();
                    if (oVar.f444270d == j17) {
                        break;
                    }
                }
            }
            if (oVar != null) {
                this.f164298a.f444248h.remove(oVar);
            }
            r();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDelItemImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public void x(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeLikedCancel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        y(j17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeLikedCancel", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    public final synchronized boolean y(long j17) {
        wa4.o oVar;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeLikedCancelImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        java.util.Iterator it = this.f164298a.f444249i.iterator();
        while (true) {
            if (!it.hasNext()) {
                oVar = null;
                break;
            }
            oVar = (wa4.o) it.next();
            if (oVar.f444270d == j17) {
                break;
            }
        }
        if (oVar != null) {
            this.f164298a.f444249i.remove(oVar);
            z17 = true;
        } else {
            z17 = false;
        }
        r();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeLikedCancelImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return z17;
    }

    public synchronized boolean z(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removePostId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        ((java.util.Vector) this.f164301d).remove(java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removePostId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }
}
