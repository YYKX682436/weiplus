package r45;

/* loaded from: classes2.dex */
public class dr4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f372700d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f372701e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f372702f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372703g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dr4)) {
            return false;
        }
        r45.dr4 dr4Var = (r45.dr4) fVar;
        return n51.f.a(this.f372700d, dr4Var.f372700d) && n51.f.a(this.f372701e, dr4Var.f372701e) && n51.f.a(java.lang.Integer.valueOf(this.f372702f), java.lang.Integer.valueOf(dr4Var.f372702f)) && n51.f.a(this.f372703g, dr4Var.f372703g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372701e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f372700d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.computeSize());
                this.f372700d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f372702f);
            java.lang.String str = this.f372703g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var2 = this.f372700d;
            int i18 = (rl6Var2 != null ? 0 + b36.f.i(1, rl6Var2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f372702f);
            java.lang.String str2 = this.f372703g;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.dr4 dr4Var = (r45.dr4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.rl6 rl6Var3 = new r45.rl6();
                if (bArr2 != null && bArr2.length > 0) {
                    rl6Var3.parseFrom(bArr2);
                }
                dr4Var.f372700d = rl6Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                dr4Var.f372702f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            dr4Var.f372703g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.gt5 gt5Var = new r45.gt5();
            if (bArr3 != null && bArr3.length > 0) {
                gt5Var.parseFrom(bArr3);
            }
            dr4Var.f372701e.add(gt5Var);
        }
        return 0;
    }
}
