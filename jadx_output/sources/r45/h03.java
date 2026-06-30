package r45;

/* loaded from: classes4.dex */
public class h03 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375707d;

    /* renamed from: e, reason: collision with root package name */
    public long f375708e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h03)) {
            return false;
        }
        r45.h03 h03Var = (r45.h03) fVar;
        return n51.f.a(this.f375707d, h03Var.f375707d) && n51.f.a(java.lang.Long.valueOf(this.f375708e), java.lang.Long.valueOf(h03Var.f375708e));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L5b
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L5b
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5b
            r0.<init>(r6)     // Catch: java.lang.Exception -> L5b
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L5b
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L5b
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L5b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5b
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L5b
            r3 = -1636715928(0xffffffff9e71b268, float:-1.2795327E-20)
            r4 = 1
            if (r2 == r3) goto L3b
            r3 = 3433509(0x346425, float:4.811371E-39)
            if (r2 == r3) goto L30
            goto L45
        L30:
            java.lang.String r2 = "path"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L5b
            if (r2 == 0) goto L45
            r2 = 0
            goto L46
        L3b:
            java.lang.String r2 = "expose_time"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L5b
            if (r2 == 0) goto L45
            r2 = r4
            goto L46
        L45:
            r2 = -1
        L46:
            if (r2 == 0) goto L52
            if (r2 == r4) goto L4b
            goto L14
        L4b:
            long r1 = r0.optLong(r1)     // Catch: java.lang.Exception -> L5b
            r5.f375708e = r1     // Catch: java.lang.Exception -> L5b
            goto L14
        L52:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L5b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L5b
            r5.f375707d = r1     // Catch: java.lang.Exception -> L5b
            goto L14
        L5b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.h03.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f375707d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f375708e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f375707d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f375708e);
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
        r45.h03 h03Var = (r45.h03) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h03Var.f375707d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        h03Var.f375708e = aVar2.i(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f375707d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str, true);
            eVar.d(jSONObject, "expose_time", java.lang.Long.valueOf(this.f375708e), true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
