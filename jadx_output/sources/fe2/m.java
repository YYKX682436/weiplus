package fe2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe2.q f261521d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fe2.q qVar) {
        super(1);
        this.f261521d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        com.tencent.mm.plugin.finder.live.plugin.et etVar = (com.tencent.mm.plugin.finder.live.plugin.et) this.f261521d.X0(com.tencent.mm.plugin.finder.live.plugin.et.class);
        if (etVar != null) {
            etVar.f112455u.dispatchTouchEvent(motionEvent);
        }
        return jz5.f0.f302826a;
    }
}
