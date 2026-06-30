package com.tencent.wechat.aff.chatbot;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.protobuf.f {

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.wechat.aff.chatbot.f f216187q = new com.tencent.wechat.aff.chatbot.f();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.e f216188d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f216189e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.y0 f216190f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.z0 f216191g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.b f216192h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.d f216193i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.c f216194m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f216195n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f216196o;

    /* renamed from: p, reason: collision with root package name */
    public final android.util.ArrayMap f216197p = new android.util.ArrayMap();

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.tencent.wechat.aff.chatbot.f parseFrom(byte[] bArr) {
        return (com.tencent.wechat.aff.chatbot.f) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.wechat.aff.chatbot.f)) {
            return false;
        }
        com.tencent.wechat.aff.chatbot.f fVar2 = (com.tencent.wechat.aff.chatbot.f) fVar;
        return n51.f.a(this.f216188d, fVar2.f216188d) && n51.f.a(this.f216189e, fVar2.f216189e) && n51.f.a(this.f216190f, fVar2.f216190f) && n51.f.a(this.f216191g, fVar2.f216191g) && n51.f.a(this.f216192h, fVar2.f216192h) && n51.f.a(this.f216193i, fVar2.f216193i) && n51.f.a(this.f216194m, fVar2.f216194m) && n51.f.a(java.lang.Boolean.valueOf(this.f216195n), java.lang.Boolean.valueOf(fVar2.f216195n)) && n51.f.a(this.f216196o, fVar2.f216196o);
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f216197p.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.wechat.aff.chatbot.f();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.tencent.wechat.aff.chatbot.e eVar;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f216188d != null && hasFieldNumber(1)) {
                fVar.e(1, this.f216188d.f216170d);
            }
            if (this.f216189e != null && hasFieldNumber(2)) {
                fVar.j(2, this.f216189e);
            }
            if (this.f216190f != null && hasFieldNumber(3)) {
                fVar.i(3, this.f216190f.computeSize());
                this.f216190f.writeFields(fVar);
            }
            if (this.f216191g != null && hasFieldNumber(4)) {
                fVar.i(4, this.f216191g.computeSize());
                this.f216191g.writeFields(fVar);
            }
            if (this.f216192h != null && hasFieldNumber(9)) {
                fVar.i(9, this.f216192h.computeSize());
                this.f216192h.writeFields(fVar);
            }
            if (this.f216193i != null && hasFieldNumber(10)) {
                fVar.i(10, this.f216193i.computeSize());
                this.f216193i.writeFields(fVar);
            }
            if (this.f216194m != null && hasFieldNumber(11)) {
                fVar.i(11, this.f216194m.computeSize());
                this.f216194m.writeFields(fVar);
            }
            if (hasFieldNumber(100)) {
                fVar.a(100, this.f216195n);
            }
            if (this.f216196o != null && hasFieldNumber(101)) {
                fVar.j(101, this.f216196o);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f216188d != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.e(1, this.f216188d.f216170d);
            }
            if (this.f216189e != null && hasFieldNumber(2)) {
                i18 += b36.f.j(2, this.f216189e);
            }
            if (this.f216190f != null && hasFieldNumber(3)) {
                i18 += b36.f.i(3, this.f216190f.computeSize());
            }
            if (this.f216191g != null && hasFieldNumber(4)) {
                i18 += b36.f.i(4, this.f216191g.computeSize());
            }
            if (this.f216192h != null && hasFieldNumber(9)) {
                i18 += b36.f.i(9, this.f216192h.computeSize());
            }
            if (this.f216193i != null && hasFieldNumber(10)) {
                i18 += b36.f.i(10, this.f216193i.computeSize());
            }
            if (this.f216194m != null && hasFieldNumber(11)) {
                i18 += b36.f.i(11, this.f216194m.computeSize());
            }
            if (hasFieldNumber(100)) {
                i18 += b36.f.a(100, this.f216195n);
            }
            return (this.f216196o == null || !hasFieldNumber(101)) ? i18 : i18 + b36.f.j(101, this.f216196o);
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
        android.util.ArrayMap arrayMap = this.f216197p;
        if (intValue == 1) {
            int g17 = aVar2.g(intValue);
            if (g17 == 0) {
                eVar = com.tencent.wechat.aff.chatbot.e.Type_Unknown;
            } else if (g17 == 1) {
                eVar = com.tencent.wechat.aff.chatbot.e.Type_Text;
            } else if (g17 == 2) {
                eVar = com.tencent.wechat.aff.chatbot.e.Type_URL;
            } else if (g17 == 3) {
                eVar = com.tencent.wechat.aff.chatbot.e.Type_Finder;
            } else if (g17 == 4) {
                eVar = com.tencent.wechat.aff.chatbot.e.Type_Remind;
            } else if (g17 == 5) {
                eVar = com.tencent.wechat.aff.chatbot.e.Type_WeApp;
            } else if (g17 == 12) {
                eVar = com.tencent.wechat.aff.chatbot.e.TYPE_BIZ_LIST;
            } else if (g17 != 100) {
                switch (g17) {
                    case 8:
                        eVar = com.tencent.wechat.aff.chatbot.e.TYPE_FAV_STAR;
                        break;
                    case 9:
                        eVar = com.tencent.wechat.aff.chatbot.e.TYPE_EMOJI_LIST;
                        break;
                    case 10:
                        eVar = com.tencent.wechat.aff.chatbot.e.TYPE_CLEAR;
                        break;
                    default:
                        eVar = null;
                        break;
                }
            } else {
                eVar = com.tencent.wechat.aff.chatbot.e.Type_StreamText;
            }
            this.f216188d = eVar;
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f216189e = aVar2.k(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.tencent.wechat.aff.chatbot.y0 y0Var = new com.tencent.wechat.aff.chatbot.y0();
                if (bArr != null && bArr.length > 0) {
                    y0Var.parseFrom(bArr);
                }
                this.f216190f = y0Var;
            }
            arrayMap.put(3, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.tencent.wechat.aff.chatbot.z0 z0Var = new com.tencent.wechat.aff.chatbot.z0();
                if (bArr2 != null && bArr2.length > 0) {
                    z0Var.parseFrom(bArr2);
                }
                this.f216191g = z0Var;
            }
            arrayMap.put(4, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 100) {
            this.f216195n = aVar2.c(intValue);
            arrayMap.put(100, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 101) {
            this.f216196o = aVar2.k(intValue);
            arrayMap.put(101, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.wechat.aff.chatbot.b bVar = new com.tencent.wechat.aff.chatbot.b();
                    if (bArr3 != null && bArr3.length > 0) {
                        bVar.parseFrom(bArr3);
                    }
                    this.f216192h = bVar;
                }
                arrayMap.put(9, java.lang.Boolean.TRUE);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.wechat.aff.chatbot.d dVar = new com.tencent.wechat.aff.chatbot.d();
                    if (bArr4 != null && bArr4.length > 0) {
                        dVar.parseFrom(bArr4);
                    }
                    this.f216193i = dVar;
                }
                arrayMap.put(10, java.lang.Boolean.TRUE);
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.wechat.aff.chatbot.c cVar = new com.tencent.wechat.aff.chatbot.c();
                    if (bArr5 != null && bArr5.length > 0) {
                        cVar.parseFrom(bArr5);
                    }
                    this.f216194m = cVar;
                }
                arrayMap.put(11, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
