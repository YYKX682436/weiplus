package r45;

/* loaded from: classes8.dex */
public class sk5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f385815d;

    /* renamed from: e, reason: collision with root package name */
    public r45.y35 f385816e;

    /* renamed from: f, reason: collision with root package name */
    public r45.r8 f385817f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sk5)) {
            return false;
        }
        r45.sk5 sk5Var = (r45.sk5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f385815d), java.lang.Integer.valueOf(sk5Var.f385815d)) && n51.f.a(this.f385816e, sk5Var.f385816e) && n51.f.a(this.f385817f, sk5Var.f385817f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f385815d);
            r45.y35 y35Var = this.f385816e;
            if (y35Var != null) {
                fVar.i(2, y35Var.computeSize());
                this.f385816e.writeFields(fVar);
            }
            r45.r8 r8Var = this.f385817f;
            if (r8Var != null) {
                fVar.i(3, r8Var.computeSize());
                this.f385817f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f385815d) + 0;
            r45.y35 y35Var2 = this.f385816e;
            if (y35Var2 != null) {
                e17 += b36.f.i(2, y35Var2.computeSize());
            }
            r45.r8 r8Var2 = this.f385817f;
            return r8Var2 != null ? e17 + b36.f.i(3, r8Var2.computeSize()) : e17;
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
        r45.sk5 sk5Var = (r45.sk5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            sk5Var.f385815d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.y35 y35Var3 = new r45.y35();
                if (bArr != null && bArr.length > 0) {
                    y35Var3.parseFrom(bArr);
                }
                sk5Var.f385816e = y35Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.r8 r8Var3 = new r45.r8();
            if (bArr2 != null && bArr2.length > 0) {
                r8Var3.parseFrom(bArr2);
            }
            sk5Var.f385817f = r8Var3;
        }
        return 0;
    }
}
