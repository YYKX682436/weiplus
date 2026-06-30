package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class vo extends com.tencent.mm.plugin.sns.ui.o {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f170698c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f170700e;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.uo f170705j;

    /* renamed from: l, reason: collision with root package name */
    public ca4.l f170707l;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f170699d = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f170701f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f170702g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f170703h = "";

    /* renamed from: i, reason: collision with root package name */
    public boolean f170704i = false;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Comparator f170706k = new com.tencent.mm.plugin.sns.ui.to(this);

    public vo(com.tencent.mm.plugin.sns.ui.uo uoVar, java.lang.String str, boolean z17) {
        this.f170698c = "";
        this.f170700e = false;
        this.f170705j = uoVar;
        this.f170698c = str;
        this.f170700e = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (r2.moveToFirst() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r4 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        r4.convertFrom(r2);
        r3.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0072, code lost:
    
        if (r2.moveToNext() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r2.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    @Override // com.tencent.mm.plugin.sns.ui.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List b() {
        /*
            r14 = this;
            java.lang.String r0 = "loadData"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r4 = r14.f170698c
            boolean r6 = r14.f170700e
            java.lang.String r7 = r14.f170703h
            boolean r2 = r14.f170704i
            int r3 = com.tencent.mm.plugin.sns.model.s5.f164676d
            java.lang.String r10 = "getSnsListByUserName"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r12 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            java.lang.String r13 = "getCursorByUserNameNotBuff"
            if (r2 == 0) goto L36
            com.tencent.mm.plugin.sns.storage.f2 r2 = com.tencent.mm.plugin.sns.model.l4.Fj()
            r5 = 10
            r2.getClass()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)
            r3 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.K1(r3, r4, r5, r6, r7, r8, r9)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
            goto L4b
        L36:
            com.tencent.mm.plugin.sns.storage.f2 r2 = com.tencent.mm.plugin.sns.model.l4.Fj()
            r2.getClass()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r12)
            r3 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.K1(r3, r4, r5, r6, r7, r8, r9)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r12)
        L4b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.getCount()
            if (r4 != 0) goto L5d
            r2.close()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            goto L7a
        L5d:
            boolean r4 = r2.moveToFirst()
            if (r4 == 0) goto L74
        L63:
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r4.<init>()
            r4.convertFrom(r2)
            r3.add(r4)
            boolean r4 = r2.moveToNext()
            if (r4 != 0) goto L63
        L74:
            r2.close()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
        L7a:
            com.tencent.mm.plugin.sns.ui.uo r2 = r14.f170705j
            r2.a()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r4 = r2.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            int r4 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}
            java.lang.String r4 = "MicroMsg.SnsSelfHelper"
            java.lang.String r5 = "loadData thread: %d count: %d"
            com.tencent.mars.xlog.Log.i(r4, r5, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.vo.b():java.util.List");
    }

    @Override // com.tencent.mm.plugin.sns.ui.o
    public void c(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        com.tencent.mm.plugin.sns.ui.uo uoVar = this.f170705j;
        if (uoVar != null) {
            if (list != null) {
                d(true, list);
            }
            uoVar.c(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }

    public final void d(boolean z17, java.util.List list) {
        java.lang.String str;
        java.util.HashMap hashMap;
        int i17;
        int i18;
        int i19;
        java.lang.String str2 = "initFixType";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFixType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        this.f170707l = new ca4.l();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.HashMap hashMap4 = new java.util.HashMap();
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        boolean z18 = this.f170700e;
        int i27 = 0;
        if (z17) {
            if (z18) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo(0L);
                snsInfo.field_snsId = 0L;
                snsInfo.localid = -1;
                snsInfo.setCreateTime((int) (java.lang.System.currentTimeMillis() / 1000));
                list.add(0, snsInfo);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        }
        if (z17 && cc4.b.f40482a.a()) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = new com.tencent.mm.plugin.sns.storage.SnsInfo(0L);
            snsInfo2.field_snsId = 0L;
            snsInfo2.localid = -1;
            list.add(0, snsInfo2);
        }
        int size = list.size();
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        int i38 = 0;
        while (i28 < size) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            this.f170707l.b();
            int i39 = 1;
            if (i28 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            } else if (z18 && i28 == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            } else {
                int i47 = i28 + 1;
                if (i47 < size) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    java.lang.Object obj = list.get(i47);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
                    str = str2;
                    hashMap = hashMap4;
                    this.f170707l.f39978b = snsInfo3.getHead();
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo3.getTimeLine();
                    i17 = i38;
                    this.f170707l.f39981e = timeLine.ContentDesc;
                    com.tencent.mm.plugin.sns.model.s5.i(snsInfo3.getLocalPrivate(), z18);
                    this.f170707l.f39979c = snsInfo3.getTypeFlag();
                    r45.a90 a90Var = timeLine.ContentObj;
                    if (a90Var != null) {
                        this.f170707l.f39980d = a90Var.f369840h.size();
                    } else {
                        this.f170707l.f39980d = 0;
                    }
                } else {
                    str = str2;
                    hashMap = hashMap4;
                    i17 = i38;
                }
                int i48 = i28 + 2;
                if (i48 < size) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    java.lang.Object obj2 = list.get(i48);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
                    this.f170707l.f39986j = snsInfo4.getHead();
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine2 = snsInfo4.getTimeLine();
                    this.f170707l.f39982f = timeLine2.ContentDesc;
                    com.tencent.mm.plugin.sns.model.s5.i(snsInfo4.getLocalPrivate(), z18);
                    this.f170707l.f39987k = snsInfo4.getTypeFlag();
                    r45.a90 a90Var2 = timeLine2.ContentObj;
                    if (a90Var2 != null) {
                        this.f170707l.f39988l = a90Var2.f369840h.size();
                    } else {
                        this.f170707l.f39988l = 0;
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                java.lang.Object obj3 = list.get(i28);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo5 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj3;
                this.f170707l.f39977a = snsInfo5.getHead();
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine3 = snsInfo5.getTimeLine();
                ca4.l lVar = this.f170707l;
                lVar.f39983g = timeLine3.ContentDesc;
                lVar.f39984h = snsInfo5.getTypeFlag();
                ca4.l lVar2 = this.f170707l;
                com.tencent.mm.plugin.sns.model.s5.i(snsInfo5.getLocalPrivate(), z18);
                lVar2.getClass();
                r45.a90 a90Var3 = timeLine3.ContentObj;
                if (a90Var3 != null) {
                    this.f170707l.f39985i = a90Var3.f369840h.size();
                    i18 = 0;
                } else {
                    i18 = 0;
                    this.f170707l.f39985i = 0;
                }
                if (this.f170707l.d()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    i39 = 1;
                } else if (this.f170707l.e()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    i39 = 2;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    i39 = 3;
                }
                hashMap2.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
                hashMap3.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i39));
                i37 += i39;
                java.util.HashMap hashMap5 = hashMap;
                hashMap5.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i17));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                if (z18 || i28 != 0) {
                    i19 = (i39 >= 1 || !com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(this.f170707l.f39984h)) ? i18 : 1;
                    if (i39 >= 2 && com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(this.f170707l.f39979c)) {
                        i19++;
                    }
                    if (i39 >= 3 && com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(this.f170707l.f39987k)) {
                        i19++;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
                    i19 = i18;
                }
                int i49 = i17 + i19;
                i28 += i39;
                i29++;
                i27 = i18;
                hashMap4 = hashMap5;
                i38 = i49;
                str2 = str;
            }
            str = str2;
            hashMap = hashMap4;
            i18 = i27;
            i17 = i38;
            hashMap2.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i37));
            hashMap3.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i39));
            i37 += i39;
            java.util.HashMap hashMap52 = hashMap;
            hashMap52.put(java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            if (z18) {
            }
            if (i39 >= 1) {
            }
            if (i39 >= 2) {
                i19++;
            }
            if (i39 >= 3) {
                i19++;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
            int i492 = i17 + i19;
            i28 += i39;
            i29++;
            i27 = i18;
            hashMap4 = hashMap52;
            i38 = i492;
            str2 = str;
        }
        this.f170701f = i29;
        this.f170702g = list.size();
        this.f170699d = list;
        android.os.Vibrator vibrator = ca4.z0.f40068a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
        this.f170705j.b(this.f170699d, hashMap2, hashMap3, hashMap4, this.f170702g, this.f170701f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        d(false, this.f170699d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }

    public void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sortInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
        java.util.Collections.sort(this.f170699d, this.f170706k);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sortInMemery", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterHelper");
    }
}
