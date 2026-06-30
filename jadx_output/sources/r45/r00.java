package r45;

/* loaded from: classes4.dex */
public class r00 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384394d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384395e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384396f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f384397g;

    /* renamed from: h, reason: collision with root package name */
    public r45.o00 f384398h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.r00)) {
            return false;
        }
        r45.r00 r00Var = (r45.r00) fVar;
        return n51.f.a(this.BaseResponse, r00Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f384394d), java.lang.Integer.valueOf(r00Var.f384394d)) && n51.f.a(this.f384395e, r00Var.f384395e) && n51.f.a(this.f384396f, r00Var.f384396f) && n51.f.a(this.f384397g, r00Var.f384397g) && n51.f.a(this.f384398h, r00Var.f384398h);
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
            fVar.e(2, this.f384394d);
            com.tencent.mm.protobuf.g gVar = this.f384395e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f384396f;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            java.lang.String str = this.f384397g;
            if (str != null) {
                fVar.j(5, str);
            }
            r45.o00 o00Var = this.f384398h;
            if (o00Var != null) {
                fVar.i(6, o00Var.computeSize());
                this.f384398h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f384394d);
            com.tencent.mm.protobuf.g gVar3 = this.f384395e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f384396f;
            if (gVar4 != null) {
                i18 += b36.f.b(4, gVar4);
            }
            java.lang.String str2 = this.f384397g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            r45.o00 o00Var2 = this.f384398h;
            return o00Var2 != null ? i18 + b36.f.i(6, o00Var2.computeSize()) : i18;
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
        r45.r00 r00Var = (r45.r00) objArr[1];
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
                    r00Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                r00Var.f384394d = aVar2.g(intValue);
                return 0;
            case 3:
                r00Var.f384395e = aVar2.d(intValue);
                return 0;
            case 4:
                r00Var.f384396f = aVar2.d(intValue);
                return 0;
            case 5:
                r00Var.f384397g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.o00 o00Var3 = new r45.o00();
                    if (bArr2 != null && bArr2.length > 0) {
                        o00Var3.parseFrom(bArr2);
                    }
                    r00Var.f384398h = o00Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
