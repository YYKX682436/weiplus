package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.protobuf.f {

    /* renamed from: u, reason: collision with root package name */
    public static final com.tencent.wechat.mm.finder_box.b f219310u = new com.tencent.wechat.mm.finder_box.b();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.iam.finder_box.i f219311d = new com.tencent.wechat.iam.finder_box.i();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219312e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f219313f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f219314g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f219315h = "";

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.a f219316i = new com.tencent.wechat.mm.finder_box.a();

    /* renamed from: m, reason: collision with root package name */
    public boolean f219317m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f219318n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f219319o = "";

    /* renamed from: p, reason: collision with root package name */
    public boolean f219320p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f219321q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f219322r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f219323s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f219324t = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.b)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.b bVar = (com.tencent.wechat.mm.finder_box.b) fVar;
        return n51.f.a(this.f219311d, bVar.f219311d) && n51.f.a(this.f219312e, bVar.f219312e) && n51.f.a(this.f219313f, bVar.f219313f) && n51.f.a(this.f219314g, bVar.f219314g) && n51.f.a(this.f219315h, bVar.f219315h) && n51.f.a(this.f219316i, bVar.f219316i) && n51.f.a(java.lang.Boolean.valueOf(this.f219317m), java.lang.Boolean.valueOf(bVar.f219317m)) && n51.f.a(java.lang.Integer.valueOf(this.f219318n), java.lang.Integer.valueOf(bVar.f219318n)) && n51.f.a(this.f219319o, bVar.f219319o) && n51.f.a(java.lang.Boolean.valueOf(this.f219320p), java.lang.Boolean.valueOf(bVar.f219320p)) && n51.f.a(java.lang.Integer.valueOf(this.f219321q), java.lang.Integer.valueOf(bVar.f219321q)) && n51.f.a(java.lang.Integer.valueOf(this.f219322r), java.lang.Integer.valueOf(bVar.f219322r)) && n51.f.a(java.lang.Integer.valueOf(this.f219323s), java.lang.Integer.valueOf(bVar.f219323s)) && n51.f.a(java.lang.Integer.valueOf(this.f219324t), java.lang.Integer.valueOf(bVar.f219324t));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.b();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.wechat.iam.finder_box.i iVar = this.f219311d;
            if (iVar != null) {
                fVar.i(1, iVar.computeSize());
                this.f219311d.writeFields(fVar);
            }
            java.lang.String str = this.f219312e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f219313f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f219314g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f219315h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.tencent.wechat.mm.finder_box.a aVar = this.f219316i;
            if (aVar != null) {
                fVar.i(6, aVar.computeSize());
                this.f219316i.writeFields(fVar);
            }
            fVar.a(7, this.f219317m);
            fVar.e(8, this.f219318n);
            java.lang.String str5 = this.f219319o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.a(10, this.f219320p);
            fVar.e(11, this.f219321q);
            fVar.e(12, this.f219322r);
            fVar.e(13, this.f219323s);
            fVar.e(14, this.f219324t);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.wechat.iam.finder_box.i iVar2 = this.f219311d;
            int i18 = iVar2 != null ? b36.f.i(1, iVar2.computeSize()) + 0 : 0;
            java.lang.String str6 = this.f219312e;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f219313f;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f219314g;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f219315h;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            com.tencent.wechat.mm.finder_box.a aVar2 = this.f219316i;
            if (aVar2 != null) {
                i18 += b36.f.i(6, aVar2.computeSize());
            }
            int a17 = i18 + b36.f.a(7, this.f219317m) + b36.f.e(8, this.f219318n);
            java.lang.String str10 = this.f219319o;
            if (str10 != null) {
                a17 += b36.f.j(9, str10);
            }
            return a17 + b36.f.a(10, this.f219320p) + b36.f.e(11, this.f219321q) + b36.f.e(12, this.f219322r) + b36.f.e(13, this.f219323s) + b36.f.e(14, this.f219324t);
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.iam.finder_box.i iVar3 = new com.tencent.wechat.iam.finder_box.i();
                    if (bArr != null && bArr.length > 0) {
                        iVar3.parseFrom(bArr);
                    }
                    this.f219311d = iVar3;
                }
                return 0;
            case 2:
                this.f219312e = aVar4.k(intValue);
                return 0;
            case 3:
                this.f219313f = aVar4.k(intValue);
                return 0;
            case 4:
                this.f219314g = aVar4.k(intValue);
                return 0;
            case 5:
                this.f219315h = aVar4.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.finder_box.a aVar5 = new com.tencent.wechat.mm.finder_box.a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar5.parseFrom(bArr2);
                    }
                    this.f219316i = aVar5;
                }
                return 0;
            case 7:
                this.f219317m = aVar4.c(intValue);
                return 0;
            case 8:
                this.f219318n = aVar4.g(intValue);
                return 0;
            case 9:
                this.f219319o = aVar4.k(intValue);
                return 0;
            case 10:
                this.f219320p = aVar4.c(intValue);
                return 0;
            case 11:
                this.f219321q = aVar4.g(intValue);
                return 0;
            case 12:
                this.f219322r = aVar4.g(intValue);
                return 0;
            case 13:
                this.f219323s = aVar4.g(intValue);
                return 0;
            case 14:
                this.f219324t = aVar4.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.b) super.parseFrom(bArr);
    }
}
