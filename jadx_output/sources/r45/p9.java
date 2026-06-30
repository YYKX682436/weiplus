package r45;

/* loaded from: classes4.dex */
public class p9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382861d;

    /* renamed from: e, reason: collision with root package name */
    public long f382862e;

    /* renamed from: f, reason: collision with root package name */
    public int f382863f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382864g;

    /* renamed from: h, reason: collision with root package name */
    public int f382865h;

    /* renamed from: i, reason: collision with root package name */
    public int f382866i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p9)) {
            return false;
        }
        r45.p9 p9Var = (r45.p9) fVar;
        return n51.f.a(this.f382861d, p9Var.f382861d) && n51.f.a(java.lang.Long.valueOf(this.f382862e), java.lang.Long.valueOf(p9Var.f382862e)) && n51.f.a(java.lang.Integer.valueOf(this.f382863f), java.lang.Integer.valueOf(p9Var.f382863f)) && n51.f.a(this.f382864g, p9Var.f382864g) && n51.f.a(java.lang.Integer.valueOf(this.f382865h), java.lang.Integer.valueOf(p9Var.f382865h)) && n51.f.a(java.lang.Integer.valueOf(this.f382866i), java.lang.Integer.valueOf(p9Var.f382866i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382861d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f382862e);
            fVar.e(3, this.f382863f);
            java.lang.String str2 = this.f382864g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f382865h);
            fVar.e(6, this.f382866i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f382861d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f382862e) + b36.f.e(3, this.f382863f);
            java.lang.String str4 = this.f382864g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.e(5, this.f382865h) + b36.f.e(6, this.f382866i);
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
        r45.p9 p9Var = (r45.p9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                p9Var.f382861d = aVar2.k(intValue);
                return 0;
            case 2:
                p9Var.f382862e = aVar2.i(intValue);
                return 0;
            case 3:
                p9Var.f382863f = aVar2.g(intValue);
                return 0;
            case 4:
                p9Var.f382864g = aVar2.k(intValue);
                return 0;
            case 5:
                p9Var.f382865h = aVar2.g(intValue);
                return 0;
            case 6:
                p9Var.f382866i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
