package hc2;

/* loaded from: classes2.dex */
public abstract class b0 {
    public static final boolean a(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia first;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        kotlin.jvm.internal.o.g(baseFinderFeed, "<this>");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_ring_tone_entrance_switch, true)) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = baseFinderFeed.getFeedObject().getFinderObject();
        if (hc2.o0.j(finderObject) != 4 || baseFinderFeed.getFeedObject().isMemberFeed()) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
        if ((objectDesc2 != null ? objectDesc2.getMedia() : null) != null) {
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderObject.getObjectDesc();
            if (!((objectDesc3 == null || (media2 = objectDesc3.getMedia()) == null || !media2.isEmpty()) ? false : true) && (objectDesc = finderObject.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null && (first = media.getFirst()) != null) {
                return ((long) first.getVideoDuration()) <= com.tencent.mm.sdk.platformtools.t8.V(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderRingToneVideoDurationLimit"), 300L) && (finderObject.getPermissionFlag() & 64) == 0;
            }
        }
        return false;
    }

    public static final java.lang.String b(com.tencent.mm.plugin.finder.storage.FeedData feedData, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('.');
        sb6.append(k(feedData != null ? feedData.getDescription() : null, 0, 0, 3, null));
        sb6.append('.');
        return sb6.toString();
    }

    public static final java.lang.String c(cw2.wa waVar) {
        r45.mb4 mb4Var;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        int position = (waVar == null || (feedData = waVar.f224099f) == null) ? -1 : feedData.getPosition();
        java.lang.String k17 = k((waVar == null || (mb4Var = waVar.f224097d) == null) ? null : mb4Var.getString(9), 0, 0, 3, null);
        if (waVar == null) {
            return position + ".NULL_MEDIAINFO";
        }
        return position + '.' + k(waVar.f224099f.getDescription(), 0, 0, 3, null) + '.' + waVar.f224098e.g() + '.' + k17;
    }

    public static final java.lang.String d(so2.j5 j5Var, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('.');
        sb6.append(j5Var != null ? h(j5Var, false, 1, null) : null);
        sb6.append('.');
        return sb6.toString();
    }

    public static final java.lang.String e(so2.j5 j5Var, java.lang.String tag, int i17) {
        kotlin.jvm.internal.o.g(j5Var, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        return tag + '.' + i17 + '.' + h(j5Var, false, 1, null);
    }

    public static final java.lang.String f(so2.j5 j5Var, boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NIL.");
        java.lang.String str2 = null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null) {
            str2 = hc2.o0.m(feedObject2);
        }
        sb6.append(str2);
        if (z17) {
            str = ".".concat(pm0.v.u(j5Var != null ? j5Var.getItemId() : 0L));
        } else {
            str = "";
        }
        sb6.append(str);
        return sb6.toString();
    }

    public static /* synthetic */ java.lang.String g(com.tencent.mm.plugin.finder.storage.FeedData feedData, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            i17 = feedData != null ? feedData.getPosition() : -1;
        }
        return b(feedData, i17);
    }

    public static /* synthetic */ java.lang.String h(so2.j5 j5Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        return f(j5Var, z17);
    }

    public static final boolean i(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        kotlin.jvm.internal.o.g(baseFinderFeed, "<this>");
        g92.b bVar = g92.b.f269769e;
        return !com.tencent.mm.sdk.platformtools.t8.K0(bVar.U()) && baseFinderFeed.getFeedObject().field_username.equals(bVar.U());
    }

    public static final boolean j(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.content.Context context) {
        kotlin.jvm.internal.o.g(baseFinderFeed, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.String e17 = xy2.c.e(context);
        java.lang.String r17 = c01.z1.r();
        if (e17.length() > 0) {
            com.tencent.mm.protocal.protobuf.FinderContact contact = baseFinderFeed.getFeedObject().getFeedObject().getContact();
            if (kotlin.jvm.internal.o.b(contact != null ? contact.getUsername() : null, e17)) {
                return true;
            }
        }
        kotlin.jvm.internal.o.d(r17);
        if (r17.length() > 0) {
            com.tencent.mm.protocal.protobuf.FinderContact contact2 = baseFinderFeed.getFeedObject().getFeedObject().getContact();
            if (kotlin.jvm.internal.o.b(contact2 != null ? contact2.getUsername() : null, r17)) {
                return true;
            }
        }
        return false;
    }

    public static java.lang.String k(java.lang.String str, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        if ((i19 & 2) != 0) {
            i18 = 4;
        }
        if (str == null || str.length() == 0) {
            return "";
        }
        int i27 = i18 + i17;
        int length = str.length();
        if (i27 > length) {
            i27 = length;
        }
        java.lang.String substring = str.substring(i17, i27);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    public static java.lang.String l(hc2.d dVar, int i17, so2.j5 j5Var, in5.s0 s0Var, int i18, int i19, int i27, java.lang.Object obj) {
        if ((i27 & 4) != 0) {
            s0Var = null;
        }
        if ((i27 & 8) != 0) {
            i18 = 0;
        }
        if ((i27 & 16) != 0) {
            i19 = 0;
        }
        kotlin.jvm.internal.o.g(dVar, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FeedLifeStage.");
        sb6.append(dVar.name());
        sb6.append('.');
        sb6.append(d(j5Var, i17));
        sb6.append('.');
        sb6.append(s0Var != null ? s0Var.hashCode() : 0);
        sb6.append(".type:");
        sb6.append(i18);
        sb6.append(",poolSize:");
        sb6.append(i19);
        return sb6.toString();
    }
}
