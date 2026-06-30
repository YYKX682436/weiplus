package com.tencent.mm.storage;

/* loaded from: classes8.dex */
public class i9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f195026d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f195027e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f195028f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ad4 f195029g;

    /* renamed from: h, reason: collision with root package name */
    public int f195030h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.storage.v8 f195031i;

    /* renamed from: m, reason: collision with root package name */
    public long f195032m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f195033n;

    /* renamed from: o, reason: collision with root package name */
    public int f195034o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f195035p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mm.storage.i9)) {
            return false;
        }
        com.tencent.mm.storage.i9 i9Var = (com.tencent.mm.storage.i9) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f195026d), java.lang.Integer.valueOf(i9Var.f195026d)) && n51.f.a(this.f195027e, i9Var.f195027e) && n51.f.a(this.f195028f, i9Var.f195028f) && n51.f.a(this.f195029g, i9Var.f195029g) && n51.f.a(java.lang.Integer.valueOf(this.f195030h), java.lang.Integer.valueOf(i9Var.f195030h)) && n51.f.a(this.f195031i, i9Var.f195031i) && n51.f.a(java.lang.Long.valueOf(this.f195032m), java.lang.Long.valueOf(i9Var.f195032m)) && n51.f.a(this.f195033n, i9Var.f195033n) && n51.f.a(java.lang.Integer.valueOf(this.f195034o), java.lang.Integer.valueOf(i9Var.f195034o)) && n51.f.a(java.lang.Boolean.valueOf(this.f195035p), java.lang.Boolean.valueOf(i9Var.f195035p));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f195026d);
            java.lang.String str = this.f195027e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f195028f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.ad4 ad4Var = this.f195029g;
            if (ad4Var != null) {
                fVar.i(4, ad4Var.computeSize());
                this.f195029g.writeFields(fVar);
            }
            fVar.e(5, this.f195030h);
            com.tencent.mm.storage.v8 v8Var = this.f195031i;
            if (v8Var != null) {
                fVar.i(6, v8Var.computeSize());
                this.f195031i.writeFields(fVar);
            }
            fVar.h(7, this.f195032m);
            java.lang.String str3 = this.f195033n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f195034o);
            fVar.a(10, this.f195035p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f195026d) + 0;
            java.lang.String str4 = this.f195027e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f195028f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            r45.ad4 ad4Var2 = this.f195029g;
            if (ad4Var2 != null) {
                e17 += b36.f.i(4, ad4Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(5, this.f195030h);
            com.tencent.mm.storage.v8 v8Var2 = this.f195031i;
            if (v8Var2 != null) {
                e18 += b36.f.i(6, v8Var2.computeSize());
            }
            int h17 = e18 + b36.f.h(7, this.f195032m);
            java.lang.String str6 = this.f195033n;
            if (str6 != null) {
                h17 += b36.f.j(8, str6);
            }
            return h17 + b36.f.e(9, this.f195034o) + b36.f.a(10, this.f195035p);
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
        com.tencent.mm.storage.i9 i9Var = (com.tencent.mm.storage.i9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i9Var.f195026d = aVar2.g(intValue);
                return 0;
            case 2:
                i9Var.f195027e = aVar2.k(intValue);
                return 0;
            case 3:
                i9Var.f195028f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ad4 ad4Var3 = new r45.ad4();
                    if (bArr != null && bArr.length > 0) {
                        ad4Var3.parseFrom(bArr);
                    }
                    i9Var.f195029g = ad4Var3;
                }
                return 0;
            case 5:
                i9Var.f195030h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.tencent.mm.storage.v8 v8Var3 = new com.tencent.mm.storage.v8();
                    if (bArr2 != null && bArr2.length > 0) {
                        v8Var3.parseFrom(bArr2);
                    }
                    i9Var.f195031i = v8Var3;
                }
                return 0;
            case 7:
                i9Var.f195032m = aVar2.i(intValue);
                return 0;
            case 8:
                i9Var.f195033n = aVar2.k(intValue);
                return 0;
            case 9:
                i9Var.f195034o = aVar2.g(intValue);
                return 0;
            case 10:
                i9Var.f195035p = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
