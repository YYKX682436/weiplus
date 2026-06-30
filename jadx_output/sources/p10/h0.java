package p10;

/* loaded from: classes7.dex */
public final class h0 implements xq0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI f350955d;

    public h0(com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI magicEcsNirvanaUI) {
        this.f350955d = magicEcsNirvanaUI;
    }

    @Override // qp0.c
    public android.widget.FrameLayout F4() {
        int i17 = com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI.f65834v;
        return (android.widget.FrameLayout) ((jz5.n) this.f350955d.f65841m).getValue();
    }

    @Override // qp0.c
    public void ca(java.lang.String event, java.util.HashMap hashMap, yz5.q callback) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(callback, "callback");
        callback.invoke(1, "event not handle", null);
    }
}
