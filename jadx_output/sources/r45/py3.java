package r45;

/* loaded from: classes9.dex */
public class py3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383472d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383473e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383474f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383475g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383476h;

    /* renamed from: i, reason: collision with root package name */
    public r45.p35 f383477i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.py3)) {
            return false;
        }
        r45.py3 py3Var = (r45.py3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383472d), java.lang.Integer.valueOf(py3Var.f383472d)) && n51.f.a(this.f383473e, py3Var.f383473e) && n51.f.a(this.f383474f, py3Var.f383474f) && n51.f.a(this.f383475g, py3Var.f383475g) && n51.f.a(this.f383476h, py3Var.f383476h) && n51.f.a(this.f383477i, py3Var.f383477i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383472d);
            java.lang.String str = this.f383473e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383474f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383475g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f383476h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            r45.p35 p35Var = this.f383477i;
            if (p35Var != null) {
                fVar.i(6, p35Var.computeSize());
                this.f383477i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f383472d) + 0;
            java.lang.String str5 = this.f383473e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f383474f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f383475g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f383476h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            r45.p35 p35Var2 = this.f383477i;
            return p35Var2 != null ? e17 + b36.f.i(6, p35Var2.computeSize()) : e17;
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
        r45.py3 py3Var = (r45.py3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                py3Var.f383472d = aVar2.g(intValue);
                return 0;
            case 2:
                py3Var.f383473e = aVar2.k(intValue);
                return 0;
            case 3:
                py3Var.f383474f = aVar2.k(intValue);
                return 0;
            case 4:
                py3Var.f383475g = aVar2.k(intValue);
                return 0;
            case 5:
                py3Var.f383476h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.p35 p35Var3 = new r45.p35();
                    if (bArr != null && bArr.length > 0) {
                        p35Var3.parseFrom(bArr);
                    }
                    py3Var.f383477i = p35Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
