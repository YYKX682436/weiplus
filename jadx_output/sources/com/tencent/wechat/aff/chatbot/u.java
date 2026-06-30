package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.u f216471m = new com.tencent.wechat.aff.chatbot.u();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f216472d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f216473e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f216475g;

    /* renamed from: h, reason: collision with root package name */
    public int f216476h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f216474f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f216477i = new boolean[6];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.u)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.u uVar = (com.tencent.wechat.aff.chatbot.u) fVar;
        return n51.f.a(this.f216472d, uVar.f216472d) && n51.f.a(this.f216473e, uVar.f216473e) && n51.f.a(this.f216474f, uVar.f216474f) && n51.f.a(this.f216475g, uVar.f216475g) && n51.f.a(java.lang.Integer.valueOf(this.f216476h), java.lang.Integer.valueOf(uVar.f216476h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.u();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f216474f;
        int i18 = 0;
        boolean[] zArr = this.f216477i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f216472d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f216473e;
            if (gVar2 != null && zArr[2]) {
                fVar.b(2, gVar2);
            }
            fVar.g(3, 6, linkedList);
            java.lang.String str = this.f216475g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f216476h);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar3 = this.f216472d;
            if (gVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.tencent.mm.protobuf.g gVar4 = this.f216473e;
            if (gVar4 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar4);
            }
            int g17 = i18 + b36.f.g(3, 6, linkedList);
            java.lang.String str2 = this.f216475g;
            if (str2 != null && zArr[4]) {
                g17 += b36.f.j(4, str2);
            }
            return zArr[5] ? g17 + b36.f.e(5, this.f216476h) : g17;
        }
        if (i17 == 2) {
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
        if (intValue == 1) {
            this.f216472d = aVar2.d(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f216473e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList.add(aVar2.d(intValue));
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f216475g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f216476h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.u) super.parseFrom(bArr);
    }
}
