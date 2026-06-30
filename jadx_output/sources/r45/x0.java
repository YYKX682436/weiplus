package r45;

/* loaded from: classes4.dex */
public class x0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f389613d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389614e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389615f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f389616g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x0)) {
            return false;
        }
        r45.x0 x0Var = (r45.x0) fVar;
        return n51.f.a(this.BaseRequest, x0Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f389613d), java.lang.Integer.valueOf(x0Var.f389613d)) && n51.f.a(this.f389614e, x0Var.f389614e) && n51.f.a(this.f389615f, x0Var.f389615f) && n51.f.a(java.lang.Boolean.valueOf(this.f389616g), java.lang.Boolean.valueOf(x0Var.f389616g));
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
            fVar.e(2, this.f389613d);
            java.lang.String str = this.f389614e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f389615f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f389616g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f389613d);
            java.lang.String str3 = this.f389614e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f389615f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.a(5, this.f389616g);
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
        r45.x0 x0Var = (r45.x0) objArr[1];
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
                x0Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            x0Var.f389613d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            x0Var.f389614e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            x0Var.f389615f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        x0Var.f389616g = aVar2.c(intValue);
        return 0;
    }
}
