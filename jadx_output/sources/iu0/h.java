package iu0;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294819d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iu0.h(this.f294819d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((iu0.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return iu0.k.a(iu0.k.f294830a, "http://dldir1v6.qq.com/weixin/checkresupdate/TemplateScript_10df1f6f5e9040289295af14c8b93d5a.lua", this.f294819d + "/TemplateScript.lua");
    }
}
