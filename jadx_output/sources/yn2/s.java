package yn2;

/* loaded from: classes2.dex */
public final class s implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yn2.u f464009a;

    public s(yn2.u uVar) {
        this.f464009a = uVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        jz5.l[] lVarArr = new jz5.l[2];
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar = this.f464009a.f464012e;
        if (eVar == null || (str2 = ((xn2.p0) eVar).f455544b) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", str2);
        lVarArr[1] = new jz5.l("comment_scene", 281);
        return kz5.c1.k(lVarArr);
    }
}
