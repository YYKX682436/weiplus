package r45;

/* loaded from: classes9.dex */
public class rp3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.zq6 f385074d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f385075e;

    static {
        new r45.rp3();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rp3)) {
            return false;
        }
        r45.rp3 rp3Var = (r45.rp3) fVar;
        return n51.f.a(this.f385074d, rp3Var.f385074d) && n51.f.a(this.f385075e, rp3Var.f385075e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.rp3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.zq6 zq6Var = this.f385074d;
            if (zq6Var != null) {
                fVar.i(1, zq6Var.computeSize());
                this.f385074d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f385075e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.zq6 zq6Var2 = this.f385074d;
            int i18 = zq6Var2 != null ? 0 + b36.f.i(1, zq6Var2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f385075e;
            return gVar2 != null ? i18 + b36.f.b(2, gVar2) : i18;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.f385075e = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.zq6 zq6Var3 = new r45.zq6();
            if (bArr != null && bArr.length > 0) {
                zq6Var3.parseFrom(bArr);
            }
            this.f385074d = zq6Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.rp3) super.parseFrom(bArr);
    }
}
