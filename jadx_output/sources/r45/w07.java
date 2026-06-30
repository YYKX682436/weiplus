package r45;

/* loaded from: classes8.dex */
public class w07 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388772d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388773e;

    /* renamed from: f, reason: collision with root package name */
    public r45.y07 f388774f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w07)) {
            return false;
        }
        r45.w07 w07Var = (r45.w07) fVar;
        return n51.f.a(this.BaseRequest, w07Var.BaseRequest) && n51.f.a(this.f388772d, w07Var.f388772d) && n51.f.a(this.f388773e, w07Var.f388773e) && n51.f.a(this.f388774f, w07Var.f388774f);
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
            java.lang.String str = this.f388772d;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f388773e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            r45.y07 y07Var = this.f388774f;
            if (y07Var != null) {
                fVar.i(4, y07Var.computeSize());
                this.f388774f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f388772d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388773e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            r45.y07 y07Var2 = this.f388774f;
            return y07Var2 != null ? i18 + b36.f.i(4, y07Var2.computeSize()) : i18;
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
        r45.w07 w07Var = (r45.w07) objArr[1];
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
                w07Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            w07Var.f388772d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            w07Var.f388773e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.y07 y07Var3 = new r45.y07();
            if (bArr2 != null && bArr2.length > 0) {
                y07Var3.parseFrom(bArr2);
            }
            w07Var.f388774f = y07Var3;
        }
        return 0;
    }
}
