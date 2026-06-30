package m53;

/* loaded from: classes2.dex */
public class w1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public m53.h f324140d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f324141e;

    /* renamed from: g, reason: collision with root package name */
    public m53.n3 f324143g;

    /* renamed from: h, reason: collision with root package name */
    public m53.c3 f324144h;

    /* renamed from: i, reason: collision with root package name */
    public m53.y2 f324145i;

    /* renamed from: m, reason: collision with root package name */
    public m53.r4 f324146m;

    /* renamed from: o, reason: collision with root package name */
    public m53.d5 f324148o;

    /* renamed from: p, reason: collision with root package name */
    public m53.b3 f324149p;

    /* renamed from: q, reason: collision with root package name */
    public m53.w2 f324150q;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f324142f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f324147n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.w1)) {
            return false;
        }
        m53.w1 w1Var = (m53.w1) fVar;
        return n51.f.a(this.BaseResponse, w1Var.BaseResponse) && n51.f.a(this.f324140d, w1Var.f324140d) && n51.f.a(this.f324141e, w1Var.f324141e) && n51.f.a(this.f324142f, w1Var.f324142f) && n51.f.a(this.f324143g, w1Var.f324143g) && n51.f.a(this.f324144h, w1Var.f324144h) && n51.f.a(this.f324145i, w1Var.f324145i) && n51.f.a(this.f324146m, w1Var.f324146m) && n51.f.a(this.f324147n, w1Var.f324147n) && n51.f.a(this.f324148o, w1Var.f324148o) && n51.f.a(this.f324149p, w1Var.f324149p) && n51.f.a(this.f324150q, w1Var.f324150q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f324147n;
        java.util.LinkedList linkedList2 = this.f324142f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            m53.h hVar = this.f324140d;
            if (hVar != null) {
                fVar.i(2, hVar.computeSize());
                this.f324140d.writeFields(fVar);
            }
            java.lang.String str = this.f324141e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList2);
            m53.n3 n3Var = this.f324143g;
            if (n3Var != null) {
                fVar.i(5, n3Var.computeSize());
                this.f324143g.writeFields(fVar);
            }
            m53.c3 c3Var = this.f324144h;
            if (c3Var != null) {
                fVar.i(7, c3Var.computeSize());
                this.f324144h.writeFields(fVar);
            }
            m53.y2 y2Var = this.f324145i;
            if (y2Var != null) {
                fVar.i(8, y2Var.computeSize());
                this.f324145i.writeFields(fVar);
            }
            m53.r4 r4Var = this.f324146m;
            if (r4Var != null) {
                fVar.i(9, r4Var.computeSize());
                this.f324146m.writeFields(fVar);
            }
            fVar.g(10, 8, linkedList);
            m53.d5 d5Var = this.f324148o;
            if (d5Var != null) {
                fVar.i(11, d5Var.computeSize());
                this.f324148o.writeFields(fVar);
            }
            m53.b3 b3Var = this.f324149p;
            if (b3Var != null) {
                fVar.i(12, b3Var.computeSize());
                this.f324149p.writeFields(fVar);
            }
            m53.w2 w2Var = this.f324150q;
            if (w2Var != null) {
                fVar.i(13, w2Var.computeSize());
                this.f324150q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0;
            m53.h hVar2 = this.f324140d;
            if (hVar2 != null) {
                i18 += b36.f.i(2, hVar2.computeSize());
            }
            java.lang.String str2 = this.f324141e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList2);
            m53.n3 n3Var2 = this.f324143g;
            if (n3Var2 != null) {
                g17 += b36.f.i(5, n3Var2.computeSize());
            }
            m53.c3 c3Var2 = this.f324144h;
            if (c3Var2 != null) {
                g17 += b36.f.i(7, c3Var2.computeSize());
            }
            m53.y2 y2Var2 = this.f324145i;
            if (y2Var2 != null) {
                g17 += b36.f.i(8, y2Var2.computeSize());
            }
            m53.r4 r4Var2 = this.f324146m;
            if (r4Var2 != null) {
                g17 += b36.f.i(9, r4Var2.computeSize());
            }
            int g18 = g17 + b36.f.g(10, 8, linkedList);
            m53.d5 d5Var2 = this.f324148o;
            if (d5Var2 != null) {
                g18 += b36.f.i(11, d5Var2.computeSize());
            }
            m53.b3 b3Var2 = this.f324149p;
            if (b3Var2 != null) {
                g18 += b36.f.i(12, b3Var2.computeSize());
            }
            m53.w2 w2Var2 = this.f324150q;
            return w2Var2 != null ? g18 + b36.f.i(13, w2Var2.computeSize()) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        m53.w1 w1Var = (m53.w1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    w1Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    m53.h hVar3 = new m53.h();
                    if (bArr3 != null && bArr3.length > 0) {
                        hVar3.parseFrom(bArr3);
                    }
                    w1Var.f324140d = hVar3;
                }
                return 0;
            case 3:
                w1Var.f324141e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    m53.k0 k0Var = new m53.k0();
                    if (bArr4 != null && bArr4.length > 0) {
                        k0Var.parseFrom(bArr4);
                    }
                    w1Var.f324142f.add(k0Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    m53.n3 n3Var3 = new m53.n3();
                    if (bArr5 != null && bArr5.length > 0) {
                        n3Var3.parseFrom(bArr5);
                    }
                    w1Var.f324143g = n3Var3;
                }
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    m53.c3 c3Var3 = new m53.c3();
                    if (bArr6 != null && bArr6.length > 0) {
                        c3Var3.parseFrom(bArr6);
                    }
                    w1Var.f324144h = c3Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    m53.y2 y2Var3 = new m53.y2();
                    if (bArr7 != null && bArr7.length > 0) {
                        y2Var3.parseFrom(bArr7);
                    }
                    w1Var.f324145i = y2Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    m53.r4 r4Var3 = new m53.r4();
                    if (bArr8 != null && bArr8.length > 0) {
                        r4Var3.parseFrom(bArr8);
                    }
                    w1Var.f324146m = r4Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    m53.l0 l0Var = new m53.l0();
                    if (bArr9 != null && bArr9.length > 0) {
                        l0Var.parseFrom(bArr9);
                    }
                    w1Var.f324147n.add(l0Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    m53.d5 d5Var3 = new m53.d5();
                    if (bArr10 != null && bArr10.length > 0) {
                        d5Var3.parseFrom(bArr10);
                    }
                    w1Var.f324148o = d5Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    m53.b3 b3Var3 = new m53.b3();
                    if (bArr11 != null && bArr11.length > 0) {
                        b3Var3.parseFrom(bArr11);
                    }
                    w1Var.f324149p = b3Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr12 = (byte[]) j48.get(i57);
                    m53.w2 w2Var3 = new m53.w2();
                    if (bArr12 != null && bArr12.length > 0) {
                        w2Var3.parseFrom(bArr12);
                    }
                    w1Var.f324150q = w2Var3;
                }
                return 0;
        }
    }
}
