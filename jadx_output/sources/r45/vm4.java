package r45;

/* loaded from: classes10.dex */
public class vm4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388360d;

    /* renamed from: e, reason: collision with root package name */
    public int f388361e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vm4)) {
            return false;
        }
        r45.vm4 vm4Var = (r45.vm4) fVar;
        return n51.f.a(this.f388360d, vm4Var.f388360d) && n51.f.a(java.lang.Integer.valueOf(this.f388361e), java.lang.Integer.valueOf(vm4Var.f388361e));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L60
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L60
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L60
            r0.<init>(r6)     // Catch: java.lang.Exception -> L60
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L60
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L60
            if (r1 == 0) goto L60
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L60
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L60
            r3 = 93029116(0x58b82fc, float:1.3119613E-35)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = 690766423(0x292c4257, float:3.8249213E-14)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "open_scene"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L60
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L3a:
            java.lang.String r2 = "appid"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L60
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L57
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L60
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L60
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L60
            r5.f388361e = r1     // Catch: java.lang.Exception -> L60
            goto L14
        L57:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L60
            r5.f388360d = r1     // Catch: java.lang.Exception -> L60
            goto L14
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.vm4.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388360d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f388361e);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f388360d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f388361e);
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
        r45.vm4 vm4Var = (r45.vm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vm4Var.f388360d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        vm4Var.f388361e = aVar2.g(intValue);
        return 0;
    }
}
