package r45;

/* loaded from: classes2.dex */
public class r33 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384500d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384501e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f384502f;

    /* renamed from: g, reason: collision with root package name */
    public int f384503g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384504h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r33)) {
            return false;
        }
        r45.r33 r33Var = (r45.r33) fVar;
        return n51.f.a(this.BaseResponse, r33Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384500d), java.lang.Integer.valueOf(r33Var.f384500d)) && n51.f.a(this.f384501e, r33Var.f384501e) && n51.f.a(this.f384502f, r33Var.f384502f) && n51.f.a(java.lang.Integer.valueOf(this.f384503g), java.lang.Integer.valueOf(r33Var.f384503g)) && n51.f.a(this.f384504h, r33Var.f384504h);
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
            fVar.e(2, this.f384500d);
            java.lang.String str = this.f384501e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f384502f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f384503g);
            java.lang.String str3 = this.f384504h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384500d);
            java.lang.String str4 = this.f384501e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f384502f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int e17 = i18 + b36.f.e(5, this.f384503g);
            java.lang.String str6 = this.f384504h;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        r45.r33 r33Var = (r45.r33) objArr[1];
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
                    r33Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                r33Var.f384500d = aVar2.g(intValue);
                return 0;
            case 3:
                r33Var.f384501e = aVar2.k(intValue);
                return 0;
            case 4:
                r33Var.f384502f = aVar2.k(intValue);
                return 0;
            case 5:
                r33Var.f384503g = aVar2.g(intValue);
                return 0;
            case 6:
                r33Var.f384504h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
