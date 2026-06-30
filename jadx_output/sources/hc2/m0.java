package hc2;

/* loaded from: classes2.dex */
public abstract class m0 {
    public static final java.lang.String a(r45.hj2 hj2Var, android.app.Activity activity) {
        java.lang.String avatarUrl;
        r45.zi2 zi2Var;
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = hj2Var != null && hj2Var.getInteger(14) == 1;
        boolean z18 = hj2Var != null && hj2Var.getInteger(13) == 0;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(b(activity));
        if ((z17 || !z18) && h17 != null ? (avatarUrl = h17.getAvatarUrl()) == null : !(hj2Var != null && (zi2Var = (r45.zi2) hj2Var.getCustom(3)) != null && (avatarUrl = zi2Var.getString(1)) != null)) {
            avatarUrl = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getMusicCoverUrl] isAudio:");
        sb6.append(z17);
        sb6.append(" hasCopyright:");
        sb6.append(z18);
        sb6.append(" feed:");
        sb6.append(h17 != null);
        sb6.append(" coverUrl:");
        sb6.append(avatarUrl);
        com.tencent.mars.xlog.Log.i("FinderMusicExt", sb6.toString());
        return avatarUrl;
    }

    public static final long b(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.content.Intent intent = activity.getIntent();
        long longExtra = intent != null ? intent.getLongExtra("key_feed_id", 0L) : 0L;
        if (longExtra != 0 && bu2.j.f24534a.h(longExtra) != null) {
            return longExtra;
        }
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ea2.k0 k0Var = (ea2.k0) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).e(ea2.k0.class);
        if (k0Var == null) {
            return 0L;
        }
        com.tencent.mm.plugin.finder.activity.music.fragment.FinderMusicTopicFragment finderMusicTopicFragment = k0Var.I;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = null;
        if (finderMusicTopicFragment != null) {
            com.tencent.mm.plugin.finder.feed.model.FinderTopicFeedLoader finderTopicFeedLoader = ((ea2.j0) zVar.b(finderMusicTopicFragment).a(ea2.j0.class)).f101966r;
            if (finderTopicFeedLoader == null) {
                kotlin.jvm.internal.o.o("feedLoader");
                throw null;
            }
            java.util.List<E> listOfType = finderTopicFeedLoader.getListOfType(com.tencent.mm.plugin.finder.model.BaseFinderFeed.class);
            if (listOfType != 0) {
                baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.Z(listOfType);
            }
        }
        if (baseFinderFeed != null) {
            return baseFinderFeed.getItemId();
        }
        return 0L;
    }

    public static final java.lang.String c(r45.hj2 hj2Var, android.app.Activity activity, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        java.lang.String str;
        r45.zi2 zi2Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(activity, "activity");
        if (finderItem == null) {
            finderItem = bu2.j.f24534a.h(b(activity));
        }
        java.lang.String str2 = "";
        if (finderItem == null || (str = finderItem.getNickName()) == null) {
            str = "";
        }
        int i17 = 0;
        boolean z17 = hj2Var != null && hj2Var.getInteger(14) == 1;
        boolean z18 = hj2Var != null && hj2Var.getInteger(13) == 0;
        if ((str.length() > 0) && (z17 || !z18)) {
            i17 = com.tencent.mm.R.string.low;
        }
        if (i17 != 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string2 = activity.getResources().getString(i17, str);
            ((ke0.e) xVar).getClass();
            str2 = com.tencent.mm.pluginsdk.ui.span.c0.i(activity, string2).toString();
        } else if (hj2Var != null && (zi2Var = (r45.zi2) hj2Var.getCustom(3)) != null && (string = zi2Var.getString(2)) != null) {
            str2 = string;
        }
        kotlin.jvm.internal.o.d(str2);
        com.tencent.mars.xlog.Log.i("FinderMusicExt", "[getMusicTopicName] isAudio:" + z17 + " hasCopyRight:" + z18 + " nickName:" + str + " topicName:" + str2);
        return str2;
    }
}
