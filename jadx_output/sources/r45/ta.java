package r45;

/* loaded from: classes7.dex */
public class ta extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386224d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386225e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386226f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f386227g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public long f386228h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ta)) {
            return false;
        }
        r45.ta taVar = (r45.ta) fVar;
        return n51.f.a(this.f386224d, taVar.f386224d) && n51.f.a(this.f386225e, taVar.f386225e) && n51.f.a(this.f386226f, taVar.f386226f) && n51.f.a(this.f386227g, taVar.f386227g) && n51.f.a(java.lang.Long.valueOf(this.f386228h), java.lang.Long.valueOf(taVar.f386228h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386224d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386225e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f386226f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, this.f386227g);
            fVar.h(5, this.f386228h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f386224d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f386225e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f386226f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.g(4, 1, this.f386227g) + b36.f.h(5, this.f386228h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386227g.clear();
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
        r45.ta taVar = (r45.ta) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            taVar.f386224d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            taVar.f386225e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            taVar.f386226f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            taVar.f386227g.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        taVar.f386228h = aVar2.i(intValue);
        return 0;
    }
}
