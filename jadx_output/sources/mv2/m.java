package mv2;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final mv2.m f331605a = new mv2.m();

    public final boolean a(java.lang.String username) {
        r45.mr4 mr4Var;
        kotlin.jvm.internal.o.g(username, "username");
        m92.b j37 = g92.a.j3(g92.b.f269769e, username, false, 2, null);
        int integer = (j37 == null || (mr4Var = (r45.mr4) j37.u0().getCustom(37)) == null) ? 0 : mr4Var.getInteger(1);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127909r4).getValue()).r()).intValue() == 1;
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostChecker", "checkSupportAudio isShowAudioLink:" + integer + ", debugOk:" + z17);
        return z17 || integer == 1;
    }

    public final boolean b(java.lang.String username) {
        r45.mr4 mr4Var;
        kotlin.jvm.internal.o.g(username, "username");
        m92.b j37 = g92.a.j3(g92.b.f269769e, username, false, 2, null);
        int integer = (j37 == null || (mr4Var = (r45.mr4) j37.u0().getCustom(37)) == null) ? 0 : mr4Var.getInteger(0);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127891q4).getValue()).r()).intValue() == 1;
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostChecker", "checkSupportMusic isShowMusicLink:" + integer + ", debugOk:" + z17);
        return z17 || integer == 1;
    }

    public final boolean c(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        m92.b j37 = g92.a.j3(g92.b.f269769e, username, false, 2, null);
        int i17 = j37 != null ? j37.field_extFlag : 0;
        boolean z17 = (2097152 & i17) != 0;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127873p4).getValue()).r()).intValue() == 1;
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostChecker", "checkSupportWindowProduct extFlag:" + i17 + ", ret " + z17 + ", debugOk:" + z18);
        if (z18) {
            return true;
        }
        return z17;
    }
}
