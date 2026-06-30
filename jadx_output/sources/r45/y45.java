package r45;

/* loaded from: classes4.dex */
public class y45 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f390781d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390782e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390783f;

    /* renamed from: g, reason: collision with root package name */
    public int f390784g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f390785h;

    /* renamed from: i, reason: collision with root package name */
    public int f390786i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y45)) {
            return false;
        }
        r45.y45 y45Var = (r45.y45) fVar;
        return n51.f.a(this.BaseResponse, y45Var.BaseResponse) && n51.f.a(this.f390781d, y45Var.f390781d) && n51.f.a(this.f390782e, y45Var.f390782e) && n51.f.a(this.f390783f, y45Var.f390783f) && n51.f.a(java.lang.Integer.valueOf(this.f390784g), java.lang.Integer.valueOf(y45Var.f390784g)) && n51.f.a(this.f390785h, y45Var.f390785h) && n51.f.a(java.lang.Integer.valueOf(this.f390786i), java.lang.Integer.valueOf(y45Var.f390786i));
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
            java.lang.String str = this.f390781d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f390782e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f390783f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(6, this.f390784g);
            java.lang.String str4 = this.f390785h;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f390786i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str5 = this.f390781d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f390782e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f390783f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(6, this.f390784g);
            java.lang.String str8 = this.f390785h;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            return e17 + b36.f.e(9, this.f390786i);
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
        r45.y45 y45Var = (r45.y45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                y45Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            y45Var.f390781d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            y45Var.f390782e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            y45Var.f390783f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 6) {
            y45Var.f390784g = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 8) {
            y45Var.f390785h = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 9) {
            return -1;
        }
        y45Var.f390786i = aVar2.g(intValue);
        return 0;
    }
}
