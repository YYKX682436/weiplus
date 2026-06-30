package r45;

/* loaded from: classes15.dex */
public class kd6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f378601d;

    /* renamed from: e, reason: collision with root package name */
    public r45.bn6 f378602e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f378604g;

    /* renamed from: h, reason: collision with root package name */
    public int f378605h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f378606i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f378607m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f378608n;

    /* renamed from: f, reason: collision with root package name */
    public boolean f378603f = false;

    /* renamed from: o, reason: collision with root package name */
    public long f378609o = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kd6)) {
            return false;
        }
        r45.kd6 kd6Var = (r45.kd6) fVar;
        return n51.f.a(this.f378601d, kd6Var.f378601d) && n51.f.a(this.f378602e, kd6Var.f378602e) && n51.f.a(java.lang.Boolean.valueOf(this.f378603f), java.lang.Boolean.valueOf(kd6Var.f378603f)) && n51.f.a(this.f378604g, kd6Var.f378604g) && n51.f.a(java.lang.Integer.valueOf(this.f378605h), java.lang.Integer.valueOf(kd6Var.f378605h)) && n51.f.a(this.f378606i, kd6Var.f378606i) && n51.f.a(this.f378607m, kd6Var.f378607m) && n51.f.a(this.f378608n, kd6Var.f378608n) && n51.f.a(java.lang.Long.valueOf(this.f378609o), java.lang.Long.valueOf(kd6Var.f378609o));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f378601d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.computeSize());
                this.f378601d.writeFields(fVar);
            }
            r45.bn6 bn6Var2 = this.f378602e;
            if (bn6Var2 != null) {
                fVar.i(2, bn6Var2.computeSize());
                this.f378602e.writeFields(fVar);
            }
            fVar.a(3, this.f378603f);
            java.lang.String str = this.f378604g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f378605h);
            java.lang.String str2 = this.f378606i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f378607m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f378608n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.h(9, this.f378609o);
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var3 = this.f378601d;
            int i18 = bn6Var3 != null ? 0 + b36.f.i(1, bn6Var3.computeSize()) : 0;
            r45.bn6 bn6Var4 = this.f378602e;
            if (bn6Var4 != null) {
                i18 += b36.f.i(2, bn6Var4.computeSize());
            }
            int a17 = i18 + b36.f.a(3, this.f378603f);
            java.lang.String str5 = this.f378604g;
            if (str5 != null) {
                a17 += b36.f.j(4, str5);
            }
            int e17 = a17 + b36.f.e(5, this.f378605h);
            java.lang.String str6 = this.f378606i;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f378607m;
            if (str7 != null) {
                e17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f378608n;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            return e17 + b36.f.h(9, this.f378609o);
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
        r45.kd6 kd6Var = (r45.kd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.bn6 bn6Var5 = new r45.bn6();
                    if (bArr != null && bArr.length > 0) {
                        bn6Var5.parseFrom(bArr);
                    }
                    kd6Var.f378601d = bn6Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.bn6 bn6Var6 = new r45.bn6();
                    if (bArr2 != null && bArr2.length > 0) {
                        bn6Var6.parseFrom(bArr2);
                    }
                    kd6Var.f378602e = bn6Var6;
                }
                return 0;
            case 3:
                kd6Var.f378603f = aVar2.c(intValue);
                return 0;
            case 4:
                kd6Var.f378604g = aVar2.k(intValue);
                return 0;
            case 5:
                kd6Var.f378605h = aVar2.g(intValue);
                return 0;
            case 6:
                kd6Var.f378606i = aVar2.k(intValue);
                return 0;
            case 7:
                kd6Var.f378607m = aVar2.k(intValue);
                return 0;
            case 8:
                kd6Var.f378608n = aVar2.k(intValue);
                return 0;
            case 9:
                kd6Var.f378609o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
