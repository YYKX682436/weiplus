package r45;

/* loaded from: classes8.dex */
public class sh3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385714d;

    /* renamed from: e, reason: collision with root package name */
    public int f385715e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f385716f;

    /* renamed from: g, reason: collision with root package name */
    public r45.d64 f385717g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f385718h;

    /* renamed from: i, reason: collision with root package name */
    public int f385719i;

    /* renamed from: m, reason: collision with root package name */
    public int f385720m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f385721n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f385722o;

    /* renamed from: p, reason: collision with root package name */
    public int f385723p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sh3)) {
            return false;
        }
        r45.sh3 sh3Var = (r45.sh3) fVar;
        return n51.f.a(this.BaseRequest, sh3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f385714d), java.lang.Integer.valueOf(sh3Var.f385714d)) && n51.f.a(java.lang.Integer.valueOf(this.f385715e), java.lang.Integer.valueOf(sh3Var.f385715e)) && n51.f.a(this.f385716f, sh3Var.f385716f) && n51.f.a(this.f385717g, sh3Var.f385717g) && n51.f.a(this.f385718h, sh3Var.f385718h) && n51.f.a(java.lang.Integer.valueOf(this.f385719i), java.lang.Integer.valueOf(sh3Var.f385719i)) && n51.f.a(java.lang.Integer.valueOf(this.f385720m), java.lang.Integer.valueOf(sh3Var.f385720m)) && n51.f.a(this.f385721n, sh3Var.f385721n) && n51.f.a(java.lang.Integer.valueOf(this.f385722o), java.lang.Integer.valueOf(sh3Var.f385722o)) && n51.f.a(java.lang.Integer.valueOf(this.f385723p), java.lang.Integer.valueOf(sh3Var.f385723p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385721n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f385714d);
            fVar.e(3, this.f385715e);
            r45.cu5 cu5Var = this.f385716f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f385716f.writeFields(fVar);
            }
            r45.d64 d64Var = this.f385717g;
            if (d64Var != null) {
                fVar.i(5, d64Var.computeSize());
                this.f385717g.writeFields(fVar);
            }
            java.lang.String str = this.f385718h;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f385719i);
            fVar.e(8, this.f385720m);
            fVar.g(11, 8, linkedList);
            fVar.e(12, this.f385722o);
            fVar.e(14, this.f385723p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f385714d) + b36.f.e(3, this.f385715e);
            r45.cu5 cu5Var2 = this.f385716f;
            if (cu5Var2 != null) {
                i18 += b36.f.i(4, cu5Var2.computeSize());
            }
            r45.d64 d64Var2 = this.f385717g;
            if (d64Var2 != null) {
                i18 += b36.f.i(5, d64Var2.computeSize());
            }
            java.lang.String str2 = this.f385718h;
            if (str2 != null) {
                i18 += b36.f.j(6, str2);
            }
            return i18 + b36.f.e(7, this.f385719i) + b36.f.e(8, this.f385720m) + b36.f.g(11, 8, linkedList) + b36.f.e(12, this.f385722o) + b36.f.e(14, this.f385723p);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.sh3 sh3Var = (r45.sh3) objArr[1];
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
                    sh3Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                sh3Var.f385714d = aVar2.g(intValue);
                return 0;
            case 3:
                sh3Var.f385715e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    sh3Var.f385716f = cu5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.d64 d64Var3 = new r45.d64();
                    if (bArr4 != null && bArr4.length > 0) {
                        d64Var3.parseFrom(bArr4);
                    }
                    sh3Var.f385717g = d64Var3;
                }
                return 0;
            case 6:
                sh3Var.f385718h = aVar2.k(intValue);
                return 0;
            case 7:
                sh3Var.f385719i = aVar2.g(intValue);
                return 0;
            case 8:
                sh3Var.f385720m = aVar2.g(intValue);
                return 0;
            case 9:
            case 10:
            case 13:
            default:
                return -1;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.e85 e85Var = new r45.e85();
                    if (bArr5 != null && bArr5.length > 0) {
                        e85Var.parseFrom(bArr5);
                    }
                    sh3Var.f385721n.add(e85Var);
                }
                return 0;
            case 12:
                sh3Var.f385722o = aVar2.g(intValue);
                return 0;
            case 14:
                sh3Var.f385723p = aVar2.g(intValue);
                return 0;
        }
    }
}
