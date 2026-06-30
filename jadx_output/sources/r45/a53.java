package r45;

/* loaded from: classes9.dex */
public class a53 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f369732d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369733e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f369734f = false;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369735g = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f369736h = false;

    /* renamed from: i, reason: collision with root package name */
    public long f369737i = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f369738m = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a53)) {
            return false;
        }
        r45.a53 a53Var = (r45.a53) fVar;
        return n51.f.a(this.f369732d, a53Var.f369732d) && n51.f.a(this.f369733e, a53Var.f369733e) && n51.f.a(java.lang.Boolean.valueOf(this.f369734f), java.lang.Boolean.valueOf(a53Var.f369734f)) && n51.f.a(this.f369735g, a53Var.f369735g) && n51.f.a(java.lang.Boolean.valueOf(this.f369736h), java.lang.Boolean.valueOf(a53Var.f369736h)) && n51.f.a(java.lang.Long.valueOf(this.f369737i), java.lang.Long.valueOf(a53Var.f369737i)) && n51.f.a(java.lang.Integer.valueOf(this.f369738m), java.lang.Integer.valueOf(a53Var.f369738m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f369732d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.computeSize());
                this.f369732d.writeFields(fVar);
            }
            java.lang.String str = this.f369733e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f369734f);
            java.lang.String str2 = this.f369735g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.a(5, this.f369736h);
            fVar.h(6, this.f369737i);
            fVar.e(7, this.f369738m);
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var2 = this.f369732d;
            int i18 = bn6Var2 != null ? 0 + b36.f.i(1, bn6Var2.computeSize()) : 0;
            java.lang.String str3 = this.f369733e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int a17 = i18 + b36.f.a(3, this.f369734f);
            java.lang.String str4 = this.f369735g;
            if (str4 != null) {
                a17 += b36.f.j(4, str4);
            }
            return a17 + b36.f.a(5, this.f369736h) + b36.f.h(6, this.f369737i) + b36.f.e(7, this.f369738m);
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
        r45.a53 a53Var = (r45.a53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.bn6 bn6Var3 = new r45.bn6();
                    if (bArr != null && bArr.length > 0) {
                        bn6Var3.parseFrom(bArr);
                    }
                    a53Var.f369732d = bn6Var3;
                }
                return 0;
            case 2:
                a53Var.f369733e = aVar2.k(intValue);
                return 0;
            case 3:
                a53Var.f369734f = aVar2.c(intValue);
                return 0;
            case 4:
                a53Var.f369735g = aVar2.k(intValue);
                return 0;
            case 5:
                a53Var.f369736h = aVar2.c(intValue);
                return 0;
            case 6:
                a53Var.f369737i = aVar2.i(intValue);
                return 0;
            case 7:
                a53Var.f369738m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
