package r45;

/* loaded from: classes8.dex */
public class ty5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386860d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386861e;

    /* renamed from: f, reason: collision with root package name */
    public int f386862f;

    /* renamed from: g, reason: collision with root package name */
    public int f386863g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386864h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ty5)) {
            return false;
        }
        r45.ty5 ty5Var = (r45.ty5) fVar;
        return n51.f.a(this.BaseRequest, ty5Var.BaseRequest) && n51.f.a(this.f386860d, ty5Var.f386860d) && n51.f.a(this.f386861e, ty5Var.f386861e) && n51.f.a(java.lang.Integer.valueOf(this.f386862f), java.lang.Integer.valueOf(ty5Var.f386862f)) && n51.f.a(java.lang.Integer.valueOf(this.f386863g), java.lang.Integer.valueOf(ty5Var.f386863g)) && n51.f.a(this.f386864h, ty5Var.f386864h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f386860d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386861e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f386862f);
            fVar.e(5, this.f386863g);
            java.lang.String str3 = this.f386864h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f386860d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f386861e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f386862f) + b36.f.e(5, this.f386863g);
            java.lang.String str6 = this.f386864h;
            return str6 != null ? e17 + b36.f.j(6, str6) : e17;
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
        r45.ty5 ty5Var = (r45.ty5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    ty5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                ty5Var.f386860d = aVar2.k(intValue);
                return 0;
            case 3:
                ty5Var.f386861e = aVar2.k(intValue);
                return 0;
            case 4:
                ty5Var.f386862f = aVar2.g(intValue);
                return 0;
            case 5:
                ty5Var.f386863g = aVar2.g(intValue);
                return 0;
            case 6:
                ty5Var.f386864h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
