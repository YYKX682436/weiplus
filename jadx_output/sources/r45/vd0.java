package r45;

/* loaded from: classes4.dex */
public class vd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: h, reason: collision with root package name */
    public static final r45.vd0 f388133h = new r45.vd0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388134d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388135e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388136f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f388137g;

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.vd0 parseFrom(byte[] bArr) {
        return (r45.vd0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vd0)) {
            return false;
        }
        r45.vd0 vd0Var = (r45.vd0) fVar;
        return n51.f.a(this.f388134d, vd0Var.f388134d) && n51.f.a(this.f388135e, vd0Var.f388135e) && n51.f.a(this.f388136f, vd0Var.f388136f) && n51.f.a(this.f388137g, vd0Var.f388137g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.vd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f388134d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f388135e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f388136f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f388137g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f388134d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f388135e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f388136f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f388137g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
            this.f388134d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f388135e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f388136f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f388137g = aVar2.k(intValue);
        return 0;
    }
}
