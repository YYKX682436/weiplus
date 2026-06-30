package com.tencent.wechat.mm.finder_box;

/* loaded from: classes2.dex */
public class v0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.o2 f219868d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.b2 f219869e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.u0 f219870f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.h2 f219871g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.g2 f219872h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.mm.finder_box.m0 f219873i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f219874m;

    /* renamed from: n, reason: collision with root package name */
    public int f219875n;

    /* renamed from: o, reason: collision with root package name */
    public final android.util.ArrayMap f219876o = new android.util.ArrayMap();

    static {
        new com.tencent.wechat.mm.finder_box.v0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.mm.finder_box.v0 parseFrom(byte[] bArr) {
        return (com.tencent.wechat.mm.finder_box.v0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.mm.finder_box.v0)) {
            return false;
        }
        com.tencent.wechat.mm.finder_box.v0 v0Var = (com.tencent.wechat.mm.finder_box.v0) fVar;
        return n51.f.a(this.f219868d, v0Var.f219868d) && n51.f.a(this.f219869e, v0Var.f219869e) && n51.f.a(this.f219870f, v0Var.f219870f) && n51.f.a(this.f219871g, v0Var.f219871g) && n51.f.a(this.f219872h, v0Var.f219872h) && n51.f.a(this.f219873i, v0Var.f219873i) && n51.f.a(java.lang.Boolean.valueOf(this.f219874m), java.lang.Boolean.valueOf(v0Var.f219874m)) && n51.f.a(java.lang.Integer.valueOf(this.f219875n), java.lang.Integer.valueOf(v0Var.f219875n));
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f219876o.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.mm.finder_box.v0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f219868d != null && hasFieldNumber(1)) {
                fVar.i(1, this.f219868d.computeSize());
                this.f219868d.writeFields(fVar);
            }
            if (this.f219869e != null && hasFieldNumber(2)) {
                fVar.i(2, this.f219869e.computeSize());
                this.f219869e.writeFields(fVar);
            }
            if (this.f219870f != null && hasFieldNumber(3)) {
                fVar.i(3, this.f219870f.computeSize());
                this.f219870f.writeFields(fVar);
            }
            if (this.f219871g != null && hasFieldNumber(4)) {
                fVar.i(4, this.f219871g.computeSize());
                this.f219871g.writeFields(fVar);
            }
            if (this.f219872h != null && hasFieldNumber(5)) {
                fVar.i(5, this.f219872h.computeSize());
                this.f219872h.writeFields(fVar);
            }
            if (this.f219873i != null && hasFieldNumber(6)) {
                fVar.i(6, this.f219873i.computeSize());
                this.f219873i.writeFields(fVar);
            }
            if (hasFieldNumber(900)) {
                fVar.a(900, this.f219874m);
            }
            if (hasFieldNumber(901)) {
                fVar.e(901, this.f219875n);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f219868d != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.i(1, this.f219868d.computeSize());
            }
            if (this.f219869e != null && hasFieldNumber(2)) {
                i18 += b36.f.i(2, this.f219869e.computeSize());
            }
            if (this.f219870f != null && hasFieldNumber(3)) {
                i18 += b36.f.i(3, this.f219870f.computeSize());
            }
            if (this.f219871g != null && hasFieldNumber(4)) {
                i18 += b36.f.i(4, this.f219871g.computeSize());
            }
            if (this.f219872h != null && hasFieldNumber(5)) {
                i18 += b36.f.i(5, this.f219872h.computeSize());
            }
            if (this.f219873i != null && hasFieldNumber(6)) {
                i18 += b36.f.i(6, this.f219873i.computeSize());
            }
            if (hasFieldNumber(900)) {
                i18 += b36.f.a(900, this.f219874m);
            }
            return hasFieldNumber(901) ? i18 + b36.f.e(901, this.f219875n) : i18;
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
        android.util.ArrayMap arrayMap = this.f219876o;
        if (intValue == 900) {
            this.f219874m = aVar2.c(intValue);
            arrayMap.put(900, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 901) {
            this.f219875n = aVar2.g(intValue);
            arrayMap.put(901, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.wechat.mm.finder_box.o2 o2Var = new com.tencent.wechat.mm.finder_box.o2();
                    if (bArr != null && bArr.length > 0) {
                        o2Var.parseFrom(bArr);
                    }
                    this.f219868d = o2Var;
                }
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.wechat.mm.finder_box.b2 b2Var = new com.tencent.wechat.mm.finder_box.b2();
                    if (bArr2 != null && bArr2.length > 0) {
                        b2Var.parseFrom(bArr2);
                    }
                    this.f219869e = b2Var;
                }
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.mm.finder_box.u0 u0Var = new com.tencent.wechat.mm.finder_box.u0();
                    if (bArr3 != null && bArr3.length > 0) {
                        u0Var.parseFrom(bArr3);
                    }
                    this.f219870f = u0Var;
                }
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.wechat.mm.finder_box.h2 h2Var = new com.tencent.wechat.mm.finder_box.h2();
                    if (bArr4 != null && bArr4.length > 0) {
                        h2Var.parseFrom(bArr4);
                    }
                    this.f219871g = h2Var;
                }
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.wechat.mm.finder_box.g2 g2Var = new com.tencent.wechat.mm.finder_box.g2();
                    if (bArr5 != null && bArr5.length > 0) {
                        g2Var.parseFrom(bArr5);
                    }
                    this.f219872h = g2Var;
                }
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.wechat.mm.finder_box.m0 m0Var = new com.tencent.wechat.mm.finder_box.m0();
                    if (bArr6 != null && bArr6.length > 0) {
                        m0Var.parseFrom(bArr6);
                    }
                    this.f219873i = m0Var;
                }
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
