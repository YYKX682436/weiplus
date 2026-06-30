package r45;

/* loaded from: classes10.dex */
public class q23 extends com.tencent.mm.protobuf.f {
    public int A;
    public int B;
    public java.lang.String C;
    public r45.he4 D;
    public r45.y54 E;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383585d;

    /* renamed from: e, reason: collision with root package name */
    public int f383586e;

    /* renamed from: f, reason: collision with root package name */
    public int f383587f;

    /* renamed from: g, reason: collision with root package name */
    public int f383588g;

    /* renamed from: h, reason: collision with root package name */
    public int f383589h;

    /* renamed from: i, reason: collision with root package name */
    public r45.xy6 f383590i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f383591m;

    /* renamed from: n, reason: collision with root package name */
    public r45.iy5 f383592n;

    /* renamed from: o, reason: collision with root package name */
    public int f383593o;

    /* renamed from: p, reason: collision with root package name */
    public long f383594p;

    /* renamed from: q, reason: collision with root package name */
    public int f383595q;

    /* renamed from: r, reason: collision with root package name */
    public int f383596r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f383597s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f383598t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f383599u;

    /* renamed from: v, reason: collision with root package name */
    public int f383600v;

    /* renamed from: w, reason: collision with root package name */
    public r45.ko6 f383601w;

    /* renamed from: x, reason: collision with root package name */
    public r45.dl6 f383602x;

    /* renamed from: y, reason: collision with root package name */
    public int f383603y;

