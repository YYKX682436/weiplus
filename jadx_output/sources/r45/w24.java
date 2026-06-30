package r45;

/* loaded from: classes4.dex */
public class w24 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388801d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388802e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388803f;

    /* renamed from: g, reason: collision with root package name */
    public int f388804g;

    /* renamed from: h, reason: collision with root package name */
    public int f388805h;

    /* renamed from: i, reason: collision with root package name */
    public int f388806i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w24)) {
            return false;
        }
        r45.w24 w24Var = (r45.w24) fVar;
        return n51.f.a(this.BaseResponse, w24Var.BaseResponse) && n51.f.a(this.f388801d, w24Var.f388801d) && n51.f.a(this.f388802e, w24Var.f388802e) && n51.f.a(this.f388803f, w24Var.f388803f) && n51.f.a(java.lang.Integer.valueOf(this.f388804g), java.lang.Integer.valueOf(w24Var.f388804g)) && n51.f.a(java.lang.Integer.valueOf(this.f388805h), java.lang.Integer.valueOf(w24Var.f388805h)) && n51.f.a(java.lang.Integer.valueOf(this.f388806i), java.lang.Integer.valueOf(w24Var.f388806i));
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
            java.lang.String str = this.f388801d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f388802e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f388803f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f388804g);
            fVar.e(6, this.f388805h);
            fVar.e(7, this.f388806i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f388801d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f388802e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f388803f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            return i18 + b36.f.e(5, this.f388804g) + b36.f.e(6, this.f388805h) + b36.f.e(7, this.f388806i);
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
        r45.w24 w24Var = (r45.w24) objArr[1];
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
                    w24Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                w24Var.f388801d = aVar2.k(intValue);
                return 0;
            case 3:
                w24Var.f388802e = aVar2.k(intValue);
                return 0;
            case 4:
                w24Var.f388803f = aVar2.k(intValue);
                return 0;
            case 5:
                w24Var.f388804g = aVar2.g(intValue);
                return 0;
            case 6:
                w24Var.f388805h = aVar2.g(intValue);
                return 0;
            case 7:
                w24Var.f388806i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
