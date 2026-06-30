package r45;

/* loaded from: classes11.dex */
public class gl extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f375324e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f375325f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ul f375326g;

    /* renamed from: i, reason: collision with root package name */
    public int f375328i;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f375323d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f375327h = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gl)) {
            return false;
        }
        r45.gl glVar = (r45.gl) fVar;
        return n51.f.a(this.f375323d, glVar.f375323d) && n51.f.a(java.lang.Integer.valueOf(this.f375324e), java.lang.Integer.valueOf(glVar.f375324e)) && n51.f.a(this.f375325f, glVar.f375325f) && n51.f.a(this.f375326g, glVar.f375326g) && n51.f.a(this.f375327h, glVar.f375327h) && n51.f.a(java.lang.Integer.valueOf(this.f375328i), java.lang.Integer.valueOf(glVar.f375328i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375327h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f375323d);
            fVar.e(3, this.f375324e);
            java.lang.String str = this.f375325f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.ul ulVar = this.f375326g;
            if (ulVar != null) {
                fVar.i(5, ulVar.computeSize());
                this.f375326g.writeFields(fVar);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f375328i);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f375323d) + 0 + b36.f.e(3, this.f375324e);
            java.lang.String str2 = this.f375325f;
            if (str2 != null) {
                g17 += b36.f.j(4, str2);
            }
            r45.ul ulVar2 = this.f375326g;
            if (ulVar2 != null) {
                g17 += b36.f.i(5, ulVar2.computeSize());
            }
            return g17 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f375328i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f375323d.clear();
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
        r45.gl glVar = (r45.gl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.s5 s5Var = new r45.s5();
                if (bArr2 != null && bArr2.length > 0) {
                    s5Var.parseFrom(bArr2);
                }
                glVar.f375323d.add(s5Var);
            }
            return 0;
        }
        if (intValue == 3) {
            glVar.f375324e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            glVar.f375325f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.ul ulVar3 = new r45.ul();
                if (bArr3 != null && bArr3.length > 0) {
                    ulVar3.parseFrom(bArr3);
                }
                glVar.f375326g = ulVar3;
            }
            return 0;
        }
        if (intValue != 6) {
            if (intValue != 7) {
                return -1;
            }
            glVar.f375328i = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.s5 s5Var2 = new r45.s5();
            if (bArr4 != null && bArr4.length > 0) {
                s5Var2.parseFrom(bArr4);
            }
            glVar.f375327h.add(s5Var2);
        }
        return 0;
    }
}
