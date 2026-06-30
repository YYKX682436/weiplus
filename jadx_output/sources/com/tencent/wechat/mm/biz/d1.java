package com.tencent.wechat.mm.biz;

/* loaded from: classes2.dex */
public class d1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.m3 f217953d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.x2 f217954e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.c1 f217955f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.d3 f217956g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.c3 f217957h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.mm.biz.t0 f217958i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f217959m;

    /* renamed from: n, reason: collision with root package name */
    public int f217960n;

    /* renamed from: o, reason: collision with root package name */
    public final android.util.ArrayMap f217961o = new android.util.ArrayMap();

    static {
        new com.tencent.wechat.mm.biz.d1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.biz.d1 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.biz.d1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.biz.d1)) {
            return false;
        }
        com.tencent.wechat.mm.biz.d1 d1Var = (com.tencent.wechat.mm.biz.d1) fVar;
        return n51.f.a(this.f217953d, d1Var.f217953d) && n51.f.a(this.f217954e, d1Var.f217954e) && n51.f.a(this.f217955f, d1Var.f217955f) && n51.f.a(this.f217956g, d1Var.f217956g) && n51.f.a(this.f217957h, d1Var.f217957h) && n51.f.a(this.f217958i, d1Var.f217958i) && n51.f.a(java.lang.Boolean.valueOf(this.f217959m), java.lang.Boolean.valueOf(d1Var.f217959m)) && n51.f.a(java.lang.Integer.valueOf(this.f217960n), java.lang.Integer.valueOf(d1Var.f217960n));
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f217961o.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.biz.d1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f217953d != null && hasFieldNumber(1)) {
                fVar.i(1, this.f217953d.computeSize());
                this.f217953d.writeFields(fVar);
            }
            if (this.f217954e != null && hasFieldNumber(2)) {
                fVar.i(2, this.f217954e.computeSize());
                this.f217954e.writeFields(fVar);
            }
            if (this.f217955f != null && hasFieldNumber(3)) {
                fVar.i(3, this.f217955f.computeSize());
                this.f217955f.writeFields(fVar);
            }
            if (this.f217956g != null && hasFieldNumber(4)) {
                fVar.i(4, this.f217956g.computeSize());
                this.f217956g.writeFields(fVar);
            }
            if (this.f217957h != null && hasFieldNumber(5)) {
                fVar.i(5, this.f217957h.computeSize());
                this.f217957h.writeFields(fVar);
            }
            if (this.f217958i != null && hasFieldNumber(6)) {
                fVar.i(6, this.f217958i.computeSize());
                this.f217958i.writeFields(fVar);
            }
            if (hasFieldNumber(900)) {
                fVar.a(900, this.f217959m);
            }
            if (hasFieldNumber(901)) {
                fVar.e(901, this.f217960n);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f217953d != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.i(1, this.f217953d.computeSize());
            }
            if (this.f217954e != null && hasFieldNumber(2)) {
                i18 += b36.f.i(2, this.f217954e.computeSize());
            }
            if (this.f217955f != null && hasFieldNumber(3)) {
                i18 += b36.f.i(3, this.f217955f.computeSize());
            }
            if (this.f217956g != null && hasFieldNumber(4)) {
                i18 += b36.f.i(4, this.f217956g.computeSize());
            }
            if (this.f217957h != null && hasFieldNumber(5)) {
                i18 += b36.f.i(5, this.f217957h.computeSize());
            }
            if (this.f217958i != null && hasFieldNumber(6)) {
                i18 += b36.f.i(6, this.f217958i.computeSize());
            }
            if (hasFieldNumber(900)) {
                i18 += b36.f.a(900, this.f217959m);
            }
            return hasFieldNumber(901) ? i18 + b36.f.e(901, this.f217960n) : i18;
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
        android.util.ArrayMap arrayMap = this.f217961o;
        if (intValue == 900) {
            this.f217959m = aVar2.c(intValue);
            arrayMap.put(900, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 901) {
            this.f217960n = aVar2.g(intValue);
            arrayMap.put(901, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.mm.biz.m3 m3Var = new com.tencent.wechat.mm.biz.m3();
                    if (bArr != null && bArr.length > 0) {
                        m3Var.parseFrom(bArr);
                    }
                    this.f217953d = m3Var;
                }
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.biz.x2 x2Var = new com.tencent.wechat.mm.biz.x2();
                    if (bArr2 != null && bArr2.length > 0) {
                        x2Var.parseFrom(bArr2);
                    }
                    this.f217954e = x2Var;
                }
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.mm.biz.c1 c1Var = new com.tencent.wechat.mm.biz.c1();
                    if (bArr3 != null && bArr3.length > 0) {
                        c1Var.parseFrom(bArr3);
                    }
                    this.f217955f = c1Var;
                }
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.wechat.mm.biz.d3 d3Var = new com.tencent.wechat.mm.biz.d3();
                    if (bArr4 != null && bArr4.length > 0) {
                        d3Var.parseFrom(bArr4);
                    }
                    this.f217956g = d3Var;
                }
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.wechat.mm.biz.c3 c3Var = new com.tencent.wechat.mm.biz.c3();
                    if (bArr5 != null && bArr5.length > 0) {
                        c3Var.parseFrom(bArr5);
                    }
                    this.f217957h = c3Var;
                }
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.wechat.mm.biz.t0 t0Var = new com.tencent.wechat.mm.biz.t0();
                    if (bArr6 != null && bArr6.length > 0) {
                        t0Var.parseFrom(bArr6);
                    }
                    this.f217958i = t0Var;
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
