package ml2;

/* loaded from: classes3.dex */
public final class m5 {

    /* renamed from: b, reason: collision with root package name */
    public static ml2.l5 f327719b;

    /* renamed from: a, reason: collision with root package name */
    public static final ml2.m5 f327718a = new ml2.m5();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f327720c = new java.util.HashSet();

    public final void a(long j17) {
        if (f327720c.isEmpty()) {
            ml2.l5 l5Var = f327719b;
            if (l5Var != null) {
                if (j17 <= 0) {
                    j17 = c01.id.c();
                }
                long j18 = j17 - l5Var.f327707d;
                com.tencent.mars.xlog.Log.i("LiveStayTimeReporter", "report stayTime:" + j18 + ", commentScene:" + l5Var.f327705b);
                com.tencent.mm.autogen.mmdata.rpt.FinderLiveStayTimeLogStruct finderLiveStayTimeLogStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveStayTimeLogStruct();
                finderLiveStayTimeLogStruct.f57375d = finderLiveStayTimeLogStruct.b("Contextid", l5Var.f327704a, true);
                finderLiveStayTimeLogStruct.f57376e = finderLiveStayTimeLogStruct.b("CommentScene", l5Var.f327705b, true);
                finderLiveStayTimeLogStruct.f57377f = j18;
                finderLiveStayTimeLogStruct.f57378g = finderLiveStayTimeLogStruct.b("RedDotTipsID", l5Var.f327706c, true);
                finderLiveStayTimeLogStruct.f57379h = l5Var.f327707d;
                finderLiveStayTimeLogStruct.f57380i = j17;
                finderLiveStayTimeLogStruct.f57381j = finderLiveStayTimeLogStruct.b("ExtraInfo", "", true);
                finderLiveStayTimeLogStruct.k();
            }
            f327719b = null;
        }
    }

    public final void b() {
        if (f327719b != null) {
            com.tencent.mars.xlog.Log.i("LiveStayTimeReporter", "enterFloatBall");
            f327720c.add("floatBall");
        }
        or2.a aVar = or2.a.f347607a;
        or2.a.f347615i = true;
        long j17 = or2.a.f347610d;
        int i17 = or2.a.f347613g + 1;
        or2.a.f347613g = i17;
        if (i17 >= 1) {
            aVar.c(true, false, j17, true);
        }
    }

    public final void c(com.tencent.mm.ui.MMActivity activity, java.lang.String commentScene) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        ml2.l5 l5Var = f327719b;
        java.util.HashSet hashSet = f327720c;
        if (l5Var == null) {
            hashSet.clear();
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
            ml2.l5 l5Var2 = new ml2.l5();
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            kotlin.jvm.internal.o.f(b17, "getFinderContextId(...)");
            l5Var2.f327704a = b17;
            if (commentScene.length() == 0) {
                ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
                str = a52.a.f1584l;
                if (str == null) {
                    str = "";
                }
            } else {
                str = commentScene;
            }
            l5Var2.f327705b = str;
            l5Var2.f327707d = c01.id.c();
            java.lang.String str2 = L0 != null ? L0.field_tipsId : null;
            l5Var2.f327706c = str2 != null ? str2 : "";
            com.tencent.mars.xlog.Log.i("LiveStayTimeReporter", "enter activity:" + activity + ", contextId:" + l5Var2.f327704a + ", commentScene:" + l5Var2.f327705b + ", commentSceneParams:" + commentScene + "enterTimeMs:" + l5Var2.f327707d + ", redDotTipsId:" + l5Var2.f327706c + ", extraInfo:");
            f327719b = l5Var2;
        } else {
            com.tencent.mars.xlog.Log.i("LiveStayTimeReporter", "enter activity:" + activity);
        }
        hashSet.add("activity_" + activity.hashCode());
        if (activity instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI) {
            e();
        }
    }

    public final void d(com.tencent.mm.ui.MMActivity activity, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("LiveStayTimeReporter", "exit finishTime:" + j17);
        f327720c.remove("activity_" + activity.hashCode());
        a(j17);
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("LiveStayTimeReporter", "exitFloatBall");
        f327720c.remove("floatBall");
        a(0L);
        or2.a aVar = or2.a.f347607a;
        if (or2.a.f347615i) {
            or2.a.f347615i = false;
            long j17 = or2.a.f347610d;
            if (!aVar.a()) {
                aVar.e();
            }
            if (or2.a.f347613g <= 0 || or2.a.f347610d == j17) {
                return;
            }
            or2.a.f347610d = j17;
            aVar.e();
        }
    }

    public final void f(java.lang.String commentScene) {
        ml2.l5 l5Var;
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modifyCommentScene ");
        sb6.append(commentScene);
        sb6.append(", floatBall:");
        java.util.HashSet hashSet = f327720c;
        sb6.append(hashSet.contains("floatBall"));
        com.tencent.mars.xlog.Log.i("LiveStayTimeReporter", sb6.toString());
        if (!(commentScene.length() > 0) || hashSet.contains("floatBall") || (l5Var = f327719b) == null) {
            return;
        }
        l5Var.f327705b = commentScene;
    }
}
