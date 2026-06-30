package r45;

/* loaded from: classes15.dex */
public class sn6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f385867d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f385868e;

    /* renamed from: f, reason: collision with root package name */
    public int f385869f;

    /* renamed from: g, reason: collision with root package name */
    public int f385870g;

    /* renamed from: h, reason: collision with root package name */
    public int f385871h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f385872i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f385873m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f385874n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sn6)) {
            return false;
        }
        r45.sn6 sn6Var = (r45.sn6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f385867d), java.lang.Integer.valueOf(sn6Var.f385867d)) && n51.f.a(this.f385868e, sn6Var.f385868e) && n51.f.a(java.lang.Integer.valueOf(this.f385869f), java.lang.Integer.valueOf(sn6Var.f385869f)) && n51.f.a(java.lang.Integer.valueOf(this.f385870g), java.lang.Integer.valueOf(sn6Var.f385870g)) && n51.f.a(java.lang.Integer.valueOf(this.f385871h), java.lang.Integer.valueOf(sn6Var.f385871h)) && n51.f.a(this.f385872i, sn6Var.f385872i) && n51.f.a(java.lang.Boolean.valueOf(this.f385873m), java.lang.Boolean.valueOf(sn6Var.f385873m)) && n51.f.a(java.lang.Boolean.valueOf(this.f385874n), java.lang.Boolean.valueOf(sn6Var.f385874n));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385872i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f385867d);
            java.lang.String str = this.f385868e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f385869f);
            fVar.e(4, this.f385870g);
            fVar.e(5, this.f385871h);
            fVar.g(6, 8, linkedList);
            fVar.a(7, this.f385873m);
            fVar.a(8, this.f385874n);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f385867d) + 0;
            java.lang.String str2 = this.f385868e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.e(3, this.f385869f) + b36.f.e(4, this.f385870g) + b36.f.e(5, this.f385871h) + b36.f.g(6, 8, linkedList) + b36.f.a(7, this.f385873m) + b36.f.a(8, this.f385874n);
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
        r45.sn6 sn6Var = (r45.sn6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sn6Var.f385867d = aVar2.g(intValue);
                return 0;
            case 2:
                sn6Var.f385868e = aVar2.k(intValue);
                return 0;
            case 3:
                sn6Var.f385869f = aVar2.g(intValue);
                return 0;
            case 4:
                sn6Var.f385870g = aVar2.g(intValue);
                return 0;
            case 5:
                sn6Var.f385871h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.xn6 xn6Var = new r45.xn6();
                    if (bArr2 != null && bArr2.length > 0) {
                        xn6Var.parseFrom(bArr2);
                    }
                    sn6Var.f385872i.add(xn6Var);
                }
                return 0;
            case 7:
                sn6Var.f385873m = aVar2.c(intValue);
                return 0;
            case 8:
                sn6Var.f385874n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f385867d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "videoSecondType", valueOf, false);
            eVar.d(jSONObject, "originVideoId", this.f385868e, false);
            eVar.d(jSONObject, "insertPos", java.lang.Integer.valueOf(this.f385869f), false);
            eVar.d(jSONObject, "requestDuration", java.lang.Integer.valueOf(this.f385870g), false);
            eVar.d(jSONObject, "requestPercent", java.lang.Integer.valueOf(this.f385871h), false);
            eVar.d(jSONObject, "secondVideoInfoList", this.f385872i, false);
            eVar.d(jSONObject, "isRequest", java.lang.Boolean.valueOf(this.f385873m), false);
            eVar.d(jSONObject, "isShow", java.lang.Boolean.valueOf(this.f385874n), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
