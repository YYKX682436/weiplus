package r45;

/* loaded from: classes4.dex */
public class uf0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387315d;

    /* renamed from: e, reason: collision with root package name */
    public int f387316e;

    /* renamed from: f, reason: collision with root package name */
    public int f387317f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f387318g;

    /* renamed from: h, reason: collision with root package name */
    public long f387319h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uf0)) {
            return false;
        }
        r45.uf0 uf0Var = (r45.uf0) fVar;
        return n51.f.a(this.BaseResponse, uf0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f387315d), java.lang.Integer.valueOf(uf0Var.f387315d)) && n51.f.a(java.lang.Integer.valueOf(this.f387316e), java.lang.Integer.valueOf(uf0Var.f387316e)) && n51.f.a(java.lang.Integer.valueOf(this.f387317f), java.lang.Integer.valueOf(uf0Var.f387317f)) && n51.f.a(this.f387318g, uf0Var.f387318g) && n51.f.a(java.lang.Long.valueOf(this.f387319h), java.lang.Long.valueOf(uf0Var.f387319h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f387315d);
            fVar.e(3, this.f387316e);
            fVar.e(4, this.f387317f);
            r45.cu5 cu5Var = this.f387318g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f387318g.writeFields(fVar);
            }
            fVar.h(6, this.f387319h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f387315d) + b36.f.e(3, this.f387316e) + b36.f.e(4, this.f387317f);
            r45.cu5 cu5Var2 = this.f387318g;
            if (cu5Var2 != null) {
                i18 += b36.f.i(5, cu5Var2.computeSize());
            }
            return i18 + b36.f.h(6, this.f387319h);
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
        r45.uf0 uf0Var = (r45.uf0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    uf0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                uf0Var.f387315d = aVar2.g(intValue);
                return 0;
            case 3:
                uf0Var.f387316e = aVar2.g(intValue);
                return 0;
            case 4:
                uf0Var.f387317f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    uf0Var.f387318g = cu5Var3;
                }
                return 0;
            case 6:
                uf0Var.f387319h = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
