package o33;

/* loaded from: classes2.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f342732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f342733e;

    /* renamed from: f, reason: collision with root package name */
    public int f342734f;

    /* renamed from: g, reason: collision with root package name */
    public int f342735g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f342736h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof o33.e)) {
            return false;
        }
        o33.e eVar = (o33.e) fVar;
        return n51.f.a(this.f342732d, eVar.f342732d) && n51.f.a(this.f342733e, eVar.f342733e) && n51.f.a(java.lang.Integer.valueOf(this.f342734f), java.lang.Integer.valueOf(eVar.f342734f)) && n51.f.a(java.lang.Integer.valueOf(this.f342735g), java.lang.Integer.valueOf(eVar.f342735g)) && n51.f.a(this.f342736h, eVar.f342736h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f342732d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f342733e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f342734f);
            fVar.e(4, this.f342735g);
            java.lang.String str3 = this.f342736h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f342732d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f342733e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f342734f) + b36.f.e(4, this.f342735g);
            java.lang.String str6 = this.f342736h;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        o33.e eVar = (o33.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            eVar.f342732d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            eVar.f342733e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            eVar.f342734f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            eVar.f342735g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        eVar.f342736h = aVar2.k(intValue);
        return 0;
    }
}
