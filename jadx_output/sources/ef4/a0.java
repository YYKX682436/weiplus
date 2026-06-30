package ef4;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ef4.a0 f252435a = new ef4.a0();

    public final void a(java.lang.String username, long j17, int i17, java.lang.String str, java.lang.String str2, long j18) {
        kotlin.jvm.internal.o.g(username, "username");
        nf4.g g17 = ef4.w.f252468t.g();
        java.lang.String str3 = str == null ? "" : str;
        java.lang.String str4 = str2 == null ? "" : str2;
        nf4.f J0 = g17.J0(username);
        if (J0 == null) {
            J0 = g17.L0(username);
        }
        boolean t07 = J0.t0();
        boolean isValid = J0.isValid();
        if (((java.lang.Boolean) ((nf4.e) nf4.f.X).invoke(java.lang.Long.valueOf(J0.field_syncId), java.lang.Long.valueOf(j17))).booleanValue()) {
            J0.field_updateTime = i17 * 1000;
        }
        J0.field_syncId = j17;
        if (J0.field_preloadStoryId != j17) {
            J0.field_preloadStoryId = 0L;
            J0.field_preloadMediaId = "";
            J0.field_preLoadResource = 0L;
        }
        J0.field_storyPostTime = i17;
        J0.field_newThumbUrl = str3;
        J0.field_newVideoUrl = str4;
        J0.field_duration = j18;
        boolean b17 = g17.b1(J0);
        boolean t08 = J0.t0();
        boolean isValid2 = J0.isValid();
        if (b17 && isValid && !isValid2) {
            g17.doNotify("notify_story_invalid", 4, J0);
            return;
        }
        if (b17 && !t07 && t08) {
            g17.doNotify("notify_story_unread", 2, J0);
            return;
        }
        if (b17 && t07 && !t08) {
            g17.doNotify("notify_story_read", 1, J0);
            return;
        }
        if (b17 && !isValid && isValid2) {
            g17.doNotify("notify_story_valid", 5, J0);
        } else if (b17 && t07 && t08) {
            g17.doNotify("notify_story_unread", 2, J0);
        }
    }

    public final void b(java.lang.String username, nf4.j jVar) {
        kotlin.jvm.internal.o.g(username, "username");
        if (jVar != null) {
            r45.lf6 y07 = jVar.y0();
            if (y07.f379432h.f382205e.size() <= 0 || ((r45.xe6) y07.f379432h.f382205e.get(0)).f390025h == null || ((r45.xe6) y07.f379432h.f382205e.get(0)).f390023f == null) {
                return;
            }
            f252435a.a(username, jVar.field_storyID, jVar.field_createTime, ((r45.xe6) y07.f379432h.f382205e.get(0)).f390025h, ((r45.xe6) y07.f379432h.f382205e.get(0)).f390023f, ((r45.xe6) y07.f379432h.f382205e.get(0)).f390040z * 1000);
        }
    }
}
