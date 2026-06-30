package hv2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final hv2.c f285287a = new hv2.c();

    public final jv2.i a(com.tencent.mm.protocal.protobuf.FinderCommentInfo level1CommentInfo, long j17) {
        kotlin.jvm.internal.o.g(level1CommentInfo, "level1CommentInfo");
        jv2.c cVar = new jv2.c();
        cVar.field_feedId = j17;
        cVar.field_state = 2;
        cVar.field_actionInfo.set(1, level1CommentInfo);
        cVar.field_actionInfo.set(4, 0L);
        return c(cVar);
    }

    public final jv2.i b(com.tencent.mm.protocal.protobuf.FinderCommentInfo level2CommentInfo, long j17, long j18) {
        kotlin.jvm.internal.o.g(level2CommentInfo, "level2CommentInfo");
        jv2.c cVar = new jv2.c();
        cVar.field_feedId = j17;
        cVar.field_state = 2;
        cVar.field_actionInfo.set(1, level2CommentInfo);
        cVar.field_actionInfo.set(4, java.lang.Long.valueOf(j18));
        return c(cVar);
    }

    public final jv2.i c(jv2.c local) {
        kotlin.jvm.internal.o.g(local, "local");
        jv2.i iVar = new jv2.i(local);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String j17 = iVar.f302223d.j();
        ((ke0.e) xVar).getClass();
        com.tencent.mm.pluginsdk.ui.span.c0.i(context, j17);
        return iVar;
    }
}
