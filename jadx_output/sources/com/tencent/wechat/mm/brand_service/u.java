package com.tencent.wechat.mm.brand_service;

/* loaded from: classes11.dex */
public class u extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f219192d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f219193e = "";

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.v f219194f = com.tencent.wechat.mm.brand_service.v.BizShowReddotType_ShowUnReadNum;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.j f219195g = new com.tencent.wechat.mm.brand_service.j();

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.brand_service.j f219196h = new com.tencent.wechat.mm.brand_service.j();

    static {
        new com.tencent.wechat.mm.brand_service.u();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.brand_service.u parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.brand_service.u) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.brand_service.u)) {
            return false;
        }
        com.tencent.wechat.mm.brand_service.u uVar = (com.tencent.wechat.mm.brand_service.u) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f219192d), java.lang.Integer.valueOf(uVar.f219192d)) && n51.f.a(this.f219193e, uVar.f219193e) && n51.f.a(this.f219194f, uVar.f219194f) && n51.f.a(this.f219195g, uVar.f219195g) && n51.f.a(this.f219196h, uVar.f219196h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.brand_service.u();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f219192d);
            java.lang.String str = this.f219193e;
            if (str != null) {
                fVar.j(2, str);
            }
            com.tencent.wechat.mm.brand_service.v vVar = this.f219194f;
            if (vVar != null) {
                fVar.e(3, vVar.f219202d);
            }
            com.tencent.wechat.mm.brand_service.j jVar = this.f219195g;
            if (jVar != null) {
                fVar.i(4, jVar.computeSize());
                this.f219195g.writeFields(fVar);
            }
            com.tencent.wechat.mm.brand_service.j jVar2 = this.f219196h;
            if (jVar2 != null) {
                fVar.i(5, jVar2.computeSize());
                this.f219196h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f219192d) + 0;
            java.lang.String str2 = this.f219193e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            com.tencent.wechat.mm.brand_service.v vVar2 = this.f219194f;
            if (vVar2 != null) {
                e17 += b36.f.e(3, vVar2.f219202d);
            }
            com.tencent.wechat.mm.brand_service.j jVar3 = this.f219195g;
            if (jVar3 != null) {
                e17 += b36.f.i(4, jVar3.computeSize());
            }
            com.tencent.wechat.mm.brand_service.j jVar4 = this.f219196h;
            return jVar4 != null ? e17 + b36.f.i(5, jVar4.computeSize()) : e17;
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
            this.f219192d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f219193e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            int g17 = aVar2.g(intValue);
            this.f219194f = g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.tencent.wechat.mm.brand_service.v.BizShowReddotType_NotShowRedDot : com.tencent.wechat.mm.brand_service.v.BizShowReddotType_ShowUnReadAsRedDot : com.tencent.wechat.mm.brand_service.v.BizShowReddotType_ShowUnReadNum;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.tencent.wechat.mm.brand_service.j jVar5 = new com.tencent.wechat.mm.brand_service.j();
                if (bArr != null && bArr.length > 0) {
                    jVar5.parseFrom(bArr);
                }
                this.f219195g = jVar5;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            com.tencent.wechat.mm.brand_service.j jVar6 = new com.tencent.wechat.mm.brand_service.j();
            if (bArr2 != null && bArr2.length > 0) {
                jVar6.parseFrom(bArr2);
            }
            this.f219196h = jVar6;
        }
        return 0;
    }
}
