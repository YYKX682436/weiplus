package r45;

/* loaded from: classes4.dex */
public class l35 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379107d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379108e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379109f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379110g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379111h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f379112i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f379113m;

    static {
        new r45.l35();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.l35 parseFrom(byte[] bArr) {
        return (r45.l35) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.l35)) {
            return false;
        }
        r45.l35 l35Var = (r45.l35) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379107d), java.lang.Integer.valueOf(l35Var.f379107d)) && n51.f.a(this.f379108e, l35Var.f379108e) && n51.f.a(this.f379109f, l35Var.f379109f) && n51.f.a(this.f379110g, l35Var.f379110g) && n51.f.a(this.f379111h, l35Var.f379111h) && n51.f.a(this.f379112i, l35Var.f379112i) && n51.f.a(this.f379113m, l35Var.f379113m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.l35();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379107d);
            java.lang.String str = this.f379108e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f379109f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f379110g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f379111h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f379112i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f379113m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379107d) + 0;
            java.lang.String str7 = this.f379108e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f379109f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f379110g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f379111h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f379112i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f379113m;
            return str12 != null ? e17 + b36.f.j(7, str12) : e17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f379107d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f379108e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f379109f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f379110g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f379111h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f379112i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f379113m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
