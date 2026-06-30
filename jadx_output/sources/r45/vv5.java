package r45;

/* loaded from: classes4.dex */
public class vv5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388608d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388609e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388610f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388611g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388612h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f388613i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vv5)) {
            return false;
        }
        r45.vv5 vv5Var = (r45.vv5) fVar;
        return n51.f.a(this.BaseResponse, vv5Var.BaseResponse) && n51.f.a(this.f388608d, vv5Var.f388608d) && n51.f.a(this.f388609e, vv5Var.f388609e) && n51.f.a(this.f388610f, vv5Var.f388610f) && n51.f.a(this.f388611g, vv5Var.f388611g) && n51.f.a(this.f388612h, vv5Var.f388612h) && n51.f.a(java.lang.Boolean.valueOf(this.f388613i), java.lang.Boolean.valueOf(vv5Var.f388613i));
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
            java.lang.String str = this.f388608d;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f388609e;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f388610f;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f388611g;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f388612h;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.a(8, this.f388613i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str5 = this.f388608d;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f388609e;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f388610f;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f388611g;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388612h;
            if (gVar2 != null) {
                i18 += b36.f.b(7, gVar2);
            }
            return i18 + b36.f.a(8, this.f388613i);
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
        r45.vv5 vv5Var = (r45.vv5) objArr[1];
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
                    vv5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
            default:
                return -1;
            case 3:
                vv5Var.f388608d = aVar2.k(intValue);
                return 0;
            case 4:
                vv5Var.f388609e = aVar2.k(intValue);
                return 0;
            case 5:
                vv5Var.f388610f = aVar2.k(intValue);
                return 0;
            case 6:
                vv5Var.f388611g = aVar2.k(intValue);
                return 0;
            case 7:
                vv5Var.f388612h = aVar2.d(intValue);
                return 0;
            case 8:
                vv5Var.f388613i = aVar2.c(intValue);
                return 0;
        }
    }
}
