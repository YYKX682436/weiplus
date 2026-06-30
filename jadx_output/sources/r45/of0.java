package r45;

/* loaded from: classes4.dex */
public class of0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382210d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382211e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382212f;

    /* renamed from: g, reason: collision with root package name */
    public int f382213g;

    /* renamed from: h, reason: collision with root package name */
    public int f382214h;

    /* renamed from: i, reason: collision with root package name */
    public int f382215i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f382216m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.of0)) {
            return false;
        }
        r45.of0 of0Var = (r45.of0) fVar;
        return n51.f.a(this.BaseResponse, of0Var.BaseResponse) && n51.f.a(this.f382210d, of0Var.f382210d) && n51.f.a(this.f382211e, of0Var.f382211e) && n51.f.a(this.f382212f, of0Var.f382212f) && n51.f.a(java.lang.Integer.valueOf(this.f382213g), java.lang.Integer.valueOf(of0Var.f382213g)) && n51.f.a(java.lang.Integer.valueOf(this.f382214h), java.lang.Integer.valueOf(of0Var.f382214h)) && n51.f.a(java.lang.Integer.valueOf(this.f382215i), java.lang.Integer.valueOf(of0Var.f382215i)) && n51.f.a(this.f382216m, of0Var.f382216m);
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
            java.lang.String str = this.f382210d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f382211e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f382212f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f382213g);
            fVar.e(6, this.f382214h);
            fVar.e(7, this.f382215i);
            r45.cu5 cu5Var = this.f382216m;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.computeSize());
                this.f382216m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f382210d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f382211e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f382212f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            int e17 = i18 + b36.f.e(5, this.f382213g) + b36.f.e(6, this.f382214h) + b36.f.e(7, this.f382215i);
            r45.cu5 cu5Var2 = this.f382216m;
            return cu5Var2 != null ? e17 + b36.f.i(8, cu5Var2.computeSize()) : e17;
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
        r45.of0 of0Var = (r45.of0) objArr[1];
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
                    of0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                of0Var.f382210d = aVar2.k(intValue);
                return 0;
            case 3:
                of0Var.f382211e = aVar2.k(intValue);
                return 0;
            case 4:
                of0Var.f382212f = aVar2.k(intValue);
                return 0;
            case 5:
                of0Var.f382213g = aVar2.g(intValue);
                return 0;
            case 6:
                of0Var.f382214h = aVar2.g(intValue);
                return 0;
            case 7:
                of0Var.f382215i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    of0Var.f382216m = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
