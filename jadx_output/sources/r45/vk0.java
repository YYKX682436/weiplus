package r45;

/* loaded from: classes8.dex */
public class vk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388312d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f388313e;

    /* renamed from: f, reason: collision with root package name */
    public r45.l05 f388314f;

    /* renamed from: g, reason: collision with root package name */
    public int f388315g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vk0)) {
            return false;
        }
        r45.vk0 vk0Var = (r45.vk0) fVar;
        return n51.f.a(this.f388312d, vk0Var.f388312d) && n51.f.a(this.f388313e, vk0Var.f388313e) && n51.f.a(this.f388314f, vk0Var.f388314f) && n51.f.a(java.lang.Integer.valueOf(this.f388315g), java.lang.Integer.valueOf(vk0Var.f388315g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f388312d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f388313e;
            if (gVar2 != null) {
                fVar.b(2, gVar2);
            }
            r45.l05 l05Var = this.f388314f;
            if (l05Var != null) {
                fVar.i(3, l05Var.computeSize());
                this.f388314f.writeFields(fVar);
            }
            fVar.e(4, this.f388315g);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f388312d;
            int b17 = gVar3 != null ? 0 + b36.f.b(1, gVar3) : 0;
            com.tencent.mm.protobuf.g gVar4 = this.f388313e;
            if (gVar4 != null) {
                b17 += b36.f.b(2, gVar4);
            }
            r45.l05 l05Var2 = this.f388314f;
            if (l05Var2 != null) {
                b17 += b36.f.i(3, l05Var2.computeSize());
            }
            return b17 + b36.f.e(4, this.f388315g);
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
        r45.vk0 vk0Var = (r45.vk0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vk0Var.f388312d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            vk0Var.f388313e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            vk0Var.f388315g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.l05 l05Var3 = new r45.l05();
            if (bArr != null && bArr.length > 0) {
                l05Var3.parseFrom(bArr);
            }
            vk0Var.f388314f = l05Var3;
        }
        return 0;
    }
}
