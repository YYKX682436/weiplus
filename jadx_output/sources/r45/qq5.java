package r45;

/* loaded from: classes8.dex */
public class qq5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f384205d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f384206e;

    /* renamed from: f, reason: collision with root package name */
    public r45.uq5 f384207f;

    /* renamed from: g, reason: collision with root package name */
    public int f384208g;

    /* renamed from: h, reason: collision with root package name */
    public long f384209h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f384210i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public long f384211m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qq5)) {
            return false;
        }
        r45.qq5 qq5Var = (r45.qq5) fVar;
        return n51.f.a(this.BaseRequest, qq5Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f384205d), java.lang.Integer.valueOf(qq5Var.f384205d)) && n51.f.a(this.f384206e, qq5Var.f384206e) && n51.f.a(this.f384207f, qq5Var.f384207f) && n51.f.a(java.lang.Integer.valueOf(this.f384208g), java.lang.Integer.valueOf(qq5Var.f384208g)) && n51.f.a(java.lang.Long.valueOf(this.f384209h), java.lang.Long.valueOf(qq5Var.f384209h)) && n51.f.a(this.f384210i, qq5Var.f384210i) && n51.f.a(java.lang.Long.valueOf(this.f384211m), java.lang.Long.valueOf(qq5Var.f384211m));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.e(2, this.f384205d);
            java.lang.String str = this.f384206e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.uq5 uq5Var = this.f384207f;
            if (uq5Var != null) {
                fVar.i(4, uq5Var.computeSize());
                this.f384207f.writeFields(fVar);
            }
            fVar.e(5, this.f384208g);
            fVar.h(6, this.f384209h);
            fVar.g(7, 8, this.f384210i);
            fVar.h(8, this.f384211m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f384205d);
            java.lang.String str2 = this.f384206e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.uq5 uq5Var2 = this.f384207f;
            if (uq5Var2 != null) {
                i18 += b36.f.i(4, uq5Var2.computeSize());
            }
            return i18 + b36.f.e(5, this.f384208g) + b36.f.h(6, this.f384209h) + b36.f.g(7, 8, this.f384210i) + b36.f.h(8, this.f384211m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f384210i.clear();
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
        r45.qq5 qq5Var = (r45.qq5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.parseFrom(bArr2);
                    }
                    qq5Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                qq5Var.f384205d = aVar2.g(intValue);
                return 0;
            case 3:
                qq5Var.f384206e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.uq5 uq5Var3 = new r45.uq5();
                    if (bArr3 != null && bArr3.length > 0) {
                        uq5Var3.parseFrom(bArr3);
                    }
                    qq5Var.f384207f = uq5Var3;
                }
                return 0;
            case 5:
                qq5Var.f384208g = aVar2.g(intValue);
                return 0;
            case 6:
                qq5Var.f384209h = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.pq5 pq5Var = new r45.pq5();
                    if (bArr4 != null && bArr4.length > 0) {
                        pq5Var.parseFrom(bArr4);
                    }
                    qq5Var.f384210i.add(pq5Var);
                }
                return 0;
            case 8:
                qq5Var.f384211m = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "business_id", java.lang.Integer.valueOf(this.f384205d), false);
            eVar.d(jSONObject, "version", this.f384206e, false);
            eVar.d(jSONObject, "report_time", this.f384207f, false);
            eVar.d(jSONObject, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_NETWORK_TYPE, java.lang.Integer.valueOf(this.f384208g), false);
            eVar.d(jSONObject, "user_mode_flag", java.lang.Long.valueOf(this.f384209h), false);
            eVar.d(jSONObject, "item_data_list", this.f384210i, false);
            eVar.d(jSONObject, "item_confs_version", java.lang.Long.valueOf(this.f384211m), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
