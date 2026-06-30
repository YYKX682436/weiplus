package r45;

/* loaded from: classes2.dex */
public class ue1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.te1 f387291d;

    /* renamed from: e, reason: collision with root package name */
    public r45.me1 f387292e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f387293f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f387294g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387295h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ue1)) {
            return false;
        }
        r45.ue1 ue1Var = (r45.ue1) fVar;
        return n51.f.a(this.f387291d, ue1Var.f387291d) && n51.f.a(this.f387292e, ue1Var.f387292e) && n51.f.a(this.f387293f, ue1Var.f387293f) && n51.f.a(this.f387294g, ue1Var.f387294g) && n51.f.a(this.f387295h, ue1Var.f387295h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387293f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.te1 te1Var = this.f387291d;
            if (te1Var != null) {
                fVar.i(1, te1Var.computeSize());
                this.f387291d.writeFields(fVar);
            }
            r45.me1 me1Var = this.f387292e;
            if (me1Var != null) {
                fVar.i(2, me1Var.computeSize());
                this.f387292e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f387294g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str = this.f387295h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.te1 te1Var2 = this.f387291d;
            int i18 = te1Var2 != null ? 0 + b36.f.i(1, te1Var2.computeSize()) : 0;
            r45.me1 me1Var2 = this.f387292e;
            if (me1Var2 != null) {
                i18 += b36.f.i(2, me1Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f387294g;
            if (gVar2 != null) {
                g17 += b36.f.b(4, gVar2);
            }
            java.lang.String str2 = this.f387295h;
            return str2 != null ? g17 + b36.f.j(5, str2) : g17;
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
        r45.ue1 ue1Var = (r45.ue1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.te1 te1Var3 = new r45.te1();
                if (bArr2 != null && bArr2.length > 0) {
                    te1Var3.parseFrom(bArr2);
                }
                ue1Var.f387291d = te1Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.me1 me1Var3 = new r45.me1();
                if (bArr3 != null && bArr3.length > 0) {
                    me1Var3.parseFrom(bArr3);
                }
                ue1Var.f387292e = me1Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                ue1Var.f387294g = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            ue1Var.f387295h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.te1 te1Var4 = new r45.te1();
            if (bArr4 != null && bArr4.length > 0) {
                te1Var4.parseFrom(bArr4);
            }
            ue1Var.f387293f.add(te1Var4);
        }
        return 0;
    }
}
