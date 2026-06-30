package xc5;

/* loaded from: classes12.dex */
public final class x2 implements xf0.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f453591d;

    public x2(yz5.l lVar) {
        this.f453591d = lVar;
    }

    @Override // xf0.e
    public void L0(xf0.g event) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f454167b == xf0.h.f454170e && (lVar = this.f453591d) != null) {
            lVar.invoke(java.lang.Float.valueOf(event.f454168c));
        }
    }
}
