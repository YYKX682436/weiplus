package r45;

/* loaded from: classes10.dex */
public class qz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384381d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384382e;

    /* renamed from: f, reason: collision with root package name */
    public long f384383f;

    /* renamed from: g, reason: collision with root package name */
    public long f384384g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f384385h;

    /* renamed from: i, reason: collision with root package name */
    public long f384386i;

    /* renamed from: m, reason: collision with root package name */
    public long f384387m;

    /* renamed from: n, reason: collision with root package name */
    public long f384388n;

    /* renamed from: o, reason: collision with root package name */
    public long f384389o;

    /* renamed from: p, reason: collision with root package name */
    public int f384390p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f384391q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f384392r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qz6)) {
            return false;
        }
        r45.qz6 qz6Var = (r45.qz6) fVar;
        return n51.f.a(this.f384381d, qz6Var.f384381d) && n51.f.a(this.f384382e, qz6Var.f384382e) && n51.f.a(java.lang.Long.valueOf(this.f384383f), java.lang.Long.valueOf(qz6Var.f384383f)) && n51.f.a(java.lang.Long.valueOf(this.f384384g), java.lang.Long.valueOf(qz6Var.f384384g)) && n51.f.a(this.f384385h, qz6Var.f384385h) && n51.f.a(java.lang.Long.valueOf(this.f384386i), java.lang.Long.valueOf(qz6Var.f384386i)) && n51.f.a(java.lang.Long.valueOf(this.f384387m), java.lang.Long.valueOf(qz6Var.f384387m)) && n51.f.a(java.lang.Long.valueOf(this.f384388n), java.lang.Long.valueOf(qz6Var.f384388n)) && n51.f.a(java.lang.Long.valueOf(this.f384389o), java.lang.Long.valueOf(qz6Var.f384389o)) && n51.f.a(java.lang.Integer.valueOf(this.f384390p), java.lang.Integer.valueOf(qz6Var.f384390p)) && n51.f.a(this.f384391q, qz6Var.f384391q) && n51.f.a(this.f384392r, qz6Var.f384392r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384381d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f384382e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f384383f);
            fVar.h(4, this.f384384g);
            java.lang.String str3 = this.f384385h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f384386i);
            fVar.h(7, this.f384387m);
            fVar.h(8, this.f384388n);
            fVar.h(9, this.f384389o);
            fVar.e(10, this.f384390p);
            java.lang.String str4 = this.f384391q;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f384392r;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f384381d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f384382e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            int h17 = j17 + b36.f.h(3, this.f384383f) + b36.f.h(4, this.f384384g);
            java.lang.String str8 = this.f384385h;
            if (str8 != null) {
                h17 += b36.f.j(5, str8);
            }
            int h18 = h17 + b36.f.h(6, this.f384386i) + b36.f.h(7, this.f384387m) + b36.f.h(8, this.f384388n) + b36.f.h(9, this.f384389o) + b36.f.e(10, this.f384390p);
            java.lang.String str9 = this.f384391q;
            if (str9 != null) {
                h18 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f384392r;
            return str10 != null ? h18 + b36.f.j(12, str10) : h18;
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
        r45.qz6 qz6Var = (r45.qz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qz6Var.f384381d = aVar2.k(intValue);
                return 0;
            case 2:
                qz6Var.f384382e = aVar2.k(intValue);
                return 0;
            case 3:
                qz6Var.f384383f = aVar2.i(intValue);
                return 0;
            case 4:
                qz6Var.f384384g = aVar2.i(intValue);
                return 0;
            case 5:
                qz6Var.f384385h = aVar2.k(intValue);
                return 0;
            case 6:
                qz6Var.f384386i = aVar2.i(intValue);
                return 0;
            case 7:
                qz6Var.f384387m = aVar2.i(intValue);
                return 0;
            case 8:
                qz6Var.f384388n = aVar2.i(intValue);
                return 0;
            case 9:
                qz6Var.f384389o = aVar2.i(intValue);
                return 0;
            case 10:
                qz6Var.f384390p = aVar2.g(intValue);
                return 0;
            case 11:
                qz6Var.f384391q = aVar2.k(intValue);
                return 0;
            case 12:
                qz6Var.f384392r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
