package hv2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final hv2.b f285286a = new hv2.b();

    public final jv2.d a(com.tencent.mm.protocal.protobuf.FinderCommentInfo level1CommentInfo, long j17) {
        kotlin.jvm.internal.o.g(level1CommentInfo, "level1CommentInfo");
        jv2.a aVar = new jv2.a();
        aVar.field_feedId = j17;
        aVar.field_state = 2;
        aVar.field_actionInfo.set(1, level1CommentInfo);
        aVar.field_actionInfo.set(4, 0L);
        return c(aVar);
    }

    public final jv2.d b(com.tencent.mm.protocal.protobuf.FinderCommentInfo level2CommentInfo, long j17, long j18) {
        kotlin.jvm.internal.o.g(level2CommentInfo, "level2CommentInfo");
        jv2.a aVar = new jv2.a();
        aVar.field_feedId = j17;
        aVar.field_state = 2;
        aVar.field_actionInfo.set(1, level2CommentInfo);
        aVar.field_actionInfo.set(4, java.lang.Long.valueOf(j18));
        return c(aVar);
    }

    public final jv2.d c(jv2.a local) {
        kotlin.jvm.internal.o.g(local, "local");
        jv2.d dVar = new jv2.d(local);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String j17 = dVar.f302207d.j();
        ((ke0.e) xVar).getClass();
        com.tencent.mm.pluginsdk.ui.span.c0.i(context, j17);
        return dVar;
    }
}
