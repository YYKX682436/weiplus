package r45;

/* loaded from: classes7.dex */
public class m47 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380145d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380146e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380147f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380148g;

    /* renamed from: h, reason: collision with root package name */
    public int f380149h;

    /* renamed from: i, reason: collision with root package name */
    public float f380150i;

    /* renamed from: m, reason: collision with root package name */
    public float f380151m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380152n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m47)) {
            return false;
        }
        r45.m47 m47Var = (r45.m47) fVar;
        return n51.f.a(this.f380145d, m47Var.f380145d) && n51.f.a(this.f380146e, m47Var.f380146e) && n51.f.a(this.f380147f, m47Var.f380147f) && n51.f.a(this.f380148g, m47Var.f380148g) && n51.f.a(java.lang.Integer.valueOf(this.f380149h), java.lang.Integer.valueOf(m47Var.f380149h)) && n51.f.a(java.lang.Float.valueOf(this.f380150i), java.lang.Float.valueOf(m47Var.f380150i)) && n51.f.a(java.lang.Float.valueOf(this.f380151m), java.lang.Float.valueOf(m47Var.f380151m)) && n51.f.a(this.f380152n, m47Var.f380152n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380145d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380146e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f380147f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f380148g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f380149h);
            fVar.d(6, this.f380150i);
            fVar.d(7, this.f380151m);
            java.lang.String str5 = this.f380152n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f380145d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f380146e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f380147f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f380148g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f380149h) + b36.f.d(6, this.f380150i) + b36.f.d(7, this.f380151m);
            java.lang.String str10 = this.f380152n;
            return str10 != null ? e17 + b36.f.j(8, str10) : e17;
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
        r45.m47 m47Var = (r45.m47) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m47Var.f380145d = aVar2.k(intValue);
                return 0;
            case 2:
                m47Var.f380146e = aVar2.k(intValue);
                return 0;
            case 3:
                m47Var.f380147f = aVar2.k(intValue);
                return 0;
            case 4:
                m47Var.f380148g = aVar2.k(intValue);
                return 0;
            case 5:
                m47Var.f380149h = aVar2.g(intValue);
                return 0;
            case 6:
                m47Var.f380150i = aVar2.f(intValue);
                return 0;
            case 7:
                m47Var.f380151m = aVar2.f(intValue);
                return 0;
            case 8:
                m47Var.f380152n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
