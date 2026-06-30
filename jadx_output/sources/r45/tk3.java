package r45;

/* loaded from: classes4.dex */
public class tk3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386517d;

    /* renamed from: e, reason: collision with root package name */
    public int f386518e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f386519f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386520g;

    /* renamed from: h, reason: collision with root package name */
    public int f386521h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tk3)) {
            return false;
        }
        r45.tk3 tk3Var = (r45.tk3) fVar;
        return n51.f.a(this.BaseRequest, tk3Var.BaseRequest) && n51.f.a(this.f386517d, tk3Var.f386517d) && n51.f.a(java.lang.Integer.valueOf(this.f386518e), java.lang.Integer.valueOf(tk3Var.f386518e)) && n51.f.a(this.f386519f, tk3Var.f386519f) && n51.f.a(this.f386520g, tk3Var.f386520g) && n51.f.a(java.lang.Integer.valueOf(this.f386521h), java.lang.Integer.valueOf(tk3Var.f386521h));
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
            java.lang.String str = this.f386517d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f386518e);
            fVar.g(4, 8, this.f386519f);
            java.lang.String str2 = this.f386520g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f386521h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f386517d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f386518e) + b36.f.g(4, 8, this.f386519f);
            java.lang.String str4 = this.f386520g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(6, this.f386521h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386519f.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.tk3 tk3Var = (r45.tk3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    tk3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                tk3Var.f386517d = aVar2.k(intValue);
                return 0;
            case 3:
                tk3Var.f386518e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var.b(bArr3);
                    }
                    tk3Var.f386519f.add(du5Var);
                }
                return 0;
            case 5:
                tk3Var.f386520g = aVar2.k(intValue);
                return 0;
            case 6:
                tk3Var.f386521h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
