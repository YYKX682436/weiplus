package r45;

/* loaded from: classes2.dex */
public class z11 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f391583d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391584e;

    /* renamed from: f, reason: collision with root package name */
    public long f391585f;

    /* renamed from: g, reason: collision with root package name */
    public int f391586g;

    /* renamed from: h, reason: collision with root package name */
    public float f391587h;

    /* renamed from: i, reason: collision with root package name */
    public float f391588i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f391589m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f391590n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f391591o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public r45.dx0 f391592p;

    /* renamed from: q, reason: collision with root package name */
    public int f391593q;

    /* renamed from: r, reason: collision with root package name */
    public int f391594r;

    /* renamed from: s, reason: collision with root package name */
    public long f391595s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f391596t;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z11)) {
            return false;
        }
        r45.z11 z11Var = (r45.z11) fVar;
        return n51.f.a(this.BaseRequest, z11Var.BaseRequest) && n51.f.a(this.f391583d, z11Var.f391583d) && n51.f.a(this.f391584e, z11Var.f391584e) && n51.f.a(java.lang.Long.valueOf(this.f391585f), java.lang.Long.valueOf(z11Var.f391585f)) && n51.f.a(java.lang.Integer.valueOf(this.f391586g), java.lang.Integer.valueOf(z11Var.f391586g)) && n51.f.a(java.lang.Float.valueOf(this.f391587h), java.lang.Float.valueOf(z11Var.f391587h)) && n51.f.a(java.lang.Float.valueOf(this.f391588i), java.lang.Float.valueOf(z11Var.f391588i)) && n51.f.a(this.f391589m, z11Var.f391589m) && n51.f.a(this.f391590n, z11Var.f391590n) && n51.f.a(this.f391591o, z11Var.f391591o) && n51.f.a(this.f391592p, z11Var.f391592p) && n51.f.a(java.lang.Integer.valueOf(this.f391593q), java.lang.Integer.valueOf(z11Var.f391593q)) && n51.f.a(java.lang.Integer.valueOf(this.f391594r), java.lang.Integer.valueOf(z11Var.f391594r)) && n51.f.a(java.lang.Long.valueOf(this.f391595s), java.lang.Long.valueOf(z11Var.f391595s)) && n51.f.a(this.f391596t, z11Var.f391596t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391591o;
        java.util.LinkedList linkedList2 = this.f391590n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.kv0 kv0Var = this.f391583d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f391583d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f391584e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.h(4, this.f391585f);
            fVar.e(5, this.f391586g);
            fVar.d(6, this.f391587h);
            fVar.d(7, this.f391588i);
            java.lang.String str = this.f391589m;
            if (str != null) {
                fVar.j(8, str);
            }
            fVar.g(9, 8, linkedList2);
            fVar.g(10, 8, linkedList);
            r45.dx0 dx0Var = this.f391592p;
            if (dx0Var != null) {
                fVar.i(11, dx0Var.computeSize());
                this.f391592p.writeFields(fVar);
            }
            fVar.e(12, this.f391593q);
            fVar.e(13, this.f391594r);
            fVar.h(14, this.f391595s);
            com.tencent.mm.protobuf.g gVar2 = this.f391596t;
            if (gVar2 != null) {
                fVar.b(15, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            r45.kv0 kv0Var2 = this.f391583d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar3 = this.f391584e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int h17 = i18 + b36.f.h(4, this.f391585f) + b36.f.e(5, this.f391586g) + b36.f.d(6, this.f391587h) + b36.f.d(7, this.f391588i);
            java.lang.String str2 = this.f391589m;
            if (str2 != null) {
                h17 += b36.f.j(8, str2);
            }
            int g17 = h17 + b36.f.g(9, 8, linkedList2) + b36.f.g(10, 8, linkedList);
            r45.dx0 dx0Var2 = this.f391592p;
            if (dx0Var2 != null) {
                g17 += b36.f.i(11, dx0Var2.computeSize());
            }
            int e17 = g17 + b36.f.e(12, this.f391593q) + b36.f.e(13, this.f391594r) + b36.f.h(14, this.f391595s);
            com.tencent.mm.protobuf.g gVar4 = this.f391596t;
            return gVar4 != null ? e17 + b36.f.b(15, gVar4) : e17;
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
        r45.z11 z11Var = (r45.z11) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    z11Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kv0Var3.parseFrom(bArr3);
                    }
                    z11Var.f391583d = kv0Var3;
                }
                return 0;
            case 3:
                z11Var.f391584e = aVar2.d(intValue);
                return 0;
            case 4:
                z11Var.f391585f = aVar2.i(intValue);
                return 0;
            case 5:
                z11Var.f391586g = aVar2.g(intValue);
                return 0;
            case 6:
                z11Var.f391587h = aVar2.f(intValue);
                return 0;
            case 7:
                z11Var.f391588i = aVar2.f(intValue);
                return 0;
            case 8:
                z11Var.f391589m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.vd6 vd6Var = new r45.vd6();
                    if (bArr4 != null && bArr4.length > 0) {
                        vd6Var.parseFrom(bArr4);
                    }
                    z11Var.f391590n.add(vd6Var);
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.e13 e13Var = new r45.e13();
                    if (bArr5 != null && bArr5.length > 0) {
                        e13Var.parseFrom(bArr5);
                    }
                    z11Var.f391591o.add(e13Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.dx0 dx0Var3 = new r45.dx0();
                    if (bArr6 != null && bArr6.length > 0) {
                        dx0Var3.parseFrom(bArr6);
                    }
                    z11Var.f391592p = dx0Var3;
                }
                return 0;
            case 12:
                z11Var.f391593q = aVar2.g(intValue);
                return 0;
            case 13:
                z11Var.f391594r = aVar2.g(intValue);
                return 0;
            case 14:
                z11Var.f391595s = aVar2.i(intValue);
                return 0;
            case 15:
                z11Var.f391596t = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
