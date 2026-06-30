package j9;

/* loaded from: classes15.dex */
public final class c extends j9.h {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f298272r = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f298273s = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f298274t = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f298275u = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f298276v = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, com.tencent.mm.plugin.appbrand.jsapi.contact.j.CTRL_INDEX, 234, 238, 244, 251};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f298277w = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, be1.r.CTRL_INDEX, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, com.tencent.mm.plugin.appbrand.jsapi.cd.CTRL_INDEX, 219, 171, 187};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f298278x = {195, 227, 205, 204, com.tencent.mm.plugin.appbrand.jsapi.j6.CTRL_INDEX, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: g, reason: collision with root package name */
    public final int f298280g;

    /* renamed from: h, reason: collision with root package name */
    public final int f298281h;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f298284k;

    /* renamed from: l, reason: collision with root package name */
    public java.util.List f298285l;

    /* renamed from: m, reason: collision with root package name */
    public int f298286m;

    /* renamed from: n, reason: collision with root package name */
    public int f298287n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f298288o;

    /* renamed from: p, reason: collision with root package name */
    public byte f298289p;

    /* renamed from: q, reason: collision with root package name */
    public byte f298290q;

    /* renamed from: f, reason: collision with root package name */
    public final t9.p f298279f = new t9.p();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f298282i = new java.util.LinkedList();

    /* renamed from: j, reason: collision with root package name */
    public j9.b f298283j = new j9.b(0, 4);

