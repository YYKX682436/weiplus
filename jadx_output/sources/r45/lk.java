package r45;

/* loaded from: classes11.dex */
public class lk extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f379533d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379534e;

    /* renamed from: f, reason: collision with root package name */
    public int f379535f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379536g;

    /* renamed from: h, reason: collision with root package name */
    public int f379537h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379538i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f379539m;

    /* renamed from: n, reason: collision with root package name */
    public r45.g77 f379540n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lk)) {
            return false;
        }
        r45.lk lkVar = (r45.lk) fVar;
        return n51.f.a(this.f379533d, lkVar.f379533d) && n51.f.a(this.f379534e, lkVar.f379534e) && n51.f.a(java.lang.Integer.valueOf(this.f379535f), java.lang.Integer.valueOf(lkVar.f379535f)) && n51.f.a(this.f379536g, lkVar.f379536g) && n51.f.a(java.lang.Integer.valueOf(this.f379537h), java.lang.Integer.valueOf(lkVar.f379537h)) && n51.f.a(this.f379538i, lkVar.f379538i) && n51.f.a(java.lang.Boolean.valueOf(this.f379539m), java.lang.Boolean.valueOf(lkVar.f379539m)) && n51.f.a(this.f379540n, lkVar.f379540n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f379533d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f379534e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f379535f);
            java.lang.String str3 = this.f379536g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f379537h);
            java.lang.String str4 = this.f379538i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.a(7, this.f379539m);
            r45.g77 g77Var = this.f379540n;
            if (g77Var != null) {
                fVar.i(8, g77Var.computeSize());
                this.f379540n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f379533d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f379534e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f379535f);
            java.lang.String str7 = this.f379536g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            int e18 = e17 + b36.f.e(5, this.f379537h);
            java.lang.String str8 = this.f379538i;
            if (str8 != null) {
                e18 += b36.f.j(6, str8);
            }
            int a17 = e18 + b36.f.a(7, this.f379539m);
            r45.g77 g77Var2 = this.f379540n;
            return g77Var2 != null ? a17 + b36.f.i(8, g77Var2.computeSize()) : a17;
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
        r45.lk lkVar = (r45.lk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lkVar.f379533d = aVar2.k(intValue);
                return 0;
            case 2:
                lkVar.f379534e = aVar2.k(intValue);
                return 0;
            case 3:
                lkVar.f379535f = aVar2.g(intValue);
                return 0;
            case 4:
                lkVar.f379536g = aVar2.k(intValue);
                return 0;
            case 5:
                lkVar.f379537h = aVar2.g(intValue);
                return 0;
            case 6:
                lkVar.f379538i = aVar2.k(intValue);
                return 0;
            case 7:
                lkVar.f379539m = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.g77 g77Var3 = new r45.g77();
                    if (bArr != null && bArr.length > 0) {
                        g77Var3.parseFrom(bArr);
                    }
                    lkVar.f379540n = g77Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
