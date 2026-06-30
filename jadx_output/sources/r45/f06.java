package r45;

/* loaded from: classes2.dex */
public class f06 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f373914d;

    /* renamed from: e, reason: collision with root package name */
    public int f373915e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373916f;

    /* renamed from: g, reason: collision with root package name */
    public long f373917g;

    /* renamed from: h, reason: collision with root package name */
    public r45.od4 f373918h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f373919i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f06)) {
            return false;
        }
        r45.f06 f06Var = (r45.f06) fVar;
        return n51.f.a(this.BaseRequest, f06Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f373914d), java.lang.Integer.valueOf(f06Var.f373914d)) && n51.f.a(java.lang.Integer.valueOf(this.f373915e), java.lang.Integer.valueOf(f06Var.f373915e)) && n51.f.a(this.f373916f, f06Var.f373916f) && n51.f.a(java.lang.Long.valueOf(this.f373917g), java.lang.Long.valueOf(f06Var.f373917g)) && n51.f.a(this.f373918h, f06Var.f373918h) && n51.f.a(this.f373919i, f06Var.f373919i);
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
            fVar.e(2, this.f373914d);
            fVar.e(3, this.f373915e);
            java.lang.String str = this.f373916f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f373917g);
            r45.od4 od4Var = this.f373918h;
            if (od4Var != null) {
                fVar.i(6, od4Var.computeSize());
                this.f373918h.writeFields(fVar);
            }
            java.lang.String str2 = this.f373919i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f373914d) + b36.f.e(3, this.f373915e);
            java.lang.String str3 = this.f373916f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int h17 = i18 + b36.f.h(5, this.f373917g);
            r45.od4 od4Var2 = this.f373918h;
            if (od4Var2 != null) {
                h17 += b36.f.i(6, od4Var2.computeSize());
            }
            java.lang.String str4 = this.f373919i;
            return str4 != null ? h17 + b36.f.j(7, str4) : h17;
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
        r45.f06 f06Var = (r45.f06) objArr[1];
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
                    f06Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                f06Var.f373914d = aVar2.g(intValue);
                return 0;
            case 3:
                f06Var.f373915e = aVar2.g(intValue);
                return 0;
            case 4:
                f06Var.f373916f = aVar2.k(intValue);
                return 0;
            case 5:
                f06Var.f373917g = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.od4 od4Var3 = new r45.od4();
                    if (bArr2 != null && bArr2.length > 0) {
                        od4Var3.parseFrom(bArr2);
                    }
                    f06Var.f373918h = od4Var3;
                }
                return 0;
            case 7:
                f06Var.f373919i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
