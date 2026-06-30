package lm;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm.r f319299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(lm.r rVar) {
        super(0);
        this.f319299d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.coroutines.LifecycleScope("WeTaskEventScope", this.f319299d, 0, 4, null);
    }
}
