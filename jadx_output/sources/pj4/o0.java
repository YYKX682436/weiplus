package pj4;

/* loaded from: classes11.dex */
public class o0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355213d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f355214e;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f355217h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f355218i;

    /* renamed from: o, reason: collision with root package name */
    public pj4.c0 f355221o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f355222p;

    /* renamed from: q, reason: collision with root package name */
    public pj4.x f355223q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f355224r;

    /* renamed from: s, reason: collision with root package name */
    public int f355225s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f355227u;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f355215f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f355216g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f355219m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f355220n = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f355226t = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.o0)) {
            return false;
        }
        pj4.o0 o0Var = (pj4.o0) fVar;
        return n51.f.a(this.f355213d, o0Var.f355213d) && n51.f.a(this.f355214e, o0Var.f355214e) && n51.f.a(this.f355215f, o0Var.f355215f) && n51.f.a(this.f355216g, o0Var.f355216g) && n51.f.a(this.f355217h, o0Var.f355217h) && n51.f.a(this.f355218i, o0Var.f355218i) && n51.f.a(this.f355219m, o0Var.f355219m) && n51.f.a(this.f355220n, o0Var.f355220n) && n51.f.a(this.f355221o, o0Var.f355221o) && n51.f.a(this.f355222p, o0Var.f355222p) && n51.f.a(this.f355223q, o0Var.f355223q) && n51.f.a(this.f355224r, o0Var.f355224r) && n51.f.a(java.lang.Integer.valueOf(this.f355225s), java.lang.Integer.valueOf(o0Var.f355225s)) && n51.f.a(this.f355226t, o0Var.f355226t) && n51.f.a(this.f355227u, o0Var.f355227u);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355226t;
        java.util.LinkedList linkedList2 = this.f355220n;
        java.util.LinkedList linkedList3 = this.f355215f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f355213d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f355214e;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            fVar.g(13, 1, linkedList3);
            fVar.g(15, 8, this.f355216g);
            java.lang.String str3 = this.f355217h;
            if (str3 != null) {
                fVar.j(16, str3);
            }
            java.lang.String str4 = this.f355218i;
            if (str4 != null) {
                fVar.j(17, str4);
            }
            fVar.g(19, 8, this.f355219m);
            fVar.g(20, 8, linkedList2);
            pj4.c0 c0Var = this.f355221o;
            if (c0Var != null) {
                fVar.i(22, c0Var.computeSize());
                this.f355221o.writeFields(fVar);
            }
            java.lang.String str5 = this.f355222p;
            if (str5 != null) {
                fVar.j(23, str5);
            }
            pj4.x xVar = this.f355223q;
            if (xVar != null) {
                fVar.i(24, xVar.computeSize());
                this.f355223q.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f355224r;
            if (gVar != null) {
                fVar.b(25, gVar);
            }
            fVar.e(26, this.f355225s);
            fVar.g(27, 8, linkedList);
            java.lang.String str6 = this.f355227u;
            if (str6 != null) {
                fVar.j(28, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f355213d;
            int j17 = str7 != null ? b36.f.j(1, str7) + 0 : 0;
            java.lang.String str8 = this.f355214e;
            if (str8 != null) {
                j17 += b36.f.j(10, str8);
            }
            int g17 = j17 + b36.f.g(13, 1, linkedList3) + b36.f.g(15, 8, this.f355216g);
            java.lang.String str9 = this.f355217h;
            if (str9 != null) {
                g17 += b36.f.j(16, str9);
            }
            java.lang.String str10 = this.f355218i;
            if (str10 != null) {
                g17 += b36.f.j(17, str10);
            }
            int g18 = g17 + b36.f.g(19, 8, this.f355219m) + b36.f.g(20, 8, linkedList2);
            pj4.c0 c0Var2 = this.f355221o;
            if (c0Var2 != null) {
                g18 += b36.f.i(22, c0Var2.computeSize());
            }
            java.lang.String str11 = this.f355222p;
            if (str11 != null) {
                g18 += b36.f.j(23, str11);
            }
            pj4.x xVar2 = this.f355223q;
            if (xVar2 != null) {
                g18 += b36.f.i(24, xVar2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f355224r;
            if (gVar2 != null) {
                g18 += b36.f.b(25, gVar2);
            }
            int e17 = g18 + b36.f.e(26, this.f355225s) + b36.f.g(27, 8, linkedList);
            java.lang.String str12 = this.f355227u;
            return str12 != null ? e17 + b36.f.j(28, str12) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            this.f355216g.clear();
            this.f355219m.clear();
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
        pj4.o0 o0Var = (pj4.o0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o0Var.f355213d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 10) {
            o0Var.f355214e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 13) {
            o0Var.f355215f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 19) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                pj4.g0 g0Var = new pj4.g0();
                if (bArr2 != null && bArr2.length > 0) {
                    g0Var.parseFrom(bArr2);
                }
                o0Var.f355219m.add(g0Var);
            }
            return 0;
        }
        if (intValue == 20) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j19.get(i19);
                pj4.i0 i0Var = new pj4.i0();
                if (bArr3 != null && bArr3.length > 0) {
                    i0Var.parseFrom(bArr3);
                }
                o0Var.f355220n.add(i0Var);
            }
            return 0;
        }
        switch (intValue) {
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    pj4.j0 j0Var = new pj4.j0();
                    if (bArr4 != null && bArr4.length > 0) {
                        j0Var.parseFrom(bArr4);
                    }
                    o0Var.f355216g.add(j0Var);
                }
                return 0;
            case 16:
                o0Var.f355217h = aVar2.k(intValue);
                return 0;
            case 17:
                o0Var.f355218i = aVar2.k(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 22:
                        java.util.LinkedList j28 = aVar2.j(intValue);
                        int size4 = j28.size();
                        for (int i28 = 0; i28 < size4; i28++) {
                            byte[] bArr5 = (byte[]) j28.get(i28);
                            pj4.c0 c0Var3 = new pj4.c0();
                            if (bArr5 != null && bArr5.length > 0) {
                                c0Var3.parseFrom(bArr5);
                            }
                            o0Var.f355221o = c0Var3;
                        }
                        return 0;
                    case 23:
                        o0Var.f355222p = aVar2.k(intValue);
                        return 0;
                    case 24:
                        java.util.LinkedList j29 = aVar2.j(intValue);
                        int size5 = j29.size();
                        for (int i29 = 0; i29 < size5; i29++) {
                            byte[] bArr6 = (byte[]) j29.get(i29);
                            pj4.x xVar3 = new pj4.x();
                            if (bArr6 != null && bArr6.length > 0) {
                                xVar3.parseFrom(bArr6);
                            }
                            o0Var.f355223q = xVar3;
                        }
                        return 0;
                    case 25:
                        o0Var.f355224r = aVar2.d(intValue);
                        return 0;
                    case 26:
                        o0Var.f355225s = aVar2.g(intValue);
                        return 0;
                    case 27:
                        java.util.LinkedList j37 = aVar2.j(intValue);
                        int size6 = j37.size();
                        for (int i37 = 0; i37 < size6; i37++) {
                            byte[] bArr7 = (byte[]) j37.get(i37);
                            pj4.x xVar4 = new pj4.x();
                            if (bArr7 != null && bArr7.length > 0) {
                                xVar4.parseFrom(bArr7);
                            }
                            o0Var.f355226t.add(xVar4);
                        }
                        return 0;
                    case 28:
                        o0Var.f355227u = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f355213d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "topicId", str, false);
            eVar.d(jSONObject, "iconId", this.f355214e, false);
            eVar.d(jSONObject, "topics", this.f355215f, false);
            eVar.d(jSONObject, "jumpInfos", this.f355216g, false);
            eVar.d(jSONObject, "verifyInfo", this.f355217h, false);
            eVar.d(jSONObject, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f355218i, false);
            eVar.d(jSONObject, "iconActions", this.f355219m, false);
            eVar.d(jSONObject, "jumpElements", this.f355220n, false);
            eVar.d(jSONObject, "footer", this.f355221o, false);
            eVar.d(jSONObject, "clusterIdDeprecated", this.f355222p, false);
            eVar.d(jSONObject, "clusterPresentDeprecated", this.f355223q, false);
            eVar.d(jSONObject, "deprecatedBuffer", this.f355224r, false);
            eVar.d(jSONObject, "characterSetType", java.lang.Integer.valueOf(this.f355225s), false);
            eVar.d(jSONObject, "clusterPresents", this.f355226t, false);
            eVar.d(jSONObject, "locale", this.f355227u, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
