package r45;

/* loaded from: classes10.dex */
public class cy5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371923d;

    /* renamed from: e, reason: collision with root package name */
    public int f371924e;

    /* renamed from: f, reason: collision with root package name */
    public int f371925f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f371926g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f371927h;

    /* renamed from: i, reason: collision with root package name */
    public int f371928i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f371929m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f371930n;

    /* renamed from: o, reason: collision with root package name */
    public int f371931o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cy5)) {
            return false;
        }
        r45.cy5 cy5Var = (r45.cy5) fVar;
        return n51.f.a(this.f371923d, cy5Var.f371923d) && n51.f.a(java.lang.Integer.valueOf(this.f371924e), java.lang.Integer.valueOf(cy5Var.f371924e)) && n51.f.a(java.lang.Integer.valueOf(this.f371925f), java.lang.Integer.valueOf(cy5Var.f371925f)) && n51.f.a(this.f371926g, cy5Var.f371926g) && n51.f.a(this.f371927h, cy5Var.f371927h) && n51.f.a(java.lang.Integer.valueOf(this.f371928i), java.lang.Integer.valueOf(cy5Var.f371928i)) && n51.f.a(this.f371929m, cy5Var.f371929m) && n51.f.a(this.f371930n, cy5Var.f371930n) && n51.f.a(java.lang.Integer.valueOf(this.f371931o), java.lang.Integer.valueOf(cy5Var.f371931o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f371923d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f371924e);
            fVar.e(3, this.f371925f);
            fVar.g(4, 1, this.f371926g);
            java.lang.String str2 = this.f371927h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f371928i);
            java.lang.String str3 = this.f371929m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f371930n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f371931o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f371923d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.e(2, this.f371924e) + b36.f.e(3, this.f371925f) + b36.f.g(4, 1, this.f371926g);
            java.lang.String str6 = this.f371927h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            int e17 = j17 + b36.f.e(6, this.f371928i);
            java.lang.String str7 = this.f371929m;
            if (str7 != null) {
                e17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f371930n;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            return e17 + b36.f.e(9, this.f371931o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f371926g.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.cy5 cy5Var = (r45.cy5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cy5Var.f371923d = aVar2.k(intValue);
                return 0;
            case 2:
                cy5Var.f371924e = aVar2.g(intValue);
                return 0;
            case 3:
                cy5Var.f371925f = aVar2.g(intValue);
                return 0;
            case 4:
                cy5Var.f371926g.add(aVar2.k(intValue));
                return 0;
            case 5:
                cy5Var.f371927h = aVar2.k(intValue);
                return 0;
            case 6:
                cy5Var.f371928i = aVar2.g(intValue);
                return 0;
            case 7:
                cy5Var.f371929m = aVar2.k(intValue);
                return 0;
            case 8:
                cy5Var.f371930n = aVar2.k(intValue);
                return 0;
            case 9:
                cy5Var.f371931o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
