package r45;

/* loaded from: classes11.dex */
public class u53 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387047d;

    /* renamed from: f, reason: collision with root package name */
    public r45.c16 f387049f;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387053m;

    /* renamed from: n, reason: collision with root package name */
    public long f387054n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f387048e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f387050g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f387051h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f387052i = false;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u53)) {
            return false;
        }
        r45.u53 u53Var = (r45.u53) fVar;
        return n51.f.a(this.f387047d, u53Var.f387047d) && n51.f.a(this.f387048e, u53Var.f387048e) && n51.f.a(this.f387049f, u53Var.f387049f) && n51.f.a(this.f387050g, u53Var.f387050g) && n51.f.a(java.lang.Boolean.valueOf(this.f387051h), java.lang.Boolean.valueOf(u53Var.f387051h)) && n51.f.a(java.lang.Boolean.valueOf(this.f387052i), java.lang.Boolean.valueOf(u53Var.f387052i)) && n51.f.a(this.f387053m, u53Var.f387053m) && n51.f.a(java.lang.Long.valueOf(this.f387054n), java.lang.Long.valueOf(u53Var.f387054n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387050g;
        java.util.LinkedList linkedList2 = this.f387048e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387047d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList2);
            r45.c16 c16Var = this.f387049f;
            if (c16Var != null) {
                fVar.i(3, c16Var.computeSize());
                this.f387049f.writeFields(fVar);
            }
            fVar.g(4, 8, linkedList);
            fVar.a(5, this.f387051h);
            fVar.a(6, this.f387052i);
            java.lang.String str2 = this.f387053m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.h(8, this.f387054n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f387047d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.g(2, 8, linkedList2);
            r45.c16 c16Var2 = this.f387049f;
            if (c16Var2 != null) {
                j17 += b36.f.i(3, c16Var2.computeSize());
            }
            int g17 = j17 + b36.f.g(4, 8, linkedList) + b36.f.a(5, this.f387051h) + b36.f.a(6, this.f387052i);
            java.lang.String str4 = this.f387053m;
            if (str4 != null) {
                g17 += b36.f.j(7, str4);
            }
            return g17 + b36.f.h(8, this.f387054n);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.u53 u53Var = (r45.u53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                u53Var.f387047d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.c16 c16Var3 = new r45.c16();
                    if (bArr2 != null && bArr2.length > 0) {
                        c16Var3.parseFrom(bArr2);
                    }
                    u53Var.f387048e.add(c16Var3);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.c16 c16Var4 = new r45.c16();
                    if (bArr3 != null && bArr3.length > 0) {
                        c16Var4.parseFrom(bArr3);
                    }
                    u53Var.f387049f = c16Var4;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.t53 t53Var = new r45.t53();
                    if (bArr4 != null && bArr4.length > 0) {
                        t53Var.parseFrom(bArr4);
                    }
                    u53Var.f387050g.add(t53Var);
                }
                return 0;
            case 5:
                u53Var.f387051h = aVar2.c(intValue);
                return 0;
            case 6:
                u53Var.f387052i = aVar2.c(intValue);
                return 0;
            case 7:
                u53Var.f387053m = aVar2.k(intValue);
                return 0;
            case 8:
                u53Var.f387054n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
