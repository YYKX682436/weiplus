package r45;

/* loaded from: classes10.dex */
public class il4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f377129d;

    /* renamed from: e, reason: collision with root package name */
    public long f377130e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377131f;

    /* renamed from: g, reason: collision with root package name */
    public r45.kf5 f377132g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f377133h;

    /* renamed from: i, reason: collision with root package name */
    public long f377134i;

    /* renamed from: m, reason: collision with root package name */
    public int f377135m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.il4)) {
            return false;
        }
        r45.il4 il4Var = (r45.il4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f377129d), java.lang.Long.valueOf(il4Var.f377129d)) && n51.f.a(java.lang.Long.valueOf(this.f377130e), java.lang.Long.valueOf(il4Var.f377130e)) && n51.f.a(this.f377131f, il4Var.f377131f) && n51.f.a(this.f377132g, il4Var.f377132g) && n51.f.a(java.lang.Boolean.valueOf(this.f377133h), java.lang.Boolean.valueOf(il4Var.f377133h)) && n51.f.a(java.lang.Long.valueOf(this.f377134i), java.lang.Long.valueOf(il4Var.f377134i)) && n51.f.a(java.lang.Integer.valueOf(this.f377135m), java.lang.Integer.valueOf(il4Var.f377135m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f377129d);
            fVar.h(2, this.f377130e);
            java.lang.String str = this.f377131f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.kf5 kf5Var = this.f377132g;
            if (kf5Var != null) {
                fVar.i(4, kf5Var.computeSize());
                this.f377132g.writeFields(fVar);
            }
            fVar.a(5, this.f377133h);
            fVar.h(6, this.f377134i);
            fVar.e(7, this.f377135m);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f377129d) + 0 + b36.f.h(2, this.f377130e);
            java.lang.String str2 = this.f377131f;
            if (str2 != null) {
                h17 += b36.f.j(3, str2);
            }
            r45.kf5 kf5Var2 = this.f377132g;
            if (kf5Var2 != null) {
                h17 += b36.f.i(4, kf5Var2.computeSize());
            }
            return h17 + b36.f.a(5, this.f377133h) + b36.f.h(6, this.f377134i) + b36.f.e(7, this.f377135m);
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
        r45.il4 il4Var = (r45.il4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                il4Var.f377129d = aVar2.i(intValue);
                return 0;
            case 2:
                il4Var.f377130e = aVar2.i(intValue);
                return 0;
            case 3:
                il4Var.f377131f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.kf5 kf5Var3 = new r45.kf5();
                    if (bArr != null && bArr.length > 0) {
                        kf5Var3.parseFrom(bArr);
                    }
                    il4Var.f377132g = kf5Var3;
                }
                return 0;
            case 5:
                il4Var.f377133h = aVar2.c(intValue);
                return 0;
            case 6:
                il4Var.f377134i = aVar2.i(intValue);
                return 0;
            case 7:
                il4Var.f377135m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
