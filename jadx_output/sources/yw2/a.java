package yw2;

/* loaded from: classes2.dex */
public final class a implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f466606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f466607b;

    public a(yz5.a aVar, yz5.a aVar2) {
        this.f466606a = aVar;
        this.f466607b = aVar2;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        r45.ri0 ri0Var = (r45.ri0) this.f466606a.invoke();
        lz5.m mVar = new lz5.m();
        mVar.put("feedid", pm0.v.u(((java.lang.Number) this.f466607b.invoke()).longValue()));
        mVar.put("if_have_set_like_easter_egg", java.lang.Integer.valueOf(ri0Var != null ? 1 : 0));
        mVar.put("easter_egg_emoji_md5", ri0Var != null ? ri0Var.f384886d : null);
        return kz5.b1.b(mVar);
    }
}
