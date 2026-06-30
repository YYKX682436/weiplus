package r45;

/* loaded from: classes9.dex */
public class sj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f385771d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385772e;

    /* renamed from: f, reason: collision with root package name */
    public int f385773f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f385774g;

    static {
        new r45.sj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.sj0 parseFrom(byte[] bArr) {
        return (r45.sj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sj0)) {
            return false;
        }
        r45.sj0 sj0Var = (r45.sj0) fVar;
        return n51.f.a(this.f385771d, sj0Var.f385771d) && n51.f.a(this.f385772e, sj0Var.f385772e) && n51.f.a(java.lang.Integer.valueOf(this.f385773f), java.lang.Integer.valueOf(sj0Var.f385773f)) && n51.f.a(this.f385774g, sj0Var.f385774g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.sj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f385771d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f385772e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f385773f);
            java.lang.String str3 = this.f385774g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f385771d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f385772e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int e17 = j17 + b36.f.e(3, this.f385773f);
            java.lang.String str6 = this.f385774g;
            return str6 != null ? e17 + b36.f.j(4, str6) : e17;
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
            this.f385771d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f385772e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f385773f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f385774g = aVar2.k(intValue);
        return 0;
    }
}
