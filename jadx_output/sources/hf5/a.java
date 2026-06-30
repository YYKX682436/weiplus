package hf5;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.n f281229a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f281230b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f281231c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f281232d;

    /* renamed from: e, reason: collision with root package name */
    public final hf5.h f281233e;

    public a(gf5.n language) {
        hf5.r sVar;
        kotlin.jvm.internal.o.g(language, "language");
        this.f281229a = language;
        java.util.ArrayList<hf5.r> arrayList = new java.util.ArrayList();
        for (gf5.x xVar : language.f271411d) {
            if (xVar instanceof gf5.r) {
                gf5.r rVar = (gf5.r) xVar;
                sVar = new hf5.m(rVar, new hf5.h(rVar.f271437a));
            } else if (xVar instanceof gf5.h) {
                gf5.h hVar = (gf5.h) xVar;
                sVar = new hf5.k(hVar, new hf5.h(hVar.f271399d));
            } else if (xVar instanceof gf5.a) {
                sVar = new hf5.i((gf5.a) xVar);
            } else if (xVar instanceof gf5.v) {
                gf5.v vVar = (gf5.v) xVar;
                sVar = new hf5.p(vVar, new hf5.h(vVar.f271457a));
            } else if (xVar instanceof gf5.s) {
                sVar = new hf5.n((gf5.s) xVar);
            } else if (xVar instanceof gf5.u) {
                gf5.u uVar = (gf5.u) xVar;
                sVar = new hf5.o(uVar, new hf5.h(uVar.f271454a));
            } else if (xVar instanceof gf5.w) {
                gf5.w wVar = (gf5.w) xVar;
                sVar = new hf5.q(wVar, new hf5.h(wVar.f271463a));
            } else if (xVar instanceof gf5.f) {
                gf5.f fVar = (gf5.f) xVar;
                sVar = new hf5.j(fVar, new hf5.h(fVar.f271390a));
            } else {
                if (!(xVar instanceof gf5.a0)) {
                    throw new jz5.j();
                }
                sVar = new hf5.s((gf5.a0) xVar);
            }
            arrayList.add(sVar);
        }
        this.f281230b = arrayList;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (hf5.r rVar2 : arrayList) {
            java.util.Set a17 = rVar2.a();
            if (a17 != null) {
                java.util.Iterator it = a17.iterator();
                while (it.hasNext()) {
                    java.lang.Character valueOf = java.lang.Character.valueOf(((java.lang.Character) it.next()).charValue());
                    java.lang.Object obj = linkedHashMap.get(valueOf);
                    if (obj == null) {
                        obj = new java.util.ArrayList();
                        linkedHashMap.put(valueOf, obj);
                    }
                    ((java.util.List) obj).add(rVar2);
                }
            }
        }
        this.f281231c = linkedHashMap;
        java.util.List list = this.f281230b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((hf5.r) obj2).a() == null) {
                arrayList2.add(obj2);
            }
        }
        this.f281232d = arrayList2;
        gf5.n nVar = this.f281229a;
        gf5.z zVar = gf5.z.f271472f;
        nVar.getClass();
        java.util.Collection collection = (java.util.Set) ((java.util.Map) nVar.f271421n.getValue()).get(zVar);
        this.f281233e = new hf5.h(collection == null ? kz5.r0.f314002d : collection);
    }

    public final int a(java.lang.String str, int i17, int i18) {
        int i19 = 0;
        while (i17 < i18 && i17 < str.length()) {
            if (this.f281229a.f271414g.contains(java.lang.Character.valueOf(str.charAt(i17)))) {
                i19++;
            }
            i17++;
        }
        return i19;
    }

    public final java.util.List b(java.lang.CharSequence code) {
        gf5.n nVar;
        java.lang.Object obj;
        int i17;
        int a17;
        char charAt;
        int i18;
        int length;
        kotlin.jvm.internal.o.g(code, "code");
        java.lang.String obj2 = code.toString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i19 = 0;
        int i27 = 0;
        while (i19 < obj2.length()) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) this.f281233e.f281243a).get(java.lang.Character.valueOf(obj2.charAt(i19)));
            java.util.List list2 = kz5.p0.f313996d;
            if (list == null) {
                list = list2;
            }
            java.util.Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                nVar = this.f281229a;
                if (!hasNext) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.lang.String str = (java.lang.String) obj;
                boolean z17 = true;
                if (!r26.i0.r(obj2, i19, str, 0, str.length(), !nVar.f271409b) || (((length = str.length() + i19) < obj2.length() && nVar.d(obj2.charAt(length))) || (i19 > 0 && nVar.d(obj2.charAt(i19 - 1))))) {
                    z17 = false;
                }
                if (z17) {
                    break;
                }
            }
            java.lang.String str2 = (java.lang.String) obj;
            gf5.y yVar = str2 != null ? new gf5.y(i19, str2.length() + i19, gf5.z.f271472f) : null;
            if (yVar != null) {
                arrayList.add(yVar);
                i17 = yVar.f271468b;
                a17 = a(obj2, i19, i17);
            } else {
                java.util.List list3 = (java.util.List) ((java.util.LinkedHashMap) this.f281231c).get(java.lang.Character.valueOf(obj2.charAt(i19)));
                if (list3 != null) {
                    list2 = list3;
                }
                jz5.l e17 = e(list2, obj2, i19, i27);
                if (e17 == null) {
                    e17 = e(this.f281232d, obj2, i19, i27);
                }
                if (e17 != null) {
                    kz5.h0.u(arrayList, (java.lang.Iterable) e17.f302833d);
                    java.lang.Object obj3 = e17.f302834e;
                    i27 += a(obj2, i19, ((java.lang.Number) obj3).intValue());
                    i19 = ((java.lang.Number) obj3).intValue();
                } else {
                    char charAt2 = obj2.charAt(i19);
                    if (nVar.f271415h.f271452a.contains(java.lang.Character.valueOf(charAt2))) {
                        i17 = i19;
                        while (i17 < obj2.length()) {
                            if (!nVar.f271415h.f271453b.contains(java.lang.Character.valueOf(obj2.charAt(i17)))) {
                                break;
                            }
                            char charAt3 = obj2.charAt(i17);
                            if (charAt3 == '+' || charAt3 == '-') {
                                if (!((i17 > i19 && ((charAt = obj2.charAt(i17 + (-1))) == 'e' || charAt == 'E') && (i18 = i17 + 1) < obj2.length()) ? java.lang.Character.isDigit(obj2.charAt(i18)) : false)) {
                                    break;
                                }
                            }
                            i17++;
                        }
                        arrayList.add(new gf5.y(i19, i17, gf5.z.f271474h));
                        a17 = a(obj2, i19, i17);
                    } else if (nVar.e(charAt2)) {
                        i17 = i19;
                        while (i17 < obj2.length() && nVar.d(obj2.charAt(i17))) {
                            i17++;
                        }
                        java.lang.String substring = obj2.substring(i19, i17);
                        kotlin.jvm.internal.o.f(substring, "substring(...)");
                        nVar.getClass();
                        gf5.z zVar = (gf5.z) ((java.util.Map) nVar.f271422o.getValue()).get(nVar.f(substring));
                        if (zVar != null) {
                            arrayList.add(new gf5.y(i19, i17, zVar));
                        }
                        a17 = a(obj2, i19, i17);
                    } else {
                        if (nVar.f271414g.contains(java.lang.Character.valueOf(obj2.charAt(i19)))) {
                            i27++;
                        }
                        i19++;
                    }
                }
            }
            i27 += a17;
            i19 = i17;
        }
        return arrayList;
    }

    public final boolean c(java.lang.String str, int i17) {
        if (i17 == 0) {
            return true;
        }
        gf5.n nVar = this.f281229a;
        int i18 = i17 - 1;
        if (nVar.f271414g.contains(java.lang.Character.valueOf(str.charAt(i18)))) {
            return true;
        }
        if (!r26.a.b(str.charAt(i17))) {
            return false;
        }
        while (i18 >= 0 && !nVar.f271414g.contains(java.lang.Character.valueOf(str.charAt(i18)))) {
            if (!r26.a.b(str.charAt(i18))) {
                return false;
            }
            i18--;
        }
        return true;
    }

    public final boolean d(char c17, gf5.v vVar) {
        if (vVar.f271460d.contains(java.lang.Character.valueOf(c17))) {
            return true;
        }
        return vVar.f271461e && this.f281229a.d(c17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:330:0x0040, code lost:
    
        if (r3.intValue() != r36) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x050a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x01a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x000a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0424 A[LOOP:4: B:59:0x03f2->B:72:0x0424, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x042d A[EDGE_INSN: B:73:0x042d->B:74:0x042d BREAK  A[LOOP:4: B:59:0x03f2->B:72:0x0424], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l e(java.util.List r33, java.lang.String r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 1533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf5.a.e(java.util.List, java.lang.String, int, int):jz5.l");
    }

    public final int f(java.lang.String str, int i17, gf5.a aVar) {
        int length = i17 + aVar.f271366a.length();
        int i18 = 1;
        while (length < str.length()) {
            gf5.n nVar = this.f281229a;
            if (!aVar.f271369d && nVar.f271414g.contains(java.lang.Character.valueOf(str.charAt(length)))) {
                return length;
            }
            if (aVar.f271370e && str.charAt(length) == nVar.f271416i) {
                length += 2;
            } else if (aVar.f271371f && r26.i0.z(str, aVar.f271366a, length, false, 4, null)) {
                i18++;
                length += aVar.f271366a.length();
            } else if (r26.i0.z(str, aVar.f271367b, length, false, 4, null)) {
                i18--;
                length += aVar.f271367b.length();
                if (i18 == 0) {
                    return length;
                }
            } else {
                length++;
            }
        }
        return str.length();
    }

    public final int g(java.lang.String str, int i17) {
        while (i17 < str.length() && (str.charAt(i17) == ' ' || str.charAt(i17) == '\t')) {
            i17++;
        }
        return i17;
    }
}
