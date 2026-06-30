package r45;

/* loaded from: classes2.dex */
public class cc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f371440d;

    /* renamed from: e, reason: collision with root package name */
    public r45.j32 f371441e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371442f;

    /* renamed from: g, reason: collision with root package name */
    public int f371443g;

    /* renamed from: h, reason: collision with root package name */
    public int f371444h;

    /* renamed from: i, reason: collision with root package name */
    public int f371445i;

    /* renamed from: m, reason: collision with root package name */
    public int f371446m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cc)) {
            return false;
        }
        r45.cc ccVar = (r45.cc) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f371440d), java.lang.Long.valueOf(ccVar.f371440d)) && n51.f.a(this.f371441e, ccVar.f371441e) && n51.f.a(this.f371442f, ccVar.f371442f) && n51.f.a(java.lang.Integer.valueOf(this.f371443g), java.lang.Integer.valueOf(ccVar.f371443g)) && n51.f.a(java.lang.Integer.valueOf(this.f371444h), java.lang.Integer.valueOf(ccVar.f371444h)) && n51.f.a(java.lang.Integer.valueOf(this.f371445i), java.lang.Integer.valueOf(ccVar.f371445i)) && n51.f.a(java.lang.Integer.valueOf(this.f371446m), java.lang.Integer.valueOf(ccVar.f371446m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f371440d);
            r45.j32 j32Var = this.f371441e;
            if (j32Var != null) {
                fVar.i(2, j32Var.computeSize());
                this.f371441e.writeFields(fVar);
            }
            java.lang.String str = this.f371442f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f371443g);
            fVar.e(5, this.f371444h);
            fVar.e(6, this.f371445i);
            fVar.e(7, this.f371446m);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f371440d) + 0;
            r45.j32 j32Var2 = this.f371441e;
            if (j32Var2 != null) {
                h17 += b36.f.i(2, j32Var2.computeSize());
            }
            java.lang.String str2 = this.f371442f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.e(4, this.f371443g) + b36.f.e(5, this.f371444h) + b36.f.e(6, this.f371445i) + b36.f.e(7, this.f371446m);
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
        r45.cc ccVar = (r45.cc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ccVar.f371440d = aVar2.i(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.j32 j32Var3 = new r45.j32();
                    if (bArr != null && bArr.length > 0) {
                        j32Var3.parseFrom(bArr);
                    }
                    ccVar.f371441e = j32Var3;
                }
                return 0;
            case 3:
                ccVar.f371442f = aVar2.k(intValue);
                return 0;
            case 4:
                ccVar.f371443g = aVar2.g(intValue);
                return 0;
            case 5:
                ccVar.f371444h = aVar2.g(intValue);
                return 0;
            case 6:
                ccVar.f371445i = aVar2.g(intValue);
                return 0;
            case 7:
                ccVar.f371446m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
