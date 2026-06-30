package r45;

/* loaded from: classes8.dex */
public class k65 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f378438d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f378439e;

    /* renamed from: f, reason: collision with root package name */
    public r45.b77 f378440f;

    /* renamed from: g, reason: collision with root package name */
    public r45.w67 f378441g;

    /* renamed from: h, reason: collision with root package name */
    public r45.p67 f378442h;

    /* renamed from: i, reason: collision with root package name */
    public r45.z67 f378443i;

    /* renamed from: m, reason: collision with root package name */
    public int f378444m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f378445n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f378446o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f378447p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public r45.t67 f378448q;

    /* renamed from: r, reason: collision with root package name */
    public r45.la5 f378449r;

    /* renamed from: s, reason: collision with root package name */
    public r45.x67 f378450s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k65)) {
            return false;
        }
        r45.k65 k65Var = (r45.k65) fVar;
        return n51.f.a(this.BaseResponse, k65Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f378438d), java.lang.Integer.valueOf(k65Var.f378438d)) && n51.f.a(this.f378439e, k65Var.f378439e) && n51.f.a(this.f378440f, k65Var.f378440f) && n51.f.a(this.f378441g, k65Var.f378441g) && n51.f.a(this.f378442h, k65Var.f378442h) && n51.f.a(this.f378443i, k65Var.f378443i) && n51.f.a(java.lang.Integer.valueOf(this.f378444m), java.lang.Integer.valueOf(k65Var.f378444m)) && n51.f.a(java.lang.Boolean.valueOf(this.f378445n), java.lang.Boolean.valueOf(k65Var.f378445n)) && n51.f.a(this.f378446o, k65Var.f378446o) && n51.f.a(this.f378447p, k65Var.f378447p) && n51.f.a(this.f378448q, k65Var.f378448q) && n51.f.a(this.f378449r, k65Var.f378449r) && n51.f.a(this.f378450s, k65Var.f378450s);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f378447p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f378438d);
            java.lang.String str = this.f378439e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.b77 b77Var = this.f378440f;
            if (b77Var != null) {
                fVar.i(4, b77Var.computeSize());
                this.f378440f.writeFields(fVar);
            }
            r45.w67 w67Var = this.f378441g;
            if (w67Var != null) {
                fVar.i(5, w67Var.computeSize());
                this.f378441g.writeFields(fVar);
            }
            r45.p67 p67Var = this.f378442h;
            if (p67Var != null) {
                fVar.i(6, p67Var.computeSize());
                this.f378442h.writeFields(fVar);
            }
            r45.z67 z67Var = this.f378443i;
            if (z67Var != null) {
                fVar.i(7, z67Var.computeSize());
                this.f378443i.writeFields(fVar);
            }
            fVar.e(8, this.f378444m);
            fVar.a(9, this.f378445n);
            java.lang.String str2 = this.f378446o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.g(11, 1, linkedList);
            r45.t67 t67Var = this.f378448q;
            if (t67Var != null) {
                fVar.i(12, t67Var.computeSize());
                this.f378448q.writeFields(fVar);
            }
            r45.la5 la5Var = this.f378449r;
            if (la5Var != null) {
                fVar.i(13, la5Var.computeSize());
                this.f378449r.writeFields(fVar);
            }
            r45.x67 x67Var = this.f378450s;
            if (x67Var != null) {
                fVar.i(14, x67Var.computeSize());
                this.f378450s.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f378438d);
            java.lang.String str3 = this.f378439e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.b77 b77Var2 = this.f378440f;
            if (b77Var2 != null) {
                i18 += b36.f.i(4, b77Var2.computeSize());
            }
            r45.w67 w67Var2 = this.f378441g;
            if (w67Var2 != null) {
                i18 += b36.f.i(5, w67Var2.computeSize());
            }
            r45.p67 p67Var2 = this.f378442h;
            if (p67Var2 != null) {
                i18 += b36.f.i(6, p67Var2.computeSize());
            }
            r45.z67 z67Var2 = this.f378443i;
            if (z67Var2 != null) {
                i18 += b36.f.i(7, z67Var2.computeSize());
            }
            int e17 = i18 + b36.f.e(8, this.f378444m) + b36.f.a(9, this.f378445n);
            java.lang.String str4 = this.f378446o;
            if (str4 != null) {
                e17 += b36.f.j(10, str4);
            }
            int g17 = e17 + b36.f.g(11, 1, linkedList);
            r45.t67 t67Var2 = this.f378448q;
            if (t67Var2 != null) {
                g17 += b36.f.i(12, t67Var2.computeSize());
            }
            r45.la5 la5Var2 = this.f378449r;
            if (la5Var2 != null) {
                g17 += b36.f.i(13, la5Var2.computeSize());
            }
            r45.x67 x67Var2 = this.f378450s;
            return x67Var2 != null ? g17 + b36.f.i(14, x67Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.k65 k65Var = (r45.k65) objArr[1];
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
                    k65Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                k65Var.f378438d = aVar2.g(intValue);
                return 0;
            case 3:
                k65Var.f378439e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.b77 b77Var3 = new r45.b77();
                    if (bArr3 != null && bArr3.length > 0) {
                        b77Var3.parseFrom(bArr3);
                    }
                    k65Var.f378440f = b77Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.w67 w67Var3 = new r45.w67();
                    if (bArr4 != null && bArr4.length > 0) {
                        w67Var3.parseFrom(bArr4);
                    }
                    k65Var.f378441g = w67Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.p67 p67Var3 = new r45.p67();
                    if (bArr5 != null && bArr5.length > 0) {
                        p67Var3.parseFrom(bArr5);
                    }
                    k65Var.f378442h = p67Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.z67 z67Var3 = new r45.z67();
                    if (bArr6 != null && bArr6.length > 0) {
                        z67Var3.parseFrom(bArr6);
                    }
                    k65Var.f378443i = z67Var3;
                }
                return 0;
            case 8:
                k65Var.f378444m = aVar2.g(intValue);
                return 0;
            case 9:
                k65Var.f378445n = aVar2.c(intValue);
                return 0;
            case 10:
                k65Var.f378446o = aVar2.k(intValue);
                return 0;
            case 11:
                k65Var.f378447p.add(aVar2.k(intValue));
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.t67 t67Var3 = new r45.t67();
                    if (bArr7 != null && bArr7.length > 0) {
                        t67Var3.parseFrom(bArr7);
                    }
                    k65Var.f378448q = t67Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.la5 la5Var3 = new r45.la5();
                    if (bArr8 != null && bArr8.length > 0) {
                        la5Var3.parseFrom(bArr8);
                    }
                    k65Var.f378449r = la5Var3;
                }
                return 0;
            case 14:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.x67 x67Var3 = new r45.x67();
                    if (bArr9 != null && bArr9.length > 0) {
                        x67Var3.parseFrom(bArr9);
                    }
                    k65Var.f378450s = x67Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
