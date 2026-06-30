package we5;

/* loaded from: classes9.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f445345d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int[] iArr) {
        super(1);
        this.f445345d = iArr;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.f203389l.add(this.f445345d);
        return jz5.f0.f302826a;
    }
}
