package r45;

/* loaded from: classes4.dex */
public class bl3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f370846d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f370847e;

    /* renamed from: f, reason: collision with root package name */
    public int f370848f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f370849g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f370850h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f370851i;

    static {
        new r45.bl3();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bl3)) {
            return false;
        }
        r45.bl3 bl3Var = (r45.bl3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f370846d), java.lang.Integer.valueOf(bl3Var.f370846d)) && n51.f.a(this.f370847e, bl3Var.f370847e) && n51.f.a(java.lang.Integer.valueOf(this.f370848f), java.lang.Integer.valueOf(bl3Var.f370848f)) && n51.f.a(java.lang.Boolean.valueOf(this.f370849g), java.lang.Boolean.valueOf(bl3Var.f370849g)) && n51.f.a(java.lang.Boolean.valueOf(this.f370850h), java.lang.Boolean.valueOf(bl3Var.f370850h)) && n51.f.a(java.lang.Boolean.valueOf(this.f370851i), java.lang.Boolean.valueOf(bl3Var.f370851i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.bl3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f370846d);
            r45.cu5 cu5Var = this.f370847e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f370847e.writeFields(fVar);
            }
            fVar.e(3, this.f370848f);
            fVar.a(4, this.f370849g);
            fVar.a(5, this.f370850h);
            fVar.a(6, this.f370851i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f370846d) + 0;
            r45.cu5 cu5Var2 = this.f370847e;
            if (cu5Var2 != null) {
                e17 += b36.f.i(2, cu5Var2.computeSize());
            }
            return e17 + b36.f.e(3, this.f370848f) + b36.f.a(4, this.f370849g) + b36.f.a(5, this.f370850h) + b36.f.a(6, this.f370851i);
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
                this.f370846d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    this.f370847e = cu5Var3;
                }
                return 0;
            case 3:
                this.f370848f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f370849g = aVar2.c(intValue);
                return 0;
            case 5:
                this.f370850h = aVar2.c(intValue);
                return 0;
            case 6:
                this.f370851i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.bl3) super.parseFrom(bArr);
    }
}
