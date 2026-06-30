package r45;

/* loaded from: classes9.dex */
public class ld6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.f83 f379329d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f83 f379330e;

    /* renamed from: f, reason: collision with root package name */
    public long f379331f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ld6)) {
            return false;
        }
        r45.ld6 ld6Var = (r45.ld6) fVar;
        return n51.f.a(this.f379329d, ld6Var.f379329d) && n51.f.a(this.f379330e, ld6Var.f379330e) && n51.f.a(java.lang.Long.valueOf(this.f379331f), java.lang.Long.valueOf(ld6Var.f379331f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.f83 f83Var = this.f379329d;
            if (f83Var != null) {
                fVar.i(1, f83Var.computeSize());
                this.f379329d.writeFields(fVar);
            }
            r45.f83 f83Var2 = this.f379330e;
            if (f83Var2 != null) {
                fVar.i(2, f83Var2.computeSize());
                this.f379330e.writeFields(fVar);
            }
            fVar.h(3, this.f379331f);
            return 0;
        }
        if (i17 == 1) {
            r45.f83 f83Var3 = this.f379329d;
            int i18 = f83Var3 != null ? 0 + b36.f.i(1, f83Var3.computeSize()) : 0;
            r45.f83 f83Var4 = this.f379330e;
            if (f83Var4 != null) {
                i18 += b36.f.i(2, f83Var4.computeSize());
            }
            return i18 + b36.f.h(3, this.f379331f);
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
        r45.ld6 ld6Var = (r45.ld6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.f83 f83Var5 = new r45.f83();
                if (bArr != null && bArr.length > 0) {
                    f83Var5.parseFrom(bArr);
                }
                ld6Var.f379329d = f83Var5;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            ld6Var.f379331f = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.f83 f83Var6 = new r45.f83();
            if (bArr2 != null && bArr2.length > 0) {
                f83Var6.parseFrom(bArr2);
            }
            ld6Var.f379330e = f83Var6;
        }
        return 0;
    }
}
