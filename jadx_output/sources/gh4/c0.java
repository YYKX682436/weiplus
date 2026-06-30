package gh4;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f271915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.os.Bundle bundle, java.lang.String str) {
        super(0);
        this.f271915d = bundle;
        this.f271916e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.os.Bundle bundle = this.f271915d;
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f271916e);
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, gh4.a.class, gh4.b0.f271914d);
        return jz5.f0.f302826a;
    }
}
