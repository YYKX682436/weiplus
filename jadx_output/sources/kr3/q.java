package kr3;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.t f311429d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kr3.t tVar) {
        super(0);
        this.f311429d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.contact.o U6 = this.f311429d.U6();
        return java.lang.Boolean.valueOf(!(U6 != null && ((yq3.v) U6).k()));
    }
}
