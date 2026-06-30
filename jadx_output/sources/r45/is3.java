package r45;

/* loaded from: classes8.dex */
public class is3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377303e;

    /* renamed from: f, reason: collision with root package name */
    public int f377304f;

    /* renamed from: g, reason: collision with root package name */
    public int f377305g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377306h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f377307i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.is3)) {
            return false;
        }
        r45.is3 is3Var = (r45.is3) fVar;
        return n51.f.a(this.BaseRequest, is3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377302d), java.lang.Integer.valueOf(is3Var.f377302d)) && n51.f.a(this.f377303e, is3Var.f377303e) && n51.f.a(java.lang.Integer.valueOf(this.f377304f), java.lang.Integer.valueOf(is3Var.f377304f)) && n51.f.a(java.lang.Integer.valueOf(this.f377305g), java.lang.Integer.valueOf(is3Var.f377305g)) && n51.f.a(this.f377306h, is3Var.f377306h) && n51.f.a(this.f377307i, is3Var.f377307i);
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
            fVar.e(2, this.f377302d);
            java.lang.String str = this.f377303e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f377304f);
            fVar.e(5, this.f377305g);
            java.lang.String str2 = this.f377306h;
            if (str2 != null) {
                fVar.j(101, str2);
            }
            java.lang.String str3 = this.f377307i;
            if (str3 != null) {
                fVar.j(103, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377302d);
            java.lang.String str4 = this.f377303e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f377304f) + b36.f.e(5, this.f377305g);
            java.lang.String str5 = this.f377306h;
            if (str5 != null) {
                e17 += b36.f.j(101, str5);
            }
            java.lang.String str6 = this.f377307i;
            return str6 != null ? e17 + b36.f.j(103, str6) : e17;
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
        r45.is3 is3Var = (r45.is3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                is3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            is3Var.f377302d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            is3Var.f377303e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            is3Var.f377304f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            is3Var.f377305g = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 101) {
            is3Var.f377306h = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 103) {
            return -1;
        }
        is3Var.f377307i = aVar2.k(intValue);
        return 0;
    }
}
