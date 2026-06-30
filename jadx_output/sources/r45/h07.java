package r45;

/* loaded from: classes2.dex */
public class h07 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.j32 f375730d;

    /* renamed from: f, reason: collision with root package name */
    public int f375732f;

    /* renamed from: h, reason: collision with root package name */
    public int f375734h;

    /* renamed from: o, reason: collision with root package name */
    public int f375738o;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375740q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f375742s;

    /* renamed from: t, reason: collision with root package name */
    public long f375743t;

    /* renamed from: u, reason: collision with root package name */
    public long f375744u;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f375731e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f375733g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f375735i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f375736m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f375737n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f375739p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f375741r = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h07)) {
            return false;
        }
        r45.h07 h07Var = (r45.h07) fVar;
        return n51.f.a(this.f375730d, h07Var.f375730d) && n51.f.a(this.f375731e, h07Var.f375731e) && n51.f.a(java.lang.Integer.valueOf(this.f375732f), java.lang.Integer.valueOf(h07Var.f375732f)) && n51.f.a(this.f375733g, h07Var.f375733g) && n51.f.a(java.lang.Integer.valueOf(this.f375734h), java.lang.Integer.valueOf(h07Var.f375734h)) && n51.f.a(this.f375735i, h07Var.f375735i) && n51.f.a(this.f375736m, h07Var.f375736m) && n51.f.a(this.f375737n, h07Var.f375737n) && n51.f.a(java.lang.Integer.valueOf(this.f375738o), java.lang.Integer.valueOf(h07Var.f375738o)) && n51.f.a(this.f375739p, h07Var.f375739p) && n51.f.a(this.f375740q, h07Var.f375740q) && n51.f.a(this.f375741r, h07Var.f375741r) && n51.f.a(this.f375742s, h07Var.f375742s) && n51.f.a(java.lang.Long.valueOf(this.f375743t), java.lang.Long.valueOf(h07Var.f375743t)) && n51.f.a(java.lang.Long.valueOf(this.f375744u), java.lang.Long.valueOf(h07Var.f375744u));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375741r;
        java.util.LinkedList linkedList2 = this.f375739p;
        java.util.LinkedList linkedList3 = this.f375737n;
        java.util.LinkedList linkedList4 = this.f375736m;
        java.util.LinkedList linkedList5 = this.f375735i;
        java.util.LinkedList linkedList6 = this.f375733g;
        java.util.LinkedList linkedList7 = this.f375731e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.j32 j32Var = this.f375730d;
            if (j32Var != null) {
                fVar.i(1, j32Var.computeSize());
                this.f375730d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList7);
            fVar.e(3, this.f375732f);
            fVar.g(4, 8, linkedList6);
            fVar.e(5, this.f375734h);
            fVar.g(6, 8, linkedList5);
            fVar.g(7, 8, linkedList4);
            fVar.g(8, 8, linkedList3);
            fVar.e(9, this.f375738o);
            fVar.g(10, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar = this.f375740q;
            if (gVar != null) {
                fVar.b(11, gVar);
            }
            fVar.g(12, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f375742s;
            if (gVar2 != null) {
                fVar.b(13, gVar2);
            }
            fVar.h(14, this.f375743t);
            fVar.h(15, this.f375744u);
            return 0;
        }
        if (i17 == 1) {
            r45.j32 j32Var2 = this.f375730d;
            int i18 = (j32Var2 != null ? b36.f.i(1, j32Var2.computeSize()) + 0 : 0) + b36.f.g(2, 8, linkedList7) + b36.f.e(3, this.f375732f) + b36.f.g(4, 8, linkedList6) + b36.f.e(5, this.f375734h) + b36.f.g(6, 8, linkedList5) + b36.f.g(7, 8, linkedList4) + b36.f.g(8, 8, linkedList3) + b36.f.e(9, this.f375738o) + b36.f.g(10, 8, linkedList2);
            com.tencent.mm.protobuf.g gVar3 = this.f375740q;
            if (gVar3 != null) {
                i18 += b36.f.b(11, gVar3);
            }
            int g17 = i18 + b36.f.g(12, 8, linkedList);
            com.tencent.mm.protobuf.g gVar4 = this.f375742s;
            if (gVar4 != null) {
                g17 += b36.f.b(13, gVar4);
            }
            return g17 + b36.f.h(14, this.f375743t) + b36.f.h(15, this.f375744u);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList7.clear();
            linkedList6.clear();
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
        r45.h07 h07Var = (r45.h07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.j32 j32Var3 = new r45.j32();
                    if (bArr2 != null && bArr2.length > 0) {
                        j32Var3.parseFrom(bArr2);
                    }
                    h07Var.f375730d = j32Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                    if (bArr3 != null && bArr3.length > 0) {
                        finderObject.parseFrom(bArr3);
                    }
                    h07Var.f375731e.add(finderObject);
                }
                return 0;
            case 3:
                h07Var.f375732f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = new com.tencent.mm.protocal.protobuf.FinderObject();
                    if (bArr4 != null && bArr4.length > 0) {
                        finderObject2.parseFrom(bArr4);
                    }
                    h07Var.f375733g.add(finderObject2);
                }
                return 0;
            case 5:
                h07Var.f375734h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.lc5 lc5Var = new r45.lc5();
                    if (bArr5 != null && bArr5.length > 0) {
                        lc5Var.parseFrom(bArr5);
                    }
                    h07Var.f375735i.add(lc5Var);
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.lc5 lc5Var2 = new r45.lc5();
                    if (bArr6 != null && bArr6.length > 0) {
                        lc5Var2.parseFrom(bArr6);
                    }
                    h07Var.f375736m.add(lc5Var2);
                }
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = new com.tencent.mm.protocal.protobuf.FinderObject();
                    if (bArr7 != null && bArr7.length > 0) {
                        finderObject3.parseFrom(bArr7);
                    }
                    h07Var.f375737n.add(finderObject3);
                }
                return 0;
            case 9:
                h07Var.f375738o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.dr0 dr0Var = new r45.dr0();
                    if (bArr8 != null && bArr8.length > 0) {
                        dr0Var.parseFrom(bArr8);
                    }
                    h07Var.f375739p.add(dr0Var);
                }
                return 0;
            case 11:
                h07Var.f375740q = aVar2.d(intValue);
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.dr0 dr0Var2 = new r45.dr0();
                    if (bArr9 != null && bArr9.length > 0) {
                        dr0Var2.parseFrom(bArr9);
                    }
                    h07Var.f375741r.add(dr0Var2);
                }
                return 0;
            case 13:
                h07Var.f375742s = aVar2.d(intValue);
                return 0;
            case 14:
                h07Var.f375743t = aVar2.i(intValue);
                return 0;
            case 15:
                h07Var.f375744u = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
