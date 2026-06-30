package r45;

/* loaded from: classes8.dex */
public class md extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380369d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380370e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f380371f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f380372g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380373h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380374i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f380375m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.md)) {
            return false;
        }
        r45.md mdVar = (r45.md) fVar;
        return n51.f.a(this.f380369d, mdVar.f380369d) && n51.f.a(this.f380370e, mdVar.f380370e) && n51.f.a(this.f380371f, mdVar.f380371f) && n51.f.a(java.lang.Boolean.valueOf(this.f380372g), java.lang.Boolean.valueOf(mdVar.f380372g)) && n51.f.a(this.f380373h, mdVar.f380373h) && n51.f.a(this.f380374i, mdVar.f380374i) && n51.f.a(this.f380375m, mdVar.f380375m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380369d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380370e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f380371f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f380372g);
            java.lang.String str4 = this.f380373h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f380374i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f380375m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f380369d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f380370e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f380371f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            int a17 = j17 + b36.f.a(4, this.f380372g);
            java.lang.String str10 = this.f380373h;
            if (str10 != null) {
                a17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f380374i;
            if (str11 != null) {
                a17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f380375m;
            return str12 != null ? a17 + b36.f.j(7, str12) : a17;
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
        r45.md mdVar = (r45.md) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mdVar.f380369d = aVar2.k(intValue);
                return 0;
            case 2:
                mdVar.f380370e = aVar2.k(intValue);
                return 0;
            case 3:
                mdVar.f380371f = aVar2.k(intValue);
                return 0;
            case 4:
                mdVar.f380372g = aVar2.c(intValue);
                return 0;
            case 5:
                mdVar.f380373h = aVar2.k(intValue);
                return 0;
            case 6:
                mdVar.f380374i = aVar2.k(intValue);
                return 0;
            case 7:
                mdVar.f380375m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
