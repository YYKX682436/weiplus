package r45;

/* loaded from: classes2.dex */
public class xg3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f390070d;

    /* renamed from: e, reason: collision with root package name */
    public r45.nv3 f390071e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390072f;

    /* renamed from: g, reason: collision with root package name */
    public int f390073g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xg3)) {
            return false;
        }
        r45.xg3 xg3Var = (r45.xg3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f390070d), java.lang.Integer.valueOf(xg3Var.f390070d)) && n51.f.a(this.f390071e, xg3Var.f390071e) && n51.f.a(this.f390072f, xg3Var.f390072f) && n51.f.a(java.lang.Integer.valueOf(this.f390073g), java.lang.Integer.valueOf(xg3Var.f390073g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f390070d);
            r45.nv3 nv3Var = this.f390071e;
            if (nv3Var != null) {
                fVar.i(2, nv3Var.computeSize());
                this.f390071e.writeFields(fVar);
            }
            java.lang.String str = this.f390072f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f390073g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f390070d) + 0;
            r45.nv3 nv3Var2 = this.f390071e;
            if (nv3Var2 != null) {
                e17 += b36.f.i(2, nv3Var2.computeSize());
            }
            java.lang.String str2 = this.f390072f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.e(4, this.f390073g);
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
        r45.xg3 xg3Var = (r45.xg3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            xg3Var.f390070d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                xg3Var.f390072f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            xg3Var.f390073g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.nv3 nv3Var3 = new r45.nv3();
            if (bArr != null && bArr.length > 0) {
                nv3Var3.parseFrom(bArr);
            }
            xg3Var.f390071e = nv3Var3;
        }
        return 0;
    }
}
