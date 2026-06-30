package r45;

/* loaded from: classes9.dex */
public class x73 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389840d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389841e;

    /* renamed from: f, reason: collision with root package name */
    public int f389842f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389843g;

    /* renamed from: h, reason: collision with root package name */
    public r45.v67 f389844h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x73)) {
            return false;
        }
        r45.x73 x73Var = (r45.x73) fVar;
        return n51.f.a(this.BaseResponse, x73Var.BaseResponse) && n51.f.a(this.f389840d, x73Var.f389840d) && n51.f.a(this.f389841e, x73Var.f389841e) && n51.f.a(java.lang.Integer.valueOf(this.f389842f), java.lang.Integer.valueOf(x73Var.f389842f)) && n51.f.a(this.f389843g, x73Var.f389843g) && n51.f.a(this.f389844h, x73Var.f389844h);
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
            java.lang.String str = this.f389840d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f389841e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f389842f);
            java.lang.String str3 = this.f389843g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.v67 v67Var = this.f389844h;
            if (v67Var != null) {
                fVar.i(6, v67Var.computeSize());
                this.f389844h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f389840d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f389841e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f389842f);
            java.lang.String str6 = this.f389843g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            r45.v67 v67Var2 = this.f389844h;
            return v67Var2 != null ? e17 + b36.f.i(6, v67Var2.computeSize()) : e17;
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
        r45.x73 x73Var = (r45.x73) objArr[1];
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
                    x73Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                x73Var.f389840d = aVar2.k(intValue);
                return 0;
            case 3:
                x73Var.f389841e = aVar2.k(intValue);
                return 0;
            case 4:
                x73Var.f389842f = aVar2.g(intValue);
                return 0;
            case 5:
                x73Var.f389843g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.v67 v67Var3 = new r45.v67();
                    if (bArr2 != null && bArr2.length > 0) {
                        v67Var3.parseFrom(bArr2);
                    }
                    x73Var.f389844h = v67Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
