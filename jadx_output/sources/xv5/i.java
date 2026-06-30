package xv5;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457488d;

    /* renamed from: e, reason: collision with root package name */
    public int f457489e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f457490f;

    /* renamed from: g, reason: collision with root package name */
    public xv5.j f457491g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f457492h = new boolean[5];

    static {
        new xv5.i();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public xv5.i parseFrom(byte[] bArr) {
        return (xv5.i) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xv5.i)) {
            return false;
        }
        xv5.i iVar = (xv5.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457488d), java.lang.Integer.valueOf(iVar.f457488d)) && n51.f.a(java.lang.Integer.valueOf(this.f457489e), java.lang.Integer.valueOf(iVar.f457489e)) && n51.f.a(java.lang.Boolean.valueOf(this.f457490f), java.lang.Boolean.valueOf(iVar.f457490f)) && n51.f.a(this.f457491g, iVar.f457491g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new xv5.i();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f457492h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f457488d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f457489e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f457490f);
            }
            xv5.j jVar = this.f457491g;
            if (jVar != null && zArr[4]) {
                fVar.e(4, jVar.f457497d);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f457488d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f457489e);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f457490f);
            }
            xv5.j jVar2 = this.f457491g;
            return (jVar2 == null || !zArr[4]) ? e17 : e17 + b36.f.e(4, jVar2.f457497d);
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
            this.f457488d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f457489e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f457490f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f457491g = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : xv5.j.CBTTableColumnAlignment_Right : xv5.j.CBTTableColumnAlignment_Center : xv5.j.CBTTableColumnAlignment_Left;
        zArr[4] = true;
        return 0;
    }
}
