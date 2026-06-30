package in;

/* loaded from: classes7.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f292721d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f292722e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f292723f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f292724g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f292725h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f292726i;

    /* renamed from: m, reason: collision with root package name */
    public int f292727m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f292728n;

    /* renamed from: o, reason: collision with root package name */
    public long f292729o;

    /* renamed from: p, reason: collision with root package name */
    public int f292730p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof in.c)) {
            return false;
        }
        in.c cVar = (in.c) fVar;
        return n51.f.a(this.f292721d, cVar.f292721d) && n51.f.a(this.f292722e, cVar.f292722e) && n51.f.a(this.f292723f, cVar.f292723f) && n51.f.a(this.f292724g, cVar.f292724g) && n51.f.a(this.f292725h, cVar.f292725h) && n51.f.a(this.f292726i, cVar.f292726i) && n51.f.a(java.lang.Integer.valueOf(this.f292727m), java.lang.Integer.valueOf(cVar.f292727m)) && n51.f.a(this.f292728n, cVar.f292728n) && n51.f.a(java.lang.Long.valueOf(this.f292729o), java.lang.Long.valueOf(cVar.f292729o)) && n51.f.a(java.lang.Integer.valueOf(this.f292730p), java.lang.Integer.valueOf(cVar.f292730p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f292721d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f292722e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f292723f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f292724g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f292725h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f292726i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f292727m);
            java.lang.String str7 = this.f292728n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.h(9, this.f292729o);
            fVar.e(10, this.f292730p);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f292721d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f292722e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f292723f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f292724g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f292725h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f292726i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            int e17 = j17 + b36.f.e(7, this.f292727m);
            java.lang.String str14 = this.f292728n;
            if (str14 != null) {
                e17 += b36.f.j(8, str14);
            }
            return e17 + b36.f.h(9, this.f292729o) + b36.f.e(10, this.f292730p);
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
        in.c cVar = (in.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f292721d = aVar2.k(intValue);
                return 0;
            case 2:
                cVar.f292722e = aVar2.k(intValue);
                return 0;
            case 3:
                cVar.f292723f = aVar2.k(intValue);
                return 0;
            case 4:
                cVar.f292724g = aVar2.k(intValue);
                return 0;
            case 5:
                cVar.f292725h = aVar2.k(intValue);
                return 0;
            case 6:
                cVar.f292726i = aVar2.k(intValue);
                return 0;
            case 7:
                cVar.f292727m = aVar2.g(intValue);
                return 0;
            case 8:
                cVar.f292728n = aVar2.k(intValue);
                return 0;
            case 9:
                cVar.f292729o = aVar2.i(intValue);
                return 0;
            case 10:
                cVar.f292730p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
