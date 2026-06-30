package r45;

/* loaded from: classes12.dex */
public class j37 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377545d;

    /* renamed from: e, reason: collision with root package name */
    public int f377546e;

    /* renamed from: g, reason: collision with root package name */
    public int f377548g;

    /* renamed from: i, reason: collision with root package name */
    public long f377550i;

    /* renamed from: m, reason: collision with root package name */
    public int f377551m;

    /* renamed from: n, reason: collision with root package name */
    public int f377552n;

    /* renamed from: p, reason: collision with root package name */
    public int f377554p;

    /* renamed from: q, reason: collision with root package name */
    public int f377555q;

    /* renamed from: r, reason: collision with root package name */
    public r45.d37 f377556r;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f377547f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f377549h = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f377553o = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j37)) {
            return false;
        }
        r45.j37 j37Var = (r45.j37) fVar;
        return n51.f.a(this.BaseResponse, j37Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f377545d), java.lang.Integer.valueOf(j37Var.f377545d)) && n51.f.a(java.lang.Integer.valueOf(this.f377546e), java.lang.Integer.valueOf(j37Var.f377546e)) && n51.f.a(this.f377547f, j37Var.f377547f) && n51.f.a(java.lang.Integer.valueOf(this.f377548g), java.lang.Integer.valueOf(j37Var.f377548g)) && n51.f.a(this.f377549h, j37Var.f377549h) && n51.f.a(java.lang.Long.valueOf(this.f377550i), java.lang.Long.valueOf(j37Var.f377550i)) && n51.f.a(java.lang.Integer.valueOf(this.f377551m), java.lang.Integer.valueOf(j37Var.f377551m)) && n51.f.a(java.lang.Integer.valueOf(this.f377552n), java.lang.Integer.valueOf(j37Var.f377552n)) && n51.f.a(this.f377553o, j37Var.f377553o) && n51.f.a(java.lang.Integer.valueOf(this.f377554p), java.lang.Integer.valueOf(j37Var.f377554p)) && n51.f.a(java.lang.Integer.valueOf(this.f377555q), java.lang.Integer.valueOf(j37Var.f377555q)) && n51.f.a(this.f377556r, j37Var.f377556r);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f377553o;
        java.util.LinkedList linkedList2 = this.f377549h;
        java.util.LinkedList linkedList3 = this.f377547f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f377545d);
            fVar.e(3, this.f377546e);
            fVar.g(4, 8, linkedList3);
            fVar.e(5, this.f377548g);
            fVar.g(6, 8, linkedList2);
            fVar.h(7, this.f377550i);
            fVar.e(8, this.f377551m);
            fVar.e(9, this.f377552n);
            fVar.g(10, 8, linkedList);
            fVar.e(11, this.f377554p);
            fVar.e(12, this.f377555q);
            r45.d37 d37Var = this.f377556r;
            if (d37Var != null) {
                fVar.i(13, d37Var.computeSize());
                this.f377556r.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.e(2, this.f377545d) + b36.f.e(3, this.f377546e) + b36.f.g(4, 8, linkedList3) + b36.f.e(5, this.f377548g) + b36.f.g(6, 8, linkedList2) + b36.f.h(7, this.f377550i) + b36.f.e(8, this.f377551m) + b36.f.e(9, this.f377552n) + b36.f.g(10, 8, linkedList) + b36.f.e(11, this.f377554p) + b36.f.e(12, this.f377555q);
            r45.d37 d37Var2 = this.f377556r;
            return d37Var2 != null ? i18 + b36.f.i(13, d37Var2.computeSize()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.j37 j37Var = (r45.j37) objArr[1];
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
                    j37Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                j37Var.f377545d = aVar2.g(intValue);
                return 0;
            case 3:
                j37Var.f377546e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.b27 b27Var = new r45.b27();
                    if (bArr3 != null && bArr3.length > 0) {
                        b27Var.parseFrom(bArr3);
                    }
                    j37Var.f377547f.add(b27Var);
                }
                return 0;
            case 5:
                j37Var.f377548g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.b27 b27Var2 = new r45.b27();
                    if (bArr4 != null && bArr4.length > 0) {
                        b27Var2.parseFrom(bArr4);
                    }
                    j37Var.f377549h.add(b27Var2);
                }
                return 0;
            case 7:
                j37Var.f377550i = aVar2.i(intValue);
                return 0;
            case 8:
                j37Var.f377551m = aVar2.g(intValue);
                return 0;
            case 9:
                j37Var.f377552n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.b27 b27Var3 = new r45.b27();
                    if (bArr5 != null && bArr5.length > 0) {
                        b27Var3.parseFrom(bArr5);
                    }
                    j37Var.f377553o.add(b27Var3);
                }
                return 0;
            case 11:
                j37Var.f377554p = aVar2.g(intValue);
                return 0;
            case 12:
                j37Var.f377555q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.d37 d37Var3 = new r45.d37();
                    if (bArr6 != null && bArr6.length > 0) {
                        d37Var3.parseFrom(bArr6);
                    }
                    j37Var.f377556r = d37Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
