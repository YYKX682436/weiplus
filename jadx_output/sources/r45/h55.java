package r45;

/* loaded from: classes2.dex */
public class h55 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375857d;

    /* renamed from: e, reason: collision with root package name */
    public r45.fi6 f375858e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f375859f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f375860g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f375861h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f375862i;

    /* renamed from: m, reason: collision with root package name */
    public r45.fi6 f375863m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f375864n;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h55)) {
            return false;
        }
        r45.h55 h55Var = (r45.h55) fVar;
        return n51.f.a(this.BaseResponse, h55Var.BaseResponse) && n51.f.a(this.f375857d, h55Var.f375857d) && n51.f.a(this.f375858e, h55Var.f375858e) && n51.f.a(this.f375859f, h55Var.f375859f) && n51.f.a(this.f375860g, h55Var.f375860g) && n51.f.a(this.f375861h, h55Var.f375861h) && n51.f.a(this.f375862i, h55Var.f375862i) && n51.f.a(this.f375863m, h55Var.f375863m) && n51.f.a(this.f375864n, h55Var.f375864n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f375859f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f375857d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.fi6 fi6Var = this.f375858e;
            if (fi6Var != null) {
                fVar.i(3, fi6Var.computeSize());
                this.f375858e.writeFields(fVar);
            }
            fVar.g(4, 8, linkedList);
            java.lang.String str2 = this.f375860g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f375861h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f375862i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            r45.fi6 fi6Var2 = this.f375863m;
            if (fi6Var2 != null) {
                fVar.i(8, fi6Var2.computeSize());
                this.f375863m.writeFields(fVar);
            }
            java.lang.String str5 = this.f375864n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str6 = this.f375857d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            r45.fi6 fi6Var3 = this.f375858e;
            if (fi6Var3 != null) {
                i18 += b36.f.i(3, fi6Var3.computeSize());
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList);
            java.lang.String str7 = this.f375860g;
            if (str7 != null) {
                g17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f375861h;
            if (str8 != null) {
                g17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f375862i;
            if (str9 != null) {
                g17 += b36.f.j(7, str9);
            }
            r45.fi6 fi6Var4 = this.f375863m;
            if (fi6Var4 != null) {
                g17 += b36.f.i(8, fi6Var4.computeSize());
            }
            java.lang.String str10 = this.f375864n;
            return str10 != null ? g17 + b36.f.j(9, str10) : g17;
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
        r45.h55 h55Var = (r45.h55) objArr[1];
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
                    h55Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                h55Var.f375857d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.fi6 fi6Var5 = new r45.fi6();
                    if (bArr3 != null && bArr3.length > 0) {
                        fi6Var5.parseFrom(bArr3);
                    }
                    h55Var.f375858e = fi6Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.wp wpVar = new r45.wp();
                    if (bArr4 != null && bArr4.length > 0) {
                        wpVar.parseFrom(bArr4);
                    }
                    h55Var.f375859f.add(wpVar);
                }
                return 0;
            case 5:
                h55Var.f375860g = aVar2.k(intValue);
                return 0;
            case 6:
                h55Var.f375861h = aVar2.k(intValue);
                return 0;
            case 7:
                h55Var.f375862i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.fi6 fi6Var6 = new r45.fi6();
                    if (bArr5 != null && bArr5.length > 0) {
                        fi6Var6.parseFrom(bArr5);
                    }
                    h55Var.f375863m = fi6Var6;
                }
                return 0;
            case 9:
                h55Var.f375864n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "SearchId", this.f375857d, false);
            eVar.d(jSONObject, "SugResult", this.f375858e, false);
            eVar.d(jSONObject, "BusinessResults", this.f375859f, false);
            eVar.d(jSONObject, "MoreText", this.f375860g, false);
            eVar.d(jSONObject, "GuideText", this.f375861h, false);
            eVar.d(jSONObject, "PardusInfo", this.f375862i, false);
            eVar.d(jSONObject, "RelatedResult", this.f375863m, false);
            eVar.d(jSONObject, "JsonResult", this.f375864n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
