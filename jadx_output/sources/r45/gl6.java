package r45;

/* loaded from: classes9.dex */
public class gl6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f375342d;

    /* renamed from: e, reason: collision with root package name */
    public int f375343e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375344f;

    /* renamed from: g, reason: collision with root package name */
    public int f375345g;

    /* renamed from: h, reason: collision with root package name */
    public int f375346h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375347i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gl6)) {
            return false;
        }
        r45.gl6 gl6Var = (r45.gl6) fVar;
        return n51.f.a(this.BaseResponse, gl6Var.BaseResponse) && n51.f.a(this.f375342d, gl6Var.f375342d) && n51.f.a(java.lang.Integer.valueOf(this.f375343e), java.lang.Integer.valueOf(gl6Var.f375343e)) && n51.f.a(this.f375344f, gl6Var.f375344f) && n51.f.a(java.lang.Integer.valueOf(this.f375345g), java.lang.Integer.valueOf(gl6Var.f375345g)) && n51.f.a(java.lang.Integer.valueOf(this.f375346h), java.lang.Integer.valueOf(gl6Var.f375346h)) && n51.f.a(this.f375347i, gl6Var.f375347i);
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
            r45.cu5 cu5Var = this.f375342d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.computeSize());
                this.f375342d.writeFields(fVar);
            }
            fVar.e(3, this.f375343e);
            java.lang.String str = this.f375344f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f375345g);
            fVar.e(6, this.f375346h);
            java.lang.String str2 = this.f375347i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.cu5 cu5Var2 = this.f375342d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(3, this.f375343e);
            java.lang.String str3 = this.f375344f;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int e18 = e17 + b36.f.e(5, this.f375345g) + b36.f.e(6, this.f375346h);
            java.lang.String str4 = this.f375347i;
            return str4 != null ? e18 + b36.f.j(7, str4) : e18;
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
        r45.gl6 gl6Var = (r45.gl6) objArr[1];
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
                    gl6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    gl6Var.f375342d = cu5Var3;
                }
                return 0;
            case 3:
                gl6Var.f375343e = aVar2.g(intValue);
                return 0;
            case 4:
                gl6Var.f375344f = aVar2.k(intValue);
                return 0;
            case 5:
                gl6Var.f375345g = aVar2.g(intValue);
                return 0;
            case 6:
                gl6Var.f375346h = aVar2.g(intValue);
                return 0;
            case 7:
                gl6Var.f375347i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
