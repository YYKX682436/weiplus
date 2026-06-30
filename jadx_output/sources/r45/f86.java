package r45;

/* loaded from: classes4.dex */
public class f86 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.l76 f374100d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374101e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f374102f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374103g;

    /* renamed from: h, reason: collision with root package name */
    public r45.o86 f374104h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f374105i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f374106m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f86)) {
            return false;
        }
        r45.f86 f86Var = (r45.f86) fVar;
        return n51.f.a(this.BaseRequest, f86Var.BaseRequest) && n51.f.a(this.f374100d, f86Var.f374100d) && n51.f.a(this.f374101e, f86Var.f374101e) && n51.f.a(this.f374102f, f86Var.f374102f) && n51.f.a(this.f374103g, f86Var.f374103g) && n51.f.a(this.f374104h, f86Var.f374104h) && n51.f.a(this.f374105i, f86Var.f374105i) && n51.f.a(this.f374106m, f86Var.f374106m);
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
            r45.l76 l76Var = this.f374100d;
            if (l76Var != null) {
                fVar.i(2, l76Var.computeSize());
                this.f374100d.writeFields(fVar);
            }
            java.lang.String str = this.f374101e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.du5 du5Var = this.f374102f;
            if (du5Var != null) {
                fVar.i(4, du5Var.computeSize());
                this.f374102f.writeFields(fVar);
            }
            java.lang.String str2 = this.f374103g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.o86 o86Var = this.f374104h;
            if (o86Var != null) {
                fVar.i(6, o86Var.computeSize());
                this.f374104h.writeFields(fVar);
            }
            java.lang.String str3 = this.f374105i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f374106m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.l76 l76Var2 = this.f374100d;
            if (l76Var2 != null) {
                i18 += b36.f.i(2, l76Var2.computeSize());
            }
            java.lang.String str5 = this.f374101e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            r45.du5 du5Var2 = this.f374102f;
            if (du5Var2 != null) {
                i18 += b36.f.i(4, du5Var2.computeSize());
            }
            java.lang.String str6 = this.f374103g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.o86 o86Var2 = this.f374104h;
            if (o86Var2 != null) {
                i18 += b36.f.i(6, o86Var2.computeSize());
            }
            java.lang.String str7 = this.f374105i;
            if (str7 != null) {
                i18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f374106m;
            return str8 != null ? i18 + b36.f.j(8, str8) : i18;
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
        r45.f86 f86Var = (r45.f86) objArr[1];
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
                    f86Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.l76 l76Var3 = new r45.l76();
                    if (bArr2 != null && bArr2.length > 0) {
                        l76Var3.parseFrom(bArr2);
                    }
                    f86Var.f374100d = l76Var3;
                }
                return 0;
            case 3:
                f86Var.f374101e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var3.b(bArr3);
                    }
                    f86Var.f374102f = du5Var3;
                }
                return 0;
            case 5:
                f86Var.f374103g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.o86 o86Var3 = new r45.o86();
                    if (bArr4 != null && bArr4.length > 0) {
                        o86Var3.parseFrom(bArr4);
                    }
                    f86Var.f374104h = o86Var3;
                }
                return 0;
            case 7:
                f86Var.f374105i = aVar2.k(intValue);
                return 0;
            case 8:
                f86Var.f374106m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