    /* renamed from: z, reason: collision with root package name */
    public int f383604z;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q23)) {
            return false;
        }
        r45.q23 q23Var = (r45.q23) fVar;
        return n51.f.a(this.f383585d, q23Var.f383585d) && n51.f.a(java.lang.Integer.valueOf(this.f383586e), java.lang.Integer.valueOf(q23Var.f383586e)) && n51.f.a(java.lang.Integer.valueOf(this.f383587f), java.lang.Integer.valueOf(q23Var.f383587f)) && n51.f.a(java.lang.Integer.valueOf(this.f383588g), java.lang.Integer.valueOf(q23Var.f383588g)) && n51.f.a(java.lang.Integer.valueOf(this.f383589h), java.lang.Integer.valueOf(q23Var.f383589h)) && n51.f.a(this.f383590i, q23Var.f383590i) && n51.f.a(this.f383591m, q23Var.f383591m) && n51.f.a(this.f383592n, q23Var.f383592n) && n51.f.a(java.lang.Integer.valueOf(this.f383593o), java.lang.Integer.valueOf(q23Var.f383593o)) && n51.f.a(java.lang.Long.valueOf(this.f383594p), java.lang.Long.valueOf(q23Var.f383594p)) && n51.f.a(java.lang.Integer.valueOf(this.f383595q), java.lang.Integer.valueOf(q23Var.f383595q)) && n51.f.a(java.lang.Integer.valueOf(this.f383596r), java.lang.Integer.valueOf(q23Var.f383596r)) && n51.f.a(this.f383597s, q23Var.f383597s) && n51.f.a(this.f383598t, q23Var.f383598t) && n51.f.a(this.f383599u, q23Var.f383599u) && n51.f.a(java.lang.Integer.valueOf(this.f383600v), java.lang.Integer.valueOf(q23Var.f383600v)) && n51.f.a(this.f383601w, q23Var.f383601w) && n51.f.a(this.f383602x, q23Var.f383602x) && n51.f.a(java.lang.Integer.valueOf(this.f383603y), java.lang.Integer.valueOf(q23Var.f383603y)) && n51.f.a(java.lang.Integer.valueOf(this.f383604z), java.lang.Integer.valueOf(q23Var.f383604z)) && n51.f.a(java.lang.Integer.valueOf(this.A), java.lang.Integer.valueOf(q23Var.A)) && n51.f.a(java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(q23Var.B)) && n51.f.a(this.C, q23Var.C) && n51.f.a(this.D, q23Var.D) && n51.f.a(this.E, q23Var.E);
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
                        case -1712939251:
                            if (next.equals("follow_object_id")) {
                                c17 = 14;
                                break;
                            }
                            break;
                        case -879027064:
                            if (next.equals("traits_info")) {
                                c17 = 16;
                                break;
                            }
                            break;
                        case -854613030:
                            if (next.equals("aigc_task_id")) {
                                c17 = 22;
                                break;
                            }
                            break;
                        case -780321144:
                            if (next.equals("music_info")) {
                                c17 = 17;
                                break;
                            }
                            break;
                        case -421311030:
                            if (next.equals("layer_render_infos")) {
                                c17 = 24;
                                break;
                            }
                            break;
                        case -376724013:
                            if (next.equals("sdk_version")) {
                                c17 = 2;
                                break;
                            }
                            break;
                        case -321901593:
                            if (next.equals("is_recommend")) {
                                c17 = 19;
                                break;
                            }
                            break;
                        case -102807627:
                            if (next.equals("version_info")) {
                                c17 = 5;
                                break;
                            }
                            break;
                        case -77151997:
                            if (next.equals("camera_position")) {
                                c17 = '\b';
                                break;
                            }
                            break;
                        case 3355:
                            if (next.equals(dm.i4.COL_ID)) {
                                c17 = 0;
                                break;
                            }
                            break;
                        case 155743:
                            if (next.equals("video_source")) {
                                c17 = 21;
                                break;
                            }
                            break;
                        case 3575610:
                            if (next.equals("type")) {
                                c17 = 1;
                                break;
                            }
                            break;
                        case 568099268:
                            if (next.equals("entrance_source")) {
                                c17 = 4;
                                break;
                            }
                            break;
                        case 805835919:
                            if (next.equals("client_camera_position")) {
                                c17 = 11;
                                break;
                            }
                            break;
                        case 843879797:
                            if (next.equals("music_id")) {
                                c17 = 6;
                                break;
                            }
                            break;
                        case 984174864:
                            if (next.equals("event_name")) {
                                c17 = '\r';
                                break;
                            }
                            break;
                        case 1035207206:
                            if (next.equals("event_creator_nickname")) {
                                c17 = '\f';
                                break;
                            }
                            break;
                        case 1152136911:
                            if (next.equals("md5_info")) {
                                c17 = 23;
                                break;
                            }
                            break;
                        case 1207273490:
                            if (next.equals("original_sound_switch")) {
                                c17 = '\n';
                                break;
                            }
                            break;
                        case 1235465457:
                            if (next.equals("usage_count")) {
                                c17 = 3;
                                break;
                            }
                            break;
                        case 1313814544:
                            if (next.equals("non_ugc_identify_result")) {
                                c17 = 20;
                                break;
                            }
                            break;
                        case 1499618549:
                            if (next.equals("tmpl_topic_id")) {
                                c17 = '\t';
                                break;
                            }
                            break;
                        case 1692185234:
                            if (next.equals("audit_info")) {
                                c17 = 7;
                                break;
                            }
                            break;
                        case 1818724322:
                            if (next.equals("follow_object_check_box")) {
                                c17 = 15;
                                break;
                            }
                            break;
                        case 2047164082:
                            if (next.equals("defective_type")) {
                                c17 = 18;
                                break;
                            }
                            break;
                    }
                    c17 = 65535;
                    switch (c17) {
                        case 0:
                            this.f383585d = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 1:
                            this.f383586e = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 2:
                            this.f383587f = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 3:
                            this.f383588g = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 4:
                            this.f383589h = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 5:
                            java.lang.Object opt = jSONObject.opt(next);
                            if (!(opt instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f383590i = (r45.xy6) new r45.xy6().fromJson(((org.json.JSONObject) opt).toString());
                                break;
                            }
                        case 6:
                            this.f383591m = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 7:
                            java.lang.Object opt2 = jSONObject.opt(next);
                            if (!(opt2 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                this.f383592n = (r45.iy5) new r45.iy5().fromJson(((org.json.JSONObject) opt2).toString());
                                break;
                            }
                        case '\b':
                            this.f383593o = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\t':
                            this.f383594p = jSONObject.optLong(next);
                            break;
                        case '\n':
                            this.f383595q = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 11:
                            this.f383596r = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case '\f':
                            this.f383597s = (java.lang.String) jSONObject.opt(next);
                            break;
                        case '\r':
                            this.f383598t = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 14:
                            this.f383599u = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 15:
                            this.f383600v = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 16:
                            java.lang.Object opt3 = jSONObject.opt(next);
                            if (!(opt3 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.ko6 ko6Var = new r45.ko6();
                                ko6Var.fromJson(((org.json.JSONObject) opt3).toString());
                                this.f383601w = ko6Var;
                                break;
                            }
                        case 17:
                            java.lang.Object opt4 = jSONObject.opt(next);
                            if (!(opt4 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.dl6 dl6Var = new r45.dl6();
                                dl6Var.fromJson(((org.json.JSONObject) opt4).toString());
                                this.f383602x = dl6Var;
                                break;
                            }
                        case 18:
                            this.f383603y = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 19:
                            this.f383604z = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 20:
                            this.A = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 21:
                            this.B = ((java.lang.Integer) jSONObject.opt(next)).intValue();
                            break;
                        case 22:
                            this.C = (java.lang.String) jSONObject.opt(next);
                            break;
                        case 23:
                            java.lang.Object opt5 = jSONObject.opt(next);
                            if (!(opt5 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.he4 he4Var = new r45.he4();
                                he4Var.fromJson(((org.json.JSONObject) opt5).toString());
                                this.D = he4Var;
                                break;
                            }
                        case 24:
                            java.lang.Object opt6 = jSONObject.opt(next);
                            if (!(opt6 instanceof org.json.JSONObject)) {
                                break;
                            } else {
                                r45.y54 y54Var = new r45.y54();
                                y54Var.fromJson(((org.json.JSONObject) opt6).toString());
                                this.E = y54Var;
                                break;
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
            java.lang.String str = this.f383585d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f383586e);
            fVar.e(3, this.f383587f);
            fVar.e(4, this.f383588g);
            fVar.e(5, this.f383589h);
            r45.xy6 xy6Var = this.f383590i;
            if (xy6Var != null) {
                fVar.i(6, xy6Var.computeSize());
                this.f383590i.writeFields(fVar);
            }
            java.lang.String str2 = this.f383591m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            r45.iy5 iy5Var = this.f383592n;
            if (iy5Var != null) {
                fVar.i(8, iy5Var.computeSize());
                this.f383592n.writeFields(fVar);
            }
            fVar.e(10, this.f383593o);
            fVar.h(11, this.f383594p);
            fVar.e(12, this.f383595q);
            fVar.e(13, this.f383596r);
            java.lang.String str3 = this.f383597s;
            if (str3 != null) {
                fVar.j(14, str3);
            }
            java.lang.String str4 = this.f383598t;
            if (str4 != null) {
                fVar.j(15, str4);
            }
            java.lang.String str5 = this.f383599u;
            if (str5 != null) {
                fVar.j(16, str5);
            }
            fVar.e(17, this.f383600v);
            r45.ko6 ko6Var = this.f383601w;
            if (ko6Var != null) {
                fVar.i(18, ko6Var.computeSize());
                this.f383601w.writeFields(fVar);
            }
            r45.dl6 dl6Var = this.f383602x;
            if (dl6Var != null) {
                fVar.i(19, dl6Var.computeSize());
                this.f383602x.writeFields(fVar);
            }
            fVar.e(20, this.f383603y);
            fVar.e(21, this.f383604z);
            fVar.e(22, this.A);
            fVar.e(23, this.B);
            java.lang.String str6 = this.C;
            if (str6 != null) {
                fVar.j(26, str6);
            }
            r45.he4 he4Var = this.D;
            if (he4Var != null) {
                fVar.i(27, he4Var.computeSize());
                this.D.writeFields(fVar);
            }
            r45.y54 y54Var = this.E;
            if (y54Var != null) {
                fVar.i(28, y54Var.computeSize());
                this.E.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f383585d;
            int j17 = (str7 != null ? b36.f.j(1, str7) + 0 : 0) + b36.f.e(2, this.f383586e) + b36.f.e(3, this.f383587f) + b36.f.e(4, this.f383588g) + b36.f.e(5, this.f383589h);
            r45.xy6 xy6Var2 = this.f383590i;
            if (xy6Var2 != null) {
                j17 += b36.f.i(6, xy6Var2.computeSize());
            }
            java.lang.String str8 = this.f383591m;
            if (str8 != null) {
                j17 += b36.f.j(7, str8);
            }
            r45.iy5 iy5Var2 = this.f383592n;
            if (iy5Var2 != null) {
                j17 += b36.f.i(8, iy5Var2.computeSize());
            }
            int e17 = j17 + b36.f.e(10, this.f383593o) + b36.f.h(11, this.f383594p) + b36.f.e(12, this.f383595q) + b36.f.e(13, this.f383596r);
            java.lang.String str9 = this.f383597s;
            if (str9 != null) {
                e17 += b36.f.j(14, str9);
            }
            java.lang.String str10 = this.f383598t;
            if (str10 != null) {
                e17 += b36.f.j(15, str10);
            }
            java.lang.String str11 = this.f383599u;
            if (str11 != null) {
                e17 += b36.f.j(16, str11);
            }
            int e18 = e17 + b36.f.e(17, this.f383600v);
            r45.ko6 ko6Var2 = this.f383601w;
            if (ko6Var2 != null) {
                e18 += b36.f.i(18, ko6Var2.computeSize());
            }
            r45.dl6 dl6Var2 = this.f383602x;
            if (dl6Var2 != null) {
                e18 += b36.f.i(19, dl6Var2.computeSize());
            }
            int e19 = e18 + b36.f.e(20, this.f383603y) + b36.f.e(21, this.f383604z) + b36.f.e(22, this.A) + b36.f.e(23, this.B);
            java.lang.String str12 = this.C;
            if (str12 != null) {
                e19 += b36.f.j(26, str12);
            }
            r45.he4 he4Var2 = this.D;
            if (he4Var2 != null) {
                e19 += b36.f.i(27, he4Var2.computeSize());
            }
            r45.y54 y54Var2 = this.E;
            return y54Var2 != null ? e19 + b36.f.i(28, y54Var2.computeSize()) : e19;
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
        r45.q23 q23Var = (r45.q23) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q23Var.f383585d = aVar2.k(intValue);
                return 0;
            case 2:
                q23Var.f383586e = aVar2.g(intValue);
                return 0;
            case 3:
                q23Var.f383587f = aVar2.g(intValue);
                return 0;
            case 4:
                q23Var.f383588g = aVar2.g(intValue);
                return 0;
            case 5:
                q23Var.f383589h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.xy6 xy6Var3 = new r45.xy6();
                    if (bArr != null && bArr.length > 0) {
                        xy6Var3.parseFrom(bArr);
                    }
                    q23Var.f383590i = xy6Var3;
                }
                return 0;
            case 7:
                q23Var.f383591m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.iy5 iy5Var3 = new r45.iy5();
                    if (bArr2 != null && bArr2.length > 0) {
                        iy5Var3.parseFrom(bArr2);
                    }
                    q23Var.f383592n = iy5Var3;
                }
                return 0;
            case 9:
            case 24:
            case 25:
            default:
                return -1;
            case 10:
                q23Var.f383593o = aVar2.g(intValue);
                return 0;
            case 11:
                q23Var.f383594p = aVar2.i(intValue);
                return 0;
            case 12:
                q23Var.f383595q = aVar2.g(intValue);
                return 0;
            case 13:
                q23Var.f383596r = aVar2.g(intValue);
                return 0;
            case 14:
                q23Var.f383597s = aVar2.k(intValue);
                return 0;
            case 15:
                q23Var.f383598t = aVar2.k(intValue);
                return 0;
            case 16:
                q23Var.f383599u = aVar2.k(intValue);
                return 0;
            case 17:
                q23Var.f383600v = aVar2.g(intValue);
                return 0;
            case 18:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    r45.ko6 ko6Var3 = new r45.ko6();
                    if (bArr3 != null && bArr3.length > 0) {
                        ko6Var3.parseFrom(bArr3);
                    }
                    q23Var.f383601w = ko6Var3;
                }
                return 0;
            case 19:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    r45.dl6 dl6Var3 = new r45.dl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        dl6Var3.parseFrom(bArr4);
                    }
                    q23Var.f383602x = dl6Var3;
                }
                return 0;
            case 20:
                q23Var.f383603y = aVar2.g(intValue);
                return 0;
            case 21:
                q23Var.f383604z = aVar2.g(intValue);
                return 0;
            case 22:
                q23Var.A = aVar2.g(intValue);
                return 0;
            case 23:
                q23Var.B = aVar2.g(intValue);
                return 0;
            case 26:
                q23Var.C = aVar2.k(intValue);
                return 0;
            case 27:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    r45.he4 he4Var3 = new r45.he4();
                    if (bArr5 != null && bArr5.length > 0) {
                        he4Var3.parseFrom(bArr5);
                    }
                    q23Var.D = he4Var3;
                }
                return 0;
            case 28:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size6 = j37.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j37.get(i37);
                    r45.y54 y54Var3 = new r45.y54();
                    if (bArr6 != null && bArr6.length > 0) {
                        y54Var3.parseFrom(bArr6);
                    }
                    q23Var.E = y54Var3;
                }
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str = this.f383585d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, dm.i4.COL_ID, str, false);
            eVar.d(jSONObject, "type", java.lang.Integer.valueOf(this.f383586e), false);
            eVar.d(jSONObject, "sdk_version", java.lang.Integer.valueOf(this.f383587f), false);
            eVar.d(jSONObject, "usage_count", java.lang.Integer.valueOf(this.f383588g), false);
            eVar.d(jSONObject, "entrance_source", java.lang.Integer.valueOf(this.f383589h), false);
            eVar.d(jSONObject, "version_info", this.f383590i, false);
            eVar.d(jSONObject, "music_id", this.f383591m, false);
            eVar.d(jSONObject, "audit_info", this.f383592n, false);
            eVar.d(jSONObject, "camera_position", java.lang.Integer.valueOf(this.f383593o), false);
            eVar.d(jSONObject, "tmpl_topic_id", java.lang.Long.valueOf(this.f383594p), false);
            eVar.d(jSONObject, "original_sound_switch", java.lang.Integer.valueOf(this.f383595q), false);
            eVar.d(jSONObject, "client_camera_position", java.lang.Integer.valueOf(this.f383596r), false);
            eVar.d(jSONObject, "event_creator_nickname", this.f383597s, false);
            eVar.d(jSONObject, "event_name", this.f383598t, false);
            eVar.d(jSONObject, "follow_object_id", this.f383599u, false);
            eVar.d(jSONObject, "follow_object_check_box", java.lang.Integer.valueOf(this.f383600v), false);
            eVar.d(jSONObject, "traits_info", this.f383601w, false);
            eVar.d(jSONObject, "music_info", this.f383602x, false);
            eVar.d(jSONObject, "defective_type", java.lang.Integer.valueOf(this.f383603y), false);
            eVar.d(jSONObject, "is_recommend", java.lang.Integer.valueOf(this.f383604z), false);
            eVar.d(jSONObject, "non_ugc_identify_result", java.lang.Integer.valueOf(this.A), false);
            eVar.d(jSONObject, "video_source", java.lang.Integer.valueOf(this.B), false);
            eVar.d(jSONObject, "aigc_task_id", this.C, false);
            eVar.d(jSONObject, "md5_info", this.D, false);
            eVar.d(jSONObject, "layer_render_infos", this.E, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
