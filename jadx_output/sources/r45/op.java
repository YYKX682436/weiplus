package r45;

/* loaded from: classes2.dex */
public class op extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f382401d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382402e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f382403f;

    /* renamed from: g, reason: collision with root package name */
    public r45.rp f382404g;

    /* renamed from: h, reason: collision with root package name */
    public r45.sp f382405h;

    /* renamed from: i, reason: collision with root package name */
    public r45.jp f382406i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.op)) {
            return false;
        }
        r45.op opVar = (r45.op) fVar;
        return n51.f.a(this.f382401d, opVar.f382401d) && n51.f.a(this.f382402e, opVar.f382402e) && n51.f.a(this.f382403f, opVar.f382403f) && n51.f.a(this.f382404g, opVar.f382404g) && n51.f.a(this.f382405h, opVar.f382405h) && n51.f.a(this.f382406i, opVar.f382406i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f382401d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f382402e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f382403f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            r45.rp rpVar = this.f382404g;
            if (rpVar != null) {
                fVar.i(4, rpVar.computeSize());
                this.f382404g.writeFields(fVar);
            }
            r45.sp spVar = this.f382405h;
            if (spVar != null) {
                fVar.i(5, spVar.computeSize());
                this.f382405h.writeFields(fVar);
            }
            r45.jp jpVar = this.f382406i;
            if (jpVar != null) {
                fVar.i(6, jpVar.computeSize());
                this.f382406i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f382401d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f382402e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f382403f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            r45.rp rpVar2 = this.f382404g;
            if (rpVar2 != null) {
                j17 += b36.f.i(4, rpVar2.computeSize());
            }
            r45.sp spVar2 = this.f382405h;
            if (spVar2 != null) {
                j17 += b36.f.i(5, spVar2.computeSize());
            }
            r45.jp jpVar2 = this.f382406i;
            return jpVar2 != null ? j17 + b36.f.i(6, jpVar2.computeSize()) : j17;
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
        r45.op opVar = (r45.op) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                opVar.f382401d = aVar2.k(intValue);
                return 0;
            case 2:
                opVar.f382402e = aVar2.k(intValue);
                return 0;
            case 3:
                opVar.f382403f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.rp rpVar3 = new r45.rp();
                    if (bArr != null && bArr.length > 0) {
                        rpVar3.parseFrom(bArr);
                    }
                    opVar.f382404g = rpVar3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.sp spVar3 = new r45.sp();
                    if (bArr2 != null && bArr2.length > 0) {
                        spVar3.parseFrom(bArr2);
                    }
                    opVar.f382405h = spVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.jp jpVar3 = new r45.jp();
                    if (bArr3 != null && bArr3.length > 0) {
                        jpVar3.parseFrom(bArr3);
                    }
                    opVar.f382406i = jpVar3;
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
            java.lang.String str = this.f382401d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Title", str, false);
            eVar.d(jSONObject, "Desc", this.f382402e, false);
            eVar.d(jSONObject, "ThumbUrl", this.f382403f, false);
            eVar.d(jSONObject, "DetailInfo", this.f382404g, false);
            eVar.d(jSONObject, "ExtendInfo", this.f382405h, false);
            eVar.d(jSONObject, "ActionInfo", this.f382406i, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
