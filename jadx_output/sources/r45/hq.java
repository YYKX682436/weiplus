package r45;

/* loaded from: classes2.dex */
public class hq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.h80 f376383d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gq f376384e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hq)) {
            return false;
        }
        r45.hq hqVar = (r45.hq) fVar;
        return n51.f.a(this.f376383d, hqVar.f376383d) && n51.f.a(this.f376384e, hqVar.f376384e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.h80 h80Var = this.f376383d;
            if (h80Var != null) {
                fVar.i(1, h80Var.computeSize());
                this.f376383d.writeFields(fVar);
            }
            r45.gq gqVar = this.f376384e;
            if (gqVar != null) {
                fVar.i(2, gqVar.computeSize());
                this.f376384e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.h80 h80Var2 = this.f376383d;
            int i18 = h80Var2 != null ? 0 + b36.f.i(1, h80Var2.computeSize()) : 0;
            r45.gq gqVar2 = this.f376384e;
            return gqVar2 != null ? i18 + b36.f.i(2, gqVar2.computeSize()) : i18;
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
        r45.hq hqVar = (r45.hq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.h80 h80Var3 = new r45.h80();
                if (bArr != null && bArr.length > 0) {
                    h80Var3.parseFrom(bArr);
                }
                hqVar.f376383d = h80Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.gq gqVar3 = new r45.gq();
            if (bArr2 != null && bArr2.length > 0) {
                gqVar3.parseFrom(bArr2);
            }
            hqVar.f376384e = gqVar3;
        }
        return 0;
    }
}
