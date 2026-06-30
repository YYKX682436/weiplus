package r45;

/* loaded from: classes4.dex */
public class kf7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f378667d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378668e;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kf7)) {
            return false;
        }
        r45.kf7 kf7Var = (r45.kf7) fVar;
        return n51.f.a(this.f378667d, kf7Var.f378667d) && n51.f.a(this.f378668e, kf7Var.f378668e);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f378667d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.computeSize());
                this.f378667d.writeFields(fVar);
            }
            java.lang.String str = this.f378668e;
            if (str != null) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f378667d;
            int i18 = cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.computeSize()) : 0;
            java.lang.String str2 = this.f378668e;
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
        r45.kf7 kf7Var = (r45.kf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            kf7Var.f378668e = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.cf7 cf7Var3 = new r45.cf7();
            if (bArr != null && bArr.length > 0) {
                cf7Var3.parseFrom(bArr);
            }
            kf7Var.f378667d = cf7Var3;
        }
        return 0;
    }
}
