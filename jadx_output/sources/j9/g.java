package j9;

/* loaded from: classes15.dex */
public final class g extends j9.h {

    /* renamed from: f, reason: collision with root package name */
    public final t9.p f298321f = new t9.p();

    /* renamed from: g, reason: collision with root package name */
    public final t9.o f298322g = new t9.o();

    /* renamed from: h, reason: collision with root package name */
    public final int f298323h;

    /* renamed from: i, reason: collision with root package name */
    public final j9.e[] f298324i;

    /* renamed from: j, reason: collision with root package name */
    public j9.e f298325j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f298326k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f298327l;

    /* renamed from: m, reason: collision with root package name */
    public j9.f f298328m;

    /* renamed from: n, reason: collision with root package name */
    public int f298329n;

    public g(int i17) {
        this.f298323h = i17 == -1 ? 1 : i17;
        this.f298324i = new j9.e[8];
        for (int i18 = 0; i18 < 8; i18++) {
            this.f298324i[i18] = new j9.e();
        }
        this.f298325j = this.f298324i[0];
        i();
    }

    @Override // j9.h
    public i9.d d() {
        java.util.List list = this.f298326k;
        this.f298327l = list;
        return new j9.j(list);
    }

    @Override // j9.h
    public void e(i9.i iVar) {
        byte[] array = iVar.f343610f.array();
        int limit = iVar.f343610f.limit();
        t9.p pVar = this.f298321f;
        pVar.u(array, limit);
        while (pVar.f416542c - pVar.f416541b >= 3) {
            int m17 = pVar.m() & 7;
            int i17 = m17 & 3;
            boolean z17 = (m17 & 4) == 4;
            byte m18 = (byte) pVar.m();
            byte m19 = (byte) pVar.m();
            if (i17 == 2 || i17 == 3) {
                if (z17) {
                    if (i17 == 3) {
                        g();
                        int i18 = (m18 & 192) >> 6;
                        int i19 = m18 & 63;
                        if (i19 == 0) {
                            i19 = 64;
                        }
                        j9.f fVar = new j9.f(i18, i19);
                        this.f298328m = fVar;
                        int i27 = fVar.f298320c;
                        fVar.f298320c = i27 + 1;
                        fVar.f298319b[i27] = m19;
                    } else {
                        t9.a.a(i17 == 2);
                        j9.f fVar2 = this.f298328m;
                        if (fVar2 != null) {
                            byte[] bArr = fVar2.f298319b;
                            int i28 = fVar2.f298320c;
                            int i29 = i28 + 1;
                            bArr[i28] = m18;
                            fVar2.f298320c = i29 + 1;
                            bArr[i29] = m19;
                        }
                    }
                    j9.f fVar3 = this.f298328m;
                    if (fVar3.f298320c == (fVar3.f298318a * 2) - 1) {
                        g();
                    }
                }
            }
        }
    }

    @Override // j9.h
    public boolean f() {
        return this.f298326k != this.f298327l;
    }

