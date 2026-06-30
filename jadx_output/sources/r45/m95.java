package r45;

/* loaded from: classes2.dex */
public class m95 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380278d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380279e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f380280f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f380281g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f380282h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380283i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f380284m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m95)) {
            return false;
        }
        r45.m95 m95Var = (r45.m95) fVar;
        return n51.f.a(this.f380278d, m95Var.f380278d) && n51.f.a(this.f380279e, m95Var.f380279e) && n51.f.a(this.f380280f, m95Var.f380280f) && n51.f.a(this.f380281g, m95Var.f380281g) && n51.f.a(this.f380282h, m95Var.f380282h) && n51.f.a(this.f380283i, m95Var.f380283i) && n51.f.a(java.lang.Boolean.valueOf(this.f380284m), java.lang.Boolean.valueOf(m95Var.f380284m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380282h;
        java.util.LinkedList linkedList2 = this.f380281g;
        java.util.LinkedList linkedList3 = this.f380280f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380278d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380279e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 2, linkedList2);
            fVar.g(5, 2, linkedList);
            java.lang.String str3 = this.f380283i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.a(7, this.f380284m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f380278d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f380279e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 2, linkedList2) + b36.f.g(5, 2, linkedList);
            java.lang.String str6 = this.f380283i;
            if (str6 != null) {
                g17 += b36.f.j(6, str6);
            }
            return g17 + b36.f.a(7, this.f380284m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.m95 m95Var = (r45.m95) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m95Var.f380278d = aVar2.k(intValue);
                return 0;
            case 2:
                m95Var.f380279e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.am6 am6Var = new r45.am6();
                    if (bArr2 != null && bArr2.length > 0) {
                        am6Var.parseFrom(bArr2);
                    }
                    m95Var.f380280f.add(am6Var);
                }
                return 0;
            case 4:
                m95Var.f380281g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 5:
                m95Var.f380282h.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 6:
                m95Var.f380283i = aVar2.k(intValue);
                return 0;
            case 7:
                m95Var.f380284m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
