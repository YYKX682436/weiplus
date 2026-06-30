package p33;

/* loaded from: classes2.dex */
public class e extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f351532d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f351533e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f351534f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f351535g;

    /* renamed from: h, reason: collision with root package name */
    public int f351536h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof p33.e)) {
            return false;
        }
        p33.e eVar = (p33.e) fVar;
        return n51.f.a(this.f351532d, eVar.f351532d) && n51.f.a(this.f351533e, eVar.f351533e) && n51.f.a(this.f351534f, eVar.f351534f) && n51.f.a(this.f351535g, eVar.f351535g) && n51.f.a(java.lang.Integer.valueOf(this.f351536h), java.lang.Integer.valueOf(eVar.f351536h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f351532d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f351533e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f351534f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f351535g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f351536h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f351532d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f351533e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f351534f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f351535g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.e(5, this.f351536h);
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
        p33.e eVar = (p33.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            eVar.f351532d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            eVar.f351533e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            eVar.f351534f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            eVar.f351535g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        eVar.f351536h = aVar2.g(intValue);
        return 0;
    }
}
