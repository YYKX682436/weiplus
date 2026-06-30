package r45;

/* loaded from: classes12.dex */
public class oc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.pc f382141d;

    /* renamed from: e, reason: collision with root package name */
    public r45.mc f382142e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oc)) {
            return false;
        }
        r45.oc ocVar = (r45.oc) fVar;
        return n51.f.a(this.f382141d, ocVar.f382141d) && n51.f.a(this.f382142e, ocVar.f382142e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.pc pcVar = this.f382141d;
            if (pcVar != null) {
                fVar.i(1, pcVar.computeSize());
                this.f382141d.writeFields(fVar);
            }
            r45.mc mcVar = this.f382142e;
            if (mcVar != null) {
                fVar.i(2, mcVar.computeSize());
                this.f382142e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.pc pcVar2 = this.f382141d;
            int i18 = pcVar2 != null ? 0 + b36.f.i(1, pcVar2.computeSize()) : 0;
            r45.mc mcVar2 = this.f382142e;
            return mcVar2 != null ? i18 + b36.f.i(2, mcVar2.computeSize()) : i18;
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
        r45.oc ocVar = (r45.oc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.pc pcVar3 = new r45.pc();
                if (bArr != null && bArr.length > 0) {
                    pcVar3.parseFrom(bArr);
                }
                ocVar.f382141d = pcVar3;
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
            r45.mc mcVar3 = new r45.mc();
            if (bArr2 != null && bArr2.length > 0) {
                mcVar3.parseFrom(bArr2);
            }
            ocVar.f382142e = mcVar3;
        }
        return 0;
    }
}
