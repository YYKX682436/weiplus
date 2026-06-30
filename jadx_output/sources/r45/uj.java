package r45;

/* loaded from: classes4.dex */
public class uj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.xj f387407d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387408e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387409f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uj)) {
            return false;
        }
        r45.uj ujVar = (r45.uj) fVar;
        return n51.f.a(this.f387407d, ujVar.f387407d) && n51.f.a(this.f387408e, ujVar.f387408e) && n51.f.a(this.f387409f, ujVar.f387409f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.xj xjVar = this.f387407d;
            if (xjVar != null) {
                fVar.i(1, xjVar.computeSize());
                this.f387407d.writeFields(fVar);
            }
            java.lang.String str = this.f387408e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387409f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.xj xjVar2 = this.f387407d;
            int i18 = xjVar2 != null ? 0 + b36.f.i(1, xjVar2.computeSize()) : 0;
            java.lang.String str3 = this.f387408e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f387409f;
            return str4 != null ? i18 + b36.f.j(3, str4) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.uj ujVar = (r45.uj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                ujVar.f387408e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            ujVar.f387409f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.xj xjVar3 = new r45.xj();
            if (bArr != null && bArr.length > 0) {
                xjVar3.parseFrom(bArr);
            }
            ujVar.f387407d = xjVar3;
        }
        return 0;
    }
}
