package n33;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f334484d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f334485e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f334486f;

    /* renamed from: g, reason: collision with root package name */
    public long f334487g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f334488h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f334489i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f334490m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f334491n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f334492o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof n33.c)) {
            return false;
        }
        n33.c cVar = (n33.c) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f334484d), java.lang.Long.valueOf(cVar.f334484d)) && n51.f.a(java.lang.Boolean.valueOf(this.f334485e), java.lang.Boolean.valueOf(cVar.f334485e)) && n51.f.a(this.f334486f, cVar.f334486f) && n51.f.a(java.lang.Long.valueOf(this.f334487g), java.lang.Long.valueOf(cVar.f334487g)) && n51.f.a(this.f334488h, cVar.f334488h) && n51.f.a(this.f334489i, cVar.f334489i) && n51.f.a(this.f334490m, cVar.f334490m) && n51.f.a(this.f334491n, cVar.f334491n) && n51.f.a(this.f334492o, cVar.f334492o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f334484d);
            fVar.a(2, this.f334485e);
            java.lang.String str = this.f334486f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f334487g);
            java.lang.String str2 = this.f334488h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f334489i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f334490m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f334491n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f334492o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f334484d) + 0 + b36.f.a(2, this.f334485e);
            java.lang.String str7 = this.f334486f;
            if (str7 != null) {
                h17 += b36.f.j(3, str7);
            }
            int h18 = h17 + b36.f.h(4, this.f334487g);
            java.lang.String str8 = this.f334488h;
            if (str8 != null) {
                h18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f334489i;
            if (str9 != null) {
                h18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f334490m;
            if (str10 != null) {
                h18 += b36.f.j(7, str10);
            }
            java.lang.String str11 = this.f334491n;
            if (str11 != null) {
                h18 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f334492o;
            return str12 != null ? h18 + b36.f.j(9, str12) : h18;
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
        n33.c cVar = (n33.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f334484d = aVar2.i(intValue);
                return 0;
            case 2:
                cVar.f334485e = aVar2.c(intValue);
                return 0;
            case 3:
                cVar.f334486f = aVar2.k(intValue);
                return 0;
            case 4:
                cVar.f334487g = aVar2.i(intValue);
                return 0;
            case 5:
                cVar.f334488h = aVar2.k(intValue);
                return 0;
            case 6:
                cVar.f334489i = aVar2.k(intValue);
                return 0;
            case 7:
                cVar.f334490m = aVar2.k(intValue);
                return 0;
            case 8:
                cVar.f334491n = aVar2.k(intValue);
                return 0;
            case 9:
                cVar.f334492o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
