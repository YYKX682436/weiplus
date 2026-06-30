package r45;

/* loaded from: classes8.dex */
public class hc5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.nl4 f376048d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376049e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376050f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376051g;

    /* renamed from: h, reason: collision with root package name */
    public r45.f04 f376052h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hc5)) {
            return false;
        }
        r45.hc5 hc5Var = (r45.hc5) fVar;
        return n51.f.a(this.BaseResponse, hc5Var.BaseResponse) && n51.f.a(this.f376048d, hc5Var.f376048d) && n51.f.a(this.f376049e, hc5Var.f376049e) && n51.f.a(this.f376050f, hc5Var.f376050f) && n51.f.a(this.f376051g, hc5Var.f376051g) && n51.f.a(this.f376052h, hc5Var.f376052h);
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
            r45.nl4 nl4Var = this.f376048d;
            if (nl4Var != null) {
                fVar.i(2, nl4Var.computeSize());
                this.f376048d.writeFields(fVar);
            }
            java.lang.String str = this.f376049e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f376050f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f376051g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.f04 f04Var = this.f376052h;
            if (f04Var != null) {
                fVar.i(100, f04Var.computeSize());
                this.f376052h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.nl4 nl4Var2 = this.f376048d;
            if (nl4Var2 != null) {
                i18 += b36.f.i(2, nl4Var2.computeSize());
            }
            java.lang.String str4 = this.f376049e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f376050f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f376051g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.f04 f04Var2 = this.f376052h;
            return f04Var2 != null ? i18 + b36.f.i(100, f04Var2.computeSize()) : i18;
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
        r45.hc5 hc5Var = (r45.hc5) objArr[1];
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
                hc5Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.nl4 nl4Var3 = new r45.nl4();
                if (bArr2 != null && bArr2.length > 0) {
                    nl4Var3.parseFrom(bArr2);
                }
                hc5Var.f376048d = nl4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            hc5Var.f376049e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            hc5Var.f376050f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            hc5Var.f376051g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.f04 f04Var3 = new r45.f04();
            if (bArr3 != null && bArr3.length > 0) {
                f04Var3.parseFrom(bArr3);
            }
            hc5Var.f376052h = f04Var3;
        }
        return 0;
    }
}
