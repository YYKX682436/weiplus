package r45;

/* loaded from: classes9.dex */
public class lq3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f379720d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f379721e;

    /* renamed from: f, reason: collision with root package name */
    public r45.aw6 f379722f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lq3)) {
            return false;
        }
        r45.lq3 lq3Var = (r45.lq3) fVar;
        return n51.f.a(this.f379720d, lq3Var.f379720d) && n51.f.a(this.f379721e, lq3Var.f379721e) && n51.f.a(this.f379722f, lq3Var.f379722f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379720d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f379721e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            r45.aw6 aw6Var = this.f379722f;
            if (aw6Var != null) {
                fVar.i(5, aw6Var.computeSize());
                this.f379722f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f379721e;
            if (gVar2 != null) {
                g17 += b36.f.b(2, gVar2);
            }
            r45.aw6 aw6Var2 = this.f379722f;
            return aw6Var2 != null ? g17 + b36.f.i(5, aw6Var2.computeSize()) : g17;
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
        r45.lq3 lq3Var = (r45.lq3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.yv6 yv6Var = new r45.yv6();
                if (bArr2 != null && bArr2.length > 0) {
                    yv6Var.parseFrom(bArr2);
                }
                lq3Var.f379720d.add(yv6Var);
            }
            return 0;
        }
        if (intValue == 2) {
            lq3Var.f379721e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.aw6 aw6Var3 = new r45.aw6();
            if (bArr3 != null && bArr3.length > 0) {
                aw6Var3.parseFrom(bArr3);
            }
            lq3Var.f379722f = aw6Var3;
        }
        return 0;
    }
}
