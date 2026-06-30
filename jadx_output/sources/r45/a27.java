package r45;

/* loaded from: classes14.dex */
public class a27 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f369673d;

    /* renamed from: e, reason: collision with root package name */
    public long f369674e;

    /* renamed from: f, reason: collision with root package name */
    public int f369675f;

    /* renamed from: g, reason: collision with root package name */
    public r45.e37 f369676g;

    /* renamed from: h, reason: collision with root package name */
    public int f369677h;

    /* renamed from: i, reason: collision with root package name */
    public int f369678i;

    /* renamed from: m, reason: collision with root package name */
    public int f369679m;

    /* renamed from: n, reason: collision with root package name */
    public int f369680n;

    /* renamed from: o, reason: collision with root package name */
    public int f369681o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f369682p;

    /* renamed from: q, reason: collision with root package name */
    public long f369683q;

    /* renamed from: r, reason: collision with root package name */
    public r45.cu5 f369684r;

    /* renamed from: s, reason: collision with root package name */
    public int f369685s;

    /* renamed from: t, reason: collision with root package name */
    public int f369686t;

    /* renamed from: u, reason: collision with root package name */
    public int f369687u;

    /* renamed from: v, reason: collision with root package name */
    public int f369688v;

    /* renamed from: w, reason: collision with root package name */
    public int f369689w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a27)) {
            return false;
        }
        r45.a27 a27Var = (r45.a27) fVar;
        return n51.f.a(this.BaseResponse, a27Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f369673d), java.lang.Integer.valueOf(a27Var.f369673d)) && n51.f.a(java.lang.Long.valueOf(this.f369674e), java.lang.Long.valueOf(a27Var.f369674e)) && n51.f.a(java.lang.Integer.valueOf(this.f369675f), java.lang.Integer.valueOf(a27Var.f369675f)) && n51.f.a(this.f369676g, a27Var.f369676g) && n51.f.a(java.lang.Integer.valueOf(this.f369677h), java.lang.Integer.valueOf(a27Var.f369677h)) && n51.f.a(java.lang.Integer.valueOf(this.f369678i), java.lang.Integer.valueOf(a27Var.f369678i)) && n51.f.a(java.lang.Integer.valueOf(this.f369679m), java.lang.Integer.valueOf(a27Var.f369679m)) && n51.f.a(java.lang.Integer.valueOf(this.f369680n), java.lang.Integer.valueOf(a27Var.f369680n)) && n51.f.a(java.lang.Integer.valueOf(this.f369681o), java.lang.Integer.valueOf(a27Var.f369681o)) && n51.f.a(this.f369682p, a27Var.f369682p) && n51.f.a(java.lang.Long.valueOf(this.f369683q), java.lang.Long.valueOf(a27Var.f369683q)) && n51.f.a(this.f369684r, a27Var.f369684r) && n51.f.a(java.lang.Integer.valueOf(this.f369685s), java.lang.Integer.valueOf(a27Var.f369685s)) && n51.f.a(java.lang.Integer.valueOf(this.f369686t), java.lang.Integer.valueOf(a27Var.f369686t)) && n51.f.a(java.lang.Integer.valueOf(this.f369687u), java.lang.Integer.valueOf(a27Var.f369687u)) && n51.f.a(java.lang.Integer.valueOf(this.f369688v), java.lang.Integer.valueOf(a27Var.f369688v)) && n51.f.a(java.lang.Integer.valueOf(this.f369689w), java.lang.Integer.valueOf(a27Var.f369689w));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f369673d);
            fVar.h(3, this.f369674e);
            fVar.e(4, this.f369675f);
            r45.e37 e37Var = this.f369676g;
            if (e37Var != null) {
                fVar.i(5, e37Var.computeSize());
                this.f369676g.writeFields(fVar);
            }
            fVar.e(6, this.f369677h);
            fVar.e(7, this.f369678i);
            fVar.e(8, this.f369679m);
            fVar.e(9, this.f369680n);
            fVar.e(10, this.f369681o);
            r45.cu5 cu5Var = this.f369682p;
            if (cu5Var != null) {
                fVar.i(11, cu5Var.computeSize());
                this.f369682p.writeFields(fVar);
            }
            fVar.h(12, this.f369683q);
            r45.cu5 cu5Var2 = this.f369684r;
            if (cu5Var2 != null) {
                fVar.i(13, cu5Var2.computeSize());
                this.f369684r.writeFields(fVar);
            }
            fVar.e(14, this.f369685s);
            fVar.e(15, this.f369686t);
            fVar.e(16, this.f369687u);
            fVar.e(17, this.f369688v);
            fVar.e(18, this.f369689w);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f369673d) + b36.f.h(3, this.f369674e) + b36.f.e(4, this.f369675f);
            r45.e37 e37Var2 = this.f369676g;
            if (e37Var2 != null) {
                i18 += b36.f.i(5, e37Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(6, this.f369677h) + b36.f.e(7, this.f369678i) + b36.f.e(8, this.f369679m) + b36.f.e(9, this.f369680n) + b36.f.e(10, this.f369681o);
            r45.cu5 cu5Var3 = this.f369682p;
            if (cu5Var3 != null) {
                e17 += b36.f.i(11, cu5Var3.computeSize());
            }
            int h17 = e17 + b36.f.h(12, this.f369683q);
            r45.cu5 cu5Var4 = this.f369684r;
            if (cu5Var4 != null) {
                h17 += b36.f.i(13, cu5Var4.computeSize());
            }
            return h17 + b36.f.e(14, this.f369685s) + b36.f.e(15, this.f369686t) + b36.f.e(16, this.f369687u) + b36.f.e(17, this.f369688v) + b36.f.e(18, this.f369689w);
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
        r45.a27 a27Var = (r45.a27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    a27Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                a27Var.f369673d = aVar2.g(intValue);
                return 0;
            case 3:
                a27Var.f369674e = aVar2.i(intValue);
                return 0;
            case 4:
                a27Var.f369675f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.e37 e37Var3 = new r45.e37();
                    if (bArr2 != null && bArr2.length > 0) {
                        e37Var3.parseFrom(bArr2);
                    }
                    a27Var.f369676g = e37Var3;
                }
                return 0;
            case 6:
                a27Var.f369677h = aVar2.g(intValue);
                return 0;
            case 7:
                a27Var.f369678i = aVar2.g(intValue);
                return 0;
            case 8:
                a27Var.f369679m = aVar2.g(intValue);
                return 0;
            case 9:
                a27Var.f369680n = aVar2.g(intValue);
                return 0;
            case 10:
                a27Var.f369681o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    a27Var.f369682p = cu5Var5;
                }
                return 0;
            case 12:
                a27Var.f369683q = aVar2.i(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var6.b(bArr4);
                    }
                    a27Var.f369684r = cu5Var6;
                }
                return 0;
            case 14:
                a27Var.f369685s = aVar2.g(intValue);
                return 0;
            case 15:
                a27Var.f369686t = aVar2.g(intValue);
                return 0;
            case 16:
                a27Var.f369687u = aVar2.g(intValue);
                return 0;
            case 17:
                a27Var.f369688v = aVar2.g(intValue);
                return 0;
            case 18:
                a27Var.f369689w = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
