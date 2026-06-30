package r45;

/* loaded from: classes4.dex */
public class f7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374070d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gq f374071e;

    /* renamed from: f, reason: collision with root package name */
    public r45.gq f374072f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f7)) {
            return false;
        }
        r45.f7 f7Var = (r45.f7) fVar;
        return n51.f.a(this.f374070d, f7Var.f374070d) && n51.f.a(this.f374071e, f7Var.f374071e) && n51.f.a(this.f374072f, f7Var.f374072f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374070d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.gq gqVar = this.f374071e;
            if (gqVar != null) {
                fVar.i(2, gqVar.computeSize());
                this.f374071e.writeFields(fVar);
            }
            r45.gq gqVar2 = this.f374072f;
            if (gqVar2 != null) {
                fVar.i(3, gqVar2.computeSize());
                this.f374072f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f374070d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.gq gqVar3 = this.f374071e;
            if (gqVar3 != null) {
                j17 += b36.f.i(2, gqVar3.computeSize());
            }
            r45.gq gqVar4 = this.f374072f;
            return gqVar4 != null ? j17 + b36.f.i(3, gqVar4.computeSize()) : j17;
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
        r45.f7 f7Var = (r45.f7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f7Var.f374070d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.gq gqVar5 = new r45.gq();
                if (bArr != null && bArr.length > 0) {
                    gqVar5.parseFrom(bArr);
                }
                f7Var.f374071e = gqVar5;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.gq gqVar6 = new r45.gq();
            if (bArr2 != null && bArr2.length > 0) {
                gqVar6.parseFrom(bArr2);
            }
            f7Var.f374072f = gqVar6;
        }
        return 0;
    }
}
