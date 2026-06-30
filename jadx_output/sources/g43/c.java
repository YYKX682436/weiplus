package g43;

/* loaded from: classes5.dex */
public final class c implements u33.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f268745b;

    public c(java.lang.String str, kotlinx.coroutines.q qVar) {
        this.f268744a = str;
        this.f268745b = qVar;
    }

    @Override // u33.f
    public final void a(java.util.Map map) {
        u33.h hVar = (u33.h) map.get(this.f268744a);
        kotlinx.coroutines.q qVar = this.f268745b;
        if (hVar == null) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
            return;
        }
        y33.e eVar = (y33.e) hVar;
        java.lang.String str = eVar.field_userName;
        kotlin.jvm.internal.o.f(str, "getUserName(...)");
        java.lang.String str2 = eVar.field_nickName;
        kotlin.jvm.internal.o.f(str2, "getNickName(...)");
        java.lang.String str3 = eVar.field_avatarURL;
        kotlin.jvm.internal.o.f(str3, "getAvatarUrl(...)");
        qVar.resumeWith(kotlin.Result.m521constructorimpl(new w33.e(str, str2, str3)));
    }
}
