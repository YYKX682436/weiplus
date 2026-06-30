package r45;

/* loaded from: classes4.dex */
public class ik5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377110d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377111e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377112f;

    /* renamed from: g, reason: collision with root package name */
    public long f377113g;

    /* renamed from: h, reason: collision with root package name */
    public long f377114h;

    /* renamed from: i, reason: collision with root package name */
    public int f377115i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ik5)) {
            return false;
        }
        r45.ik5 ik5Var = (r45.ik5) fVar;
        return n51.f.a(this.f377110d, ik5Var.f377110d) && n51.f.a(this.f377111e, ik5Var.f377111e) && n51.f.a(this.f377112f, ik5Var.f377112f) && n51.f.a(java.lang.Long.valueOf(this.f377113g), java.lang.Long.valueOf(ik5Var.f377113g)) && n51.f.a(java.lang.Long.valueOf(this.f377114h), java.lang.Long.valueOf(ik5Var.f377114h)) && n51.f.a(java.lang.Integer.valueOf(this.f377115i), java.lang.Integer.valueOf(ik5Var.f377115i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377110d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f377111e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f377112f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f377113g);
            fVar.h(5, this.f377114h);
            fVar.e(6, this.f377115i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f377110d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f377111e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f377112f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f377113g) + b36.f.h(5, this.f377114h) + b36.f.e(6, this.f377115i);
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
        r45.ik5 ik5Var = (r45.ik5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ik5Var.f377110d = aVar2.k(intValue);
                return 0;
            case 2:
                ik5Var.f377111e = aVar2.k(intValue);
                return 0;
            case 3:
                ik5Var.f377112f = aVar2.k(intValue);
                return 0;
            case 4:
                ik5Var.f377113g = aVar2.i(intValue);
                return 0;
            case 5:
                ik5Var.f377114h = aVar2.i(intValue);
                return 0;
            case 6:
                ik5Var.f377115i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
