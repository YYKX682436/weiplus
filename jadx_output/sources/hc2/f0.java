package hc2;

/* loaded from: classes2.dex */
public abstract class f0 {
    public static final boolean a(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17, int i17) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Oc).getValue()).r()).intValue();
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_COMMENT_EMOTICON_SWITCH_INT_SYNC, 0);
        if (intValue == -1) {
            intValue = r17;
        }
        if (z17) {
            return intValue == 1 && (32768 & i17) > 0;
        }
        boolean isQAFeed = finderItem != null ? finderItem.isQAFeed() : false;
        if (intValue != 1 || isQAFeed) {
            return false;
        }
        return (((finderItem == null || (feedObject = finderItem.getFeedObject()) == null) ? 0 : feedObject.getPermissionFlag()) & 1024) == 0;
    }

    public static final boolean b(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17, int i17) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Rc).getValue()).r()).intValue();
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_COMMENT_IMAGE_SWITCH_INT_SYNC, 0);
        if (intValue == -1) {
            intValue = r17;
        }
        if (z17) {
            return intValue == 1 && (i17 & 16384) > 0;
        }
        boolean isQAFeed = finderItem != null ? finderItem.isQAFeed() : false;
        if (intValue != 1 || isQAFeed) {
            return false;
        }
        return (((finderItem == null || (feedObject = finderItem.getFeedObject()) == null || (object_extend = feedObject.getObject_extend()) == null) ? 0L : object_extend.getLong(30)) & 4096) == 0;
    }

    public static final void c(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, android.content.Intent intent, android.content.Context context) {
        r45.ze2 location;
        r45.o21 extReading;
        java.util.LinkedList<r45.cw2> short_title;
        r45.cw2 cw2Var;
        java.lang.String string;
        r45.zw0 client_draft_ext_info;
        r45.e21 e21Var;
        java.lang.String str;
        java.lang.String headUrl;
        kotlin.jvm.internal.o.g(finderItem, "<this>");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(context, "context");
        int mediaType = finderItem.getMediaType();
        if (mediaType == 2 || mediaType == 4) {
            intent.putExtra("postType", finderItem.getMediaType());
        } else {
            intent.removeExtra("postType");
        }
        intent.putExtra("isLongVideoPost", finderItem.isLongVideo());
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        if (objectDesc != null && (client_draft_ext_info = objectDesc.getClient_draft_ext_info()) != null && (e21Var = (r45.e21) client_draft_ext_info.getCustom(1)) != null) {
            intent.putExtra("saveActivity", true);
            intent.putExtra("key_activity_type", e21Var.getInteger(14) == 0 ? 101 : 102);
            java.lang.String str2 = "";
            if (e21Var.getInteger(14) == 0) {
                str = xy2.c.e(context);
            } else {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
                if (finderContact == null || (str = finderContact.getUsername()) == null) {
                    str = "";
                }
            }
            intent.putExtra("key_user_name", str);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
            intent.putExtra("key_nick_name", finderContact2 != null ? finderContact2.getNickname() : null);
            intent.putExtra("key_cover_url", e21Var.getString(5));
            intent.putExtra("key_activity_display_mask", e21Var.getLong(17));
            com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
            if (finderContact3 != null && (headUrl = finderContact3.getHeadUrl()) != null) {
                str2 = headUrl;
            }
            intent.putExtra("key_avatar_url", str2);
            intent.putExtra("key_topic_id", e21Var.getLong(0));
            intent.putExtra("key_activity_name", e21Var.getString(2));
            intent.putExtra("key_activity_desc", e21Var.getString(3));
            intent.putExtra("key_activity_end_time", e21Var.getLong(13));
            intent.putExtra("key_activity_src_type", "key_scene_from_profile");
        }
        intent.putExtra("saveDesc", finderItem.getDescription());
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderItem.getFeedObject().getObjectDesc();
        if (objectDesc2 != null && (short_title = objectDesc2.getShort_title()) != null && (cw2Var = (r45.cw2) kz5.n0.Z(short_title)) != null && (string = cw2Var.getString(0)) != null) {
            if (string.length() > 0) {
                intent.putExtra("saveShortTitle", string);
            }
        }
        intent.putExtra("ORIGIN_POST_FLAG", finderItem.getFeedObject().getShowOriginal() ? 1L : 0L);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3 = finderItem.getFeedObject().getObjectDesc();
        if ((objectDesc3 != null ? objectDesc3.getLocation() : null) == null) {
            intent.putExtra("saveLocation", false);
        } else {
            intent.putExtra("saveLocation", true);
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc4 = finderItem.getFeedObject().getObjectDesc();
            if (objectDesc4 != null && (location = objectDesc4.getLocation()) != null) {
                intent.putExtra("get_poi_name", location.getString(3));
                intent.putExtra("get_city", location.getString(2));
                intent.putExtra("get_lat", location.getFloat(1));
                intent.putExtra("get_lng", location.getFloat(0));
                intent.putExtra("get_poi_address", location.getString(4));
                intent.putExtra("get_poi_classify_id", location.getString(5));
            }
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc5 = finderItem.getFeedObject().getObjectDesc();
        if (objectDesc5 == null || (extReading = objectDesc5.getExtReading()) == null) {
            return;
        }
        intent.putExtra("saveExtendReadingLink", extReading.getString(0));
        intent.putExtra("saveExtendReadingTitle", extReading.getString(1));
        intent.putExtra("saveExtendReadingStyle", extReading.getInteger(3));
    }

    public static final java.util.List d(java.util.List list, java.lang.Class clazz) {
        kotlin.jvm.internal.o.g(list, "<this>");
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (clazz.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final r45.xk e(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        java.util.LinkedList<r45.zv0> bind_info;
        java.lang.Object obj;
        r45.fw0 fw0Var;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(finderItem, "<this>");
        r45.nw1 liveInfo = finderItem.getLiveInfo();
        if (!pm0.v.z(liveInfo != null ? liveInfo.getInteger(37) : 0, 64) || (contact = finderItem.getFeedObject().getContact()) == null || (bind_info = contact.getBind_info()) == null) {
            return null;
        }
        java.util.Iterator<T> it = bind_info.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.zv0) obj).getInteger(0) == 4) {
                break;
            }
        }
        r45.zv0 zv0Var = (r45.zv0) obj;
        if (zv0Var == null || (fw0Var = (r45.fw0) zv0Var.getCustom(4)) == null || (list = fw0Var.getList(0)) == null) {
            return null;
        }
        return (r45.xk) kz5.n0.Z(list);
    }

    public static final boolean f(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        kotlin.jvm.internal.o.g(finderItem, "<this>");
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = finderItem.getFinderObject();
        jz5.g gVar = hc2.o0.f280336a;
        kotlin.jvm.internal.o.g(finderObject, "<this>");
        if (!((finderObject.getPermissionFlag() & 8) == 0)) {
            return false;
        }
        r45.ls2 ls2Var = (r45.ls2) g92.b.f269769e.k2().d().getCustom(26);
        if (ls2Var != null && ls2Var.getInteger(0) == 1) {
            return false;
        }
        if (finderItem.isLongVideo()) {
            return true;
        }
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderItem.getFeedObject().getObjectDesc();
        r45.el2 feedBgmInfo = objectDesc != null ? objectDesc.getFeedBgmInfo() : null;
        boolean z17 = feedBgmInfo != null && feedBgmInfo.getInteger(2) == 1;
        boolean z18 = (feedBgmInfo != null ? (r45.zi2) feedBgmInfo.getCustom(0) : null) != null;
        java.lang.String string = feedBgmInfo != null ? feedBgmInfo.getString(1) : null;
        boolean z19 = !(string == null || string.length() == 0);
        int mediaType = finderItem.getMediaType();
        if (mediaType != 2) {
            if (mediaType != 4) {
                return false;
            }
            if (feedBgmInfo != null && !z17) {
                return false;
            }
        } else if (!z17 || !z18 || !z19) {
            return false;
        }
        return true;
    }

    public static final boolean g(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17) {
        return z17 ? i(finderItem) || h(finderItem) : i(finderItem);
    }

    public static final boolean h(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        if (finderItem != null && (mediaList = finderItem.getMediaList()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) != null) {
            float f17 = mb4Var.getFloat(4);
            float f18 = mb4Var.getFloat(5);
            if (f17 > f18) {
                return false;
            }
            r45.gn2 gn2Var = (r45.gn2) mb4Var.getCustom(45);
            if (gn2Var != null) {
                if (!(!gn2Var.getBoolean(2) && gn2Var.getBoolean(1))) {
                    gn2Var = null;
                }
                if (gn2Var != null) {
                    f18 = a06.d.b(f18 * (gn2Var.getFloat(4) - gn2Var.getFloat(3)));
                }
            }
            if (f17 > f18) {
                return true;
            }
        }
        return false;
    }

    public static final boolean i(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        return (finderItem == null || (mediaList = finderItem.getMediaList()) == null || (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) == null || mb4Var.getFloat(4) <= mb4Var.getFloat(5)) ? false : true;
    }

    public static final boolean j(android.app.Activity activity) {
        if (activity == null) {
            return false;
        }
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128036y6).getValue()).r()).booleanValue()) {
            boolean z17 = com.tencent.mm.ui.fj.b(activity) || com.tencent.mm.ui.bk.z(activity.getTaskId());
            if (!((com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) && com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.P(activity) || com.tencent.mm.ui.bk.N(activity.getTaskId()) || (com.tencent.mm.ui.bk.O(activity.getContentResolver()) && !activity.isInMultiWindowMode()))) || z17) {
                return false;
            }
        } else {
            java.lang.System.nanoTime();
            boolean z18 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z18) {
                return false;
            }
        }
        return true;
    }

    public static final boolean k(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        if (g(finderItem, !((finderItem == null || (feedObject = finderItem.getFeedObject()) == null) ? false : hc2.o0.D(feedObject, true)))) {
            return !(finderItem != null && (mediaList = finderItem.getMediaList()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) != null && hc2.l0.b(mb4Var) == 1);
        }
        return false;
    }

    public static final boolean l(android.app.Activity activity) {
        if (activity == null) {
            return false;
        }
        return ((com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) && ((com.tencent.mm.ui.bk.P(activity) || com.tencent.mm.ui.bk.N(activity.getTaskId()) || (com.tencent.mm.ui.bk.O(activity.getContentResolver()) && !activity.isInMultiWindowMode())) || (com.tencent.mm.ui.fj.b(activity) || com.tencent.mm.ui.bk.z(activity.getTaskId())))) ? false : true;
    }
}
