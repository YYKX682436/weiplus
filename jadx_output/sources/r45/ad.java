package r45;

/* loaded from: classes11.dex */
public class ad extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f369932d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f369933e;

    /* renamed from: f, reason: collision with root package name */
    public int f369934f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369935g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369936h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f369937i;

    static {
        new r45.ad();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ad)) {
            return false;
        }
        r45.ad adVar = (r45.ad) fVar;
        return n51.f.a(this.f369932d, adVar.f369932d) && n51.f.a(java.lang.Integer.valueOf(this.f369933e), java.lang.Integer.valueOf(adVar.f369933e)) && n51.f.a(java.lang.Integer.valueOf(this.f369934f), java.lang.Integer.valueOf(adVar.f369934f)) && n51.f.a(this.f369935g, adVar.f369935g) && n51.f.a(this.f369936h, adVar.f369936h) && n51.f.a(this.f369937i, adVar.f369937i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.ad();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, this.f369932d);
            fVar.e(2, this.f369933e);
            fVar.e(3, this.f369934f);
            java.lang.String str = this.f369935g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f369936h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f369937i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, this.f369932d) + 0 + b36.f.e(2, this.f369933e) + b36.f.e(3, this.f369934f);
            java.lang.String str4 = this.f369935g;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f369936h;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f369937i;
            return str6 != null ? g17 + b36.f.j(6, str6) : g17;
        }
        if (i17 == 2) {
            this.f369932d.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f369932d.add(aVar2.k(intValue));
                return 0;
            case 2:
                this.f369933e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f369934f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f369935g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f369936h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f369937i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.ad) super.parseFrom(bArr);
    }
}
