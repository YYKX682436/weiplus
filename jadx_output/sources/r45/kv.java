package r45;

/* loaded from: classes9.dex */
public class kv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378970d;

    /* renamed from: e, reason: collision with root package name */
    public int f378971e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378972f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378973g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f378974h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378975i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f378976m;

    /* renamed from: n, reason: collision with root package name */
    public r45.bn f378977n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kv)) {
            return false;
        }
        r45.kv kvVar = (r45.kv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378970d), java.lang.Integer.valueOf(kvVar.f378970d)) && n51.f.a(java.lang.Integer.valueOf(this.f378971e), java.lang.Integer.valueOf(kvVar.f378971e)) && n51.f.a(this.f378972f, kvVar.f378972f) && n51.f.a(this.f378973g, kvVar.f378973g) && n51.f.a(this.f378974h, kvVar.f378974h) && n51.f.a(this.f378975i, kvVar.f378975i) && n51.f.a(java.lang.Boolean.valueOf(this.f378976m), java.lang.Boolean.valueOf(kvVar.f378976m)) && n51.f.a(this.f378977n, kvVar.f378977n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378970d);
            fVar.e(2, this.f378971e);
            java.lang.String str = this.f378972f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f378973g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f378974h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f378975i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.a(7, this.f378976m);
            r45.bn bnVar = this.f378977n;
            if (bnVar != null) {
                fVar.i(8, bnVar.computeSize());
                this.f378977n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378970d) + 0 + b36.f.e(2, this.f378971e);
            java.lang.String str5 = this.f378972f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f378973g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f378974h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f378975i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int a17 = e17 + b36.f.a(7, this.f378976m);
            r45.bn bnVar2 = this.f378977n;
            return bnVar2 != null ? a17 + b36.f.i(8, bnVar2.computeSize()) : a17;
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
        r45.kv kvVar = (r45.kv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kvVar.f378970d = aVar2.g(intValue);
                return 0;
            case 2:
                kvVar.f378971e = aVar2.g(intValue);
                return 0;
            case 3:
                kvVar.f378972f = aVar2.k(intValue);
                return 0;
            case 4:
                kvVar.f378973g = aVar2.k(intValue);
                return 0;
            case 5:
                kvVar.f378974h = aVar2.k(intValue);
                return 0;
            case 6:
                kvVar.f378975i = aVar2.k(intValue);
                return 0;
            case 7:
                kvVar.f378976m = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.bn bnVar3 = new r45.bn();
                    if (bArr != null && bArr.length > 0) {
                        bnVar3.parseFrom(bArr);
                    }
                    kvVar.f378977n = bnVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
