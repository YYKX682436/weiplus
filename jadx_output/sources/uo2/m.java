package uo2;

/* loaded from: classes2.dex */
public final class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView f429631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429632e;

    public m(com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView, java.lang.String str) {
        this.f429631d = finderFollowTopicHeaderView;
        this.f429632e = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        r45.zi2 zi2Var;
        r45.zi2 zi2Var2;
        java.lang.String str5;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        int i18;
        r45.zi2 zi2Var3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        android.content.Intent intent = new android.content.Intent();
        int itemId = menuItem.getItemId();
        if (itemId == 1001) {
            intent.putExtra("key_finder_post_router", 2);
        } else if (itemId == 1002) {
            intent.putExtra("key_finder_post_router", 3);
        }
        com.tencent.mm.plugin.finder.music.FinderFollowTopicHeaderView finderFollowTopicHeaderView = this.f429631d;
        str = "";
        if (finderFollowTopicHeaderView.getType() == 1) {
            str2 = finderFollowTopicHeaderView.getAudioPath();
            r45.o03 finderBgmInfo = finderFollowTopicHeaderView.getFinderBgmInfo();
            java.lang.String string = finderBgmInfo != null ? finderBgmInfo.getString(3) : null;
            str4 = string != null ? string : "-1";
            r45.o03 finderBgmInfo2 = finderFollowTopicHeaderView.getFinderBgmInfo();
            str3 = finderBgmInfo2 != null ? finderBgmInfo2.getString(2) : null;
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mm.plugin.finder.storage.FinderItem originFeed = finderFollowTopicHeaderView.getOriginFeed();
            intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PLAY_DURATION", (originFeed == null || (feedObject = originFeed.getFeedObject()) == null) ? 0 : (int) bu2.z.b(feedObject));
            com.tencent.mm.plugin.finder.storage.FinderItem originFeed2 = finderFollowTopicHeaderView.getOriginFeed();
            intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_COVER_URL", originFeed2 != null ? originFeed2.getAvatarUrl() : null);
            if (((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Zi(false)) {
                com.tencent.mm.plugin.finder.storage.FinderItem originFeed3 = finderFollowTopicHeaderView.getOriginFeed();
                java.lang.String concat = "wxfinderobject_".concat(pm0.v.u(originFeed3 != null ? originFeed3.getId() : 0L));
                zi2Var = new r45.zi2();
                zi2Var.set(12, "");
                com.tencent.mm.plugin.finder.storage.FinderItem originFeed4 = finderFollowTopicHeaderView.getOriginFeed();
                zi2Var.set(1, originFeed4 != null ? originFeed4.getAvatarUrl() : null);
                android.content.res.Resources resources = finderFollowTopicHeaderView.getContext().getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                r45.o03 finderBgmInfo3 = finderFollowTopicHeaderView.getFinderBgmInfo();
                objArr[0] = (finderBgmInfo3 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) finderBgmInfo3.getCustom(0)) == null) ? null : finderContact3.getNickname();
                zi2Var.set(2, resources.getString(com.tencent.mm.R.string.cxs, objArr));
                intent.putExtra("KEY_FINDER_POST_MUSIC_FEEDID", concat);
                str = str4;
            } else {
                str = str4;
                zi2Var = null;
            }
        } else if (finderFollowTopicHeaderView.getType() == 2) {
            wt3.h0 audioInfo = finderFollowTopicHeaderView.getAudioInfo();
            if (audioInfo == null || (str2 = ((com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) audioInfo).f155715i) == null) {
                str2 = "";
            }
            r45.o03 finderBgmInfo4 = finderFollowTopicHeaderView.getFinderBgmInfo();
            java.lang.String string2 = finderBgmInfo4 != null ? finderBgmInfo4.getString(3) : null;
            str4 = string2 != null ? string2 : "-1";
            r45.o03 finderBgmInfo5 = finderFollowTopicHeaderView.getFinderBgmInfo();
            if (finderBgmInfo5 == null || (zi2Var2 = (r45.zi2) finderBgmInfo5.getCustom(1)) == null) {
                str3 = "";
                zi2Var = null;
            } else {
                str3 = zi2Var2.getString(5);
                if (str3 == null) {
                    str3 = "";
                }
                zi2Var = new r45.zi2();
                r45.o03 finderBgmInfo6 = finderFollowTopicHeaderView.getFinderBgmInfo();
                if (finderBgmInfo6 == null || (str5 = finderBgmInfo6.getString(3)) == null) {
                    str5 = "";
                }
                zi2Var.set(0, str5);
                java.lang.String string3 = zi2Var2.getString(5);
                zi2Var.set(5, string3 != null ? string3 : "");
                zi2Var.set(3, zi2Var2.getString(3));
                zi2Var.set(2, zi2Var2.getString(2));
            }
            str = str4;
        } else {
            str2 = "";
            str3 = str2;
            zi2Var = null;
        }
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", str);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", str2);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", zi2Var != null ? zi2Var.toByteArray() : null);
        r45.o03 finderBgmInfo7 = finderFollowTopicHeaderView.getFinderBgmInfo();
        java.lang.String username = (finderBgmInfo7 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) finderBgmInfo7.getCustom(0)) == null) ? null : finderContact2.getUsername();
        android.content.Context context = finderFollowTopicHeaderView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", kotlin.jvm.internal.o.b(username, xy2.c.e(context)));
        intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", str3);
        r45.o03 finderBgmInfo8 = finderFollowTopicHeaderView.getFinderBgmInfo();
        if ((finderBgmInfo8 != null ? (r45.zi2) finderBgmInfo8.getCustom(1) : null) != null) {
            r45.o03 finderBgmInfo9 = finderFollowTopicHeaderView.getFinderBgmInfo();
            intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", java.lang.String.valueOf((finderBgmInfo9 == null || (zi2Var3 = (r45.zi2) finderBgmInfo9.getCustom(1)) == null) ? null : zi2Var3.getString(2)));
        } else {
            android.content.res.Resources resources2 = finderFollowTopicHeaderView.getContext().getResources();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            r45.o03 finderBgmInfo10 = finderFollowTopicHeaderView.getFinderBgmInfo();
            objArr2[0] = (finderBgmInfo10 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) finderBgmInfo10.getCustom(0)) == null) ? null : finderContact.getNickname();
            java.lang.String string4 = resources2.getString(com.tencent.mm.R.string.cxs, objArr2);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", string4);
        }
        com.tencent.mars.xlog.Log.i("FinderFollowTopicHeaderView", "tabType " + finderFollowTopicHeaderView.getTabType());
        int tabType = finderFollowTopicHeaderView.getTabType();
        if (tabType == 1 || tabType == 35 || tabType == 3 || tabType == 4) {
            i18 = 5;
        } else {
            i18 = 5;
            if (tabType == 5 || tabType == 6) {
                i18 = 7;
            }
        }
        intent.putExtra("key_finder_post_from", i18);
        intent.putExtra("key_finder_post_id", this.f429632e);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context2 = finderFollowTopicHeaderView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        i0Var.gk(context2, intent);
    }
}
