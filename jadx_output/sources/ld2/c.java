package ld2;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f318083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f318084e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.a aVar, yz5.p pVar) {
        super(3);
        this.f318083d = aVar;
        this.f318084e = pVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.app.Activity activity = (android.app.Activity) obj;
        com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction action = (com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction) obj2;
        r45.h32 h32Var = (r45.h32) obj3;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(action, "action");
        activity.finish();
        if (action == com.tencent.pigeon.live_multiplatform.LiveSelectNoticeAction.CREATE) {
            this.f318083d.invoke();
        } else {
            this.f318084e.invoke(action, h32Var);
        }
        return jz5.f0.f302826a;
    }
}
