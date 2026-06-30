package r45;

/* loaded from: classes4.dex */
public class vi3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f388284d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388285e;

    /* renamed from: f, reason: collision with root package name */
    public int f388286f;

    /* renamed from: g, reason: collision with root package name */
    public int f388287g;

    /* renamed from: h, reason: collision with root package name */
    public r45.j45 f388288h;

    /* renamed from: i, reason: collision with root package name */
    public int f388289i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vi3)) {
            return false;
        }
        r45.vi3 vi3Var = (r45.vi3) fVar;
        return n51.f.a(this.BaseResponse, vi3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f388284d), java.lang.Integer.valueOf(vi3Var.f388284d)) && n51.f.a(this.f388285e, vi3Var.f388285e) && n51.f.a(java.lang.Integer.valueOf(this.f388286f), java.lang.Integer.valueOf(vi3Var.f388286f)) && n51.f.a(java.lang.Integer.valueOf(this.f388287g), java.lang.Integer.valueOf(vi3Var.f388287g)) && n51.f.a(this.f388288h, vi3Var.f388288h) && n51.f.a(java.lang.Integer.valueOf(this.f388289i), java.lang.Integer.valueOf(vi3Var.f388289i));
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
            fVar.e(2, this.f388284d);
            java.lang.String str = this.f388285e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f388286f);
            fVar.e(5, this.f388287g);
            r45.j45 j45Var = this.f388288h;
            if (j45Var != null) {
                fVar.i(6, j45Var.computeSize());
                this.f388288h.writeFields(fVar);
            }
            fVar.e(7, this.f388289i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f388284d);
            java.lang.String str2 = this.f388285e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f388286f) + b36.f.e(5, this.f388287g);
            r45.j45 j45Var2 = this.f388288h;
            if (j45Var2 != null) {
                e17 += b36.f.i(6, j45Var2.computeSize());
            }
            return e17 + b36.f.e(7, this.f388289i);
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
        r45.vi3 vi3Var = (r45.vi3) objArr[1];
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
                    vi3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                vi3Var.f388284d = aVar2.g(intValue);
                return 0;
            case 3:
                vi3Var.f388285e = aVar2.k(intValue);
                return 0;
            case 4:
                vi3Var.f388286f = aVar2.g(intValue);
                return 0;
            case 5:
                vi3Var.f388287g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.j45 j45Var3 = new r45.j45();
                    if (bArr2 != null && bArr2.length > 0) {
                        j45Var3.parseFrom(bArr2);
                    }
                    vi3Var.f388288h = j45Var3;
                }
                return 0;
            case 7:
                vi3Var.f388289i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
