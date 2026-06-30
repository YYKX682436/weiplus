package r45;

/* loaded from: classes9.dex */
public class vm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388354d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388355e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388356f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388357g;

    static {
        new r45.vm0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.vm0 parseFrom(byte[] bArr) {
        return (r45.vm0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vm0)) {
            return false;
        }
        r45.vm0 vm0Var = (r45.vm0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388354d), java.lang.Integer.valueOf(vm0Var.f388354d)) && n51.f.a(this.f388355e, vm0Var.f388355e) && n51.f.a(this.f388356f, vm0Var.f388356f) && n51.f.a(this.f388357g, vm0Var.f388357g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.vm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388354d);
            java.lang.String str = this.f388355e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f388356f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f388357g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388354d) + 0;
            java.lang.String str4 = this.f388355e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f388356f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f388357g;
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
            this.f388354d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f388355e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f388356f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f388357g = aVar2.k(intValue);
        return 0;
    }
}
