package sn1;

/* loaded from: classes12.dex */
public class a0 extends sn1.i {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u, reason: collision with root package name */
    public final wn1.v f409972u;

    /* renamed from: v, reason: collision with root package name */
    public final wn1.w f409973v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f409974w;

    /* renamed from: x, reason: collision with root package name */
    public int f409975x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.pointers.PByteArray f409976y;

    /* renamed from: z, reason: collision with root package name */
    public final sn1.d0 f409977z;

    public a0(final sn1.e0 e0Var, java.lang.String str, sn1.d0 d0Var, byte[] bArr, byte[] bArr2, int i17, sn1.b0 b0Var) {
        wn1.v vVar = new wn1.v();
        this.f409972u = vVar;
        this.f409973v = new wn1.w();
        this.f409975x = 0;
        this.f409976y = new com.tencent.mm.pointers.PByteArray();
        this.f409977z = null;
        vVar.f447491d = str;
        vVar.f447492e = 2;
        this.f409974w = new com.tencent.mm.modelbase.u0() { // from class: sn1.a0$$a
            @Override // com.tencent.mm.modelbase.u0
            public final void onSceneEnd(int i18, int i19, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
                sn1.a0 a0Var = sn1.a0.this;
                a0Var.getClass();
                sn1.a0 a0Var2 = (sn1.a0) m1Var;
                java.util.HashSet hashSet = a0Var2.f409977z.f410003a;
                boolean contains = hashSet.contains(a0Var2);
                wn1.v vVar2 = a0Var2.f409972u;
                if (!contains && vVar2.f447492e == 2) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BackupDataPushScene.BackFileOp", "checkSceneAllFinish Error!! media scene not in sceneHashSet");
                }
                hashSet.remove(a0Var2);
                boolean isEmpty = hashSet.isEmpty();
                java.lang.String str3 = vVar2.f447491d;
                byte[] bArr3 = a0Var2.f409976y.value;
                ((ln1.d0) e0Var).a(isEmpty, str3, bArr3 == null ? 0 : bArr3.length, a0Var.f409975x);
            }
        };
        this.f409977z = d0Var;
        d0Var.f410003a.add(this);
        if (bArr2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BackupDataPushScene", "BackupDataPushScene media backFileOp buff is null");
            vVar.f447497m = null;
            return;
        }
        int i18 = d0Var.f410005c;
        vVar.f447493f = i18;
        vVar.f447494g = i17;
        int length = i17 + bArr2.length;
        vVar.f447495h = length;
        vVar.f447497m = b0(bArr2, length == i18, bArr);
        c0();
    }

    @Override // sn1.i
    public boolean K() {
        wn1.v vVar = this.f409972u;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupDataPushScene", "BackupDataPushScene type:%d, msgid:%s, size:%d, scope:[%d,%d]", java.lang.Integer.valueOf(vVar.f447492e), vVar.f447491d, java.lang.Integer.valueOf(vVar.f447493f), java.lang.Integer.valueOf(vVar.f447494g), java.lang.Integer.valueOf(vVar.f447495h));
        byte[] bArr = this.f409976y.value;
        int i17 = this.f409975x;
        sn1.e eVar = sn1.i.f410016m;
        boolean z17 = eVar != null && ((ln1.g) eVar).d(i17, bArr, 6) == 0;
        if (!z17) {
            this.f409974w.onSceneEnd(1, -2, "doScene failed", this);
        }
        return z17;
    }

    @Override // sn1.i
    public com.tencent.mm.protobuf.f M() {
        return this.f409972u;
    }

    @Override // sn1.i
    public com.tencent.mm.protobuf.f N() {
        return this.f409973v;
    }

    @Override // sn1.i
    public void P(int i17) {
        this.f409974w.onSceneEnd(0, this.f409973v.f447503h, "", this);
    }

    public com.tencent.mm.protobuf.g b0(byte[] bArr, boolean z17, byte[] bArr2) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((bArr2 == null ? -1 : bArr2.length) > 0) {
            if ((bArr != null ? bArr.length : -1) > 0) {
                return new com.tencent.mm.protobuf.g(com.tencent.mm.jniinterface.AesEcb.aesCryptEcb(bArr, bArr2, true, z17));
            }
        }
        return new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
    }

    public final void c0() {
        int i17 = sn1.i.f410022s;
        sn1.i.f410022s = i17 + 1;
        this.f409975x = i17;
        try {
            on1.f.a(this.f409972u.toByteArray(), this.f409975x, (short) 6, this.f409976y, sn1.i.f410017n);
            int i18 = this.f409975x;
            com.tencent.mm.pointers.PByteArray pByteArray = this.f409976y;
            com.tencent.mm.pointers.PByteArray pByteArray2 = new com.tencent.mm.pointers.PByteArray();
            this.f410025e = pByteArray2;
            pByteArray2.value = pByteArray.value;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = sn1.i.f410013g;
            synchronized (concurrentHashMap) {
                concurrentHashMap.put(java.lang.Integer.valueOf(i18), this);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupDataPushScene", e17, "PacketBackupDataPush to buf fail:%s", e17.toString());
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6;
    }

    public a0(final sn1.e0 e0Var, java.lang.String str, java.util.LinkedList linkedList, byte[] bArr, sn1.b0 b0Var) {
        wn1.v vVar = new wn1.v();
        this.f409972u = vVar;
        this.f409973v = new wn1.w();
        this.f409975x = 0;
        this.f409976y = new com.tencent.mm.pointers.PByteArray();
        byte[] bArr2 = null;
        this.f409977z = null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        vVar.f447491d = str;
        vVar.f447492e = 1;
        this.f409974w = new com.tencent.mm.modelbase.u0() { // from class: sn1.a0$$b
            @Override // com.tencent.mm.modelbase.u0
            public final void onSceneEnd(int i17, int i18, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
                sn1.a0 a0Var = sn1.a0.this;
                a0Var.getClass();
                sn1.a0 a0Var2 = (sn1.a0) m1Var;
                java.lang.String str3 = a0Var2.f409972u.f447491d;
                byte[] bArr3 = a0Var2.f409976y.value;
                ((ln1.d0) e0Var).a(true, str3, bArr3 == null ? 0 : bArr3.length, a0Var.f409975x);
            }
        };
        try {
            r45.fd fdVar = new r45.fd();
            fdVar.f374219e = linkedList;
            fdVar.f374218d = linkedList.size();
            bArr2 = fdVar.toByteArray();
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(linkedList == null ? -1 : linkedList.size());
            objArr[1] = e17.getMessage();
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupDataPushScene", "BackupDataPushScene text, BakChatMsgList to buf error, list size[%d], errMsg:%s", objArr);
        }
        bArr2 = bArr2 == null ? new byte[0] : bArr2;
        wn1.v vVar2 = this.f409972u;
        vVar2.f447494g = 0;
        vVar2.f447495h = bArr2.length;
        vVar2.f447493f = bArr2.length;
        vVar2.f447497m = b0(bArr2, true, bArr);
        c0();
        int length = this.f409972u.f447497m.f192156a.length;
        java.lang.System.currentTimeMillis();
        linkedList.size();
    }
}
