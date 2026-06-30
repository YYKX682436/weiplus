package r45;

/* loaded from: classes9.dex */
public class mf3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f380441d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380442e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380443f;

    /* renamed from: g, reason: collision with root package name */
    public int f380444g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380445h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mf3)) {
            return false;
        }
        r45.mf3 mf3Var = (r45.mf3) fVar;
        return n51.f.a(this.BaseResponse, mf3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f380441d), java.lang.Integer.valueOf(mf3Var.f380441d)) && n51.f.a(this.f380442e, mf3Var.f380442e) && n51.f.a(this.f380443f, mf3Var.f380443f) && n51.f.a(java.lang.Integer.valueOf(this.f380444g), java.lang.Integer.valueOf(mf3Var.f380444g)) && n51.f.a(this.f380445h, mf3Var.f380445h);
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
            fVar.e(2, this.f380441d);
            java.lang.String str = this.f380442e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f380443f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f380444g);
            java.lang.String str3 = this.f380445h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f380441d);
            java.lang.String str4 = this.f380442e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f380443f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int e17 = i18 + b36.f.e(5, this.f380444g);
            java.lang.String str6 = this.f380445h;
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
        r45.mf3 mf3Var = (r45.mf3) objArr[1];
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
                    mf3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                mf3Var.f380441d = aVar2.g(intValue);
                return 0;
            case 3:
                mf3Var.f380442e = aVar2.k(intValue);
                return 0;
            case 4:
                mf3Var.f380443f = aVar2.k(intValue);
                return 0;
            case 5:
                mf3Var.f380444g = aVar2.g(intValue);
                return 0;
            case 6:
                mf3Var.f380445h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
