package r45;

/* loaded from: classes4.dex */
public class e67 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f373057d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f67 f373058e;

    /* renamed from: f, reason: collision with root package name */
    public r45.g67 f373059f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e67)) {
            return false;
        }
        r45.e67 e67Var = (r45.e67) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f373057d), java.lang.Integer.valueOf(e67Var.f373057d)) && n51.f.a(this.f373058e, e67Var.f373058e) && n51.f.a(this.f373059f, e67Var.f373059f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f373057d);
            r45.f67 f67Var = this.f373058e;
            if (f67Var != null) {
                fVar.i(2, f67Var.computeSize());
                this.f373058e.writeFields(fVar);
            }
            r45.g67 g67Var = this.f373059f;
            if (g67Var != null) {
                fVar.i(3, g67Var.computeSize());
                this.f373059f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f373057d) + 0;
            r45.f67 f67Var2 = this.f373058e;
            if (f67Var2 != null) {
                e17 += b36.f.i(2, f67Var2.computeSize());
            }
            r45.g67 g67Var2 = this.f373059f;
            return g67Var2 != null ? e17 + b36.f.i(3, g67Var2.computeSize()) : e17;
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
        r45.e67 e67Var = (r45.e67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e67Var.f373057d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.f67 f67Var3 = new r45.f67();
                if (bArr != null && bArr.length > 0) {
                    f67Var3.parseFrom(bArr);
                }
                e67Var.f373058e = f67Var3;
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
            r45.g67 g67Var3 = new r45.g67();
            if (bArr2 != null && bArr2.length > 0) {
                g67Var3.parseFrom(bArr2);
            }
            e67Var.f373059f = g67Var3;
        }
        return 0;
    }
}
