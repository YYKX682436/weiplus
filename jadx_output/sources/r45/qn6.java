package r45;

/* loaded from: classes8.dex */
public class qn6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f384113d;

    /* renamed from: e, reason: collision with root package name */
    public int f384114e;

    /* renamed from: f, reason: collision with root package name */
    public int f384115f;

    /* renamed from: g, reason: collision with root package name */
    public long f384116g;

    /* renamed from: h, reason: collision with root package name */
    public int f384117h;

    /* renamed from: i, reason: collision with root package name */
    public int f384118i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f384119m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f384120n;

    /* renamed from: o, reason: collision with root package name */
    public long f384121o;

    /* renamed from: p, reason: collision with root package name */
    public int f384122p;

    /* renamed from: q, reason: collision with root package name */
    public int f384123q;

    /* renamed from: r, reason: collision with root package name */
    public long f384124r;

    /* renamed from: s, reason: collision with root package name */
    public int f384125s;

    /* renamed from: t, reason: collision with root package name */
    public int f384126t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f384127u;

    /* renamed from: v, reason: collision with root package name */
    public int f384128v;

    /* renamed from: w, reason: collision with root package name */
    public r45.bz2 f384129w;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qn6)) {
            return false;
        }
        r45.qn6 qn6Var = (r45.qn6) fVar;
        return n51.f.a(this.f384113d, qn6Var.f384113d) && n51.f.a(java.lang.Integer.valueOf(this.f384114e), java.lang.Integer.valueOf(qn6Var.f384114e)) && n51.f.a(java.lang.Integer.valueOf(this.f384115f), java.lang.Integer.valueOf(qn6Var.f384115f)) && n51.f.a(java.lang.Long.valueOf(this.f384116g), java.lang.Long.valueOf(qn6Var.f384116g)) && n51.f.a(java.lang.Integer.valueOf(this.f384117h), java.lang.Integer.valueOf(qn6Var.f384117h)) && n51.f.a(java.lang.Integer.valueOf(this.f384118i), java.lang.Integer.valueOf(qn6Var.f384118i)) && n51.f.a(this.f384119m, qn6Var.f384119m) && n51.f.a(this.f384120n, qn6Var.f384120n) && n51.f.a(java.lang.Long.valueOf(this.f384121o), java.lang.Long.valueOf(qn6Var.f384121o)) && n51.f.a(java.lang.Integer.valueOf(this.f384122p), java.lang.Integer.valueOf(qn6Var.f384122p)) && n51.f.a(java.lang.Integer.valueOf(this.f384123q), java.lang.Integer.valueOf(qn6Var.f384123q)) && n51.f.a(java.lang.Long.valueOf(this.f384124r), java.lang.Long.valueOf(qn6Var.f384124r)) && n51.f.a(java.lang.Integer.valueOf(this.f384125s), java.lang.Integer.valueOf(qn6Var.f384125s)) && n51.f.a(java.lang.Integer.valueOf(this.f384126t), java.lang.Integer.valueOf(qn6Var.f384126t)) && n51.f.a(this.f384127u, qn6Var.f384127u) && n51.f.a(java.lang.Integer.valueOf(this.f384128v), java.lang.Integer.valueOf(qn6Var.f384128v)) && n51.f.a(this.f384129w, qn6Var.f384129w);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f384113d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f384114e);
            fVar.e(3, this.f384115f);
            fVar.h(4, this.f384116g);
            fVar.e(5, this.f384117h);
            fVar.e(6, this.f384118i);
            java.lang.String str2 = this.f384119m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f384120n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.h(9, this.f384121o);
            fVar.e(10, this.f384122p);
            fVar.e(11, this.f384123q);
            fVar.h(12, this.f384124r);
            fVar.e(13, this.f384125s);
            fVar.e(14, this.f384126t);
            java.lang.String str4 = this.f384127u;
            if (str4 != null) {
                fVar.j(15, str4);
            }
            fVar.e(16, this.f384128v);
            r45.bz2 bz2Var = this.f384129w;
            if (bz2Var != null) {
                fVar.i(17, bz2Var.computeSize());
                this.f384129w.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f384113d;
            int j17 = (str5 != null ? b36.f.j(1, str5) + 0 : 0) + b36.f.e(2, this.f384114e) + b36.f.e(3, this.f384115f) + b36.f.h(4, this.f384116g) + b36.f.e(5, this.f384117h) + b36.f.e(6, this.f384118i);
            java.lang.String str6 = this.f384119m;
            if (str6 != null) {
                j17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f384120n;
            if (str7 != null) {
                j17 += b36.f.j(8, str7);
            }
            int h17 = j17 + b36.f.h(9, this.f384121o) + b36.f.e(10, this.f384122p) + b36.f.e(11, this.f384123q) + b36.f.h(12, this.f384124r) + b36.f.e(13, this.f384125s) + b36.f.e(14, this.f384126t);
            java.lang.String str8 = this.f384127u;
            if (str8 != null) {
                h17 += b36.f.j(15, str8);
            }
            int e17 = h17 + b36.f.e(16, this.f384128v);
            r45.bz2 bz2Var2 = this.f384129w;
            return bz2Var2 != null ? e17 + b36.f.i(17, bz2Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.qn6 qn6Var = (r45.qn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qn6Var.f384113d = aVar2.k(intValue);
                return 0;
            case 2:
                qn6Var.f384114e = aVar2.g(intValue);
                return 0;
            case 3:
                qn6Var.f384115f = aVar2.g(intValue);
                return 0;
            case 4:
                qn6Var.f384116g = aVar2.i(intValue);
                return 0;
            case 5:
                qn6Var.f384117h = aVar2.g(intValue);
                return 0;
            case 6:
                qn6Var.f384118i = aVar2.g(intValue);
                return 0;
            case 7:
                qn6Var.f384119m = aVar2.k(intValue);
                return 0;
            case 8:
                qn6Var.f384120n = aVar2.k(intValue);
                return 0;
            case 9:
                qn6Var.f384121o = aVar2.i(intValue);
                return 0;
            case 10:
                qn6Var.f384122p = aVar2.g(intValue);
                return 0;
            case 11:
                qn6Var.f384123q = aVar2.g(intValue);
                return 0;
            case 12:
                qn6Var.f384124r = aVar2.i(intValue);
                return 0;
            case 13:
                qn6Var.f384125s = aVar2.g(intValue);
                return 0;
            case 14:
                qn6Var.f384126t = aVar2.g(intValue);
                return 0;
            case 15:
                qn6Var.f384127u = aVar2.k(intValue);
                return 0;
            case 16:
                qn6Var.f384128v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.bz2 bz2Var3 = new r45.bz2();
                    if (bArr != null && bArr.length > 0) {
                        bz2Var3.parseFrom(bArr);
                    }
                    qn6Var.f384129w = bz2Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f384113d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "msgId", str, false);
            eVar.d(jSONObject, "entry", java.lang.Integer.valueOf(this.f384114e), false);
            eVar.d(jSONObject, "clientVer", java.lang.Integer.valueOf(this.f384115f), false);
            eVar.d(jSONObject, "expireTime", java.lang.Long.valueOf(this.f384116g), false);
            eVar.d(jSONObject, "h5Version", java.lang.Integer.valueOf(this.f384117h), false);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f384118i), false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, this.f384119m, false);
            eVar.d(jSONObject, "icon", this.f384120n, false);
            eVar.d(jSONObject, "showTime", java.lang.Long.valueOf(this.f384121o), false);
            eVar.d(jSONObject, "discovery", java.lang.Integer.valueOf(this.f384122p), false);
            eVar.d(jSONObject, "clearFlag", java.lang.Integer.valueOf(this.f384123q), false);
            eVar.d(jSONObject, "receiveTime", java.lang.Long.valueOf(this.f384124r), false);
            eVar.d(jSONObject, "showFlag", java.lang.Integer.valueOf(this.f384125s), false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_SEQ, java.lang.Integer.valueOf(this.f384126t), false);
            eVar.d(jSONObject, "extInfo", this.f384127u, false);
            eVar.d(jSONObject, com.tencent.tmassistantsdk.downloadservice.DownloadInfo.PRIORITY, java.lang.Integer.valueOf(this.f384128v), false);
            eVar.d(jSONObject, "tipsShowInfo", this.f384129w, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
