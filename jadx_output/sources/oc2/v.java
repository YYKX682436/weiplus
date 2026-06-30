package oc2;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final oc2.v f344282a = new oc2.v();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f344283b = jz5.h.b(oc2.r.f344242d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f344284c = jz5.h.b(oc2.q.f344240d);

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f344285d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f344286e;

    static {
        com.tencent.mars.xlog.Log.i("RenderNodeExt", "initMemoryTrim");
        ki.i.f308101c.c(new oc2.p());
        f344285d = new com.tencent.mm.sdk.platformtools.r2(5);
        f344286e = jz5.h.b(oc2.s.f344244d);
    }

    public static final void a(oc2.v vVar, java.lang.String str) {
        vVar.getClass();
        try {
            com.tencent.mm.sdk.platformtools.r2 r2Var = f344285d;
            int size = r2Var.size();
            if (size > 0) {
                r2Var.d(-1);
                com.tencent.mars.xlog.Log.i("RenderNodeExt", str + " memoryTrim cacheSize=" + size);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "RenderNodeExt-memoryTrim");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Size d(oc2.v r1, r45.cp5 r2, android.content.Context r3, oc2.w r4, float r5, int r6, java.lang.Object r7) {
        /*
            r6 = r6 & 4
            if (r6 == 0) goto L8
            boolean r5 = com.tencent.mm.plugin.finder.extension.reddot.render.RenderView.H
            r5 = 1107296256(0x42000000, float:32.0)
        L8:
            r1.getClass()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.o.g(r3, r1)
            java.lang.String r1 = "renderNodeType"
            kotlin.jvm.internal.o.g(r4, r1)
            r1 = 0
            if (r2 == 0) goto Lb8
            int r4 = r4.ordinal()
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L42
            if (r4 == r6) goto L37
            r0 = 2
            if (r4 != r0) goto L31
            r45.ap5 r4 = r2.f371769e
            if (r4 == 0) goto L4d
            r45.x80 r4 = r4.f370178f
            if (r4 == 0) goto L4d
            r45.qy3 r4 = r4.f389854e
            goto L4e
        L31:
            jz5.j r1 = new jz5.j
            r1.<init>()
            throw r1
        L37:
            r45.ap5 r4 = r2.f371769e
            if (r4 == 0) goto L4d
            r45.x80 r4 = r4.f370177e
            if (r4 == 0) goto L4d
            r45.qy3 r4 = r4.f389854e
            goto L4e
        L42:
            r45.ap5 r4 = r2.f371769e
            if (r4 == 0) goto L4d
            r45.x80 r4 = r4.f370176d
            if (r4 == 0) goto L4d
            r45.qy3 r4 = r4.f389854e
            goto L4e
        L4d:
            r4 = r7
        L4e:
            if (r4 == 0) goto L57
            r45.xy3 r0 = r4.f384352e
            if (r0 == 0) goto L57
            java.lang.String r0 = r0.f390593d
            goto L58
        L57:
            r0 = r7
        L58:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 == 0) goto L7a
            cu2.f0 r0 = cu2.f0.f222391a
            if (r4 == 0) goto L66
            java.lang.String r4 = r4.f384351d
            if (r4 != 0) goto L68
        L66:
            java.lang.String r4 = ""
        L68:
            r45.rl2 r4 = r0.a(r4)
            if (r4 == 0) goto L72
            java.lang.String r7 = r4.getString(r6)
        L72:
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r4 != 0) goto L79
            goto L7a
        L79:
            r6 = r1
        L7a:
            if (r6 == 0) goto Lb2
            oc2.v r1 = oc2.v.f344282a
            r45.yo5 r2 = r2.f371770f
            android.util.Size r1 = r1.j(r2, r3, r5)
            int r2 = r1.getWidth()
            if (r2 <= 0) goto L91
            int r2 = r1.getHeight()
            if (r2 <= 0) goto L91
            goto Lbe
        L91:
            android.util.Size r1 = new android.util.Size
            jz5.g r2 = oc2.v.f344284c
            r3 = r2
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            jz5.n r2 = (jz5.n) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r1.<init>(r3, r2)
            goto Lbe
        Lb2:
            android.util.Size r2 = new android.util.Size
            r2.<init>(r1, r1)
            goto Lbd
        Lb8:
            android.util.Size r2 = new android.util.Size
            r2.<init>(r1, r1)
        Lbd:
            r1 = r2
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oc2.v.d(oc2.v, r45.cp5, android.content.Context, oc2.w, float, int, java.lang.Object):android.util.Size");
    }

    public static int n(oc2.v vVar, r45.cp5 cp5Var, android.content.Context context, float f17, int i17, java.lang.Object obj) {
        r45.t60 t60Var;
        if ((i17 & 1) != 0) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        if ((i17 & 2) != 0) {
            boolean z17 = com.tencent.mm.plugin.finder.extension.reddot.render.RenderView.H;
            f17 = 14.0f;
        }
        vVar.getClass();
        kotlin.jvm.internal.o.g(cp5Var, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        r45.yo5 yo5Var = cp5Var.f371770f;
        float f18 = (yo5Var == null || (t60Var = yo5Var.f391261d) == null) ? 0.0f : t60Var.f386166d;
        if (f18 > 0.0f) {
            f17 = f18;
        }
        float q17 = i65.a.q(context);
        if (q17 > 1.4f) {
            q17 = 1.4f;
        }
        return mo0.h.a(context, f17 * q17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    public final boolean b(java.util.List list, java.lang.String tag, int i17, r45.st3 st3Var) {
        java.lang.Object obj;
        java.lang.Object obj2;
        r45.cp5 cp5Var;
        r45.yo5 yo5Var;
        r45.t60 t60Var;
        r45.cp5 cp5Var2;
        r45.yo5 yo5Var2;
        r45.t60 t60Var2;
        r45.ey5 ey5Var;
        r45.ey5 ey5Var2;
        r45.dl4 dl4Var;
        kotlin.jvm.internal.o.g(list, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((oc2.y0) it.next()).f344323c = null;
        }
        boolean z17 = false;
        if (((st3Var == null || (dl4Var = st3Var.f385973d) == null) ? null : dl4Var.f372551d) == null) {
            return false;
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            oc2.y0 y0Var = (oc2.y0) it6.next();
            if (y0Var.f344321a == 1) {
                r45.dl4 dl4Var2 = st3Var.f385973d;
                int i18 = (dl4Var2 == null || (ey5Var2 = dl4Var2.f372551d) == null) ? -1 : ey5Var2.f373829d;
                int i19 = (dl4Var2 == null || (ey5Var = dl4Var2.f372551d) == null) ? -1 : ey5Var.f373830e;
                java.util.ArrayList arrayList = y0Var.f344322b;
                oc2.y yVar = (oc2.y) kz5.n0.Z(arrayList);
                int i27 = yVar != null ? yVar.f344312b : -1;
                oc2.y yVar2 = (oc2.y) kz5.n0.k0(arrayList);
                int i28 = yVar2 != null ? yVar2.f344312b : -1;
                if ((i27 < 0 || i27 > i28) ? z17 : true) {
                    if (((i18 < 0 || i18 > i19) ? z17 : true) && i18 >= i27 && i19 <= i28) {
                        java.util.Iterator it7 = arrayList.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it7.next();
                            if (((oc2.y) obj).f344312b == i18 ? true : z17) {
                                break;
                            }
                        }
                        oc2.y yVar3 = (oc2.y) obj;
                        ?? r37 = (yVar3 == null || (cp5Var2 = yVar3.f344311a) == null || (yo5Var2 = cp5Var2.f371770f) == null || (t60Var2 = yo5Var2.f391261d) == null) ? z17 : t60Var2.f386168f;
                        if (i18 <= i19) {
                            int i29 = i18;
                            while (true) {
                                java.util.Iterator it8 = arrayList.iterator();
                                while (true) {
                                    if (!it8.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it8.next();
                                    if (((oc2.y) obj2).f344312b == i29) {
                                        break;
                                    }
                                }
                                oc2.y yVar4 = (oc2.y) obj2;
                                int i37 = (yVar4 == null || (cp5Var = yVar4.f344311a) == null || (yo5Var = cp5Var.f371770f) == null || (t60Var = yo5Var.f391261d) == null) ? 0 : t60Var.f386168f;
                                if (r37 == i37) {
                                    if (i29 == i19) {
                                        break;
                                    }
                                    i29++;
                                } else {
                                    com.tencent.mars.xlog.Log.i(tag, list.hashCode() + " source:" + i17 + " attachGlobalAttrs fail, node " + i29 + " line is " + i37 + ", diff with last line " + r37);
                                    return false;
                                }
                            }
                        }
                        y0Var.f344323c = st3Var;
                        com.tencent.mars.xlog.Log.i(tag, list.hashCode() + " source:" + i17 + " attachGlobalAttrs " + st3Var.hashCode() + ", globalIndex:[" + i18 + '-' + i19 + "],nodeIndex:[" + i27 + '-' + i28 + ']');
                        return true;
                    }
                }
                com.tencent.mars.xlog.Log.i(tag, list.hashCode() + " source:" + i17 + " attachGlobalAttrs fail, globalIndex:[" + i18 + '-' + i19 + "],nodeIndex:[" + i27 + '-' + i28 + ']');
            }
            z17 = false;
        }
        return z17;
    }

    public final boolean c(java.util.List list, oc2.w renderNodeType) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(list, "<this>");
        kotlin.jvm.internal.o.g(renderNodeType, "renderNodeType");
        java.util.Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.Iterator it6 = ((oc2.y0) next).f344322b.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it6.next();
                oc2.y yVar = (oc2.y) next2;
                if (renderNodeType == oc2.w.f344291f ? yVar.f344317g : yVar.f344313c || yVar.f344315e) {
                    obj = next2;
                    break;
                }
            }
            if (obj != null) {
                obj = next;
                break;
            }
        }
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0011, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x000f, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r4 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            boolean r0 = com.tencent.mm.ui.bk.C()
            java.lang.String r1 = ""
            if (r0 == 0) goto Lf
            if (r5 != 0) goto Ld
            if (r4 != 0) goto L12
            goto L11
        Ld:
            r4 = r5
            goto L12
        Lf:
            if (r4 != 0) goto L12
        L11:
            r4 = r1
        L12:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 != 0) goto L27
            r5 = 2
            r0 = 0
            java.lang.String r1 = "#"
            r2 = 0
            boolean r5 = r26.i0.A(r4, r1, r2, r5, r0)
            if (r5 != 0) goto L27
            java.lang.String r4 = r1.concat(r4)
        L27:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 == 0) goto L31
            r4 = 2147483647(0x7fffffff, float:NaN)
            goto L49
        L31:
            int r4 = android.graphics.Color.parseColor(r4)
            int r5 = android.graphics.Color.blue(r4)
            int r0 = android.graphics.Color.green(r4)
            int r1 = android.graphics.Color.red(r4)
            int r4 = android.graphics.Color.alpha(r4)
            int r4 = android.graphics.Color.argb(r5, r4, r1, r0)
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oc2.v.e(java.lang.String, java.lang.String):int");
    }

    public final int f(r45.cp5 cp5Var) {
        r45.lp lpVar;
        kotlin.jvm.internal.o.g(cp5Var, "<this>");
        r45.yo5 yo5Var = cp5Var.f371770f;
        r45.zo5 zo5Var = (yo5Var == null || (lpVar = yo5Var.f391262e) == null) ? null : lpVar.f379686e;
        return e(zo5Var != null ? zo5Var.f392253d : null, zo5Var != null ? zo5Var.f392254e : null);
    }

    public final java.lang.String g(r45.cp5 cp5Var, oc2.w renderNodeType) {
        r45.x80 x80Var;
        java.lang.String str;
        r45.x80 x80Var2;
        r45.x80 x80Var3;
        kotlin.jvm.internal.o.g(cp5Var, "<this>");
        kotlin.jvm.internal.o.g(renderNodeType, "renderNodeType");
        int ordinal = renderNodeType.ordinal();
        r45.w80 w80Var = null;
        boolean z17 = true;
        if (ordinal == 0) {
            r45.ap5 ap5Var = cp5Var.f371769e;
            if (ap5Var != null && (x80Var = ap5Var.f370176d) != null) {
                w80Var = x80Var.f389856g;
            }
        } else if (ordinal == 1) {
            r45.ap5 ap5Var2 = cp5Var.f371769e;
            if (ap5Var2 != null && (x80Var2 = ap5Var2.f370177e) != null) {
                w80Var = x80Var2.f389856g;
            }
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            r45.ap5 ap5Var3 = cp5Var.f371769e;
            if (ap5Var3 != null && (x80Var3 = ap5Var3.f370178f) != null) {
                w80Var = x80Var3.f389856g;
            }
        }
        if (!(w80Var != null && w80Var.f388961g)) {
            return "";
        }
        java.lang.String str2 = w80Var.f388959e;
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        return (z17 || (str = w80Var.f388959e) == null) ? "" : str;
    }

    public final java.lang.String h(r45.qy3 icon) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(icon, "icon");
        r45.xy3 xy3Var = icon.f384352e;
        if (xy3Var == null || (str = xy3Var.f390594e) == null) {
            str = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        cu2.f0 f0Var = cu2.f0.f222391a;
        java.lang.String str2 = icon.f384351d;
        if (str2 == null) {
            str2 = "";
        }
        r45.rl2 a17 = f0Var.a(str2);
        java.lang.String string = a17 != null ? a17.getString(2) : null;
        return string != null ? string : "";
    }

    public final r45.qy3 i(r45.cp5 cp5Var, oc2.w renderNodeType) {
        r45.x80 x80Var;
        r45.x80 x80Var2;
        r45.x80 x80Var3;
        kotlin.jvm.internal.o.g(cp5Var, "<this>");
        kotlin.jvm.internal.o.g(renderNodeType, "renderNodeType");
        int ordinal = renderNodeType.ordinal();
        if (ordinal == 0) {
            r45.ap5 ap5Var = cp5Var.f371769e;
            if (ap5Var == null || (x80Var = ap5Var.f370176d) == null) {
                return null;
            }
            return x80Var.f389854e;
        }
        if (ordinal == 1) {
            r45.ap5 ap5Var2 = cp5Var.f371769e;
            if (ap5Var2 == null || (x80Var2 = ap5Var2.f370177e) == null) {
                return null;
            }
            return x80Var2.f389854e;
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        r45.ap5 ap5Var3 = cp5Var.f371769e;
        if (ap5Var3 == null || (x80Var3 = ap5Var3.f370178f) == null) {
            return null;
        }
        return x80Var3.f389854e;
    }

    public final android.util.Size j(r45.yo5 yo5Var, android.content.Context context, float f17) {
        r45.t60 t60Var;
        r45.lp lpVar;
        r45.uy3 uy3Var;
        r45.lp lpVar2;
        r45.uy3 uy3Var2;
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = 0;
        int i18 = (yo5Var == null || (lpVar2 = yo5Var.f391262e) == null || (uy3Var2 = lpVar2.f379691m) == null) ? 0 : uy3Var2.f387734d;
        int i19 = (yo5Var == null || (lpVar = yo5Var.f391262e) == null || (uy3Var = lpVar.f379691m) == null) ? 0 : uy3Var.f387735e;
        if (i18 > 0 && i19 > 0) {
            return new android.util.Size(mo0.h.a(context, i18), mo0.h.a(context, i19));
        }
        if (yo5Var != null && (t60Var = yo5Var.f391261d) != null) {
            i17 = t60Var.f386166d;
        }
        int m17 = m(context, i17, f17);
        return new android.util.Size(m17, m17);
    }

    public final java.lang.String k(r45.qy3 icon) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(icon, "icon");
        r45.xy3 xy3Var = icon.f384352e;
        if (xy3Var == null || (str = xy3Var.f390593d) == null) {
            str = "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        cu2.f0 f0Var = cu2.f0.f222391a;
        java.lang.String str2 = icon.f384351d;
        if (str2 == null) {
            str2 = "";
        }
        r45.rl2 a17 = f0Var.a(str2);
        java.lang.String string = a17 != null ? a17.getString(1) : null;
        return string != null ? string : "";
    }

    public final android.graphics.Bitmap l(android.graphics.Bitmap bitmap, float f17) {
        if (bitmap.getWidth() == bitmap.getHeight()) {
            android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, bitmap.getWidth() * f17);
            kotlin.jvm.internal.o.d(s07);
            return s07;
        }
        double min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
        if (min <= 0.0d) {
            min = java.lang.Math.max(bitmap.getWidth(), bitmap.getHeight());
        }
        int i17 = (int) min;
        android.graphics.Bitmap s08 = com.tencent.mm.sdk.platformtools.x.s0(com.tencent.mm.sdk.platformtools.x.k0(bitmap, i17, i17, true), false, (float) (min * f17));
        kotlin.jvm.internal.o.d(s08);
        return s08;
    }

    public final int m(android.content.Context context, int i17, float f17) {
        kotlin.jvm.internal.o.g(context, "context");
        float f18 = i17;
        if (f18 > 0.0f) {
            f17 = f18;
        }
        return mo0.h.a(context, f17);
    }

    public final java.lang.String o(r45.cp5 cp5Var, oc2.w renderNodeType) {
        kotlin.jvm.internal.o.g(cp5Var, "<this>");
        kotlin.jvm.internal.o.g(renderNodeType, "renderNodeType");
        r45.qy3 i17 = i(cp5Var, renderNodeType);
        if (i17 == null) {
            return "";
        }
        boolean C = com.tencent.mm.ui.bk.C();
        oc2.v vVar = f344282a;
        if (!C) {
            return vVar.k(i17);
        }
        java.lang.String h17 = vVar.h(i17);
        return com.tencent.mm.sdk.platformtools.t8.K0(h17) ? vVar.k(i17) : h17;
    }

    public final boolean p(r45.cp5 cp5Var) {
        kotlin.jvm.internal.o.g(cp5Var, "<this>");
        return f(cp5Var) != Integer.MAX_VALUE;
    }

    public final android.graphics.Bitmap q(java.lang.String username, boolean z17, float f17) {
        kotlin.jvm.internal.o.g(username, "username");
        boolean z18 = true;
        if (username.length() > 0) {
            java.lang.String concat = (f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) == 0 ? username.concat("_rect_avatar") : !z17 ? username.concat("_wx_avatar") : username.concat("_round_avatar");
            com.tencent.mm.sdk.platformtools.r2 r2Var = f344285d;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) r2Var.get(concat);
            if (bitmap != null) {
                com.tencent.mars.xlog.Log.i("RenderNodeExt", "loadWxBitmap cacheKey=" + concat);
                return bitmap;
            }
            try {
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                android.graphics.Bitmap f18 = com.tencent.mm.modelavatar.d1.wi().f(username, false, 0, null);
                if (f18 != null) {
                    boolean isRecycled = f18.isRecycled();
                    if (((java.lang.Boolean) ((jz5.n) f344286e).getValue()).booleanValue()) {
                        com.tencent.mars.xlog.Log.i("RenderNodeExt", "loadWxBitmap radius=" + f17 + " isRound=" + z17 + " isRecycled=" + isRecycled);
                    }
                    if (f17 != 0.0f) {
                        z18 = false;
                    }
                    if (!z18) {
                        if (z17) {
                            if (isRecycled) {
                                return null;
                            }
                            f18 = l(f18, 0.5f);
                            r2Var.put(concat, f18);
                        } else {
                            if (isRecycled) {
                                return null;
                            }
                            f18 = l(f18, 0.1f);
                            r2Var.put(concat, f18);
                        }
                    }
                    return f18;
                }
            } catch (java.lang.RuntimeException e17) {
                com.tencent.mars.xlog.Log.e("RenderNodeExt", e17.getMessage());
            }
        }
        return null;
    }

    public final jz5.l r(r45.cp5 cp5Var, oc2.w renderNodeType) {
        r45.x80 x80Var;
        r45.wm5 wm5Var;
        jz5.l lVar;
        r45.xy3 xy3Var;
        java.lang.String str;
        r45.xy3 xy3Var2;
        r45.xy3 xy3Var3;
        java.lang.String str2;
        r45.x80 x80Var2;
        r45.x80 x80Var3;
        kotlin.jvm.internal.o.g(cp5Var, "<this>");
        kotlin.jvm.internal.o.g(renderNodeType, "renderNodeType");
        int ordinal = renderNodeType.ordinal();
        java.lang.String str3 = null;
        if (ordinal == 0) {
            r45.ap5 ap5Var = cp5Var.f371769e;
            if (ap5Var != null && (x80Var = ap5Var.f370176d) != null) {
                wm5Var = x80Var.f389855f;
            }
            wm5Var = null;
        } else if (ordinal == 1) {
            r45.ap5 ap5Var2 = cp5Var.f371769e;
            if (ap5Var2 != null && (x80Var2 = ap5Var2.f370177e) != null) {
                wm5Var = x80Var2.f389855f;
            }
            wm5Var = null;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            r45.ap5 ap5Var3 = cp5Var.f371769e;
            if (ap5Var3 != null && (x80Var3 = ap5Var3.f370178f) != null) {
                wm5Var = x80Var3.f389855f;
            }
            wm5Var = null;
        }
        java.lang.String str4 = "";
        if (com.tencent.mm.ui.bk.C()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(wm5Var != null ? wm5Var.f389290d : 0);
            if (wm5Var == null || (xy3Var3 = wm5Var.f389291e) == null || (str2 = xy3Var3.f390594e) == null) {
                if (wm5Var != null && (xy3Var2 = wm5Var.f389291e) != null) {
                    str3 = xy3Var2.f390593d;
                }
                if (str3 != null) {
                    str4 = str3;
                }
            } else {
                str4 = str2;
            }
            lVar = new jz5.l(valueOf, str4);
        } else {
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(wm5Var != null ? wm5Var.f389290d : 0);
            if (wm5Var != null && (xy3Var = wm5Var.f389291e) != null && (str = xy3Var.f390593d) != null) {
                str4 = str;
            }
            lVar = new jz5.l(valueOf2, str4);
        }
        return lVar;
    }

    public final int s(r45.cp5 cp5Var, oc2.w renderNodeType, int i17) {
        r45.lp lpVar;
        r45.xm5 xm5Var;
        r45.lp lpVar2;
        r45.xm5 xm5Var2;
        r45.lp lpVar3;
        r45.xm5 xm5Var3;
        kotlin.jvm.internal.o.g(cp5Var, "<this>");
        kotlin.jvm.internal.o.g(renderNodeType, "renderNodeType");
        int ordinal = renderNodeType.ordinal();
        if (ordinal == 0) {
            r45.yo5 yo5Var = cp5Var.f371770f;
            return (yo5Var == null || (lpVar = yo5Var.f391262e) == null || (xm5Var = lpVar.f379689h) == null) ? i17 : xm5Var.f390242d;
        }
        if (ordinal == 1) {
            r45.yo5 yo5Var2 = cp5Var.f371770f;
            return (yo5Var2 == null || (lpVar2 = yo5Var2.f391262e) == null || (xm5Var2 = lpVar2.f379689h) == null) ? i17 : xm5Var2.f390243e;
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        r45.yo5 yo5Var3 = cp5Var.f371770f;
        return (yo5Var3 == null || (lpVar3 = yo5Var3.f391262e) == null || (xm5Var3 = lpVar3.f379689h) == null) ? i17 : xm5Var3.f390244f;
    }

    public final void t(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            for (oc2.y yVar : ((oc2.y0) it.next()).f344322b) {
                yVar.f344313c = false;
                yVar.f344315e = false;
                yVar.f344317g = false;
            }
        }
    }

    public final vo0.b u(vo0.b bVar, java.lang.String tag, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, java.lang.String url) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        if (jbVar != null && f03Var != null) {
            wo0.c cVar = (wo0.c) bVar;
            cVar.f447876g = new oc2.t(g0Var, h0Var, g0Var2);
            cVar.f447879j = new oc2.u(g0Var, g0Var2, tag, url, h0Var, jbVar, f03Var);
        }
        return bVar;
    }
}
