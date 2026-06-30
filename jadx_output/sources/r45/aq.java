package r45;

/* loaded from: classes2.dex */
public class aq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370181d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370182e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370183f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f370184g;

    /* renamed from: h, reason: collision with root package name */
    public int f370185h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370186i;

    /* renamed from: m, reason: collision with root package name */
    public int f370187m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aq)) {
            return false;
        }
        r45.aq aqVar = (r45.aq) fVar;
        return n51.f.a(this.f370181d, aqVar.f370181d) && n51.f.a(this.f370182e, aqVar.f370182e) && n51.f.a(this.f370183f, aqVar.f370183f) && n51.f.a(this.f370184g, aqVar.f370184g) && n51.f.a(java.lang.Integer.valueOf(this.f370185h), java.lang.Integer.valueOf(aqVar.f370185h)) && n51.f.a(this.f370186i, aqVar.f370186i) && n51.f.a(java.lang.Integer.valueOf(this.f370187m), java.lang.Integer.valueOf(aqVar.f370187m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f370181d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f370182e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f370183f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f370184g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f370185h);
            java.lang.String str5 = this.f370186i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f370187m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f370181d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f370182e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f370183f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f370184g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            int e17 = j17 + b36.f.e(5, this.f370185h);
            java.lang.String str10 = this.f370186i;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            return e17 + b36.f.e(7, this.f370187m);
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
        r45.aq aqVar = (r45.aq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aqVar.f370181d = aVar2.k(intValue);
                return 0;
            case 2:
                aqVar.f370182e = aVar2.k(intValue);
                return 0;
            case 3:
                aqVar.f370183f = aVar2.k(intValue);
                return 0;
            case 4:
                aqVar.f370184g = aVar2.k(intValue);
                return 0;
            case 5:
                aqVar.f370185h = aVar2.g(intValue);
                return 0;
            case 6:
                aqVar.f370186i = aVar2.k(intValue);
                return 0;
            case 7:
                aqVar.f370187m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
