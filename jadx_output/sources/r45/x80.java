package r45;

/* loaded from: classes8.dex */
public class x80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f389853d;

    /* renamed from: e, reason: collision with root package name */
    public r45.qy3 f389854e;

    /* renamed from: f, reason: collision with root package name */
    public r45.wm5 f389855f;

    /* renamed from: g, reason: collision with root package name */
    public r45.w80 f389856g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x80)) {
            return false;
        }
        r45.x80 x80Var = (r45.x80) fVar;
        return n51.f.a(this.f389853d, x80Var.f389853d) && n51.f.a(this.f389854e, x80Var.f389854e) && n51.f.a(this.f389855f, x80Var.f389855f) && n51.f.a(this.f389856g, x80Var.f389856g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f fromJson(java.lang.String str) {
        char c17;
        if (str != null && !"".equals(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    switch (next.hashCode()) {
                        case 3226745:
                            if (next.equals("icon")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 3556653:
                            if (next.equals(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT)) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 831275511:
                            if (next.equals("content_attr")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1474965877:
                            if (next.equals("reddot_pendant")) {
                                c17 = 2;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    if (c17 == 0) {
                        this.f389853d = (java.lang.String) jSONObject.opt(next);
                    } else if (c17 == 1) {
                        java.lang.Object opt = jSONObject.opt(next);
                        if (opt instanceof org.json.JSONObject) {
                            r45.qy3 qy3Var = new r45.qy3();
                            qy3Var.fromJson(((org.json.JSONObject) opt).toString());
                            this.f389854e = qy3Var;
                        }
                    } else if (c17 == 2) {
                        java.lang.Object opt2 = jSONObject.opt(next);
                        if (opt2 instanceof org.json.JSONObject) {
                            r45.wm5 wm5Var = new r45.wm5();
                            wm5Var.fromJson(((org.json.JSONObject) opt2).toString());
                            this.f389855f = wm5Var;
                        }
                    } else if (c17 == 3) {
                        java.lang.Object opt3 = jSONObject.opt(next);
                        if (opt3 instanceof org.json.JSONObject) {
                            r45.w80 w80Var = new r45.w80();
                            w80Var.fromJson(((org.json.JSONObject) opt3).toString());
                            this.f389856g = w80Var;
                        }
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f389853d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.qy3 qy3Var = this.f389854e;
            if (qy3Var != null) {
                fVar.i(2, qy3Var.computeSize());
                this.f389854e.writeFields(fVar);
            }
            r45.wm5 wm5Var = this.f389855f;
            if (wm5Var != null) {
                fVar.i(3, wm5Var.computeSize());
                this.f389855f.writeFields(fVar);
            }
            r45.w80 w80Var = this.f389856g;
            if (w80Var != null) {
                fVar.i(4, w80Var.computeSize());
                this.f389856g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f389853d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.qy3 qy3Var2 = this.f389854e;
            if (qy3Var2 != null) {
                j17 += b36.f.i(2, qy3Var2.computeSize());
            }
            r45.wm5 wm5Var2 = this.f389855f;
            if (wm5Var2 != null) {
                j17 += b36.f.i(3, wm5Var2.computeSize());
            }
            r45.w80 w80Var2 = this.f389856g;
            return w80Var2 != null ? j17 + b36.f.i(4, w80Var2.computeSize()) : j17;
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
        r45.x80 x80Var = (r45.x80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            x80Var.f389853d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.qy3 qy3Var3 = new r45.qy3();
                if (bArr != null && bArr.length > 0) {
                    qy3Var3.parseFrom(bArr);
                }
                x80Var.f389854e = qy3Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.wm5 wm5Var3 = new r45.wm5();
                if (bArr2 != null && bArr2.length > 0) {
                    wm5Var3.parseFrom(bArr2);
                }
                x80Var.f389855f = wm5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.w80 w80Var3 = new r45.w80();
            if (bArr3 != null && bArr3.length > 0) {
                w80Var3.parseFrom(bArr3);
            }
            x80Var.f389856g = w80Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f389853d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, str, true);
            eVar.d(jSONObject, "icon", this.f389854e, true);
            eVar.d(jSONObject, "reddot_pendant", this.f389855f, true);
            eVar.d(jSONObject, "content_attr", this.f389856g, true);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
