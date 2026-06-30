package d02;

/* loaded from: classes2.dex */
public class l extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f225333d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f225334e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f225335f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f225336g;

    /* renamed from: h, reason: collision with root package name */
    public int f225337h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f225338i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof d02.l)) {
            return false;
        }
        d02.l lVar = (d02.l) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f225333d), java.lang.Boolean.valueOf(lVar.f225333d)) && n51.f.a(this.f225334e, lVar.f225334e) && n51.f.a(this.f225335f, lVar.f225335f) && n51.f.a(this.f225336g, lVar.f225336g) && n51.f.a(java.lang.Integer.valueOf(this.f225337h), java.lang.Integer.valueOf(lVar.f225337h)) && n51.f.a(java.lang.Boolean.valueOf(this.f225338i), java.lang.Boolean.valueOf(lVar.f225338i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f225333d);
            java.lang.String str = this.f225334e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f225335f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f225336g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f225337h);
            fVar.a(6, this.f225338i);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f225333d) + 0;
            java.lang.String str4 = this.f225334e;
            if (str4 != null) {
                a17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f225335f;
            if (str5 != null) {
                a17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f225336g;
            if (str6 != null) {
                a17 += b36.f.j(4, str6);
            }
            return a17 + b36.f.e(5, this.f225337h) + b36.f.a(6, this.f225338i);
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
        d02.l lVar = (d02.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lVar.f225333d = aVar2.c(intValue);
                return 0;
            case 2:
                lVar.f225334e = aVar2.k(intValue);
                return 0;
            case 3:
                lVar.f225335f = aVar2.k(intValue);
                return 0;
            case 4:
                lVar.f225336g = aVar2.k(intValue);
                return 0;
            case 5:
                lVar.f225337h = aVar2.g(intValue);
                return 0;
            case 6:
                lVar.f225338i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
