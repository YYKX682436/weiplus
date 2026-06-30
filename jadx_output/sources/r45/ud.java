package r45;

/* loaded from: classes11.dex */
public class ud extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387248d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387249e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387250f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387251g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f387252h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f387253i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f387254m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ud)) {
            return false;
        }
        r45.ud udVar = (r45.ud) fVar;
        return n51.f.a(this.f387248d, udVar.f387248d) && n51.f.a(this.f387249e, udVar.f387249e) && n51.f.a(this.f387250f, udVar.f387250f) && n51.f.a(this.f387251g, udVar.f387251g) && n51.f.a(this.f387252h, udVar.f387252h) && n51.f.a(this.f387253i, udVar.f387253i) && n51.f.a(this.f387254m, udVar.f387254m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387248d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387249e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f387250f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f387251g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f387252h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f387253i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            java.lang.String str7 = this.f387254m;
            if (str7 != null) {
                fVar.j(7, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f387248d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f387249e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f387250f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f387251g;
            if (str11 != null) {
                j17 += b36.f.j(4, str11);
            }
            java.lang.String str12 = this.f387252h;
            if (str12 != null) {
                j17 += b36.f.j(5, str12);
            }
            java.lang.String str13 = this.f387253i;
            if (str13 != null) {
                j17 += b36.f.j(6, str13);
            }
            java.lang.String str14 = this.f387254m;
            return str14 != null ? j17 + b36.f.j(7, str14) : j17;
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
        r45.ud udVar = (r45.ud) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                udVar.f387248d = aVar2.k(intValue);
                return 0;
            case 2:
                udVar.f387249e = aVar2.k(intValue);
                return 0;
            case 3:
                udVar.f387250f = aVar2.k(intValue);
                return 0;
            case 4:
                udVar.f387251g = aVar2.k(intValue);
                return 0;
            case 5:
                udVar.f387252h = aVar2.k(intValue);
                return 0;
            case 6:
                udVar.f387253i = aVar2.k(intValue);
                return 0;
            case 7:
                udVar.f387254m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
