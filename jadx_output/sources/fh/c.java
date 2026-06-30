package fh;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.a f262507d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.magicbrush.a aVar) {
        super(0);
        this.f262507d = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.magicbrush.a aVar = this.f262507d;
        return java.lang.Boolean.valueOf(aVar.c() > 0 && aVar.b() > 0);
    }
}
