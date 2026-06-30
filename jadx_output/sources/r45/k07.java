package r45;

/* loaded from: classes14.dex */
public class k07 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378276d;

    /* renamed from: e, reason: collision with root package name */
    public long f378277e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378278f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f378279g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public long f378280h;

    /* renamed from: i, reason: collision with root package name */
    public int f378281i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378282m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k07)) {
            return false;
        }
        r45.k07 k07Var = (r45.k07) fVar;
        return n51.f.a(this.f378276d, k07Var.f378276d) && n51.f.a(java.lang.Long.valueOf(this.f378277e), java.lang.Long.valueOf(k07Var.f378277e)) && n51.f.a(this.f378278f, k07Var.f378278f) && n51.f.a(this.f378279g, k07Var.f378279g) && n51.f.a(java.lang.Long.valueOf(this.f378280h), java.lang.Long.valueOf(k07Var.f378280h)) && n51.f.a(java.lang.Integer.valueOf(this.f378281i), java.lang.Integer.valueOf(k07Var.f378281i)) && n51.f.a(this.f378282m, k07Var.f378282m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378276d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f378277e);
            java.lang.String str2 = this.f378278f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, this.f378279g);
            fVar.h(5, this.f378280h);
            fVar.e(6, this.f378281i);
            java.lang.String str3 = this.f378282m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f378276d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.h(2, this.f378277e);
            java.lang.String str5 = this.f378278f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            int g17 = j17 + b36.f.g(4, 8, this.f378279g) + b36.f.h(5, this.f378280h) + b36.f.e(6, this.f378281i);
            java.lang.String str6 = this.f378282m;
            return str6 != null ? g17 + b36.f.j(7, str6) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f378279g.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.k07 k07Var = (r45.k07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                k07Var.f378276d = aVar2.k(intValue);
                return 0;
            case 2:
                k07Var.f378277e = aVar2.i(intValue);
                return 0;
            case 3:
                k07Var.f378278f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.z07 z07Var = new r45.z07();
                    if (bArr2 != null && bArr2.length > 0) {
                        z07Var.parseFrom(bArr2);
                    }
                    k07Var.f378279g.add(z07Var);
                }
                return 0;
            case 5:
                k07Var.f378280h = aVar2.i(intValue);
                return 0;
            case 6:
                k07Var.f378281i = aVar2.g(intValue);
                return 0;
            case 7:
                k07Var.f378282m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
