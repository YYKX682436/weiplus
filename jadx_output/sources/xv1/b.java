package xv1;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public boolean f457389c;

    /* renamed from: a, reason: collision with root package name */
    public int f457387a = Integer.MAX_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f457388b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public java.util.Set f457390d = new java.util.HashSet();

    public java.util.ArrayList a() {
        java.util.Map map = this.f457388b;
        if (map == null || map.size() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileHelper", "msgIdToFilePath is null, return");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f457388b.values().iterator();
        while (it.hasNext()) {
            arrayList.add(((xv1.a) it.next()).f457384a);
        }
        return arrayList;
    }

    public synchronized void b(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileHelper", "init count:%d", java.lang.Integer.valueOf(i17));
        this.f457387a = i17;
        this.f457388b.clear();
    }

    public boolean c() {
        java.util.Map map = this.f457388b;
        if (map != null) {
            return map.size() == this.f457387a - 1 || this.f457388b.size() == this.f457387a;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileHelper", "isChange() msgIdToMsgFile is null, return");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(long r6, com.tencent.mm.choosemsgfile.compat.MsgFile r8, wv1.a r9, int r10) {
        /*
            r5 = this;
            r0 = -1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 0
            java.lang.String r2 = "MicroMsg.ChooseMsgFileHelper"
            if (r0 != 0) goto L10
            java.lang.String r6 = "msgid is invalid"
            com.tencent.mars.xlog.Log.e(r2, r6)
            return r1
        L10:
            if (r8 != 0) goto L19
            java.lang.String r6 = "msgFile is null"
            com.tencent.mars.xlog.Log.e(r2, r6)
            return r1
        L19:
            java.lang.String r0 = r8.f64762e
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L27
            java.lang.String r6 = "filePath is invalid"
            com.tencent.mars.xlog.Log.e(r2, r6)
            return r1
        L27:
            java.util.Map r0 = r5.f457388b
            r3 = 1
            if (r0 != 0) goto L32
            java.lang.String r0 = "isInvalid() msgIdToMsgFile is null, return"
            com.tencent.mars.xlog.Log.e(r2, r0)
            goto L3e
        L32:
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            int r0 = r0.size()
            int r4 = r5.f457387a
            if (r0 < r4) goto L3e
            r0 = r3
            goto L3f
        L3e:
            r0 = r1
        L3f:
            if (r0 == 0) goto L51
            int r6 = r5.f457387a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "exceed max:%d"
            com.tencent.mars.xlog.Log.e(r2, r7, r6)
            return r1
        L51:
            java.util.Map r0 = r5.f457388b
            if (r0 != 0) goto L5c
            java.lang.String r6 = "msgIdToMsgFile is null, return"
            com.tencent.mars.xlog.Log.e(r2, r6)
            return r1
        L5c:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r8}
            java.lang.String r1 = "msgIdToFilePath put msgId:%d filePath:%s"
            com.tencent.mars.xlog.Log.i(r2, r1, r0)
            java.util.Map r0 = r5.f457388b
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            xv1.a r7 = new xv1.a
            r7.<init>(r5, r8, r9, r10)
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.put(r6, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: xv1.b.d(long, com.tencent.mm.choosemsgfile.compat.MsgFile, wv1.a, int):boolean");
    }

    public boolean e(long j17) {
        if (j17 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileHelper", "msgid is invalid");
            return false;
        }
        if (this.f457388b == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChooseMsgFileHelper", "msgIdToMsgFile is null, return");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileHelper", "msgIdToFilePath remove msgId:%d", java.lang.Long.valueOf(j17));
        this.f457388b.remove(java.lang.Long.valueOf(j17));
        return true;
    }

    public synchronized void f(long j17) {
        java.util.Set set = this.f457390d;
        if (set != null) {
            set.remove(java.lang.Long.valueOf(j17));
        }
    }
}
