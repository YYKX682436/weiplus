package gq5;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq5.e f274617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gq5.e eVar) {
        super(0);
        this.f274617d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        eq5.h hVar;
        j75.f Q6 = this.f274617d.Q6();
        return java.lang.Boolean.valueOf((Q6 == null || (hVar = (eq5.h) Q6.getState()) == null) ? false : hVar.f255914e);
    }
}
