package r45;

/* loaded from: classes4.dex */
public class ue6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387304d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387305e;

    /* renamed from: f, reason: collision with root package name */
    public int f387306f;

    /* renamed from: g, reason: collision with root package name */
    public long f387307g;

    /* renamed from: h, reason: collision with root package name */
    public long f387308h;

    /* renamed from: i, reason: collision with root package name */
    public int f387309i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ue6)) {
            return false;
        }
        r45.ue6 ue6Var = (r45.ue6) fVar;
        return n51.f.a(this.BaseRequest, ue6Var.BaseRequest) && n51.f.a(this.f387304d, ue6Var.f387304d) && n51.f.a(this.f387305e, ue6Var.f387305e) && n51.f.a(java.lang.Integer.valueOf(this.f387306f), java.lang.Integer.valueOf(ue6Var.f387306f)) && n51.f.a(java.lang.Long.valueOf(this.f387307g), java.lang.Long.valueOf(ue6Var.f387307g)) && n51.f.a(java.lang.Long.valueOf(this.f387308h), java.lang.Long.valueOf(ue6Var.f387308h)) && n51.f.a(java.lang.Integer.valueOf(this.f387309i), java.lang.Integer.valueOf(ue6Var.f387309i));
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
            java.lang.String str = this.f387304d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387305e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f387306f);
            fVar.h(5, this.f387307g);
            fVar.h(6, this.f387308h);
            fVar.e(7, this.f387309i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f387304d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f387305e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f387306f) + b36.f.h(5, this.f387307g) + b36.f.h(6, this.f387308h) + b36.f.e(7, this.f387309i);
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
        r45.ue6 ue6Var = (r45.ue6) objArr[1];
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
                    ue6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ue6Var.f387304d = aVar2.k(intValue);
                return 0;
            case 3:
                ue6Var.f387305e = aVar2.k(intValue);
                return 0;
            case 4:
                ue6Var.f387306f = aVar2.g(intValue);
                return 0;
            case 5:
                ue6Var.f387307g = aVar2.i(intValue);
                return 0;
            case 6:
                ue6Var.f387308h = aVar2.i(intValue);
                return 0;
            case 7:
                ue6Var.f387309i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
