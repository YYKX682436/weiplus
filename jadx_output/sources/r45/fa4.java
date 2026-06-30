package r45;

/* loaded from: classes9.dex */
public class fa4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f374143d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f374144e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f374145f;

    /* renamed from: g, reason: collision with root package name */
    public int f374146g;

    /* renamed from: h, reason: collision with root package name */
    public r45.x84 f374147h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fa4)) {
            return false;
        }
        r45.fa4 fa4Var = (r45.fa4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f374143d), java.lang.Long.valueOf(fa4Var.f374143d)) && n51.f.a(this.f374144e, fa4Var.f374144e) && n51.f.a(java.lang.Boolean.valueOf(this.f374145f), java.lang.Boolean.valueOf(fa4Var.f374145f)) && n51.f.a(java.lang.Integer.valueOf(this.f374146g), java.lang.Integer.valueOf(fa4Var.f374146g)) && n51.f.a(this.f374147h, fa4Var.f374147h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f374143d);
            com.tencent.mm.protobuf.g gVar = this.f374144e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.a(3, this.f374145f);
            fVar.e(4, this.f374146g);
            r45.x84 x84Var = this.f374147h;
            if (x84Var != null) {
                fVar.i(5, x84Var.computeSize());
                this.f374147h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f374143d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f374144e;
            if (gVar2 != null) {
                h17 += b36.f.b(2, gVar2);
            }
            int a17 = h17 + b36.f.a(3, this.f374145f) + b36.f.e(4, this.f374146g);
            r45.x84 x84Var2 = this.f374147h;
            return x84Var2 != null ? a17 + b36.f.i(5, x84Var2.computeSize()) : a17;
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
        r45.fa4 fa4Var = (r45.fa4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fa4Var.f374143d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            fa4Var.f374144e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            fa4Var.f374145f = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            fa4Var.f374146g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.x84 x84Var3 = new r45.x84();
            if (bArr != null && bArr.length > 0) {
                x84Var3.parseFrom(bArr);
            }
            fa4Var.f374147h = x84Var3;
        }
        return 0;
    }
}
