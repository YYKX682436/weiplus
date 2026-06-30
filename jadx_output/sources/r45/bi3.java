package r45;

/* loaded from: classes4.dex */
public class bi3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f370774d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370775e;

    /* renamed from: f, reason: collision with root package name */
    public int f370776f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f370777g;

    /* renamed from: h, reason: collision with root package name */
    public int f370778h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370779i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f370780m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bi3)) {
            return false;
        }
        r45.bi3 bi3Var = (r45.bi3) fVar;
        return n51.f.a(this.BaseResponse, bi3Var.BaseResponse) && n51.f.a(this.f370774d, bi3Var.f370774d) && n51.f.a(this.f370775e, bi3Var.f370775e) && n51.f.a(java.lang.Integer.valueOf(this.f370776f), java.lang.Integer.valueOf(bi3Var.f370776f)) && n51.f.a(this.f370777g, bi3Var.f370777g) && n51.f.a(java.lang.Integer.valueOf(this.f370778h), java.lang.Integer.valueOf(bi3Var.f370778h)) && n51.f.a(this.f370779i, bi3Var.f370779i) && n51.f.a(this.f370780m, bi3Var.f370780m);
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
            r45.cu5 cu5Var = this.f370774d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f370774d.writeFields(fVar);
            }
            java.lang.String str = this.f370775e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f370776f);
            r45.cu5 cu5Var2 = this.f370777g;
            if (cu5Var2 != null) {
                fVar.i(5, cu5Var2.computeSize());
                this.f370777g.writeFields(fVar);
            }
            fVar.e(6, this.f370778h);
            java.lang.String str2 = this.f370779i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            r45.cu5 cu5Var3 = this.f370780m;
            if (cu5Var3 != null) {
                fVar.i(8, cu5Var3.computeSize());
                this.f370780m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.cu5 cu5Var4 = this.f370774d;
            if (cu5Var4 != null) {
                i18 += b36.f.i(2, cu5Var4.computeSize());
            }
            java.lang.String str3 = this.f370775e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int e17 = i18 + b36.f.e(4, this.f370776f);
            r45.cu5 cu5Var5 = this.f370777g;
            if (cu5Var5 != null) {
                e17 += b36.f.i(5, cu5Var5.computeSize());
            }
            int e18 = e17 + b36.f.e(6, this.f370778h);
            java.lang.String str4 = this.f370779i;
            if (str4 != null) {
                e18 += b36.f.j(7, str4);
            }
            r45.cu5 cu5Var6 = this.f370780m;
            return cu5Var6 != null ? e18 + b36.f.i(8, cu5Var6.computeSize()) : e18;
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
        r45.bi3 bi3Var = (r45.bi3) objArr[1];
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
                    bi3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var7 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var7.b(bArr2);
                    }
                    bi3Var.f370774d = cu5Var7;
                }
                return 0;
            case 3:
                bi3Var.f370775e = aVar2.k(intValue);
                return 0;
            case 4:
                bi3Var.f370776f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var8 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var8.b(bArr3);
                    }
                    bi3Var.f370777g = cu5Var8;
                }
                return 0;
            case 6:
                bi3Var.f370778h = aVar2.g(intValue);
                return 0;
            case 7:
                bi3Var.f370779i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var9.b(bArr4);
                    }
                    bi3Var.f370780m = cu5Var9;
                }
                return 0;
            default:
                return -1;
        }
    }
}
