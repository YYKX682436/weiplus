package r45;

/* loaded from: classes2.dex */
public class b61 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f370540d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f370541e;

    /* renamed from: f, reason: collision with root package name */
    public int f370542f;

    /* renamed from: g, reason: collision with root package name */
    public int f370543g;

    /* renamed from: h, reason: collision with root package name */
    public int f370544h;

    /* renamed from: i, reason: collision with root package name */
    public int f370545i;

    /* renamed from: m, reason: collision with root package name */
    public int f370546m;

    /* renamed from: n, reason: collision with root package name */
    public r45.tl6 f370547n;

    /* renamed from: o, reason: collision with root package name */
    public int f370548o;

    /* renamed from: p, reason: collision with root package name */
    public r45.a31 f370549p;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b61)) {
            return false;
        }
        r45.b61 b61Var = (r45.b61) fVar;
        return n51.f.a(this.BaseResponse, b61Var.BaseResponse) && n51.f.a(this.f370540d, b61Var.f370540d) && n51.f.a(this.f370541e, b61Var.f370541e) && n51.f.a(java.lang.Integer.valueOf(this.f370542f), java.lang.Integer.valueOf(b61Var.f370542f)) && n51.f.a(java.lang.Integer.valueOf(this.f370543g), java.lang.Integer.valueOf(b61Var.f370543g)) && n51.f.a(java.lang.Integer.valueOf(this.f370544h), java.lang.Integer.valueOf(b61Var.f370544h)) && n51.f.a(java.lang.Integer.valueOf(this.f370545i), java.lang.Integer.valueOf(b61Var.f370545i)) && n51.f.a(java.lang.Integer.valueOf(this.f370546m), java.lang.Integer.valueOf(b61Var.f370546m)) && n51.f.a(this.f370547n, b61Var.f370547n) && n51.f.a(java.lang.Integer.valueOf(this.f370548o), java.lang.Integer.valueOf(b61Var.f370548o)) && n51.f.a(this.f370549p, b61Var.f370549p);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370540d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar = this.f370541e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f370542f);
            fVar.e(5, this.f370543g);
            fVar.e(6, this.f370544h);
            fVar.e(7, this.f370545i);
            fVar.e(8, this.f370546m);
            r45.tl6 tl6Var = this.f370547n;
            if (tl6Var != null) {
                fVar.i(9, tl6Var.computeSize());
                this.f370547n.writeFields(fVar);
            }
            fVar.e(10, this.f370548o);
            r45.a31 a31Var = this.f370549p;
            if (a31Var != null) {
                fVar.i(11, a31Var.computeSize());
                this.f370549p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList);
            com.tencent.mm.protobuf.g gVar2 = this.f370541e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            int e17 = i18 + b36.f.e(4, this.f370542f) + b36.f.e(5, this.f370543g) + b36.f.e(6, this.f370544h) + b36.f.e(7, this.f370545i) + b36.f.e(8, this.f370546m);
            r45.tl6 tl6Var2 = this.f370547n;
            if (tl6Var2 != null) {
                e17 += b36.f.i(9, tl6Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(10, this.f370548o);
            r45.a31 a31Var2 = this.f370549p;
            return a31Var2 != null ? e18 + b36.f.i(11, a31Var2.computeSize()) : e18;
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
        r45.b61 b61Var = (r45.b61) objArr[1];
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
                    b61Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.s21 s21Var = new r45.s21();
                    if (bArr3 != null && bArr3.length > 0) {
                        s21Var.parseFrom(bArr3);
                    }
                    b61Var.f370540d.add(s21Var);
                }
                return 0;
            case 3:
                b61Var.f370541e = aVar2.d(intValue);
                return 0;
            case 4:
                b61Var.f370542f = aVar2.g(intValue);
                return 0;
            case 5:
                b61Var.f370543g = aVar2.g(intValue);
                return 0;
            case 6:
                b61Var.f370544h = aVar2.g(intValue);
                return 0;
            case 7:
                b61Var.f370545i = aVar2.g(intValue);
                return 0;
            case 8:
                b61Var.f370546m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.tl6 tl6Var3 = new r45.tl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        tl6Var3.parseFrom(bArr4);
                    }
                    b61Var.f370547n = tl6Var3;
                }
                return 0;
            case 10:
                b61Var.f370548o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.a31 a31Var3 = new r45.a31();
                    if (bArr5 != null && bArr5.length > 0) {
                        a31Var3.parseFrom(bArr5);
                    }
                    b61Var.f370549p = a31Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
