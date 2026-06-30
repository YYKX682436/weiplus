package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xo extends com.tencent.mm.plugin.sns.ui.o {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f171573c;

    /* renamed from: g, reason: collision with root package name */
    public ca4.l f171577g;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.uo f171579i;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f171574d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f171575e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f171576f = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f171578h = false;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Comparator f171580j = new com.tencent.mm.plugin.sns.ui.wo(this);

    public xo(com.tencent.mm.plugin.sns.ui.uo uoVar, java.lang.String str, boolean z17) {
        this.f171573c = false;
        this.f171579i = uoVar;
        this.f171573c = z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        if (r2.moveToNext() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        r2.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserSearchList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r2.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        r6 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        r6.convertFrom(r2);
        r3.add(r6);
     */
    @Override // com.tencent.mm.plugin.sns.ui.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List b() {
        /*
            r7 = this;
            java.lang.String r0 = "loadData"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            long r2 = com.tencent.mm.plugin.sns.model.s5.f164673a
            java.lang.String r2 = ca4.z0.s0(r2)
            long r3 = com.tencent.mm.plugin.sns.model.s5.f164674b
            java.lang.String r3 = ca4.z0.s0(r3)
            java.lang.String r4 = "getUserSearchList"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.storage.f2 r6 = com.tencent.mm.plugin.sns.model.l4.Fj()
            android.database.Cursor r2 = r6.P1(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r6 = r2.getCount()
            if (r6 != 0) goto L35
            r2.close()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            goto L52
        L35:
            boolean r6 = r2.moveToFirst()
            if (r6 == 0) goto L4c
        L3b:
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r6.<init>()
            r6.convertFrom(r2)
            r3.add(r6)
            boolean r6 = r2.moveToNext()
            if (r6 != 0) goto L3b
        L4c:
            r2.close()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L52:
            com.tencent.mm.plugin.sns.ui.uo r2 = r7.f171579i
            r2.a()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r4 = r4.getId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r2[r5] = r4
            int r4 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r2[r5] = r4
            java.lang.String r4 = "MicroMsg.SnsSelfAdapterSearchHelper"
            java.lang.String r5 = "loadData thread: %d count: %d"
            com.tencent.mars.xlog.Log.i(r4, r5, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.xo.b():java.util.List");
    }

    @Override // com.tencent.mm.plugin.sns.ui.o
    public void c(java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        com.tencent.mm.plugin.sns.ui.uo uoVar = this.f171579i;
        if (uoVar != null) {
            if (list != null) {
                d(this.f171578h, list);
            }
            uoVar.c(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publicNotify", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
    }

    public final void d(boolean z17, java.util.List list) {
        java.lang.String str;
        java.util.HashMap hashMap;
        int i17;
        int i18;
        int i19;
        java.lang.String str2 = "initFixType";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFixType", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        this.f171577g = new ca4.l();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.HashMap hashMap4 = new java.util.HashMap();
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        boolean z18 = this.f171573c;
        if (z17) {
            if (z18) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo(0L);
                snsInfo.field_snsId = 0L;
                snsInfo.localid = -1;
                snsInfo.setCreateTime((int) (java.lang.System.currentTimeMillis() / 1000));
                list.add(0, snsInfo);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addSelf", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
        }
        int size = list.size();
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i37 = 0;
        while (i27 < size) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            this.f171577g.b();
            int i38 = i27 + 1;
            if (i38 < size) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                java.lang.Object obj = list.get(i38);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
                str = str2;
                hashMap = hashMap4;
                this.f171577g.f39978b = snsInfo2.getHead();
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo2.getTimeLine();
                i17 = i37;
                this.f171577g.f39981e = timeLine.ContentDesc;
                com.tencent.mm.plugin.sns.model.s5.i(snsInfo2.getLocalPrivate(), z18);
                this.f171577g.f39979c = snsInfo2.getTypeFlag();
                r45.a90 a90Var = timeLine.ContentObj;
                if (a90Var != null) {
                    this.f171577g.f39980d = a90Var.f369840h.size();
                } else {
                    this.f171577g.f39980d = 0;
                }
            } else {
                str = str2;
                hashMap = hashMap4;
                i17 = i37;
            }
            int i39 = i27 + 2;
            if (i39 < size) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                java.lang.Object obj2 = list.get(i39);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj2;
                this.f171577g.f39986j = snsInfo3.getHead();
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine2 = snsInfo3.getTimeLine();
                this.f171577g.f39982f = timeLine2.ContentDesc;
                com.tencent.mm.plugin.sns.model.s5.i(snsInfo3.getLocalPrivate(), z18);
                this.f171577g.f39987k = snsInfo3.getTypeFlag();
                r45.a90 a90Var2 = timeLine2.ContentObj;
                if (a90Var2 != null) {
                    this.f171577g.f39988l = a90Var2.f369840h.size();
                } else {
                    this.f171577g.f39988l = 0;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            java.lang.Object obj3 = list.get(i27);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj3;
            this.f171577g.f39977a = snsInfo4.getHead();
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine3 = snsInfo4.getTimeLine();
            ca4.l lVar = this.f171577g;
            lVar.f39983g = timeLine3.ContentDesc;
            lVar.f39984h = snsInfo4.getTypeFlag();
            ca4.l lVar2 = this.f171577g;
            com.tencent.mm.plugin.sns.model.s5.i(snsInfo4.getLocalPrivate(), z18);
            lVar2.getClass();
            r45.a90 a90Var3 = timeLine3.ContentObj;
            if (a90Var3 != null) {
                this.f171577g.f39985i = a90Var3.f369840h.size();
            } else {
                this.f171577g.f39985i = 0;
            }
            if (this.f171577g.d()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i18 = 1;
            } else if (this.f171577g.e()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i18 = 2;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calNums", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i18 = 3;
            }
            hashMap2.put(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29));
            hashMap3.put(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i18));
            i29 += i18;
            java.util.HashMap hashMap5 = hashMap;
            hashMap5.put(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
            if (z18 && i27 == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i19 = 0;
            } else {
                int i47 = (i18 < 1 || !com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(this.f171577g.f39984h)) ? 0 : 1;
                if (i18 >= 2 && com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(this.f171577g.f39979c)) {
                    i47++;
                }
                if (i18 >= 3 && com.tencent.mm.plugin.sns.storage.SnsInfo.isPhotoType(this.f171577g.f39987k)) {
                    i47++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calImage", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
                i19 = i47;
            }
            i37 = i17 + i19;
            i27 += i18;
            i28++;
            hashMap4 = hashMap5;
            str2 = str;
        }
        this.f171575e = i28;
        this.f171576f = list.size();
        this.f171574d = list;
        android.os.Vibrator vibrator = ca4.z0.f40068a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calTime", "com.tencent.mm.plugin.sns.data.SnsUtil");
        this.f171579i.b(this.f171574d, hashMap2, hashMap3, hashMap4, this.f171576f, this.f171575e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.SnsSelfAdapterSearchHelper");
    }
}
