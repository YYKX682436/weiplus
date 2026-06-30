package r45;

/* loaded from: classes4.dex */
public class je5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377765d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377766e;

    /* renamed from: f, reason: collision with root package name */
    public int f377767f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.je5)) {
            return false;
        }
        r45.je5 je5Var = (r45.je5) fVar;
        return n51.f.a(this.BaseResponse, je5Var.BaseResponse) && n51.f.a(this.f377765d, je5Var.f377765d) && n51.f.a(this.f377766e, je5Var.f377766e) && n51.f.a(java.lang.Integer.valueOf(this.f377767f), java.lang.Integer.valueOf(je5Var.f377767f));
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
            java.lang.String str = this.f377765d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f377766e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f377767f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f377765d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f377766e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f377767f);
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
        r45.je5 je5Var = (r45.je5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                je5Var.f377765d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                je5Var.f377766e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            je5Var.f377767f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ie ieVar3 = new r45.ie();
            if (bArr != null && bArr.length > 0) {
                ieVar3.parseFrom(bArr);
            }
            je5Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
