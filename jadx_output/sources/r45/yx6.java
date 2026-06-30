package r45;

/* loaded from: classes8.dex */
public class yx6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391481d;

    /* renamed from: e, reason: collision with root package name */
    public int f391482e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f391483f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public long f391484g;

    /* renamed from: h, reason: collision with root package name */
    public r45.mx6 f391485h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yx6)) {
            return false;
        }
        r45.yx6 yx6Var = (r45.yx6) fVar;
        return n51.f.a(this.f391481d, yx6Var.f391481d) && n51.f.a(java.lang.Integer.valueOf(this.f391482e), java.lang.Integer.valueOf(yx6Var.f391482e)) && n51.f.a(this.f391483f, yx6Var.f391483f) && n51.f.a(java.lang.Long.valueOf(this.f391484g), java.lang.Long.valueOf(yx6Var.f391484g)) && n51.f.a(this.f391485h, yx6Var.f391485h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391483f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391481d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f391482e);
            fVar.g(3, 8, linkedList);
            fVar.h(4, this.f391484g);
            r45.mx6 mx6Var = this.f391485h;
            if (mx6Var != null) {
                fVar.i(5, mx6Var.computeSize());
                this.f391485h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f391481d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f391482e) + b36.f.g(3, 8, linkedList) + b36.f.h(4, this.f391484g);
            r45.mx6 mx6Var2 = this.f391485h;
            return mx6Var2 != null ? j17 + b36.f.i(5, mx6Var2.computeSize()) : j17;
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
        r45.yx6 yx6Var = (r45.yx6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            yx6Var.f391481d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            yx6Var.f391482e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.mx6 mx6Var3 = new r45.mx6();
                if (bArr2 != null && bArr2.length > 0) {
                    mx6Var3.parseFrom(bArr2);
                }
                yx6Var.f391483f.add(mx6Var3);
            }
            return 0;
        }
        if (intValue == 4) {
            yx6Var.f391484g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.mx6 mx6Var4 = new r45.mx6();
            if (bArr3 != null && bArr3.length > 0) {
                mx6Var4.parseFrom(bArr3);
            }
            yx6Var.f391485h = mx6Var4;
        }
        return 0;
    }
}
