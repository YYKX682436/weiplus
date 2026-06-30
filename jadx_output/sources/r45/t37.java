package r45;

/* loaded from: classes14.dex */
public class t37 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.s37 f386112d;

    /* renamed from: e, reason: collision with root package name */
    public r45.s37 f386113e;

    /* renamed from: f, reason: collision with root package name */
    public r45.s37 f386114f;

    /* renamed from: g, reason: collision with root package name */
    public r45.s37 f386115g;

    /* renamed from: h, reason: collision with root package name */
    public long f386116h;

    /* renamed from: i, reason: collision with root package name */
    public r45.s37 f386117i;

    /* renamed from: m, reason: collision with root package name */
    public int f386118m;

    /* renamed from: o, reason: collision with root package name */
    public int f386120o;

    /* renamed from: q, reason: collision with root package name */
    public int f386122q;

    /* renamed from: s, reason: collision with root package name */
    public int f386124s;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f386119n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f386121p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f386123r = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f386125t = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t37)) {
            return false;
        }
        r45.t37 t37Var = (r45.t37) fVar;
        return n51.f.a(this.BaseRequest, t37Var.BaseRequest) && n51.f.a(this.f386112d, t37Var.f386112d) && n51.f.a(this.f386113e, t37Var.f386113e) && n51.f.a(this.f386114f, t37Var.f386114f) && n51.f.a(this.f386115g, t37Var.f386115g) && n51.f.a(java.lang.Long.valueOf(this.f386116h), java.lang.Long.valueOf(t37Var.f386116h)) && n51.f.a(this.f386117i, t37Var.f386117i) && n51.f.a(java.lang.Integer.valueOf(this.f386118m), java.lang.Integer.valueOf(t37Var.f386118m)) && n51.f.a(this.f386119n, t37Var.f386119n) && n51.f.a(java.lang.Integer.valueOf(this.f386120o), java.lang.Integer.valueOf(t37Var.f386120o)) && n51.f.a(this.f386121p, t37Var.f386121p) && n51.f.a(java.lang.Integer.valueOf(this.f386122q), java.lang.Integer.valueOf(t37Var.f386122q)) && n51.f.a(this.f386123r, t37Var.f386123r) && n51.f.a(java.lang.Integer.valueOf(this.f386124s), java.lang.Integer.valueOf(t37Var.f386124s)) && n51.f.a(this.f386125t, t37Var.f386125t);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            r45.s37 s37Var = this.f386112d;
            if (s37Var != null) {
                fVar.i(2, s37Var.computeSize());
                this.f386112d.writeFields(fVar);
            }
            r45.s37 s37Var2 = this.f386113e;
            if (s37Var2 != null) {
                fVar.i(3, s37Var2.computeSize());
                this.f386113e.writeFields(fVar);
            }
            r45.s37 s37Var3 = this.f386114f;
            if (s37Var3 != null) {
                fVar.i(4, s37Var3.computeSize());
                this.f386114f.writeFields(fVar);
            }
            r45.s37 s37Var4 = this.f386115g;
            if (s37Var4 != null) {
                fVar.i(5, s37Var4.computeSize());
                this.f386115g.writeFields(fVar);
            }
            fVar.h(6, this.f386116h);
            r45.s37 s37Var5 = this.f386117i;
            if (s37Var5 != null) {
                fVar.i(7, s37Var5.computeSize());
                this.f386117i.writeFields(fVar);
            }
            fVar.e(8, this.f386118m);
            fVar.g(9, 8, this.f386119n);
            fVar.e(10, this.f386120o);
            fVar.g(11, 8, this.f386121p);
            fVar.e(12, this.f386122q);
            fVar.g(13, 8, this.f386123r);
            fVar.e(14, this.f386124s);
            fVar.g(15, 8, this.f386125t);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.computeSize()) + 0 : 0;
            r45.s37 s37Var6 = this.f386112d;
            if (s37Var6 != null) {
                i18 += b36.f.i(2, s37Var6.computeSize());
            }
            r45.s37 s37Var7 = this.f386113e;
            if (s37Var7 != null) {
                i18 += b36.f.i(3, s37Var7.computeSize());
            }
            r45.s37 s37Var8 = this.f386114f;
            if (s37Var8 != null) {
                i18 += b36.f.i(4, s37Var8.computeSize());
            }
            r45.s37 s37Var9 = this.f386115g;
            if (s37Var9 != null) {
                i18 += b36.f.i(5, s37Var9.computeSize());
            }
            int h17 = i18 + b36.f.h(6, this.f386116h);
            r45.s37 s37Var10 = this.f386117i;
            if (s37Var10 != null) {
                h17 += b36.f.i(7, s37Var10.computeSize());
            }
            return h17 + b36.f.e(8, this.f386118m) + b36.f.g(9, 8, this.f386119n) + b36.f.e(10, this.f386120o) + b36.f.g(11, 8, this.f386121p) + b36.f.e(12, this.f386122q) + b36.f.g(13, 8, this.f386123r) + b36.f.e(14, this.f386124s) + b36.f.g(15, 8, this.f386125t);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f386119n.clear();
            this.f386121p.clear();
            this.f386123r.clear();
            this.f386125t.clear();
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
        r45.t37 t37Var = (r45.t37) objArr[1];
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
                    t37Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.s37 s37Var11 = new r45.s37();
                    if (bArr3 != null && bArr3.length > 0) {
                        s37Var11.parseFrom(bArr3);
                    }
                    t37Var.f386112d = s37Var11;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.s37 s37Var12 = new r45.s37();
                    if (bArr4 != null && bArr4.length > 0) {
                        s37Var12.parseFrom(bArr4);
                    }
                    t37Var.f386113e = s37Var12;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.s37 s37Var13 = new r45.s37();
                    if (bArr5 != null && bArr5.length > 0) {
                        s37Var13.parseFrom(bArr5);
                    }
                    t37Var.f386114f = s37Var13;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.s37 s37Var14 = new r45.s37();
                    if (bArr6 != null && bArr6.length > 0) {
                        s37Var14.parseFrom(bArr6);
                    }
                    t37Var.f386115g = s37Var14;
                }
                return 0;
            case 6:
                t37Var.f386116h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.s37 s37Var15 = new r45.s37();
                    if (bArr7 != null && bArr7.length > 0) {
                        s37Var15.parseFrom(bArr7);
                    }
                    t37Var.f386117i = s37Var15;
                }
                return 0;
            case 8:
                t37Var.f386118m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr8 != null && bArr8.length > 0) {
                        du5Var.b(bArr8);
                    }
                    t37Var.f386119n.add(du5Var);
                }
                return 0;
            case 10:
                t37Var.f386120o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr9 != null && bArr9.length > 0) {
                        du5Var2.b(bArr9);
                    }
                    t37Var.f386121p.add(du5Var2);
                }
                return 0;
            case 12:
                t37Var.f386122q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr10 = (byte[]) j39.get(i48);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr10 != null && bArr10.length > 0) {
                        du5Var3.b(bArr10);
                    }
                    t37Var.f386123r.add(du5Var3);
                }
                return 0;
            case 14:
                t37Var.f386124s = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr11 = (byte[]) j47.get(i49);
                    r45.du5 du5Var4 = new r45.du5();
                    if (bArr11 != null && bArr11.length > 0) {
                        du5Var4.b(bArr11);
                    }
                    t37Var.f386125t.add(du5Var4);
                }
                return 0;
            default:
                return -1;
        }
    }
}
