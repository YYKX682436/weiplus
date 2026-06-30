package r45;

/* loaded from: classes8.dex */
public class ll extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379563d;

    /* renamed from: e, reason: collision with root package name */
    public int f379564e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379565f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379566g;

    /* renamed from: h, reason: collision with root package name */
    public int f379567h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379568i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379569m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ll)) {
            return false;
        }
        r45.ll llVar = (r45.ll) fVar;
        return n51.f.a(this.f379563d, llVar.f379563d) && n51.f.a(java.lang.Integer.valueOf(this.f379564e), java.lang.Integer.valueOf(llVar.f379564e)) && n51.f.a(this.f379565f, llVar.f379565f) && n51.f.a(this.f379566g, llVar.f379566g) && n51.f.a(java.lang.Integer.valueOf(this.f379567h), java.lang.Integer.valueOf(llVar.f379567h)) && n51.f.a(this.f379568i, llVar.f379568i) && n51.f.a(this.f379569m, llVar.f379569m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379563d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f379564e);
            java.lang.String str2 = this.f379565f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f379566g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f379567h);
            java.lang.String str4 = this.f379568i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f379569m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f379563d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f379564e);
            java.lang.String str7 = this.f379565f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f379566g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            int e17 = j17 + b36.f.e(5, this.f379567h);
            java.lang.String str9 = this.f379568i;
            if (str9 != null) {
                e17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f379569m;
            return str10 != null ? e17 + b36.f.j(7, str10) : e17;
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
        r45.ll llVar = (r45.ll) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                llVar.f379563d = aVar2.k(intValue);
                return 0;
            case 2:
                llVar.f379564e = aVar2.g(intValue);
                return 0;
            case 3:
                llVar.f379565f = aVar2.k(intValue);
                return 0;
            case 4:
                llVar.f379566g = aVar2.k(intValue);
                return 0;
            case 5:
                llVar.f379567h = aVar2.g(intValue);
                return 0;
            case 6:
                llVar.f379568i = aVar2.k(intValue);
                return 0;
            case 7:
                llVar.f379569m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
