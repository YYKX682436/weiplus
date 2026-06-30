package r45;

/* loaded from: classes9.dex */
public class il extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f377121d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377122e;

    /* renamed from: h, reason: collision with root package name */
    public r45.l54 f377125h;

    /* renamed from: m, reason: collision with root package name */
    public r45.w1 f377127m;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f377123f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f377124g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f377126i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.il)) {
            return false;
        }
        r45.il ilVar = (r45.il) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f377121d), java.lang.Integer.valueOf(ilVar.f377121d)) && n51.f.a(this.f377122e, ilVar.f377122e) && n51.f.a(this.f377123f, ilVar.f377123f) && n51.f.a(this.f377124g, ilVar.f377124g) && n51.f.a(this.f377125h, ilVar.f377125h) && n51.f.a(this.f377126i, ilVar.f377126i) && n51.f.a(this.f377127m, ilVar.f377127m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377123f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f377121d);
            java.lang.String str = this.f377122e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            fVar.g(4, 8, this.f377124g);
            r45.l54 l54Var = this.f377125h;
            if (l54Var != null) {
                fVar.i(5, l54Var.computeSize());
                this.f377125h.writeFields(fVar);
            }
            fVar.g(6, 8, this.f377126i);
            r45.w1 w1Var = this.f377127m;
            if (w1Var != null) {
                fVar.i(7, w1Var.computeSize());
                this.f377127m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f377121d) + 0;
            java.lang.String str2 = this.f377122e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList) + b36.f.g(4, 8, this.f377124g);
            r45.l54 l54Var2 = this.f377125h;
            if (l54Var2 != null) {
                g17 += b36.f.i(5, l54Var2.computeSize());
            }
            int g18 = g17 + b36.f.g(6, 8, this.f377126i);
            r45.w1 w1Var2 = this.f377127m;
            return w1Var2 != null ? g18 + b36.f.i(7, w1Var2.computeSize()) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f377124g.clear();
            this.f377126i.clear();
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
        r45.il ilVar = (r45.il) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ilVar.f377121d = aVar2.g(intValue);
                return 0;
            case 2:
                ilVar.f377122e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ur5 ur5Var = new r45.ur5();
                    if (bArr2 != null && bArr2.length > 0) {
                        ur5Var.parseFrom(bArr2);
                    }
                    ilVar.f377123f.add(ur5Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.ur5 ur5Var2 = new r45.ur5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ur5Var2.parseFrom(bArr3);
                    }
                    ilVar.f377124g.add(ur5Var2);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.l54 l54Var3 = new r45.l54();
                    if (bArr4 != null && bArr4.length > 0) {
                        l54Var3.parseFrom(bArr4);
                    }
                    ilVar.f377125h = l54Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.uj6 uj6Var = new r45.uj6();
                    if (bArr5 != null && bArr5.length > 0) {
                        uj6Var.parseFrom(bArr5);
                    }
                    ilVar.f377126i.add(uj6Var);
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.w1 w1Var3 = new r45.w1();
                    if (bArr6 != null && bArr6.length > 0) {
                        w1Var3.parseFrom(bArr6);
                    }
                    ilVar.f377127m = w1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
