package r45;

/* loaded from: classes4.dex */
public class da6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372274d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f372275e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f372276f;

    /* renamed from: g, reason: collision with root package name */
    public int f372277g;

    /* renamed from: h, reason: collision with root package name */
    public int f372278h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.da6)) {
            return false;
        }
        r45.da6 da6Var = (r45.da6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372274d), java.lang.Integer.valueOf(da6Var.f372274d)) && n51.f.a(this.f372275e, da6Var.f372275e) && n51.f.a(java.lang.Integer.valueOf(this.f372276f), java.lang.Integer.valueOf(da6Var.f372276f)) && n51.f.a(java.lang.Integer.valueOf(this.f372277g), java.lang.Integer.valueOf(da6Var.f372277g)) && n51.f.a(java.lang.Integer.valueOf(this.f372278h), java.lang.Integer.valueOf(da6Var.f372278h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372275e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372274d);
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f372276f);
            fVar.e(4, this.f372277g);
            fVar.e(5, this.f372278h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f372274d) + 0 + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f372276f) + b36.f.e(4, this.f372277g) + b36.f.e(5, this.f372278h);
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
        r45.da6 da6Var = (r45.da6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            da6Var.f372274d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                da6Var.f372276f = aVar2.g(intValue);
                return 0;
            }
            if (intValue == 4) {
                da6Var.f372277g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            da6Var.f372278h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.b96 b96Var = new r45.b96();
            if (bArr2 != null && bArr2.length > 0) {
                b96Var.parseFrom(bArr2);
            }
            da6Var.f372275e.add(b96Var);
        }
        return 0;
    }
}
