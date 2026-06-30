package el2;

/* loaded from: classes3.dex */
public final class m1 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ el2.n1 f253860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(el2.n1 n1Var, java.lang.Class cls) {
        super(cls);
        this.f253860b = n1Var;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i(this.f253860b.f253871m, "[polling] failed. retCode = " + i17 + ", errMsg = " + errMsg);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // dk2.cb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.tencent.mm.protobuf.f r6) {
        /*
            r5 = this;
            r45.pc2 r6 = (r45.pc2) r6
            java.lang.String r0 = "result"
            kotlin.jvm.internal.o.g(r6, r0)
            el2.n1 r0 = r5.f253860b
            java.lang.String r1 = r0.f253871m
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[polling] success , need replace = "
            r2.<init>(r3)
            r3 = 1
            int r4 = r6.getInteger(r3)
            r2.append(r4)
            java.lang.String r4 = ",result = "
            r2.append(r4)
            org.json.JSONObject r4 = pm0.b0.g(r6)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r2)
            r1 = 0
            com.tencent.mm.protobuf.g r1 = r6.getByteString(r1)
            r0.f253872n = r1
            r1 = 2
            java.util.LinkedList r1 = r6.getList(r1)
            r2 = 0
            if (r1 == 0) goto L63
            java.lang.Object r1 = kz5.n0.Z(r1)
            r45.y42 r1 = (r45.y42) r1
            if (r1 == 0) goto L63
            int r3 = r1.getInteger(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer[] r4 = r0.f253873o
            boolean r3 = kz5.z.G(r4, r3)
            if (r3 == 0) goto L55
            goto L56
        L55:
            r1 = r2
        L56:
            if (r1 == 0) goto L63
            el2.l1 r3 = new el2.l1
            r3.<init>(r0, r1, r6)
            pm0.v.X(r3)
            jz5.f0 r6 = jz5.f0.f302826a
            goto L64
        L63:
            r6 = r2
        L64:
            if (r6 != 0) goto L6d
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData r6 = r0.f253875q
            r6.postValue(r2)
            r0.f253874p = r2
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el2.m1.b(com.tencent.mm.protobuf.f):void");
    }
}
