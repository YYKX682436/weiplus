package r45;

/* loaded from: classes2.dex */
public class vj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388300d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388301e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388302f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388303g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388304h;

    /* renamed from: i, reason: collision with root package name */
    public int f388305i;

    /* renamed from: m, reason: collision with root package name */
    public int f388306m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f388307n;

    /* renamed from: o, reason: collision with root package name */
    public int f388308o;

    static {
        new r45.vj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.vj0 parseFrom(byte[] bArr) {
        return (r45.vj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vj0)) {
            return false;
        }
        r45.vj0 vj0Var = (r45.vj0) fVar;
        return n51.f.a(this.f388300d, vj0Var.f388300d) && n51.f.a(this.f388301e, vj0Var.f388301e) && n51.f.a(this.f388302f, vj0Var.f388302f) && n51.f.a(this.f388303g, vj0Var.f388303g) && n51.f.a(this.f388304h, vj0Var.f388304h) && n51.f.a(java.lang.Integer.valueOf(this.f388305i), java.lang.Integer.valueOf(vj0Var.f388305i)) && n51.f.a(java.lang.Integer.valueOf(this.f388306m), java.lang.Integer.valueOf(vj0Var.f388306m)) && n51.f.a(this.f388307n, vj0Var.f388307n) && n51.f.a(java.lang.Integer.valueOf(this.f388308o), java.lang.Integer.valueOf(vj0Var.f388308o));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.vj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388300d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388301e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f388302f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f388303g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f388304h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f388305i);
            fVar.e(7, this.f388306m);
            java.lang.String str6 = this.f388307n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            fVar.e(9, this.f388308o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f388300d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f388301e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f388302f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f388303g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f388304h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            int e17 = j17 + b36.f.e(6, this.f388305i) + b36.f.e(7, this.f388306m);
            java.lang.String str12 = this.f388307n;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            return e17 + b36.f.e(9, this.f388308o);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f388300d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f388301e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f388302f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f388303g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f388304h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f388305i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f388306m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f388307n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f388308o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
