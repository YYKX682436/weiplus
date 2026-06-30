package r45;

/* loaded from: classes4.dex */
public class cl4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f371651d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f371652e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371653f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371654g;

    /* renamed from: h, reason: collision with root package name */
    public r45.g04 f371655h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cl4)) {
            return false;
        }
        r45.cl4 cl4Var = (r45.cl4) fVar;
        return n51.f.a(this.BaseResponse, cl4Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f371651d), java.lang.Integer.valueOf(cl4Var.f371651d)) && n51.f.a(this.f371652e, cl4Var.f371652e) && n51.f.a(this.f371653f, cl4Var.f371653f) && n51.f.a(this.f371654g, cl4Var.f371654g) && n51.f.a(this.f371655h, cl4Var.f371655h);
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
            fVar.e(2, this.f371651d);
            java.lang.String str = this.f371652e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f371653f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f371654g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.g04 g04Var = this.f371655h;
            if (g04Var != null) {
                fVar.i(6, g04Var.computeSize());
                this.f371655h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f371651d);
            java.lang.String str4 = this.f371652e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f371653f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f371654g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.g04 g04Var2 = this.f371655h;
            return g04Var2 != null ? i18 + b36.f.i(6, g04Var2.computeSize()) : i18;
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
        r45.cl4 cl4Var = (r45.cl4) objArr[1];
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
                    cl4Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                cl4Var.f371651d = aVar2.g(intValue);
                return 0;
            case 3:
                cl4Var.f371652e = aVar2.k(intValue);
                return 0;
            case 4:
                cl4Var.f371653f = aVar2.k(intValue);
                return 0;
            case 5:
                cl4Var.f371654g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.g04 g04Var3 = new r45.g04();
                    if (bArr2 != null && bArr2.length > 0) {
                        g04Var3.parseFrom(bArr2);
                    }
                    cl4Var.f371655h = g04Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
