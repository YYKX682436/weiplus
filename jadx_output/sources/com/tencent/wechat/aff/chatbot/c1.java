package com.tencent.wechat.aff.chatbot;

/* loaded from: classes2.dex */
public class c1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f216108d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f216109e;

    /* renamed from: f, reason: collision with root package name */
    public int f216110f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f216112h;

    /* renamed from: i, reason: collision with root package name */
    public long f216113i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f216114m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f216115n;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f216117p;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f216111g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f216116o = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f216118q = new boolean[11];

    static {
        new com.tencent.wechat.aff.chatbot.c1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.c1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.c1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.c1)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.c1 c1Var = (com.tencent.wechat.aff.chatbot.c1) fVar;
        return n51.f.a(this.f216108d, c1Var.f216108d) && n51.f.a(java.lang.Boolean.valueOf(this.f216109e), java.lang.Boolean.valueOf(c1Var.f216109e)) && n51.f.a(java.lang.Integer.valueOf(this.f216110f), java.lang.Integer.valueOf(c1Var.f216110f)) && n51.f.a(this.f216111g, c1Var.f216111g) && n51.f.a(this.f216112h, c1Var.f216112h) && n51.f.a(java.lang.Long.valueOf(this.f216113i), java.lang.Long.valueOf(c1Var.f216113i)) && n51.f.a(java.lang.Boolean.valueOf(this.f216114m), java.lang.Boolean.valueOf(c1Var.f216114m)) && n51.f.a(java.lang.Boolean.valueOf(this.f216115n), java.lang.Boolean.valueOf(c1Var.f216115n)) && n51.f.a(this.f216116o, c1Var.f216116o) && n51.f.a(this.f216117p, c1Var.f216117p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.c1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216116o;
        java.util.LinkedList linkedList2 = this.f216111g;
        boolean[] zArr = this.f216118q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f216108d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f216109e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f216110f);
            }
            fVar.g(4, 8, linkedList2);
            java.lang.String str2 = this.f216112h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.h(6, this.f216113i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f216114m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f216115n);
            }
            fVar.g(9, 1, linkedList);
            java.lang.String str3 = this.f216117p;
            if (str3 == null || !zArr[10]) {
                return 0;
            }
            fVar.j(10, str3);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f216108d;
            int j17 = (str4 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str4);
            if (zArr[2]) {
                j17 += b36.f.a(2, this.f216109e);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f216110f);
            }
            int g17 = j17 + b36.f.g(4, 8, linkedList2);
            java.lang.String str5 = this.f216112h;
            if (str5 != null && zArr[5]) {
                g17 += b36.f.j(5, str5);
            }
            if (zArr[6]) {
                g17 += b36.f.h(6, this.f216113i);
            }
            if (zArr[7]) {
                g17 += b36.f.a(7, this.f216114m);
            }
            if (zArr[8]) {
                g17 += b36.f.a(8, this.f216115n);
            }
            int g18 = g17 + b36.f.g(9, 1, linkedList);
            java.lang.String str6 = this.f216117p;
            return (str6 == null || !zArr[10]) ? g18 : g18 + b36.f.j(10, str6);
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
        switch (intValue) {
            case 1:
                this.f216108d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f216109e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f216110f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.tencent.wechat.aff.chatbot.b1 b1Var = new com.tencent.wechat.aff.chatbot.b1();
                    if (bArr != null && bArr.length > 0) {
                        b1Var.parseFrom(bArr);
                    }
                    linkedList2.add(b1Var);
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f216112h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f216113i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f216114m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f216115n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                linkedList.add(aVar2.k(intValue));
                zArr[9] = true;
                return 0;
            case 10:
                this.f216117p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
