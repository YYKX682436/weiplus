package vd0;

@j95.b
/* loaded from: classes8.dex */
public final class l3 extends i95.w implements wd0.y1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f435460d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f435461e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f435462f;

    public static final void Ai(vd0.l3 l3Var, vd0.c3 c3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        l3Var.getClass();
        java.util.HashMap b17 = u24.m.f424129a.b(appCompatActivity);
        for (java.lang.String str : kz5.n0.S0(c3Var.f435384d.keySet())) {
            a24.i iVar = (a24.i) b17.get(str);
            c3Var.f435384d.put(str, java.lang.Boolean.valueOf(iVar != null ? iVar.q7() : false));
        }
    }

    public static final void Bi(vd0.l3 l3Var, java.lang.String str, java.lang.Integer num) {
        synchronized (l3Var.f435460d) {
            vd0.y2 y2Var = (vd0.y2) l3Var.f435461e.get(str);
            if (y2Var == null) {
                return;
            }
            if (num == null || y2Var.f435543c == num.intValue()) {
                l3Var.f435461e.remove(str);
                if (kotlin.jvm.internal.o.b(l3Var.f435462f, str)) {
                    java.util.Set keySet = l3Var.f435461e.keySet();
                    kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
                    l3Var.f435462f = (java.lang.String) kz5.n0.Y(keySet);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingSearchFeatureService", "removeIndexByTag done, activityTag=" + str + ", remain=" + l3Var.f435461e.size());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5 A[LOOP:3: B:52:0x01af->B:54:0x01b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final vd0.c3 wi(vd0.l3 r43, a24.t r44) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd0.l3.wi(vd0.l3, a24.t):vd0.c3");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Di(androidx.appcompat.app.AppCompatActivity r21, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd0.l3.Di(androidx.appcompat.app.AppCompatActivity, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final vd0.y2 Ni(java.lang.String str) {
        boolean z17 = !r26.n0.N(str);
        java.util.HashMap hashMap = this.f435461e;
        if (z17) {
            return (vd0.y2) hashMap.get(str);
        }
        java.lang.String str2 = this.f435462f;
        vd0.y2 y2Var = str2 != null ? (vd0.y2) hashMap.get(str2) : null;
        if (y2Var != null) {
            return y2Var;
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        java.util.Set entrySet = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.lang.Object W = kz5.n0.W(entrySet);
        kotlin.jvm.internal.o.f(W, "first(...)");
        java.util.Map.Entry entry = (java.util.Map.Entry) W;
        if (hashMap.size() > 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SettingSearchFeatureService", "getHolder fallback first index, size=" + hashMap.size());
        }
        this.f435462f = (java.lang.String) entry.getKey();
        return (vd0.y2) entry.getValue();
    }

    public final java.lang.CharSequence Ri(java.lang.String str, java.lang.String str2) {
        int L;
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(str);
        if ((str2 == null || str2.length() == 0) || (L = r26.n0.L(str, str2, 0, true, 2, null)) == -1) {
            return f0Var;
        }
        f0Var.c(new android.text.style.ForegroundColorSpan(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.Brand_100)), L, str2.length() + L, 33);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    public void Ui(androidx.appcompat.app.AppCompatActivity appCompatActivity, wd0.x1 item) {
        vd0.y2 Ni;
        ?? c17;
        kotlin.jvm.internal.o.g(item, "item");
        if (appCompatActivity == null) {
            return;
        }
        synchronized (this.f435460d) {
            Zi();
            Ni = Ni("");
        }
        if (Ni == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SettingSearchFeatureService", "onClickSettingItem skip: no available active index, itemKey=" + item.f444781d);
            return;
        }
        a24.t tVar = (a24.t) Ni.f435542b.f435382b.get(item.f444781d);
        a24.i iVar = tVar != null ? tVar.f906b : null;
        if (iVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SettingSearchFeatureService", "onClickSettingItem skip: key not found, itemKey=" + item.f444781d);
            return;
        }
        a24.t tVar2 = tVar.f905a;
        android.view.View view = new android.view.View(appCompatActivity);
        if (vd0.d3.f435390a[item.f444783f.ordinal()] != 1) {
            c17 = kz5.b0.c(iVar.a7());
        } else if (tVar2 != null) {
            c17 = new java.util.ArrayList();
            java.util.List list = tVar2.f907c;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((a24.t) it.next()).f906b);
            }
            boolean z17 = false;
            for (a24.i iVar2 : (java.util.List) u24.m.f424129a.d(tVar2.f906b, arrayList).f302834e) {
                if (iVar2 == iVar) {
                    z17 = true;
                }
                if (z17) {
                    if (iVar2.Y6() != null && iVar2 != iVar) {
                        break;
                    } else {
                        c17.add(iVar2.a7());
                    }
                }
            }
        } else {
            c17 = kz5.b0.c(iVar.a7());
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_config_target_item", iVar.a7());
        intent.putStringArrayListExtra("key_highlight_item", new java.util.ArrayList<>((java.util.Collection) c17));
        a24.i iVar3 = tVar2 != null ? tVar2.f906b : null;
        if (!(iVar3 instanceof s24.e)) {
            iVar.r7(appCompatActivity, view, 0);
            return;
        }
        if (item.f444783f == wd0.w1.f444773f) {
            ((s24.e) iVar3).f402359g = intent;
            try {
                ((s24.e) iVar3).r7(appCompatActivity, view, 0);
            } finally {
            }
        } else {
            if (!(iVar instanceof s24.g)) {
                iVar.r7(appCompatActivity, view, 0);
                return;
            }
            ((s24.e) iVar3).f402359g = intent;
            try {
                ((s24.e) iVar3).r7(appCompatActivity, view, 0);
            } finally {
            }
        }
    }

    public jz5.l Vi(wd0.x1 item, java.lang.String query) {
        java.lang.CharSequence charSequence;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(query, "query");
        java.lang.CharSequence Ri = Ri(item.f444778a, query);
        int ordinal = item.f444783f.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                charSequence = "";
                java.lang.String str = item.f444779b;
                if (str == null) {
                    str = "";
                }
                if (!(str.length() == 0)) {
                    charSequence = Ri(str, query);
                }
                return new jz5.l(Ri, charSequence);
            }
            if (ordinal != 2) {
                throw new jz5.j();
            }
        }
        charSequence = item.f444784g;
        return new jz5.l(Ri, charSequence);
    }

    public final void Zi() {
        java.util.Iterator it = this.f435461e.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            if (((vd0.y2) entry.getValue()).f435541a.get() == null) {
                if (kotlin.jvm.internal.o.b(this.f435462f, entry.getKey())) {
                    this.f435462f = null;
                }
                it.remove();
            }
        }
    }

    public final wd0.w1 aj(vd0.z2 z2Var, java.lang.String str) {
        boolean z17 = false;
        boolean D = r26.n0.D(z2Var.f435554j, str, false, 2, null);
        boolean z18 = z2Var.f435549e && r26.n0.D(z2Var.f435556l, str, false, 2, null);
        boolean D2 = r26.n0.D(z2Var.f435558n, str, false, 2, null);
        if ((D || z18) && !z2Var.f435550f && z2Var.f435548d) {
            z17 = true;
        }
        if (z17) {
            return D ? wd0.w1.f444771d : wd0.w1.f444772e;
        }
        if (D2) {
            return wd0.w1.f444773f;
        }
        return null;
    }

    public final wd0.x1 bj(vd0.z2 z2Var, wd0.w1 w1Var, boolean z17) {
        java.lang.String str;
        if (w1Var == wd0.w1.f444773f) {
            str = z2Var.f435557m;
            if (str.length() == 0) {
                str = z2Var.f435553i;
            }
        } else {
            str = z2Var.f435553i;
        }
        java.lang.String str2 = str;
        java.lang.String str3 = null;
        if (w1Var == wd0.w1.f444772e) {
            java.lang.String str4 = z2Var.f435555k;
            if (!(str4.length() == 0)) {
                str3 = str4;
            }
        }
        return new wd0.x1(str2, str3, z2Var.f435547c, z2Var.f435545a, z2Var.f435546b, w1Var, z2Var.f435559o, z17);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        synchronized (this.f435460d) {
            this.f435461e.clear();
            this.f435462f = null;
        }
    }
}
