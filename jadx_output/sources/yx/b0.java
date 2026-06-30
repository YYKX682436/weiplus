package yx;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx.y f467005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f467006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(xx.y yVar, android.content.Context context) {
        super(1);
        this.f467005d = yVar;
        this.f467006e = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.setOnClickListener(new yx.a0(this.f467006e));
        xx.y yVar = this.f467005d;
        if (yVar != null) {
            yVar.j(it);
        }
        return jz5.f0.f302826a;
    }
}
