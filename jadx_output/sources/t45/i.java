package t45;

/* loaded from: classes2.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f415588d;

    /* renamed from: e, reason: collision with root package name */
    public t45.l0 f415589e;

    /* renamed from: f, reason: collision with root package name */
    public t45.n0 f415590f;

    /* renamed from: g, reason: collision with root package name */
    public long f415591g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.i)) {
            return false;
        }
        t45.i iVar = (t45.i) fVar;
        return n51.f.a(this.f415588d, iVar.f415588d) && n51.f.a(this.f415589e, iVar.f415589e) && n51.f.a(this.f415590f, iVar.f415590f) && n51.f.a(java.lang.Long.valueOf(this.f415591g), java.lang.Long.valueOf(iVar.f415591g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f415588d;
            if (str != null) {
                fVar.j(1, str);
            }
            t45.l0 l0Var = this.f415589e;
            if (l0Var != null) {
                fVar.i(2, l0Var.computeSize());
                this.f415589e.writeFields(fVar);
            }
            t45.n0 n0Var = this.f415590f;
            if (n0Var != null) {
                fVar.i(3, n0Var.computeSize());
                this.f415590f.writeFields(fVar);
            }
            fVar.h(4, this.f415591g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f415588d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            t45.l0 l0Var2 = this.f415589e;
            if (l0Var2 != null) {
                j17 += b36.f.i(2, l0Var2.computeSize());
            }
            t45.n0 n0Var2 = this.f415590f;
            if (n0Var2 != null) {
                j17 += b36.f.i(3, n0Var2.computeSize());
            }
            return j17 + b36.f.h(4, this.f415591g);
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
        t45.i iVar = (t45.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            iVar.f415588d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                t45.l0 l0Var3 = new t45.l0();
                if (bArr != null && bArr.length > 0) {
                    l0Var3.parseFrom(bArr);
                }
                iVar.f415589e = l0Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            iVar.f415591g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            t45.n0 n0Var3 = new t45.n0();
            if (bArr2 != null && bArr2.length > 0) {
                n0Var3.parseFrom(bArr2);
            }
            iVar.f415590f = n0Var3;
        }
        return 0;
    }
}
