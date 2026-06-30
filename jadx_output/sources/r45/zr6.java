package r45;

/* loaded from: classes4.dex */
public class zr6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392339d;

    /* renamed from: e, reason: collision with root package name */
    public int f392340e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392341f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392342g;

    /* renamed from: h, reason: collision with root package name */
    public int f392343h;

    /* renamed from: i, reason: collision with root package name */
    public int f392344i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zr6)) {
            return false;
        }
        r45.zr6 zr6Var = (r45.zr6) fVar;
        return n51.f.a(this.f392339d, zr6Var.f392339d) && n51.f.a(java.lang.Integer.valueOf(this.f392340e), java.lang.Integer.valueOf(zr6Var.f392340e)) && n51.f.a(this.f392341f, zr6Var.f392341f) && n51.f.a(this.f392342g, zr6Var.f392342g) && n51.f.a(java.lang.Integer.valueOf(this.f392343h), java.lang.Integer.valueOf(zr6Var.f392343h)) && n51.f.a(java.lang.Integer.valueOf(this.f392344i), java.lang.Integer.valueOf(zr6Var.f392344i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392339d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f392340e);
            java.lang.String str2 = this.f392341f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f392342g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f392343h);
            fVar.e(6, this.f392344i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f392339d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f392340e);
            java.lang.String str5 = this.f392341f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f392342g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            return j17 + b36.f.e(5, this.f392343h) + b36.f.e(6, this.f392344i);
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
        r45.zr6 zr6Var = (r45.zr6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zr6Var.f392339d = aVar2.k(intValue);
                return 0;
            case 2:
                zr6Var.f392340e = aVar2.g(intValue);
                return 0;
            case 3:
                zr6Var.f392341f = aVar2.k(intValue);
                return 0;
            case 4:
                zr6Var.f392342g = aVar2.k(intValue);
                return 0;
            case 5:
                zr6Var.f392343h = aVar2.g(intValue);
                return 0;
            case 6:
                zr6Var.f392344i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
