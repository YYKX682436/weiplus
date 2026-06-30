package ks3;

/* loaded from: classes2.dex */
public class b1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f311636d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f311637e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f311638f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f311639g;

    /* renamed from: h, reason: collision with root package name */
    public int f311640h;

    /* renamed from: i, reason: collision with root package name */
    public int f311641i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.b1)) {
            return false;
        }
        ks3.b1 b1Var = (ks3.b1) fVar;
        return n51.f.a(this.BaseResponse, b1Var.BaseResponse) && n51.f.a(this.f311636d, b1Var.f311636d) && n51.f.a(java.lang.Boolean.valueOf(this.f311637e), java.lang.Boolean.valueOf(b1Var.f311637e)) && n51.f.a(this.f311638f, b1Var.f311638f) && n51.f.a(this.f311639g, b1Var.f311639g) && n51.f.a(java.lang.Integer.valueOf(this.f311640h), java.lang.Integer.valueOf(b1Var.f311640h)) && n51.f.a(java.lang.Integer.valueOf(this.f311641i), java.lang.Integer.valueOf(b1Var.f311641i));
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
            java.lang.String str = this.f311636d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f311637e);
            java.lang.String str2 = this.f311638f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f311639g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f311640h);
            fVar.e(7, this.f311641i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f311636d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int a17 = i18 + b36.f.a(3, this.f311637e);
            java.lang.String str5 = this.f311638f;
            if (str5 != null) {
                a17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f311639g;
            if (str6 != null) {
                a17 += b36.f.j(5, str6);
            }
            return a17 + b36.f.e(6, this.f311640h) + b36.f.e(7, this.f311641i);
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
        ks3.b1 b1Var = (ks3.b1) objArr[1];
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
                    b1Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                b1Var.f311636d = aVar2.k(intValue);
                return 0;
            case 3:
                b1Var.f311637e = aVar2.c(intValue);
                return 0;
            case 4:
                b1Var.f311638f = aVar2.k(intValue);
                return 0;
            case 5:
                b1Var.f311639g = aVar2.k(intValue);
                return 0;
            case 6:
                b1Var.f311640h = aVar2.g(intValue);
                return 0;
            case 7:
                b1Var.f311641i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
