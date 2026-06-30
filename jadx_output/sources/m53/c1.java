package m53;

/* loaded from: classes8.dex */
public class c1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323593d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f323594e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323595f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323596g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323597h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.c1)) {
            return false;
        }
        m53.c1 c1Var = (m53.c1) fVar;
        return n51.f.a(this.f323593d, c1Var.f323593d) && n51.f.a(this.f323594e, c1Var.f323594e) && n51.f.a(this.f323595f, c1Var.f323595f) && n51.f.a(this.f323596g, c1Var.f323596g) && n51.f.a(this.f323597h, c1Var.f323597h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f323594e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f323593d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f323595f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f323596g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f323597h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f323593d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str6 = this.f323595f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f323596g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f323597h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        m53.c1 c1Var = (m53.c1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c1Var.f323593d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                c1Var.f323595f = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                c1Var.f323596g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            c1Var.f323597h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            m53.u4 u4Var = new m53.u4();
            if (bArr2 != null && bArr2.length > 0) {
                u4Var.parseFrom(bArr2);
            }
            c1Var.f323594e.add(u4Var);
        }
        return 0;
    }
}
