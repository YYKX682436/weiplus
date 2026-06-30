package r45;

/* loaded from: classes4.dex */
public class im extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f377142d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f377143e = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.im)) {
            return false;
        }
        r45.im imVar = (r45.im) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f377142d), java.lang.Boolean.valueOf(imVar.f377142d)) && n51.f.a(this.f377143e, imVar.f377143e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f377142d);
            fVar.g(2, 2, this.f377143e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f377142d) + 0 + b36.f.g(2, 2, this.f377143e);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377143e.clear();
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
        r45.im imVar = (r45.im) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            imVar.f377142d = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        imVar.f377143e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
        return 0;
    }
}
