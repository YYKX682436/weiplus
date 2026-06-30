package r45;

/* loaded from: classes8.dex */
public class ot extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f382502d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.zz6 f382503e;

    /* renamed from: f, reason: collision with root package name */
    public int f382504f;

    /* renamed from: g, reason: collision with root package name */
    public int f382505g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f382506h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ot)) {
            return false;
        }
        r45.ot otVar = (r45.ot) fVar;
        return n51.f.a(this.f382502d, otVar.f382502d) && n51.f.a(this.f382503e, otVar.f382503e) && n51.f.a(java.lang.Integer.valueOf(this.f382504f), java.lang.Integer.valueOf(otVar.f382504f)) && n51.f.a(java.lang.Integer.valueOf(this.f382505g), java.lang.Integer.valueOf(otVar.f382505g)) && n51.f.a(this.f382506h, otVar.f382506h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f382502d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            r45.zz6 zz6Var = this.f382503e;
            if (zz6Var != null) {
                fVar.i(2, zz6Var.computeSize());
                this.f382503e.writeFields(fVar);
            }
            fVar.e(3, this.f382504f);
            fVar.e(4, this.f382505g);
            java.lang.String str = this.f382506h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            r45.zz6 zz6Var2 = this.f382503e;
            if (zz6Var2 != null) {
                g17 += b36.f.i(2, zz6Var2.computeSize());
            }
            int e17 = g17 + b36.f.e(3, this.f382504f) + b36.f.e(4, this.f382505g);
            java.lang.String str2 = this.f382506h;
            return str2 != null ? e17 + b36.f.j(5, str2) : e17;
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
        r45.ot otVar = (r45.ot) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.is isVar = new r45.is();
                if (bArr2 != null && bArr2.length > 0) {
                    isVar.parseFrom(bArr2);
                }
                otVar.f382502d.add(isVar);
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                otVar.f382504f = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                otVar.f382505g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            otVar.f382506h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.zz6 zz6Var3 = new r45.zz6();
            if (bArr3 != null && bArr3.length > 0) {
                zz6Var3.parseFrom(bArr3);
            }
            otVar.f382503e = zz6Var3;
        }
        return 0;
    }
}
