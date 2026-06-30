package hz4;

/* loaded from: classes12.dex */
public abstract class l {
    public static o72.r2 a(long j17) {
        return ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
    }

    public static java.lang.String b(java.lang.String str, int i17) {
        return kk.k.g((str + i17 + java.lang.System.currentTimeMillis()).getBytes());
    }

    public static java.lang.String c(r45.gp0 gp0Var) {
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 27;
        z9Var.f8533f = gp0Var;
        favoriteOperationEvent.e();
        return favoriteOperationEvent.f54244h.f6136c;
    }

    public static java.lang.String d(float f17) {
        return f17 < 1024.0f ? java.lang.String.format("%.1fB", java.lang.Float.valueOf(f17)) : f17 < 1048576.0f ? java.lang.String.format("%.1fKB", java.lang.Float.valueOf(f17 / 1024.0f)) : f17 < 1.0737418E9f ? java.lang.String.format("%.1fMB", java.lang.Float.valueOf((f17 / 1024.0f) / 1024.0f)) : java.lang.String.format("%.1fGB", java.lang.Float.valueOf(((f17 / 1024.0f) / 1024.0f) / 1024.0f));
    }

    public static java.lang.String e(r45.gp0 gp0Var) {
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 27;
        z9Var.f8533f = gp0Var;
        favoriteOperationEvent.e();
        return favoriteOperationEvent.f54244h.f6137d;
    }

    public static float f(long j17) {
        float f17 = ((float) j17) / 1000.0f;
        if (f17 < 1.0f) {
            f17 = 1.0f;
        }
        return java.lang.Math.round(f17);
    }

    public static void g(r45.bq0 bq0Var, long j17, java.lang.String str) {
        java.lang.String group;
        int indexOf;
        int i17;
        int indexOf2;
        int indexOf3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() == 0) {
            return;
        }
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("<object[^>]*>", 2).matcher(str);
        while (matcher.find() && (indexOf = (group = matcher.group()).indexOf("WeNote_")) != -1 && (indexOf2 = group.indexOf("\"", (i17 = indexOf + 1))) != -1 && (indexOf3 = group.indexOf(" ", i17)) != -1) {
            if (indexOf2 >= indexOf3) {
                indexOf2 = indexOf3;
            }
            arrayList.add(group.substring(indexOf, indexOf2));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = bq0Var.f370964f.iterator();
        int i18 = 0;
        int i19 = 0;
        while (it.hasNext()) {
            r45.gp0 gp0Var = (r45.gp0) it.next();
            if (i18 == 0) {
                gp0Var.t0("WeNoteHtmlFile");
                i18++;
                linkedList.add(gp0Var);
            } else {
                if (gp0Var.I == 1) {
                    gp0Var.t0("-1");
                } else {
                    gp0Var.t0((java.lang.String) arrayList.get(i19));
                    i19++;
                }
                linkedList.add(gp0Var);
            }
        }
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 33;
        z9Var.f8531d = bq0Var;
        bq0Var.f370964f = linkedList;
        z9Var.f8532e = j17;
        favoriteOperationEvent.e();
    }

    public static void h(long j17, java.lang.String str) {
        java.util.LinkedList linkedList;
        if (j17 <= 0) {
            return;
        }
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 34;
        z9Var.f8532e = j17;
        favoriteOperationEvent.e();
        r45.bq0 bq0Var = z9Var.f8531d;
        if (bq0Var != null && (linkedList = bq0Var.f370964f) != null && linkedList.size() > 1 && ((r45.gp0) z9Var.f8531d.f370964f.get(0)).P1 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteFavLogic", "Note: Htmlid is null,  do updateFavItemHtmlIdStorage");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
                return;
            }
            try {
                g(z9Var.f8531d, j17, com.tencent.mm.vfs.w6.M(str));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WNNoteFavLogic", "Note: FileNotFoundException :%s", e17.getMessage());
            }
        }
    }
}
