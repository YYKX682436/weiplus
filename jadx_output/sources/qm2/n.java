package qm2;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f364738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm2.u f364739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity appCompatActivity, qm2.u uVar) {
        super(0);
        this.f364738d = appCompatActivity;
        this.f364739e = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.wq wqVar = new com.tencent.mm.plugin.finder.live.widget.wq(this.f364738d);
        wqVar.D = new qm2.m(this.f364739e);
        return wqVar;
    }
}
