package r45;

/* loaded from: classes9.dex */
public class hp extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.an6 f376347d;

    /* renamed from: e, reason: collision with root package name */
    public r45.k6 f376348e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376349f;

    /* renamed from: g, reason: collision with root package name */
    public int f376350g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f376351h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hp)) {
            return false;
        }
        r45.hp hpVar = (r45.hp) fVar;
        return n51.f.a(this.BaseRequest, hpVar.BaseRequest) && n51.f.a(this.f376347d, hpVar.f376347d) && n51.f.a(this.f376348e, hpVar.f376348e) && n51.f.a(this.f376349f, hpVar.f376349f) && n51.f.a(java.lang.Integer.valueOf(this.f376350g), java.lang.Integer.valueOf(hpVar.f376350g)) && n51.f.a(this.f376351h, hpVar.f376351h);
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
            r45.an6 an6Var = this.f376347d;
            if (an6Var != null) {
                fVar.i(2, an6Var.computeSize());
                this.f376347d.writeFields(fVar);
            }
            r45.k6 k6Var = this.f376348e;
            if (k6Var != null) {
                fVar.i(3, k6Var.computeSize());
                this.f376348e.writeFields(fVar);
            }
            java.lang.String str = this.f376349f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f376350g);
            java.lang.String str2 = this.f376351h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.an6 an6Var2 = this.f376347d;
            if (an6Var2 != null) {
                i18 += b36.f.i(2, an6Var2.computeSize());
            }
            r45.k6 k6Var2 = this.f376348e;
            if (k6Var2 != null) {
                i18 += b36.f.i(3, k6Var2.computeSize());
            }
            java.lang.String str3 = this.f376349f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            int e17 = i18 + b36.f.e(5, this.f376350g);
            java.lang.String str4 = this.f376351h;
            return str4 != null ? e17 + b36.f.j(6, str4) : e17;
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
        r45.hp hpVar = (r45.hp) objArr[1];
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
                    hpVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.an6 an6Var3 = new r45.an6();
                    if (bArr2 != null && bArr2.length > 0) {
                        an6Var3.parseFrom(bArr2);
                    }
                    hpVar.f376347d = an6Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.k6 k6Var3 = new r45.k6();
                    if (bArr3 != null && bArr3.length > 0) {
                        k6Var3.parseFrom(bArr3);
                    }
                    hpVar.f376348e = k6Var3;
                }
                return 0;
            case 4:
                hpVar.f376349f = aVar2.k(intValue);
                return 0;
            case 5:
                hpVar.f376350g = aVar2.g(intValue);
                return 0;
            case 6:
                hpVar.f376351h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
