package r45;

/* loaded from: classes11.dex */
public class mm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380635d;

    /* renamed from: e, reason: collision with root package name */
    public int f380636e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380637f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380638g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380639h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f380640i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f380641m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380642n;

    /* renamed from: o, reason: collision with root package name */
    public int f380643o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.nf0 f380644p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mm)) {
            return false;
        }
        r45.mm mmVar = (r45.mm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380635d), java.lang.Integer.valueOf(mmVar.f380635d)) && n51.f.a(java.lang.Integer.valueOf(this.f380636e), java.lang.Integer.valueOf(mmVar.f380636e)) && n51.f.a(this.f380637f, mmVar.f380637f) && n51.f.a(this.f380638g, mmVar.f380638g) && n51.f.a(this.f380639h, mmVar.f380639h) && n51.f.a(this.f380640i, mmVar.f380640i) && n51.f.a(java.lang.Integer.valueOf(this.f380641m), java.lang.Integer.valueOf(mmVar.f380641m)) && n51.f.a(this.f380642n, mmVar.f380642n) && n51.f.a(java.lang.Integer.valueOf(this.f380643o), java.lang.Integer.valueOf(mmVar.f380643o)) && n51.f.a(this.f380644p, mmVar.f380644p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380640i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380635d);
            fVar.e(2, this.f380636e);
            java.lang.String str = this.f380637f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f380638g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f380639h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f380641m);
            java.lang.String str4 = this.f380642n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f380643o);
            bw5.nf0 nf0Var = this.f380644p;
            if (nf0Var != null) {
                fVar.i(10, nf0Var.computeSize());
                this.f380644p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380635d) + 0 + b36.f.e(2, this.f380636e);
            java.lang.String str5 = this.f380637f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f380638g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f380639h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int g17 = e17 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f380641m);
            java.lang.String str8 = this.f380642n;
            if (str8 != null) {
                g17 += b36.f.j(8, str8);
            }
            int e18 = g17 + b36.f.e(9, this.f380643o);
            bw5.nf0 nf0Var2 = this.f380644p;
            return nf0Var2 != null ? e18 + b36.f.i(10, nf0Var2.computeSize()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.mm mmVar = (r45.mm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mmVar.f380635d = aVar2.g(intValue);
                return 0;
            case 2:
                mmVar.f380636e = aVar2.g(intValue);
                return 0;
            case 3:
                mmVar.f380637f = aVar2.k(intValue);
                return 0;
            case 4:
                mmVar.f380638g = aVar2.k(intValue);
                return 0;
            case 5:
                mmVar.f380639h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.mm mmVar2 = new r45.mm();
                    if (bArr2 != null && bArr2.length > 0) {
                        mmVar2.parseFrom(bArr2);
                    }
                    mmVar.f380640i.add(mmVar2);
                }
                return 0;
            case 7:
                mmVar.f380641m = aVar2.g(intValue);
                return 0;
            case 8:
                mmVar.f380642n = aVar2.k(intValue);
                return 0;
            case 9:
                mmVar.f380643o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    bw5.nf0 nf0Var3 = new bw5.nf0();
                    if (bArr3 != null && bArr3.length > 0) {
                        nf0Var3.parseFrom(bArr3);
                    }
                    mmVar.f380644p = nf0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
