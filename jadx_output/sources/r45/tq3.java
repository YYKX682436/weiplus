package r45;

/* loaded from: classes12.dex */
public class tq3 extends r45.js5 {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386687g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f386688h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f386689i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f386690m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f386691n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f386692o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f386693p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f386695r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f386696s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f386697t;

    /* renamed from: u, reason: collision with root package name */
    public int f386698u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f386699v;

    /* renamed from: w, reason: collision with root package name */
    public r45.dh7 f386700w;

    /* renamed from: x, reason: collision with root package name */
    public r45.ri5 f386701x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f386702y;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f386684d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f386685e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f386686f = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f386694q = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tq3)) {
            return false;
        }
        r45.tq3 tq3Var = (r45.tq3) fVar;
        return n51.f.a(this.BaseResponse, tq3Var.BaseResponse) && n51.f.a(this.f386684d, tq3Var.f386684d) && n51.f.a(this.f386685e, tq3Var.f386685e) && n51.f.a(this.f386686f, tq3Var.f386686f) && n51.f.a(this.f386687g, tq3Var.f386687g) && n51.f.a(this.f386688h, tq3Var.f386688h) && n51.f.a(this.f386689i, tq3Var.f386689i) && n51.f.a(this.f386690m, tq3Var.f386690m) && n51.f.a(this.f386691n, tq3Var.f386691n) && n51.f.a(java.lang.Boolean.valueOf(this.f386692o), java.lang.Boolean.valueOf(tq3Var.f386692o)) && n51.f.a(this.f386693p, tq3Var.f386693p) && n51.f.a(this.f386694q, tq3Var.f386694q) && n51.f.a(java.lang.Boolean.valueOf(this.f386695r), java.lang.Boolean.valueOf(tq3Var.f386695r)) && n51.f.a(this.f386696s, tq3Var.f386696s) && n51.f.a(java.lang.Boolean.valueOf(this.f386697t), java.lang.Boolean.valueOf(tq3Var.f386697t)) && n51.f.a(java.lang.Integer.valueOf(this.f386698u), java.lang.Integer.valueOf(tq3Var.f386698u)) && n51.f.a(this.f386699v, tq3Var.f386699v) && n51.f.a(this.f386700w, tq3Var.f386700w) && n51.f.a(this.f386701x, tq3Var.f386701x) && n51.f.a(this.f386702y, tq3Var.f386702y);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386694q;
        java.util.LinkedList linkedList2 = this.f386686f;
        java.util.LinkedList linkedList3 = this.f386685e;
        java.util.LinkedList linkedList4 = this.f386684d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList4);
            fVar.g(3, 8, linkedList3);
            fVar.g(4, 1, linkedList2);
            java.lang.String str = this.f386687g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f386688h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f386689i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f386690m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f386691n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.a(10, this.f386692o);
            java.lang.String str6 = this.f386693p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.g(12, 8, linkedList);
            fVar.a(13, this.f386695r);
            java.lang.String str7 = this.f386696s;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.a(15, this.f386697t);
            fVar.e(16, this.f386698u);
            java.lang.String str8 = this.f386699v;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            r45.dh7 dh7Var = this.f386700w;
            if (dh7Var != null) {
                fVar.i(18, dh7Var.computeSize());
                this.f386700w.writeFields(fVar);
            }
            r45.ri5 ri5Var = this.f386701x;
            if (ri5Var != null) {
                fVar.i(19, ri5Var.computeSize());
                this.f386701x.writeFields(fVar);
            }
            java.lang.String str9 = this.f386702y;
            if (str9 != null) {
                fVar.j(20, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.computeSize()) + 0 : 0) + b36.f.g(2, 8, linkedList4) + b36.f.g(3, 8, linkedList3) + b36.f.g(4, 1, linkedList2);
            java.lang.String str10 = this.f386687g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f386688h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f386689i;
            if (str12 != null) {
                i18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f386690m;
            if (str13 != null) {
                i18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f386691n;
            if (str14 != null) {
                i18 += b36.f.j(9, str14);
            }
            int a17 = i18 + b36.f.a(10, this.f386692o);
            java.lang.String str15 = this.f386693p;
            if (str15 != null) {
                a17 += b36.f.j(11, str15);
            }
            int g17 = a17 + b36.f.g(12, 8, linkedList) + b36.f.a(13, this.f386695r);
            java.lang.String str16 = this.f386696s;
            if (str16 != null) {
                g17 += b36.f.j(14, str16);
            }
            int a18 = g17 + b36.f.a(15, this.f386697t) + b36.f.e(16, this.f386698u);
            java.lang.String str17 = this.f386699v;
            if (str17 != null) {
                a18 += b36.f.j(17, str17);
            }
            r45.dh7 dh7Var2 = this.f386700w;
            if (dh7Var2 != null) {
                a18 += b36.f.i(18, dh7Var2.computeSize());
            }
            r45.ri5 ri5Var2 = this.f386701x;
            if (ri5Var2 != null) {
                a18 += b36.f.i(19, ri5Var2.computeSize());
            }
            java.lang.String str18 = this.f386702y;
            return str18 != null ? a18 + b36.f.j(20, str18) : a18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.tq3 tq3Var = (r45.tq3) objArr[1];
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
                    tq3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.dh7 dh7Var3 = new r45.dh7();
                    if (bArr3 != null && bArr3.length > 0) {
                        dh7Var3.parseFrom(bArr3);
                    }
                    tq3Var.f386684d.add(dh7Var3);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.eh7 eh7Var = new r45.eh7();
                    if (bArr4 != null && bArr4.length > 0) {
                        eh7Var.parseFrom(bArr4);
                    }
                    tq3Var.f386685e.add(eh7Var);
                }
                return 0;
            case 4:
                tq3Var.f386686f.add(aVar2.k(intValue));
                return 0;
            case 5:
                tq3Var.f386687g = aVar2.k(intValue);
                return 0;
            case 6:
                tq3Var.f386688h = aVar2.k(intValue);
                return 0;
            case 7:
                tq3Var.f386689i = aVar2.k(intValue);
                return 0;
            case 8:
                tq3Var.f386690m = aVar2.k(intValue);
                return 0;
            case 9:
                tq3Var.f386691n = aVar2.k(intValue);
                return 0;
            case 10:
                tq3Var.f386692o = aVar2.c(intValue);
                return 0;
            case 11:
                tq3Var.f386693p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.e43 e43Var = new r45.e43();
                    if (bArr5 != null && bArr5.length > 0) {
                        e43Var.parseFrom(bArr5);
                    }
                    tq3Var.f386694q.add(e43Var);
                }
                return 0;
            case 13:
                tq3Var.f386695r = aVar2.c(intValue);
                return 0;
            case 14:
                tq3Var.f386696s = aVar2.k(intValue);
                return 0;
            case 15:
                tq3Var.f386697t = aVar2.c(intValue);
                return 0;
            case 16:
                tq3Var.f386698u = aVar2.g(intValue);
                return 0;
            case 17:
                tq3Var.f386699v = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.dh7 dh7Var4 = new r45.dh7();
                    if (bArr6 != null && bArr6.length > 0) {
                        dh7Var4.parseFrom(bArr6);
                    }
                    tq3Var.f386700w = dh7Var4;
                }
                return 0;
            case 19:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ri5 ri5Var3 = new r45.ri5();
                    if (bArr7 != null && bArr7.length > 0) {
                        ri5Var3.parseFrom(bArr7);
                    }
                    tq3Var.f386701x = ri5Var3;
                }
                return 0;
            case 20:
                tq3Var.f386702y = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
