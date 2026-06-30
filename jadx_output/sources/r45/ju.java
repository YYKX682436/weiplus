package r45;

/* loaded from: classes15.dex */
public class ju extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f378103d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378104e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f378105f;

    /* renamed from: g, reason: collision with root package name */
    public int f378106g;

    /* renamed from: h, reason: collision with root package name */
    public int f378107h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378108i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ju)) {
            return false;
        }
        r45.ju juVar = (r45.ju) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f378103d), java.lang.Integer.valueOf(juVar.f378103d)) && n51.f.a(this.f378104e, juVar.f378104e) && n51.f.a(this.f378105f, juVar.f378105f) && n51.f.a(java.lang.Integer.valueOf(this.f378106g), java.lang.Integer.valueOf(juVar.f378106g)) && n51.f.a(java.lang.Integer.valueOf(this.f378107h), java.lang.Integer.valueOf(juVar.f378107h)) && n51.f.a(this.f378108i, juVar.f378108i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f378103d);
            java.lang.String str = this.f378104e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f378105f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f378106g);
            fVar.e(5, this.f378107h);
            java.lang.String str3 = this.f378108i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f378103d) + 0;
            java.lang.String str4 = this.f378104e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f378105f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            int e18 = e17 + b36.f.e(4, this.f378106g) + b36.f.e(5, this.f378107h);
            java.lang.String str6 = this.f378108i;
            return str6 != null ? e18 + b36.f.j(6, str6) : e18;
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
        r45.ju juVar = (r45.ju) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                juVar.f378103d = aVar2.g(intValue);
                return 0;
            case 2:
                juVar.f378104e = aVar2.k(intValue);
                return 0;
            case 3:
                juVar.f378105f = aVar2.k(intValue);
                return 0;
            case 4:
                juVar.f378106g = aVar2.g(intValue);
                return 0;
            case 5:
                juVar.f378107h = aVar2.g(intValue);
                return 0;
            case 6:
                juVar.f378108i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
