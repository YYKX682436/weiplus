package tw0;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tw0.i f422424d;

    public d(tw0.i iVar) {
        this.f422424d = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tw0.i iVar = this.f422424d;
        iVar.getClass();
        if (!fy0.i.a()) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        int length = iVar.f422443g.length();
        r45.n91 n91Var = iVar.f422446j;
        if (length >= 3) {
            java.lang.String str2 = iVar.f422443g;
            java.lang.String other = iVar.f422442f;
            kotlin.jvm.internal.o.g(str2, "<this>");
            kotlin.jvm.internal.o.g(other, "other");
            int min = java.lang.Math.min(str2.length(), other.length());
            java.util.ArrayList arrayList = new java.util.ArrayList(min);
            int i17 = 0;
            for (int i18 = 0; i18 < min; i18++) {
                arrayList.add(new jz5.l(java.lang.Character.valueOf(str2.charAt(i18)), java.lang.Character.valueOf(other.charAt(i18))));
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    jz5.l lVar = (jz5.l) it.next();
                    if ((((java.lang.Character) lVar.f302833d).charValue() != ((java.lang.Character) lVar.f302834e).charValue()) && (i19 = i19 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
                i17 = i19;
            }
            if (i17 + java.lang.Math.abs(str2.length() - other.length()) >= n91Var.getInteger(2)) {
                com.tencent.mars.xlog.Log.i("RecommendTitleService", "tryRequestText: currentText " + iVar.f422443g + " lastText " + iVar.f422442f + ' ');
                iVar.b();
                iVar.f422442f = iVar.f422443g;
                iVar.f422441e = iVar.f422441e + 1;
                kotlinx.coroutines.y0 y0Var = iVar.f422444h;
                iVar.f422445i = y0Var != null ? kotlinx.coroutines.l.d(y0Var, new kotlinx.coroutines.x0("RecommendTitleService_request_" + iVar.f422441e + '}'), null, new tw0.f(iVar, null), 2, null) : null;
            }
        }
        iVar.f422447k.postDelayed(new tw0.d(iVar), n91Var.getLong(1));
    }
}
