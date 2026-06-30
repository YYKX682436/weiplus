package yh5;

/* loaded from: classes12.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yh5.p f462439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yh5.p pVar) {
        super(1);
        this.f462439d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pf3.b visibility = (pf3.b) obj;
        kotlin.jvm.internal.o.g(visibility, "$this$visibility");
        fq.a aVar = this.f462439d.f462441v;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.TextView jumpChatBtn = aVar.f265389b;
        kotlin.jvm.internal.o.f(jumpChatBtn, "jumpChatBtn");
        visibility.c(jumpChatBtn);
        return jz5.f0.f302826a;
    }
}
