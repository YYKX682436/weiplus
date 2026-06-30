package g43;

/* loaded from: classes5.dex */
public final class u implements u33.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g43.x f268787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo f268789c;

    public u(g43.x xVar, java.lang.String str, com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo) {
        this.f268787a = xVar;
        this.f268788b = str;
        this.f268789c = adminInfo;
    }

    public void a(java.util.List users) {
        kotlin.jvm.internal.o.g(users, "users");
        g43.x xVar = this.f268787a;
        w33.b O6 = xVar.O6();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(users, 10));
        int i17 = 0;
        for (java.lang.Object obj : users) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            y33.g gVar = (y33.g) obj;
            arrayList.add(i17 == 0 ? new w33.c(new jz5.l(java.lang.Boolean.TRUE, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492203fl5)), gVar.t0(), false, 1, 4, null) : new w33.c(null, gVar.t0(), false, 1, 5, null));
            i17 = i18;
        }
        xVar.f268794d.postValue(w33.b.a(O6, null, new jz5.l(bool, arrayList), null, null, 13, null));
    }
}
