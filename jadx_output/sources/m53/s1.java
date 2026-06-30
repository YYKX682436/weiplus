package m53;

/* loaded from: classes8.dex */
public class s1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f324042d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324043e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f324044f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f324045g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f324046h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f324047i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f324048m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f324049n;

    /* renamed from: o, reason: collision with root package name */
    public m53.h f324050o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.s1)) {
            return false;
        }
        m53.s1 s1Var = (m53.s1) fVar;
        return n51.f.a(this.f324042d, s1Var.f324042d) && n51.f.a(this.f324043e, s1Var.f324043e) && n51.f.a(this.f324044f, s1Var.f324044f) && n51.f.a(this.f324045g, s1Var.f324045g) && n51.f.a(this.f324046h, s1Var.f324046h) && n51.f.a(this.f324047i, s1Var.f324047i) && n51.f.a(this.f324048m, s1Var.f324048m) && n51.f.a(this.f324049n, s1Var.f324049n) && n51.f.a(this.f324050o, s1Var.f324050o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f324044f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f324042d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f324043e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 1, linkedList);
            java.lang.String str3 = this.f324045g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f324046h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f324047i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f324048m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f324049n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            m53.h hVar = this.f324050o;
            if (hVar != null) {
                fVar.i(10, hVar.computeSize());
                this.f324050o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f324042d;
            int j17 = str8 != null ? 0 + b36.f.j(1, str8) : 0;
            java.lang.String str9 = this.f324043e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int g17 = j17 + b36.f.g(3, 1, linkedList);
            java.lang.String str10 = this.f324045g;
            if (str10 != null) {
                g17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f324046h;
            if (str11 != null) {
                g17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f324047i;
            if (str12 != null) {
                g17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f324048m;
            if (str13 != null) {
                g17 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f324049n;
            if (str14 != null) {
                g17 += b36.f.j(9, str14);
            }
            m53.h hVar2 = this.f324050o;
            return hVar2 != null ? g17 + b36.f.i(10, hVar2.computeSize()) : g17;
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
        m53.s1 s1Var = (m53.s1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                s1Var.f324042d = aVar2.k(intValue);
                return 0;
            case 2:
                s1Var.f324043e = aVar2.k(intValue);
                return 0;
            case 3:
                s1Var.f324044f.add(aVar2.k(intValue));
                return 0;
            case 4:
                s1Var.f324045g = aVar2.k(intValue);
                return 0;
            case 5:
                s1Var.f324046h = aVar2.k(intValue);
                return 0;
            case 6:
                s1Var.f324047i = aVar2.k(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                s1Var.f324048m = aVar2.k(intValue);
                return 0;
            case 9:
                s1Var.f324049n = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    m53.h hVar3 = new m53.h();
                    if (bArr2 != null && bArr2.length > 0) {
                        hVar3.parseFrom(bArr2);
                    }
                    s1Var.f324050o = hVar3;
                }
                return 0;
        }
    }
}
