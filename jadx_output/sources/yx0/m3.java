package yx0;

/* loaded from: classes.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f467452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f467453f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(java.lang.String str, long j17, kotlinx.coroutines.q qVar) {
        super(1);
        this.f467451d = str;
        this.f467452e = j17;
        this.f467453f = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.instamovie.base.MJError mJError = (com.tencent.maas.instamovie.base.MJError) obj;
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingCorePlugin", "switchTemplate >> but loadTemplate is error " + this.f467451d + ' ' + this.f467452e);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f467453f).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(mJError == null)));
        return jz5.f0.f302826a;
    }
}
