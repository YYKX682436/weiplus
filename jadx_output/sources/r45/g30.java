package r45;

/* loaded from: classes2.dex */
public class g30 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374849d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374850e;

    /* renamed from: f, reason: collision with root package name */
    public int f374851f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g30)) {
            return false;
        }
        r45.g30 g30Var = (r45.g30) fVar;
        return n51.f.a(this.BaseResponse, g30Var.BaseResponse) && n51.f.a(this.f374849d, g30Var.f374849d) && n51.f.a(this.f374850e, g30Var.f374850e) && n51.f.a(java.lang.Integer.valueOf(this.f374851f), java.lang.Integer.valueOf(g30Var.f374851f));
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
            java.lang.String str = this.f374849d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f374850e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f374851f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f374849d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f374850e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f374851f);
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
        r45.g30 g30Var = (r45.g30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                g30Var.f374849d = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                g30Var.f374850e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            g30Var.f374851f = aVar2.g(intValue);
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
            g30Var.BaseResponse = ieVar3;
        }
        return 0;
    }
}
