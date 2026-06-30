package wn1;

/* loaded from: classes9.dex */
public class c0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f447410d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f447411e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f447412f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f447413g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.c0)) {
            return false;
        }
        wn1.c0 c0Var = (wn1.c0) fVar;
        return n51.f.a(this.f447410d, c0Var.f447410d) && n51.f.a(this.f447411e, c0Var.f447411e) && n51.f.a(this.f447412f, c0Var.f447412f) && n51.f.a(this.f447413g, c0Var.f447413g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 3, this.f447410d);
            fVar.g(2, 1, this.f447411e);
            fVar.g(3, 1, this.f447412f);
            java.lang.String str = this.f447413g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 3, this.f447410d) + 0 + b36.f.g(2, 1, this.f447411e) + b36.f.g(3, 1, this.f447412f);
            java.lang.String str2 = this.f447413g;
            return str2 != null ? g17 + b36.f.j(4, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f447410d.clear();
            this.f447411e.clear();
            this.f447412f.clear();
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
        wn1.c0 c0Var = (wn1.c0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c0Var.f447410d.add(java.lang.Long.valueOf(aVar2.i(intValue)));
            return 0;
        }
        if (intValue == 2) {
            c0Var.f447411e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 3) {
            c0Var.f447412f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        c0Var.f447413g = aVar2.k(intValue);
        return 0;
    }
}
