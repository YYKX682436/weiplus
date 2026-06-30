package r45;

/* loaded from: classes9.dex */
public class i10 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376657d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376658e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376659f;

    /* renamed from: g, reason: collision with root package name */
    public int f376660g;

    public com.tencent.mm.modelbase.i b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 939;
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkmd5";
        lVar.f70664a = this;
        lVar.f70665b = new r45.j10();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        return iVar;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i10)) {
            return false;
        }
        r45.i10 i10Var = (r45.i10) fVar;
        return n51.f.a(this.BaseRequest, i10Var.BaseRequest) && n51.f.a(this.f376657d, i10Var.f376657d) && n51.f.a(this.f376658e, i10Var.f376658e) && n51.f.a(this.f376659f, i10Var.f376659f) && n51.f.a(java.lang.Integer.valueOf(this.f376660g), java.lang.Integer.valueOf(i10Var.f376660g));
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
            java.lang.String str = this.f376657d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f376658e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f376659f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f376660g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f376657d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f376658e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f376659f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            return i18 + b36.f.e(5, this.f376660g);
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
        r45.i10 i10Var = (r45.i10) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                i10Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            i10Var.f376657d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            i10Var.f376658e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            i10Var.f376659f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        i10Var.f376660g = aVar2.g(intValue);
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.he heVar = this.BaseRequest;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseRequest", heVar, false);
            eVar.d(jSONObject, "fileid", this.f376657d, false);
            eVar.d(jSONObject, "md5", this.f376658e, false);
            eVar.d(jSONObject, "newmd5", this.f376659f, false);
            eVar.d(jSONObject, "crc32", java.lang.Integer.valueOf(this.f376660g), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
