package r45;

/* loaded from: classes8.dex */
public class w97 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f388993e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388994f;

    /* renamed from: g, reason: collision with root package name */
    public int f388995g;

    /* renamed from: h, reason: collision with root package name */
    public long f388996h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f388997i;

    /* renamed from: m, reason: collision with root package name */
    public r45.e64 f388998m;

    /* renamed from: o, reason: collision with root package name */
    public r45.j30 f389000o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f388992d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f388999n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w97)) {
            return false;
        }
        r45.w97 w97Var = (r45.w97) fVar;
        return n51.f.a(this.f388992d, w97Var.f388992d) && n51.f.a(java.lang.Integer.valueOf(this.f388993e), java.lang.Integer.valueOf(w97Var.f388993e)) && n51.f.a(this.f388994f, w97Var.f388994f) && n51.f.a(java.lang.Integer.valueOf(this.f388995g), java.lang.Integer.valueOf(w97Var.f388995g)) && n51.f.a(java.lang.Long.valueOf(this.f388996h), java.lang.Long.valueOf(w97Var.f388996h)) && n51.f.a(this.f388997i, w97Var.f388997i) && n51.f.a(this.f388998m, w97Var.f388998m) && n51.f.a(this.f388999n, w97Var.f388999n) && n51.f.a(this.f389000o, w97Var.f389000o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388999n;
        java.util.LinkedList linkedList2 = this.f388992d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList2);
            fVar.e(2, this.f388993e);
            java.lang.String str = this.f388994f;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f388995g);
            fVar.h(5, this.f388996h);
            java.lang.String str2 = this.f388997i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.e64 e64Var = this.f388998m;
            if (e64Var != null) {
                fVar.i(7, e64Var.computeSize());
                this.f388998m.writeFields(fVar);
            }
            fVar.g(8, 8, linkedList);
            r45.j30 j30Var = this.f389000o;
            if (j30Var != null) {
                fVar.i(9, j30Var.computeSize());
                this.f389000o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList2) + 0 + b36.f.e(2, this.f388993e);
            java.lang.String str3 = this.f388994f;
            if (str3 != null) {
                g17 += b36.f.j(3, str3);
            }
            int e17 = g17 + b36.f.e(4, this.f388995g) + b36.f.h(5, this.f388996h);
            java.lang.String str4 = this.f388997i;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            r45.e64 e64Var2 = this.f388998m;
            if (e64Var2 != null) {
                e17 += b36.f.i(7, e64Var2.computeSize());
            }
            int g18 = e17 + b36.f.g(8, 8, linkedList);
            r45.j30 j30Var2 = this.f389000o;
            return j30Var2 != null ? g18 + b36.f.i(9, j30Var2.computeSize()) : g18;
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
        r45.w97 w97Var = (r45.w97) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                w97Var.f388992d.add(aVar2.k(intValue));
                return 0;
            case 2:
                w97Var.f388993e = aVar2.g(intValue);
                return 0;
            case 3:
                w97Var.f388994f = aVar2.k(intValue);
                return 0;
            case 4:
                w97Var.f388995g = aVar2.g(intValue);
                return 0;
            case 5:
                w97Var.f388996h = aVar2.i(intValue);
                return 0;
            case 6:
                w97Var.f388997i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.e64 e64Var3 = new r45.e64();
                    if (bArr2 != null && bArr2.length > 0) {
                        e64Var3.parseFrom(bArr2);
                    }
                    w97Var.f388998m = e64Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.x50 x50Var = new r45.x50();
                    if (bArr3 != null && bArr3.length > 0) {
                        x50Var.parseFrom(bArr3);
                    }
                    w97Var.f388999n.add(x50Var);
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.j30 j30Var3 = new r45.j30();
                    if (bArr4 != null && bArr4.length > 0) {
                        j30Var3.parseFrom(bArr4);
                    }
                    w97Var.f389000o = j30Var3;
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
            java.util.LinkedList linkedList = this.f388992d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "ConfigKeys", linkedList, false);
            eVar.d(jSONObject, "H5Version", java.lang.Integer.valueOf(this.f388993e), false);
            eVar.d(jSONObject, "Language", this.f388994f, false);
            eVar.d(jSONObject, "Scene", java.lang.Integer.valueOf(this.f388995g), false);
            eVar.d(jSONObject, "BusinessType", java.lang.Long.valueOf(this.f388996h), false);
            eVar.d(jSONObject, "NetType", this.f388997i, false);
            eVar.d(jSONObject, "Location", this.f388998m, false);
            eVar.d(jSONObject, "ExtParams", this.f388999n, false);
            eVar.d(jSONObject, "ChildMode", this.f389000o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
