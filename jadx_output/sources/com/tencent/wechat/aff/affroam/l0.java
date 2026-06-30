package com.tencent.wechat.aff.affroam;

/* loaded from: classes7.dex */
public class l0 extends com.tencent.mm.protobuf.f {

    /* renamed from: o, reason: collision with root package name */
    public static final com.tencent.wechat.aff.affroam.l0 f215886o = new com.tencent.wechat.aff.affroam.l0();

    /* renamed from: d, reason: collision with root package name */
    public long f215887d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f215888e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f215889f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f215890g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f215891h = false;

    /* renamed from: i, reason: collision with root package name */
    public long f215892i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f215893m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f215894n = 0;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.affroam.l0)) {
            return false;
        }
        com.tencent.wechat.aff.affroam.l0 l0Var = (com.tencent.wechat.aff.affroam.l0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f215887d), java.lang.Long.valueOf(l0Var.f215887d)) && n51.f.a(java.lang.Long.valueOf(this.f215888e), java.lang.Long.valueOf(l0Var.f215888e)) && n51.f.a(java.lang.Long.valueOf(this.f215889f), java.lang.Long.valueOf(l0Var.f215889f)) && n51.f.a(java.lang.Long.valueOf(this.f215890g), java.lang.Long.valueOf(l0Var.f215890g)) && n51.f.a(java.lang.Boolean.valueOf(this.f215891h), java.lang.Boolean.valueOf(l0Var.f215891h)) && n51.f.a(java.lang.Long.valueOf(this.f215892i), java.lang.Long.valueOf(l0Var.f215892i)) && n51.f.a(java.lang.Long.valueOf(this.f215893m), java.lang.Long.valueOf(l0Var.f215893m)) && n51.f.a(java.lang.Long.valueOf(this.f215894n), java.lang.Long.valueOf(l0Var.f215894n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.affroam.l0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f215887d);
            fVar.h(2, this.f215888e);
            fVar.h(3, this.f215889f);
            fVar.h(4, this.f215890g);
            fVar.a(5, this.f215891h);
            fVar.h(6, this.f215892i);
            fVar.h(7, this.f215893m);
            fVar.h(8, this.f215894n);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f215887d) + 0 + b36.f.h(2, this.f215888e) + b36.f.h(3, this.f215889f) + b36.f.h(4, this.f215890g) + b36.f.a(5, this.f215891h) + b36.f.h(6, this.f215892i) + b36.f.h(7, this.f215893m) + b36.f.h(8, this.f215894n);
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
        switch (intValue) {
            case 1:
                this.f215887d = aVar2.i(intValue);
                return 0;
            case 2:
                this.f215888e = aVar2.i(intValue);
                return 0;
            case 3:
                this.f215889f = aVar2.i(intValue);
                return 0;
            case 4:
                this.f215890g = aVar2.i(intValue);
                return 0;
            case 5:
                this.f215891h = aVar2.c(intValue);
                return 0;
            case 6:
                this.f215892i = aVar2.i(intValue);
                return 0;
            case 7:
                this.f215893m = aVar2.i(intValue);
                return 0;
            case 8:
                this.f215894n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.affroam.l0) super.parseFrom(bArr);
    }
}
