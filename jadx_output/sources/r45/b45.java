package r45;

/* loaded from: classes9.dex */
public class b45 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370519d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370520e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370521f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370522g;

    /* renamed from: h, reason: collision with root package name */
    public r45.a44 f370523h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f370524i = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b45)) {
            return false;
        }
        r45.b45 b45Var = (r45.b45) fVar;
        return n51.f.a(this.f370519d, b45Var.f370519d) && n51.f.a(this.f370520e, b45Var.f370520e) && n51.f.a(this.f370521f, b45Var.f370521f) && n51.f.a(this.f370522g, b45Var.f370522g) && n51.f.a(this.f370523h, b45Var.f370523h) && n51.f.a(java.lang.Boolean.valueOf(this.f370524i), java.lang.Boolean.valueOf(b45Var.f370524i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370519d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370520e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370521f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f370522g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            r45.a44 a44Var = this.f370523h;
            if (a44Var != null) {
                fVar.i(5, a44Var.computeSize());
                this.f370523h.writeFields(fVar);
            }
            fVar.a(6, this.f370524i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f370519d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f370520e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f370521f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f370522g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            r45.a44 a44Var2 = this.f370523h;
            if (a44Var2 != null) {
                j17 += b36.f.i(5, a44Var2.computeSize());
            }
            return j17 + b36.f.a(6, this.f370524i);
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
        r45.b45 b45Var = (r45.b45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b45Var.f370519d = aVar2.k(intValue);
                return 0;
            case 2:
                b45Var.f370520e = aVar2.k(intValue);
                return 0;
            case 3:
                b45Var.f370521f = aVar2.k(intValue);
                return 0;
            case 4:
                b45Var.f370522g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.a44 a44Var3 = new r45.a44();
                    if (bArr != null && bArr.length > 0) {
                        a44Var3.parseFrom(bArr);
                    }
                    b45Var.f370523h = a44Var3;
                }
                return 0;
            case 6:
                b45Var.f370524i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
