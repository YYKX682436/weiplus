package m53;

/* loaded from: classes8.dex */
public class i3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323787d;

    /* renamed from: e, reason: collision with root package name */
    public int f323788e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323789f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323790g;

    /* renamed from: h, reason: collision with root package name */
    public m53.p3 f323791h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.i3)) {
            return false;
        }
        m53.i3 i3Var = (m53.i3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323787d), java.lang.Integer.valueOf(i3Var.f323787d)) && n51.f.a(java.lang.Integer.valueOf(this.f323788e), java.lang.Integer.valueOf(i3Var.f323788e)) && n51.f.a(this.f323789f, i3Var.f323789f) && n51.f.a(this.f323790g, i3Var.f323790g) && n51.f.a(this.f323791h, i3Var.f323791h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323787d);
            fVar.e(2, this.f323788e);
            java.lang.String str = this.f323789f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f323790g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            m53.p3 p3Var = this.f323791h;
            if (p3Var != null) {
                fVar.i(5, p3Var.computeSize());
                this.f323791h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f323787d) + 0 + b36.f.e(2, this.f323788e);
            java.lang.String str3 = this.f323789f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f323790g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            m53.p3 p3Var2 = this.f323791h;
            return p3Var2 != null ? e17 + b36.f.i(5, p3Var2.computeSize()) : e17;
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
        m53.i3 i3Var = (m53.i3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            i3Var.f323787d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            i3Var.f323788e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            i3Var.f323789f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            i3Var.f323790g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            m53.p3 p3Var3 = new m53.p3();
            if (bArr != null && bArr.length > 0) {
                p3Var3.parseFrom(bArr);
            }
            i3Var.f323791h = p3Var3;
        }
        return 0;
    }
}
