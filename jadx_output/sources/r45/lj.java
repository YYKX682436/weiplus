package r45;

/* loaded from: classes11.dex */
public class lj extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379507d;

    /* renamed from: e, reason: collision with root package name */
    public int f379508e;

    /* renamed from: f, reason: collision with root package name */
    public int f379509f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379510g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379511h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379512i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379513m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f379514n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lj)) {
            return false;
        }
        r45.lj ljVar = (r45.lj) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379507d), java.lang.Integer.valueOf(ljVar.f379507d)) && n51.f.a(java.lang.Integer.valueOf(this.f379508e), java.lang.Integer.valueOf(ljVar.f379508e)) && n51.f.a(java.lang.Integer.valueOf(this.f379509f), java.lang.Integer.valueOf(ljVar.f379509f)) && n51.f.a(this.f379510g, ljVar.f379510g) && n51.f.a(this.f379511h, ljVar.f379511h) && n51.f.a(this.f379512i, ljVar.f379512i) && n51.f.a(this.f379513m, ljVar.f379513m) && n51.f.a(this.f379514n, ljVar.f379514n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379507d);
            fVar.e(2, this.f379508e);
            fVar.e(3, this.f379509f);
            java.lang.String str = this.f379510g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f379511h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f379512i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f379513m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f379514n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379507d) + 0 + b36.f.e(2, this.f379508e) + b36.f.e(3, this.f379509f);
            java.lang.String str6 = this.f379510g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f379511h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f379512i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f379513m;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            java.lang.String str10 = this.f379514n;
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
        r45.lj ljVar = (r45.lj) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ljVar.f379507d = aVar2.g(intValue);
                return 0;
            case 2:
                ljVar.f379508e = aVar2.g(intValue);
                return 0;
            case 3:
                ljVar.f379509f = aVar2.g(intValue);
                return 0;
            case 4:
                ljVar.f379510g = aVar2.k(intValue);
                return 0;
            case 5:
                ljVar.f379511h = aVar2.k(intValue);
                return 0;
            case 6:
                ljVar.f379512i = aVar2.k(intValue);
                return 0;
            case 7:
                ljVar.f379513m = aVar2.k(intValue);
                return 0;
            case 8:
                ljVar.f379514n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