    public c(java.lang.String str, int i17) {
        this.f298280g = com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i17 == 3 || i17 == 4) {
            this.f298281h = 2;
        } else {
            this.f298281h = 1;
        }
        i(0);
        h();
    }

    @Override // j9.h
    public i9.d d() {
        java.util.List list = this.f298284k;
        this.f298285l = list;
        return new j9.j(list);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // j9.h
    public void e(i9.i iVar) {
        int i17;
        byte[] array = iVar.f343610f.array();
        int limit = iVar.f343610f.limit();
        t9.p pVar = this.f298279f;
        pVar.u(array, limit);
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        while (true) {
            int i18 = pVar.f416542c - pVar.f416541b;
            int i19 = this.f298280g;
            if (i18 < i19) {
                if (z18) {
                    if (!z19) {
                        this.f298288o = false;
                    }
                    int i27 = this.f298286m;
                    if (i27 == 1 || i27 == 3) {
                        this.f298284k = g();
                        return;
                    }
                    return;
                }
                return;
            }
            byte m17 = i19 == 2 ? (byte) -4 : (byte) pVar.m();
            byte m18 = (byte) (pVar.m() & 127);
            byte m19 = (byte) (pVar.m() & 127);
            if ((m17 & 6) == 4 && ((i17 = this.f298281h) != 1 || (m17 & 1) == 0)) {
                if (i17 != 2 || (m17 & 1) == 1) {
                    if (m18 != 0 || m19 != 0) {
                        int i28 = m18 & 247;
                        if (i28 == 17 && (m19 & 240) == 48) {
                            this.f298283j.f298265d.append((char) f298276v[m19 & 15]);
                        } else if ((m18 & 246) == 18 && (m19 & 224) == 32) {
                            android.text.SpannableStringBuilder spannableStringBuilder = this.f298283j.f298265d;
                            int length = spannableStringBuilder.length();
                            if (length > 0) {
                                spannableStringBuilder.delete(length - 1, length);
                            }
                            if ((m18 & 1) == 0) {
                                this.f298283j.f298265d.append((char) f298277w[m19 & 31]);
                            } else {
                                this.f298283j.f298265d.append((char) f298278x[m19 & 31]);
                            }
                        } else if ((m18 & 224) == 0) {
                            int i29 = m18 & 240;
                            boolean z27 = i29 == 16 ? true : z17;
                            if (z27) {
                                if (this.f298288o && this.f298289p == m18 && this.f298290q == m19) {
                                    this.f298288o = z17;
                                    z19 = true;
                                } else {
                                    this.f298288o = true;
                                    this.f298289p = m18;
                                    this.f298290q = m19;
                                }
                            }
                            boolean z28 = (i28 == 17 && (m19 & 240) == 32) ? true : z17;
                            int[] iArr = f298274t;
                            if (z28) {
                                boolean z29 = (m19 & 1) == 1;
                                j9.b bVar = this.f298283j;
                                android.text.SpannableStringBuilder spannableStringBuilder2 = bVar.f298265d;
                                if (z29) {
                                    bVar.f298271j = spannableStringBuilder2.length();
                                } else if (bVar.f298271j != -1) {
                                    spannableStringBuilder2.setSpan(new android.text.style.UnderlineSpan(), bVar.f298271j, spannableStringBuilder2.length(), 33);
                                    bVar.f298271j = -1;
                                }
                                int i37 = (m19 >> 1) & 15;
                                if (i37 == 7) {
                                    this.f298283j.d(new android.text.style.StyleSpan(2), 2);
                                    this.f298283j.d(new android.text.style.ForegroundColorSpan(-1), 1);
                                } else {
                                    this.f298283j.d(new android.text.style.ForegroundColorSpan(iArr[i37]), 1);
                                }
                            } else {
                                if (i29 == 16 && (m19 & 192) == 64) {
                                    int i38 = f298272r[m18 & 7];
                                    if ((m19 & 32) != 0) {
                                        i38++;
                                    }
                                    j9.b bVar2 = this.f298283j;
                                    if (i38 != bVar2.f298266e) {
                                        if (this.f298286m != 1 && !bVar2.b()) {
                                            j9.b bVar3 = new j9.b(this.f298286m, this.f298287n);
                                            this.f298283j = bVar3;
                                            this.f298282i.add(bVar3);
                                        }
                                        this.f298283j.f298266e = i38;
                                    }
                                    if ((m19 & 1) == 1) {
                                        ((java.util.ArrayList) this.f298283j.f298262a).add(new android.text.style.UnderlineSpan());
                                    }
                                    int i39 = (m19 >> 1) & 15;
                                    if (i39 > 7) {
                                        this.f298283j.f298267f = f298273s[i39 & 7];
                                    } else if (i39 == 7) {
                                        ((java.util.ArrayList) this.f298283j.f298262a).add(new android.text.style.StyleSpan(2));
                                        ((java.util.ArrayList) this.f298283j.f298262a).add(new android.text.style.ForegroundColorSpan(-1));
                                    } else {
                                        ((java.util.ArrayList) this.f298283j.f298262a).add(new android.text.style.ForegroundColorSpan(iArr[i39]));
                                    }
                                } else {
                                    if (i28 == 23 && m19 >= 33 && m19 <= 35) {
                                        this.f298283j.f298268g = m19 - 32;
                                    } else {
                                        if (i28 == 20 && (m19 & 240) == 32) {
                                            if (m19 == 32) {
                                                i(2);
                                            } else if (m19 != 41) {
                                                switch (m19) {
                                                    case 37:
                                                        this.f298287n = 2;
                                                        i(1);
                                                        break;
                                                    case 38:
                                                        this.f298287n = 3;
                                                        i(1);
                                                        break;
                                                    case 39:
                                                        this.f298287n = 4;
                                                        i(1);
                                                        break;
                                                    default:
                                                        int i47 = this.f298286m;
                                                        if (i47 != 0) {
                                                            if (m19 == 33) {
                                                                android.text.SpannableStringBuilder spannableStringBuilder3 = this.f298283j.f298265d;
                                                                int length2 = spannableStringBuilder3.length();
                                                                if (length2 > 0) {
                                                                    spannableStringBuilder3.delete(length2 - 1, length2);
                                                                    break;
                                                                }
                                                            } else {
                                                                switch (m19) {
                                                                    case 44:
                                                                        this.f298284k = null;
                                                                        if (i47 == 1 || i47 == 3) {
                                                                            h();
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 45:
                                                                        if (i47 == 1 && !this.f298283j.b()) {
                                                                            j9.b bVar4 = this.f298283j;
                                                                            java.util.LinkedList linkedList = (java.util.LinkedList) bVar4.f298264c;
                                                                            linkedList.add(bVar4.a());
                                                                            bVar4.f298265d.clear();
                                                                            ((java.util.ArrayList) bVar4.f298262a).clear();
                                                                            ((java.util.ArrayList) bVar4.f298263b).clear();
                                                                            bVar4.f298271j = -1;
                                                                            int min = java.lang.Math.min(bVar4.f298270i, bVar4.f298266e);
                                                                            while (linkedList.size() >= min) {
                                                                                linkedList.remove(0);
                                                                            }
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 46:
                                                                        h();
                                                                        break;
                                                                    case 47:
                                                                        this.f298284k = g();
                                                                        h();
                                                                        break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                }
                                            } else {
                                                i(3);
                                            }
                                        }
                                    }
                                }
                            }
                            z19 = z27;
                        } else {
                            j9.b bVar5 = this.f298283j;
                            int[] iArr2 = f298275u;
                            bVar5.f298265d.append((char) iArr2[(m18 & Byte.MAX_VALUE) - 32]);
                            if ((m19 & 224) != 0) {
                                this.f298283j.f298265d.append((char) iArr2[(m19 & Byte.MAX_VALUE) - 32]);
                            }
                        }
                        z18 = true;
                        z17 = false;
                    }
                }
            }
        }
    }

    @Override // j9.h
    public boolean f() {
        return this.f298284k != this.f298285l;
    }

    @Override // j9.h, o8.e
    public void flush() {
        super.flush();
        this.f298284k = null;
        this.f298285l = null;
        i(0);
        h();
        this.f298287n = 4;
        this.f298288o = false;
        this.f298289p = (byte) 0;
        this.f298290q = (byte) 0;
    }

    public final java.util.List g() {
        int i17;
        float f17;
        int i18;
        int i19;
        i9.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i27 = 0;
        while (true) {
            java.util.LinkedList linkedList = this.f298282i;
            if (i27 >= linkedList.size()) {
                return arrayList;
            }
            j9.b bVar = (j9.b) linkedList.get(i27);
            bVar.getClass();
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            int i28 = 0;
            while (true) {
                java.util.LinkedList linkedList2 = (java.util.LinkedList) bVar.f298264c;
                if (i28 >= linkedList2.size()) {
                    break;
                }
                spannableStringBuilder.append((java.lang.CharSequence) linkedList2.get(i28));
                spannableStringBuilder.append('\n');
                i28++;
            }
            spannableStringBuilder.append((java.lang.CharSequence) bVar.a());
            if (spannableStringBuilder.length() == 0) {
                aVar = null;
            } else {
                int i29 = bVar.f298267f + bVar.f298268g;
                int length = i29 - ((32 - i29) - spannableStringBuilder.length());
                if (bVar.f298269h == 2 && java.lang.Math.abs(length) < 3) {
                    f17 = 0.5f;
                    i17 = 1;
                } else if (bVar.f298269h != 2 || length <= 0) {
                    i17 = 0;
                    f17 = ((i29 / 32.0f) * 0.8f) + 0.1f;
                } else {
                    f17 = (((32 - r6) / 32.0f) * 0.8f) + 0.1f;
                    i17 = 2;
                }
                if (bVar.f298269h == 1 || (i18 = bVar.f298266e) > 7) {
                    i18 = (bVar.f298266e - 15) - 2;
                    i19 = 2;
                } else {
                    i19 = 0;
                }
                aVar = new i9.a(spannableStringBuilder, android.text.Layout.Alignment.ALIGN_NORMAL, i18, 1, i19, f17, i17, Float.MIN_VALUE);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
            i27++;
        }
    }

    public final void h() {
        this.f298283j.c(this.f298286m, this.f298287n);
        java.util.LinkedList linkedList = this.f298282i;
        linkedList.clear();
        linkedList.add(this.f298283j);
    }

    public final void i(int i17) {
        int i18 = this.f298286m;
        if (i18 == i17) {
            return;
        }
        this.f298286m = i17;
        h();
        if (i18 == 3 || i17 == 1 || i17 == 0) {
            this.f298284k = null;
        }
    }

    @Override // j9.h, o8.e
    public void release() {
    }
}
