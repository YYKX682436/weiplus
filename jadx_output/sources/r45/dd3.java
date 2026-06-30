package r45;

/* loaded from: classes9.dex */
public class dd3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372318d;

    /* renamed from: e, reason: collision with root package name */
    public int f372319e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vy f372320f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372321g;

    /* renamed from: h, reason: collision with root package name */
    public int f372322h;

    /* renamed from: m, reason: collision with root package name */
    public int f372324m;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f372323i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f372325n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dd3)) {
            return false;
        }
        r45.dd3 dd3Var = (r45.dd3) fVar;
        return n51.f.a(this.BaseResponse, dd3Var.BaseResponse) && n51.f.a(this.f372318d, dd3Var.f372318d) && n51.f.a(java.lang.Integer.valueOf(this.f372319e), java.lang.Integer.valueOf(dd3Var.f372319e)) && n51.f.a(this.f372320f, dd3Var.f372320f) && n51.f.a(this.f372321g, dd3Var.f372321g) && n51.f.a(java.lang.Integer.valueOf(this.f372322h), java.lang.Integer.valueOf(dd3Var.f372322h)) && n51.f.a(this.f372323i, dd3Var.f372323i) && n51.f.a(java.lang.Integer.valueOf(this.f372324m), java.lang.Integer.valueOf(dd3Var.f372324m)) && n51.f.a(this.f372325n, dd3Var.f372325n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372325n;
        java.util.LinkedList linkedList2 = this.f372323i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f372318d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f372319e);
            r45.vy vyVar = this.f372320f;
            if (vyVar != null) {
                fVar.i(4, vyVar.computeSize());
                this.f372320f.writeFields(fVar);
            }
            java.lang.String str2 = this.f372321g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f372322h);
            fVar.g(7, 8, linkedList2);
            fVar.e(8, this.f372324m);
            fVar.g(9, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f372318d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f372319e);
            r45.vy vyVar2 = this.f372320f;
            if (vyVar2 != null) {
                e17 += b36.f.i(4, vyVar2.computeSize());
            }
            java.lang.String str4 = this.f372321g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(6, this.f372322h) + b36.f.g(7, 8, linkedList2) + b36.f.e(8, this.f372324m) + b36.f.g(9, 8, linkedList);
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
        r45.dd3 dd3Var = (r45.dd3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    dd3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                dd3Var.f372318d = aVar2.k(intValue);
                return 0;
            case 3:
                dd3Var.f372319e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.vy vyVar3 = new r45.vy();
                    if (bArr3 != null && bArr3.length > 0) {
                        vyVar3.parseFrom(bArr3);
                    }
                    dd3Var.f372320f = vyVar3;
                }
                return 0;
            case 5:
                dd3Var.f372321g = aVar2.k(intValue);
                return 0;
            case 6:
                dd3Var.f372322h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var.b(bArr4);
                    }
                    dd3Var.f372323i.add(du5Var);
                }
                return 0;
            case 8:
                dd3Var.f372324m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var2.b(bArr5);
                    }
                    dd3Var.f372325n.add(du5Var2);
                }
                return 0;
            default:
                return -1;
        }
    }
}
