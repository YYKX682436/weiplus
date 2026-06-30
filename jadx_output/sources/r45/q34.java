package r45;

/* loaded from: classes9.dex */
public class q34 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383624d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f383625e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383626f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383627g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383628h;

    /* renamed from: i, reason: collision with root package name */
    public r45.dn5 f383629i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383630m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q34)) {
            return false;
        }
        r45.q34 q34Var = (r45.q34) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383624d), java.lang.Integer.valueOf(q34Var.f383624d)) && n51.f.a(java.lang.Boolean.valueOf(this.f383625e), java.lang.Boolean.valueOf(q34Var.f383625e)) && n51.f.a(this.f383626f, q34Var.f383626f) && n51.f.a(this.f383627g, q34Var.f383627g) && n51.f.a(this.f383628h, q34Var.f383628h) && n51.f.a(this.f383629i, q34Var.f383629i) && n51.f.a(this.f383630m, q34Var.f383630m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383624d);
            fVar.a(2, this.f383625e);
            java.lang.String str = this.f383626f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f383627g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f383628h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.dn5 dn5Var = this.f383629i;
            if (dn5Var != null) {
                fVar.i(6, dn5Var.computeSize());
                this.f383629i.writeFields(fVar);
            }
            java.lang.String str4 = this.f383630m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383624d) + 0 + b36.f.a(2, this.f383625e);
            java.lang.String str5 = this.f383626f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f383627g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f383628h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            r45.dn5 dn5Var2 = this.f383629i;
            if (dn5Var2 != null) {
                e17 += b36.f.i(6, dn5Var2.computeSize());
            }
            java.lang.String str8 = this.f383630m;
            return str8 != null ? e17 + b36.f.j(7, str8) : e17;
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
        r45.q34 q34Var = (r45.q34) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q34Var.f383624d = aVar2.g(intValue);
                return 0;
            case 2:
                q34Var.f383625e = aVar2.c(intValue);
                return 0;
            case 3:
                q34Var.f383626f = aVar2.k(intValue);
                return 0;
            case 4:
                q34Var.f383627g = aVar2.k(intValue);
                return 0;
            case 5:
                q34Var.f383628h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.dn5 dn5Var3 = new r45.dn5();
                    if (bArr != null && bArr.length > 0) {
                        dn5Var3.parseFrom(bArr);
                    }
                    q34Var.f383629i = dn5Var3;
                }
                return 0;
            case 7:
                q34Var.f383630m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
