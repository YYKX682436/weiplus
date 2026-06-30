package r45;

/* loaded from: classes9.dex */
public class uu6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f387653d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sj0 f387654e;

    static {
        new r45.uu6();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.uu6 parseFrom(byte[] bArr) {
        return (r45.uu6) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uu6)) {
            return false;
        }
        r45.uu6 uu6Var = (r45.uu6) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f387653d), java.lang.Boolean.valueOf(uu6Var.f387653d)) && n51.f.a(this.f387654e, uu6Var.f387654e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.uu6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f387653d);
            r45.sj0 sj0Var = this.f387654e;
            if (sj0Var != null) {
                fVar.i(2, sj0Var.computeSize());
                this.f387654e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f387653d) + 0;
            r45.sj0 sj0Var2 = this.f387654e;
            return sj0Var2 != null ? a17 + b36.f.i(2, sj0Var2.computeSize()) : a17;
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
            this.f387653d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.sj0 sj0Var3 = new r45.sj0();
            if (bArr != null && bArr.length > 0) {
                sj0Var3.parseFrom(bArr);
            }
            this.f387654e = sj0Var3;
        }
        return 0;
    }
}
