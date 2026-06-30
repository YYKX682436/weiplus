package r45;

/* loaded from: classes11.dex */
public class oh0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.mh0 f382254d;

    /* renamed from: e, reason: collision with root package name */
    public r45.dh0 f382255e;

    /* renamed from: f, reason: collision with root package name */
    public r45.eh0 f382256f;

    /* renamed from: g, reason: collision with root package name */
    public r45.xg0 f382257g;

    /* renamed from: h, reason: collision with root package name */
    public r45.jh0 f382258h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ah0 f382259i;

    /* renamed from: m, reason: collision with root package name */
    public r45.fh0 f382260m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ih0 f382261n;

    /* renamed from: o, reason: collision with root package name */
    public r45.bh0 f382262o;

    /* renamed from: p, reason: collision with root package name */
    public r45.kh0 f382263p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ph0 f382264q;

    /* renamed from: r, reason: collision with root package name */
    public r45.hh0 f382265r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oh0)) {
            return false;
        }
        r45.oh0 oh0Var = (r45.oh0) fVar;
        return n51.f.a(this.BaseResponse, oh0Var.BaseResponse) && n51.f.a(this.f382254d, oh0Var.f382254d) && n51.f.a(this.f382255e, oh0Var.f382255e) && n51.f.a(this.f382256f, oh0Var.f382256f) && n51.f.a(this.f382257g, oh0Var.f382257g) && n51.f.a(this.f382258h, oh0Var.f382258h) && n51.f.a(this.f382259i, oh0Var.f382259i) && n51.f.a(this.f382260m, oh0Var.f382260m) && n51.f.a(this.f382261n, oh0Var.f382261n) && n51.f.a(this.f382262o, oh0Var.f382262o) && n51.f.a(this.f382263p, oh0Var.f382263p) && n51.f.a(this.f382264q, oh0Var.f382264q) && n51.f.a(this.f382265r, oh0Var.f382265r);
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
            r45.mh0 mh0Var = this.f382254d;
            if (mh0Var != null) {
                fVar.i(2, mh0Var.computeSize());
                this.f382254d.writeFields(fVar);
            }
            r45.dh0 dh0Var = this.f382255e;
            if (dh0Var != null) {
                fVar.i(3, dh0Var.computeSize());
                this.f382255e.writeFields(fVar);
            }
            r45.eh0 eh0Var = this.f382256f;
            if (eh0Var != null) {
                fVar.i(4, eh0Var.computeSize());
                this.f382256f.writeFields(fVar);
            }
            r45.xg0 xg0Var = this.f382257g;
            if (xg0Var != null) {
                fVar.i(5, xg0Var.computeSize());
                this.f382257g.writeFields(fVar);
            }
            r45.jh0 jh0Var = this.f382258h;
            if (jh0Var != null) {
                fVar.i(6, jh0Var.computeSize());
                this.f382258h.writeFields(fVar);
            }
            r45.ah0 ah0Var = this.f382259i;
            if (ah0Var != null) {
                fVar.i(7, ah0Var.computeSize());
                this.f382259i.writeFields(fVar);
            }
            r45.fh0 fh0Var = this.f382260m;
            if (fh0Var != null) {
                fVar.i(8, fh0Var.computeSize());
                this.f382260m.writeFields(fVar);
            }
            r45.ih0 ih0Var = this.f382261n;
            if (ih0Var != null) {
                fVar.i(9, ih0Var.computeSize());
                this.f382261n.writeFields(fVar);
            }
            r45.bh0 bh0Var = this.f382262o;
            if (bh0Var != null) {
                fVar.i(10, bh0Var.computeSize());
                this.f382262o.writeFields(fVar);
            }
            r45.kh0 kh0Var = this.f382263p;
            if (kh0Var != null) {
                fVar.i(11, kh0Var.computeSize());
                this.f382263p.writeFields(fVar);
            }
            r45.ph0 ph0Var = this.f382264q;
            if (ph0Var != null) {
                fVar.i(12, ph0Var.computeSize());
                this.f382264q.writeFields(fVar);
            }
            r45.hh0 hh0Var = this.f382265r;
            if (hh0Var == null) {
                return 0;
            }
            fVar.i(13, hh0Var.computeSize());
            this.f382265r.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            r45.mh0 mh0Var2 = this.f382254d;
            if (mh0Var2 != null) {
                i18 += b36.f.i(2, mh0Var2.computeSize());
            }
            r45.dh0 dh0Var2 = this.f382255e;
            if (dh0Var2 != null) {
                i18 += b36.f.i(3, dh0Var2.computeSize());
            }
            r45.eh0 eh0Var2 = this.f382256f;
            if (eh0Var2 != null) {
                i18 += b36.f.i(4, eh0Var2.computeSize());
            }
            r45.xg0 xg0Var2 = this.f382257g;
            if (xg0Var2 != null) {
                i18 += b36.f.i(5, xg0Var2.computeSize());
            }
            r45.jh0 jh0Var2 = this.f382258h;
            if (jh0Var2 != null) {
                i18 += b36.f.i(6, jh0Var2.computeSize());
            }
            r45.ah0 ah0Var2 = this.f382259i;
            if (ah0Var2 != null) {
                i18 += b36.f.i(7, ah0Var2.computeSize());
            }
            r45.fh0 fh0Var2 = this.f382260m;
            if (fh0Var2 != null) {
                i18 += b36.f.i(8, fh0Var2.computeSize());
            }
            r45.ih0 ih0Var2 = this.f382261n;
            if (ih0Var2 != null) {
                i18 += b36.f.i(9, ih0Var2.computeSize());
            }
            r45.bh0 bh0Var2 = this.f382262o;
            if (bh0Var2 != null) {
                i18 += b36.f.i(10, bh0Var2.computeSize());
            }
            r45.kh0 kh0Var2 = this.f382263p;
            if (kh0Var2 != null) {
                i18 += b36.f.i(11, kh0Var2.computeSize());
            }
            r45.ph0 ph0Var2 = this.f382264q;
            if (ph0Var2 != null) {
                i18 += b36.f.i(12, ph0Var2.computeSize());
            }
            r45.hh0 hh0Var2 = this.f382265r;
            return hh0Var2 != null ? i18 + b36.f.i(13, hh0Var2.computeSize()) : i18;
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
        r45.oh0 oh0Var = (r45.oh0) objArr[1];
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
                    oh0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.mh0 mh0Var3 = new r45.mh0();
                    if (bArr2 != null && bArr2.length > 0) {
                        mh0Var3.parseFrom(bArr2);
                    }
                    oh0Var.f382254d = mh0Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.dh0 dh0Var3 = new r45.dh0();
                    if (bArr3 != null && bArr3.length > 0) {
                        dh0Var3.parseFrom(bArr3);
                    }
                    oh0Var.f382255e = dh0Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.eh0 eh0Var3 = new r45.eh0();
                    if (bArr4 != null && bArr4.length > 0) {
                        eh0Var3.parseFrom(bArr4);
                    }
                    oh0Var.f382256f = eh0Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.xg0 xg0Var3 = new r45.xg0();
                    if (bArr5 != null && bArr5.length > 0) {
                        xg0Var3.parseFrom(bArr5);
                    }
                    oh0Var.f382257g = xg0Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.jh0 jh0Var3 = new r45.jh0();
                    if (bArr6 != null && bArr6.length > 0) {
                        jh0Var3.parseFrom(bArr6);
                    }
                    oh0Var.f382258h = jh0Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.ah0 ah0Var3 = new r45.ah0();
                    if (bArr7 != null && bArr7.length > 0) {
                        ah0Var3.parseFrom(bArr7);
                    }
                    oh0Var.f382259i = ah0Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.fh0 fh0Var3 = new r45.fh0();
                    if (bArr8 != null && bArr8.length > 0) {
                        fh0Var3.parseFrom(bArr8);
                    }
                    oh0Var.f382260m = fh0Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    r45.ih0 ih0Var3 = new r45.ih0();
                    if (bArr9 != null && bArr9.length > 0) {
                        ih0Var3.parseFrom(bArr9);
                    }
                    oh0Var.f382261n = ih0Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    r45.bh0 bh0Var3 = new r45.bh0();
                    if (bArr10 != null && bArr10.length > 0) {
                        bh0Var3.parseFrom(bArr10);
                    }
                    oh0Var.f382262o = bh0Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i57 = 0; i57 < size11; i57++) {
                    byte[] bArr11 = (byte[]) j48.get(i57);
                    r45.kh0 kh0Var3 = new r45.kh0();
                    if (bArr11 != null && bArr11.length > 0) {
                        kh0Var3.parseFrom(bArr11);
                    }
                    oh0Var.f382263p = kh0Var3;
                }
                return 0;
            case 12:
                java.util.LinkedList j49 = aVar2.j(intValue);
                int size12 = j49.size();
                for (int i58 = 0; i58 < size12; i58++) {
                    byte[] bArr12 = (byte[]) j49.get(i58);
                    r45.ph0 ph0Var3 = new r45.ph0();
                    if (bArr12 != null && bArr12.length > 0) {
                        ph0Var3.parseFrom(bArr12);
                    }
                    oh0Var.f382264q = ph0Var3;
                }
                return 0;
            case 13:
                java.util.LinkedList j57 = aVar2.j(intValue);
                int size13 = j57.size();
                for (int i59 = 0; i59 < size13; i59++) {
                    byte[] bArr13 = (byte[]) j57.get(i59);
                    r45.hh0 hh0Var3 = new r45.hh0();
                    if (bArr13 != null && bArr13.length > 0) {
                        hh0Var3.parseFrom(bArr13);
                    }
                    oh0Var.f382265r = hh0Var3;
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
            eVar.d(jSONObject, "strategy_control_info", this.f382254d, false);
            eVar.d(jSONObject, "msg_resort_control_info", this.f382255e, false);
            eVar.d(jSONObject, "msg_resort_user_config", this.f382256f, false);
            eVar.d(jSONObject, "appmsg_cover_preload_strategy", this.f382257g, false);
            eVar.d(jSONObject, "rec_feeds_strategy", this.f382258h, false);
            eVar.d(jSONObject, "box_search_strategy", this.f382259i, false);
            eVar.d(jSONObject, "notify_strategy", this.f382260m, false);
            eVar.d(jSONObject, "product_evaluation_card_strategy", this.f382261n, false);
            eVar.d(jSONObject, "follow_bar_strategy", this.f382262o, false);
            eVar.d(jSONObject, "remain_acticle_strategy", this.f382263p, false);
            eVar.d(jSONObject, "timeline_ui_strategy", this.f382264q, false);
            eVar.d(jSONObject, "personal_center_strategy", this.f382265r, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
