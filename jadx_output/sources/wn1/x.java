package wn1;

/* loaded from: classes11.dex */
public class x extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f447504d;

    /* renamed from: e, reason: collision with root package name */
    public long f447505e;

    /* renamed from: f, reason: collision with root package name */
    public long f447506f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f447507g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f447508h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f447509i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.x)) {
            return false;
        }
        wn1.x xVar = (wn1.x) fVar;
        return n51.f.a(this.f447504d, xVar.f447504d) && n51.f.a(java.lang.Long.valueOf(this.f447505e), java.lang.Long.valueOf(xVar.f447505e)) && n51.f.a(java.lang.Long.valueOf(this.f447506f), java.lang.Long.valueOf(xVar.f447506f)) && n51.f.a(this.f447507g, xVar.f447507g) && n51.f.a(this.f447508h, xVar.f447508h) && n51.f.a(this.f447509i, xVar.f447509i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f447509i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f447504d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f447505e);
            fVar.h(3, this.f447506f);
            java.lang.String str2 = this.f447507g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f447508h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.g(6, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f447504d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.h(2, this.f447505e) + b36.f.h(3, this.f447506f);
            java.lang.String str5 = this.f447507g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f447508h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            return j17 + b36.f.g(6, 1, linkedList);
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
        wn1.x xVar = (wn1.x) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                xVar.f447504d = aVar2.k(intValue);
                return 0;
            case 2:
                xVar.f447505e = aVar2.i(intValue);
                return 0;
            case 3:
                xVar.f447506f = aVar2.i(intValue);
                return 0;
            case 4:
                xVar.f447507g = aVar2.k(intValue);
                return 0;
            case 5:
                xVar.f447508h = aVar2.k(intValue);
                return 0;
            case 6:
                xVar.f447509i.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
