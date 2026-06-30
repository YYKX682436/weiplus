package r45;

/* loaded from: classes11.dex */
public class vx6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f388648d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f388649e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f388650f;

    /* renamed from: g, reason: collision with root package name */
    public r45.du5 f388651g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f388652h;

    /* renamed from: i, reason: collision with root package name */
    public r45.cu5 f388653i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f388654m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f388655n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f388656o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vx6)) {
            return false;
        }
        r45.vx6 vx6Var = (r45.vx6) fVar;
        return n51.f.a(this.BaseResponse, vx6Var.BaseResponse) && n51.f.a(this.f388648d, vx6Var.f388648d) && n51.f.a(this.f388649e, vx6Var.f388649e) && n51.f.a(this.f388650f, vx6Var.f388650f) && n51.f.a(this.f388651g, vx6Var.f388651g) && n51.f.a(this.f388652h, vx6Var.f388652h) && n51.f.a(this.f388653i, vx6Var.f388653i) && n51.f.a(this.f388654m, vx6Var.f388654m) && n51.f.a(this.f388655n, vx6Var.f388655n) && n51.f.a(this.f388656o, vx6Var.f388656o);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            r45.du5 du5Var = this.f388648d;
            if (du5Var != null) {
                fVar.i(2, du5Var.computeSize());
                this.f388648d.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f388649e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f388649e.writeFields(fVar);
            }
            java.lang.String str = this.f388650f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.du5 du5Var2 = this.f388651g;
            if (du5Var2 != null) {
                fVar.i(5, du5Var2.computeSize());
                this.f388651g.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f388652h;
            if (cu5Var2 != null) {
                fVar.i(6, cu5Var2.computeSize());
                this.f388652h.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f388653i;
            if (cu5Var3 != null) {
                fVar.i(7, cu5Var3.computeSize());
                this.f388653i.writeFields(fVar);
            }
            java.lang.String str2 = this.f388654m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            r45.cu5 cu5Var4 = this.f388655n;
            if (cu5Var4 != null) {
                fVar.i(9, cu5Var4.computeSize());
                this.f388655n.writeFields(fVar);
            }
            r45.cu5 cu5Var5 = this.f388656o;
            if (cu5Var5 != null) {
                fVar.i(10, cu5Var5.computeSize());
                this.f388656o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.du5 du5Var3 = this.f388648d;
            if (du5Var3 != null) {
                i18 += b36.f.i(2, du5Var3.computeSize());
            }
            r45.cu5 cu5Var6 = this.f388649e;
            if (cu5Var6 != null) {
                i18 += b36.f.i(3, cu5Var6.computeSize());
            }
            java.lang.String str3 = this.f388650f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            r45.du5 du5Var4 = this.f388651g;
            if (du5Var4 != null) {
                i18 += b36.f.i(5, du5Var4.computeSize());
            }
            r45.cu5 cu5Var7 = this.f388652h;
            if (cu5Var7 != null) {
                i18 += b36.f.i(6, cu5Var7.computeSize());
            }
            r45.cu5 cu5Var8 = this.f388653i;
            if (cu5Var8 != null) {
                i18 += b36.f.i(7, cu5Var8.computeSize());
            }
            java.lang.String str4 = this.f388654m;
            if (str4 != null) {
                i18 += b36.f.j(8, str4);
            }
            r45.cu5 cu5Var9 = this.f388655n;
            if (cu5Var9 != null) {
                i18 += b36.f.i(9, cu5Var9.computeSize());
            }
            r45.cu5 cu5Var10 = this.f388656o;
            return cu5Var10 != null ? i18 + b36.f.i(10, cu5Var10.computeSize()) : i18;
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
        r45.vx6 vx6Var = (r45.vx6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    vx6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var5 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var5.b(bArr2);
                    }
                    vx6Var.f388648d = du5Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var11.b(bArr3);
                    }
                    vx6Var.f388649e = cu5Var11;
                }
                return 0;
            case 4:
                vx6Var.f388650f = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.du5 du5Var6 = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var6.b(bArr4);
                    }
                    vx6Var.f388651g = du5Var6;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var12.b(bArr5);
                    }
                    vx6Var.f388652h = cu5Var12;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.cu5 cu5Var13 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var13.b(bArr6);
                    }
                    vx6Var.f388653i = cu5Var13;
                }
                return 0;
            case 8:
                vx6Var.f388654m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var14 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var14.b(bArr7);
                    }
                    vx6Var.f388655n = cu5Var14;
                }
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.cu5 cu5Var15 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var15.b(bArr8);
                    }
                    vx6Var.f388656o = cu5Var15;
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
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "ImgSid", this.f388648d, false);
            eVar.d(jSONObject, "ImgBuf", this.f388649e, false);
            eVar.d(jSONObject, "Ticket", this.f388650f, false);
            eVar.d(jSONObject, "ImgEncryptKey", this.f388651g, false);
            eVar.d(jSONObject, "A2Key", this.f388652h, false);
            eVar.d(jSONObject, "KSid", this.f388653i, false);
            eVar.d(jSONObject, "AuthKey", this.f388654m, false);
            eVar.d(jSONObject, "WTLoginRspBuff", this.f388655n, false);
            eVar.d(jSONObject, "AutoAuthKey", this.f388656o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
