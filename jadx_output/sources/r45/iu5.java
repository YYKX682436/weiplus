package r45;

/* loaded from: classes4.dex */
public class iu5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f377341d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f377342e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f377343f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f377344g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f377345h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f377346i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.iu5)) {
            return false;
        }
        r45.iu5 iu5Var = (r45.iu5) fVar;
        return n51.f.a(this.f377341d, iu5Var.f377341d) && n51.f.a(java.lang.Boolean.valueOf(this.f377342e), java.lang.Boolean.valueOf(iu5Var.f377342e)) && n51.f.a(java.lang.Boolean.valueOf(this.f377343f), java.lang.Boolean.valueOf(iu5Var.f377343f)) && n51.f.a(java.lang.Boolean.valueOf(this.f377344g), java.lang.Boolean.valueOf(iu5Var.f377344g)) && n51.f.a(java.lang.Boolean.valueOf(this.f377345h), java.lang.Boolean.valueOf(iu5Var.f377345h)) && n51.f.a(java.lang.Boolean.valueOf(this.f377346i), java.lang.Boolean.valueOf(iu5Var.f377346i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377341d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.a(2, this.f377342e);
            fVar.a(3, this.f377343f);
            fVar.a(4, this.f377344g);
            fVar.a(5, this.f377345h);
            fVar.a(6, this.f377346i);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList) + 0 + b36.f.a(2, this.f377342e) + b36.f.a(3, this.f377343f) + b36.f.a(4, this.f377344g) + b36.f.a(5, this.f377345h) + b36.f.a(6, this.f377346i);
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
        r45.iu5 iu5Var = (r45.iu5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nd4 nd4Var = new r45.nd4();
                    if (bArr2 != null && bArr2.length > 0) {
                        nd4Var.parseFrom(bArr2);
                    }
                    iu5Var.f377341d.add(nd4Var);
                }
                return 0;
            case 2:
                iu5Var.f377342e = aVar2.c(intValue);
                return 0;
            case 3:
                iu5Var.f377343f = aVar2.c(intValue);
                return 0;
            case 4:
                iu5Var.f377344g = aVar2.c(intValue);
                return 0;
            case 5:
                iu5Var.f377345h = aVar2.c(intValue);
                return 0;
            case 6:
                iu5Var.f377346i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
