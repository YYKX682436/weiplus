package r45;

/* loaded from: classes7.dex */
public class mt extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380816d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380817e;

    /* renamed from: f, reason: collision with root package name */
    public int f380818f;

    /* renamed from: g, reason: collision with root package name */
    public int f380819g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380820h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380821i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mt)) {
            return false;
        }
        r45.mt mtVar = (r45.mt) fVar;
        return n51.f.a(this.f380816d, mtVar.f380816d) && n51.f.a(this.f380817e, mtVar.f380817e) && n51.f.a(java.lang.Integer.valueOf(this.f380818f), java.lang.Integer.valueOf(mtVar.f380818f)) && n51.f.a(java.lang.Integer.valueOf(this.f380819g), java.lang.Integer.valueOf(mtVar.f380819g)) && n51.f.a(this.f380820h, mtVar.f380820h) && n51.f.a(this.f380821i, mtVar.f380821i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f380816d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f380817e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f380818f);
            fVar.e(4, this.f380819g);
            java.lang.String str3 = this.f380820h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f380821i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f380816d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f380817e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int e17 = j17 + b36.f.e(3, this.f380818f) + b36.f.e(4, this.f380819g);
            java.lang.String str7 = this.f380820h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f380821i;
            return str8 != null ? e17 + b36.f.j(6, str8) : e17;
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
        r45.mt mtVar = (r45.mt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mtVar.f380816d = aVar2.k(intValue);
                return 0;
            case 2:
                mtVar.f380817e = aVar2.k(intValue);
                return 0;
            case 3:
                mtVar.f380818f = aVar2.g(intValue);
                return 0;
            case 4:
                mtVar.f380819g = aVar2.g(intValue);
                return 0;
            case 5:
                mtVar.f380820h = aVar2.k(intValue);
                return 0;
            case 6:
                mtVar.f380821i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
