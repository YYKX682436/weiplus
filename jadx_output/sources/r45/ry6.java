package r45;

/* loaded from: classes9.dex */
public class ry6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.i17 f385305d;

    /* renamed from: e, reason: collision with root package name */
    public int f385306e;

    /* renamed from: f, reason: collision with root package name */
    public int f385307f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385308g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f385309h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ry6)) {
            return false;
        }
        r45.ry6 ry6Var = (r45.ry6) fVar;
        return n51.f.a(this.BaseRequest, ry6Var.BaseRequest) && n51.f.a(this.f385305d, ry6Var.f385305d) && n51.f.a(java.lang.Integer.valueOf(this.f385306e), java.lang.Integer.valueOf(ry6Var.f385306e)) && n51.f.a(java.lang.Integer.valueOf(this.f385307f), java.lang.Integer.valueOf(ry6Var.f385307f)) && n51.f.a(this.f385308g, ry6Var.f385308g) && n51.f.a(this.f385309h, ry6Var.f385309h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.i17 i17Var = this.f385305d;
            if (i17Var != null) {
                fVar.i(2, i17Var.computeSize());
                this.f385305d.writeFields(fVar);
            }
            fVar.e(3, this.f385306e);
            fVar.e(4, this.f385307f);
            java.lang.String str = this.f385308g;
            if (str != null) {
                fVar.j(5, str);
            }
            r45.cu5 cu5Var = this.f385309h;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.computeSize());
                this.f385309h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.i17 i17Var2 = this.f385305d;
            if (i17Var2 != null) {
                i18 += b36.f.i(2, i17Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f385306e) + b36.f.e(4, this.f385307f);
            java.lang.String str2 = this.f385308g;
            if (str2 != null) {
                e17 += b36.f.j(5, str2);
            }
            r45.cu5 cu5Var2 = this.f385309h;
            return cu5Var2 != null ? e17 + b36.f.i(6, cu5Var2.computeSize()) : e17;
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
        r45.ry6 ry6Var = (r45.ry6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    ry6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.i17 i17Var3 = new r45.i17();
                    if (bArr2 != null && bArr2.length > 0) {
                        i17Var3.parseFrom(bArr2);
                    }
                    ry6Var.f385305d = i17Var3;
                }
                return 0;
            case 3:
                ry6Var.f385306e = aVar2.g(intValue);
                return 0;
            case 4:
                ry6Var.f385307f = aVar2.g(intValue);
                return 0;
            case 5:
                ry6Var.f385308g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    ry6Var.f385309h = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
