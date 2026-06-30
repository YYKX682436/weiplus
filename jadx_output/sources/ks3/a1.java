package ks3;

/* loaded from: classes8.dex */
public class a1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f311618d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f311619e;

    /* renamed from: f, reason: collision with root package name */
    public int f311620f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f311621g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f311622h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.a1)) {
            return false;
        }
        ks3.a1 a1Var = (ks3.a1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f311618d), java.lang.Long.valueOf(a1Var.f311618d)) && n51.f.a(this.f311619e, a1Var.f311619e) && n51.f.a(java.lang.Integer.valueOf(this.f311620f), java.lang.Integer.valueOf(a1Var.f311620f)) && n51.f.a(this.f311621g, a1Var.f311621g) && n51.f.a(this.f311622h, a1Var.f311622h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f311618d);
            java.lang.String str = this.f311619e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f311620f);
            java.lang.String str2 = this.f311621g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f311622h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f311618d) + 0;
            java.lang.String str4 = this.f311619e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            int e17 = h17 + b36.f.e(3, this.f311620f);
            java.lang.String str5 = this.f311621g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f311622h;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        ks3.a1 a1Var = (ks3.a1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a1Var.f311618d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            a1Var.f311619e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            a1Var.f311620f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            a1Var.f311621g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        a1Var.f311622h = aVar2.k(intValue);
        return 0;
    }
}
