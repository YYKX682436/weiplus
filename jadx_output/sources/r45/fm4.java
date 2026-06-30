package r45;

/* loaded from: classes9.dex */
public class fm4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374445d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374446e;

    /* renamed from: f, reason: collision with root package name */
    public int f374447f;

    /* renamed from: g, reason: collision with root package name */
    public int f374448g;

    /* renamed from: h, reason: collision with root package name */
    public r45.dd5 f374449h;

    /* renamed from: i, reason: collision with root package name */
    public r45.rl4 f374450i;

    /* renamed from: m, reason: collision with root package name */
    public r45.mm4 f374451m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fm4)) {
            return false;
        }
        r45.fm4 fm4Var = (r45.fm4) fVar;
        return n51.f.a(this.f374445d, fm4Var.f374445d) && n51.f.a(this.f374446e, fm4Var.f374446e) && n51.f.a(java.lang.Integer.valueOf(this.f374447f), java.lang.Integer.valueOf(fm4Var.f374447f)) && n51.f.a(java.lang.Integer.valueOf(this.f374448g), java.lang.Integer.valueOf(fm4Var.f374448g)) && n51.f.a(this.f374449h, fm4Var.f374449h) && n51.f.a(this.f374450i, fm4Var.f374450i) && n51.f.a(this.f374451m, fm4Var.f374451m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374445d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374446e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f374447f);
            fVar.e(4, this.f374448g);
            r45.dd5 dd5Var = this.f374449h;
            if (dd5Var != null) {
                fVar.i(5, dd5Var.computeSize());
                this.f374449h.writeFields(fVar);
            }
            r45.rl4 rl4Var = this.f374450i;
            if (rl4Var != null) {
                fVar.i(6, rl4Var.computeSize());
                this.f374450i.writeFields(fVar);
            }
            r45.mm4 mm4Var = this.f374451m;
            if (mm4Var != null) {
                fVar.i(7, mm4Var.computeSize());
                this.f374451m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f374445d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f374446e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int e17 = j17 + b36.f.e(3, this.f374447f) + b36.f.e(4, this.f374448g);
            r45.dd5 dd5Var2 = this.f374449h;
            if (dd5Var2 != null) {
                e17 += b36.f.i(5, dd5Var2.computeSize());
            }
            r45.rl4 rl4Var2 = this.f374450i;
            if (rl4Var2 != null) {
                e17 += b36.f.i(6, rl4Var2.computeSize());
            }
            r45.mm4 mm4Var2 = this.f374451m;
            return mm4Var2 != null ? e17 + b36.f.i(7, mm4Var2.computeSize()) : e17;
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
        r45.fm4 fm4Var = (r45.fm4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fm4Var.f374445d = aVar2.k(intValue);
                return 0;
            case 2:
                fm4Var.f374446e = aVar2.k(intValue);
                return 0;
            case 3:
                fm4Var.f374447f = aVar2.g(intValue);
                return 0;
            case 4:
                fm4Var.f374448g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.dd5 dd5Var3 = new r45.dd5();
                    if (bArr != null && bArr.length > 0) {
                        dd5Var3.parseFrom(bArr);
                    }
                    fm4Var.f374449h = dd5Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.rl4 rl4Var3 = new r45.rl4();
                    if (bArr2 != null && bArr2.length > 0) {
                        rl4Var3.parseFrom(bArr2);
                    }
                    fm4Var.f374450i = rl4Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.mm4 mm4Var3 = new r45.mm4();
                    if (bArr3 != null && bArr3.length > 0) {
                        mm4Var3.parseFrom(bArr3);
                    }
                    fm4Var.f374451m = mm4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
