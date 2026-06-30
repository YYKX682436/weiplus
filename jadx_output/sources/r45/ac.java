package r45;

/* loaded from: classes9.dex */
public class ac extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f369907d;

    /* renamed from: e, reason: collision with root package name */
    public int f369908e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369909f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369910g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369911h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ac)) {
            return false;
        }
        r45.ac acVar = (r45.ac) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f369907d), java.lang.Boolean.valueOf(acVar.f369907d)) && n51.f.a(java.lang.Integer.valueOf(this.f369908e), java.lang.Integer.valueOf(acVar.f369908e)) && n51.f.a(this.f369909f, acVar.f369909f) && n51.f.a(this.f369910g, acVar.f369910g) && n51.f.a(this.f369911h, acVar.f369911h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f369907d);
            fVar.e(2, this.f369908e);
            java.lang.String str = this.f369909f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f369910g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f369911h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f369907d) + 0 + b36.f.e(2, this.f369908e);
            java.lang.String str4 = this.f369909f;
            if (str4 != null) {
                a17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f369910g;
            if (str5 != null) {
                a17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f369911h;
            return str6 != null ? a17 + b36.f.j(5, str6) : a17;
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
        r45.ac acVar = (r45.ac) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            acVar.f369907d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            acVar.f369908e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            acVar.f369909f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            acVar.f369910g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        acVar.f369911h = aVar2.k(intValue);
        return 0;
    }
}
