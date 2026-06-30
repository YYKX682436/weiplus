package r45;

/* loaded from: classes8.dex */
public class nu3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381685d;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        return fVar != null && (fVar instanceof r45.nu3) && n51.f.a(this.f381685d, ((r45.nu3) fVar).f381685d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L41
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Lb
            goto L41
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L41
            r0.<init>(r5)     // Catch: java.lang.Exception -> L41
            java.util.Iterator r5 = r0.keys()     // Catch: java.lang.Exception -> L41
        L14:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L41
            if (r1 == 0) goto L41
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L41
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L41
            r3 = 3208616(0x30f5a8, float:4.496229E-39)
            if (r2 == r3) goto L2a
            goto L34
        L2a:
            java.lang.String r2 = "host"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L34
            r2 = 0
            goto L35
        L34:
            r2 = -1
        L35:
            if (r2 == 0) goto L38
            goto L14
        L38:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L41
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L41
            r4.f381685d = r1     // Catch: java.lang.Exception -> L41
            goto L14
        L41:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.nu3.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381685d;
            if (str != null) {
                fVar.j(1, str);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f381685d;
            if (str2 != null) {
                return 0 + b36.f.j(1, str2);
            }
            return 0;
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
        r45.nu3 nu3Var = (r45.nu3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        nu3Var.f381685d = aVar2.k(intValue);
        return 0;
    }
}
