package r45;

/* loaded from: classes2.dex */
public class uo3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f387526d;

    /* renamed from: f, reason: collision with root package name */
    public int f387528f;

    /* renamed from: g, reason: collision with root package name */
    public int f387529g;

    /* renamed from: i, reason: collision with root package name */
    public int f387531i;

    /* renamed from: n, reason: collision with root package name */
    public r45.kt3 f387533n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f387527e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f387530h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f387532m = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uo3)) {
            return false;
        }
        r45.uo3 uo3Var = (r45.uo3) fVar;
        return n51.f.a(this.BaseResponse, uo3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f387526d), java.lang.Integer.valueOf(uo3Var.f387526d)) && n51.f.a(this.f387527e, uo3Var.f387527e) && n51.f.a(java.lang.Integer.valueOf(this.f387528f), java.lang.Integer.valueOf(uo3Var.f387528f)) && n51.f.a(java.lang.Integer.valueOf(this.f387529g), java.lang.Integer.valueOf(uo3Var.f387529g)) && n51.f.a(this.f387530h, uo3Var.f387530h) && n51.f.a(java.lang.Integer.valueOf(this.f387531i), java.lang.Integer.valueOf(uo3Var.f387531i)) && n51.f.a(this.f387532m, uo3Var.f387532m) && n51.f.a(this.f387533n, uo3Var.f387533n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387532m;
        java.util.LinkedList linkedList2 = this.f387530h;
        java.util.LinkedList linkedList3 = this.f387527e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f387526d);
            fVar.g(3, 8, linkedList3);
            fVar.e(4, this.f387528f);
            fVar.e(5, this.f387529g);
            fVar.g(6, 8, linkedList2);
            fVar.e(7, this.f387531i);
            fVar.g(8, 8, linkedList);
            r45.kt3 kt3Var = this.f387533n;
            if (kt3Var != null) {
                fVar.i(9, kt3Var.computeSize());
                this.f387533n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f387526d) + b36.f.g(3, 8, linkedList3) + b36.f.e(4, this.f387528f) + b36.f.e(5, this.f387529g) + b36.f.g(6, 8, linkedList2) + b36.f.e(7, this.f387531i) + b36.f.g(8, 8, linkedList);
            r45.kt3 kt3Var2 = this.f387533n;
            return kt3Var2 != null ? i18 + b36.f.i(9, kt3Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.uo3 uo3Var = (r45.uo3) objArr[1];
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
                    uo3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                uo3Var.f387526d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ti5 ti5Var = new r45.ti5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ti5Var.parseFrom(bArr3);
                    }
                    uo3Var.f387527e.add(ti5Var);
                }
                return 0;
            case 4:
                uo3Var.f387528f = aVar2.g(intValue);
                return 0;
            case 5:
                uo3Var.f387529g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.m2 m2Var = new r45.m2();
                    if (bArr4 != null && bArr4.length > 0) {
                        m2Var.parseFrom(bArr4);
                    }
                    uo3Var.f387530h.add(m2Var);
                }
                return 0;
            case 7:
                uo3Var.f387531i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.nt3 nt3Var = new r45.nt3();
                    if (bArr5 != null && bArr5.length > 0) {
                        nt3Var.parseFrom(bArr5);
                    }
                    uo3Var.f387532m.add(nt3Var);
                }
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.kt3 kt3Var3 = new r45.kt3();
                    if (bArr6 != null && bArr6.length > 0) {
                        kt3Var3.parseFrom(bArr6);
                    }
                    uo3Var.f387533n = kt3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
