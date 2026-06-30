package pf5;

/* loaded from: classes11.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.component.UIComponentActivity f353922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.ui.component.UIComponentActivity uIComponentActivity) {
        super(1);
        this.f353922d = uIComponentActivity;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        androidx.lifecycle.c1 vm6 = (androidx.lifecycle.c1) obj;
        kotlin.jvm.internal.o.g(vm6, "vm");
        return java.lang.Boolean.valueOf(!this.f353922d.isChangingConfigurations() || (vm6 instanceof com.tencent.mm.ui.component.UIComponent));
    }
}
