package m53;

/* loaded from: classes4.dex */
public class i extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f323763d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323764e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323765f;

    /* renamed from: g, reason: collision with root package name */
    public int f323766g;

    /* renamed from: h, reason: collision with root package name */
    public m53.r3 f323767h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f323768i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f323770n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f323771o;

    /* renamed from: q, reason: collision with root package name */
    public int f323773q;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f323769m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f323772p = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.i)) {
            return false;
        }
        m53.i iVar = (m53.i) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f323763d), java.lang.Integer.valueOf(iVar.f323763d)) && n51.f.a(this.f323764e, iVar.f323764e) && n51.f.a(java.lang.Boolean.valueOf(this.f323765f), java.lang.Boolean.valueOf(iVar.f323765f)) && n51.f.a(java.lang.Integer.valueOf(this.f323766g), java.lang.Integer.valueOf(iVar.f323766g)) && n51.f.a(this.f323767h, iVar.f323767h) && n51.f.a(this.f323768i, iVar.f323768i) && n51.f.a(this.f323769m, iVar.f323769m) && n51.f.a(this.f323770n, iVar.f323770n) && n51.f.a(this.f323771o, iVar.f323771o) && n51.f.a(this.f323772p, iVar.f323772p) && n51.f.a(java.lang.Integer.valueOf(this.f323773q), java.lang.Integer.valueOf(iVar.f323773q));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323772p;
        java.util.LinkedList linkedList2 = this.f323769m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f323763d);
            java.lang.String str = this.f323764e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f323765f);
            fVar.e(4, this.f323766g);
            m53.r3 r3Var = this.f323767h;
            if (r3Var != null) {
                fVar.i(5, r3Var.computeSize());
                this.f323767h.writeFields(fVar);
            }
            java.lang.String str2 = this.f323768i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.g(7, 8, linkedList2);
            java.lang.String str3 = this.f323770n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f323771o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.g(10, 8, linkedList);
            fVar.e(11, this.f323773q);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f323763d) + 0;
            java.lang.String str5 = this.f323764e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            int a17 = e17 + b36.f.a(3, this.f323765f) + b36.f.e(4, this.f323766g);
            m53.r3 r3Var2 = this.f323767h;
            if (r3Var2 != null) {
                a17 += b36.f.i(5, r3Var2.computeSize());
            }
            java.lang.String str6 = this.f323768i;
            if (str6 != null) {
                a17 += b36.f.j(6, str6);
            }
            int g17 = a17 + b36.f.g(7, 8, linkedList2);
            java.lang.String str7 = this.f323770n;
            if (str7 != null) {
                g17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f323771o;
            if (str8 != null) {
                g17 += b36.f.j(9, str8);
            }
            return g17 + b36.f.g(10, 8, linkedList) + b36.f.e(11, this.f323773q);
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
        m53.i iVar = (m53.i) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                iVar.f323763d = aVar2.g(intValue);
                return 0;
            case 2:
                iVar.f323764e = aVar2.k(intValue);
                return 0;
            case 3:
                iVar.f323765f = aVar2.c(intValue);
                return 0;
            case 4:
                iVar.f323766g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    m53.r3 r3Var3 = new m53.r3();
                    if (bArr2 != null && bArr2.length > 0) {
                        r3Var3.parseFrom(bArr2);
                    }
                    iVar.f323767h = r3Var3;
                }
                return 0;
            case 6:
                iVar.f323768i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    m53.f0 f0Var = new m53.f0();
                    if (bArr3 != null && bArr3.length > 0) {
                        f0Var.parseFrom(bArr3);
                    }
                    iVar.f323769m.add(f0Var);
                }
                return 0;
            case 8:
                iVar.f323770n = aVar2.k(intValue);
                return 0;
            case 9:
                iVar.f323771o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    m53.z zVar = new m53.z();
                    if (bArr4 != null && bArr4.length > 0) {
                        zVar.parseFrom(bArr4);
                    }
                    iVar.f323772p.add(zVar);
                }
                return 0;
            case 11:
                iVar.f323773q = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