    @Override // j9.h, o8.e
    public void flush() {
        super.flush();
        this.f298326k = null;
        this.f298327l = null;
        this.f298329n = 0;
        this.f298325j = this.f298324i[0];
        i();
        this.f298328m = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0065. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x00bc. Please report as an issue. */
    public final void g() {
        boolean z17;
        int i17;
        int i18;
        int i19;
        j9.f fVar = this.f298328m;
        if (fVar == null) {
            return;
        }
        int i27 = fVar.f298320c;
        int i28 = 2;
        boolean z18 = true;
        if (i27 == (fVar.f298318a * 2) - 1) {
            t9.o oVar = this.f298322g;
            oVar.f416536a = fVar.f298319b;
            oVar.f416537b = 0;
            oVar.f416538c = 0;
            oVar.f416539d = i27;
            int i29 = 3;
            int d17 = oVar.d(3);
            int d18 = oVar.d(5);
            int i37 = 7;
            int i38 = 6;
            if (d17 == 7) {
                oVar.f(2);
                d17 += oVar.d(6);
            }
            if (d18 != 0 && d17 == this.f298323h) {
                boolean z19 = false;
                while (oVar.b() > 0) {
                    int d19 = oVar.d(8);
                    if (d19 != 16) {
                        if (d19 <= 31) {
                            if (d19 != 0) {
                                if (d19 == i29) {
                                    this.f298326k = h();
                                } else if (d19 != 8) {
                                    switch (d19) {
                                        case 12:
                                            i();
                                            break;
                                        case 13:
                                            this.f298325j.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (d19 < 17 || d19 > 23) {
                                                if (d19 >= 24 && d19 <= 31) {
                                                    oVar.f(16);
                                                    break;
                                                }
                                            } else {
                                                oVar.f(8);
                                                break;
                                            }
                                            break;
                                    }
                                } else {
                                    android.text.SpannableStringBuilder spannableStringBuilder = this.f298325j.f298297b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (d19 <= 127) {
                            if (d19 == 127) {
                                this.f298325j.a((char) 9835);
                            } else {
                                this.f298325j.a((char) (d19 & 255));
                            }
                            z19 = true;
                        } else {
                            if (d19 <= 159) {
                                j9.e[] eVarArr = this.f298324i;
                                switch (d19) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z18 = true;
                                        z17 = false;
                                        int i39 = d19 - 128;
                                        if (this.f298329n != i39) {
                                            this.f298329n = i39;
                                            this.f298325j = eVarArr[i39];
                                            break;
                                        }
                                        break;
                                    case 136:
                                        z18 = true;
                                        for (int i47 = 1; i47 <= 8; i47++) {
                                            if (oVar.c()) {
                                                j9.e eVar = eVarArr[8 - i47];
                                                ((java.util.LinkedList) eVar.f298296a).clear();
                                                eVar.f298297b.clear();
                                                eVar.f298311p = -1;
                                                eVar.f298312q = -1;
                                                eVar.f298313r = -1;
                                                eVar.f298315t = -1;
                                                eVar.f298317v = 0;
                                            }
                                        }
                                        z17 = false;
                                        break;
                                    case 137:
                                        for (int i48 = 1; i48 <= 8; i48++) {
                                            if (oVar.c()) {
                                                eVarArr[8 - i48].f298299d = true;
                                            }
                                        }
                                        z18 = true;
                                        z17 = false;
                                        break;
                                    case 138:
                                        for (int i49 = 1; i49 <= 8; i49++) {
                                            if (oVar.c()) {
                                                eVarArr[8 - i49].f298299d = false;
                                            }
                                        }
                                        z18 = true;
                                        z17 = false;
                                        break;
                                    case 139:
                                        for (int i57 = 1; i57 <= 8; i57++) {
                                            if (oVar.c()) {
                                                eVarArr[8 - i57].f298299d = !r4.f298299d;
                                            }
                                        }
                                        z18 = true;
                                        z17 = false;
                                        break;
                                    case 140:
                                        for (int i58 = 1; i58 <= 8; i58++) {
                                            if (oVar.c()) {
                                                eVarArr[8 - i58].d();
                                            }
                                        }
                                        z18 = true;
                                        z17 = false;
                                        break;
                                    case 141:
                                        oVar.f(8);
                                        z18 = true;
                                        z17 = false;
                                        break;
                                    case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                                    case 147:
                                    case 148:
                                    case com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX /* 149 */:
                                    case 150:
                                    default:
                                        z18 = true;
                                        z17 = false;
                                        break;
                                    case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_ENABLE_ORIGINAL_VIDEO_INFO_CALLBACK_FROM_SURFACE_LISTENER /* 143 */:
                                        i();
                                        z18 = true;
                                        z17 = false;
                                        break;
                                    case 144:
                                        if (!this.f298325j.f298298c) {
                                            oVar.f(16);
                                            i29 = 3;
                                            z18 = true;
                                            z17 = false;
                                            break;
                                        } else {
                                            i29 = 3;
                                            this.f298325j.e(oVar.d(4), oVar.d(2), oVar.d(2), oVar.c(), oVar.c(), oVar.d(3), oVar.d(3));
                                            z18 = true;
                                            z17 = false;
                                        }
                                    case 145:
                                        if (this.f298325j.f298298c) {
                                            int c17 = j9.e.c(oVar.d(2), oVar.d(2), oVar.d(2), oVar.d(2));
                                            int c18 = j9.e.c(oVar.d(2), oVar.d(2), oVar.d(2), oVar.d(2));
                                            oVar.f(2);
                                            this.f298325j.f(c17, c18, j9.e.c(oVar.d(2), oVar.d(2), oVar.d(2), 0));
                                        } else {
                                            oVar.f(24);
                                        }
                                        i29 = 3;
                                        z18 = true;
                                        z17 = false;
                                        break;
                                    case 146:
                                        if (this.f298325j.f298298c) {
                                            oVar.f(4);
                                            int d27 = oVar.d(4);
                                            oVar.f(2);
                                            oVar.d(6);
                                            j9.e eVar2 = this.f298325j;
                                            if (eVar2.f298317v != d27) {
                                                eVar2.a('\n');
                                            }
                                            eVar2.f298317v = d27;
                                        } else {
                                            oVar.f(16);
                                        }
                                        i29 = 3;
                                        z18 = true;
                                        z17 = false;
                                        break;
                                    case 151:
                                        if (this.f298325j.f298298c) {
                                            int c19 = j9.e.c(oVar.d(2), oVar.d(2), oVar.d(2), oVar.d(2));
                                            oVar.d(2);
                                            j9.e.c(oVar.d(2), oVar.d(2), oVar.d(2), 0);
                                            oVar.c();
                                            oVar.c();
                                            oVar.d(2);
                                            oVar.d(2);
                                            int d28 = oVar.d(2);
                                            oVar.f(8);
                                            j9.e eVar3 = this.f298325j;
                                            eVar3.f298310o = c19;
                                            eVar3.f298307l = d28;
                                        } else {
                                            oVar.f(32);
                                        }
                                        i29 = 3;
                                        z18 = true;
                                        z17 = false;
                                        break;
                                    case 152:
                                    case com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS /* 153 */:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX /* 159 */:
                                        int i59 = d19 - 152;
                                        j9.e eVar4 = eVarArr[i59];
                                        oVar.f(i28);
                                        boolean c27 = oVar.c();
                                        boolean c28 = oVar.c();
                                        oVar.c();
                                        int d29 = oVar.d(i29);
                                        boolean c29 = oVar.c();
                                        int d37 = oVar.d(i37);
                                        int d38 = oVar.d(8);
                                        int d39 = oVar.d(4);
                                        int d47 = oVar.d(4);
                                        oVar.f(i28);
                                        oVar.d(i38);
                                        oVar.f(i28);
                                        int d48 = oVar.d(i29);
                                        int d49 = oVar.d(i29);
                                        eVar4.f298298c = true;
                                        eVar4.f298299d = c27;
                                        eVar4.f298306k = c28;
                                        eVar4.f298300e = d29;
                                        eVar4.f298301f = c29;
                                        eVar4.f298302g = d37;
                                        eVar4.f298303h = d38;
                                        eVar4.f298304i = d39;
                                        int i66 = d47 + 1;
                                        if (eVar4.f298305j != i66) {
                                            eVar4.f298305j = i66;
                                            while (true) {
                                                java.util.List list = eVar4.f298296a;
                                                if ((c28 && ((java.util.LinkedList) list).size() >= eVar4.f298305j) || ((java.util.LinkedList) list).size() >= 15) {
                                                    ((java.util.LinkedList) list).remove(0);
                                                }
                                            }
                                        }
                                        if (d48 != 0 && eVar4.f298308m != d48) {
                                            eVar4.f298308m = d48;
                                            int i67 = d48 - 1;
                                            int i68 = j9.e.C[i67];
                                            boolean z27 = j9.e.B[i67];
                                            int i69 = j9.e.f298295z[i67];
                                            int i76 = j9.e.A[i67];
                                            int i77 = j9.e.f298294y[i67];
                                            eVar4.f298310o = i68;
                                            eVar4.f298307l = i77;
                                        }
                                        if (d49 != 0 && eVar4.f298309n != d49) {
                                            eVar4.f298309n = d49;
                                            int i78 = d49 - 1;
                                            eVar4.e(0, 1, 1, false, false, j9.e.E[i78], j9.e.D[i78]);
                                            eVar4.f(j9.e.f298292w, j9.e.F[i78], j9.e.f298293x);
                                        }
                                        if (this.f298329n != i59) {
                                            this.f298329n = i59;
                                            this.f298325j = eVarArr[i59];
                                        }
                                        i29 = 3;
                                        z18 = true;
                                        z17 = false;
                                        break;
                                }
                            } else {
                                z18 = true;
                                z17 = false;
                                if (d19 <= 255) {
                                    this.f298325j.a((char) (d19 & 255));
                                }
                                i17 = 7;
                                i18 = 2;
                                i19 = 6;
                            }
                            z19 = z18;
                            i17 = 7;
                            i18 = 2;
                            i19 = 6;
                        }
                        i18 = i28;
                        i19 = i38;
                        z18 = true;
                        i17 = i37;
                        z17 = false;
                    } else {
                        z17 = false;
                        int d57 = oVar.d(8);
                        if (d57 <= 31) {
                            i17 = 7;
                            if (d57 > 7) {
                                if (d57 <= 15) {
                                    oVar.f(8);
                                } else if (d57 <= 23) {
                                    oVar.f(16);
                                } else if (d57 <= 31) {
                                    oVar.f(24);
                                }
                            }
                        } else {
                            i17 = 7;
                            if (d57 <= 127) {
                                if (d57 == 32) {
                                    this.f298325j.a(' ');
                                } else if (d57 == 33) {
                                    this.f298325j.a((char) 160);
                                } else if (d57 == 37) {
                                    this.f298325j.a((char) 8230);
                                } else if (d57 == 42) {
                                    this.f298325j.a((char) 352);
                                } else if (d57 == 44) {
                                    this.f298325j.a((char) 338);
                                } else if (d57 == 63) {
                                    this.f298325j.a((char) 376);
                                } else if (d57 == 57) {
                                    this.f298325j.a((char) 8482);
                                } else if (d57 == 58) {
                                    this.f298325j.a((char) 353);
                                } else if (d57 == 60) {
                                    this.f298325j.a((char) 339);
                                } else if (d57 != 61) {
                                    switch (d57) {
                                        case 48:
                                            this.f298325j.a((char) 9608);
                                            break;
                                        case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                                            this.f298325j.a((char) 8216);
                                            break;
                                        case 50:
                                            this.f298325j.a((char) 8217);
                                            break;
                                        case 51:
                                            this.f298325j.a((char) 8220);
                                            break;
                                        case 52:
                                            this.f298325j.a((char) 8221);
                                            break;
                                        case 53:
                                            this.f298325j.a((char) 8226);
                                            break;
                                        default:
                                            switch (d57) {
                                                case 118:
                                                    this.f298325j.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f298325j.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f298325j.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f298325j.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f298325j.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f298325j.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f298325j.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f298325j.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f298325j.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f298325j.a((char) 9484);
                                                    break;
                                            }
                                    }
                                } else {
                                    this.f298325j.a((char) 8480);
                                }
                                z19 = z18;
                            } else if (d57 > 159) {
                                i18 = 2;
                                i19 = 6;
                                if (d57 <= 255) {
                                    if (d57 == 160) {
                                        this.f298325j.a((char) 13252);
                                    } else {
                                        this.f298325j.a('_');
                                    }
                                    z19 = z18;
                                }
                            } else if (d57 <= 135) {
                                oVar.f(32);
                            } else if (d57 <= 143) {
                                oVar.f(40);
                            } else if (d57 <= 159) {
                                i18 = 2;
                                oVar.f(2);
                                i19 = 6;
                                oVar.f(oVar.d(6) * 8);
                            }
                        }
                        i18 = 2;
                        i19 = 6;
                    }
                    i37 = i17;
                    i28 = i18;
                    i38 = i19;
                }
                if (z19) {
                    this.f298326k = h();
                }
            }
        }
        this.f298328m = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List h() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.g.h():java.util.List");
    }

    public final void i() {
        for (int i17 = 0; i17 < 8; i17++) {
            this.f298324i[i17].d();
        }
    }
}
