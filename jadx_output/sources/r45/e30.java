package r45;

/* loaded from: classes9.dex */
public class e30 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f372963d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372964e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f372965f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.n34 f372966g;

    /* renamed from: h, reason: collision with root package name */
    public r45.n34 f372967h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e30)) {
            return false;
        }
        r45.e30 e30Var = (r45.e30) fVar;
        return n51.f.a(this.f372963d, e30Var.f372963d) && n51.f.a(this.f372964e, e30Var.f372964e) && n51.f.a(this.f372965f, e30Var.f372965f) && n51.f.a(this.f372966g, e30Var.f372966g) && n51.f.a(this.f372967h, e30Var.f372967h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372965f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f372963d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f372964e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            r45.n34 n34Var = this.f372966g;
            if (n34Var != null) {
                fVar.i(4, n34Var.computeSize());
                this.f372966g.writeFields(fVar);
            }
            r45.n34 n34Var2 = this.f372967h;
            if (n34Var2 != null) {
                fVar.i(5, n34Var2.computeSize());
                this.f372967h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f372963d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f372964e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            r45.n34 n34Var3 = this.f372966g;
            if (n34Var3 != null) {
                g17 += b36.f.i(4, n34Var3.computeSize());
            }
            r45.n34 n34Var4 = this.f372967h;
            return n34Var4 != null ? g17 + b36.f.i(5, n34Var4.computeSize()) : g17;
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
        r45.e30 e30Var = (r45.e30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e30Var.f372963d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e30Var.f372964e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.f44 f44Var = new r45.f44();
                if (bArr2 != null && bArr2.length > 0) {
                    f44Var.parseFrom(bArr2);
                }
                e30Var.f372965f.add(f44Var);
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j19.get(i19);
                r45.n34 n34Var5 = new r45.n34();
                if (bArr3 != null && bArr3.length > 0) {
                    n34Var5.parseFrom(bArr3);
                }
                e30Var.f372966g = n34Var5;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j27.get(i27);
            r45.n34 n34Var6 = new r45.n34();
            if (bArr4 != null && bArr4.length > 0) {
                n34Var6.parseFrom(bArr4);
            }
            e30Var.f372967h = n34Var6;
        }
        return 0;
    }
}
