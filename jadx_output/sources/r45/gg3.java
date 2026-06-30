package r45;

/* loaded from: classes8.dex */
public class gg3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f375214d;

    /* renamed from: e, reason: collision with root package name */
    public long f375215e;

    /* renamed from: f, reason: collision with root package name */
    public r45.j4 f375216f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375217g;

    /* renamed from: h, reason: collision with root package name */
    public int f375218h;

    /* renamed from: i, reason: collision with root package name */
    public r45.tp f375219i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f375220m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gg3)) {
            return false;
        }
        r45.gg3 gg3Var = (r45.gg3) fVar;
        return n51.f.a(this.BaseResponse, gg3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f375214d), java.lang.Integer.valueOf(gg3Var.f375214d)) && n51.f.a(java.lang.Long.valueOf(this.f375215e), java.lang.Long.valueOf(gg3Var.f375215e)) && n51.f.a(this.f375216f, gg3Var.f375216f) && n51.f.a(this.f375217g, gg3Var.f375217g) && n51.f.a(java.lang.Integer.valueOf(this.f375218h), java.lang.Integer.valueOf(gg3Var.f375218h)) && n51.f.a(this.f375219i, gg3Var.f375219i) && n51.f.a(this.f375220m, gg3Var.f375220m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375220m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f375214d);
            fVar.h(3, this.f375215e);
            r45.j4 j4Var = this.f375216f;
            if (j4Var != null) {
                fVar.i(4, j4Var.computeSize());
                this.f375216f.writeFields(fVar);
            }
            java.lang.String str = this.f375217g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f375218h);
            r45.tp tpVar = this.f375219i;
            if (tpVar != null) {
                fVar.i(7, tpVar.computeSize());
                this.f375219i.writeFields(fVar);
            }
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f375214d) + b36.f.h(3, this.f375215e);
            r45.j4 j4Var2 = this.f375216f;
            if (j4Var2 != null) {
                i18 += b36.f.i(4, j4Var2.computeSize());
            }
            java.lang.String str2 = this.f375217g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            int e17 = i18 + b36.f.e(6, this.f375218h);
            r45.tp tpVar2 = this.f375219i;
            if (tpVar2 != null) {
                e17 += b36.f.i(7, tpVar2.computeSize());
            }
            return e17 + b36.f.g(8, 8, linkedList);
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
        r45.gg3 gg3Var = (r45.gg3) objArr[1];
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
                    gg3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                gg3Var.f375214d = aVar2.g(intValue);
                return 0;
            case 3:
                gg3Var.f375215e = aVar2.i(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.j4 j4Var3 = new r45.j4();
                    if (bArr3 != null && bArr3.length > 0) {
                        j4Var3.parseFrom(bArr3);
                    }
                    gg3Var.f375216f = j4Var3;
                }
                return 0;
            case 5:
                gg3Var.f375217g = aVar2.k(intValue);
                return 0;
            case 6:
                gg3Var.f375218h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.tp tpVar3 = new r45.tp();
                    if (bArr4 != null && bArr4.length > 0) {
                        tpVar3.parseFrom(bArr4);
                    }
                    gg3Var.f375219i = tpVar3;
                }
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.j4 j4Var4 = new r45.j4();
                    if (bArr5 != null && bArr5.length > 0) {
                        j4Var4.parseFrom(bArr5);
                    }
                    gg3Var.f375220m.add(j4Var4);
                }
                return 0;
            default:
                return -1;
        }
    }
}
