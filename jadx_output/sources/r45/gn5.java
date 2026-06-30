package r45;

/* loaded from: classes9.dex */
public class gn5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375382d;

    /* renamed from: e, reason: collision with root package name */
    public int f375383e;

    /* renamed from: f, reason: collision with root package name */
    public r45.mw6 f375384f;

    /* renamed from: g, reason: collision with root package name */
    public int f375385g;

    /* renamed from: h, reason: collision with root package name */
    public r45.io6 f375386h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gn5)) {
            return false;
        }
        r45.gn5 gn5Var = (r45.gn5) fVar;
        return n51.f.a(this.BaseRequest, gn5Var.BaseRequest) && n51.f.a(this.f375382d, gn5Var.f375382d) && n51.f.a(java.lang.Integer.valueOf(this.f375383e), java.lang.Integer.valueOf(gn5Var.f375383e)) && n51.f.a(this.f375384f, gn5Var.f375384f) && n51.f.a(java.lang.Integer.valueOf(this.f375385g), java.lang.Integer.valueOf(gn5Var.f375385g)) && n51.f.a(this.f375386h, gn5Var.f375386h);
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
            java.lang.String str = this.f375382d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f375383e);
            r45.mw6 mw6Var = this.f375384f;
            if (mw6Var != null) {
                fVar.i(4, mw6Var.computeSize());
                this.f375384f.writeFields(fVar);
            }
            fVar.e(5, this.f375385g);
            r45.io6 io6Var = this.f375386h;
            if (io6Var != null) {
                fVar.i(6, io6Var.computeSize());
                this.f375386h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str2 = this.f375382d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f375383e);
            r45.mw6 mw6Var2 = this.f375384f;
            if (mw6Var2 != null) {
                e17 += b36.f.i(4, mw6Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(5, this.f375385g);
            r45.io6 io6Var2 = this.f375386h;
            return io6Var2 != null ? e18 + b36.f.i(6, io6Var2.computeSize()) : e18;
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
        r45.gn5 gn5Var = (r45.gn5) objArr[1];
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
                    gn5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                gn5Var.f375382d = aVar2.k(intValue);
                return 0;
            case 3:
                gn5Var.f375383e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.mw6 mw6Var3 = new r45.mw6();
                    if (bArr2 != null && bArr2.length > 0) {
                        mw6Var3.parseFrom(bArr2);
                    }
                    gn5Var.f375384f = mw6Var3;
                }
                return 0;
            case 5:
                gn5Var.f375385g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.io6 io6Var3 = new r45.io6();
                    if (bArr3 != null && bArr3.length > 0) {
                        io6Var3.parseFrom(bArr3);
                    }
                    gn5Var.f375386h = io6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
