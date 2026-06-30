package r45;

/* loaded from: classes2.dex */
public class pr4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f383328d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383329e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383330f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383331g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383332h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pr4)) {
            return false;
        }
        r45.pr4 pr4Var = (r45.pr4) fVar;
        return n51.f.a(this.BaseResponse, pr4Var.BaseResponse) && n51.f.a(java.lang.Long.valueOf(this.f383328d), java.lang.Long.valueOf(pr4Var.f383328d)) && n51.f.a(this.f383329e, pr4Var.f383329e) && n51.f.a(this.f383330f, pr4Var.f383330f) && n51.f.a(this.f383331g, pr4Var.f383331g) && n51.f.a(this.f383332h, pr4Var.f383332h);
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
            fVar.h(2, this.f383328d);
            java.lang.String str = this.f383329e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f383330f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f383331g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f383332h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.h(2, this.f383328d);
            java.lang.String str5 = this.f383329e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f383330f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f383331g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f383332h;
            return str8 != null ? i18 + b36.f.j(6, str8) : i18;
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
        r45.pr4 pr4Var = (r45.pr4) objArr[1];
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
                    pr4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                pr4Var.f383328d = aVar2.i(intValue);
                return 0;
            case 3:
                pr4Var.f383329e = aVar2.k(intValue);
                return 0;
            case 4:
                pr4Var.f383330f = aVar2.k(intValue);
                return 0;
            case 5:
                pr4Var.f383331g = aVar2.k(intValue);
                return 0;
            case 6:
                pr4Var.f383332h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
