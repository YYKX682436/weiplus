package ls5;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls5.f f321129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f321130e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ls5.f fVar, java.lang.Throwable th6, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321129d = fVar;
        this.f321130e = th6;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ls5.e(this.f321129d, this.f321130e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ls5.e eVar = (ls5.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String stackTraceString = android.util.Log.getStackTraceString(this.f321130e);
        kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
        ls5.f fVar = this.f321129d;
        fVar.getClass();
        fVar.f321132b = stackTraceString;
        java.lang.String str2 = fVar.f321132b;
        fVar.getClass();
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("iso-8859-1");
            kotlin.jvm.internal.o.f(forName, "forName(...)");
            byte[] bytes = str2.getBytes(forName);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            messageDigest.update(bytes, 0, str2.length());
            byte[] digest = messageDigest.digest();
            kotlin.jvm.internal.o.f(digest, "digest(...)");
            str = fVar.a(digest);
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        fVar.getClass();
        fVar.f321134d = str;
        return jz5.f0.f302826a;
    }
}
