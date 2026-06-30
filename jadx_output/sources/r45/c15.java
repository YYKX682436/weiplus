package r45;

/* loaded from: classes10.dex */
public class c15 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.fw5 f371218d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371219e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c15)) {
            return false;
        }
        r45.c15 c15Var = (r45.c15) fVar;
        return n51.f.a(this.f371218d, c15Var.f371218d) && n51.f.a(this.f371219e, c15Var.f371219e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047 A[SYNTHETIC] */
    @Override // com.tencent.mm.protobuf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.protobuf.f fromJson(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L6c
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lb
            goto L6c
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6c
            r0.<init>(r6)     // Catch: java.lang.Exception -> L6c
            java.util.Iterator r6 = r0.keys()     // Catch: java.lang.Exception -> L6c
        L14:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L6c
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6c
            int r2 = r1.hashCode()     // Catch: java.lang.Exception -> L6c
            r3 = -172978165(0xfffffffff5b0900b, float:-4.4763954E32)
            r4 = 1
            if (r2 == r3) goto L3a
            r3 = 951530927(0x38b735af, float:8.736119E-5)
            if (r2 == r3) goto L30
            goto L44
        L30:
            java.lang.String r2 = "context"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L44
            r2 = 0
            goto L45
        L3a:
            java.lang.String r2 = "room_url"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L44
            r2 = r4
            goto L45
        L44:
            r2 = -1
        L45:
            if (r2 == 0) goto L53
            if (r2 == r4) goto L4a
            goto L14
        L4a:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L6c
            r5.f371219e = r1     // Catch: java.lang.Exception -> L6c
            goto L14
        L53:
            java.lang.Object r1 = r0.opt(r1)     // Catch: java.lang.Exception -> L6c
            boolean r2 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Exception -> L6c
            if (r2 == 0) goto L14
            r45.fw5 r2 = new r45.fw5     // Catch: java.lang.Exception -> L6c
            r2.<init>()     // Catch: java.lang.Exception -> L6c
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Exception -> L6c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L6c
            r2.fromJson(r1)     // Catch: java.lang.Exception -> L6c
            r5.f371218d = r2     // Catch: java.lang.Exception -> L6c
            goto L14
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r45.c15.fromJson(java.lang.String):com.tencent.mm.protobuf.f");
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.fw5 fw5Var = this.f371218d;
            if (fw5Var != null) {
                fVar.i(1, fw5Var.computeSize());
                this.f371218d.writeFields(fVar);
            }
            java.lang.String str = this.f371219e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.fw5 fw5Var2 = this.f371218d;
            int i18 = fw5Var2 != null ? 0 + b36.f.i(1, fw5Var2.computeSize()) : 0;
            java.lang.String str2 = this.f371219e;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        r45.c15 c15Var = (r45.c15) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            c15Var.f371219e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.fw5 fw5Var3 = new r45.fw5();
            if (bArr != null && bArr.length > 0) {
                fw5Var3.parseFrom(bArr);
            }
            c15Var.f371218d = fw5Var3;
        }
        return 0;
    }
}
