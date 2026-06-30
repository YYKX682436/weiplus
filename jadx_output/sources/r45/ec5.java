package r45;

/* loaded from: classes8.dex */
public class ec5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373267d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373268e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373269f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373270g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f373271h;

    static {
        new r45.ec5();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ec5)) {
            return false;
        }
        r45.ec5 ec5Var = (r45.ec5) fVar;
        return n51.f.a(this.BaseResponse, ec5Var.BaseResponse) && n51.f.a(this.f373267d, ec5Var.f373267d) && n51.f.a(this.f373268e, ec5Var.f373268e) && n51.f.a(this.f373269f, ec5Var.f373269f) && n51.f.a(this.f373270g, ec5Var.f373270g) && n51.f.a(this.f373271h, ec5Var.f373271h);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.ec5();
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
            java.lang.String str = this.f373267d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f373268e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f373269f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f373270g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            r45.cu5 cu5Var = this.f373271h;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.computeSize());
                this.f373271h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str5 = this.f373267d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f373268e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f373269f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f373270g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            r45.cu5 cu5Var2 = this.f373271h;
            return cu5Var2 != null ? i18 + b36.f.i(6, cu5Var2.computeSize()) : i18;
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
                    this.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                this.f373267d = aVar2.k(intValue);
                return 0;
            case 3:
                this.f373268e = aVar2.k(intValue);
                return 0;
            case 4:
                this.f373269f = aVar2.k(intValue);
                return 0;
            case 5:
                this.f373270g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    this.f373271h = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.ec5) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
