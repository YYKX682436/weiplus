package p33;

/* loaded from: classes4.dex */
public class g0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public p33.s f351577d;

    /* renamed from: e, reason: collision with root package name */
    public p33.s f351578e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.g0)) {
            return false;
        }
        p33.g0 g0Var = (p33.g0) fVar;
        return n51.f.a(this.f351577d, g0Var.f351577d) && n51.f.a(this.f351578e, g0Var.f351578e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            p33.s sVar = this.f351577d;
            if (sVar != null) {
                fVar.i(1, sVar.computeSize());
                this.f351577d.writeFields(fVar);
            }
            p33.s sVar2 = this.f351578e;
            if (sVar2 != null) {
                fVar.i(2, sVar2.computeSize());
                this.f351578e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            p33.s sVar3 = this.f351577d;
            int i18 = sVar3 != null ? 0 + b36.f.i(1, sVar3.computeSize()) : 0;
            p33.s sVar4 = this.f351578e;
            return sVar4 != null ? i18 + b36.f.i(2, sVar4.computeSize()) : i18;
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
        p33.g0 g0Var = (p33.g0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                p33.s sVar5 = new p33.s();
                if (bArr != null && bArr.length > 0) {
                    sVar5.parseFrom(bArr);
                }
                g0Var.f351577d = sVar5;
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
            p33.s sVar6 = new p33.s();
            if (bArr2 != null && bArr2.length > 0) {
                sVar6.parseFrom(bArr2);
            }
            g0Var.f351578e = sVar6;
        }
        return 0;
    }
}
