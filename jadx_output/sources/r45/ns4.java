package r45;

/* loaded from: classes10.dex */
public class ns4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ls4 f381641d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381642e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f381643f;

    /* renamed from: g, reason: collision with root package name */
    public long f381644g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381645h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f381646i;

    /* renamed from: m, reason: collision with root package name */
    public int f381647m;

    /* renamed from: n, reason: collision with root package name */
    public int f381648n;

    /* renamed from: o, reason: collision with root package name */
    public long f381649o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f381650p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f381651q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ns4)) {
            return false;
        }
        r45.ns4 ns4Var = (r45.ns4) fVar;
        return n51.f.a(this.f381641d, ns4Var.f381641d) && n51.f.a(this.f381642e, ns4Var.f381642e) && n51.f.a(this.f381643f, ns4Var.f381643f) && n51.f.a(java.lang.Long.valueOf(this.f381644g), java.lang.Long.valueOf(ns4Var.f381644g)) && n51.f.a(this.f381645h, ns4Var.f381645h) && n51.f.a(this.f381646i, ns4Var.f381646i) && n51.f.a(java.lang.Integer.valueOf(this.f381647m), java.lang.Integer.valueOf(ns4Var.f381647m)) && n51.f.a(java.lang.Integer.valueOf(this.f381648n), java.lang.Integer.valueOf(ns4Var.f381648n)) && n51.f.a(java.lang.Long.valueOf(this.f381649o), java.lang.Long.valueOf(ns4Var.f381649o)) && n51.f.a(this.f381650p, ns4Var.f381650p) && n51.f.a(this.f381651q, ns4Var.f381651q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ls4 ls4Var = this.f381641d;
            if (ls4Var != null) {
                fVar.i(2, ls4Var.computeSize());
                this.f381641d.writeFields(fVar);
            }
            java.lang.String str = this.f381642e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f381643f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f381644g);
            java.lang.String str3 = this.f381645h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f381646i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(9, this.f381647m);
            fVar.e(13, this.f381648n);
            fVar.h(14, this.f381649o);
            java.lang.String str5 = this.f381650p;
            if (str5 != null) {
                fVar.j(15, str5);
            }
            java.lang.String str6 = this.f381651q;
            if (str6 != null) {
                fVar.j(16, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ls4 ls4Var2 = this.f381641d;
            int i18 = ls4Var2 != null ? 0 + b36.f.i(2, ls4Var2.computeSize()) : 0;
            java.lang.String str7 = this.f381642e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f381643f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            int h17 = i18 + b36.f.h(5, this.f381644g);
            java.lang.String str9 = this.f381645h;
            if (str9 != null) {
                h17 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f381646i;
            if (str10 != null) {
                h17 += b36.f.j(7, str10);
            }
            int e17 = h17 + b36.f.e(9, this.f381647m) + b36.f.e(13, this.f381648n) + b36.f.h(14, this.f381649o);
            java.lang.String str11 = this.f381650p;
            if (str11 != null) {
                e17 += b36.f.j(15, str11);
            }
            java.lang.String str12 = this.f381651q;
            return str12 != null ? e17 + b36.f.j(16, str12) : e17;
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
        r45.ns4 ns4Var = (r45.ns4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ls4 ls4Var3 = new r45.ls4();
                    if (bArr != null && bArr.length > 0) {
                        ls4Var3.parseFrom(bArr);
                    }
                    ns4Var.f381641d = ls4Var3;
                }
                return 0;
            case 3:
                ns4Var.f381642e = aVar2.k(intValue);
                return 0;
            case 4:
                ns4Var.f381643f = aVar2.k(intValue);
                return 0;
            case 5:
                ns4Var.f381644g = aVar2.i(intValue);
                return 0;
            case 6:
                ns4Var.f381645h = aVar2.k(intValue);
                return 0;
            case 7:
                ns4Var.f381646i = aVar2.k(intValue);
                return 0;
            case 8:
            case 10:
            case 11:
            case 12:
            default:
                return -1;
            case 9:
                ns4Var.f381647m = aVar2.g(intValue);
                return 0;
            case 13:
                ns4Var.f381648n = aVar2.g(intValue);
                return 0;
            case 14:
                ns4Var.f381649o = aVar2.i(intValue);
                return 0;
            case 15:
                ns4Var.f381650p = aVar2.k(intValue);
                return 0;
            case 16:
                ns4Var.f381651q = aVar2.k(intValue);
                return 0;
        }
    }
}
