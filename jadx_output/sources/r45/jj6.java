package r45;

/* loaded from: classes12.dex */
public class jj6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ew4 f377883d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f377884e;

    /* renamed from: f, reason: collision with root package name */
    public int f377885f;

    /* renamed from: g, reason: collision with root package name */
    public int f377886g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f377887h;

    /* renamed from: i, reason: collision with root package name */
    public int f377888i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f377889m;

    /* renamed from: n, reason: collision with root package name */
    public int f377890n;

    /* renamed from: o, reason: collision with root package name */
    public int f377891o;

    /* renamed from: p, reason: collision with root package name */
    public long f377892p;

    /* renamed from: q, reason: collision with root package name */
    public r45.cx4 f377893q;

    /* renamed from: r, reason: collision with root package name */
    public int f377894r;

    /* renamed from: s, reason: collision with root package name */
    public int f377895s;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jj6)) {
            return false;
        }
        r45.jj6 jj6Var = (r45.jj6) fVar;
        return n51.f.a(this.f377883d, jj6Var.f377883d) && n51.f.a(java.lang.Boolean.valueOf(this.f377884e), java.lang.Boolean.valueOf(jj6Var.f377884e)) && n51.f.a(java.lang.Integer.valueOf(this.f377885f), java.lang.Integer.valueOf(jj6Var.f377885f)) && n51.f.a(java.lang.Integer.valueOf(this.f377886g), java.lang.Integer.valueOf(jj6Var.f377886g)) && n51.f.a(java.lang.Boolean.valueOf(this.f377887h), java.lang.Boolean.valueOf(jj6Var.f377887h)) && n51.f.a(java.lang.Integer.valueOf(this.f377888i), java.lang.Integer.valueOf(jj6Var.f377888i)) && n51.f.a(this.f377889m, jj6Var.f377889m) && n51.f.a(java.lang.Integer.valueOf(this.f377890n), java.lang.Integer.valueOf(jj6Var.f377890n)) && n51.f.a(java.lang.Integer.valueOf(this.f377891o), java.lang.Integer.valueOf(jj6Var.f377891o)) && n51.f.a(java.lang.Long.valueOf(this.f377892p), java.lang.Long.valueOf(jj6Var.f377892p)) && n51.f.a(this.f377893q, jj6Var.f377893q) && n51.f.a(java.lang.Integer.valueOf(this.f377894r), java.lang.Integer.valueOf(jj6Var.f377894r)) && n51.f.a(java.lang.Integer.valueOf(this.f377895s), java.lang.Integer.valueOf(jj6Var.f377895s));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ew4 ew4Var = this.f377883d;
            if (ew4Var != null) {
                fVar.i(1, ew4Var.computeSize());
                this.f377883d.writeFields(fVar);
            }
            fVar.a(2, this.f377884e);
            fVar.e(3, this.f377885f);
            fVar.e(4, this.f377886g);
            fVar.a(5, this.f377887h);
            fVar.e(6, this.f377888i);
            java.lang.String str = this.f377889m;
            if (str != null) {
                fVar.j(7, str);
            }
            fVar.e(8, this.f377890n);
            fVar.e(9, this.f377891o);
            fVar.h(10, this.f377892p);
            r45.cx4 cx4Var = this.f377893q;
            if (cx4Var != null) {
                fVar.i(11, cx4Var.computeSize());
                this.f377893q.writeFields(fVar);
            }
            fVar.e(12, this.f377894r);
            fVar.e(13, this.f377895s);
            return 0;
        }
        if (i17 == 1) {
            r45.ew4 ew4Var2 = this.f377883d;
            int i18 = (ew4Var2 != null ? 0 + b36.f.i(1, ew4Var2.computeSize()) : 0) + b36.f.a(2, this.f377884e) + b36.f.e(3, this.f377885f) + b36.f.e(4, this.f377886g) + b36.f.a(5, this.f377887h) + b36.f.e(6, this.f377888i);
            java.lang.String str2 = this.f377889m;
            if (str2 != null) {
                i18 += b36.f.j(7, str2);
            }
            int e17 = i18 + b36.f.e(8, this.f377890n) + b36.f.e(9, this.f377891o) + b36.f.h(10, this.f377892p);
            r45.cx4 cx4Var2 = this.f377893q;
            if (cx4Var2 != null) {
                e17 += b36.f.i(11, cx4Var2.computeSize());
            }
            return e17 + b36.f.e(12, this.f377894r) + b36.f.e(13, this.f377895s);
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
        r45.jj6 jj6Var = (r45.jj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ew4 ew4Var3 = new r45.ew4();
                    if (bArr != null && bArr.length > 0) {
                        ew4Var3.parseFrom(bArr);
                    }
                    jj6Var.f377883d = ew4Var3;
                }
                return 0;
            case 2:
                jj6Var.f377884e = aVar2.c(intValue);
                return 0;
            case 3:
                jj6Var.f377885f = aVar2.g(intValue);
                return 0;
            case 4:
                jj6Var.f377886g = aVar2.g(intValue);
                return 0;
            case 5:
                jj6Var.f377887h = aVar2.c(intValue);
                return 0;
            case 6:
                jj6Var.f377888i = aVar2.g(intValue);
                return 0;
            case 7:
                jj6Var.f377889m = aVar2.k(intValue);
                return 0;
            case 8:
                jj6Var.f377890n = aVar2.g(intValue);
                return 0;
            case 9:
                jj6Var.f377891o = aVar2.g(intValue);
                return 0;
            case 10:
                jj6Var.f377892p = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cx4 cx4Var3 = new r45.cx4();
                    if (bArr2 != null && bArr2.length > 0) {
                        cx4Var3.parseFrom(bArr2);
                    }
                    jj6Var.f377893q = cx4Var3;
                }
                return 0;
            case 12:
                jj6Var.f377894r = aVar2.g(intValue);
                return 0;
            case 13:
                jj6Var.f377895s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ew4 ew4Var = this.f377883d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "response", ew4Var, false);
            eVar.d(jSONObject, "shouldMergeKeyBuf", java.lang.Boolean.valueOf(this.f377884e), false);
            eVar.d(jSONObject, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(this.f377885f), false);
            eVar.d(jSONObject, "selector", java.lang.Integer.valueOf(this.f377886g), false);
            eVar.d(jSONObject, "isContinue", java.lang.Boolean.valueOf(this.f377887h), false);
            eVar.d(jSONObject, "minSyncHashCode", java.lang.Integer.valueOf(this.f377888i), false);
            eVar.d(jSONObject, "dataId", this.f377889m, false);
            eVar.d(jSONObject, "dataType", java.lang.Integer.valueOf(this.f377890n), false);
            eVar.d(jSONObject, "pushSyncFlag", java.lang.Integer.valueOf(this.f377891o), false);
            eVar.d(jSONObject, "recvTime", java.lang.Long.valueOf(this.f377892p), false);
            eVar.d(jSONObject, "notifySource", this.f377893q, false);
            eVar.d(jSONObject, "lightPushIndex", java.lang.Integer.valueOf(this.f377894r), false);
            eVar.d(jSONObject, "contSyncCnt", java.lang.Integer.valueOf(this.f377895s), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
