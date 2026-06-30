package r45;

/* loaded from: classes8.dex */
public class gq6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375486d;

    /* renamed from: e, reason: collision with root package name */
    public r45.l05 f375487e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375488f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375489g;

    /* renamed from: h, reason: collision with root package name */
    public int f375490h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gq6)) {
            return false;
        }
        r45.gq6 gq6Var = (r45.gq6) fVar;
        return n51.f.a(this.f375486d, gq6Var.f375486d) && n51.f.a(this.f375487e, gq6Var.f375487e) && n51.f.a(this.f375488f, gq6Var.f375488f) && n51.f.a(this.f375489g, gq6Var.f375489g) && n51.f.a(java.lang.Integer.valueOf(this.f375490h), java.lang.Integer.valueOf(gq6Var.f375490h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f375486d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            r45.l05 l05Var = this.f375487e;
            if (l05Var != null) {
                fVar.i(2, l05Var.computeSize());
                this.f375487e.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f375488f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            com.tencent.mm.protobuf.g gVar3 = this.f375489g;
            if (gVar3 != null) {
                fVar.b(4, gVar3);
            }
            fVar.e(5, this.f375490h);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar4 = this.f375486d;
            int b17 = gVar4 != null ? 0 + b36.f.b(1, gVar4) : 0;
            r45.l05 l05Var2 = this.f375487e;
            if (l05Var2 != null) {
                b17 += b36.f.i(2, l05Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar5 = this.f375488f;
            if (gVar5 != null) {
                b17 += b36.f.b(3, gVar5);
            }
            com.tencent.mm.protobuf.g gVar6 = this.f375489g;
            if (gVar6 != null) {
                b17 += b36.f.b(4, gVar6);
            }
            return b17 + b36.f.e(5, this.f375490h);
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
        r45.gq6 gq6Var = (r45.gq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gq6Var.f375486d = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                gq6Var.f375488f = aVar2.d(intValue);
                return 0;
            }
            if (intValue == 4) {
                gq6Var.f375489g = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            gq6Var.f375490h = aVar2.g(intValue);
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
            gq6Var.f375487e = l05Var3;
        }
        return 0;
    }
}
