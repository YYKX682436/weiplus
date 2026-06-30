package r45;

/* loaded from: classes8.dex */
public class l05 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379059d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379060e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379061f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l05)) {
            return false;
        }
        r45.l05 l05Var = (r45.l05) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379059d), java.lang.Integer.valueOf(l05Var.f379059d)) && n51.f.a(this.f379060e, l05Var.f379060e) && n51.f.a(this.f379061f, l05Var.f379061f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379059d);
            java.lang.String str = this.f379060e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379061f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379059d) + 0;
            java.lang.String str3 = this.f379060e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f379061f;
            return str4 != null ? e17 + b36.f.j(3, str4) : e17;
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
        r45.l05 l05Var = (r45.l05) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            l05Var.f379059d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            l05Var.f379060e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        l05Var.f379061f = aVar2.k(intValue);
        return 0;
    }
}
