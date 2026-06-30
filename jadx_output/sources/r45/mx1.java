package r45;

/* loaded from: classes10.dex */
public class mx1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.yx1 f380881d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f380882e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f380883f;

    /* renamed from: g, reason: collision with root package name */
    public int f380884g;

    /* renamed from: h, reason: collision with root package name */
    public r45.qx1 f380885h;

    /* renamed from: i, reason: collision with root package name */
    public long f380886i;

    /* renamed from: m, reason: collision with root package name */
    public int f380887m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380888n;

    /* renamed from: o, reason: collision with root package name */
    public int f380889o;

    /* renamed from: p, reason: collision with root package name */
    public r45.fw1 f380890p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mx1)) {
            return false;
        }
        r45.mx1 mx1Var = (r45.mx1) fVar;
        return n51.f.a(this.BaseResponse, mx1Var.BaseResponse) && n51.f.a(this.f380881d, mx1Var.f380881d) && n51.f.a(this.f380882e, mx1Var.f380882e) && n51.f.a(java.lang.Integer.valueOf(this.f380883f), java.lang.Integer.valueOf(mx1Var.f380883f)) && n51.f.a(java.lang.Integer.valueOf(this.f380884g), java.lang.Integer.valueOf(mx1Var.f380884g)) && n51.f.a(this.f380885h, mx1Var.f380885h) && n51.f.a(java.lang.Long.valueOf(this.f380886i), java.lang.Long.valueOf(mx1Var.f380886i)) && n51.f.a(java.lang.Integer.valueOf(this.f380887m), java.lang.Integer.valueOf(mx1Var.f380887m)) && n51.f.a(this.f380888n, mx1Var.f380888n) && n51.f.a(java.lang.Integer.valueOf(this.f380889o), java.lang.Integer.valueOf(mx1Var.f380889o)) && n51.f.a(this.f380890p, mx1Var.f380890p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380882e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.yx1 yx1Var = this.f380881d;
            if (yx1Var != null) {
                fVar.i(2, yx1Var.computeSize());
                this.f380881d.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f380883f);
            fVar.e(5, this.f380884g);
            r45.qx1 qx1Var = this.f380885h;
            if (qx1Var != null) {
                fVar.i(6, qx1Var.computeSize());
                this.f380885h.writeFields(fVar);
            }
            fVar.h(7, this.f380886i);
            fVar.e(8, this.f380887m);
            java.lang.String str = this.f380888n;
            if (str != null) {
                fVar.j(9, str);
            }
            fVar.e(10, this.f380889o);
            r45.fw1 fw1Var = this.f380890p;
            if (fw1Var != null) {
                fVar.i(11, fw1Var.computeSize());
                this.f380890p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.yx1 yx1Var2 = this.f380881d;
            if (yx1Var2 != null) {
                i18 += b36.f.i(2, yx1Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f380883f) + b36.f.e(5, this.f380884g);
            r45.qx1 qx1Var2 = this.f380885h;
            if (qx1Var2 != null) {
                g17 += b36.f.i(6, qx1Var2.computeSize());
            }
            int h17 = g17 + b36.f.h(7, this.f380886i) + b36.f.e(8, this.f380887m);
            java.lang.String str2 = this.f380888n;
            if (str2 != null) {
                h17 += b36.f.j(9, str2);
            }
            int e17 = h17 + b36.f.e(10, this.f380889o);
            r45.fw1 fw1Var2 = this.f380890p;
            return fw1Var2 != null ? e17 + b36.f.i(11, fw1Var2.computeSize()) : e17;
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
        r45.mx1 mx1Var = (r45.mx1) objArr[1];
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
                    mx1Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.yx1 yx1Var3 = new r45.yx1();
                    if (bArr3 != null && bArr3.length > 0) {
                        yx1Var3.parseFrom(bArr3);
                    }
                    mx1Var.f380881d = yx1Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.yx1 yx1Var4 = new r45.yx1();
                    if (bArr4 != null && bArr4.length > 0) {
                        yx1Var4.parseFrom(bArr4);
                    }
                    mx1Var.f380882e.add(yx1Var4);
                }
                return 0;
            case 4:
                mx1Var.f380883f = aVar2.g(intValue);
                return 0;
            case 5:
                mx1Var.f380884g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.qx1 qx1Var3 = new r45.qx1();
                    if (bArr5 != null && bArr5.length > 0) {
                        qx1Var3.parseFrom(bArr5);
                    }
                    mx1Var.f380885h = qx1Var3;
                }
                return 0;
            case 7:
                mx1Var.f380886i = aVar2.i(intValue);
                return 0;
            case 8:
                mx1Var.f380887m = aVar2.g(intValue);
                return 0;
            case 9:
                mx1Var.f380888n = aVar2.k(intValue);
                return 0;
            case 10:
                mx1Var.f380889o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.fw1 fw1Var3 = new r45.fw1();
                    if (bArr6 != null && bArr6.length > 0) {
                        fw1Var3.parseFrom(bArr6);
                    }
                    mx1Var.f380890p = fw1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
