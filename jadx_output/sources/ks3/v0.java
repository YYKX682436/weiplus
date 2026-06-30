package ks3;

/* loaded from: classes8.dex */
public class v0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f311755d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f311756e;

    /* renamed from: f, reason: collision with root package name */
    public long f311757f;

    /* renamed from: g, reason: collision with root package name */
    public int f311758g;

    /* renamed from: h, reason: collision with root package name */
    public long f311759h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f311760i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.v0)) {
            return false;
        }
        ks3.v0 v0Var = (ks3.v0) fVar;
        return n51.f.a(this.f311755d, v0Var.f311755d) && n51.f.a(this.f311756e, v0Var.f311756e) && n51.f.a(java.lang.Long.valueOf(this.f311757f), java.lang.Long.valueOf(v0Var.f311757f)) && n51.f.a(java.lang.Integer.valueOf(this.f311758g), java.lang.Integer.valueOf(v0Var.f311758g)) && n51.f.a(java.lang.Long.valueOf(this.f311759h), java.lang.Long.valueOf(v0Var.f311759h)) && n51.f.a(this.f311760i, v0Var.f311760i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f311755d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f311756e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f311757f);
            fVar.e(4, this.f311758g);
            fVar.h(5, this.f311759h);
            java.lang.String str3 = this.f311760i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f311755d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f311756e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int h17 = j17 + b36.f.h(3, this.f311757f) + b36.f.e(4, this.f311758g) + b36.f.h(5, this.f311759h);
            java.lang.String str6 = this.f311760i;
            return str6 != null ? h17 + b36.f.j(6, str6) : h17;
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
        ks3.v0 v0Var = (ks3.v0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                v0Var.f311755d = aVar2.k(intValue);
                return 0;
            case 2:
                v0Var.f311756e = aVar2.k(intValue);
                return 0;
            case 3:
                v0Var.f311757f = aVar2.i(intValue);
                return 0;
            case 4:
                v0Var.f311758g = aVar2.g(intValue);
                return 0;
            case 5:
                v0Var.f311759h = aVar2.i(intValue);
                return 0;
            case 6:
                v0Var.f311760i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
