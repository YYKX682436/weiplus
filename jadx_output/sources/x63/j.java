package x63;

/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f452240a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f452241b = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f452242c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f452243d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f452244e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.regex.Pattern f452245f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.regex.Pattern f452246g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.regex.Pattern f452247h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.regex.Pattern f452248i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.regex.Pattern f452249j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.regex.Pattern f452250k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.regex.Pattern f452251l;

    public j() {
        kk.j jVar = x63.g.f452235a;
        this.f452245f = java.util.regex.Pattern.compile(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_solitaire_content_regex, "^([0-9]{1,3})(\\s*)([[)]．.,~。，、:;\\-_#@!&*%）：；\\—\\—！])(\\s*)", true));
        this.f452246g = java.util.regex.Pattern.compile(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_solitaire_example_regex, "(例|例如|如|格式|格式如)(\\s*)([,.:，：、 ])(.+)", true));
        this.f452247h = java.util.regex.Pattern.compile(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_solitaire_separator_regex, "^([0-9]{1,3})(\\s*)([[)]．.,~。，、:;\\-_#@!&*%）：；\\—\\—！])", true));
        this.f452248i = java.util.regex.Pattern.compile(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_solitaire_num_regex, "^\\d{1,3}", true));
        this.f452249j = java.util.regex.Pattern.compile(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_solitaire_content_separator_regex, "([0-9]{1,3})(\\s*)([.。;；、:,，])", true));
        this.f452250k = java.util.regex.Pattern.compile(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_solitaire_content_num_regex, "\\d{1,3}", true));
        this.f452251l = java.util.regex.Pattern.compile(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_solitaire_single_num_regex, "^\\d{1,3}$", true));
        try {
            if (com.tencent.mm.sdk.platformtools.o4.M("group_solitatire").f("analyze_crash_content_num")) {
                com.tencent.mm.sdk.platformtools.o4.M("group_solitatire").remove("analyze_crash_content_num");
            }
            java.lang.String[] split = com.tencent.mm.sdk.platformtools.o4.M("group_solitatire").getString("analyze_crash_content_num_new", "").split(";");
            if (split != null) {
                int i17 = 0;
                for (int length = split.length - 1; length >= 0; length--) {
                    java.lang.String str = split[length];
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        i17++;
                        if (i17 > 20) {
                            return;
                        }
                        java.lang.String[] split2 = str.split(",");
                        if (split2 != null && split2.length == 2) {
                            x63.i iVar = new x63.i(this, split2[0], com.tencent.mm.sdk.platformtools.t8.P(split2[1], 0));
                            this.f452240a.put(split2[0], iVar);
                            this.f452241b.add(iVar);
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireManager", "GroupSolitatireManager %s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public static java.lang.String d(java.lang.String str) {
        if (str.length() > 200) {
            str = str.substring(0, 199);
        }
        return kk.k.g(str.getBytes());
    }

    public final void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String d17 = d(str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f452240a;
        if (concurrentHashMap.containsKey(d17)) {
            ((x63.i) concurrentHashMap.get(d17)).f452239b++;
        } else {
            x63.i iVar = new x63.i(this, d17, 1);
            concurrentHashMap.put(d17, iVar);
            this.f452241b.add(iVar);
        }
        m();
    }

    public void b(java.lang.String str, java.lang.String str2) {
        this.f452242c.remove(str + str2);
    }

    public x63.a c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f452244e;
        x63.a aVar = (x63.a) concurrentHashMap.get(str);
        if (aVar == null) {
            aVar = new x63.a();
            aVar.f452233e = c01.id.e();
            java.util.List D0 = ((t63.e) i95.n0.c(t63.e.class)).Bi().D0(str, 0);
            java.util.List D02 = ((t63.e) i95.n0.c(t63.e.class)).Bi().D0(str, 1);
            java.util.ArrayList arrayList = (java.util.ArrayList) D0;
            if (arrayList.size() > x63.g.s()) {
                aVar.f452231c = false;
                aVar.f452232d = ((y63.a) arrayList.get(x63.g.s() - 1)).field_lastActiveTime;
            } else {
                aVar.f452231c = true;
                aVar.f452232d = c01.id.e() - (x63.g.p() * y63.c.f459659f.longValue());
            }
            java.util.ArrayList arrayList2 = (java.util.ArrayList) D02;
            if (arrayList2.size() > x63.g.r()) {
                aVar.f452229a = false;
                aVar.f452230b = ((y63.a) arrayList2.get(x63.g.r() - 1)).field_lastActiveTime;
            } else {
                aVar.f452229a = true;
                aVar.f452230b = c01.id.e() - (5 * y63.c.f459658e.longValue());
            }
            concurrentHashMap.put(str, aVar);
        } else if (aVar.f452233e - c01.id.e() > 10) {
            aVar.f452233e = c01.id.e();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                long e17 = c01.id.e() - (x63.g.p() * y63.c.f459659f.longValue());
                if (aVar.f452231c) {
                    aVar.f452232d = e17;
                } else if (aVar.f452232d < e17) {
                    aVar.f452231c = true;
                    aVar.f452232d = e17;
                }
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                long e18 = c01.id.e();
                kk.j jVar = x63.g.f452235a;
                long longValue = e18 - (5 * y63.c.f459658e.longValue());
                if (aVar.f452229a) {
                    aVar.f452230b = longValue;
                } else if (aVar.f452230b < longValue) {
                    aVar.f452229a = true;
                    aVar.f452230b = longValue;
                }
            }
        }
        return aVar;
    }

    public final int e(java.lang.String str) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String d17 = d(str);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f452240a;
            if (concurrentHashMap.containsKey(d17)) {
                return ((x63.i) concurrentHashMap.get(d17)).f452239b;
            }
        }
        return 0;
    }

    public y63.a f(java.lang.String str, java.lang.String str2) {
        int i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        y63.a aVar = (y63.a) this.f452242c.get(str + str2);
        if (aVar == null) {
            aVar = ((t63.e) i95.n0.c(t63.e.class)).Bi().L0(str, str2, true);
            if (aVar != null) {
                this.f452242c.put(str + str2, aVar);
            }
        } else {
            x63.a c17 = ((t63.e) i95.n0.c(t63.e.class)).wi().c(str);
            if (c17 != null && (((i17 = aVar.field_active) == 1 && aVar.field_lastActiveTime < c17.f452230b) || (i17 == 0 && aVar.field_lastActiveTime < c17.f452232d))) {
                b(str, str2);
                ((ku5.t0) ku5.t0.f312615d).g(new x63.h(this, str, str2));
                return null;
            }
        }
        return aVar;
    }

    public final java.util.List g(y63.a aVar, java.lang.String str) {
        y63.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        y63.b bVar2 = new y63.b();
        java.util.regex.Matcher matcher = this.f452247h.matcher(str.trim());
        java.lang.String trim = str.trim();
        java.util.regex.Pattern pattern = this.f452248i;
        java.util.regex.Matcher matcher2 = pattern.matcher(trim);
        if (matcher.find()) {
            java.util.regex.Matcher matcher3 = pattern.matcher(matcher.group(0).trim());
            if (matcher3.find()) {
                bVar2.f459657f = com.tencent.mm.sdk.platformtools.t8.P(matcher3.group(0), 0);
            }
            bVar2.f459654c = matcher3.replaceFirst("").trim();
            bVar2.f459656e = matcher.replaceFirst("").trim();
        } else if (matcher2.find()) {
            bVar2.f459657f = com.tencent.mm.sdk.platformtools.t8.P(matcher2.group(0), 0);
            java.lang.String trim2 = matcher2.replaceFirst("").trim();
            bVar2.f459656e = trim2;
            if (com.tencent.mm.sdk.platformtools.t8.K0(trim2) || com.tencent.mm.sdk.platformtools.t8.K0(bVar2.f459656e.trim())) {
                return null;
            }
        }
        if (aVar != null) {
            java.util.regex.Matcher matcher4 = this.f452249j.matcher(bVar2.f459656e);
            if (matcher4.find()) {
                int indexOf = bVar2.f459656e.indexOf(matcher4.group(0));
                if (indexOf != -1) {
                    java.lang.String substring = bVar2.f459656e.substring(0, indexOf);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(substring) || com.tencent.mm.sdk.platformtools.t8.K0(substring.trim())) {
                        arrayList.add(bVar2);
                    } else {
                        int i17 = 1;
                        while (true) {
                            if (i17 > aVar.N.size()) {
                                bVar = null;
                                break;
                            }
                            if (y63.b.b(((y63.b) aVar.N.get(java.lang.Integer.valueOf(i17))).f459656e, substring.trim())) {
                                bVar = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i17));
                                break;
                            }
                            i17++;
                        }
                        if (bVar != null) {
                            java.lang.String str2 = bVar2.f459656e;
                            bVar2.f459656e = bVar.f459656e;
                            arrayList.add(bVar2);
                            java.lang.String substring2 = str2.substring(indexOf);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(substring2) && !com.tencent.mm.sdk.platformtools.t8.K0(substring2.trim())) {
                                h(arrayList, aVar, substring2.trim());
                            }
                        } else {
                            arrayList.add(bVar2);
                        }
                    }
                } else {
                    arrayList.add(bVar2);
                }
            } else {
                arrayList.add(bVar2);
            }
        } else {
            arrayList.add(bVar2);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    public final void h(java.util.List list, y63.a aVar, java.lang.String str) {
        y63.b bVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        y63.b bVar2 = new y63.b();
        java.util.regex.Pattern pattern = this.f452249j;
        java.util.regex.Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            java.util.regex.Matcher matcher2 = this.f452250k.matcher(matcher.group(0).trim());
            if (matcher2.find()) {
                bVar2.f459657f = com.tencent.mm.sdk.platformtools.t8.P(matcher2.group(0), 0);
            }
            bVar2.f459654c = matcher2.replaceFirst("").trim();
            java.lang.String trim = matcher.replaceFirst("").trim();
            bVar2.f459656e = trim;
            java.util.regex.Matcher matcher3 = pattern.matcher(trim);
            if (!matcher3.find()) {
                list.add(bVar2);
                return;
            }
            int indexOf = bVar2.f459656e.indexOf(matcher3.group(0));
            if (indexOf == -1) {
                list.add(bVar2);
                return;
            }
            java.lang.String substring = bVar2.f459656e.substring(0, indexOf);
            if (com.tencent.mm.sdk.platformtools.t8.K0(substring) || com.tencent.mm.sdk.platformtools.t8.K0(substring.trim())) {
                list.add(bVar2);
                return;
            }
            int i17 = 1;
            while (true) {
                if (i17 > aVar.N.size()) {
                    bVar = null;
                    break;
                } else {
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((y63.b) aVar.N.get(java.lang.Integer.valueOf(i17))).f459656e, substring.trim())) {
                        bVar = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i17));
                        break;
                    }
                    i17++;
                }
            }
            if (bVar == null) {
                list.add(bVar2);
                return;
            }
            java.lang.String str2 = bVar2.f459656e;
            bVar2.f459656e = bVar.f459656e;
            list.add(bVar2);
            java.lang.String substring2 = str2.substring(indexOf);
            if (com.tencent.mm.sdk.platformtools.t8.K0(substring2) || com.tencent.mm.sdk.platformtools.t8.K0(substring2.trim())) {
                return;
            }
            h(list, aVar, substring2.trim());
        }
    }

    public final android.util.Pair i(java.lang.String str, java.lang.String[] strArr) {
        int i17;
        boolean z17;
        int length;
        int i18;
        int length2 = str.length();
        int length3 = strArr.length - 1;
        while (true) {
            if (length3 < 0) {
                i17 = 0;
                length3 = 0;
                z17 = false;
                break;
            }
            java.lang.String str2 = strArr[length3];
            int length4 = length2 - str2.length();
            if (this.f452251l.matcher(str2.trim()).find()) {
                i17 = str.indexOf(str2, length4);
                z17 = true;
                break;
            }
            length2 = length4 - 1;
            length3--;
        }
        if (!z17) {
            return new android.util.Pair(java.lang.Boolean.FALSE, null);
        }
        y63.a aVar = new y63.a();
        if (i17 >= 0 && i17 <= str.length()) {
            int i19 = 0;
            int i27 = 0;
            while (true) {
                if (i19 >= length3) {
                    i18 = -1;
                    break;
                }
                java.lang.String str3 = strArr[i19];
                java.util.regex.Matcher matcher = this.f452246g.matcher(str3.trim());
                if (matcher.find()) {
                    java.lang.String group = matcher.group(0);
                    i18 = com.tencent.mm.sdk.platformtools.t8.K0(group) ? str.indexOf(str3, i27) : str.indexOf(group, i27);
                } else {
                    i27 = i27 + str3.length() + 1;
                    i19++;
                }
            }
            if (i18 != 0) {
                if (i18 == -1) {
                    aVar.H = str.substring(0, i17).trim();
                } else {
                    aVar.H = str.substring(0, i18).trim();
                }
            }
            if (x63.g.F(aVar.H)) {
                return new android.util.Pair(java.lang.Boolean.FALSE, null);
            }
            if (i18 >= 0 && i18 <= i17) {
                aVar.I = str.substring(i18, i17).trim();
            }
        }
        if (length3 >= 0 && length3 < strArr.length && (length = i17 + strArr[length3].length()) > 0 && length < str.length()) {
            aVar.f459651J = str.substring(length).trim();
        }
        if (x63.g.y(aVar.f459651J) > x63.g.t() * 2) {
            return new android.util.Pair(java.lang.Boolean.FALSE, null);
        }
        aVar.Q++;
        return new android.util.Pair(java.lang.Boolean.TRUE, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x0849, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 0, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0859, code lost:
    
        if (r4 <= 2000) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x085b, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 1, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x086b, code lost:
    
        if (r4 <= 3000) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x086d, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 2, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x087d, code lost:
    
        if (r4 <= 4000) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x087f, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 3, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0891, code lost:
    
        if (r4 <= 5000) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0893, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 4, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x08a1, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 5, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0456, code lost:
    
        l(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x045b, code lost:
    
        r11 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x045e, code lost:
    
        r0 = new android.util.Pair(r11, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0461, code lost:
    
        r2 = c01.id.d() - r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0469, code lost:
    
        if (r2 > 1000) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x046b, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 0, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04cf, code lost:
    
        com.tencent.mars.xlog.Log.i(r34, r31, java.lang.Long.valueOf(r2), java.lang.Integer.valueOf(r12.N.size()), java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x04ea, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x047b, code lost:
    
        if (r2 > 2000) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x047d, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 1, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x048d, code lost:
    
        if (r2 > 3000) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x048f, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 2, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x049f, code lost:
    
        if (r2 > 4000) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04a1, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 3, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x04b3, code lost:
    
        if (r2 > 5000) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x04b5, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 4, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x04c3, code lost:
    
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1174, 5, 1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x04eb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x04ec, code lost:
    
        r3 = r31;
        r4 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0501, code lost:
    
        r2 = r3;
        r3 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0857  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair j(java.lang.String r46, int r47, java.lang.String r48) {
        /*
            Method dump skipped, instructions count: 2382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x63.j.j(java.lang.String, int, java.lang.String):android.util.Pair");
    }

    public void k(java.lang.String str, y63.a aVar) {
        if (aVar == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_key)) {
            return;
        }
        this.f452243d.put(str + aVar.field_key, aVar);
    }

    public final void l(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.f452241b.remove((x63.i) this.f452240a.remove(d(str)));
        m();
    }

    public final void m() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f452241b.iterator();
        while (it.hasNext()) {
            x63.i iVar = (x63.i) it.next();
            sb6.append(iVar.f452238a);
            sb6.append(",");
            sb6.append(iVar.f452239b);
            sb6.append(";");
        }
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("group_solitatire");
        M.getClass();
        M.putString("analyze_crash_content_num_new", sb6.toString());
    }
}
