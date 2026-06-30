package t45;

/* loaded from: classes10.dex */
public class b1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f415527d;

    /* renamed from: e, reason: collision with root package name */
    public t45.l0 f415528e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f415529f;

    /* renamed from: g, reason: collision with root package name */
    public int f415530g;

    /* renamed from: h, reason: collision with root package name */
    public int f415531h;

    /* renamed from: i, reason: collision with root package name */
    public int f415532i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f415533m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.b1)) {
            return false;
        }
        t45.b1 b1Var = (t45.b1) fVar;
        return n51.f.a(this.BaseRequest, b1Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f415527d), java.lang.Integer.valueOf(b1Var.f415527d)) && n51.f.a(this.f415528e, b1Var.f415528e) && n51.f.a(this.f415529f, b1Var.f415529f) && n51.f.a(java.lang.Integer.valueOf(this.f415530g), java.lang.Integer.valueOf(b1Var.f415530g)) && n51.f.a(java.lang.Integer.valueOf(this.f415531h), java.lang.Integer.valueOf(b1Var.f415531h)) && n51.f.a(java.lang.Integer.valueOf(this.f415532i), java.lang.Integer.valueOf(b1Var.f415532i)) && n51.f.a(this.f415533m, b1Var.f415533m);
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
            fVar.e(2, this.f415527d);
            t45.l0 l0Var = this.f415528e;
            if (l0Var != null) {
                fVar.i(3, l0Var.computeSize());
                this.f415528e.writeFields(fVar);
            }
            java.lang.String str = this.f415529f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f415530g);
            fVar.e(6, this.f415531h);
            fVar.e(7, this.f415532i);
            java.lang.String str2 = this.f415533m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f415527d);
            t45.l0 l0Var2 = this.f415528e;
            if (l0Var2 != null) {
                i18 += b36.f.i(3, l0Var2.computeSize());
            }
            java.lang.String str3 = this.f415529f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f415530g) + b36.f.e(6, this.f415531h) + b36.f.e(7, this.f415532i);
            java.lang.String str4 = this.f415533m;
            return str4 != null ? e17 + b36.f.j(8, str4) : e17;
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
        t45.b1 b1Var = (t45.b1) objArr[1];
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
                    b1Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                b1Var.f415527d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    t45.l0 l0Var3 = new t45.l0();
                    if (bArr2 != null && bArr2.length > 0) {
                        l0Var3.parseFrom(bArr2);
                    }
                    b1Var.f415528e = l0Var3;
                }
                return 0;
            case 4:
                b1Var.f415529f = aVar2.k(intValue);
                return 0;
            case 5:
                b1Var.f415530g = aVar2.g(intValue);
                return 0;
            case 6:
                b1Var.f415531h = aVar2.g(intValue);
                return 0;
            case 7:
                b1Var.f415532i = aVar2.g(intValue);
                return 0;
            case 8:
                b1Var.f415533m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
