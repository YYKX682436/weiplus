package r45;

/* loaded from: classes9.dex */
public class um0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f387477d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387478e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387479f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387480g;

    static {
        new r45.um0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.um0 parseFrom(byte[] bArr) {
        return (r45.um0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.um0)) {
            return false;
        }
        r45.um0 um0Var = (r45.um0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f387477d), java.lang.Integer.valueOf(um0Var.f387477d)) && n51.f.a(this.f387478e, um0Var.f387478e) && n51.f.a(this.f387479f, um0Var.f387479f) && n51.f.a(this.f387480g, um0Var.f387480g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.um0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f387477d);
            java.lang.String str = this.f387478e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387479f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f387480g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f387477d) + 0;
            java.lang.String str4 = this.f387478e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f387479f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f387480g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
            this.f387477d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f387478e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f387479f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f387480g = aVar2.k(intValue);
        return 0;
    }
}
