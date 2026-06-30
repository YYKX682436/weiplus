package r45;

/* loaded from: classes7.dex */
public class wj0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389216d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389217e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f389218f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f389219g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f389220h;

    static {
        new r45.wj0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.wj0 parseFrom(byte[] bArr) {
        return (r45.wj0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wj0)) {
            return false;
        }
        r45.wj0 wj0Var = (r45.wj0) fVar;
        return n51.f.a(this.f389216d, wj0Var.f389216d) && n51.f.a(this.f389217e, wj0Var.f389217e) && n51.f.a(this.f389218f, wj0Var.f389218f) && n51.f.a(this.f389219g, wj0Var.f389219g) && n51.f.a(this.f389220h, wj0Var.f389220h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.wj0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389216d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f389217e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f389218f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f389219g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f389220h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f389216d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f389217e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f389218f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f389219g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f389220h;
            return str10 != null ? j17 + b36.f.j(5, str10) : j17;
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
            this.f389216d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f389217e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f389218f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f389219g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f389220h = aVar2.k(intValue);
        return 0;
    }
}
