package r45;

/* loaded from: classes9.dex */
public class av6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370281d;

    /* renamed from: e, reason: collision with root package name */
    public r45.e17 f370282e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zu6 f370283f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f370284g;

    /* renamed from: h, reason: collision with root package name */
    public int f370285h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370286i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f370287m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.av6)) {
            return false;
        }
        r45.av6 av6Var = (r45.av6) fVar;
        return n51.f.a(this.BaseRequest, av6Var.BaseRequest) && n51.f.a(this.f370281d, av6Var.f370281d) && n51.f.a(this.f370282e, av6Var.f370282e) && n51.f.a(this.f370283f, av6Var.f370283f) && n51.f.a(this.f370284g, av6Var.f370284g) && n51.f.a(java.lang.Integer.valueOf(this.f370285h), java.lang.Integer.valueOf(av6Var.f370285h)) && n51.f.a(this.f370286i, av6Var.f370286i) && n51.f.a(this.f370287m, av6Var.f370287m);
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
            java.lang.String str = this.f370281d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.e17 e17Var = this.f370282e;
            if (e17Var != null) {
                fVar.i(3, e17Var.computeSize());
                this.f370282e.writeFields(fVar);
            }
            r45.zu6 zu6Var = this.f370283f;
            if (zu6Var != null) {
                fVar.i(4, zu6Var.computeSize());
                this.f370283f.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f370284g;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.computeSize());
                this.f370284g.writeFields(fVar);
            }
            fVar.e(6, this.f370285h);
            java.lang.String str2 = this.f370286i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f370287m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f370281d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            r45.e17 e17Var2 = this.f370282e;
            if (e17Var2 != null) {
                i18 += b36.f.i(3, e17Var2.computeSize());
            }
            r45.zu6 zu6Var2 = this.f370283f;
            if (zu6Var2 != null) {
                i18 += b36.f.i(4, zu6Var2.computeSize());
            }
            r45.cu5 cu5Var2 = this.f370284g;
            if (cu5Var2 != null) {
                i18 += b36.f.i(5, cu5Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(6, this.f370285h);
            java.lang.String str5 = this.f370286i;
            if (str5 != null) {
                e17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f370287m;
            return str6 != null ? e17 + b36.f.j(8, str6) : e17;
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
        r45.av6 av6Var = (r45.av6) objArr[1];
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
                    av6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                av6Var.f370281d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.e17 e17Var3 = new r45.e17();
                    if (bArr2 != null && bArr2.length > 0) {
                        e17Var3.parseFrom(bArr2);
                    }
                    av6Var.f370282e = e17Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.zu6 zu6Var3 = new r45.zu6();
                    if (bArr3 != null && bArr3.length > 0) {
                        zu6Var3.parseFrom(bArr3);
                    }
                    av6Var.f370283f = zu6Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var3.b(bArr4);
                    }
                    av6Var.f370284g = cu5Var3;
                }
                return 0;
            case 6:
                av6Var.f370285h = aVar2.g(intValue);
                return 0;
            case 7:
                av6Var.f370286i = aVar2.k(intValue);
                return 0;
            case 8:
                av6Var.f370287m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
