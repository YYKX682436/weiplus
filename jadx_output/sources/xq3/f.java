package xq3;

/* loaded from: classes2.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public xq3.j f456081d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456082e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.f)) {
            return false;
        }
        xq3.f fVar2 = (xq3.f) fVar;
        return n51.f.a(this.f456081d, fVar2.f456081d) && n51.f.a(this.f456082e, fVar2.f456082e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            xq3.j jVar = this.f456081d;
            if (jVar != null) {
                fVar.i(1, jVar.computeSize());
                this.f456081d.writeFields(fVar);
            }
            java.lang.String str = this.f456082e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            xq3.j jVar2 = this.f456081d;
            int i18 = jVar2 != null ? 0 + b36.f.i(1, jVar2.computeSize()) : 0;
            java.lang.String str2 = this.f456082e;
            return str2 != null ? i18 + b36.f.j(2, str2) : i18;
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
        xq3.f fVar2 = (xq3.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            fVar2.f456082e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            xq3.j jVar3 = new xq3.j();
            if (bArr != null && bArr.length > 0) {
                jVar3.parseFrom(bArr);
            }
            fVar2.f456081d = jVar3;
        }
        return 0;
    }
}
