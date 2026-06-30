package com.tencent.wechat.aff.favorites;

/* loaded from: classes11.dex */
public class v extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wechat.aff.favorites.v f216872m = new com.tencent.wechat.aff.favorites.v();

    /* renamed from: d, reason: collision with root package name */
    public int f216873d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216874e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f216875f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.aff.favorites.c f216876g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.aff.favorites.j f216877h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f216878i = new boolean[6];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.favorites.v)) {
            return false;
        }
        com.tencent.wechat.aff.favorites.v vVar = (com.tencent.wechat.aff.favorites.v) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f216873d), java.lang.Integer.valueOf(vVar.f216873d)) && n51.f.a(this.f216874e, vVar.f216874e) && n51.f.a(this.f216875f, vVar.f216875f) && n51.f.a(this.f216876g, vVar.f216876g) && n51.f.a(this.f216877h, vVar.f216877h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.favorites.v();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f216878i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f216873d);
            }
            java.lang.String str = this.f216874e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f216875f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            com.tencent.wechat.aff.favorites.c cVar = this.f216876g;
            if (cVar != null && zArr[4]) {
                fVar.i(4, cVar.computeSize());
                this.f216876g.writeFields(fVar);
            }
            com.tencent.wechat.aff.favorites.j jVar = this.f216877h;
            if (jVar != null && zArr[5]) {
                fVar.i(5, jVar.computeSize());
                this.f216877h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f216873d) : 0;
            java.lang.String str3 = this.f216874e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f216875f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            com.tencent.wechat.aff.favorites.c cVar2 = this.f216876g;
            if (cVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, cVar2.computeSize());
            }
            com.tencent.wechat.aff.favorites.j jVar2 = this.f216877h;
            return (jVar2 == null || !zArr[5]) ? e17 : e17 + b36.f.i(5, jVar2.computeSize());
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
            this.f216873d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216874e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f216875f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.aff.favorites.c cVar3 = new com.tencent.wechat.aff.favorites.c();
                if (bArr != null && bArr.length > 0) {
                    cVar3.parseFrom(bArr);
                }
                this.f216876g = cVar3;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.aff.favorites.j jVar3 = new com.tencent.wechat.aff.favorites.j();
            if (bArr2 != null && bArr2.length > 0) {
                jVar3.parseFrom(bArr2);
            }
            this.f216877h = jVar3;
        }
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.favorites.v) super.parseFrom(bArr);
    }
}
