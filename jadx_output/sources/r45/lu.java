package r45;

/* loaded from: classes2.dex */
public class lu extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bz3 f379823d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f379824e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379826g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f379827h;

    /* renamed from: i, reason: collision with root package name */
    public r45.yt5 f379828i;

    /* renamed from: m, reason: collision with root package name */
    public int f379829m;

    /* renamed from: n, reason: collision with root package name */
    public int f379830n;

    /* renamed from: o, reason: collision with root package name */
    public int f379831o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f379832p;

    /* renamed from: q, reason: collision with root package name */
    public r45.rl6 f379833q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f379834r;

    /* renamed from: t, reason: collision with root package name */
    public r45.rl6 f379836t;

    /* renamed from: u, reason: collision with root package name */
    public r45.rl6 f379837u;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f379825f = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f379835s = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lu)) {
            return false;
        }
        r45.lu luVar = (r45.lu) fVar;
        return n51.f.a(this.f379823d, luVar.f379823d) && n51.f.a(this.f379824e, luVar.f379824e) && n51.f.a(this.f379825f, luVar.f379825f) && n51.f.a(this.f379826g, luVar.f379826g) && n51.f.a(this.f379827h, luVar.f379827h) && n51.f.a(this.f379828i, luVar.f379828i) && n51.f.a(java.lang.Integer.valueOf(this.f379829m), java.lang.Integer.valueOf(luVar.f379829m)) && n51.f.a(java.lang.Integer.valueOf(this.f379830n), java.lang.Integer.valueOf(luVar.f379830n)) && n51.f.a(java.lang.Integer.valueOf(this.f379831o), java.lang.Integer.valueOf(luVar.f379831o)) && n51.f.a(this.f379832p, luVar.f379832p) && n51.f.a(this.f379833q, luVar.f379833q) && n51.f.a(this.f379834r, luVar.f379834r) && n51.f.a(this.f379835s, luVar.f379835s) && n51.f.a(this.f379836t, luVar.f379836t) && n51.f.a(this.f379837u, luVar.f379837u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f379835s;
        java.util.LinkedList linkedList2 = this.f379825f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bz3 bz3Var = this.f379823d;
            if (bz3Var != null) {
                fVar.i(1, bz3Var.computeSize());
                this.f379823d.writeFields(fVar);
            }
            r45.rl6 rl6Var = this.f379824e;
            if (rl6Var != null) {
                fVar.i(2, rl6Var.computeSize());
                this.f379824e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList2);
            java.lang.String str = this.f379826g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f379827h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.yt5 yt5Var = this.f379828i;
            if (yt5Var != null) {
                fVar.i(6, yt5Var.computeSize());
                this.f379828i.writeFields(fVar);
            }
            fVar.e(7, this.f379829m);
            fVar.e(8, this.f379830n);
            fVar.e(9, this.f379831o);
            java.lang.String str3 = this.f379832p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            r45.rl6 rl6Var2 = this.f379833q;
            if (rl6Var2 != null) {
                fVar.i(11, rl6Var2.computeSize());
                this.f379833q.writeFields(fVar);
            }
            java.lang.String str4 = this.f379834r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.g(13, 8, linkedList);
            r45.rl6 rl6Var3 = this.f379836t;
            if (rl6Var3 != null) {
                fVar.i(14, rl6Var3.computeSize());
                this.f379836t.writeFields(fVar);
            }
            r45.rl6 rl6Var4 = this.f379837u;
            if (rl6Var4 != null) {
                fVar.i(15, rl6Var4.computeSize());
                this.f379837u.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.bz3 bz3Var2 = this.f379823d;
            int i18 = bz3Var2 != null ? b36.f.i(1, bz3Var2.computeSize()) + 0 : 0;
            r45.rl6 rl6Var5 = this.f379824e;
            if (rl6Var5 != null) {
                i18 += b36.f.i(2, rl6Var5.computeSize());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList2);
            java.lang.String str5 = this.f379826g;
            if (str5 != null) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f379827h;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            r45.yt5 yt5Var2 = this.f379828i;
            if (yt5Var2 != null) {
                g17 += b36.f.i(6, yt5Var2.computeSize());
            }
            int e17 = g17 + b36.f.e(7, this.f379829m) + b36.f.e(8, this.f379830n) + b36.f.e(9, this.f379831o);
            java.lang.String str7 = this.f379832p;
            if (str7 != null) {
                e17 += b36.f.j(10, str7);
            }
            r45.rl6 rl6Var6 = this.f379833q;
            if (rl6Var6 != null) {
                e17 += b36.f.i(11, rl6Var6.computeSize());
            }
            java.lang.String str8 = this.f379834r;
            if (str8 != null) {
                e17 += b36.f.j(12, str8);
            }
            int g18 = e17 + b36.f.g(13, 8, linkedList);
            r45.rl6 rl6Var7 = this.f379836t;
            if (rl6Var7 != null) {
                g18 += b36.f.i(14, rl6Var7.computeSize());
            }
            r45.rl6 rl6Var8 = this.f379837u;
            return rl6Var8 != null ? g18 + b36.f.i(15, rl6Var8.computeSize()) : g18;
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
        r45.lu luVar = (r45.lu) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        bz3Var3.parseFrom(bArr2);
                    }
                    luVar.f379823d = bz3Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.rl6 rl6Var9 = new r45.rl6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rl6Var9.parseFrom(bArr3);
                    }
                    luVar.f379824e = rl6Var9;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.rl6 rl6Var10 = new r45.rl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rl6Var10.parseFrom(bArr4);
                    }
                    luVar.f379825f.add(rl6Var10);
                }
                return 0;
            case 4:
                luVar.f379826g = aVar2.k(intValue);
                return 0;
            case 5:
                luVar.f379827h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr5 != null && bArr5.length > 0) {
                        yt5Var3.parseFrom(bArr5);
                    }
                    luVar.f379828i = yt5Var3;
                }
                return 0;
            case 7:
                luVar.f379829m = aVar2.g(intValue);
                return 0;
            case 8:
                luVar.f379830n = aVar2.g(intValue);
                return 0;
            case 9:
                luVar.f379831o = aVar2.g(intValue);
                return 0;
            case 10:
                luVar.f379832p = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.rl6 rl6Var11 = new r45.rl6();
                    if (bArr6 != null && bArr6.length > 0) {
                        rl6Var11.parseFrom(bArr6);
                    }
                    luVar.f379833q = rl6Var11;
                }
                return 0;
            case 12:
                luVar.f379834r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.dr4 dr4Var = new r45.dr4();
                    if (bArr7 != null && bArr7.length > 0) {
                        dr4Var.parseFrom(bArr7);
                    }
                    luVar.f379835s.add(dr4Var);
                }
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.rl6 rl6Var12 = new r45.rl6();
                    if (bArr8 != null && bArr8.length > 0) {
                        rl6Var12.parseFrom(bArr8);
                    }
                    luVar.f379836t = rl6Var12;
                }
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.rl6 rl6Var13 = new r45.rl6();
                    if (bArr9 != null && bArr9.length > 0) {
                        rl6Var13.parseFrom(bArr9);
                    }
                    luVar.f379837u = rl6Var13;
                }
                return 0;
            default:
                return -1;
        }
    }
}
