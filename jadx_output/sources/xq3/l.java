package xq3;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456097d;

    /* renamed from: e, reason: collision with root package name */
    public int f456098e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456099f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f456100g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public int f456101h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.l)) {
            return false;
        }
        xq3.l lVar = (xq3.l) fVar;
        return n51.f.a(this.f456097d, lVar.f456097d) && n51.f.a(java.lang.Integer.valueOf(this.f456098e), java.lang.Integer.valueOf(lVar.f456098e)) && n51.f.a(this.f456099f, lVar.f456099f) && n51.f.a(this.f456100g, lVar.f456100g) && n51.f.a(java.lang.Integer.valueOf(this.f456101h), java.lang.Integer.valueOf(lVar.f456101h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456097d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f456098e);
            java.lang.String str2 = this.f456099f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, this.f456100g);
            fVar.e(5, this.f456101h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f456097d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f456098e);
            java.lang.String str4 = this.f456099f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.g(4, 8, this.f456100g) + b36.f.e(5, this.f456101h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456100g.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        xq3.l lVar = (xq3.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lVar.f456097d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            lVar.f456098e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            lVar.f456099f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            lVar.f456101h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            xq3.e eVar = new xq3.e();
            if (bArr2 != null && bArr2.length > 0) {
                eVar.parseFrom(bArr2);
            }
            lVar.f456100g.add(eVar);
        }
        return 0;
    }
}
