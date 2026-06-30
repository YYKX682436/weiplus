package g90;

/* loaded from: classes3.dex */
public final class h implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g90.s f269690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f269691b;

    public h(g90.s sVar, yz5.l lVar) {
        this.f269690a = sVar;
        this.f269691b = lVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.Map map;
        jz5.l[] lVarArr = new jz5.l[4];
        g90.s sVar = this.f269690a;
        lVarArr[0] = new jz5.l("view_type", java.lang.Integer.valueOf(sVar.f269756g));
        lVarArr[1] = new jz5.l("image_quality_type", java.lang.Integer.valueOf(((java.lang.Boolean) g90.s.wi(sVar, sVar.f269755f).f302834e).booleanValue() ? 1 : 2));
        lVarArr[2] = new jz5.l("pic_video_open_type", java.lang.Integer.valueOf(sVar.f269758i));
        lVarArr[3] = new jz5.l("pic_video_exit_type", java.lang.Integer.valueOf(sVar.f269757h));
        java.util.HashMap i17 = kz5.c1.i(lVarArr);
        i17.putAll(sVar.Ni(sVar.f269755f));
        yz5.l lVar = this.f269691b;
        if (lVar != null) {
            kotlin.jvm.internal.o.d(str);
            map = (java.util.Map) lVar.invoke(str);
        } else {
            map = null;
        }
        bm5.j0.a(i17, map);
        return i17;
    }
}
