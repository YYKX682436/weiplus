package r45;

/* loaded from: classes4.dex */
public class i5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376733d;

    /* renamed from: e, reason: collision with root package name */
    public long f376734e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f376735f;

    /* renamed from: g, reason: collision with root package name */
    public r45.g5 f376736g;

    /* renamed from: h, reason: collision with root package name */
    public int f376737h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i5)) {
            return false;
        }
        r45.i5 i5Var = (r45.i5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376733d), java.lang.Integer.valueOf(i5Var.f376733d)) && n51.f.a(java.lang.Long.valueOf(this.f376734e), java.lang.Long.valueOf(i5Var.f376734e)) && n51.f.a(this.f376735f, i5Var.f376735f) && n51.f.a(this.f376736g, i5Var.f376736g) && n51.f.a(java.lang.Integer.valueOf(this.f376737h), java.lang.Integer.valueOf(i5Var.f376737h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376733d);
            fVar.h(2, this.f376734e);
            r45.cu5 cu5Var = this.f376735f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f376735f.writeFields(fVar);
            }
            r45.g5 g5Var = this.f376736g;
            if (g5Var != null) {
                fVar.i(4, g5Var.computeSize());
                this.f376736g.writeFields(fVar);
            }
            fVar.e(5, this.f376737h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376733d) + 0 + b36.f.h(2, this.f376734e);
            r45.cu5 cu5Var2 = this.f376735f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(3, cu5Var2.computeSize());
            }
            r45.g5 g5Var2 = this.f376736g;
            if (g5Var2 != null) {
                e17 += b36.f.i(4, g5Var2.computeSize());
            }
            return e17 + b36.f.e(5, this.f376737h);
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
        r45.i5 i5Var = (r45.i5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i5Var.f376733d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            i5Var.f376734e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.cu5 cu5Var3 = new r45.cu5();
                if (bArr != null && bArr.length > 0) {
                    cu5Var3.b(bArr);
                }
                i5Var.f376735f = cu5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            i5Var.f376737h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.g5 g5Var3 = new r45.g5();
            if (bArr2 != null && bArr2.length > 0) {
                g5Var3.parseFrom(bArr2);
            }
            i5Var.f376736g = g5Var3;
        }
        return 0;
    }
}
