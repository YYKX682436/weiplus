package r45;

/* loaded from: classes4.dex */
public class u44 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387020d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387021e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387022f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387023g;

    /* renamed from: h, reason: collision with root package name */
    public int f387024h;

    static {
        new r45.u44();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.u44 parseFrom(byte[] bArr) {
        return (r45.u44) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u44)) {
            return false;
        }
        r45.u44 u44Var = (r45.u44) fVar;
        return n51.f.a(this.f387020d, u44Var.f387020d) && n51.f.a(this.f387021e, u44Var.f387021e) && n51.f.a(this.f387022f, u44Var.f387022f) && n51.f.a(this.f387023g, u44Var.f387023g) && n51.f.a(java.lang.Integer.valueOf(this.f387024h), java.lang.Integer.valueOf(u44Var.f387024h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.u44();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387020d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387021e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f387022f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f387023g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f387024h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f387020d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f387021e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f387022f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f387023g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f387024h);
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
        if (intValue == 1) {
            this.f387020d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f387021e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f387022f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f387023g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f387024h = aVar2.g(intValue);
        return 0;
    }
}
