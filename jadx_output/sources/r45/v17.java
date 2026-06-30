package r45;

/* loaded from: classes9.dex */
public class v17 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f387813d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387814e;

    /* renamed from: f, reason: collision with root package name */
    public int f387815f;

    /* renamed from: g, reason: collision with root package name */
    public int f387816g;

    /* renamed from: h, reason: collision with root package name */
    public int f387817h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f387818i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v17)) {
            return false;
        }
        r45.v17 v17Var = (r45.v17) fVar;
        return n51.f.a(this.f387813d, v17Var.f387813d) && n51.f.a(this.f387814e, v17Var.f387814e) && n51.f.a(java.lang.Integer.valueOf(this.f387815f), java.lang.Integer.valueOf(v17Var.f387815f)) && n51.f.a(java.lang.Integer.valueOf(this.f387816g), java.lang.Integer.valueOf(v17Var.f387816g)) && n51.f.a(java.lang.Integer.valueOf(this.f387817h), java.lang.Integer.valueOf(v17Var.f387817h)) && n51.f.a(this.f387818i, v17Var.f387818i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387818i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cu5 cu5Var = this.f387813d;
            if (cu5Var != null) {
                fVar.i(1, cu5Var.computeSize());
                this.f387813d.writeFields(fVar);
            }
            java.lang.String str = this.f387814e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f387815f);
            fVar.e(4, this.f387816g);
            fVar.e(5, this.f387817h);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.cu5 cu5Var2 = this.f387813d;
            int i18 = cu5Var2 != null ? 0 + b36.f.i(1, cu5Var2.computeSize()) : 0;
            java.lang.String str2 = this.f387814e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f387815f) + b36.f.e(4, this.f387816g) + b36.f.e(5, this.f387817h) + b36.f.g(6, 8, linkedList);
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
        r45.v17 v17Var = (r45.v17) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    v17Var.f387813d = cu5Var3;
                }
                return 0;
            case 2:
                v17Var.f387814e = aVar2.k(intValue);
                return 0;
            case 3:
                v17Var.f387815f = aVar2.g(intValue);
                return 0;
            case 4:
                v17Var.f387816g = aVar2.g(intValue);
                return 0;
            case 5:
                v17Var.f387817h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.t44 t44Var = new r45.t44();
                    if (bArr3 != null && bArr3.length > 0) {
                        t44Var.parseFrom(bArr3);
                    }
                    v17Var.f387818i.add(t44Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
