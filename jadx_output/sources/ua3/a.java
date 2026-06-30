package ua3;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f425969d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f425970e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public double f425971f;

    /* renamed from: g, reason: collision with root package name */
    public double f425972g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f425973h;

    /* renamed from: i, reason: collision with root package name */
    public long f425974i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof ua3.a)) {
            return false;
        }
        ua3.a aVar = (ua3.a) fVar;
        return n51.f.a(this.f425969d, aVar.f425969d) && n51.f.a(this.f425970e, aVar.f425970e) && n51.f.a(java.lang.Double.valueOf(this.f425971f), java.lang.Double.valueOf(aVar.f425971f)) && n51.f.a(java.lang.Double.valueOf(this.f425972g), java.lang.Double.valueOf(aVar.f425972g)) && n51.f.a(this.f425973h, aVar.f425973h) && n51.f.a(java.lang.Long.valueOf(this.f425974i), java.lang.Long.valueOf(aVar.f425974i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f425969d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, this.f425970e);
            fVar.c(3, this.f425971f);
            fVar.c(4, this.f425972g);
            java.lang.String str2 = this.f425973h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f425974i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f425969d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.g(2, 1, this.f425970e) + b36.f.c(3, this.f425971f) + b36.f.c(4, this.f425972g);
            java.lang.String str4 = this.f425973h;
            if (str4 != null) {
                j17 += b36.f.j(5, str4);
            }
            return j17 + b36.f.h(6, this.f425974i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f425970e.clear();
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
        ua3.a aVar3 = (ua3.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aVar3.f425969d = aVar2.k(intValue);
                return 0;
            case 2:
                aVar3.f425970e.add(aVar2.k(intValue));
                return 0;
            case 3:
                aVar3.f425971f = aVar2.e(intValue);
                return 0;
            case 4:
                aVar3.f425972g = aVar2.e(intValue);
                return 0;
            case 5:
                aVar3.f425973h = aVar2.k(intValue);
                return 0;
            case 6:
                aVar3.f425974i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
