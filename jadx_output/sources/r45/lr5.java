package r45;

/* loaded from: classes2.dex */
public class lr5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f379783d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379784e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379785f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379786g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379787h;

    /* renamed from: i, reason: collision with root package name */
    public long f379788i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379789m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lr5)) {
            return false;
        }
        r45.lr5 lr5Var = (r45.lr5) fVar;
        return n51.f.a(this.BaseResponse, lr5Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f379783d), java.lang.Integer.valueOf(lr5Var.f379783d)) && n51.f.a(this.f379784e, lr5Var.f379784e) && n51.f.a(this.f379785f, lr5Var.f379785f) && n51.f.a(this.f379786g, lr5Var.f379786g) && n51.f.a(this.f379787h, lr5Var.f379787h) && n51.f.a(java.lang.Long.valueOf(this.f379788i), java.lang.Long.valueOf(lr5Var.f379788i)) && n51.f.a(this.f379789m, lr5Var.f379789m);
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
            fVar.e(2, this.f379783d);
            java.lang.String str = this.f379784e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f379785f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f379786g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f379787h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.h(7, this.f379788i);
            java.lang.String str5 = this.f379789m;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f379783d);
            java.lang.String str6 = this.f379784e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f379785f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f379786g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f379787h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            int h17 = i18 + b36.f.h(7, this.f379788i);
            java.lang.String str10 = this.f379789m;
            return str10 != null ? h17 + b36.f.j(8, str10) : h17;
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
        r45.lr5 lr5Var = (r45.lr5) objArr[1];
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
                    lr5Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                lr5Var.f379783d = aVar2.g(intValue);
                return 0;
            case 3:
                lr5Var.f379784e = aVar2.k(intValue);
                return 0;
            case 4:
                lr5Var.f379785f = aVar2.k(intValue);
                return 0;
            case 5:
                lr5Var.f379786g = aVar2.k(intValue);
                return 0;
            case 6:
                lr5Var.f379787h = aVar2.k(intValue);
                return 0;
            case 7:
                lr5Var.f379788i = aVar2.i(intValue);
                return 0;
            case 8:
                lr5Var.f379789m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
