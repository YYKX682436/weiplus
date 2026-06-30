package r45;

/* loaded from: classes7.dex */
public class us5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f387621d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387622e;

    /* renamed from: f, reason: collision with root package name */
    public int f387623f;

    /* renamed from: g, reason: collision with root package name */
    public int f387624g;

    /* renamed from: h, reason: collision with root package name */
    public int f387625h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.us5)) {
            return false;
        }
        r45.us5 us5Var = (r45.us5) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f387621d), java.lang.Long.valueOf(us5Var.f387621d)) && n51.f.a(this.f387622e, us5Var.f387622e) && n51.f.a(java.lang.Integer.valueOf(this.f387623f), java.lang.Integer.valueOf(us5Var.f387623f)) && n51.f.a(java.lang.Integer.valueOf(this.f387624g), java.lang.Integer.valueOf(us5Var.f387624g)) && n51.f.a(java.lang.Integer.valueOf(this.f387625h), java.lang.Integer.valueOf(us5Var.f387625h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f387621d);
            java.lang.String str = this.f387622e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f387623f);
            fVar.e(4, this.f387624g);
            fVar.e(5, this.f387625h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f387621d) + 0;
            java.lang.String str2 = this.f387622e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            return h17 + b36.f.e(3, this.f387623f) + b36.f.e(4, this.f387624g) + b36.f.e(5, this.f387625h);
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
        r45.us5 us5Var = (r45.us5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            us5Var.f387621d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            us5Var.f387622e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            us5Var.f387623f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            us5Var.f387624g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        us5Var.f387625h = aVar2.g(intValue);
        return 0;
    }
}
