package r45;

/* loaded from: classes2.dex */
public class nj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381436d;

    /* renamed from: e, reason: collision with root package name */
    public int f381437e;

    /* renamed from: f, reason: collision with root package name */
    public int f381438f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f381439g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f381440h;

    static {
        new r45.nj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.nj0 parseFrom(byte[] bArr) {
        return (r45.nj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nj0)) {
            return false;
        }
        r45.nj0 nj0Var = (r45.nj0) fVar;
        return n51.f.a(this.f381436d, nj0Var.f381436d) && n51.f.a(java.lang.Integer.valueOf(this.f381437e), java.lang.Integer.valueOf(nj0Var.f381437e)) && n51.f.a(java.lang.Integer.valueOf(this.f381438f), java.lang.Integer.valueOf(nj0Var.f381438f)) && n51.f.a(this.f381439g, nj0Var.f381439g) && n51.f.a(this.f381440h, nj0Var.f381440h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.nj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381436d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f381437e);
            fVar.e(3, this.f381438f);
            java.lang.String str2 = this.f381439g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f381440h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f381436d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f381437e) + b36.f.e(3, this.f381438f);
            java.lang.String str5 = this.f381439g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f381440h;
            return str6 != null ? j17 + b36.f.j(5, str6) : j17;
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
        if (intValue == 1) {
            this.f381436d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f381437e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f381438f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f381439g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f381440h = aVar2.k(intValue);
        return 0;
    }
}
