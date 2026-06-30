package r45;

/* loaded from: classes4.dex */
public class yk5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ri0 f391180d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391181e;

    /* renamed from: f, reason: collision with root package name */
    public int f391182f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391183g;

    /* renamed from: h, reason: collision with root package name */
    public int f391184h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f391185i;

    static {
        new r45.yk5();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.yk5 parseFrom(byte[] bArr) {
        return (r45.yk5) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yk5)) {
            return false;
        }
        r45.yk5 yk5Var = (r45.yk5) fVar;
        return n51.f.a(this.f391180d, yk5Var.f391180d) && n51.f.a(this.f391181e, yk5Var.f391181e) && n51.f.a(java.lang.Integer.valueOf(this.f391182f), java.lang.Integer.valueOf(yk5Var.f391182f)) && n51.f.a(this.f391183g, yk5Var.f391183g) && n51.f.a(java.lang.Integer.valueOf(this.f391184h), java.lang.Integer.valueOf(yk5Var.f391184h)) && n51.f.a(this.f391185i, yk5Var.f391185i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.yk5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ri0 ri0Var = this.f391180d;
            if (ri0Var != null) {
                fVar.i(1, ri0Var.computeSize());
                this.f391180d.writeFields(fVar);
            }
            java.lang.String str = this.f391181e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f391182f);
            java.lang.String str2 = this.f391183g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f391184h);
            java.lang.String str3 = this.f391185i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ri0 ri0Var2 = this.f391180d;
            int i18 = ri0Var2 != null ? 0 + b36.f.i(1, ri0Var2.computeSize()) : 0;
            java.lang.String str4 = this.f391181e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f391182f);
            java.lang.String str5 = this.f391183g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            int e18 = e17 + b36.f.e(5, this.f391184h);
            java.lang.String str6 = this.f391185i;
            return str6 != null ? e18 + b36.f.j(6, str6) : e18;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ri0 ri0Var3 = new r45.ri0();
                    if (bArr != null && bArr.length > 0) {
                        ri0Var3.parseFrom(bArr);
                    }
                    this.f391180d = ri0Var3;
                }
                return 0;
            case 2:
                this.f391181e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f391182f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f391183g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f391184h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f391185i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
