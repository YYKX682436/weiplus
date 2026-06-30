package r45;

/* loaded from: classes4.dex */
public class u2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f386952d;

    /* renamed from: e, reason: collision with root package name */
    public long f386953e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u2)) {
            return false;
        }
        r45.u2 u2Var = (r45.u2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f386952d), java.lang.Integer.valueOf(u2Var.f386952d)) && n51.f.a(java.lang.Long.valueOf(this.f386953e), java.lang.Long.valueOf(u2Var.f386953e));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L5e
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L5e
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5e
            r0.<init>(r6)     // Catch: java.lang.Exception -> L5e
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L5e
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L5e
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L5e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5e
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L5e
            r3 = -1361010320(0xffffffffaee0a170, float:-1.0215018E-10)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = 96572(0x1793c, float:1.35326E-40)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "aid"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L5e
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L3a:
            java.lang.String r2 = "ad_scene"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L5e
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L51
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            long r1 = r0.optLong(r1)     // Catch: java.lang.Exception -> L5e
            r5.f386953e = r1     // Catch: java.lang.Exception -> L5e
            goto L14
        L51:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L5e
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L5e
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L5e
            r5.f386952d = r1     // Catch: java.lang.Exception -> L5e
            goto L14
        L5e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.u2.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f386952d);
            fVar.h(2, this.f386953e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f386952d) + 0 + b36.f.h(2, this.f386953e);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.u2 u2Var = (r45.u2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            u2Var.f386952d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        u2Var.f386953e = aVar2.i(intValue);
        return 0;
    }
}
