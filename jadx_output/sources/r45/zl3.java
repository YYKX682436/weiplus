package r45;

/* loaded from: classes9.dex */
public class zl3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392193d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392194e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392195f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392196g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392197h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zl3)) {
            return false;
        }
        r45.zl3 zl3Var = (r45.zl3) fVar;
        return n51.f.a(this.BaseResponse, zl3Var.BaseResponse) && n51.f.a(this.f392193d, zl3Var.f392193d) && n51.f.a(this.f392194e, zl3Var.f392194e) && n51.f.a(this.f392195f, zl3Var.f392195f) && n51.f.a(this.f392196g, zl3Var.f392196g) && n51.f.a(this.f392197h, zl3Var.f392197h);
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
            java.lang.String str = this.f392193d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f392194e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f392195f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f392196g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f392197h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str6 = this.f392193d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f392194e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f392195f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f392196g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f392197h;
            return str10 != null ? i18 + b36.f.j(6, str10) : i18;
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
        r45.zl3 zl3Var = (r45.zl3) objArr[1];
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
                    zl3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                zl3Var.f392193d = aVar2.k(intValue);
                return 0;
            case 3:
                zl3Var.f392194e = aVar2.k(intValue);
                return 0;
            case 4:
                zl3Var.f392195f = aVar2.k(intValue);
                return 0;
            case 5:
                zl3Var.f392196g = aVar2.k(intValue);
                return 0;
            case 6:
                zl3Var.f392197h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
