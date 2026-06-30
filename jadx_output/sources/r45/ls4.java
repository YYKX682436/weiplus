package r45;

/* loaded from: classes8.dex */
public class ls4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379800d;

    /* renamed from: e, reason: collision with root package name */
    public r45.os4 f379801e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ms4 f379802f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ls4)) {
            return false;
        }
        r45.ls4 ls4Var = (r45.ls4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379800d), java.lang.Integer.valueOf(ls4Var.f379800d)) && n51.f.a(this.f379801e, ls4Var.f379801e) && n51.f.a(this.f379802f, ls4Var.f379802f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379800d);
            r45.os4 os4Var = this.f379801e;
            if (os4Var != null) {
                fVar.i(2, os4Var.computeSize());
                this.f379801e.writeFields(fVar);
            }
            r45.ms4 ms4Var = this.f379802f;
            if (ms4Var != null) {
                fVar.i(101, ms4Var.computeSize());
                this.f379802f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379800d) + 0;
            r45.os4 os4Var2 = this.f379801e;
            if (os4Var2 != null) {
                e17 += b36.f.i(2, os4Var2.computeSize());
            }
            r45.ms4 ms4Var2 = this.f379802f;
            return ms4Var2 != null ? e17 + b36.f.i(101, ms4Var2.computeSize()) : e17;
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
        r45.ls4 ls4Var = (r45.ls4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ls4Var.f379800d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.os4 os4Var3 = new r45.os4();
                if (bArr != null && bArr.length > 0) {
                    os4Var3.parseFrom(bArr);
                }
                ls4Var.f379801e = os4Var3;
            }
            return 0;
        }
        if (intValue != 101) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.ms4 ms4Var3 = new r45.ms4();
            if (bArr2 != null && bArr2.length > 0) {
                ms4Var3.parseFrom(bArr2);
            }
            ls4Var.f379802f = ms4Var3;
        }
        return 0;
    }
}
