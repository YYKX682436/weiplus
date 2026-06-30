package r45;

/* loaded from: classes2.dex */
public class jg3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377790d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377791e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377792f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jg3)) {
            return false;
        }
        r45.jg3 jg3Var = (r45.jg3) fVar;
        return n51.f.a(this.BaseRequest, jg3Var.BaseRequest) && n51.f.a(this.f377790d, jg3Var.f377790d) && n51.f.a(this.f377791e, jg3Var.f377791e) && n51.f.a(this.f377792f, jg3Var.f377792f);
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
            java.lang.String str = this.f377790d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f377791e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f377792f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f377790d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f377791e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f377792f;
            return str6 != null ? i18 + b36.f.j(4, str6) : i18;
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
        r45.jg3 jg3Var = (r45.jg3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                jg3Var.f377790d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                jg3Var.f377791e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            jg3Var.f377792f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.parseFrom(bArr);
            }
            jg3Var.BaseRequest = heVar3;
        }
        return 0;
    }
}
