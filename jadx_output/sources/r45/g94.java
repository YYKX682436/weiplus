package r45;

/* loaded from: classes10.dex */
public class g94 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f375016d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375017e;

    /* renamed from: f, reason: collision with root package name */
    public int f375018f;

    /* renamed from: g, reason: collision with root package name */
    public r45.e94 f375019g;

    /* renamed from: h, reason: collision with root package name */
    public r45.f94 f375020h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375021i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f375022m;

    /* renamed from: n, reason: collision with root package name */
    public int f375023n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375024o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g94)) {
            return false;
        }
        r45.g94 g94Var = (r45.g94) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f375016d), java.lang.Long.valueOf(g94Var.f375016d)) && n51.f.a(this.f375017e, g94Var.f375017e) && n51.f.a(java.lang.Integer.valueOf(this.f375018f), java.lang.Integer.valueOf(g94Var.f375018f)) && n51.f.a(this.f375019g, g94Var.f375019g) && n51.f.a(this.f375020h, g94Var.f375020h) && n51.f.a(this.f375021i, g94Var.f375021i) && n51.f.a(java.lang.Boolean.valueOf(this.f375022m), java.lang.Boolean.valueOf(g94Var.f375022m)) && n51.f.a(java.lang.Integer.valueOf(this.f375023n), java.lang.Integer.valueOf(g94Var.f375023n)) && n51.f.a(this.f375024o, g94Var.f375024o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f375016d);
            java.lang.String str = this.f375017e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f375018f);
            r45.e94 e94Var = this.f375019g;
            if (e94Var != null) {
                fVar.i(4, e94Var.computeSize());
                this.f375019g.writeFields(fVar);
            }
            r45.f94 f94Var = this.f375020h;
            if (f94Var != null) {
                fVar.i(5, f94Var.computeSize());
                this.f375020h.writeFields(fVar);
            }
            java.lang.String str2 = this.f375021i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.a(7, this.f375022m);
            fVar.e(8, this.f375023n);
            java.lang.String str3 = this.f375024o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f375016d) + 0;
            java.lang.String str4 = this.f375017e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            int e17 = h17 + b36.f.e(3, this.f375018f);
            r45.e94 e94Var2 = this.f375019g;
            if (e94Var2 != null) {
                e17 += b36.f.i(4, e94Var2.computeSize());
            }
            r45.f94 f94Var2 = this.f375020h;
            if (f94Var2 != null) {
                e17 += b36.f.i(5, f94Var2.computeSize());
            }
            java.lang.String str5 = this.f375021i;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            int a17 = e17 + b36.f.a(7, this.f375022m) + b36.f.e(8, this.f375023n);
            java.lang.String str6 = this.f375024o;
            return str6 != null ? a17 + b36.f.j(9, str6) : a17;
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
        r45.g94 g94Var = (r45.g94) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                g94Var.f375016d = aVar2.i(intValue);
                return 0;
            case 2:
                g94Var.f375017e = aVar2.k(intValue);
                return 0;
            case 3:
                g94Var.f375018f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.e94 e94Var3 = new r45.e94();
                    if (bArr != null && bArr.length > 0) {
                        e94Var3.parseFrom(bArr);
                    }
                    g94Var.f375019g = e94Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.f94 f94Var3 = new r45.f94();
                    if (bArr2 != null && bArr2.length > 0) {
                        f94Var3.parseFrom(bArr2);
                    }
                    g94Var.f375020h = f94Var3;
                }
                return 0;
            case 6:
                g94Var.f375021i = aVar2.k(intValue);
                return 0;
            case 7:
                g94Var.f375022m = aVar2.c(intValue);
                return 0;
            case 8:
                g94Var.f375023n = aVar2.g(intValue);
                return 0;
            case 9:
                g94Var.f375024o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
