package r45;

/* loaded from: classes9.dex */
public class yd6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f390994d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f390995e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f390996f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390997g;

    /* renamed from: h, reason: collision with root package name */
    public int f390998h;

    /* renamed from: m, reason: collision with root package name */
    public r45.xd6 f391000m;

    /* renamed from: n, reason: collision with root package name */
    public int f391001n;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f390999i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f391002o = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yd6)) {
            return false;
        }
        r45.yd6 yd6Var = (r45.yd6) fVar;
        return n51.f.a(this.BaseRequest, yd6Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f390994d), java.lang.Integer.valueOf(yd6Var.f390994d)) && n51.f.a(this.f390995e, yd6Var.f390995e) && n51.f.a(this.f390996f, yd6Var.f390996f) && n51.f.a(this.f390997g, yd6Var.f390997g) && n51.f.a(java.lang.Integer.valueOf(this.f390998h), java.lang.Integer.valueOf(yd6Var.f390998h)) && n51.f.a(this.f390999i, yd6Var.f390999i) && n51.f.a(this.f391000m, yd6Var.f391000m) && n51.f.a(java.lang.Integer.valueOf(this.f391001n), java.lang.Integer.valueOf(yd6Var.f391001n)) && n51.f.a(this.f391002o, yd6Var.f391002o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391002o;
        java.util.LinkedList linkedList2 = this.f390999i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f390994d);
            java.lang.String str = this.f390995e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f390996f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f390997g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f390998h);
            fVar.g(7, 8, linkedList2);
            r45.xd6 xd6Var = this.f391000m;
            if (xd6Var != null) {
                fVar.i(8, xd6Var.computeSize());
                this.f391000m.writeFields(fVar);
            }
            fVar.e(9, this.f391001n);
            fVar.g(10, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f390994d);
            java.lang.String str4 = this.f390995e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f390996f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f390997g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            int e17 = i18 + b36.f.e(6, this.f390998h) + b36.f.g(7, 8, linkedList2);
            r45.xd6 xd6Var2 = this.f391000m;
            if (xd6Var2 != null) {
                e17 += b36.f.i(8, xd6Var2.computeSize());
            }
            return e17 + b36.f.e(9, this.f391001n) + b36.f.g(10, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
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
        r45.yd6 yd6Var = (r45.yd6) objArr[1];
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
                    yd6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                yd6Var.f390994d = aVar2.g(intValue);
                return 0;
            case 3:
                yd6Var.f390995e = aVar2.k(intValue);
                return 0;
            case 4:
                yd6Var.f390996f = aVar2.k(intValue);
                return 0;
            case 5:
                yd6Var.f390997g = aVar2.k(intValue);
                return 0;
            case 6:
                yd6Var.f390998h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ae6 ae6Var = new r45.ae6();
                    if (bArr3 != null && bArr3.length > 0) {
                        ae6Var.parseFrom(bArr3);
                    }
                    yd6Var.f390999i.add(ae6Var);
                }
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.xd6 xd6Var3 = new r45.xd6();
                    if (bArr4 != null && bArr4.length > 0) {
                        xd6Var3.parseFrom(bArr4);
                    }
                    yd6Var.f391000m = xd6Var3;
                }
                return 0;
            case 9:
                yd6Var.f391001n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.xd6 xd6Var4 = new r45.xd6();
                    if (bArr5 != null && bArr5.length > 0) {
                        xd6Var4.parseFrom(bArr5);
                    }
                    yd6Var.f391002o.add(xd6Var4);
                }
                return 0;
            default:
                return -1;
        }
    }
}
