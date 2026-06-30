package r45;

/* loaded from: classes2.dex */
public class t14 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386058d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386059e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386060f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386061g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386062h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386063i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t14)) {
            return false;
        }
        r45.t14 t14Var = (r45.t14) fVar;
        return n51.f.a(this.BaseResponse, t14Var.BaseResponse) && n51.f.a(this.f386058d, t14Var.f386058d) && n51.f.a(this.f386059e, t14Var.f386059e) && n51.f.a(this.f386060f, t14Var.f386060f) && n51.f.a(this.f386061g, t14Var.f386061g) && n51.f.a(this.f386062h, t14Var.f386062h) && n51.f.a(this.f386063i, t14Var.f386063i);
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
            java.lang.String str = this.f386058d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386059e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f386060f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f386061g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f386062h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f386063i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str7 = this.f386058d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f386059e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f386060f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f386061g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f386062h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f386063i;
            return str12 != null ? i18 + b36.f.j(7, str12) : i18;
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
        r45.t14 t14Var = (r45.t14) objArr[1];
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
                    t14Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                t14Var.f386058d = aVar2.k(intValue);
                return 0;
            case 3:
                t14Var.f386059e = aVar2.k(intValue);
                return 0;
            case 4:
                t14Var.f386060f = aVar2.k(intValue);
                return 0;
            case 5:
                t14Var.f386061g = aVar2.k(intValue);
                return 0;
            case 6:
                t14Var.f386062h = aVar2.k(intValue);
                return 0;
            case 7:
                t14Var.f386063i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
