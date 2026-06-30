package jf5;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f299443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f299444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yb5.d dVar, yz5.a aVar) {
        super(1);
        this.f299443d = dVar;
        this.f299444e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout host = (com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable.NativeSelectableLayout) obj;
        kotlin.jvm.internal.o.g(host, "host");
        yb5.d dVar = this.f299443d;
        dVar.V(true);
        this.f299444e.invoke();
        dVar.V(false);
        return jz5.f0.f302826a;
    }
}
