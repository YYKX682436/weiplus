package r45;

/* loaded from: classes9.dex */
public class il6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377136d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377137e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377138f;

    /* renamed from: g, reason: collision with root package name */
    public float f377139g;

    /* renamed from: h, reason: collision with root package name */
    public float f377140h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f377141i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.il6)) {
            return false;
        }
        r45.il6 il6Var = (r45.il6) fVar;
        return n51.f.a(this.f377136d, il6Var.f377136d) && n51.f.a(this.f377137e, il6Var.f377137e) && n51.f.a(this.f377138f, il6Var.f377138f) && n51.f.a(java.lang.Float.valueOf(this.f377139g), java.lang.Float.valueOf(il6Var.f377139g)) && n51.f.a(java.lang.Float.valueOf(this.f377140h), java.lang.Float.valueOf(il6Var.f377140h)) && n51.f.a(this.f377141i, il6Var.f377141i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377136d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f377137e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f377138f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.d(4, this.f377139g);
            fVar.d(5, this.f377140h);
            java.lang.String str4 = this.f377141i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f377136d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f377137e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f377138f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int d17 = j17 + b36.f.d(4, this.f377139g) + b36.f.d(5, this.f377140h);
            java.lang.String str8 = this.f377141i;
            return str8 != null ? d17 + b36.f.j(6, str8) : d17;
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
        r45.il6 il6Var = (r45.il6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                il6Var.f377136d = aVar2.k(intValue);
                return 0;
            case 2:
                il6Var.f377137e = aVar2.k(intValue);
                return 0;
            case 3:
                il6Var.f377138f = aVar2.k(intValue);
                return 0;
            case 4:
                il6Var.f377139g = aVar2.f(intValue);
                return 0;
            case 5:
                il6Var.f377140h = aVar2.f(intValue);
                return 0;
            case 6:
                il6Var.f377141i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
