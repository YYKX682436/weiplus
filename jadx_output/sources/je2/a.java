package je2;

/* loaded from: classes10.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(r45.ee6 configData) {
        r45.di0 di0Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        kotlin.jvm.internal.o.g(configData, "configData");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("targetType:" + configData.f373368d + ",outputRect:" + configData.f373370f.f374374d + '-' + configData.f373370f.f374375e + '-' + configData.f373370f.f374376f + '-' + configData.f373370f.f374377g + ",safeRect:" + configData.f373371g.f377059d + '-' + configData.f373371g.f377060e + '-' + configData.f373371g.f377061f + '-' + configData.f373371g.f377062g + ", editorItemScale:" + configData.f373369e);
        int i17 = configData.f373368d;
        if (i17 == 1) {
            r45.ei0 ei0Var = configData.f373372h;
            r45.ji0 ji0Var = (ei0Var == null || (linkedList2 = ei0Var.f373529d) == null) ? null : (r45.ji0) kz5.n0.Z(linkedList2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("\ttext xPercent:");
            sb7.append(ji0Var != null ? java.lang.Float.valueOf(ji0Var.f377822d) : null);
            sb7.append(",yPercent:");
            sb7.append(ji0Var != null ? java.lang.Float.valueOf(ji0Var.f377823e) : null);
            sb7.append(",scale:");
            sb7.append(ji0Var != null ? java.lang.Float.valueOf(ji0Var.f377827i) : null);
            sb6.append(sb7.toString());
        } else if (i17 == 2) {
            r45.ei0 ei0Var2 = configData.f373372h;
            r45.gi0 gi0Var = (ei0Var2 == null || (linkedList = ei0Var2.f373530e) == null) ? null : (r45.gi0) kz5.n0.Z(linkedList);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("\tpicture xPercent:");
            sb8.append(gi0Var != null ? java.lang.Float.valueOf(gi0Var.f375268d) : null);
            sb8.append(",yPercent:");
            sb8.append(gi0Var != null ? java.lang.Float.valueOf(gi0Var.f375269e) : null);
            sb8.append(",scale:");
            sb8.append(gi0Var != null ? java.lang.Float.valueOf(gi0Var.f375270f) : null);
            sb8.append(",enable scale:");
            if (gi0Var != null && (di0Var = gi0Var.f375276o) != null) {
                r5 = java.lang.Boolean.valueOf(di0Var.f372502d);
            }
            sb8.append(r5);
            sb6.append(sb8.toString());
        }
        java.lang.String sb9 = sb6.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        return sb9;
    }

    public final java.lang.String b(r45.ei0 ei0Var) {
        if (ei0Var == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.LinkedList linkedList = ei0Var.f373529d;
        if (linkedList != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.ji0 ji0Var = (r45.ji0) obj;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
                sb7.append(i17);
                sb7.append(':');
                sb7.append(ji0Var.f377829n);
                sb7.append(",stickerId:");
                r45.kp kpVar = ji0Var.f377834s;
                sb7.append(kpVar != null ? kpVar.f378887d : null);
                sb7.append(",xPercent:");
                sb7.append(ji0Var.f377822d);
                sb7.append(",yPercent:");
                sb7.append(ji0Var.f377823e);
                sb7.append(",scale:");
                sb7.append(ji0Var.f377827i);
                sb7.append(",width:");
                sb7.append(ji0Var.f377830o);
                sb7.append(",height:");
                sb7.append(ji0Var.f377831p);
                sb7.append(';');
                sb6.append(sb7.toString());
                i17 = i18;
            }
        }
        java.util.LinkedList linkedList2 = ei0Var.f373530e;
        if (linkedList2 != null) {
            int i19 = 0;
            for (java.lang.Object obj2 : linkedList2) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.gi0 gi0Var = (r45.gi0) obj2;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("pic");
                sb8.append(i19);
                sb8.append(':');
                sb8.append(gi0Var.f375272h);
                sb8.append(",stickerId:");
                r45.kp kpVar2 = gi0Var.f375277p;
                sb8.append(kpVar2 != null ? kpVar2.f378887d : null);
                sb8.append(",xPercent:");
                sb8.append(gi0Var.f375268d);
                sb8.append(",yPercent:");
                sb8.append(gi0Var.f375269e);
                sb8.append(",scale:");
                sb8.append(gi0Var.f375270f);
                sb8.append(",width:");
                sb8.append(gi0Var.f375274m);
                sb8.append(",height:");
                sb8.append(gi0Var.f375275n);
                sb8.append(';');
                sb6.append(sb8.toString());
                i19 = i27;
            }
        }
        java.lang.String sb9 = sb6.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        return sb9;
    }

    public final java.lang.String c(java.util.LinkedList linkedList) {
        int i17 = 0;
        if (linkedList == null || linkedList.isEmpty()) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("index:" + i17 + ",resource:" + je2.g.f299220u.d((r45.h84) obj) + ";\t");
            i17 = i18;
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.String d(r45.h84 h84Var) {
        kotlin.jvm.internal.o.g(h84Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("id:");
        sb6.append(h84Var.getString(0));
        sb6.append(",name:");
        sb6.append(h84Var.getString(1));
        sb6.append(",thumbUrl:");
        sb6.append(h84Var.getString(2));
        sb6.append(",businessData:");
        sb6.append(h84Var.getString(5));
        sb6.append(",firstMediaMd5:");
        java.util.LinkedList list = h84Var.getList(4);
        kotlin.jvm.internal.o.f(list, "getMedia(...)");
        r45.g84 g84Var = (r45.g84) kz5.n0.Z(list);
        sb6.append(g84Var != null ? g84Var.getString(2) : null);
        java.lang.String sb7 = new java.lang.StringBuilder(sb6.toString()).toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
