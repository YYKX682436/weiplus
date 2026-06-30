package o0;

/* loaded from: classes16.dex */
public class m extends com.tencent.mm.protobuf.f {
    public int F2;
    public long G2;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o0.m)) {
            return false;
        }
        o0.m mVar = (o0.m) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.F2), java.lang.Integer.valueOf(mVar.F2)) && n51.f.a(java.lang.Long.valueOf(this.G2), java.lang.Long.valueOf(mVar.G2));
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
            r3 = -896505829(0xffffffffca90681b, float:-4731917.5)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = 343432112(0x14785bb0, float:1.25388825E-26)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "ref_feed_id"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L5e
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L3a:
            java.lang.String r2 = "source"
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
            r5.G2 = r1     // Catch: java.lang.Exception -> L5e
            goto L14
        L51:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L5e
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L5e
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L5e
            r5.F2 = r1     // Catch: java.lang.Exception -> L5e
            goto L14
        L5e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.m.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.F2);
            fVar.h(2, this.G2);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.F2) + 0 + b36.f.h(2, this.G2);
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
        o0.m mVar = (o0.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mVar.F2 = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        mVar.G2 = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.F2);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, ya.b.SOURCE, valueOf, true);
            eVar.d(jSONObject, "ref_feed_id", java.lang.Long.valueOf(this.G2), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
