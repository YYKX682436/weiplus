package r45;

/* loaded from: classes7.dex */
public class i77 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f376800d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376801e;

    /* renamed from: f, reason: collision with root package name */
    public r45.h77 f376802f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376803g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i77)) {
            return false;
        }
        r45.i77 i77Var = (r45.i77) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f376800d), java.lang.Integer.valueOf(i77Var.f376800d)) && n51.f.a(this.f376801e, i77Var.f376801e) && n51.f.a(this.f376802f, i77Var.f376802f) && n51.f.a(this.f376803g, i77Var.f376803g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f376800d);
            java.lang.String str = this.f376801e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.h77 h77Var = this.f376802f;
            if (h77Var != null) {
                fVar.i(3, h77Var.computeSize());
                this.f376802f.writeFields(fVar);
            }
            java.lang.String str2 = this.f376803g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f376800d) + 0;
            java.lang.String str3 = this.f376801e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            r45.h77 h77Var2 = this.f376802f;
            if (h77Var2 != null) {
                e17 += b36.f.i(3, h77Var2.computeSize());
            }
            java.lang.String str4 = this.f376803g;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.i77 i77Var = (r45.i77) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i77Var.f376800d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            i77Var.f376801e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            i77Var.f376803g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.h77 h77Var3 = new r45.h77();
            if (bArr != null && bArr.length > 0) {
                h77Var3.parseFrom(bArr);
            }
            i77Var.f376802f = h77Var3;
        }
        return 0;
    }
}
