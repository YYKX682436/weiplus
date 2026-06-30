package r45;

/* loaded from: classes8.dex */
public class sn3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.lx5 f385856d;

    /* renamed from: e, reason: collision with root package name */
    public r45.bw5 f385857e;

    /* renamed from: f, reason: collision with root package name */
    public r45.aw5 f385858f;

    /* renamed from: g, reason: collision with root package name */
    public r45.qx5 f385859g;

    /* renamed from: h, reason: collision with root package name */
    public r45.rx5 f385860h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ow5 f385861i;

    /* renamed from: m, reason: collision with root package name */
    public r45.pw5 f385862m;

    /* renamed from: n, reason: collision with root package name */
    public r45.lw5 f385863n;

    /* renamed from: o, reason: collision with root package name */
    public r45.zw5 f385864o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sn3)) {
            return false;
        }
        r45.sn3 sn3Var = (r45.sn3) fVar;
        return n51.f.a(this.BaseResponse, sn3Var.BaseResponse) && n51.f.a(this.f385856d, sn3Var.f385856d) && n51.f.a(this.f385857e, sn3Var.f385857e) && n51.f.a(this.f385858f, sn3Var.f385858f) && n51.f.a(this.f385859g, sn3Var.f385859g) && n51.f.a(this.f385860h, sn3Var.f385860h) && n51.f.a(this.f385861i, sn3Var.f385861i) && n51.f.a(this.f385862m, sn3Var.f385862m) && n51.f.a(this.f385863n, sn3Var.f385863n) && n51.f.a(this.f385864o, sn3Var.f385864o);
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
            r45.lx5 lx5Var = this.f385856d;
            if (lx5Var != null) {
                fVar.i(2, lx5Var.computeSize());
                this.f385856d.writeFields(fVar);
            }
            r45.bw5 bw5Var = this.f385857e;
            if (bw5Var != null) {
                fVar.i(3, bw5Var.computeSize());
                this.f385857e.writeFields(fVar);
            }
            r45.aw5 aw5Var = this.f385858f;
            if (aw5Var != null) {
                fVar.i(4, aw5Var.computeSize());
                this.f385858f.writeFields(fVar);
            }
            r45.qx5 qx5Var = this.f385859g;
            if (qx5Var != null) {
                fVar.i(5, qx5Var.computeSize());
                this.f385859g.writeFields(fVar);
            }
            r45.rx5 rx5Var = this.f385860h;
            if (rx5Var != null) {
                fVar.i(6, rx5Var.computeSize());
                this.f385860h.writeFields(fVar);
            }
            r45.ow5 ow5Var = this.f385861i;
            if (ow5Var != null) {
                fVar.i(7, ow5Var.computeSize());
                this.f385861i.writeFields(fVar);
            }
            r45.pw5 pw5Var = this.f385862m;
            if (pw5Var != null) {
                fVar.i(8, pw5Var.computeSize());
                this.f385862m.writeFields(fVar);
            }
            r45.lw5 lw5Var = this.f385863n;
            if (lw5Var != null) {
                fVar.i(9, lw5Var.computeSize());
                this.f385863n.writeFields(fVar);
            }
            r45.zw5 zw5Var = this.f385864o;
            if (zw5Var != null) {
                fVar.i(10, zw5Var.computeSize());
                this.f385864o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.lx5 lx5Var2 = this.f385856d;
            if (lx5Var2 != null) {
                i18 += b36.f.i(2, lx5Var2.computeSize());
            }
            r45.bw5 bw5Var2 = this.f385857e;
            if (bw5Var2 != null) {
                i18 += b36.f.i(3, bw5Var2.computeSize());
            }
            r45.aw5 aw5Var2 = this.f385858f;
            if (aw5Var2 != null) {
                i18 += b36.f.i(4, aw5Var2.computeSize());
            }
            r45.qx5 qx5Var2 = this.f385859g;
            if (qx5Var2 != null) {
                i18 += b36.f.i(5, qx5Var2.computeSize());
            }
            r45.rx5 rx5Var2 = this.f385860h;
            if (rx5Var2 != null) {
                i18 += b36.f.i(6, rx5Var2.computeSize());
            }
            r45.ow5 ow5Var2 = this.f385861i;
            if (ow5Var2 != null) {
                i18 += b36.f.i(7, ow5Var2.computeSize());
            }
            r45.pw5 pw5Var2 = this.f385862m;
            if (pw5Var2 != null) {
                i18 += b36.f.i(8, pw5Var2.computeSize());
            }
            r45.lw5 lw5Var2 = this.f385863n;
            if (lw5Var2 != null) {
                i18 += b36.f.i(9, lw5Var2.computeSize());
            }
            r45.zw5 zw5Var2 = this.f385864o;
            return zw5Var2 != null ? i18 + b36.f.i(10, zw5Var2.computeSize()) : i18;
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
        r45.sn3 sn3Var = (r45.sn3) objArr[1];
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
                    sn3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.lx5 lx5Var3 = new r45.lx5();
                    if (bArr2 != null && bArr2.length > 0) {
                        lx5Var3.parseFrom(bArr2);
                    }
                    sn3Var.f385856d = lx5Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.bw5 bw5Var3 = new r45.bw5();
                    if (bArr3 != null && bArr3.length > 0) {
                        bw5Var3.parseFrom(bArr3);
                    }
                    sn3Var.f385857e = bw5Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.aw5 aw5Var3 = new r45.aw5();
                    if (bArr4 != null && bArr4.length > 0) {
                        aw5Var3.parseFrom(bArr4);
                    }
                    sn3Var.f385858f = aw5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.qx5 qx5Var3 = new r45.qx5();
                    if (bArr5 != null && bArr5.length > 0) {
                        qx5Var3.parseFrom(bArr5);
                    }
                    sn3Var.f385859g = qx5Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.rx5 rx5Var3 = new r45.rx5();
                    if (bArr6 != null && bArr6.length > 0) {
                        rx5Var3.parseFrom(bArr6);
                    }
                    sn3Var.f385860h = rx5Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.ow5 ow5Var3 = new r45.ow5();
                    if (bArr7 != null && bArr7.length > 0) {
                        ow5Var3.parseFrom(bArr7);
                    }
                    sn3Var.f385861i = ow5Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.pw5 pw5Var3 = new r45.pw5();
                    if (bArr8 != null && bArr8.length > 0) {
                        pw5Var3.parseFrom(bArr8);
                    }
                    sn3Var.f385862m = pw5Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.lw5 lw5Var3 = new r45.lw5();
                    if (bArr9 != null && bArr9.length > 0) {
                        lw5Var3.parseFrom(bArr9);
                    }
                    sn3Var.f385863n = lw5Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.zw5 zw5Var3 = new r45.zw5();
                    if (bArr10 != null && bArr10.length > 0) {
                        zw5Var3.parseFrom(bArr10);
                    }
                    sn3Var.f385864o = zw5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public org.json.JSONObject toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.ie ieVar = this.BaseResponse;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "BaseResponse", ieVar, false);
            eVar.d(jSONObject, "Context", this.f385856d, false);
            eVar.d(jSONObject, "BrandFeed", this.f385857e, false);
            eVar.d(jSONObject, "BrandProfile", this.f385858f, false);
            eVar.d(jSONObject, "WeappFeed", this.f385859g, false);
            eVar.d(jSONObject, "WeappProfile", this.f385860h, false);
            eVar.d(jSONObject, "FinderProfile", this.f385861i, false);
            eVar.d(jSONObject, "FinderFeed", this.f385862m, false);
            eVar.d(jSONObject, "Emoticon", this.f385863n, false);
            eVar.d(jSONObject, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_LITE_APP, this.f385864o, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
