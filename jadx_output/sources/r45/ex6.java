package r45;

/* loaded from: classes8.dex */
public class ex6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373790d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373791e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f373792f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.c1 f373793g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ex6)) {
            return false;
        }
        r45.ex6 ex6Var = (r45.ex6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373790d), java.lang.Integer.valueOf(ex6Var.f373790d)) && n51.f.a(this.f373791e, ex6Var.f373791e) && n51.f.a(this.f373792f, ex6Var.f373792f) && n51.f.a(this.f373793g, ex6Var.f373793g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373790d);
            java.lang.String str = this.f373791e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f373792f);
            r45.c1 c1Var = this.f373793g;
            if (c1Var != null) {
                fVar.i(4, c1Var.computeSize());
                this.f373793g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373790d) + 0;
            java.lang.String str2 = this.f373791e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int g17 = e17 + b36.f.g(3, 8, this.f373792f);
            r45.c1 c1Var2 = this.f373793g;
            return c1Var2 != null ? g17 + b36.f.i(4, c1Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f373792f.clear();
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
        r45.ex6 ex6Var = (r45.ex6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ex6Var.f373790d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ex6Var.f373791e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.b1 b1Var = new r45.b1();
                if (bArr2 != null && bArr2.length > 0) {
                    b1Var.parseFrom(bArr2);
                }
                ex6Var.f373792f.add(b1Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.c1 c1Var3 = new r45.c1();
            if (bArr3 != null && bArr3.length > 0) {
                c1Var3.parseFrom(bArr3);
            }
            ex6Var.f373793g = c1Var3;
        }
        return 0;
    }
}
