package r45;

/* loaded from: classes9.dex */
public class lo0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f379669d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379670e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379671f;

    /* renamed from: g, reason: collision with root package name */
    public long f379672g;

    /* renamed from: h, reason: collision with root package name */
    public int f379673h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lo0)) {
            return false;
        }
        r45.lo0 lo0Var = (r45.lo0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f379669d), java.lang.Long.valueOf(lo0Var.f379669d)) && n51.f.a(this.f379670e, lo0Var.f379670e) && n51.f.a(this.f379671f, lo0Var.f379671f) && n51.f.a(java.lang.Long.valueOf(this.f379672g), java.lang.Long.valueOf(lo0Var.f379672g)) && n51.f.a(java.lang.Integer.valueOf(this.f379673h), java.lang.Integer.valueOf(lo0Var.f379673h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f379669d);
            java.lang.String str = this.f379670e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379671f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f379672g);
            fVar.e(5, this.f379673h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f379669d) + 0;
            java.lang.String str3 = this.f379670e;
            if (str3 != null) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f379671f;
            if (str4 != null) {
                h17 += b36.f.j(3, str4);
            }
            return h17 + b36.f.h(4, this.f379672g) + b36.f.e(5, this.f379673h);
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
        r45.lo0 lo0Var = (r45.lo0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lo0Var.f379669d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            lo0Var.f379670e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            lo0Var.f379671f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            lo0Var.f379672g = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        lo0Var.f379673h = aVar2.g(intValue);
        return 0;
    }
}
