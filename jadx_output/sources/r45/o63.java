package r45;

/* loaded from: classes4.dex */
public class o63 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f381980d;

    /* renamed from: e, reason: collision with root package name */
    public r45.j73 f381981e;

    /* renamed from: f, reason: collision with root package name */
    public r45.k73 f381982f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o63)) {
            return false;
        }
        r45.o63 o63Var = (r45.o63) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f381980d), java.lang.Integer.valueOf(o63Var.f381980d)) && n51.f.a(this.f381981e, o63Var.f381981e) && n51.f.a(this.f381982f, o63Var.f381982f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f381980d);
            r45.j73 j73Var = this.f381981e;
            if (j73Var != null) {
                fVar.i(2, j73Var.computeSize());
                this.f381981e.writeFields(fVar);
            }
            r45.k73 k73Var = this.f381982f;
            if (k73Var != null) {
                fVar.i(4, k73Var.computeSize());
                this.f381982f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f381980d) + 0;
            r45.j73 j73Var2 = this.f381981e;
            if (j73Var2 != null) {
                e17 += b36.f.i(2, j73Var2.computeSize());
            }
            r45.k73 k73Var2 = this.f381982f;
            return k73Var2 != null ? e17 + b36.f.i(4, k73Var2.computeSize()) : e17;
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
        r45.o63 o63Var = (r45.o63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o63Var.f381980d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.j73 j73Var3 = new r45.j73();
                if (bArr != null && bArr.length > 0) {
                    j73Var3.parseFrom(bArr);
                }
                o63Var.f381981e = j73Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.k73 k73Var3 = new r45.k73();
            if (bArr2 != null && bArr2.length > 0) {
                k73Var3.parseFrom(bArr2);
            }
            o63Var.f381982f = k73Var3;
        }
        return 0;
    }
}
