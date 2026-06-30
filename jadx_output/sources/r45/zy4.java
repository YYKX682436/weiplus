package r45;

/* loaded from: classes8.dex */
public class zy4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f392464d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f392465e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392466f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f392467g;

    /* renamed from: h, reason: collision with root package name */
    public int f392468h;

    /* renamed from: i, reason: collision with root package name */
    public int f392469i;

    /* renamed from: m, reason: collision with root package name */
    public int f392470m;

    /* renamed from: n, reason: collision with root package name */
    public int f392471n;

    /* renamed from: o, reason: collision with root package name */
    public int f392472o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f392473p;

    /* renamed from: q, reason: collision with root package name */
    public int f392474q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f392475r;

    static {
        new r45.zy4();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.zy4 parseFrom(byte[] bArr) {
        return (r45.zy4) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zy4)) {
            return false;
        }
        r45.zy4 zy4Var = (r45.zy4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f392464d), java.lang.Integer.valueOf(zy4Var.f392464d)) && n51.f.a(this.f392465e, zy4Var.f392465e) && n51.f.a(this.f392466f, zy4Var.f392466f) && n51.f.a(this.f392467g, zy4Var.f392467g) && n51.f.a(java.lang.Integer.valueOf(this.f392468h), java.lang.Integer.valueOf(zy4Var.f392468h)) && n51.f.a(java.lang.Integer.valueOf(this.f392469i), java.lang.Integer.valueOf(zy4Var.f392469i)) && n51.f.a(java.lang.Integer.valueOf(this.f392470m), java.lang.Integer.valueOf(zy4Var.f392470m)) && n51.f.a(java.lang.Integer.valueOf(this.f392471n), java.lang.Integer.valueOf(zy4Var.f392471n)) && n51.f.a(java.lang.Integer.valueOf(this.f392472o), java.lang.Integer.valueOf(zy4Var.f392472o)) && n51.f.a(this.f392473p, zy4Var.f392473p) && n51.f.a(java.lang.Integer.valueOf(this.f392474q), java.lang.Integer.valueOf(zy4Var.f392474q)) && n51.f.a(this.f392475r, zy4Var.f392475r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.zy4();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f392464d);
            com.tencent.mm.protobuf.g gVar = this.f392465e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            java.lang.String str = this.f392466f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.cu5 cu5Var = this.f392467g;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.computeSize());
                this.f392467g.writeFields(fVar);
            }
            fVar.e(5, this.f392468h);
            fVar.e(6, this.f392469i);
            fVar.e(7, this.f392470m);
            fVar.e(8, this.f392471n);
            fVar.e(9, this.f392472o);
            java.lang.String str2 = this.f392473p;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.e(11, this.f392474q);
            java.lang.String str3 = this.f392475r;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f392464d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f392465e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            java.lang.String str4 = this.f392466f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            r45.cu5 cu5Var2 = this.f392467g;
            if (cu5Var2 != null) {
                e17 += b36.f.i(4, cu5Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(5, this.f392468h) + b36.f.e(6, this.f392469i) + b36.f.e(7, this.f392470m) + b36.f.e(8, this.f392471n) + b36.f.e(9, this.f392472o);
            java.lang.String str5 = this.f392473p;
            if (str5 != null) {
                e18 += b36.f.j(10, str5);
            }
            int e19 = e18 + b36.f.e(11, this.f392474q);
            java.lang.String str6 = this.f392475r;
            return str6 != null ? e19 + b36.f.j(12, str6) : e19;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f392464d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f392465e = aVar2.d(intValue);
                return 0;
            case 3:
                this.f392466f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    this.f392467g = cu5Var3;
                }
                return 0;
            case 5:
                this.f392468h = aVar2.g(intValue);
                return 0;
            case 6:
                this.f392469i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f392470m = aVar2.g(intValue);
                return 0;
            case 8:
                this.f392471n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f392472o = aVar2.g(intValue);
                return 0;
            case 10:
                this.f392473p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f392474q = aVar2.g(intValue);
                return 0;
            case 12:
                this.f392475r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
